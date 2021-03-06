package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.BasViasRedVialVecinalDto;
import wcmc.hef.dao.capa.domain.BasViasRedVialVecinal;

@Service
public interface BasViasRedVialVecinalService {
	
	public List<BasViasRedVialVecinal> buscar(BasViasRedVialVecinalDto basViasRedVialVecinalDto) throws Exception;
	public List<BasViasRedVialVecinal> buscarGeometry(BasViasRedVialVecinalDto basViasRedVialVecinalDto) throws Exception;
	public List<BasViasRedVialVecinal> buscarCombo(BasViasRedVialVecinalDto basViasRedVialVecinalDto) throws Exception;
	public BasViasRedVialVecinal buscarById(BasViasRedVialVecinalDto basViasRedVialVecinalDto) throws Exception;
	public BasViasRedVialVecinal buscarGeometryById(BasViasRedVialVecinalDto basViasRedVialVecinalDto) throws Exception;
	public Integer guardar(BasViasRedVialVecinalDto basViasRedVialVecinalDto) throws Exception;
	public Integer eliminar(BasViasRedVialVecinalDto basViasRedVialVecinalDto) throws Exception;
	
}
