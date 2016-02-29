package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.RiosPrincipales;
import wcmc.hef.dao.capa.domain.RiosPrincipalesKey;
import wcmc.hef.dao.capa.domain.RiosPrincipalesParamDef;

@Service
public interface RiosPrincipalesMapper {
	
	public List<RiosPrincipales> selectByDefaultParameter(RiosPrincipalesParamDef riosPrincipalesParamDef);
	public RiosPrincipales selectByPrimaryKey(RiosPrincipalesKey riosPrincipalesKey);
	public int insertSelective(RiosPrincipales riosPrincipales);
	public int updateByPrimaryKeySelective(RiosPrincipales riosPrincipales);
	public int deleteByPrimaryKey(RiosPrincipalesKey riosPrincipalesKey);
	
	public int lastSequence();

	
}
