package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemAnpPrivadaDto;
import wcmc.hef.dao.capa.domain.TemAnpPrivada;

@Service
public interface TemAnpPrivadaService {
	
	public List<TemAnpPrivada> buscar(TemAnpPrivadaDto temAnpPrivadaDto) throws Exception;
	public List<TemAnpPrivada> buscarGeometry(TemAnpPrivadaDto temAnpPrivadaDto) throws Exception;
	public TemAnpPrivada buscarById(TemAnpPrivadaDto temAnpPrivadaDto) throws Exception;
	public Integer guardar(TemAnpPrivadaDto temAnpPrivadaDto) throws Exception;
	public Integer eliminar(TemAnpPrivadaDto temAnpPrivadaDto) throws Exception;
	
}
