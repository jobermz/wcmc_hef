package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.BasViasRedVialDepartamentalDto;
import wcmc.hef.dao.capa.domain.BasViasRedVialDepartamental;

@Service
public interface BasViasRedVialDepartamentalService {
	
	public List<BasViasRedVialDepartamental> buscar(BasViasRedVialDepartamentalDto basViasRedVialDepartamentalDto) throws Exception;
	public BasViasRedVialDepartamental buscarById(BasViasRedVialDepartamentalDto basViasRedVialDepartamentalDto) throws Exception;
	public Integer guardar(BasViasRedVialDepartamentalDto basViasRedVialDepartamentalDto) throws Exception;
	public Integer eliminar(BasViasRedVialDepartamentalDto basViasRedVialDepartamentalDto) throws Exception;
	
}
