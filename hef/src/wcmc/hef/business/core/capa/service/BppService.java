package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.BppDto;
import wcmc.hef.dao.capa.domain.Bpp;

@Service
public interface BppService {
	
	public List<Bpp> buscar(BppDto bppDto) throws Exception;
	public Bpp buscarById(BppDto bppDto) throws Exception;
	public Integer guardar(BppDto bppDto) throws Exception;
	public Integer eliminar(BppDto bppDto) throws Exception;
	
}
