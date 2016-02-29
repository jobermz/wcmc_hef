package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.AnpRegional;
import wcmc.hef.dao.capa.domain.AnpRegionalKey;
import wcmc.hef.dao.capa.domain.AnpRegionalParamDef;

@Service
public interface AnpRegionalMapper {
	
	public List<AnpRegional> selectByDefaultParameter(AnpRegionalParamDef anpRegionalParamDef);
	public AnpRegional selectByPrimaryKey(AnpRegionalKey anpRegionalKey);
	public int insertSelective(AnpRegional anpRegional);
	public int updateByPrimaryKeySelective(AnpRegional anpRegional);
	public int deleteByPrimaryKey(AnpRegionalKey anpRegionalKey);
	
	public int lastSequence();

	
}
