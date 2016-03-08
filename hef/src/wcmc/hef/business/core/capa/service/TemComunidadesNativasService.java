package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemComunidadesNativasDto;
import wcmc.hef.dao.capa.domain.TemComunidadesNativas;

@Service
public interface TemComunidadesNativasService {
	
	public List<TemComunidadesNativas> buscar(TemComunidadesNativasDto temComunidadesNativasDto) throws Exception;
	public List<TemComunidadesNativas> buscarGeometry(TemComunidadesNativasDto temComunidadesNativasDto) throws Exception;
	public TemComunidadesNativas buscarById(TemComunidadesNativasDto temComunidadesNativasDto) throws Exception;
	public Integer guardar(TemComunidadesNativasDto temComunidadesNativasDto) throws Exception;
	public Integer eliminar(TemComunidadesNativasDto temComunidadesNativasDto) throws Exception;
	
}
