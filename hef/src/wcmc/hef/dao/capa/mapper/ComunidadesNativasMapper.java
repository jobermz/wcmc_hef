package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.ComunidadesNativas;
import wcmc.hef.dao.capa.domain.ComunidadesNativasKey;
import wcmc.hef.dao.capa.domain.ComunidadesNativasParamDef;

@Service
public interface ComunidadesNativasMapper {
	
	public List<ComunidadesNativas> selectByDefaultParameter(ComunidadesNativasParamDef comunidadesNativasParamDef);
	public ComunidadesNativas selectByPrimaryKey(ComunidadesNativasKey comunidadesNativasKey);
	public int insertSelective(ComunidadesNativas comunidadesNativas);
	public int updateByPrimaryKeySelective(ComunidadesNativas comunidadesNativas);
	public int deleteByPrimaryKey(ComunidadesNativasKey comunidadesNativasKey);
	
	public int lastSequence();

	
}
