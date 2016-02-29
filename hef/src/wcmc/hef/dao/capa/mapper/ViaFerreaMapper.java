package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.ViaFerrea;
import wcmc.hef.dao.capa.domain.ViaFerreaKey;
import wcmc.hef.dao.capa.domain.ViaFerreaParamDef;

@Service
public interface ViaFerreaMapper {
	
	public List<ViaFerrea> selectByDefaultParameter(ViaFerreaParamDef viaFerreaParamDef);
	public ViaFerrea selectByPrimaryKey(ViaFerreaKey viaFerreaKey);
	public int insertSelective(ViaFerrea viaFerrea);
	public int updateByPrimaryKeySelective(ViaFerrea viaFerrea);
	public int deleteByPrimaryKey(ViaFerreaKey viaFerreaKey);
	
	public int lastSequence();

	
}
