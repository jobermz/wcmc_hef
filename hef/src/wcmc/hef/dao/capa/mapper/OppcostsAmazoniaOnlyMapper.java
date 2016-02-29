package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.OppcostsAmazoniaOnly;
import wcmc.hef.dao.capa.domain.OppcostsAmazoniaOnlyKey;
import wcmc.hef.dao.capa.domain.OppcostsAmazoniaOnlyParamDef;

@Service
public interface OppcostsAmazoniaOnlyMapper {
	
	public List<OppcostsAmazoniaOnly> selectByDefaultParameter(OppcostsAmazoniaOnlyParamDef oppcostsAmazoniaOnlyParamDef);
	public OppcostsAmazoniaOnly selectByPrimaryKey(OppcostsAmazoniaOnlyKey oppcostsAmazoniaOnlyKey);
	public int insertSelective(OppcostsAmazoniaOnly oppcostsAmazoniaOnly);
	public int updateByPrimaryKeySelective(OppcostsAmazoniaOnly oppcostsAmazoniaOnly);
	public int deleteByPrimaryKey(OppcostsAmazoniaOnlyKey oppcostsAmazoniaOnlyKey);
	
	public int lastSequence();

	
}
