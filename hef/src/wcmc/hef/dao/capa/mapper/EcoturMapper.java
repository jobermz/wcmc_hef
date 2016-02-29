package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.Ecotur;
import wcmc.hef.dao.capa.domain.EcoturKey;
import wcmc.hef.dao.capa.domain.EcoturParamDef;

@Service
public interface EcoturMapper {
	
	public List<Ecotur> selectByDefaultParameter(EcoturParamDef ecoturParamDef);
	public Ecotur selectByPrimaryKey(EcoturKey ecoturKey);
	public int insertSelective(Ecotur ecotur);
	public int updateByPrimaryKeySelective(Ecotur ecotur);
	public int deleteByPrimaryKey(EcoturKey ecoturKey);
	
	public int lastSequence();

	
}
