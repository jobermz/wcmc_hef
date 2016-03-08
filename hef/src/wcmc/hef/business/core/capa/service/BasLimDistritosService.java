package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.BasLimDistritosDto;
import wcmc.hef.dao.capa.domain.BasLimDistritos;

@Service
public interface BasLimDistritosService {
	
	public List<BasLimDistritos> buscar(BasLimDistritosDto basLimDistritosDto) throws Exception;
	public List<BasLimDistritos> buscarGeometry(BasLimDistritosDto basLimDistritosDto) throws Exception;
	public BasLimDistritos buscarById(BasLimDistritosDto basLimDistritosDto) throws Exception;
	public Integer guardar(BasLimDistritosDto basLimDistritosDto) throws Exception;
	public Integer eliminar(BasLimDistritosDto basLimDistritosDto) throws Exception;
	
}
