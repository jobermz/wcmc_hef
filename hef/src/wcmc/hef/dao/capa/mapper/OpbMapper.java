package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.Opb;
import wcmc.hef.dao.capa.domain.OpbKey;
import wcmc.hef.dao.capa.domain.OpbParamDef;

@Service
public interface OpbMapper {
	
	public List<Opb> selectByDefaultParameter(OpbParamDef opbParamDef);
	public Opb selectByPrimaryKey(OpbKey opbKey);
	public int insertSelective(Opb opb);
	public int updateByPrimaryKeySelective(Opb opb);
	public int deleteByPrimaryKey(OpbKey opbKey);
	
	public int lastSequence();

	
}
