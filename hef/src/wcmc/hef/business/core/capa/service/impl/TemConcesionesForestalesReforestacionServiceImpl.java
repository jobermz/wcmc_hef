package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemConcesionesForestalesReforestacionDto;
import wcmc.hef.business.core.capa.service.TemConcesionesForestalesReforestacionService;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesReforestacion;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesReforestacionParamDef;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesReforestacionParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemConcesionesForestalesReforestacionMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemConcesionesForestalesReforestacionServiceImpl implements TemConcesionesForestalesReforestacionService {
	@Autowired
	private TemConcesionesForestalesReforestacionMapper temConcesionesForestalesReforestacionMapper;
	public List<TemConcesionesForestalesReforestacion> buscar(TemConcesionesForestalesReforestacionDto temConcesionesForestalesReforestacionDto) throws Exception {
		TemConcesionesForestalesReforestacionParamDef temConcesionesForestalesReforestacionParamDef		= new TemConcesionesForestalesReforestacionParamDef();
		
		Criteria criteria		= temConcesionesForestalesReforestacionParamDef.createCriteria();
		if(temConcesionesForestalesReforestacionDto != null) {
			if(CadenaUtil.getStrNull(temConcesionesForestalesReforestacionDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temConcesionesForestalesReforestacionDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesReforestacionDto.getStrA¥o()) != null) {
				criteria.andStrA¥oLike(temConcesionesForestalesReforestacionDto.getStrA¥o());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesReforestacionDto.getStrModalidad()) != null) {
				criteria.andStrModalidadLike(temConcesionesForestalesReforestacionDto.getStrModalidad());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesReforestacionDto.getStrContrato()) != null) {
				criteria.andStrContratoLike(temConcesionesForestalesReforestacionDto.getStrContrato());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesReforestacionDto.getStrRegion()) != null) {
				criteria.andStrRegionLike(temConcesionesForestalesReforestacionDto.getStrRegion());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesReforestacionDto.getStrFuente()) != null) {
				criteria.andStrFuenteLike(temConcesionesForestalesReforestacionDto.getStrFuente());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesReforestacionDto.getStrSituacion()) != null) {
				criteria.andStrSituacionLike(temConcesionesForestalesReforestacionDto.getStrSituacion());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesReforestacionDto.getStrTitular()) != null) {
				criteria.andStrTitularLike(temConcesionesForestalesReforestacionDto.getStrTitular());
			}
			if(CadenaUtil.getDoubNull(temConcesionesForestalesReforestacionDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(temConcesionesForestalesReforestacionDto.getDblAreaSig());
			}
		}
		
		List<TemConcesionesForestalesReforestacion>	 list	= temConcesionesForestalesReforestacionMapper.selectByDefaultParameter(temConcesionesForestalesReforestacionParamDef);
		return list;
	}
	
	public TemConcesionesForestalesReforestacion buscarById(TemConcesionesForestalesReforestacionDto temConcesionesForestalesReforestacionDto) throws Exception {
		TemConcesionesForestalesReforestacion temConcesionesForestalesReforestacion		= new TemConcesionesForestalesReforestacion();
		BeanUtils.copyProperties(temConcesionesForestalesReforestacionDto, temConcesionesForestalesReforestacion);
		return temConcesionesForestalesReforestacionMapper.selectByPrimaryKey(temConcesionesForestalesReforestacion);
	}
	
	@Transactional
	public Integer guardar(TemConcesionesForestalesReforestacionDto temConcesionesForestalesReforestacionDto) throws Exception {
		TemConcesionesForestalesReforestacion temConcesionesForestalesReforestacion		= new TemConcesionesForestalesReforestacion();
		BeanUtils.copyProperties(temConcesionesForestalesReforestacionDto, temConcesionesForestalesReforestacion);
		int rs	= 0;
		TemConcesionesForestalesReforestacion exiteTemConcesionesForestalesReforestacion		= temConcesionesForestalesReforestacionMapper.selectByPrimaryKey(temConcesionesForestalesReforestacion);
		if(exiteTemConcesionesForestalesReforestacion != null) {
			rs	= temConcesionesForestalesReforestacionMapper.updateByPrimaryKeySelective(temConcesionesForestalesReforestacion);
		} else {
			rs	= temConcesionesForestalesReforestacionMapper.insertSelective(temConcesionesForestalesReforestacion);
			
			Integer srlGid	= temConcesionesForestalesReforestacionMapper.lastSequence();
			temConcesionesForestalesReforestacionDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemConcesionesForestalesReforestacionDto temConcesionesForestalesReforestacionDto) throws Exception {
		TemConcesionesForestalesReforestacion temConcesionesForestalesReforestacion		= new TemConcesionesForestalesReforestacion();
		BeanUtils.copyProperties(temConcesionesForestalesReforestacionDto, temConcesionesForestalesReforestacion);
		Integer rs	= temConcesionesForestalesReforestacionMapper.deleteByPrimaryKey(temConcesionesForestalesReforestacion);
		return rs;
	}
	
}
