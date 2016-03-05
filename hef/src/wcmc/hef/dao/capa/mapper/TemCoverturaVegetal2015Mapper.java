package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemCoverturaVegetal2015;
import wcmc.hef.dao.capa.domain.TemCoverturaVegetal2015Key;
import wcmc.hef.dao.capa.domain.TemCoverturaVegetal2015ParamDef;

@Service
public interface TemCoverturaVegetal2015Mapper {
	
	public List<TemCoverturaVegetal2015> selectByDefaultParameter(TemCoverturaVegetal2015ParamDef temCoverturaVegetal2015ParamDef);
	public TemCoverturaVegetal2015 selectByPrimaryKey(TemCoverturaVegetal2015Key temCoverturaVegetal2015Key);
	public int insertSelective(TemCoverturaVegetal2015 temCoverturaVegetal2015);
	public int updateByPrimaryKeySelective(TemCoverturaVegetal2015 temCoverturaVegetal2015);
	public int deleteByPrimaryKey(TemCoverturaVegetal2015Key temCoverturaVegetal2015Key);
	
	public int lastSequence();

	
}
