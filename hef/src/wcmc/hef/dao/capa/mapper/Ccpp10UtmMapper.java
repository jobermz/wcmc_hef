package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.Ccpp10Utm;
import wcmc.hef.dao.capa.domain.Ccpp10UtmKey;
import wcmc.hef.dao.capa.domain.Ccpp10UtmParamDef;

@Service
public interface Ccpp10UtmMapper {
	
	public List<Ccpp10Utm> selectByDefaultParameter(Ccpp10UtmParamDef ccpp10UtmParamDef);
	public Ccpp10Utm selectByPrimaryKey(Ccpp10UtmKey ccpp10UtmKey);
	public int insertSelective(Ccpp10Utm ccpp10Utm);
	public int updateByPrimaryKeySelective(Ccpp10Utm ccpp10Utm);
	public int deleteByPrimaryKey(Ccpp10UtmKey ccpp10UtmKey);
	
	public int lastSequence();

	
}
