package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.ConcursoDto;
import wcmc.hef.dao.capa.domain.Concurso;

@Service
public interface ConcursoService {
	
	public List<Concurso> buscar(ConcursoDto concursoDto) throws Exception;
	public Concurso buscarById(ConcursoDto concursoDto) throws Exception;
	public Integer guardar(ConcursoDto concursoDto) throws Exception;
	public Integer eliminar(ConcursoDto concursoDto) throws Exception;
	
}
