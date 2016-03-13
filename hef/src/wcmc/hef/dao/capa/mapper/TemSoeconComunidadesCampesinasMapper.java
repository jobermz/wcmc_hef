package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemSoeconComunidadesCampesinas;
import wcmc.hef.dao.capa.domain.TemSoeconComunidadesCampesinasKey;
import wcmc.hef.dao.capa.domain.TemSoeconComunidadesCampesinasParamDef;

@Service
public interface TemSoeconComunidadesCampesinasMapper {
	
	public List<TemSoeconComunidadesCampesinas> selectByDefaultParameter(TemSoeconComunidadesCampesinasParamDef temSoeconComunidadesCampesinasParamDef);
	public List<TemSoeconComunidadesCampesinas> selectByDefaultParameterGeometry(TemSoeconComunidadesCampesinasParamDef temSoeconComunidadesCampesinasParamDef);
	public List<TemSoeconComunidadesCampesinas> selectByDefaultParameterCombo(TemSoeconComunidadesCampesinasParamDef temSoeconComunidadesCampesinasParamDef);
	public TemSoeconComunidadesCampesinas selectByPrimaryKey(TemSoeconComunidadesCampesinasKey temSoeconComunidadesCampesinasKey);
	public TemSoeconComunidadesCampesinas selectByPrimaryKeyGeometry(TemSoeconComunidadesCampesinasKey temSoeconComunidadesCampesinasKey);
	public int insertSelective(TemSoeconComunidadesCampesinas temSoeconComunidadesCampesinas);
	public int updateByPrimaryKeySelective(TemSoeconComunidadesCampesinas temSoeconComunidadesCampesinas);
	public int deleteByPrimaryKey(TemSoeconComunidadesCampesinasKey temSoeconComunidadesCampesinasKey);
	
	public int lastSequence();

	
}
