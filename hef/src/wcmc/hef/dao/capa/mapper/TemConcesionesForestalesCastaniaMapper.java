package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesCastania;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesCastaniaKey;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesCastaniaParamDef;

@Service
public interface TemConcesionesForestalesCastaniaMapper {
	
	public List<TemConcesionesForestalesCastania> selectByDefaultParameter(TemConcesionesForestalesCastaniaParamDef temConcesionesForestalesCastaniaParamDef);
	public List<TemConcesionesForestalesCastania> selectByDefaultParameterGeometry(TemConcesionesForestalesCastaniaParamDef temConcesionesForestalesCastaniaParamDef);
	public List<TemConcesionesForestalesCastania> selectByDefaultParameterCombo(TemConcesionesForestalesCastaniaParamDef temConcesionesForestalesCastaniaParamDef);
	public TemConcesionesForestalesCastania selectByPrimaryKey(TemConcesionesForestalesCastaniaKey temConcesionesForestalesCastaniaKey);
	public TemConcesionesForestalesCastania selectByPrimaryKeyGeometry(TemConcesionesForestalesCastaniaKey temConcesionesForestalesCastaniaKey);
	public int insertSelective(TemConcesionesForestalesCastania temConcesionesForestalesCastania);
	public int updateByPrimaryKeySelective(TemConcesionesForestalesCastania temConcesionesForestalesCastania);
	public int deleteByPrimaryKey(TemConcesionesForestalesCastaniaKey temConcesionesForestalesCastaniaKey);
	
	public int lastSequence();

	
}
