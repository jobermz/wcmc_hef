package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.BasViasRedVialNacionalDto;
import wcmc.hef.dao.capa.domain.BasViasRedVialNacional;

@Service
public interface BasViasRedVialNacionalService {
	
	public List<BasViasRedVialNacional> buscar(BasViasRedVialNacionalDto basViasRedVialNacionalDto) throws Exception;
	public List<BasViasRedVialNacional> buscarGeometry(BasViasRedVialNacionalDto basViasRedVialNacionalDto) throws Exception;
	public BasViasRedVialNacional buscarById(BasViasRedVialNacionalDto basViasRedVialNacionalDto) throws Exception;
	public Integer guardar(BasViasRedVialNacionalDto basViasRedVialNacionalDto) throws Exception;
	public Integer eliminar(BasViasRedVialNacionalDto basViasRedVialNacionalDto) throws Exception;
	
}
