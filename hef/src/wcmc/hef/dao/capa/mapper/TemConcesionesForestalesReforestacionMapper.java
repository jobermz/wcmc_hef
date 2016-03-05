package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesReforestacion;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesReforestacionKey;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesReforestacionParamDef;

@Service
public interface TemConcesionesForestalesReforestacionMapper {
	
	public List<TemConcesionesForestalesReforestacion> selectByDefaultParameter(TemConcesionesForestalesReforestacionParamDef temConcesionesForestalesReforestacionParamDef);
	public TemConcesionesForestalesReforestacion selectByPrimaryKey(TemConcesionesForestalesReforestacionKey temConcesionesForestalesReforestacionKey);
	public int insertSelective(TemConcesionesForestalesReforestacion temConcesionesForestalesReforestacion);
	public int updateByPrimaryKeySelective(TemConcesionesForestalesReforestacion temConcesionesForestalesReforestacion);
	public int deleteByPrimaryKey(TemConcesionesForestalesReforestacionKey temConcesionesForestalesReforestacionKey);
	
	public int lastSequence();

	
}
