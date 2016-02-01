package wcmc.hef.business.core.configuracion.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.configuracion.dto.CapasBaseDto;
import wcmc.hef.dao.configuracion.domain.CapasBase;

@Service
public interface CapasBaseService {
	
	public List<CapasBase> buscar(CapasBaseDto capasBaseDto) throws Exception;
	public CapasBase buscarById(CapasBaseDto capasBaseDto) throws Exception;
	public Integer guardar(CapasBaseDto capasBaseDto) throws Exception;
	public Integer eliminar(CapasBaseDto capasBaseDto) throws Exception;
	
}
