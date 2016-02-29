package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.KbaIbaPeruDto;
import wcmc.hef.dao.capa.domain.KbaIbaPeru;

@Service
public interface KbaIbaPeruService {
	
	public List<KbaIbaPeru> buscar(KbaIbaPeruDto kbaIbaPeruDto) throws Exception;
	public KbaIbaPeru buscarById(KbaIbaPeruDto kbaIbaPeruDto) throws Exception;
	public Integer guardar(KbaIbaPeruDto kbaIbaPeruDto) throws Exception;
	public Integer eliminar(KbaIbaPeruDto kbaIbaPeruDto) throws Exception;
	
}
