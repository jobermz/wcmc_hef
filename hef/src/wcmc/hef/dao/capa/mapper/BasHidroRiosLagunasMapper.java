package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.BasHidroRiosLagunas;
import wcmc.hef.dao.capa.domain.BasHidroRiosLagunasKey;
import wcmc.hef.dao.capa.domain.BasHidroRiosLagunasParamDef;

@Service
public interface BasHidroRiosLagunasMapper {
	
	public List<BasHidroRiosLagunas> selectByDefaultParameter(BasHidroRiosLagunasParamDef basHidroRiosLagunasParamDef);
	public BasHidroRiosLagunas selectByPrimaryKey(BasHidroRiosLagunasKey basHidroRiosLagunasKey);
	public int insertSelective(BasHidroRiosLagunas basHidroRiosLagunas);
	public int updateByPrimaryKeySelective(BasHidroRiosLagunas basHidroRiosLagunas);
	public int deleteByPrimaryKey(BasHidroRiosLagunasKey basHidroRiosLagunasKey);
	
	public int lastSequence();

	
}
