package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.KbaIbaPeru;
import wcmc.hef.dao.capa.domain.KbaIbaPeruKey;
import wcmc.hef.dao.capa.domain.KbaIbaPeruParamDef;

@Service
public interface KbaIbaPeruMapper {
	
	public List<KbaIbaPeru> selectByDefaultParameter(KbaIbaPeruParamDef kbaIbaPeruParamDef);
	public KbaIbaPeru selectByPrimaryKey(KbaIbaPeruKey kbaIbaPeruKey);
	public int insertSelective(KbaIbaPeru kbaIbaPeru);
	public int updateByPrimaryKeySelective(KbaIbaPeru kbaIbaPeru);
	public int deleteByPrimaryKey(KbaIbaPeruKey kbaIbaPeruKey);
	
	public int lastSequence();

	
}
