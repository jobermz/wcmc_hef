package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.RedNacional;
import wcmc.hef.dao.capa.domain.RedNacionalKey;
import wcmc.hef.dao.capa.domain.RedNacionalParamDef;

@Service
public interface RedNacionalMapper {
	
	public List<RedNacional> selectByDefaultParameter(RedNacionalParamDef redNacionalParamDef);
	public RedNacional selectByPrimaryKey(RedNacionalKey redNacionalKey);
	public int insertSelective(RedNacional redNacional);
	public int updateByPrimaryKeySelective(RedNacional redNacional);
	public int deleteByPrimaryKey(RedNacionalKey redNacionalKey);
	
	public int lastSequence();

	
}
