package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemZonificPotencialBosqueProduccionPermanenteDto;
import wcmc.hef.business.core.capa.service.TemZonificPotencialBosqueProduccionPermanenteService;
import wcmc.hef.dao.capa.domain.TemZonificPotencialBosqueProduccionPermanente;
import wcmc.hef.dao.capa.domain.TemZonificPotencialBosqueProduccionPermanenteParamDef;
import wcmc.hef.dao.capa.domain.TemZonificPotencialBosqueProduccionPermanenteParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemZonificPotencialBosqueProduccionPermanenteMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemZonificPotencialBosqueProduccionPermanenteServiceImpl implements TemZonificPotencialBosqueProduccionPermanenteService {
	@Autowired
	private TemZonificPotencialBosqueProduccionPermanenteMapper temZonificPotencialBosqueProduccionPermanenteMapper;
	public List<TemZonificPotencialBosqueProduccionPermanente> buscar(TemZonificPotencialBosqueProduccionPermanenteDto temZonificPotencialBosqueProduccionPermanenteDto) throws Exception {
		TemZonificPotencialBosqueProduccionPermanenteParamDef temZonificPotencialBosqueProduccionPermanenteParamDef		= new TemZonificPotencialBosqueProduccionPermanenteParamDef();
		
		Criteria criteria		= temZonificPotencialBosqueProduccionPermanenteParamDef.createCriteria();
		if(temZonificPotencialBosqueProduccionPermanenteDto != null) {
			if(CadenaUtil.getStrNull(temZonificPotencialBosqueProduccionPermanenteDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temZonificPotencialBosqueProduccionPermanenteDto.getStrTheGeom());
			}
			if(CadenaUtil.getLongNull(temZonificPotencialBosqueProduccionPermanenteDto.getLngId()) != null) {
				criteria.andLngIdEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getLngId());
			}
			if(CadenaUtil.getStrNull(temZonificPotencialBosqueProduccionPermanenteDto.getStrZona()) != null) {
				criteria.andStrZonaEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getStrZona());
			}
			if(CadenaUtil.getStrNull(temZonificPotencialBosqueProduccionPermanenteDto.getStrTipo()) != null) {
				criteria.andStrTipoEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getStrTipo());
			}
			if(CadenaUtil.getStrNull(temZonificPotencialBosqueProduccionPermanenteDto.getStrDenomin()) != null) {
				criteria.andStrDenominEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getStrDenomin());
			}
			if(CadenaUtil.getDoubNull(temZonificPotencialBosqueProduccionPermanenteDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getDblAreaSig());
			}
			if(CadenaUtil.getDoubNull(temZonificPotencialBosqueProduccionPermanenteDto.getDblAreaAprob()) != null) {
				criteria.andDblAreaAprobEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getDblAreaAprob());
			}
			if(CadenaUtil.getStrNull(temZonificPotencialBosqueProduccionPermanenteDto.getStrRegion()) != null) {
				criteria.andStrRegionEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getStrRegion());
			}
			if(CadenaUtil.getStrNull(temZonificPotencialBosqueProduccionPermanenteDto.getStrFuente()) != null) {
				criteria.andStrFuenteEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getStrFuente());
			}
			if(CadenaUtil.getStrNull(temZonificPotencialBosqueProduccionPermanenteDto.getStrDocLegal()) != null) {
				criteria.andStrDocLegalEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getStrDocLegal());
			}
			if(CadenaUtil.getInteNull(temZonificPotencialBosqueProduccionPermanenteDto.getIntTheid()) != null) {
				criteria.andIntTheidEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getIntTheid());
			}
			if(CadenaUtil.getDoubNull(temZonificPotencialBosqueProduccionPermanenteDto.getDblPerimeter()) != null) {
				criteria.andDblPerimeterEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getDblPerimeter());
			}
			if(CadenaUtil.getDoubNull(temZonificPotencialBosqueProduccionPermanenteDto.getDblHectares()) != null) {
				criteria.andDblHectaresEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getDblHectares());
			}
			temZonificPotencialBosqueProduccionPermanenteParamDef.setStrHashConsulta(temZonificPotencialBosqueProduccionPermanenteDto.getStrHashConsulta());
		}
		
		temZonificPotencialBosqueProduccionPermanenteParamDef.setOrderByClause("de_tipo,de_doc_legal");
		List<TemZonificPotencialBosqueProduccionPermanente>	 list	= temZonificPotencialBosqueProduccionPermanenteMapper.selectByDefaultParameter(temZonificPotencialBosqueProduccionPermanenteParamDef);
		return list;
	}
	
	public List<TemZonificPotencialBosqueProduccionPermanente> buscarGeometry(TemZonificPotencialBosqueProduccionPermanenteDto temZonificPotencialBosqueProduccionPermanenteDto) throws Exception {
		TemZonificPotencialBosqueProduccionPermanenteParamDef temZonificPotencialBosqueProduccionPermanenteParamDef		= new TemZonificPotencialBosqueProduccionPermanenteParamDef();
		
		Criteria criteria		= temZonificPotencialBosqueProduccionPermanenteParamDef.createCriteria();
		if(temZonificPotencialBosqueProduccionPermanenteDto != null) {
			if(CadenaUtil.getStrNull(temZonificPotencialBosqueProduccionPermanenteDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temZonificPotencialBosqueProduccionPermanenteDto.getStrTheGeom());
			}
			if(CadenaUtil.getLongNull(temZonificPotencialBosqueProduccionPermanenteDto.getLngId()) != null) {
				criteria.andLngIdEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getLngId());
			}
			if(CadenaUtil.getStrNull(temZonificPotencialBosqueProduccionPermanenteDto.getStrZona()) != null) {
				criteria.andStrZonaEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getStrZona());
			}
			if(CadenaUtil.getStrNull(temZonificPotencialBosqueProduccionPermanenteDto.getStrTipo()) != null) {
				criteria.andStrTipoEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getStrTipo());
			}
			if(CadenaUtil.getStrNull(temZonificPotencialBosqueProduccionPermanenteDto.getStrDenomin()) != null) {
				criteria.andStrDenominEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getStrDenomin());
			}
			if(CadenaUtil.getDoubNull(temZonificPotencialBosqueProduccionPermanenteDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getDblAreaSig());
			}
			if(CadenaUtil.getDoubNull(temZonificPotencialBosqueProduccionPermanenteDto.getDblAreaAprob()) != null) {
				criteria.andDblAreaAprobEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getDblAreaAprob());
			}
			if(CadenaUtil.getStrNull(temZonificPotencialBosqueProduccionPermanenteDto.getStrRegion()) != null) {
				criteria.andStrRegionEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getStrRegion());
			}
			if(CadenaUtil.getStrNull(temZonificPotencialBosqueProduccionPermanenteDto.getStrFuente()) != null) {
				criteria.andStrFuenteEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getStrFuente());
			}
			if(CadenaUtil.getStrNull(temZonificPotencialBosqueProduccionPermanenteDto.getStrDocLegal()) != null) {
				criteria.andStrDocLegalEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getStrDocLegal());
			}
			if(CadenaUtil.getInteNull(temZonificPotencialBosqueProduccionPermanenteDto.getIntTheid()) != null) {
				criteria.andIntTheidEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getIntTheid());
			}
			if(CadenaUtil.getDoubNull(temZonificPotencialBosqueProduccionPermanenteDto.getDblPerimeter()) != null) {
				criteria.andDblPerimeterEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getDblPerimeter());
			}
			if(CadenaUtil.getDoubNull(temZonificPotencialBosqueProduccionPermanenteDto.getDblHectares()) != null) {
				criteria.andDblHectaresEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getDblHectares());
			}
		}
		
		temZonificPotencialBosqueProduccionPermanenteParamDef.setOrderByClause("de_tipo,de_doc_legal");
		List<TemZonificPotencialBosqueProduccionPermanente>	 list	= temZonificPotencialBosqueProduccionPermanenteMapper.selectByDefaultParameterGeometry(temZonificPotencialBosqueProduccionPermanenteParamDef);
		return list;
	}
	
	public List<TemZonificPotencialBosqueProduccionPermanente> buscarCombo(TemZonificPotencialBosqueProduccionPermanenteDto temZonificPotencialBosqueProduccionPermanenteDto) throws Exception {
		TemZonificPotencialBosqueProduccionPermanenteParamDef temZonificPotencialBosqueProduccionPermanenteParamDef		= new TemZonificPotencialBosqueProduccionPermanenteParamDef();
		
		Criteria criteria		= temZonificPotencialBosqueProduccionPermanenteParamDef.createCriteria();
		if(temZonificPotencialBosqueProduccionPermanenteDto != null) {
			if(CadenaUtil.getStrNull(temZonificPotencialBosqueProduccionPermanenteDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temZonificPotencialBosqueProduccionPermanenteDto.getStrTheGeom());
			}
			if(CadenaUtil.getLongNull(temZonificPotencialBosqueProduccionPermanenteDto.getLngId()) != null) {
				criteria.andLngIdEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getLngId());
			}
			if(CadenaUtil.getStrNull(temZonificPotencialBosqueProduccionPermanenteDto.getStrZona()) != null) {
				criteria.andStrZonaEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getStrZona());
			}
			if(CadenaUtil.getStrNull(temZonificPotencialBosqueProduccionPermanenteDto.getStrTipo()) != null) {
				criteria.andStrTipoEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getStrTipo());
			}
			if(CadenaUtil.getStrNull(temZonificPotencialBosqueProduccionPermanenteDto.getStrDenomin()) != null) {
				criteria.andStrDenominEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getStrDenomin());
			}
			if(CadenaUtil.getDoubNull(temZonificPotencialBosqueProduccionPermanenteDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getDblAreaSig());
			}
			if(CadenaUtil.getDoubNull(temZonificPotencialBosqueProduccionPermanenteDto.getDblAreaAprob()) != null) {
				criteria.andDblAreaAprobEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getDblAreaAprob());
			}
			if(CadenaUtil.getStrNull(temZonificPotencialBosqueProduccionPermanenteDto.getStrRegion()) != null) {
				criteria.andStrRegionEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getStrRegion());
			}
			if(CadenaUtil.getStrNull(temZonificPotencialBosqueProduccionPermanenteDto.getStrFuente()) != null) {
				criteria.andStrFuenteEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getStrFuente());
			}
			if(CadenaUtil.getStrNull(temZonificPotencialBosqueProduccionPermanenteDto.getStrDocLegal()) != null) {
				criteria.andStrDocLegalEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getStrDocLegal());
			}
			if(CadenaUtil.getInteNull(temZonificPotencialBosqueProduccionPermanenteDto.getIntTheid()) != null) {
				criteria.andIntTheidEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getIntTheid());
			}
			if(CadenaUtil.getDoubNull(temZonificPotencialBosqueProduccionPermanenteDto.getDblPerimeter()) != null) {
				criteria.andDblPerimeterEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getDblPerimeter());
			}
			if(CadenaUtil.getDoubNull(temZonificPotencialBosqueProduccionPermanenteDto.getDblHectares()) != null) {
				criteria.andDblHectaresEqualTo(temZonificPotencialBosqueProduccionPermanenteDto.getDblHectares());
			}
		}
		
		temZonificPotencialBosqueProduccionPermanenteParamDef.setOrderByClause("de_tipo,de_doc_legal");
		List<TemZonificPotencialBosqueProduccionPermanente>	 list	= temZonificPotencialBosqueProduccionPermanenteMapper.selectByDefaultParameterCombo(temZonificPotencialBosqueProduccionPermanenteParamDef);
		return list;
	}
	
	public TemZonificPotencialBosqueProduccionPermanente buscarById(TemZonificPotencialBosqueProduccionPermanenteDto temZonificPotencialBosqueProduccionPermanenteDto) throws Exception {
		TemZonificPotencialBosqueProduccionPermanente temZonificPotencialBosqueProduccionPermanente		= new TemZonificPotencialBosqueProduccionPermanente();
		BeanUtils.copyProperties(temZonificPotencialBosqueProduccionPermanenteDto, temZonificPotencialBosqueProduccionPermanente);
		return temZonificPotencialBosqueProduccionPermanenteMapper.selectByPrimaryKey(temZonificPotencialBosqueProduccionPermanente);
	}
	
	public TemZonificPotencialBosqueProduccionPermanente buscarGeometryById(TemZonificPotencialBosqueProduccionPermanenteDto temZonificPotencialBosqueProduccionPermanenteDto) throws Exception {
		TemZonificPotencialBosqueProduccionPermanente temZonificPotencialBosqueProduccionPermanente		= new TemZonificPotencialBosqueProduccionPermanente();
		BeanUtils.copyProperties(temZonificPotencialBosqueProduccionPermanenteDto, temZonificPotencialBosqueProduccionPermanente);
		return temZonificPotencialBosqueProduccionPermanenteMapper.selectByPrimaryKeyGeometry(temZonificPotencialBosqueProduccionPermanente);
	}
	
	@Transactional
	public Integer guardar(TemZonificPotencialBosqueProduccionPermanenteDto temZonificPotencialBosqueProduccionPermanenteDto) throws Exception {
		TemZonificPotencialBosqueProduccionPermanente temZonificPotencialBosqueProduccionPermanente		= new TemZonificPotencialBosqueProduccionPermanente();
		BeanUtils.copyProperties(temZonificPotencialBosqueProduccionPermanenteDto, temZonificPotencialBosqueProduccionPermanente);
		int rs	= 0;
		TemZonificPotencialBosqueProduccionPermanente exiteTemZonificPotencialBosqueProduccionPermanente		= temZonificPotencialBosqueProduccionPermanenteMapper.selectByPrimaryKey(temZonificPotencialBosqueProduccionPermanente);
		if(exiteTemZonificPotencialBosqueProduccionPermanente != null) {
			rs	= temZonificPotencialBosqueProduccionPermanenteMapper.updateByPrimaryKeySelective(temZonificPotencialBosqueProduccionPermanente);
		} else {
			rs	= temZonificPotencialBosqueProduccionPermanenteMapper.insertSelective(temZonificPotencialBosqueProduccionPermanente);
			
			Integer srlGid	= temZonificPotencialBosqueProduccionPermanenteMapper.lastSequence();
			temZonificPotencialBosqueProduccionPermanenteDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemZonificPotencialBosqueProduccionPermanenteDto temZonificPotencialBosqueProduccionPermanenteDto) throws Exception {
		TemZonificPotencialBosqueProduccionPermanente temZonificPotencialBosqueProduccionPermanente		= new TemZonificPotencialBosqueProduccionPermanente();
		BeanUtils.copyProperties(temZonificPotencialBosqueProduccionPermanenteDto, temZonificPotencialBosqueProduccionPermanente);
		Integer rs	= temZonificPotencialBosqueProduccionPermanenteMapper.deleteByPrimaryKey(temZonificPotencialBosqueProduccionPermanente);
		return rs;
	}
	
}
