package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.BasLimDistritos;
import wcmc.hef.dao.capa.domain.BasLimDistritosKey;
import wcmc.hef.dao.capa.domain.BasLimDistritosParamDef;

@Service
public interface BasLimDistritosMapper {
	
	public List<BasLimDistritos> selectByDefaultParameter(BasLimDistritosParamDef basLimDistritosParamDef);
	public List<BasLimDistritos> selectByDefaultParameterGeometry(BasLimDistritosParamDef basLimDistritosParamDef);
	public List<BasLimDistritos> selectByDefaultParameterCombo(BasLimDistritosParamDef basLimDistritosParamDef);
	public BasLimDistritos selectByPrimaryKey(BasLimDistritosKey basLimDistritosKey);
	public BasLimDistritos selectByPrimaryKeyGeometry(BasLimDistritosKey basLimDistritosKey);
	public int insertSelective(BasLimDistritos basLimDistritos);
	public int updateByPrimaryKeySelective(BasLimDistritos basLimDistritos);
	public int deleteByPrimaryKey(BasLimDistritosKey basLimDistritosKey);
	
	public int lastSequence();

	
}
