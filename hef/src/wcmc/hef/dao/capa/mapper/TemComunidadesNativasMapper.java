package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemComunidadesNativas;
import wcmc.hef.dao.capa.domain.TemComunidadesNativasKey;
import wcmc.hef.dao.capa.domain.TemComunidadesNativasParamDef;

@Service
public interface TemComunidadesNativasMapper {
	
	public List<TemComunidadesNativas> selectByDefaultParameter(TemComunidadesNativasParamDef temComunidadesNativasParamDef);
	public List<TemComunidadesNativas> selectByDefaultParameterGeometry(TemComunidadesNativasParamDef temComunidadesNativasParamDef);
	public List<TemComunidadesNativas> selectByDefaultParameterCombo(TemComunidadesNativasParamDef temComunidadesNativasParamDef);
	public TemComunidadesNativas selectByPrimaryKey(TemComunidadesNativasKey temComunidadesNativasKey);
	public TemComunidadesNativas selectByPrimaryKeyGeometry(TemComunidadesNativasKey temComunidadesNativasKey);
	public int insertSelective(TemComunidadesNativas temComunidadesNativas);
	public int updateByPrimaryKeySelective(TemComunidadesNativas temComunidadesNativas);
	public int deleteByPrimaryKey(TemComunidadesNativasKey temComunidadesNativasKey);
	
	public int lastSequence();

	
}
