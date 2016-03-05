package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemViasTrochasDto;
import wcmc.hef.dao.capa.domain.TemViasTrochas;

@Service
public interface TemViasTrochasService {
	
	public List<TemViasTrochas> buscar(TemViasTrochasDto temViasTrochasDto) throws Exception;
	public TemViasTrochas buscarById(TemViasTrochasDto temViasTrochasDto) throws Exception;
	public Integer guardar(TemViasTrochasDto temViasTrochasDto) throws Exception;
	public Integer eliminar(TemViasTrochasDto temViasTrochasDto) throws Exception;
	
}
