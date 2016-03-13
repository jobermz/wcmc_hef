package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemConcesionesForestalesCastaniaDto;
import wcmc.hef.business.core.capa.service.TemConcesionesForestalesCastaniaService;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesCastania;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesCastaniaParamDef;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesCastaniaParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemConcesionesForestalesCastaniaMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemConcesionesForestalesCastaniaServiceImpl implements TemConcesionesForestalesCastaniaService {
	@Autowired
	private TemConcesionesForestalesCastaniaMapper temConcesionesForestalesCastaniaMapper;
	public List<TemConcesionesForestalesCastania> buscar(TemConcesionesForestalesCastaniaDto temConcesionesForestalesCastaniaDto) throws Exception {
		TemConcesionesForestalesCastaniaParamDef temConcesionesForestalesCastaniaParamDef		= new TemConcesionesForestalesCastaniaParamDef();
		
		Criteria criteria		= temConcesionesForestalesCastaniaParamDef.createCriteria();
		if(temConcesionesForestalesCastaniaDto != null) {
			if(CadenaUtil.getStrNull(temConcesionesForestalesCastaniaDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temConcesionesForestalesCastaniaDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesCastaniaDto.getStrModalidad()) != null) {
				criteria.andStrModalidadEqualTo(temConcesionesForestalesCastaniaDto.getStrModalidad());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesCastaniaDto.getStrTitular()) != null) {
				criteria.andStrTitularEqualTo(temConcesionesForestalesCastaniaDto.getStrTitular());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesCastaniaDto.getStrContrato()) != null) {
				criteria.andStrContratoEqualTo(temConcesionesForestalesCastaniaDto.getStrContrato());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesCastaniaDto.getStrRegion()) != null) {
				criteria.andStrRegionEqualTo(temConcesionesForestalesCastaniaDto.getStrRegion());
			}
			if(CadenaUtil.getDoubNull(temConcesionesForestalesCastaniaDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(temConcesionesForestalesCastaniaDto.getDblAreaSig());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesCastaniaDto.getStrSituacion()) != null) {
				criteria.andStrSituacionEqualTo(temConcesionesForestalesCastaniaDto.getStrSituacion());
			}
		}
		
		temConcesionesForestalesCastaniaParamDef.setOrderByClause("de_titular,de_contrato");
		List<TemConcesionesForestalesCastania>	 list	= temConcesionesForestalesCastaniaMapper.selectByDefaultParameter(temConcesionesForestalesCastaniaParamDef);
		return list;
	}
	
	public List<TemConcesionesForestalesCastania> buscarGeometry(TemConcesionesForestalesCastaniaDto temConcesionesForestalesCastaniaDto) throws Exception {
		TemConcesionesForestalesCastaniaParamDef temConcesionesForestalesCastaniaParamDef		= new TemConcesionesForestalesCastaniaParamDef();
		
		Criteria criteria		= temConcesionesForestalesCastaniaParamDef.createCriteria();
		if(temConcesionesForestalesCastaniaDto != null) {
			if(CadenaUtil.getStrNull(temConcesionesForestalesCastaniaDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temConcesionesForestalesCastaniaDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesCastaniaDto.getStrModalidad()) != null) {
				criteria.andStrModalidadEqualTo(temConcesionesForestalesCastaniaDto.getStrModalidad());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesCastaniaDto.getStrTitular()) != null) {
				criteria.andStrTitularEqualTo(temConcesionesForestalesCastaniaDto.getStrTitular());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesCastaniaDto.getStrContrato()) != null) {
				criteria.andStrContratoEqualTo(temConcesionesForestalesCastaniaDto.getStrContrato());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesCastaniaDto.getStrRegion()) != null) {
				criteria.andStrRegionEqualTo(temConcesionesForestalesCastaniaDto.getStrRegion());
			}
			if(CadenaUtil.getDoubNull(temConcesionesForestalesCastaniaDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(temConcesionesForestalesCastaniaDto.getDblAreaSig());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesCastaniaDto.getStrSituacion()) != null) {
				criteria.andStrSituacionEqualTo(temConcesionesForestalesCastaniaDto.getStrSituacion());
			}
		}
		
		temConcesionesForestalesCastaniaParamDef.setOrderByClause("de_titular,de_contrato");
		List<TemConcesionesForestalesCastania>	 list	= temConcesionesForestalesCastaniaMapper.selectByDefaultParameterGeometry(temConcesionesForestalesCastaniaParamDef);
		return list;
	}
	
	public List<TemConcesionesForestalesCastania> buscarCombo(TemConcesionesForestalesCastaniaDto temConcesionesForestalesCastaniaDto) throws Exception {
		TemConcesionesForestalesCastaniaParamDef temConcesionesForestalesCastaniaParamDef		= new TemConcesionesForestalesCastaniaParamDef();
		
		Criteria criteria		= temConcesionesForestalesCastaniaParamDef.createCriteria();
		if(temConcesionesForestalesCastaniaDto != null) {
			if(CadenaUtil.getStrNull(temConcesionesForestalesCastaniaDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temConcesionesForestalesCastaniaDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesCastaniaDto.getStrModalidad()) != null) {
				criteria.andStrModalidadEqualTo(temConcesionesForestalesCastaniaDto.getStrModalidad());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesCastaniaDto.getStrTitular()) != null) {
				criteria.andStrTitularEqualTo(temConcesionesForestalesCastaniaDto.getStrTitular());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesCastaniaDto.getStrContrato()) != null) {
				criteria.andStrContratoEqualTo(temConcesionesForestalesCastaniaDto.getStrContrato());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesCastaniaDto.getStrRegion()) != null) {
				criteria.andStrRegionEqualTo(temConcesionesForestalesCastaniaDto.getStrRegion());
			}
			if(CadenaUtil.getDoubNull(temConcesionesForestalesCastaniaDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(temConcesionesForestalesCastaniaDto.getDblAreaSig());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesCastaniaDto.getStrSituacion()) != null) {
				criteria.andStrSituacionEqualTo(temConcesionesForestalesCastaniaDto.getStrSituacion());
			}
		}
		
		temConcesionesForestalesCastaniaParamDef.setOrderByClause("de_titular,de_contrato");
		List<TemConcesionesForestalesCastania>	 list	= temConcesionesForestalesCastaniaMapper.selectByDefaultParameterCombo(temConcesionesForestalesCastaniaParamDef);
		return list;
	}
	
	public TemConcesionesForestalesCastania buscarById(TemConcesionesForestalesCastaniaDto temConcesionesForestalesCastaniaDto) throws Exception {
		TemConcesionesForestalesCastania temConcesionesForestalesCastania		= new TemConcesionesForestalesCastania();
		BeanUtils.copyProperties(temConcesionesForestalesCastaniaDto, temConcesionesForestalesCastania);
		return temConcesionesForestalesCastaniaMapper.selectByPrimaryKey(temConcesionesForestalesCastania);
	}
	
	public TemConcesionesForestalesCastania buscarGeometryById(TemConcesionesForestalesCastaniaDto temConcesionesForestalesCastaniaDto) throws Exception {
		TemConcesionesForestalesCastania temConcesionesForestalesCastania		= new TemConcesionesForestalesCastania();
		BeanUtils.copyProperties(temConcesionesForestalesCastaniaDto, temConcesionesForestalesCastania);
		return temConcesionesForestalesCastaniaMapper.selectByPrimaryKeyGeometry(temConcesionesForestalesCastania);
	}
	
	@Transactional
	public Integer guardar(TemConcesionesForestalesCastaniaDto temConcesionesForestalesCastaniaDto) throws Exception {
		TemConcesionesForestalesCastania temConcesionesForestalesCastania		= new TemConcesionesForestalesCastania();
		BeanUtils.copyProperties(temConcesionesForestalesCastaniaDto, temConcesionesForestalesCastania);
		int rs	= 0;
		TemConcesionesForestalesCastania exiteTemConcesionesForestalesCastania		= temConcesionesForestalesCastaniaMapper.selectByPrimaryKey(temConcesionesForestalesCastania);
		if(exiteTemConcesionesForestalesCastania != null) {
			rs	= temConcesionesForestalesCastaniaMapper.updateByPrimaryKeySelective(temConcesionesForestalesCastania);
		} else {
			rs	= temConcesionesForestalesCastaniaMapper.insertSelective(temConcesionesForestalesCastania);
			
			Integer srlGid	= temConcesionesForestalesCastaniaMapper.lastSequence();
			temConcesionesForestalesCastaniaDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemConcesionesForestalesCastaniaDto temConcesionesForestalesCastaniaDto) throws Exception {
		TemConcesionesForestalesCastania temConcesionesForestalesCastania		= new TemConcesionesForestalesCastania();
		BeanUtils.copyProperties(temConcesionesForestalesCastaniaDto, temConcesionesForestalesCastania);
		Integer rs	= temConcesionesForestalesCastaniaMapper.deleteByPrimaryKey(temConcesionesForestalesCastania);
		return rs;
	}
	
}
