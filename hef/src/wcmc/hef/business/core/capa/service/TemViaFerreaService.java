package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemViaFerreaDto;
import wcmc.hef.dao.capa.domain.TemViaFerrea;

@Service
public interface TemViaFerreaService {
	
	public List<TemViaFerrea> buscar(TemViaFerreaDto temViaFerreaDto) throws Exception;
	public TemViaFerrea buscarById(TemViaFerreaDto temViaFerreaDto) throws Exception;
	public Integer guardar(TemViaFerreaDto temViaFerreaDto) throws Exception;
	public Integer eliminar(TemViaFerreaDto temViaFerreaDto) throws Exception;
	
}
