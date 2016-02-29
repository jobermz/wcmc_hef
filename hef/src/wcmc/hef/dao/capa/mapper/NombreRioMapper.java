package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.NombreRio;
import wcmc.hef.dao.capa.domain.NombreRioKey;
import wcmc.hef.dao.capa.domain.NombreRioParamDef;

@Service
public interface NombreRioMapper {
	
	public List<NombreRio> selectByDefaultParameter(NombreRioParamDef nombreRioParamDef);
	public NombreRio selectByPrimaryKey(NombreRioKey nombreRioKey);
	public int insertSelective(NombreRio nombreRio);
	public int updateByPrimaryKeySelective(NombreRio nombreRio);
	public int deleteByPrimaryKey(NombreRioKey nombreRioKey);
	
	public int lastSequence();

	
}
