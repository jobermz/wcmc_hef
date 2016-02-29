package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.RedVecinal;
import wcmc.hef.dao.capa.domain.RedVecinalKey;
import wcmc.hef.dao.capa.domain.RedVecinalParamDef;

@Service
public interface RedVecinalMapper {
	
	public List<RedVecinal> selectByDefaultParameter(RedVecinalParamDef redVecinalParamDef);
	public RedVecinal selectByPrimaryKey(RedVecinalKey redVecinalKey);
	public int insertSelective(RedVecinal redVecinal);
	public int updateByPrimaryKeySelective(RedVecinal redVecinal);
	public int deleteByPrimaryKey(RedVecinalKey redVecinalKey);
	
	public int lastSequence();

	
}
