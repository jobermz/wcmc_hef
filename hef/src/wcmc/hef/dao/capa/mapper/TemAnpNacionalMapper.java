package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemAnpNacional;
import wcmc.hef.dao.capa.domain.TemAnpNacionalKey;
import wcmc.hef.dao.capa.domain.TemAnpNacionalParamDef;

@Service
public interface TemAnpNacionalMapper {
	
	public List<TemAnpNacional> selectByDefaultParameter(TemAnpNacionalParamDef temAnpNacionalParamDef);
	public List<TemAnpNacional> selectByDefaultParameterGeometry(TemAnpNacionalParamDef temAnpNacionalParamDef);
	public TemAnpNacional selectByPrimaryKey(TemAnpNacionalKey temAnpNacionalKey);
	public int insertSelective(TemAnpNacional temAnpNacional);
	public int updateByPrimaryKeySelective(TemAnpNacional temAnpNacional);
	public int deleteByPrimaryKey(TemAnpNacionalKey temAnpNacionalKey);
	
	public int lastSequence();

	
}
