package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.AdecuacionDto;
import wcmc.hef.dao.capa.domain.Adecuacion;

@Service
public interface AdecuacionService {
	
	public List<Adecuacion> buscar(AdecuacionDto adecuacionDto) throws Exception;
	public Adecuacion buscarById(AdecuacionDto adecuacionDto) throws Exception;
	public Integer guardar(AdecuacionDto adecuacionDto) throws Exception;
	public Integer eliminar(AdecuacionDto adecuacionDto) throws Exception;
	
}
