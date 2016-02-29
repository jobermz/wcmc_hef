package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.Ccpp10UtmDto;
import wcmc.hef.dao.capa.domain.Ccpp10Utm;

@Service
public interface Ccpp10UtmService {
	
	public List<Ccpp10Utm> buscar(Ccpp10UtmDto ccpp10UtmDto) throws Exception;
	public Ccpp10Utm buscarById(Ccpp10UtmDto ccpp10UtmDto) throws Exception;
	public Integer guardar(Ccpp10UtmDto ccpp10UtmDto) throws Exception;
	public Integer eliminar(Ccpp10UtmDto ccpp10UtmDto) throws Exception;
	
}
