package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.BasLimProvinciaDto;
import wcmc.hef.dao.capa.domain.BasLimProvincia;

@Service
public interface BasLimProvinciaService {
	
	public List<BasLimProvincia> buscar(BasLimProvinciaDto basLimProvinciaDto) throws Exception;
	public List<BasLimProvincia> buscarGeometry(BasLimProvinciaDto basLimProvinciaDto) throws Exception;
	public BasLimProvincia buscarById(BasLimProvinciaDto basLimProvinciaDto) throws Exception;
	public Integer guardar(BasLimProvinciaDto basLimProvinciaDto) throws Exception;
	public Integer eliminar(BasLimProvinciaDto basLimProvinciaDto) throws Exception;
	
}
