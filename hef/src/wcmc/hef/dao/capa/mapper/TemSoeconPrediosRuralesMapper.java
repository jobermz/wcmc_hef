package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemSoeconPrediosRurales;
import wcmc.hef.dao.capa.domain.TemSoeconPrediosRuralesKey;
import wcmc.hef.dao.capa.domain.TemSoeconPrediosRuralesParamDef;

@Service
public interface TemSoeconPrediosRuralesMapper {
	
	public List<TemSoeconPrediosRurales> selectByDefaultParameter(TemSoeconPrediosRuralesParamDef temSoeconPrediosRuralesParamDef);
	public TemSoeconPrediosRurales selectByPrimaryKey(TemSoeconPrediosRuralesKey temSoeconPrediosRuralesKey);
	public int insertSelective(TemSoeconPrediosRurales temSoeconPrediosRurales);
	public int updateByPrimaryKeySelective(TemSoeconPrediosRurales temSoeconPrediosRurales);
	public int deleteByPrimaryKey(TemSoeconPrediosRuralesKey temSoeconPrediosRuralesKey);
	
	public int lastSequence();

	
}
