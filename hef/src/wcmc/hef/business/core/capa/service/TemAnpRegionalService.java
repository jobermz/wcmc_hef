package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemAnpRegionalDto;
import wcmc.hef.dao.capa.domain.TemAnpRegional;

@Service
public interface TemAnpRegionalService {
	
	public List<TemAnpRegional> buscar(TemAnpRegionalDto temAnpRegionalDto) throws Exception;
	public List<TemAnpRegional> buscarGeometry(TemAnpRegionalDto temAnpRegionalDto) throws Exception;
	public TemAnpRegional buscarById(TemAnpRegionalDto temAnpRegionalDto) throws Exception;
	public Integer guardar(TemAnpRegionalDto temAnpRegionalDto) throws Exception;
	public Integer eliminar(TemAnpRegionalDto temAnpRegionalDto) throws Exception;
	
}
