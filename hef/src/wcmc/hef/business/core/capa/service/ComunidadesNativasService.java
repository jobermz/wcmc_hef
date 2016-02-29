package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.ComunidadesNativasDto;
import wcmc.hef.dao.capa.domain.ComunidadesNativas;

@Service
public interface ComunidadesNativasService {
	
	public List<ComunidadesNativas> buscar(ComunidadesNativasDto comunidadesNativasDto) throws Exception;
	public ComunidadesNativas buscarById(ComunidadesNativasDto comunidadesNativasDto) throws Exception;
	public Integer guardar(ComunidadesNativasDto comunidadesNativasDto) throws Exception;
	public Integer eliminar(ComunidadesNativasDto comunidadesNativasDto) throws Exception;
	
}
