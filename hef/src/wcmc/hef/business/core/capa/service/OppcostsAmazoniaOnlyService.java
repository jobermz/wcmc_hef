package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.OppcostsAmazoniaOnlyDto;
import wcmc.hef.dao.capa.domain.OppcostsAmazoniaOnly;

@Service
public interface OppcostsAmazoniaOnlyService {
	
	public List<OppcostsAmazoniaOnly> buscar(OppcostsAmazoniaOnlyDto oppcostsAmazoniaOnlyDto) throws Exception;
	public OppcostsAmazoniaOnly buscarById(OppcostsAmazoniaOnlyDto oppcostsAmazoniaOnlyDto) throws Exception;
	public Integer guardar(OppcostsAmazoniaOnlyDto oppcostsAmazoniaOnlyDto) throws Exception;
	public Integer eliminar(OppcostsAmazoniaOnlyDto oppcostsAmazoniaOnlyDto) throws Exception;
	
}
