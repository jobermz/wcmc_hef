package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemConcesionesForestalesConservacionDto;
import wcmc.hef.business.core.capa.service.TemConcesionesForestalesConservacionService;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesConservacion;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesConservacionParamDef;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesConservacionParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemConcesionesForestalesConservacionMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemConcesionesForestalesConservacionServiceImpl implements TemConcesionesForestalesConservacionService {
	@Autowired
	private TemConcesionesForestalesConservacionMapper temConcesionesForestalesConservacionMapper;
	public List<TemConcesionesForestalesConservacion> buscar(TemConcesionesForestalesConservacionDto temConcesionesForestalesConservacionDto) throws Exception {
		TemConcesionesForestalesConservacionParamDef temConcesionesForestalesConservacionParamDef		= new TemConcesionesForestalesConservacionParamDef();
		
		Criteria criteria		= temConcesionesForestalesConservacionParamDef.createCriteria();
		if(temConcesionesForestalesConservacionDto != null) {
			if(CadenaUtil.getStrNull(temConcesionesForestalesConservacionDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temConcesionesForestalesConservacionDto.getStrTheGeom());
			}
			if(CadenaUtil.getDoubNull(temConcesionesForestalesConservacionDto.getDblNum()) != null) {
				criteria.andDblNumEqualTo(temConcesionesForestalesConservacionDto.getDblNum());
			}
			if(CadenaUtil.getInteNull(temConcesionesForestalesConservacionDto.getIntId()) != null) {
				criteria.andIntIdEqualTo(temConcesionesForestalesConservacionDto.getIntId());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesConservacionDto.getStrModalidad()) != null) {
				criteria.andStrModalidadEqualTo(temConcesionesForestalesConservacionDto.getStrModalidad());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesConservacionDto.getStrTitular()) != null) {
				criteria.andStrTitularEqualTo(temConcesionesForestalesConservacionDto.getStrTitular());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesConservacionDto.getStrContrato()) != null) {
				criteria.andStrContratoEqualTo(temConcesionesForestalesConservacionDto.getStrContrato());
			}
			if(CadenaUtil.getDoubNull(temConcesionesForestalesConservacionDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(temConcesionesForestalesConservacionDto.getDblAreaSig());
			}
			if(CadenaUtil.getDoubNull(temConcesionesForestalesConservacionDto.getDblAreaAprob()) != null) {
				criteria.andDblAreaAprobEqualTo(temConcesionesForestalesConservacionDto.getDblAreaAprob());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesConservacionDto.getStrRegion()) != null) {
				criteria.andStrRegionEqualTo(temConcesionesForestalesConservacionDto.getStrRegion());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesConservacionDto.getStrSituacion()) != null) {
				criteria.andStrSituacionEqualTo(temConcesionesForestalesConservacionDto.getStrSituacion());
			}
		}
		
		temConcesionesForestalesConservacionParamDef.setOrderByClause("de_titular,de_contrato");
		List<TemConcesionesForestalesConservacion>	 list	= temConcesionesForestalesConservacionMapper.selectByDefaultParameter(temConcesionesForestalesConservacionParamDef);
		return list;
	}
	
	public List<TemConcesionesForestalesConservacion> buscarGeometry(TemConcesionesForestalesConservacionDto temConcesionesForestalesConservacionDto) throws Exception {
		TemConcesionesForestalesConservacionParamDef temConcesionesForestalesConservacionParamDef		= new TemConcesionesForestalesConservacionParamDef();
		
		Criteria criteria		= temConcesionesForestalesConservacionParamDef.createCriteria();
		if(temConcesionesForestalesConservacionDto != null) {
			if(CadenaUtil.getStrNull(temConcesionesForestalesConservacionDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temConcesionesForestalesConservacionDto.getStrTheGeom());
			}
			if(CadenaUtil.getDoubNull(temConcesionesForestalesConservacionDto.getDblNum()) != null) {
				criteria.andDblNumEqualTo(temConcesionesForestalesConservacionDto.getDblNum());
			}
			if(CadenaUtil.getInteNull(temConcesionesForestalesConservacionDto.getIntId()) != null) {
				criteria.andIntIdEqualTo(temConcesionesForestalesConservacionDto.getIntId());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesConservacionDto.getStrModalidad()) != null) {
				criteria.andStrModalidadEqualTo(temConcesionesForestalesConservacionDto.getStrModalidad());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesConservacionDto.getStrTitular()) != null) {
				criteria.andStrTitularEqualTo(temConcesionesForestalesConservacionDto.getStrTitular());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesConservacionDto.getStrContrato()) != null) {
				criteria.andStrContratoEqualTo(temConcesionesForestalesConservacionDto.getStrContrato());
			}
			if(CadenaUtil.getDoubNull(temConcesionesForestalesConservacionDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(temConcesionesForestalesConservacionDto.getDblAreaSig());
			}
			if(CadenaUtil.getDoubNull(temConcesionesForestalesConservacionDto.getDblAreaAprob()) != null) {
				criteria.andDblAreaAprobEqualTo(temConcesionesForestalesConservacionDto.getDblAreaAprob());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesConservacionDto.getStrRegion()) != null) {
				criteria.andStrRegionEqualTo(temConcesionesForestalesConservacionDto.getStrRegion());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesConservacionDto.getStrSituacion()) != null) {
				criteria.andStrSituacionEqualTo(temConcesionesForestalesConservacionDto.getStrSituacion());
			}
		}
		
		temConcesionesForestalesConservacionParamDef.setOrderByClause("de_titular,de_contrato");
		List<TemConcesionesForestalesConservacion>	 list	= temConcesionesForestalesConservacionMapper.selectByDefaultParameterGeometry(temConcesionesForestalesConservacionParamDef);
		return list;
	}
	
	public List<TemConcesionesForestalesConservacion> buscarCombo(TemConcesionesForestalesConservacionDto temConcesionesForestalesConservacionDto) throws Exception {
		TemConcesionesForestalesConservacionParamDef temConcesionesForestalesConservacionParamDef		= new TemConcesionesForestalesConservacionParamDef();
		
		Criteria criteria		= temConcesionesForestalesConservacionParamDef.createCriteria();
		if(temConcesionesForestalesConservacionDto != null) {
			if(CadenaUtil.getStrNull(temConcesionesForestalesConservacionDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temConcesionesForestalesConservacionDto.getStrTheGeom());
			}
			if(CadenaUtil.getDoubNull(temConcesionesForestalesConservacionDto.getDblNum()) != null) {
				criteria.andDblNumEqualTo(temConcesionesForestalesConservacionDto.getDblNum());
			}
			if(CadenaUtil.getInteNull(temConcesionesForestalesConservacionDto.getIntId()) != null) {
				criteria.andIntIdEqualTo(temConcesionesForestalesConservacionDto.getIntId());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesConservacionDto.getStrModalidad()) != null) {
				criteria.andStrModalidadEqualTo(temConcesionesForestalesConservacionDto.getStrModalidad());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesConservacionDto.getStrTitular()) != null) {
				criteria.andStrTitularEqualTo(temConcesionesForestalesConservacionDto.getStrTitular());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesConservacionDto.getStrContrato()) != null) {
				criteria.andStrContratoEqualTo(temConcesionesForestalesConservacionDto.getStrContrato());
			}
			if(CadenaUtil.getDoubNull(temConcesionesForestalesConservacionDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(temConcesionesForestalesConservacionDto.getDblAreaSig());
			}
			if(CadenaUtil.getDoubNull(temConcesionesForestalesConservacionDto.getDblAreaAprob()) != null) {
				criteria.andDblAreaAprobEqualTo(temConcesionesForestalesConservacionDto.getDblAreaAprob());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesConservacionDto.getStrRegion()) != null) {
				criteria.andStrRegionEqualTo(temConcesionesForestalesConservacionDto.getStrRegion());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesConservacionDto.getStrSituacion()) != null) {
				criteria.andStrSituacionEqualTo(temConcesionesForestalesConservacionDto.getStrSituacion());
			}
		}
		
		temConcesionesForestalesConservacionParamDef.setOrderByClause("de_titular,de_contrato");
		List<TemConcesionesForestalesConservacion>	 list	= temConcesionesForestalesConservacionMapper.selectByDefaultParameterCombo(temConcesionesForestalesConservacionParamDef);
		return list;
	}
	
	public TemConcesionesForestalesConservacion buscarById(TemConcesionesForestalesConservacionDto temConcesionesForestalesConservacionDto) throws Exception {
		TemConcesionesForestalesConservacion temConcesionesForestalesConservacion		= new TemConcesionesForestalesConservacion();
		BeanUtils.copyProperties(temConcesionesForestalesConservacionDto, temConcesionesForestalesConservacion);
		return temConcesionesForestalesConservacionMapper.selectByPrimaryKey(temConcesionesForestalesConservacion);
	}
	
	public TemConcesionesForestalesConservacion buscarGeometryById(TemConcesionesForestalesConservacionDto temConcesionesForestalesConservacionDto) throws Exception {
		TemConcesionesForestalesConservacion temConcesionesForestalesConservacion		= new TemConcesionesForestalesConservacion();
		BeanUtils.copyProperties(temConcesionesForestalesConservacionDto, temConcesionesForestalesConservacion);
		return temConcesionesForestalesConservacionMapper.selectByPrimaryKeyGeometry(temConcesionesForestalesConservacion);
	}
	
	@Transactional
	public Integer guardar(TemConcesionesForestalesConservacionDto temConcesionesForestalesConservacionDto) throws Exception {
		TemConcesionesForestalesConservacion temConcesionesForestalesConservacion		= new TemConcesionesForestalesConservacion();
		BeanUtils.copyProperties(temConcesionesForestalesConservacionDto, temConcesionesForestalesConservacion);
		int rs	= 0;
		TemConcesionesForestalesConservacion exiteTemConcesionesForestalesConservacion		= temConcesionesForestalesConservacionMapper.selectByPrimaryKey(temConcesionesForestalesConservacion);
		if(exiteTemConcesionesForestalesConservacion != null) {
			rs	= temConcesionesForestalesConservacionMapper.updateByPrimaryKeySelective(temConcesionesForestalesConservacion);
		} else {
			rs	= temConcesionesForestalesConservacionMapper.insertSelective(temConcesionesForestalesConservacion);
			
			Integer srlGid	= temConcesionesForestalesConservacionMapper.lastSequence();
			temConcesionesForestalesConservacionDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemConcesionesForestalesConservacionDto temConcesionesForestalesConservacionDto) throws Exception {
		TemConcesionesForestalesConservacion temConcesionesForestalesConservacion		= new TemConcesionesForestalesConservacion();
		BeanUtils.copyProperties(temConcesionesForestalesConservacionDto, temConcesionesForestalesConservacion);
		Integer rs	= temConcesionesForestalesConservacionMapper.deleteByPrimaryKey(temConcesionesForestalesConservacion);
		return rs;
	}
	
}
