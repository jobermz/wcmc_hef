package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesManejoFaunaSilvestre;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesManejoFaunaSilvestreKey;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesManejoFaunaSilvestreParamDef;

@Service
public interface TemConcesionesForestalesManejoFaunaSilvestreMapper {
	
	public List<TemConcesionesForestalesManejoFaunaSilvestre> selectByDefaultParameter(TemConcesionesForestalesManejoFaunaSilvestreParamDef temConcesionesForestalesManejoFaunaSilvestreParamDef);
	public List<TemConcesionesForestalesManejoFaunaSilvestre> selectByDefaultParameterGeometry(TemConcesionesForestalesManejoFaunaSilvestreParamDef temConcesionesForestalesManejoFaunaSilvestreParamDef);
	public List<TemConcesionesForestalesManejoFaunaSilvestre> selectByDefaultParameterCombo(TemConcesionesForestalesManejoFaunaSilvestreParamDef temConcesionesForestalesManejoFaunaSilvestreParamDef);
	public TemConcesionesForestalesManejoFaunaSilvestre selectByPrimaryKey(TemConcesionesForestalesManejoFaunaSilvestreKey temConcesionesForestalesManejoFaunaSilvestreKey);
	public TemConcesionesForestalesManejoFaunaSilvestre selectByPrimaryKeyGeometry(TemConcesionesForestalesManejoFaunaSilvestreKey temConcesionesForestalesManejoFaunaSilvestreKey);
	public int insertSelective(TemConcesionesForestalesManejoFaunaSilvestre temConcesionesForestalesManejoFaunaSilvestre);
	public int updateByPrimaryKeySelective(TemConcesionesForestalesManejoFaunaSilvestre temConcesionesForestalesManejoFaunaSilvestre);
	public int deleteByPrimaryKey(TemConcesionesForestalesManejoFaunaSilvestreKey temConcesionesForestalesManejoFaunaSilvestreKey);
	
	public int lastSequence();

	
}
