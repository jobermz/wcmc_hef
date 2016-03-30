package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemCostoOportunidadDeforestacionDto;
import wcmc.hef.business.core.capa.service.TemCostoOportunidadDeforestacionService;
import wcmc.hef.dao.capa.domain.TemCostoOportunidadDeforestacion;
import wcmc.hef.dao.capa.domain.TemCostoOportunidadDeforestacionParamDef;
import wcmc.hef.dao.capa.domain.TemCostoOportunidadDeforestacionParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemCostoOportunidadDeforestacionMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemCostoOportunidadDeforestacionServiceImpl implements TemCostoOportunidadDeforestacionService {
	@Autowired
	private TemCostoOportunidadDeforestacionMapper temCostoOportunidadDeforestacionMapper;
	public List<TemCostoOportunidadDeforestacion> buscar(TemCostoOportunidadDeforestacionDto temCostoOportunidadDeforestacionDto) throws Exception {
		TemCostoOportunidadDeforestacionParamDef temCostoOportunidadDeforestacionParamDef		= new TemCostoOportunidadDeforestacionParamDef();
		
		Criteria criteria		= temCostoOportunidadDeforestacionParamDef.createCriteria();
		if(temCostoOportunidadDeforestacionDto != null) {
			if(CadenaUtil.getStrNull(temCostoOportunidadDeforestacionDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temCostoOportunidadDeforestacionDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temCostoOportunidadDeforestacionDto.getStrNombdist()) != null) {
				criteria.andStrNombdistEqualTo(temCostoOportunidadDeforestacionDto.getStrNombdist());
			}
			if(CadenaUtil.getDoubNull(temCostoOportunidadDeforestacionDto.getDblCopTco2H()) != null) {
				criteria.andDblCopTco2HEqualTo(temCostoOportunidadDeforestacionDto.getDblCopTco2H());
			}
			temCostoOportunidadDeforestacionParamDef.setStrHashConsulta(temCostoOportunidadDeforestacionDto.getStrHashConsulta());
		}
		
		temCostoOportunidadDeforestacionParamDef.setOrderByClause("ha_cop_tco2_h");
		List<TemCostoOportunidadDeforestacion>	 list	= temCostoOportunidadDeforestacionMapper.selectByDefaultParameter(temCostoOportunidadDeforestacionParamDef);
		return list;
	}
	
	public List<TemCostoOportunidadDeforestacion> buscarGeometry(TemCostoOportunidadDeforestacionDto temCostoOportunidadDeforestacionDto) throws Exception {
		TemCostoOportunidadDeforestacionParamDef temCostoOportunidadDeforestacionParamDef		= new TemCostoOportunidadDeforestacionParamDef();
		
		Criteria criteria		= temCostoOportunidadDeforestacionParamDef.createCriteria();
		if(temCostoOportunidadDeforestacionDto != null) {
			if(CadenaUtil.getStrNull(temCostoOportunidadDeforestacionDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temCostoOportunidadDeforestacionDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temCostoOportunidadDeforestacionDto.getStrNombdist()) != null) {
				criteria.andStrNombdistEqualTo(temCostoOportunidadDeforestacionDto.getStrNombdist());
			}
			if(CadenaUtil.getDoubNull(temCostoOportunidadDeforestacionDto.getDblCopTco2H()) != null) {
				criteria.andDblCopTco2HEqualTo(temCostoOportunidadDeforestacionDto.getDblCopTco2H());
			}
		}
		
		temCostoOportunidadDeforestacionParamDef.setOrderByClause("ha_cop_tco2_h");
		List<TemCostoOportunidadDeforestacion>	 list	= temCostoOportunidadDeforestacionMapper.selectByDefaultParameterGeometry(temCostoOportunidadDeforestacionParamDef);
		return list;
	}
	
	public List<TemCostoOportunidadDeforestacion> buscarCombo(TemCostoOportunidadDeforestacionDto temCostoOportunidadDeforestacionDto) throws Exception {
		TemCostoOportunidadDeforestacionParamDef temCostoOportunidadDeforestacionParamDef		= new TemCostoOportunidadDeforestacionParamDef();
		
		Criteria criteria		= temCostoOportunidadDeforestacionParamDef.createCriteria();
		if(temCostoOportunidadDeforestacionDto != null) {
			if(CadenaUtil.getStrNull(temCostoOportunidadDeforestacionDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temCostoOportunidadDeforestacionDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temCostoOportunidadDeforestacionDto.getStrNombdist()) != null) {
				criteria.andStrNombdistEqualTo(temCostoOportunidadDeforestacionDto.getStrNombdist());
			}
			if(CadenaUtil.getDoubNull(temCostoOportunidadDeforestacionDto.getDblCopTco2H()) != null) {
				criteria.andDblCopTco2HEqualTo(temCostoOportunidadDeforestacionDto.getDblCopTco2H());
			}
		}
		
		temCostoOportunidadDeforestacionParamDef.setOrderByClause("ha_cop_tco2_h");
		List<TemCostoOportunidadDeforestacion>	 list	= temCostoOportunidadDeforestacionMapper.selectByDefaultParameterCombo(temCostoOportunidadDeforestacionParamDef);
		return list;
	}
	
	public TemCostoOportunidadDeforestacion buscarById(TemCostoOportunidadDeforestacionDto temCostoOportunidadDeforestacionDto) throws Exception {
		TemCostoOportunidadDeforestacion temCostoOportunidadDeforestacion		= new TemCostoOportunidadDeforestacion();
		BeanUtils.copyProperties(temCostoOportunidadDeforestacionDto, temCostoOportunidadDeforestacion);
		return temCostoOportunidadDeforestacionMapper.selectByPrimaryKey(temCostoOportunidadDeforestacion);
	}
	
	public TemCostoOportunidadDeforestacion buscarGeometryById(TemCostoOportunidadDeforestacionDto temCostoOportunidadDeforestacionDto) throws Exception {
		TemCostoOportunidadDeforestacion temCostoOportunidadDeforestacion		= new TemCostoOportunidadDeforestacion();
		BeanUtils.copyProperties(temCostoOportunidadDeforestacionDto, temCostoOportunidadDeforestacion);
		return temCostoOportunidadDeforestacionMapper.selectByPrimaryKeyGeometry(temCostoOportunidadDeforestacion);
	}
	
	@Transactional
	public Integer guardar(TemCostoOportunidadDeforestacionDto temCostoOportunidadDeforestacionDto) throws Exception {
		TemCostoOportunidadDeforestacion temCostoOportunidadDeforestacion		= new TemCostoOportunidadDeforestacion();
		BeanUtils.copyProperties(temCostoOportunidadDeforestacionDto, temCostoOportunidadDeforestacion);
		int rs	= 0;
		TemCostoOportunidadDeforestacion exiteTemCostoOportunidadDeforestacion		= temCostoOportunidadDeforestacionMapper.selectByPrimaryKey(temCostoOportunidadDeforestacion);
		if(exiteTemCostoOportunidadDeforestacion != null) {
			rs	= temCostoOportunidadDeforestacionMapper.updateByPrimaryKeySelective(temCostoOportunidadDeforestacion);
		} else {
			rs	= temCostoOportunidadDeforestacionMapper.insertSelective(temCostoOportunidadDeforestacion);
			
			Integer srlGid	= temCostoOportunidadDeforestacionMapper.lastSequence();
			temCostoOportunidadDeforestacionDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemCostoOportunidadDeforestacionDto temCostoOportunidadDeforestacionDto) throws Exception {
		TemCostoOportunidadDeforestacion temCostoOportunidadDeforestacion		= new TemCostoOportunidadDeforestacion();
		BeanUtils.copyProperties(temCostoOportunidadDeforestacionDto, temCostoOportunidadDeforestacion);
		Integer rs	= temCostoOportunidadDeforestacionMapper.deleteByPrimaryKey(temCostoOportunidadDeforestacion);
		return rs;
	}
	
}
