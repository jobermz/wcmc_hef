package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemConcesionesForestalesReforestacionDto;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesReforestacion;

@Service
public interface TemConcesionesForestalesReforestacionService {
	
	public List<TemConcesionesForestalesReforestacion> buscar(TemConcesionesForestalesReforestacionDto temConcesionesForestalesReforestacionDto) throws Exception;
	public List<TemConcesionesForestalesReforestacion> buscarGeometry(TemConcesionesForestalesReforestacionDto temConcesionesForestalesReforestacionDto) throws Exception;
	public TemConcesionesForestalesReforestacion buscarById(TemConcesionesForestalesReforestacionDto temConcesionesForestalesReforestacionDto) throws Exception;
	public Integer guardar(TemConcesionesForestalesReforestacionDto temConcesionesForestalesReforestacionDto) throws Exception;
	public Integer eliminar(TemConcesionesForestalesReforestacionDto temConcesionesForestalesReforestacionDto) throws Exception;
	
}
