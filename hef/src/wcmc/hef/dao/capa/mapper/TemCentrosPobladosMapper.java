package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemCentrosPoblados;
import wcmc.hef.dao.capa.domain.TemCentrosPobladosKey;
import wcmc.hef.dao.capa.domain.TemCentrosPobladosParamDef;

@Service
public interface TemCentrosPobladosMapper {
	
	public List<TemCentrosPoblados> selectByDefaultParameter(TemCentrosPobladosParamDef temCentrosPobladosParamDef);
	public TemCentrosPoblados selectByPrimaryKey(TemCentrosPobladosKey temCentrosPobladosKey);
	public int insertSelective(TemCentrosPoblados temCentrosPoblados);
	public int updateByPrimaryKeySelective(TemCentrosPoblados temCentrosPoblados);
	public int deleteByPrimaryKey(TemCentrosPobladosKey temCentrosPobladosKey);
	
	public int lastSequence();

	
}
