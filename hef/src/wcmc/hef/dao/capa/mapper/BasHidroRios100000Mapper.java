package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.BasHidroRios100000;
import wcmc.hef.dao.capa.domain.BasHidroRios100000Key;
import wcmc.hef.dao.capa.domain.BasHidroRios100000ParamDef;

@Service
public interface BasHidroRios100000Mapper {
	
	public List<BasHidroRios100000> selectByDefaultParameter(BasHidroRios100000ParamDef basHidroRios100000ParamDef);
	public List<BasHidroRios100000> selectByDefaultParameterGeometry(BasHidroRios100000ParamDef basHidroRios100000ParamDef);
	public List<BasHidroRios100000> selectByDefaultParameterCombo(BasHidroRios100000ParamDef basHidroRios100000ParamDef);
	public BasHidroRios100000 selectByPrimaryKey(BasHidroRios100000Key basHidroRios100000Key);
	public BasHidroRios100000 selectByPrimaryKeyGeometry(BasHidroRios100000Key basHidroRios100000Key);
	public int insertSelective(BasHidroRios100000 basHidroRios100000);
	public int updateByPrimaryKeySelective(BasHidroRios100000 basHidroRios100000);
	public int deleteByPrimaryKey(BasHidroRios100000Key basHidroRios100000Key);
	
	public int lastSequence();

	
}
