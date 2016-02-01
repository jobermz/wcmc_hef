package wcmc.hef.dao.configuracion.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.configuracion.domain.CapasBase;
import wcmc.hef.dao.configuracion.domain.CapasBaseKey;
import wcmc.hef.dao.configuracion.domain.CapasBaseParamDef;

@Service
public interface CapasBaseMapper {
	
	public List<CapasBase> selectByDefaultParameter(CapasBaseParamDef capasBaseParamDef);
	public CapasBase selectByPrimaryKey(CapasBaseKey capasBaseKey);
	public int insertSelective(CapasBase capasBase);
	public int updateByPrimaryKeySelective(CapasBase capasBase);
	public int deleteByPrimaryKey(CapasBaseKey capasBaseKey);
	
	public int lastSequence();

	
}
