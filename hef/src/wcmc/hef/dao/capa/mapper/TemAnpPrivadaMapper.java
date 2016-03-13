package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemAnpPrivada;
import wcmc.hef.dao.capa.domain.TemAnpPrivadaKey;
import wcmc.hef.dao.capa.domain.TemAnpPrivadaParamDef;

@Service
public interface TemAnpPrivadaMapper {
	
	public List<TemAnpPrivada> selectByDefaultParameter(TemAnpPrivadaParamDef temAnpPrivadaParamDef);
	public List<TemAnpPrivada> selectByDefaultParameterGeometry(TemAnpPrivadaParamDef temAnpPrivadaParamDef);
	public List<TemAnpPrivada> selectByDefaultParameterCombo(TemAnpPrivadaParamDef temAnpPrivadaParamDef);
	public TemAnpPrivada selectByPrimaryKey(TemAnpPrivadaKey temAnpPrivadaKey);
	public TemAnpPrivada selectByPrimaryKeyGeometry(TemAnpPrivadaKey temAnpPrivadaKey);
	public int insertSelective(TemAnpPrivada temAnpPrivada);
	public int updateByPrimaryKeySelective(TemAnpPrivada temAnpPrivada);
	public int deleteByPrimaryKey(TemAnpPrivadaKey temAnpPrivadaKey);
	
	public int lastSequence();

	
}
