package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemConcesionesMinerasDto;
import wcmc.hef.dao.capa.domain.TemConcesionesMineras;

@Service
public interface TemConcesionesMinerasService {
	
	public List<TemConcesionesMineras> buscar(TemConcesionesMinerasDto temConcesionesMinerasDto) throws Exception;
	public TemConcesionesMineras buscarById(TemConcesionesMinerasDto temConcesionesMinerasDto) throws Exception;
	public Integer guardar(TemConcesionesMinerasDto temConcesionesMinerasDto) throws Exception;
	public Integer eliminar(TemConcesionesMinerasDto temConcesionesMinerasDto) throws Exception;
	
}
