package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.EcoturDto;
import wcmc.hef.dao.capa.domain.Ecotur;

@Service
public interface EcoturService {
	
	public List<Ecotur> buscar(EcoturDto ecoturDto) throws Exception;
	public Ecotur buscarById(EcoturDto ecoturDto) throws Exception;
	public Integer guardar(EcoturDto ecoturDto) throws Exception;
	public Integer eliminar(EcoturDto ecoturDto) throws Exception;
	
}
