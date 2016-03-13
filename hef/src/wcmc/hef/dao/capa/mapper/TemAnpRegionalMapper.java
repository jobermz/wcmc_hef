package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemAnpRegional;
import wcmc.hef.dao.capa.domain.TemAnpRegionalKey;
import wcmc.hef.dao.capa.domain.TemAnpRegionalParamDef;

@Service
public interface TemAnpRegionalMapper {
	
	public List<TemAnpRegional> selectByDefaultParameter(TemAnpRegionalParamDef temAnpRegionalParamDef);
	public List<TemAnpRegional> selectByDefaultParameterGeometry(TemAnpRegionalParamDef temAnpRegionalParamDef);
	public List<TemAnpRegional> selectByDefaultParameterCombo(TemAnpRegionalParamDef temAnpRegionalParamDef);
	public TemAnpRegional selectByPrimaryKey(TemAnpRegionalKey temAnpRegionalKey);
	public TemAnpRegional selectByPrimaryKeyGeometry(TemAnpRegionalKey temAnpRegionalKey);
	public int insertSelective(TemAnpRegional temAnpRegional);
	public int updateByPrimaryKeySelective(TemAnpRegional temAnpRegional);
	public int deleteByPrimaryKey(TemAnpRegionalKey temAnpRegionalKey);
	
	public int lastSequence();

	
}
