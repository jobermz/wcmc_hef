package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.AnpNacional;
import wcmc.hef.dao.capa.domain.AnpNacionalKey;
import wcmc.hef.dao.capa.domain.AnpNacionalParamDef;

@Service
public interface AnpNacionalMapper {
	
	public List<AnpNacional> selectByDefaultParameter(AnpNacionalParamDef anpNacionalParamDef);
	public AnpNacional selectByPrimaryKey(AnpNacionalKey anpNacionalKey);
	public int insertSelective(AnpNacional anpNacional);
	public int updateByPrimaryKeySelective(AnpNacional anpNacional);
	public int deleteByPrimaryKey(AnpNacionalKey anpNacionalKey);
	
	public int lastSequence();

	
}
