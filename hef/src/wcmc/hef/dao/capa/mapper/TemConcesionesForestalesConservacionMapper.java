package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesConservacion;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesConservacionKey;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesConservacionParamDef;

@Service
public interface TemConcesionesForestalesConservacionMapper {
	
	public List<TemConcesionesForestalesConservacion> selectByDefaultParameter(TemConcesionesForestalesConservacionParamDef temConcesionesForestalesConservacionParamDef);
	public TemConcesionesForestalesConservacion selectByPrimaryKey(TemConcesionesForestalesConservacionKey temConcesionesForestalesConservacionKey);
	public int insertSelective(TemConcesionesForestalesConservacion temConcesionesForestalesConservacion);
	public int updateByPrimaryKeySelective(TemConcesionesForestalesConservacion temConcesionesForestalesConservacion);
	public int deleteByPrimaryKey(TemConcesionesForestalesConservacionKey temConcesionesForestalesConservacionKey);
	
	public int lastSequence();

	
}
