package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemConcesionesEcoturismoDto;
import wcmc.hef.business.core.capa.service.TemConcesionesEcoturismoService;
import wcmc.hef.dao.capa.domain.TemConcesionesEcoturismo;
import wcmc.hef.dao.capa.domain.TemConcesionesEcoturismoParamDef;
import wcmc.hef.dao.capa.domain.TemConcesionesEcoturismoParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemConcesionesEcoturismoMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemConcesionesEcoturismoServiceImpl implements TemConcesionesEcoturismoService {
	@Autowired
	private TemConcesionesEcoturismoMapper temConcesionesEcoturismoMapper;
	public List<TemConcesionesEcoturismo> buscar(TemConcesionesEcoturismoDto temConcesionesEcoturismoDto) throws Exception {
		TemConcesionesEcoturismoParamDef temConcesionesEcoturismoParamDef		= new TemConcesionesEcoturismoParamDef();
		
		Criteria criteria		= temConcesionesEcoturismoParamDef.createCriteria();
		if(temConcesionesEcoturismoDto != null) {
			if(CadenaUtil.getStrNull(temConcesionesEcoturismoDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temConcesionesEcoturismoDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(temConcesionesEcoturismoDto.getIntId()) != null) {
				criteria.andIntIdEqualTo(temConcesionesEcoturismoDto.getIntId());
			}
			if(CadenaUtil.getStrNull(temConcesionesEcoturismoDto.getStrAnio()) != null) {
				criteria.andStrAnioEqualTo(temConcesionesEcoturismoDto.getStrAnio());
			}
			if(CadenaUtil.getStrNull(temConcesionesEcoturismoDto.getStrModalidad()) != null) {
				criteria.andStrModalidadEqualTo(temConcesionesEcoturismoDto.getStrModalidad());
			}
			if(CadenaUtil.getStrNull(temConcesionesEcoturismoDto.getStrTitular()) != null) {
				criteria.andStrTitularEqualTo(temConcesionesEcoturismoDto.getStrTitular());
			}
			if(CadenaUtil.getStrNull(temConcesionesEcoturismoDto.getStrContrato()) != null) {
				criteria.andStrContratoEqualTo(temConcesionesEcoturismoDto.getStrContrato());
			}
			if(CadenaUtil.getDoubNull(temConcesionesEcoturismoDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(temConcesionesEcoturismoDto.getDblAreaSig());
			}
			if(CadenaUtil.getDoubNull(temConcesionesEcoturismoDto.getDblAreaAprob()) != null) {
				criteria.andDblAreaAprobEqualTo(temConcesionesEcoturismoDto.getDblAreaAprob());
			}
			if(CadenaUtil.getStrNull(temConcesionesEcoturismoDto.getStrRegion()) != null) {
				criteria.andStrRegionEqualTo(temConcesionesEcoturismoDto.getStrRegion());
			}
			if(CadenaUtil.getStrNull(temConcesionesEcoturismoDto.getStrDocum()) != null) {
				criteria.andStrDocumEqualTo(temConcesionesEcoturismoDto.getStrDocum());
			}
			if(CadenaUtil.getStrNull(temConcesionesEcoturismoDto.getStrSituacion()) != null) {
				criteria.andStrSituacionEqualTo(temConcesionesEcoturismoDto.getStrSituacion());
			}
			if(CadenaUtil.getDoubNull(temConcesionesEcoturismoDto.getDblPerimeter()) != null) {
				criteria.andDblPerimeterEqualTo(temConcesionesEcoturismoDto.getDblPerimeter());
			}
			if(CadenaUtil.getDoubNull(temConcesionesEcoturismoDto.getDblHectares()) != null) {
				criteria.andDblHectaresEqualTo(temConcesionesEcoturismoDto.getDblHectares());
			}
		}
		
		temConcesionesEcoturismoParamDef.setOrderByClause("de_titular,de_contrato");
		List<TemConcesionesEcoturismo>	 list	= temConcesionesEcoturismoMapper.selectByDefaultParameter(temConcesionesEcoturismoParamDef);
		return list;
	}
	
	public List<TemConcesionesEcoturismo> buscarGeometry(TemConcesionesEcoturismoDto temConcesionesEcoturismoDto) throws Exception {
		TemConcesionesEcoturismoParamDef temConcesionesEcoturismoParamDef		= new TemConcesionesEcoturismoParamDef();
		
		Criteria criteria		= temConcesionesEcoturismoParamDef.createCriteria();
		if(temConcesionesEcoturismoDto != null) {
			if(CadenaUtil.getStrNull(temConcesionesEcoturismoDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temConcesionesEcoturismoDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(temConcesionesEcoturismoDto.getIntId()) != null) {
				criteria.andIntIdEqualTo(temConcesionesEcoturismoDto.getIntId());
			}
			if(CadenaUtil.getStrNull(temConcesionesEcoturismoDto.getStrAnio()) != null) {
				criteria.andStrAnioEqualTo(temConcesionesEcoturismoDto.getStrAnio());
			}
			if(CadenaUtil.getStrNull(temConcesionesEcoturismoDto.getStrModalidad()) != null) {
				criteria.andStrModalidadEqualTo(temConcesionesEcoturismoDto.getStrModalidad());
			}
			if(CadenaUtil.getStrNull(temConcesionesEcoturismoDto.getStrTitular()) != null) {
				criteria.andStrTitularEqualTo(temConcesionesEcoturismoDto.getStrTitular());
			}
			if(CadenaUtil.getStrNull(temConcesionesEcoturismoDto.getStrContrato()) != null) {
				criteria.andStrContratoEqualTo(temConcesionesEcoturismoDto.getStrContrato());
			}
			if(CadenaUtil.getDoubNull(temConcesionesEcoturismoDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(temConcesionesEcoturismoDto.getDblAreaSig());
			}
			if(CadenaUtil.getDoubNull(temConcesionesEcoturismoDto.getDblAreaAprob()) != null) {
				criteria.andDblAreaAprobEqualTo(temConcesionesEcoturismoDto.getDblAreaAprob());
			}
			if(CadenaUtil.getStrNull(temConcesionesEcoturismoDto.getStrRegion()) != null) {
				criteria.andStrRegionEqualTo(temConcesionesEcoturismoDto.getStrRegion());
			}
			if(CadenaUtil.getStrNull(temConcesionesEcoturismoDto.getStrDocum()) != null) {
				criteria.andStrDocumEqualTo(temConcesionesEcoturismoDto.getStrDocum());
			}
			if(CadenaUtil.getStrNull(temConcesionesEcoturismoDto.getStrSituacion()) != null) {
				criteria.andStrSituacionEqualTo(temConcesionesEcoturismoDto.getStrSituacion());
			}
			if(CadenaUtil.getDoubNull(temConcesionesEcoturismoDto.getDblPerimeter()) != null) {
				criteria.andDblPerimeterEqualTo(temConcesionesEcoturismoDto.getDblPerimeter());
			}
			if(CadenaUtil.getDoubNull(temConcesionesEcoturismoDto.getDblHectares()) != null) {
				criteria.andDblHectaresEqualTo(temConcesionesEcoturismoDto.getDblHectares());
			}
		}
		
		temConcesionesEcoturismoParamDef.setOrderByClause("de_titular,de_contrato");
		List<TemConcesionesEcoturismo>	 list	= temConcesionesEcoturismoMapper.selectByDefaultParameterGeometry(temConcesionesEcoturismoParamDef);
		return list;
	}
	
	public List<TemConcesionesEcoturismo> buscarCombo(TemConcesionesEcoturismoDto temConcesionesEcoturismoDto) throws Exception {
		TemConcesionesEcoturismoParamDef temConcesionesEcoturismoParamDef		= new TemConcesionesEcoturismoParamDef();
		
		Criteria criteria		= temConcesionesEcoturismoParamDef.createCriteria();
		if(temConcesionesEcoturismoDto != null) {
			if(CadenaUtil.getStrNull(temConcesionesEcoturismoDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temConcesionesEcoturismoDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(temConcesionesEcoturismoDto.getIntId()) != null) {
				criteria.andIntIdEqualTo(temConcesionesEcoturismoDto.getIntId());
			}
			if(CadenaUtil.getStrNull(temConcesionesEcoturismoDto.getStrAnio()) != null) {
				criteria.andStrAnioEqualTo(temConcesionesEcoturismoDto.getStrAnio());
			}
			if(CadenaUtil.getStrNull(temConcesionesEcoturismoDto.getStrModalidad()) != null) {
				criteria.andStrModalidadEqualTo(temConcesionesEcoturismoDto.getStrModalidad());
			}
			if(CadenaUtil.getStrNull(temConcesionesEcoturismoDto.getStrTitular()) != null) {
				criteria.andStrTitularEqualTo(temConcesionesEcoturismoDto.getStrTitular());
			}
			if(CadenaUtil.getStrNull(temConcesionesEcoturismoDto.getStrContrato()) != null) {
				criteria.andStrContratoEqualTo(temConcesionesEcoturismoDto.getStrContrato());
			}
			if(CadenaUtil.getDoubNull(temConcesionesEcoturismoDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(temConcesionesEcoturismoDto.getDblAreaSig());
			}
			if(CadenaUtil.getDoubNull(temConcesionesEcoturismoDto.getDblAreaAprob()) != null) {
				criteria.andDblAreaAprobEqualTo(temConcesionesEcoturismoDto.getDblAreaAprob());
			}
			if(CadenaUtil.getStrNull(temConcesionesEcoturismoDto.getStrRegion()) != null) {
				criteria.andStrRegionEqualTo(temConcesionesEcoturismoDto.getStrRegion());
			}
			if(CadenaUtil.getStrNull(temConcesionesEcoturismoDto.getStrDocum()) != null) {
				criteria.andStrDocumEqualTo(temConcesionesEcoturismoDto.getStrDocum());
			}
			if(CadenaUtil.getStrNull(temConcesionesEcoturismoDto.getStrSituacion()) != null) {
				criteria.andStrSituacionEqualTo(temConcesionesEcoturismoDto.getStrSituacion());
			}
			if(CadenaUtil.getDoubNull(temConcesionesEcoturismoDto.getDblPerimeter()) != null) {
				criteria.andDblPerimeterEqualTo(temConcesionesEcoturismoDto.getDblPerimeter());
			}
			if(CadenaUtil.getDoubNull(temConcesionesEcoturismoDto.getDblHectares()) != null) {
				criteria.andDblHectaresEqualTo(temConcesionesEcoturismoDto.getDblHectares());
			}
		}
		
		temConcesionesEcoturismoParamDef.setOrderByClause("de_titular,de_contrato");
		List<TemConcesionesEcoturismo>	 list	= temConcesionesEcoturismoMapper.selectByDefaultParameterCombo(temConcesionesEcoturismoParamDef);
		return list;
	}
	
	public TemConcesionesEcoturismo buscarById(TemConcesionesEcoturismoDto temConcesionesEcoturismoDto) throws Exception {
		TemConcesionesEcoturismo temConcesionesEcoturismo		= new TemConcesionesEcoturismo();
		BeanUtils.copyProperties(temConcesionesEcoturismoDto, temConcesionesEcoturismo);
		return temConcesionesEcoturismoMapper.selectByPrimaryKey(temConcesionesEcoturismo);
	}
	
	public TemConcesionesEcoturismo buscarGeometryById(TemConcesionesEcoturismoDto temConcesionesEcoturismoDto) throws Exception {
		TemConcesionesEcoturismo temConcesionesEcoturismo		= new TemConcesionesEcoturismo();
		BeanUtils.copyProperties(temConcesionesEcoturismoDto, temConcesionesEcoturismo);
		return temConcesionesEcoturismoMapper.selectByPrimaryKeyGeometry(temConcesionesEcoturismo);
	}
	
	@Transactional
	public Integer guardar(TemConcesionesEcoturismoDto temConcesionesEcoturismoDto) throws Exception {
		TemConcesionesEcoturismo temConcesionesEcoturismo		= new TemConcesionesEcoturismo();
		BeanUtils.copyProperties(temConcesionesEcoturismoDto, temConcesionesEcoturismo);
		int rs	= 0;
		TemConcesionesEcoturismo exiteTemConcesionesEcoturismo		= temConcesionesEcoturismoMapper.selectByPrimaryKey(temConcesionesEcoturismo);
		if(exiteTemConcesionesEcoturismo != null) {
			rs	= temConcesionesEcoturismoMapper.updateByPrimaryKeySelective(temConcesionesEcoturismo);
		} else {
			rs	= temConcesionesEcoturismoMapper.insertSelective(temConcesionesEcoturismo);
			
			Integer srlGid	= temConcesionesEcoturismoMapper.lastSequence();
			temConcesionesEcoturismoDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemConcesionesEcoturismoDto temConcesionesEcoturismoDto) throws Exception {
		TemConcesionesEcoturismo temConcesionesEcoturismo		= new TemConcesionesEcoturismo();
		BeanUtils.copyProperties(temConcesionesEcoturismoDto, temConcesionesEcoturismo);
		Integer rs	= temConcesionesEcoturismoMapper.deleteByPrimaryKey(temConcesionesEcoturismo);
		return rs;
	}
	
}
