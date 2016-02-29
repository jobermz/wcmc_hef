package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.AnpPrivadaDto;
import wcmc.hef.dao.capa.domain.AnpPrivada;

@Service
public interface AnpPrivadaService {
	
	public List<AnpPrivada> buscar(AnpPrivadaDto anpPrivadaDto) throws Exception;
	public AnpPrivada buscarById(AnpPrivadaDto anpPrivadaDto) throws Exception;
	public Integer guardar(AnpPrivadaDto anpPrivadaDto) throws Exception;
	public Integer eliminar(AnpPrivadaDto anpPrivadaDto) throws Exception;
	
}
