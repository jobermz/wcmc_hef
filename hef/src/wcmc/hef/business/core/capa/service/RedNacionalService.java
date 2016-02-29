package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.RedNacionalDto;
import wcmc.hef.dao.capa.domain.RedNacional;

@Service
public interface RedNacionalService {
	
	public List<RedNacional> buscar(RedNacionalDto redNacionalDto) throws Exception;
	public RedNacional buscarById(RedNacionalDto redNacionalDto) throws Exception;
	public Integer guardar(RedNacionalDto redNacionalDto) throws Exception;
	public Integer eliminar(RedNacionalDto redNacionalDto) throws Exception;
	
}
