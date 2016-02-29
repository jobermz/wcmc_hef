package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.Concurso;
import wcmc.hef.dao.capa.domain.ConcursoKey;
import wcmc.hef.dao.capa.domain.ConcursoParamDef;

@Service
public interface ConcursoMapper {
	
	public List<Concurso> selectByDefaultParameter(ConcursoParamDef concursoParamDef);
	public Concurso selectByPrimaryKey(ConcursoKey concursoKey);
	public int insertSelective(Concurso concurso);
	public int updateByPrimaryKeySelective(Concurso concurso);
	public int deleteByPrimaryKey(ConcursoKey concursoKey);
	
	public int lastSequence();

	
}
