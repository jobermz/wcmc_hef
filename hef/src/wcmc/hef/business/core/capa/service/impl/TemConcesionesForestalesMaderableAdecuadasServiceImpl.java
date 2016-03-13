package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemConcesionesForestalesMaderableAdecuadasDto;
import wcmc.hef.business.core.capa.service.TemConcesionesForestalesMaderableAdecuadasService;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesMaderableAdecuadas;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesMaderableAdecuadasParamDef;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesMaderableAdecuadasParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemConcesionesForestalesMaderableAdecuadasMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemConcesionesForestalesMaderableAdecuadasServiceImpl implements TemConcesionesForestalesMaderableAdecuadasService {
	@Autowired
	private TemConcesionesForestalesMaderableAdecuadasMapper temConcesionesForestalesMaderableAdecuadasMapper;
	public List<TemConcesionesForestalesMaderableAdecuadas> buscar(TemConcesionesForestalesMaderableAdecuadasDto temConcesionesForestalesMaderableAdecuadasDto) throws Exception {
		TemConcesionesForestalesMaderableAdecuadasParamDef temConcesionesForestalesMaderableAdecuadasParamDef		= new TemConcesionesForestalesMaderableAdecuadasParamDef();
		
		Criteria criteria		= temConcesionesForestalesMaderableAdecuadasParamDef.createCriteria();
		if(temConcesionesForestalesMaderableAdecuadasDto != null) {
			if(CadenaUtil.getStrNull(temConcesionesForestalesMaderableAdecuadasDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temConcesionesForestalesMaderableAdecuadasDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesMaderableAdecuadasDto.getStrModalidad()) != null) {
				criteria.andStrModalidadEqualTo(temConcesionesForestalesMaderableAdecuadasDto.getStrModalidad());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesMaderableAdecuadasDto.getStrTitular()) != null) {
				criteria.andStrTitularEqualTo(temConcesionesForestalesMaderableAdecuadasDto.getStrTitular());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesMaderableAdecuadasDto.getStrContrato()) != null) {
				criteria.andStrContratoEqualTo(temConcesionesForestalesMaderableAdecuadasDto.getStrContrato());
			}
			if(CadenaUtil.getDoubNull(temConcesionesForestalesMaderableAdecuadasDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(temConcesionesForestalesMaderableAdecuadasDto.getDblAreaSig());
			}
			if(CadenaUtil.getDoubNull(temConcesionesForestalesMaderableAdecuadasDto.getDblAreaAprob()) != null) {
				criteria.andDblAreaAprobEqualTo(temConcesionesForestalesMaderableAdecuadasDto.getDblAreaAprob());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesMaderableAdecuadasDto.getStrRegion()) != null) {
				criteria.andStrRegionEqualTo(temConcesionesForestalesMaderableAdecuadasDto.getStrRegion());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesMaderableAdecuadasDto.getStrSituacion()) != null) {
				criteria.andStrSituacionEqualTo(temConcesionesForestalesMaderableAdecuadasDto.getStrSituacion());
			}
		}
		
		temConcesionesForestalesMaderableAdecuadasParamDef.setOrderByClause("de_titular,de_contrato");
		List<TemConcesionesForestalesMaderableAdecuadas>	 list	= temConcesionesForestalesMaderableAdecuadasMapper.selectByDefaultParameter(temConcesionesForestalesMaderableAdecuadasParamDef);
		return list;
	}
	
	public List<TemConcesionesForestalesMaderableAdecuadas> buscarGeometry(TemConcesionesForestalesMaderableAdecuadasDto temConcesionesForestalesMaderableAdecuadasDto) throws Exception {
		TemConcesionesForestalesMaderableAdecuadasParamDef temConcesionesForestalesMaderableAdecuadasParamDef		= new TemConcesionesForestalesMaderableAdecuadasParamDef();
		
		Criteria criteria		= temConcesionesForestalesMaderableAdecuadasParamDef.createCriteria();
		if(temConcesionesForestalesMaderableAdecuadasDto != null) {
			if(CadenaUtil.getStrNull(temConcesionesForestalesMaderableAdecuadasDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temConcesionesForestalesMaderableAdecuadasDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesMaderableAdecuadasDto.getStrModalidad()) != null) {
				criteria.andStrModalidadEqualTo(temConcesionesForestalesMaderableAdecuadasDto.getStrModalidad());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesMaderableAdecuadasDto.getStrTitular()) != null) {
				criteria.andStrTitularEqualTo(temConcesionesForestalesMaderableAdecuadasDto.getStrTitular());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesMaderableAdecuadasDto.getStrContrato()) != null) {
				criteria.andStrContratoEqualTo(temConcesionesForestalesMaderableAdecuadasDto.getStrContrato());
			}
			if(CadenaUtil.getDoubNull(temConcesionesForestalesMaderableAdecuadasDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(temConcesionesForestalesMaderableAdecuadasDto.getDblAreaSig());
			}
			if(CadenaUtil.getDoubNull(temConcesionesForestalesMaderableAdecuadasDto.getDblAreaAprob()) != null) {
				criteria.andDblAreaAprobEqualTo(temConcesionesForestalesMaderableAdecuadasDto.getDblAreaAprob());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesMaderableAdecuadasDto.getStrRegion()) != null) {
				criteria.andStrRegionEqualTo(temConcesionesForestalesMaderableAdecuadasDto.getStrRegion());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesMaderableAdecuadasDto.getStrSituacion()) != null) {
				criteria.andStrSituacionEqualTo(temConcesionesForestalesMaderableAdecuadasDto.getStrSituacion());
			}
		}
		
		temConcesionesForestalesMaderableAdecuadasParamDef.setOrderByClause("de_titular,de_contrato");
		List<TemConcesionesForestalesMaderableAdecuadas>	 list	= temConcesionesForestalesMaderableAdecuadasMapper.selectByDefaultParameterGeometry(temConcesionesForestalesMaderableAdecuadasParamDef);
		return list;
	}
	
	public List<TemConcesionesForestalesMaderableAdecuadas> buscarCombo(TemConcesionesForestalesMaderableAdecuadasDto temConcesionesForestalesMaderableAdecuadasDto) throws Exception {
		TemConcesionesForestalesMaderableAdecuadasParamDef temConcesionesForestalesMaderableAdecuadasParamDef		= new TemConcesionesForestalesMaderableAdecuadasParamDef();
		
		Criteria criteria		= temConcesionesForestalesMaderableAdecuadasParamDef.createCriteria();
		if(temConcesionesForestalesMaderableAdecuadasDto != null) {
			if(CadenaUtil.getStrNull(temConcesionesForestalesMaderableAdecuadasDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temConcesionesForestalesMaderableAdecuadasDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesMaderableAdecuadasDto.getStrModalidad()) != null) {
				criteria.andStrModalidadEqualTo(temConcesionesForestalesMaderableAdecuadasDto.getStrModalidad());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesMaderableAdecuadasDto.getStrTitular()) != null) {
				criteria.andStrTitularEqualTo(temConcesionesForestalesMaderableAdecuadasDto.getStrTitular());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesMaderableAdecuadasDto.getStrContrato()) != null) {
				criteria.andStrContratoEqualTo(temConcesionesForestalesMaderableAdecuadasDto.getStrContrato());
			}
			if(CadenaUtil.getDoubNull(temConcesionesForestalesMaderableAdecuadasDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(temConcesionesForestalesMaderableAdecuadasDto.getDblAreaSig());
			}
			if(CadenaUtil.getDoubNull(temConcesionesForestalesMaderableAdecuadasDto.getDblAreaAprob()) != null) {
				criteria.andDblAreaAprobEqualTo(temConcesionesForestalesMaderableAdecuadasDto.getDblAreaAprob());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesMaderableAdecuadasDto.getStrRegion()) != null) {
				criteria.andStrRegionEqualTo(temConcesionesForestalesMaderableAdecuadasDto.getStrRegion());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesMaderableAdecuadasDto.getStrSituacion()) != null) {
				criteria.andStrSituacionEqualTo(temConcesionesForestalesMaderableAdecuadasDto.getStrSituacion());
			}
		}
		
		temConcesionesForestalesMaderableAdecuadasParamDef.setOrderByClause("de_titular,de_contrato");
		List<TemConcesionesForestalesMaderableAdecuadas>	 list	= temConcesionesForestalesMaderableAdecuadasMapper.selectByDefaultParameterCombo(temConcesionesForestalesMaderableAdecuadasParamDef);
		return list;
	}
	
	public TemConcesionesForestalesMaderableAdecuadas buscarById(TemConcesionesForestalesMaderableAdecuadasDto temConcesionesForestalesMaderableAdecuadasDto) throws Exception {
		TemConcesionesForestalesMaderableAdecuadas temConcesionesForestalesMaderableAdecuadas		= new TemConcesionesForestalesMaderableAdecuadas();
		BeanUtils.copyProperties(temConcesionesForestalesMaderableAdecuadasDto, temConcesionesForestalesMaderableAdecuadas);
		return temConcesionesForestalesMaderableAdecuadasMapper.selectByPrimaryKey(temConcesionesForestalesMaderableAdecuadas);
	}
	
	public TemConcesionesForestalesMaderableAdecuadas buscarGeometryById(TemConcesionesForestalesMaderableAdecuadasDto temConcesionesForestalesMaderableAdecuadasDto) throws Exception {
		TemConcesionesForestalesMaderableAdecuadas temConcesionesForestalesMaderableAdecuadas		= new TemConcesionesForestalesMaderableAdecuadas();
		BeanUtils.copyProperties(temConcesionesForestalesMaderableAdecuadasDto, temConcesionesForestalesMaderableAdecuadas);
		return temConcesionesForestalesMaderableAdecuadasMapper.selectByPrimaryKeyGeometry(temConcesionesForestalesMaderableAdecuadas);
	}
	
	@Transactional
	public Integer guardar(TemConcesionesForestalesMaderableAdecuadasDto temConcesionesForestalesMaderableAdecuadasDto) throws Exception {
		TemConcesionesForestalesMaderableAdecuadas temConcesionesForestalesMaderableAdecuadas		= new TemConcesionesForestalesMaderableAdecuadas();
		BeanUtils.copyProperties(temConcesionesForestalesMaderableAdecuadasDto, temConcesionesForestalesMaderableAdecuadas);
		int rs	= 0;
		TemConcesionesForestalesMaderableAdecuadas exiteTemConcesionesForestalesMaderableAdecuadas		= temConcesionesForestalesMaderableAdecuadasMapper.selectByPrimaryKey(temConcesionesForestalesMaderableAdecuadas);
		if(exiteTemConcesionesForestalesMaderableAdecuadas != null) {
			rs	= temConcesionesForestalesMaderableAdecuadasMapper.updateByPrimaryKeySelective(temConcesionesForestalesMaderableAdecuadas);
		} else {
			rs	= temConcesionesForestalesMaderableAdecuadasMapper.insertSelective(temConcesionesForestalesMaderableAdecuadas);
			
			Integer srlGid	= temConcesionesForestalesMaderableAdecuadasMapper.lastSequence();
			temConcesionesForestalesMaderableAdecuadasDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemConcesionesForestalesMaderableAdecuadasDto temConcesionesForestalesMaderableAdecuadasDto) throws Exception {
		TemConcesionesForestalesMaderableAdecuadas temConcesionesForestalesMaderableAdecuadas		= new TemConcesionesForestalesMaderableAdecuadas();
		BeanUtils.copyProperties(temConcesionesForestalesMaderableAdecuadasDto, temConcesionesForestalesMaderableAdecuadas);
		Integer rs	= temConcesionesForestalesMaderableAdecuadasMapper.deleteByPrimaryKey(temConcesionesForestalesMaderableAdecuadas);
		return rs;
	}
	
}
