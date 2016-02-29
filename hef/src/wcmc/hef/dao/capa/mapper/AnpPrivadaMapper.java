package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.AnpPrivada;
import wcmc.hef.dao.capa.domain.AnpPrivadaKey;
import wcmc.hef.dao.capa.domain.AnpPrivadaParamDef;

@Service
public interface AnpPrivadaMapper {
	
	public List<AnpPrivada> selectByDefaultParameter(AnpPrivadaParamDef anpPrivadaParamDef);
	public AnpPrivada selectByPrimaryKey(AnpPrivadaKey anpPrivadaKey);
	public int insertSelective(AnpPrivada anpPrivada);
	public int updateByPrimaryKeySelective(AnpPrivada anpPrivada);
	public int deleteByPrimaryKey(AnpPrivadaKey anpPrivadaKey);
	
	public int lastSequence();

	
}
