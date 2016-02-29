package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.RedDepartamental;
import wcmc.hef.dao.capa.domain.RedDepartamentalKey;
import wcmc.hef.dao.capa.domain.RedDepartamentalParamDef;

@Service
public interface RedDepartamentalMapper {
	
	public List<RedDepartamental> selectByDefaultParameter(RedDepartamentalParamDef redDepartamentalParamDef);
	public RedDepartamental selectByPrimaryKey(RedDepartamentalKey redDepartamentalKey);
	public int insertSelective(RedDepartamental redDepartamental);
	public int updateByPrimaryKeySelective(RedDepartamental redDepartamental);
	public int deleteByPrimaryKey(RedDepartamentalKey redDepartamentalKey);
	
	public int lastSequence();

	
}
