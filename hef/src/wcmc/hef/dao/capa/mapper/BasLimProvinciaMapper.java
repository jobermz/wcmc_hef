package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.BasLimProvincia;
import wcmc.hef.dao.capa.domain.BasLimProvinciaKey;
import wcmc.hef.dao.capa.domain.BasLimProvinciaParamDef;

@Service
public interface BasLimProvinciaMapper {
	
	public List<BasLimProvincia> selectByDefaultParameter(BasLimProvinciaParamDef basLimProvinciaParamDef);
	public List<BasLimProvincia> selectByDefaultParameterGeometry(BasLimProvinciaParamDef basLimProvinciaParamDef);
	public BasLimProvincia selectByPrimaryKey(BasLimProvinciaKey basLimProvinciaKey);
	public int insertSelective(BasLimProvincia basLimProvincia);
	public int updateByPrimaryKeySelective(BasLimProvincia basLimProvincia);
	public int deleteByPrimaryKey(BasLimProvinciaKey basLimProvinciaKey);
	
	public int lastSequence();

	
}
