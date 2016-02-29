package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.RiosPrincipalesDto;
import wcmc.hef.dao.capa.domain.RiosPrincipales;

@Service
public interface RiosPrincipalesService {
	
	public List<RiosPrincipales> buscar(RiosPrincipalesDto riosPrincipalesDto) throws Exception;
	public RiosPrincipales buscarById(RiosPrincipalesDto riosPrincipalesDto) throws Exception;
	public Integer guardar(RiosPrincipalesDto riosPrincipalesDto) throws Exception;
	public Integer eliminar(RiosPrincipalesDto riosPrincipalesDto) throws Exception;
	
}
