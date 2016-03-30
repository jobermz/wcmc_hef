package wcmc.hef.business.core.configuracion.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import wcmc.hef.business.core.configuracion.dto.CapaUmbralDto;
import wcmc.hef.dao.configuracion.domain.CapaUmbral;

@Service
public interface CapaUmbralService {
	
	public List<CapaUmbral> buscar(CapaUmbralDto capaUmbralDto) throws Exception;
	public CapaUmbral buscarById(CapaUmbralDto capaUmbralDto) throws Exception;
	public Integer guardar(CapaUmbralDto capaUmbralDto) throws Exception;
	public Integer eliminar(CapaUmbralDto capaUmbralDto) throws Exception;
	public Map<String, Double> selectCapaUmbralMinMax(Integer value) throws Exception;
	
}
