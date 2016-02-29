package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.ReforDto;
import wcmc.hef.dao.capa.domain.Refor;

@Service
public interface ReforService {
	
	public List<Refor> buscar(ReforDto reforDto) throws Exception;
	public Refor buscarById(ReforDto reforDto) throws Exception;
	public Integer guardar(ReforDto reforDto) throws Exception;
	public Integer eliminar(ReforDto reforDto) throws Exception;
	
}
