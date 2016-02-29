package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.MfaunaDto;
import wcmc.hef.dao.capa.domain.Mfauna;

@Service
public interface MfaunaService {
	
	public List<Mfauna> buscar(MfaunaDto mfaunaDto) throws Exception;
	public Mfauna buscarById(MfaunaDto mfaunaDto) throws Exception;
	public Integer guardar(MfaunaDto mfaunaDto) throws Exception;
	public Integer eliminar(MfaunaDto mfaunaDto) throws Exception;
	
}
