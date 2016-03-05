package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemConcesionHidroelectricasDistribucionDto;
import wcmc.hef.dao.capa.domain.TemConcesionHidroelectricasDistribucion;

@Service
public interface TemConcesionHidroelectricasDistribucionService {
	
	public List<TemConcesionHidroelectricasDistribucion> buscar(TemConcesionHidroelectricasDistribucionDto temConcesionHidroelectricasDistribucionDto) throws Exception;
	public TemConcesionHidroelectricasDistribucion buscarById(TemConcesionHidroelectricasDistribucionDto temConcesionHidroelectricasDistribucionDto) throws Exception;
	public Integer guardar(TemConcesionHidroelectricasDistribucionDto temConcesionHidroelectricasDistribucionDto) throws Exception;
	public Integer eliminar(TemConcesionHidroelectricasDistribucionDto temConcesionHidroelectricasDistribucionDto) throws Exception;
	
}
