package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.Adecuacion;
import wcmc.hef.dao.capa.domain.AdecuacionKey;
import wcmc.hef.dao.capa.domain.AdecuacionParamDef;

@Service
public interface AdecuacionMapper {
	
	public List<Adecuacion> selectByDefaultParameter(AdecuacionParamDef adecuacionParamDef);
	public Adecuacion selectByPrimaryKey(AdecuacionKey adecuacionKey);
	public int insertSelective(Adecuacion adecuacion);
	public int updateByPrimaryKeySelective(Adecuacion adecuacion);
	public int deleteByPrimaryKey(AdecuacionKey adecuacionKey);
	
	public int lastSequence();

	
}
