package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.AnpRegionalDto;
import wcmc.hef.dao.capa.domain.AnpRegional;

@Service
public interface AnpRegionalService {
	
	public List<AnpRegional> buscar(AnpRegionalDto anpRegionalDto) throws Exception;
	public AnpRegional buscarById(AnpRegionalDto anpRegionalDto) throws Exception;
	public Integer guardar(AnpRegionalDto anpRegionalDto) throws Exception;
	public Integer eliminar(AnpRegionalDto anpRegionalDto) throws Exception;
	
}
