package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.BasHidroRios100000Dto;
import wcmc.hef.dao.capa.domain.BasHidroRios100000;

@Service
public interface BasHidroRios100000Service {
	
	public List<BasHidroRios100000> buscar(BasHidroRios100000Dto basHidroRios100000Dto) throws Exception;
	public List<BasHidroRios100000> buscarGeometry(BasHidroRios100000Dto basHidroRios100000Dto) throws Exception;
	public BasHidroRios100000 buscarById(BasHidroRios100000Dto basHidroRios100000Dto) throws Exception;
	public Integer guardar(BasHidroRios100000Dto basHidroRios100000Dto) throws Exception;
	public Integer eliminar(BasHidroRios100000Dto basHidroRios100000Dto) throws Exception;
	
}
