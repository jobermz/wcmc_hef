package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.BasLimAmazonia;
import wcmc.hef.dao.capa.domain.BasLimAmazoniaKey;
import wcmc.hef.dao.capa.domain.BasLimAmazoniaParamDef;

@Service
public interface BasLimAmazoniaMapper {
	
	public List<BasLimAmazonia> selectByDefaultParameter(BasLimAmazoniaParamDef basLimAmazoniaParamDef);
	public List<BasLimAmazonia> selectByDefaultParameterGeometry(BasLimAmazoniaParamDef basLimAmazoniaParamDef);
	public List<BasLimAmazonia> selectByDefaultParameterCombo(BasLimAmazoniaParamDef basLimAmazoniaParamDef);
	public BasLimAmazonia selectByPrimaryKey(BasLimAmazoniaKey basLimAmazoniaKey);
	public BasLimAmazonia selectByPrimaryKeyGeometry(BasLimAmazoniaKey basLimAmazoniaKey);
	public int insertSelective(BasLimAmazonia basLimAmazonia);
	public int updateByPrimaryKeySelective(BasLimAmazonia basLimAmazonia);
	public int deleteByPrimaryKey(BasLimAmazoniaKey basLimAmazoniaKey);
	
	public int lastSequence();

	
}
