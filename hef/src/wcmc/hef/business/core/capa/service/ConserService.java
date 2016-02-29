package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.ConserDto;
import wcmc.hef.dao.capa.domain.Conser;

@Service
public interface ConserService {
	
	public List<Conser> buscar(ConserDto conserDto) throws Exception;
	public Conser buscarById(ConserDto conserDto) throws Exception;
	public Integer guardar(ConserDto conserDto) throws Exception;
	public Integer eliminar(ConserDto conserDto) throws Exception;
	
}
