package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemConcesionesForestalesMaderableAdecuadasDto;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesMaderableAdecuadas;

@Service
public interface TemConcesionesForestalesMaderableAdecuadasService {
	
	public List<TemConcesionesForestalesMaderableAdecuadas> buscar(TemConcesionesForestalesMaderableAdecuadasDto temConcesionesForestalesMaderableAdecuadasDto) throws Exception;
	public TemConcesionesForestalesMaderableAdecuadas buscarById(TemConcesionesForestalesMaderableAdecuadasDto temConcesionesForestalesMaderableAdecuadasDto) throws Exception;
	public Integer guardar(TemConcesionesForestalesMaderableAdecuadasDto temConcesionesForestalesMaderableAdecuadasDto) throws Exception;
	public Integer eliminar(TemConcesionesForestalesMaderableAdecuadasDto temConcesionesForestalesMaderableAdecuadasDto) throws Exception;
	
}
