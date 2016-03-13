package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemViaFerrea;
import wcmc.hef.dao.capa.domain.TemViaFerreaKey;
import wcmc.hef.dao.capa.domain.TemViaFerreaParamDef;

@Service
public interface TemViaFerreaMapper {
	
	public List<TemViaFerrea> selectByDefaultParameter(TemViaFerreaParamDef temViaFerreaParamDef);
	public List<TemViaFerrea> selectByDefaultParameterGeometry(TemViaFerreaParamDef temViaFerreaParamDef);
	public List<TemViaFerrea> selectByDefaultParameterCombo(TemViaFerreaParamDef temViaFerreaParamDef);
	public TemViaFerrea selectByPrimaryKey(TemViaFerreaKey temViaFerreaKey);
	public TemViaFerrea selectByPrimaryKeyGeometry(TemViaFerreaKey temViaFerreaKey);
	public int insertSelective(TemViaFerrea temViaFerrea);
	public int updateByPrimaryKeySelective(TemViaFerrea temViaFerrea);
	public int deleteByPrimaryKey(TemViaFerreaKey temViaFerreaKey);
	
	public int lastSequence();

	
}
