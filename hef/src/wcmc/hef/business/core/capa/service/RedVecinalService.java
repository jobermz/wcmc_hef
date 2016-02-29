package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.RedVecinalDto;
import wcmc.hef.dao.capa.domain.RedVecinal;

@Service
public interface RedVecinalService {
	
	public List<RedVecinal> buscar(RedVecinalDto redVecinalDto) throws Exception;
	public RedVecinal buscarById(RedVecinalDto redVecinalDto) throws Exception;
	public Integer guardar(RedVecinalDto redVecinalDto) throws Exception;
	public Integer eliminar(RedVecinalDto redVecinalDto) throws Exception;
	
}
