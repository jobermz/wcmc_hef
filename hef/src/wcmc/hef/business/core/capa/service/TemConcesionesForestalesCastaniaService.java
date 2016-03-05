package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemConcesionesForestalesCastaniaDto;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesCastania;

@Service
public interface TemConcesionesForestalesCastaniaService {
	
	public List<TemConcesionesForestalesCastania> buscar(TemConcesionesForestalesCastaniaDto temConcesionesForestalesCastaniaDto) throws Exception;
	public TemConcesionesForestalesCastania buscarById(TemConcesionesForestalesCastaniaDto temConcesionesForestalesCastaniaDto) throws Exception;
	public Integer guardar(TemConcesionesForestalesCastaniaDto temConcesionesForestalesCastaniaDto) throws Exception;
	public Integer eliminar(TemConcesionesForestalesCastaniaDto temConcesionesForestalesCastaniaDto) throws Exception;
	
}
