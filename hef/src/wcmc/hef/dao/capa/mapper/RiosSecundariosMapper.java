package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.RiosSecundarios;
import wcmc.hef.dao.capa.domain.RiosSecundariosKey;
import wcmc.hef.dao.capa.domain.RiosSecundariosParamDef;

@Service
public interface RiosSecundariosMapper {
	
	public List<RiosSecundarios> selectByDefaultParameter(RiosSecundariosParamDef riosSecundariosParamDef);
	public RiosSecundarios selectByPrimaryKey(RiosSecundariosKey riosSecundariosKey);
	public int insertSelective(RiosSecundarios riosSecundarios);
	public int updateByPrimaryKeySelective(RiosSecundarios riosSecundarios);
	public int deleteByPrimaryKey(RiosSecundariosKey riosSecundariosKey);
	
	public int lastSequence();

	
}
