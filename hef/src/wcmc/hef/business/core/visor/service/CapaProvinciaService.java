package wcmc.hef.business.core.visor.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.visor.dto.CapaProvinciaDto;
import wcmc.hef.dao.visor.domain.CapaProvincia;

@Service
public interface CapaProvinciaService {
	
	public List<CapaProvincia> buscar(CapaProvinciaDto capaProvinciaDto) throws Exception;
	public CapaProvincia buscarById(CapaProvinciaDto capaProvinciaDto) throws Exception;
	public Integer guardar(CapaProvinciaDto capaProvinciaDto) throws Exception;
	public Integer eliminar(CapaProvinciaDto capaProvinciaDto) throws Exception;
	
}
