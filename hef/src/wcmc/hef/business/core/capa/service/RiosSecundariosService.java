package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.RiosSecundariosDto;
import wcmc.hef.dao.capa.domain.RiosSecundarios;

@Service
public interface RiosSecundariosService {
	
	public List<RiosSecundarios> buscar(RiosSecundariosDto riosSecundariosDto) throws Exception;
	public RiosSecundarios buscarById(RiosSecundariosDto riosSecundariosDto) throws Exception;
	public Integer guardar(RiosSecundariosDto riosSecundariosDto) throws Exception;
	public Integer eliminar(RiosSecundariosDto riosSecundariosDto) throws Exception;
	
}
