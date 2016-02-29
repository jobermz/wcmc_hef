package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemSoeconPrediosRuralesDto;
import wcmc.hef.dao.capa.domain.TemSoeconPrediosRurales;

@Service
public interface TemSoeconPrediosRuralesService {
	
	public List<TemSoeconPrediosRurales> buscar(TemSoeconPrediosRuralesDto temSoeconPrediosRuralesDto) throws Exception;
	public TemSoeconPrediosRurales buscarById(TemSoeconPrediosRuralesDto temSoeconPrediosRuralesDto) throws Exception;
	public Integer guardar(TemSoeconPrediosRuralesDto temSoeconPrediosRuralesDto) throws Exception;
	public Integer eliminar(TemSoeconPrediosRuralesDto temSoeconPrediosRuralesDto) throws Exception;
	
}
