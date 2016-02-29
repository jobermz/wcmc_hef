package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.EcoturDto;
import wcmc.hef.business.core.capa.service.EcoturService;
import wcmc.hef.dao.capa.domain.Ecotur;
import wcmc.hef.dao.capa.domain.EcoturParamDef;
import wcmc.hef.dao.capa.domain.EcoturParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.EcoturMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class EcoturServiceImpl implements EcoturService {
	@Autowired
	private EcoturMapper ecoturMapper;
	public List<Ecotur> buscar(EcoturDto ecoturDto) throws Exception {
		EcoturParamDef ecoturParamDef		= new EcoturParamDef();
		
		Criteria criteria		= ecoturParamDef.createCriteria();
		if(ecoturDto != null) {
			if(CadenaUtil.getStrNull(ecoturDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(ecoturDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(ecoturDto.getIntId()) != null) {
				criteria.andIntIdEqualTo(ecoturDto.getIntId());
			}
			if(CadenaUtil.getStrNull(ecoturDto.getStrAnio()) != null) {
				criteria.andStrAnioLike(ecoturDto.getStrAnio());
			}
			if(CadenaUtil.getStrNull(ecoturDto.getStrModalidad()) != null) {
				criteria.andStrModalidadLike(ecoturDto.getStrModalidad());
			}
			if(CadenaUtil.getStrNull(ecoturDto.getStrTitular()) != null) {
				criteria.andStrTitularLike(ecoturDto.getStrTitular());
			}
			if(CadenaUtil.getStrNull(ecoturDto.getStrContrato()) != null) {
				criteria.andStrContratoLike(ecoturDto.getStrContrato());
			}
			if(CadenaUtil.getDoubNull(ecoturDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(ecoturDto.getDblAreaSig());
			}
			if(CadenaUtil.getDoubNull(ecoturDto.getDblAreaAprob()) != null) {
				criteria.andDblAreaAprobEqualTo(ecoturDto.getDblAreaAprob());
			}
			if(CadenaUtil.getStrNull(ecoturDto.getStrRegion()) != null) {
				criteria.andStrRegionLike(ecoturDto.getStrRegion());
			}
			if(CadenaUtil.getStrNull(ecoturDto.getStrDocum()) != null) {
				criteria.andStrDocumLike(ecoturDto.getStrDocum());
			}
			if(CadenaUtil.getStrNull(ecoturDto.getStrSituacion()) != null) {
				criteria.andStrSituacionLike(ecoturDto.getStrSituacion());
			}
			if(CadenaUtil.getDoubNull(ecoturDto.getDblPerimeter()) != null) {
				criteria.andDblPerimeterEqualTo(ecoturDto.getDblPerimeter());
			}
			if(CadenaUtil.getDoubNull(ecoturDto.getDblHectares()) != null) {
				criteria.andDblHectaresEqualTo(ecoturDto.getDblHectares());
			}
		}
		
		List<Ecotur>	 list	= ecoturMapper.selectByDefaultParameter(ecoturParamDef);
		return list;
	}
	
	public Ecotur buscarById(EcoturDto ecoturDto) throws Exception {
		Ecotur ecotur		= new Ecotur();
		BeanUtils.copyProperties(ecoturDto, ecotur);
		return ecoturMapper.selectByPrimaryKey(ecotur);
	}
	
	@Transactional
	public Integer guardar(EcoturDto ecoturDto) throws Exception {
		Ecotur ecotur		= new Ecotur();
		BeanUtils.copyProperties(ecoturDto, ecotur);
		int rs	= 0;
		Ecotur exiteEcotur		= ecoturMapper.selectByPrimaryKey(ecotur);
		if(exiteEcotur != null) {
			rs	= ecoturMapper.updateByPrimaryKeySelective(ecotur);
		} else {
			rs	= ecoturMapper.insertSelective(ecotur);
			
			Integer srlGid	= ecoturMapper.lastSequence();
			ecoturDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(EcoturDto ecoturDto) throws Exception {
		Ecotur ecotur		= new Ecotur();
		BeanUtils.copyProperties(ecoturDto, ecotur);
		Integer rs	= ecoturMapper.deleteByPrimaryKey(ecotur);
		return rs;
	}
	
}
