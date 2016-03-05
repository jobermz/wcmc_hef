package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.BasLimAmazoniaDto;
import wcmc.hef.dao.capa.domain.BasLimAmazonia;

@Service
public interface BasLimAmazoniaService {
	
	public List<BasLimAmazonia> buscar(BasLimAmazoniaDto basLimAmazoniaDto) throws Exception;
	public BasLimAmazonia buscarById(BasLimAmazoniaDto basLimAmazoniaDto) throws Exception;
	public Integer guardar(BasLimAmazoniaDto basLimAmazoniaDto) throws Exception;
	public Integer eliminar(BasLimAmazoniaDto basLimAmazoniaDto) throws Exception;
	
}
