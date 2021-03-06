package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemConcesionesForestalesManejoFaunaSilvestreDto;
import wcmc.hef.business.core.capa.service.TemConcesionesForestalesManejoFaunaSilvestreService;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesManejoFaunaSilvestre;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesManejoFaunaSilvestreParamDef;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesManejoFaunaSilvestreParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemConcesionesForestalesManejoFaunaSilvestreMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemConcesionesForestalesManejoFaunaSilvestreServiceImpl implements TemConcesionesForestalesManejoFaunaSilvestreService {
	@Autowired
	private TemConcesionesForestalesManejoFaunaSilvestreMapper temConcesionesForestalesManejoFaunaSilvestreMapper;
	public List<TemConcesionesForestalesManejoFaunaSilvestre> buscar(TemConcesionesForestalesManejoFaunaSilvestreDto temConcesionesForestalesManejoFaunaSilvestreDto) throws Exception {
		TemConcesionesForestalesManejoFaunaSilvestreParamDef temConcesionesForestalesManejoFaunaSilvestreParamDef		= new TemConcesionesForestalesManejoFaunaSilvestreParamDef();
		
		Criteria criteria		= temConcesionesForestalesManejoFaunaSilvestreParamDef.createCriteria();
		if(temConcesionesForestalesManejoFaunaSilvestreDto != null) {
			if(CadenaUtil.getStrNull(temConcesionesForestalesManejoFaunaSilvestreDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temConcesionesForestalesManejoFaunaSilvestreDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(temConcesionesForestalesManejoFaunaSilvestreDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(temConcesionesForestalesManejoFaunaSilvestreDto.getIntObjectid());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesManejoFaunaSilvestreDto.getStrBeneficiar()) != null) {
				criteria.andStrBeneficiarEqualTo(temConcesionesForestalesManejoFaunaSilvestreDto.getStrBeneficiar());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesManejoFaunaSilvestreDto.getStrModalidad()) != null) {
				criteria.andStrModalidadEqualTo(temConcesionesForestalesManejoFaunaSilvestreDto.getStrModalidad());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesManejoFaunaSilvestreDto.getStrTitular()) != null) {
				criteria.andStrTitularEqualTo(temConcesionesForestalesManejoFaunaSilvestreDto.getStrTitular());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesManejoFaunaSilvestreDto.getStrContrato()) != null) {
				criteria.andStrContratoEqualTo(temConcesionesForestalesManejoFaunaSilvestreDto.getStrContrato());
			}
			if(CadenaUtil.getDoubNull(temConcesionesForestalesManejoFaunaSilvestreDto.getDblAreaAprob()) != null) {
				criteria.andDblAreaAprobEqualTo(temConcesionesForestalesManejoFaunaSilvestreDto.getDblAreaAprob());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesManejoFaunaSilvestreDto.getStrRegion()) != null) {
				criteria.andStrRegionEqualTo(temConcesionesForestalesManejoFaunaSilvestreDto.getStrRegion());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesManejoFaunaSilvestreDto.getStrDocum()) != null) {
				criteria.andStrDocumEqualTo(temConcesionesForestalesManejoFaunaSilvestreDto.getStrDocum());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesManejoFaunaSilvestreDto.getStrSituacion()) != null) {
				criteria.andStrSituacionEqualTo(temConcesionesForestalesManejoFaunaSilvestreDto.getStrSituacion());
			}
			if(CadenaUtil.getDoubNull(temConcesionesForestalesManejoFaunaSilvestreDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(temConcesionesForestalesManejoFaunaSilvestreDto.getDblAreaSig());
			}
			temConcesionesForestalesManejoFaunaSilvestreParamDef.setStrHashConsulta(temConcesionesForestalesManejoFaunaSilvestreDto.getStrHashConsulta());
		}
		
		temConcesionesForestalesManejoFaunaSilvestreParamDef.setOrderByClause("de_titular,de_contrato");
		List<TemConcesionesForestalesManejoFaunaSilvestre>	 list	= temConcesionesForestalesManejoFaunaSilvestreMapper.selectByDefaultParameter(temConcesionesForestalesManejoFaunaSilvestreParamDef);
		return list;
	}
	
	public List<TemConcesionesForestalesManejoFaunaSilvestre> buscarGeometry(TemConcesionesForestalesManejoFaunaSilvestreDto temConcesionesForestalesManejoFaunaSilvestreDto) throws Exception {
		TemConcesionesForestalesManejoFaunaSilvestreParamDef temConcesionesForestalesManejoFaunaSilvestreParamDef		= new TemConcesionesForestalesManejoFaunaSilvestreParamDef();
		
		Criteria criteria		= temConcesionesForestalesManejoFaunaSilvestreParamDef.createCriteria();
		if(temConcesionesForestalesManejoFaunaSilvestreDto != null) {
			if(CadenaUtil.getStrNull(temConcesionesForestalesManejoFaunaSilvestreDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temConcesionesForestalesManejoFaunaSilvestreDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(temConcesionesForestalesManejoFaunaSilvestreDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(temConcesionesForestalesManejoFaunaSilvestreDto.getIntObjectid());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesManejoFaunaSilvestreDto.getStrBeneficiar()) != null) {
				criteria.andStrBeneficiarEqualTo(temConcesionesForestalesManejoFaunaSilvestreDto.getStrBeneficiar());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesManejoFaunaSilvestreDto.getStrModalidad()) != null) {
				criteria.andStrModalidadEqualTo(temConcesionesForestalesManejoFaunaSilvestreDto.getStrModalidad());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesManejoFaunaSilvestreDto.getStrTitular()) != null) {
				criteria.andStrTitularEqualTo(temConcesionesForestalesManejoFaunaSilvestreDto.getStrTitular());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesManejoFaunaSilvestreDto.getStrContrato()) != null) {
				criteria.andStrContratoEqualTo(temConcesionesForestalesManejoFaunaSilvestreDto.getStrContrato());
			}
			if(CadenaUtil.getDoubNull(temConcesionesForestalesManejoFaunaSilvestreDto.getDblAreaAprob()) != null) {
				criteria.andDblAreaAprobEqualTo(temConcesionesForestalesManejoFaunaSilvestreDto.getDblAreaAprob());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesManejoFaunaSilvestreDto.getStrRegion()) != null) {
				criteria.andStrRegionEqualTo(temConcesionesForestalesManejoFaunaSilvestreDto.getStrRegion());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesManejoFaunaSilvestreDto.getStrDocum()) != null) {
				criteria.andStrDocumEqualTo(temConcesionesForestalesManejoFaunaSilvestreDto.getStrDocum());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesManejoFaunaSilvestreDto.getStrSituacion()) != null) {
				criteria.andStrSituacionEqualTo(temConcesionesForestalesManejoFaunaSilvestreDto.getStrSituacion());
			}
			if(CadenaUtil.getDoubNull(temConcesionesForestalesManejoFaunaSilvestreDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(temConcesionesForestalesManejoFaunaSilvestreDto.getDblAreaSig());
			}
		}
		
		temConcesionesForestalesManejoFaunaSilvestreParamDef.setOrderByClause("de_titular,de_contrato");
		List<TemConcesionesForestalesManejoFaunaSilvestre>	 list	= temConcesionesForestalesManejoFaunaSilvestreMapper.selectByDefaultParameterGeometry(temConcesionesForestalesManejoFaunaSilvestreParamDef);
		return list;
	}
	
	public List<TemConcesionesForestalesManejoFaunaSilvestre> buscarCombo(TemConcesionesForestalesManejoFaunaSilvestreDto temConcesionesForestalesManejoFaunaSilvestreDto) throws Exception {
		TemConcesionesForestalesManejoFaunaSilvestreParamDef temConcesionesForestalesManejoFaunaSilvestreParamDef		= new TemConcesionesForestalesManejoFaunaSilvestreParamDef();
		
		Criteria criteria		= temConcesionesForestalesManejoFaunaSilvestreParamDef.createCriteria();
		if(temConcesionesForestalesManejoFaunaSilvestreDto != null) {
			if(CadenaUtil.getStrNull(temConcesionesForestalesManejoFaunaSilvestreDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temConcesionesForestalesManejoFaunaSilvestreDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(temConcesionesForestalesManejoFaunaSilvestreDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(temConcesionesForestalesManejoFaunaSilvestreDto.getIntObjectid());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesManejoFaunaSilvestreDto.getStrBeneficiar()) != null) {
				criteria.andStrBeneficiarEqualTo(temConcesionesForestalesManejoFaunaSilvestreDto.getStrBeneficiar());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesManejoFaunaSilvestreDto.getStrModalidad()) != null) {
				criteria.andStrModalidadEqualTo(temConcesionesForestalesManejoFaunaSilvestreDto.getStrModalidad());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesManejoFaunaSilvestreDto.getStrTitular()) != null) {
				criteria.andStrTitularEqualTo(temConcesionesForestalesManejoFaunaSilvestreDto.getStrTitular());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesManejoFaunaSilvestreDto.getStrContrato()) != null) {
				criteria.andStrContratoEqualTo(temConcesionesForestalesManejoFaunaSilvestreDto.getStrContrato());
			}
			if(CadenaUtil.getDoubNull(temConcesionesForestalesManejoFaunaSilvestreDto.getDblAreaAprob()) != null) {
				criteria.andDblAreaAprobEqualTo(temConcesionesForestalesManejoFaunaSilvestreDto.getDblAreaAprob());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesManejoFaunaSilvestreDto.getStrRegion()) != null) {
				criteria.andStrRegionEqualTo(temConcesionesForestalesManejoFaunaSilvestreDto.getStrRegion());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesManejoFaunaSilvestreDto.getStrDocum()) != null) {
				criteria.andStrDocumEqualTo(temConcesionesForestalesManejoFaunaSilvestreDto.getStrDocum());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesManejoFaunaSilvestreDto.getStrSituacion()) != null) {
				criteria.andStrSituacionEqualTo(temConcesionesForestalesManejoFaunaSilvestreDto.getStrSituacion());
			}
			if(CadenaUtil.getDoubNull(temConcesionesForestalesManejoFaunaSilvestreDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(temConcesionesForestalesManejoFaunaSilvestreDto.getDblAreaSig());
			}
		}
		
		temConcesionesForestalesManejoFaunaSilvestreParamDef.setOrderByClause("de_titular,de_contrato");
		List<TemConcesionesForestalesManejoFaunaSilvestre>	 list	= temConcesionesForestalesManejoFaunaSilvestreMapper.selectByDefaultParameterCombo(temConcesionesForestalesManejoFaunaSilvestreParamDef);
		return list;
	}
	
	public TemConcesionesForestalesManejoFaunaSilvestre buscarById(TemConcesionesForestalesManejoFaunaSilvestreDto temConcesionesForestalesManejoFaunaSilvestreDto) throws Exception {
		TemConcesionesForestalesManejoFaunaSilvestre temConcesionesForestalesManejoFaunaSilvestre		= new TemConcesionesForestalesManejoFaunaSilvestre();
		BeanUtils.copyProperties(temConcesionesForestalesManejoFaunaSilvestreDto, temConcesionesForestalesManejoFaunaSilvestre);
		return temConcesionesForestalesManejoFaunaSilvestreMapper.selectByPrimaryKey(temConcesionesForestalesManejoFaunaSilvestre);
	}
	
	public TemConcesionesForestalesManejoFaunaSilvestre buscarGeometryById(TemConcesionesForestalesManejoFaunaSilvestreDto temConcesionesForestalesManejoFaunaSilvestreDto) throws Exception {
		TemConcesionesForestalesManejoFaunaSilvestre temConcesionesForestalesManejoFaunaSilvestre		= new TemConcesionesForestalesManejoFaunaSilvestre();
		BeanUtils.copyProperties(temConcesionesForestalesManejoFaunaSilvestreDto, temConcesionesForestalesManejoFaunaSilvestre);
		return temConcesionesForestalesManejoFaunaSilvestreMapper.selectByPrimaryKeyGeometry(temConcesionesForestalesManejoFaunaSilvestre);
	}
	
	@Transactional
	public Integer guardar(TemConcesionesForestalesManejoFaunaSilvestreDto temConcesionesForestalesManejoFaunaSilvestreDto) throws Exception {
		TemConcesionesForestalesManejoFaunaSilvestre temConcesionesForestalesManejoFaunaSilvestre		= new TemConcesionesForestalesManejoFaunaSilvestre();
		BeanUtils.copyProperties(temConcesionesForestalesManejoFaunaSilvestreDto, temConcesionesForestalesManejoFaunaSilvestre);
		int rs	= 0;
		TemConcesionesForestalesManejoFaunaSilvestre exiteTemConcesionesForestalesManejoFaunaSilvestre		= temConcesionesForestalesManejoFaunaSilvestreMapper.selectByPrimaryKey(temConcesionesForestalesManejoFaunaSilvestre);
		if(exiteTemConcesionesForestalesManejoFaunaSilvestre != null) {
			rs	= temConcesionesForestalesManejoFaunaSilvestreMapper.updateByPrimaryKeySelective(temConcesionesForestalesManejoFaunaSilvestre);
		} else {
			rs	= temConcesionesForestalesManejoFaunaSilvestreMapper.insertSelective(temConcesionesForestalesManejoFaunaSilvestre);
			
			Integer srlGid	= temConcesionesForestalesManejoFaunaSilvestreMapper.lastSequence();
			temConcesionesForestalesManejoFaunaSilvestreDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemConcesionesForestalesManejoFaunaSilvestreDto temConcesionesForestalesManejoFaunaSilvestreDto) throws Exception {
		TemConcesionesForestalesManejoFaunaSilvestre temConcesionesForestalesManejoFaunaSilvestre		= new TemConcesionesForestalesManejoFaunaSilvestre();
		BeanUtils.copyProperties(temConcesionesForestalesManejoFaunaSilvestreDto, temConcesionesForestalesManejoFaunaSilvestre);
		Integer rs	= temConcesionesForestalesManejoFaunaSilvestreMapper.deleteByPrimaryKey(temConcesionesForestalesManejoFaunaSilvestre);
		return rs;
	}
	
}
