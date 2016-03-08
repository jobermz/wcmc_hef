package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemPrediosRurales;
import wcmc.hef.dao.capa.domain.TemPrediosRuralesKey;
import wcmc.hef.dao.capa.domain.TemPrediosRuralesParamDef;

@Service
public interface TemPrediosRuralesMapper {
	
	public List<TemPrediosRurales> selectByDefaultParameter(TemPrediosRuralesParamDef temPrediosRuralesParamDef);
	public List<TemPrediosRurales> selectByDefaultParameterGeometry(TemPrediosRuralesParamDef temPrediosRuralesParamDef);
	public TemPrediosRurales selectByPrimaryKey(TemPrediosRuralesKey temPrediosRuralesKey);
	public int insertSelective(TemPrediosRurales temPrediosRurales);
	public int updateByPrimaryKeySelective(TemPrediosRurales temPrediosRurales);
	public int deleteByPrimaryKey(TemPrediosRuralesKey temPrediosRuralesKey);
	
	public int lastSequence();

	
}
