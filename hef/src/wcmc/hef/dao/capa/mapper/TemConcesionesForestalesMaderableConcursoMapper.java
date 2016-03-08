package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesMaderableConcurso;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesMaderableConcursoKey;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesMaderableConcursoParamDef;

@Service
public interface TemConcesionesForestalesMaderableConcursoMapper {
	
	public List<TemConcesionesForestalesMaderableConcurso> selectByDefaultParameter(TemConcesionesForestalesMaderableConcursoParamDef temConcesionesForestalesMaderableConcursoParamDef);
	public List<TemConcesionesForestalesMaderableConcurso> selectByDefaultParameterGeometry(TemConcesionesForestalesMaderableConcursoParamDef temConcesionesForestalesMaderableConcursoParamDef);
	public TemConcesionesForestalesMaderableConcurso selectByPrimaryKey(TemConcesionesForestalesMaderableConcursoKey temConcesionesForestalesMaderableConcursoKey);
	public int insertSelective(TemConcesionesForestalesMaderableConcurso temConcesionesForestalesMaderableConcurso);
	public int updateByPrimaryKeySelective(TemConcesionesForestalesMaderableConcurso temConcesionesForestalesMaderableConcurso);
	public int deleteByPrimaryKey(TemConcesionesForestalesMaderableConcursoKey temConcesionesForestalesMaderableConcursoKey);
	
	public int lastSequence();

	
}
