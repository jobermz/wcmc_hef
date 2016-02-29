package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.Refor;
import wcmc.hef.dao.capa.domain.ReforKey;
import wcmc.hef.dao.capa.domain.ReforParamDef;

@Service
public interface ReforMapper {
	
	public List<Refor> selectByDefaultParameter(ReforParamDef reforParamDef);
	public Refor selectByPrimaryKey(ReforKey reforKey);
	public int insertSelective(Refor refor);
	public int updateByPrimaryKeySelective(Refor refor);
	public int deleteByPrimaryKey(ReforKey reforKey);
	
	public int lastSequence();

	
}
