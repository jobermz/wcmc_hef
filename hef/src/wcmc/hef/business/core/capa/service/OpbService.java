package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.OpbDto;
import wcmc.hef.dao.capa.domain.Opb;

@Service
public interface OpbService {
	
	public List<Opb> buscar(OpbDto opbDto) throws Exception;
	public Opb buscarById(OpbDto opbDto) throws Exception;
	public Integer guardar(OpbDto opbDto) throws Exception;
	public Integer eliminar(OpbDto opbDto) throws Exception;
	
}
