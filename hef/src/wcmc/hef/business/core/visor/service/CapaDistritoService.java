package wcmc.hef.business.core.visor.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.visor.dto.CapaDistritoDto;
import wcmc.hef.dao.visor.domain.CapaDistrito;

@Service
public interface CapaDistritoService {
	
	public List<CapaDistrito> buscar(CapaDistritoDto capaDistritoDto) throws Exception;
	public CapaDistrito buscarById(CapaDistritoDto capaDistritoDto) throws Exception;
	public Integer guardar(CapaDistritoDto capaDistritoDto) throws Exception;
	public Integer eliminar(CapaDistritoDto capaDistritoDto) throws Exception;
	
}
