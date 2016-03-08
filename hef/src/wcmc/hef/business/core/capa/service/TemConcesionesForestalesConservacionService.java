package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemConcesionesForestalesConservacionDto;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesConservacion;

@Service
public interface TemConcesionesForestalesConservacionService {
	
	public List<TemConcesionesForestalesConservacion> buscar(TemConcesionesForestalesConservacionDto temConcesionesForestalesConservacionDto) throws Exception;
	public List<TemConcesionesForestalesConservacion> buscarGeometry(TemConcesionesForestalesConservacionDto temConcesionesForestalesConservacionDto) throws Exception;
	public TemConcesionesForestalesConservacion buscarById(TemConcesionesForestalesConservacionDto temConcesionesForestalesConservacionDto) throws Exception;
	public Integer guardar(TemConcesionesForestalesConservacionDto temConcesionesForestalesConservacionDto) throws Exception;
	public Integer eliminar(TemConcesionesForestalesConservacionDto temConcesionesForestalesConservacionDto) throws Exception;
	
}
