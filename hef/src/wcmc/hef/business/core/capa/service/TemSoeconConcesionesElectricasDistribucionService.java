package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemSoeconConcesionesElectricasDistribucionDto;
import wcmc.hef.dao.capa.domain.TemSoeconConcesionesElectricasDistribucion;

@Service
public interface TemSoeconConcesionesElectricasDistribucionService {
	
	public List<TemSoeconConcesionesElectricasDistribucion> buscar(TemSoeconConcesionesElectricasDistribucionDto temSoeconConcesionesElectricasDistribucionDto) throws Exception;
	public TemSoeconConcesionesElectricasDistribucion buscarById(TemSoeconConcesionesElectricasDistribucionDto temSoeconConcesionesElectricasDistribucionDto) throws Exception;
	public Integer guardar(TemSoeconConcesionesElectricasDistribucionDto temSoeconConcesionesElectricasDistribucionDto) throws Exception;
	public Integer eliminar(TemSoeconConcesionesElectricasDistribucionDto temSoeconConcesionesElectricasDistribucionDto) throws Exception;
	
}
