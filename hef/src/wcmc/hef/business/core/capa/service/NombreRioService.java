package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.NombreRioDto;
import wcmc.hef.dao.capa.domain.NombreRio;

@Service
public interface NombreRioService {
	
	public List<NombreRio> buscar(NombreRioDto nombreRioDto) throws Exception;
	public NombreRio buscarById(NombreRioDto nombreRioDto) throws Exception;
	public Integer guardar(NombreRioDto nombreRioDto) throws Exception;
	public Integer eliminar(NombreRioDto nombreRioDto) throws Exception;
	
}
