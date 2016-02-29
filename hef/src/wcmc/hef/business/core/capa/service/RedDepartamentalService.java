package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.RedDepartamentalDto;
import wcmc.hef.dao.capa.domain.RedDepartamental;

@Service
public interface RedDepartamentalService {
	
	public List<RedDepartamental> buscar(RedDepartamentalDto redDepartamentalDto) throws Exception;
	public RedDepartamental buscarById(RedDepartamentalDto redDepartamentalDto) throws Exception;
	public Integer guardar(RedDepartamentalDto redDepartamentalDto) throws Exception;
	public Integer eliminar(RedDepartamentalDto redDepartamentalDto) throws Exception;
	
}
