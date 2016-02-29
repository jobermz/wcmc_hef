package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.LagosYLagunas;
import wcmc.hef.dao.capa.domain.LagosYLagunasKey;
import wcmc.hef.dao.capa.domain.LagosYLagunasParamDef;

@Service
public interface LagosYLagunasMapper {
	
	public List<LagosYLagunas> selectByDefaultParameter(LagosYLagunasParamDef lagosYLagunasParamDef);
	public LagosYLagunas selectByPrimaryKey(LagosYLagunasKey lagosYLagunasKey);
	public int insertSelective(LagosYLagunas lagosYLagunas);
	public int updateByPrimaryKeySelective(LagosYLagunas lagosYLagunas);
	public int deleteByPrimaryKey(LagosYLagunasKey lagosYLagunasKey);
	
	public int lastSequence();

	
}
