package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.BasViasRedVialNacional;
import wcmc.hef.dao.capa.domain.BasViasRedVialNacionalKey;
import wcmc.hef.dao.capa.domain.BasViasRedVialNacionalParamDef;

@Service
public interface BasViasRedVialNacionalMapper {
	
	public List<BasViasRedVialNacional> selectByDefaultParameter(BasViasRedVialNacionalParamDef basViasRedVialNacionalParamDef);
	public BasViasRedVialNacional selectByPrimaryKey(BasViasRedVialNacionalKey basViasRedVialNacionalKey);
	public int insertSelective(BasViasRedVialNacional basViasRedVialNacional);
	public int updateByPrimaryKeySelective(BasViasRedVialNacional basViasRedVialNacional);
	public int deleteByPrimaryKey(BasViasRedVialNacionalKey basViasRedVialNacionalKey);
	
	public int lastSequence();

	
}
