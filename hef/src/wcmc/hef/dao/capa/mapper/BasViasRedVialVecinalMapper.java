package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.BasViasRedVialVecinal;
import wcmc.hef.dao.capa.domain.BasViasRedVialVecinalKey;
import wcmc.hef.dao.capa.domain.BasViasRedVialVecinalParamDef;

@Service
public interface BasViasRedVialVecinalMapper {
	
	public List<BasViasRedVialVecinal> selectByDefaultParameter(BasViasRedVialVecinalParamDef basViasRedVialVecinalParamDef);
	public List<BasViasRedVialVecinal> selectByDefaultParameterGeometry(BasViasRedVialVecinalParamDef basViasRedVialVecinalParamDef);
	public List<BasViasRedVialVecinal> selectByDefaultParameterCombo(BasViasRedVialVecinalParamDef basViasRedVialVecinalParamDef);
	public BasViasRedVialVecinal selectByPrimaryKey(BasViasRedVialVecinalKey basViasRedVialVecinalKey);
	public BasViasRedVialVecinal selectByPrimaryKeyGeometry(BasViasRedVialVecinalKey basViasRedVialVecinalKey);
	public int insertSelective(BasViasRedVialVecinal basViasRedVialVecinal);
	public int updateByPrimaryKeySelective(BasViasRedVialVecinal basViasRedVialVecinal);
	public int deleteByPrimaryKey(BasViasRedVialVecinalKey basViasRedVialVecinalKey);
	
	public int lastSequence();

	
}
