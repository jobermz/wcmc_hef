package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.Conser;
import wcmc.hef.dao.capa.domain.ConserKey;
import wcmc.hef.dao.capa.domain.ConserParamDef;

@Service
public interface ConserMapper {
	
	public List<Conser> selectByDefaultParameter(ConserParamDef conserParamDef);
	public Conser selectByPrimaryKey(ConserKey conserKey);
	public int insertSelective(Conser conser);
	public int updateByPrimaryKeySelective(Conser conser);
	public int deleteByPrimaryKey(ConserKey conserKey);
	
	public int lastSequence();

	
}
