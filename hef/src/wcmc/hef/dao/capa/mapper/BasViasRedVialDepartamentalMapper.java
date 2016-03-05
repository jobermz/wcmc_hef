package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.BasViasRedVialDepartamental;
import wcmc.hef.dao.capa.domain.BasViasRedVialDepartamentalKey;
import wcmc.hef.dao.capa.domain.BasViasRedVialDepartamentalParamDef;

@Service
public interface BasViasRedVialDepartamentalMapper {
	
	public List<BasViasRedVialDepartamental> selectByDefaultParameter(BasViasRedVialDepartamentalParamDef basViasRedVialDepartamentalParamDef);
	public BasViasRedVialDepartamental selectByPrimaryKey(BasViasRedVialDepartamentalKey basViasRedVialDepartamentalKey);
	public int insertSelective(BasViasRedVialDepartamental basViasRedVialDepartamental);
	public int updateByPrimaryKeySelective(BasViasRedVialDepartamental basViasRedVialDepartamental);
	public int deleteByPrimaryKey(BasViasRedVialDepartamentalKey basViasRedVialDepartamentalKey);
	
	public int lastSequence();

	
}
