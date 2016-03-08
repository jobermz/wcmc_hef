package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemConcesionesForestalesMaderableConcursoDto;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesMaderableConcurso;

@Service
public interface TemConcesionesForestalesMaderableConcursoService {
	
	public List<TemConcesionesForestalesMaderableConcurso> buscar(TemConcesionesForestalesMaderableConcursoDto temConcesionesForestalesMaderableConcursoDto) throws Exception;
	public List<TemConcesionesForestalesMaderableConcurso> buscarGeometry(TemConcesionesForestalesMaderableConcursoDto temConcesionesForestalesMaderableConcursoDto) throws Exception;
	public TemConcesionesForestalesMaderableConcurso buscarById(TemConcesionesForestalesMaderableConcursoDto temConcesionesForestalesMaderableConcursoDto) throws Exception;
	public Integer guardar(TemConcesionesForestalesMaderableConcursoDto temConcesionesForestalesMaderableConcursoDto) throws Exception;
	public Integer eliminar(TemConcesionesForestalesMaderableConcursoDto temConcesionesForestalesMaderableConcursoDto) throws Exception;
	
}
