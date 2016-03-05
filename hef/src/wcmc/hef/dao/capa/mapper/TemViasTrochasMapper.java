package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemViasTrochas;
import wcmc.hef.dao.capa.domain.TemViasTrochasKey;
import wcmc.hef.dao.capa.domain.TemViasTrochasParamDef;

@Service
public interface TemViasTrochasMapper {
	
	public List<TemViasTrochas> selectByDefaultParameter(TemViasTrochasParamDef temViasTrochasParamDef);
	public TemViasTrochas selectByPrimaryKey(TemViasTrochasKey temViasTrochasKey);
	public int insertSelective(TemViasTrochas temViasTrochas);
	public int updateByPrimaryKeySelective(TemViasTrochas temViasTrochas);
	public int deleteByPrimaryKey(TemViasTrochasKey temViasTrochasKey);
	
	public int lastSequence();

	
}
