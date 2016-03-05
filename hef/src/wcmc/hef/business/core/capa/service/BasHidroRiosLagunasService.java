package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.BasHidroRiosLagunasDto;
import wcmc.hef.dao.capa.domain.BasHidroRiosLagunas;

@Service
public interface BasHidroRiosLagunasService {
	
	public List<BasHidroRiosLagunas> buscar(BasHidroRiosLagunasDto basHidroRiosLagunasDto) throws Exception;
	public BasHidroRiosLagunas buscarById(BasHidroRiosLagunasDto basHidroRiosLagunasDto) throws Exception;
	public Integer guardar(BasHidroRiosLagunasDto basHidroRiosLagunasDto) throws Exception;
	public Integer eliminar(BasHidroRiosLagunasDto basHidroRiosLagunasDto) throws Exception;
	
}
