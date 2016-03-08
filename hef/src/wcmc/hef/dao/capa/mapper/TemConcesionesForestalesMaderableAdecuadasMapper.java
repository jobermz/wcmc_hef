package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesMaderableAdecuadas;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesMaderableAdecuadasKey;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesMaderableAdecuadasParamDef;

@Service
public interface TemConcesionesForestalesMaderableAdecuadasMapper {
	
	public List<TemConcesionesForestalesMaderableAdecuadas> selectByDefaultParameter(TemConcesionesForestalesMaderableAdecuadasParamDef temConcesionesForestalesMaderableAdecuadasParamDef);
	public List<TemConcesionesForestalesMaderableAdecuadas> selectByDefaultParameterGeometry(TemConcesionesForestalesMaderableAdecuadasParamDef temConcesionesForestalesMaderableAdecuadasParamDef);
	public TemConcesionesForestalesMaderableAdecuadas selectByPrimaryKey(TemConcesionesForestalesMaderableAdecuadasKey temConcesionesForestalesMaderableAdecuadasKey);
	public int insertSelective(TemConcesionesForestalesMaderableAdecuadas temConcesionesForestalesMaderableAdecuadas);
	public int updateByPrimaryKeySelective(TemConcesionesForestalesMaderableAdecuadas temConcesionesForestalesMaderableAdecuadas);
	public int deleteByPrimaryKey(TemConcesionesForestalesMaderableAdecuadasKey temConcesionesForestalesMaderableAdecuadasKey);
	
	public int lastSequence();

	
}
