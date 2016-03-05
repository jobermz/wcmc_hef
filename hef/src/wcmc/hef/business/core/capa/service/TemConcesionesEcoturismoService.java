package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemConcesionesEcoturismoDto;
import wcmc.hef.dao.capa.domain.TemConcesionesEcoturismo;

@Service
public interface TemConcesionesEcoturismoService {
	
	public List<TemConcesionesEcoturismo> buscar(TemConcesionesEcoturismoDto temConcesionesEcoturismoDto) throws Exception;
	public TemConcesionesEcoturismo buscarById(TemConcesionesEcoturismoDto temConcesionesEcoturismoDto) throws Exception;
	public Integer guardar(TemConcesionesEcoturismoDto temConcesionesEcoturismoDto) throws Exception;
	public Integer eliminar(TemConcesionesEcoturismoDto temConcesionesEcoturismoDto) throws Exception;
	
}
