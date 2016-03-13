package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemConcesionesForestalesManejoFaunaSilvestreDto;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesManejoFaunaSilvestre;

@Service
public interface TemConcesionesForestalesManejoFaunaSilvestreService {
	
	public List<TemConcesionesForestalesManejoFaunaSilvestre> buscar(TemConcesionesForestalesManejoFaunaSilvestreDto temConcesionesForestalesManejoFaunaSilvestreDto) throws Exception;
	public List<TemConcesionesForestalesManejoFaunaSilvestre> buscarGeometry(TemConcesionesForestalesManejoFaunaSilvestreDto temConcesionesForestalesManejoFaunaSilvestreDto) throws Exception;
	public List<TemConcesionesForestalesManejoFaunaSilvestre> buscarCombo(TemConcesionesForestalesManejoFaunaSilvestreDto temConcesionesForestalesManejoFaunaSilvestreDto) throws Exception;
	public TemConcesionesForestalesManejoFaunaSilvestre buscarById(TemConcesionesForestalesManejoFaunaSilvestreDto temConcesionesForestalesManejoFaunaSilvestreDto) throws Exception;
	public TemConcesionesForestalesManejoFaunaSilvestre buscarGeometryById(TemConcesionesForestalesManejoFaunaSilvestreDto temConcesionesForestalesManejoFaunaSilvestreDto) throws Exception;
	public Integer guardar(TemConcesionesForestalesManejoFaunaSilvestreDto temConcesionesForestalesManejoFaunaSilvestreDto) throws Exception;
	public Integer eliminar(TemConcesionesForestalesManejoFaunaSilvestreDto temConcesionesForestalesManejoFaunaSilvestreDto) throws Exception;
	
}