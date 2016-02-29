package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.ConcesionesMinerasDto;
import wcmc.hef.dao.capa.domain.ConcesionesMineras;

@Service
public interface ConcesionesMinerasService {
	
	public List<ConcesionesMineras> buscar(ConcesionesMinerasDto concesionesMinerasDto) throws Exception;
	public ConcesionesMineras buscarById(ConcesionesMinerasDto concesionesMinerasDto) throws Exception;
	public Integer guardar(ConcesionesMinerasDto concesionesMinerasDto) throws Exception;
	public Integer eliminar(ConcesionesMinerasDto concesionesMinerasDto) throws Exception;
	
}
