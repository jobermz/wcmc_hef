package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.AnpNacionalDto;
import wcmc.hef.dao.capa.domain.AnpNacional;

@Service
public interface AnpNacionalService {
	
	public List<AnpNacional> buscar(AnpNacionalDto anpNacionalDto) throws Exception;
	public AnpNacional buscarById(AnpNacionalDto anpNacionalDto) throws Exception;
	public Integer guardar(AnpNacionalDto anpNacionalDto) throws Exception;
	public Integer eliminar(AnpNacionalDto anpNacionalDto) throws Exception;
	
}
