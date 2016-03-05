package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemCarbonoEcozonasDto;
import wcmc.hef.dao.capa.domain.TemCarbonoEcozonas;

@Service
public interface TemCarbonoEcozonasService {
	
	public List<TemCarbonoEcozonas> buscar(TemCarbonoEcozonasDto temCarbonoEcozonasDto) throws Exception;
	public TemCarbonoEcozonas buscarById(TemCarbonoEcozonasDto temCarbonoEcozonasDto) throws Exception;
	public Integer guardar(TemCarbonoEcozonasDto temCarbonoEcozonasDto) throws Exception;
	public Integer eliminar(TemCarbonoEcozonasDto temCarbonoEcozonasDto) throws Exception;
	
}
