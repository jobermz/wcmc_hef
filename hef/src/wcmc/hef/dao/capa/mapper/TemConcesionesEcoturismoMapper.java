package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemConcesionesEcoturismo;
import wcmc.hef.dao.capa.domain.TemConcesionesEcoturismoKey;
import wcmc.hef.dao.capa.domain.TemConcesionesEcoturismoParamDef;

@Service
public interface TemConcesionesEcoturismoMapper {
	
	public List<TemConcesionesEcoturismo> selectByDefaultParameter(TemConcesionesEcoturismoParamDef temConcesionesEcoturismoParamDef);
	public TemConcesionesEcoturismo selectByPrimaryKey(TemConcesionesEcoturismoKey temConcesionesEcoturismoKey);
	public int insertSelective(TemConcesionesEcoturismo temConcesionesEcoturismo);
	public int updateByPrimaryKeySelective(TemConcesionesEcoturismo temConcesionesEcoturismo);
	public int deleteByPrimaryKey(TemConcesionesEcoturismoKey temConcesionesEcoturismoKey);
	
	public int lastSequence();

	
}
