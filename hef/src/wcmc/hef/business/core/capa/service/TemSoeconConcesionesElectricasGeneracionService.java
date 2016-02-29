package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemSoeconConcesionesElectricasGeneracionDto;
import wcmc.hef.dao.capa.domain.TemSoeconConcesionesElectricasGeneracion;

@Service
public interface TemSoeconConcesionesElectricasGeneracionService {
	
	public List<TemSoeconConcesionesElectricasGeneracion> buscar(TemSoeconConcesionesElectricasGeneracionDto temSoeconConcesionesElectricasGeneracionDto) throws Exception;
	public TemSoeconConcesionesElectricasGeneracion buscarById(TemSoeconConcesionesElectricasGeneracionDto temSoeconConcesionesElectricasGeneracionDto) throws Exception;
	public Integer guardar(TemSoeconConcesionesElectricasGeneracionDto temSoeconConcesionesElectricasGeneracionDto) throws Exception;
	public Integer eliminar(TemSoeconConcesionesElectricasGeneracionDto temSoeconConcesionesElectricasGeneracionDto) throws Exception;
	
}
