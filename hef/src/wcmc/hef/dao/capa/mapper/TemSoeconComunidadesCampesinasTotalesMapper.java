package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemSoeconComunidadesCampesinasTotales;
import wcmc.hef.dao.capa.domain.TemSoeconComunidadesCampesinasTotalesKey;
import wcmc.hef.dao.capa.domain.TemSoeconComunidadesCampesinasTotalesParamDef;

@Service
public interface TemSoeconComunidadesCampesinasTotalesMapper {
	
	public List<TemSoeconComunidadesCampesinasTotales> selectByDefaultParameter(TemSoeconComunidadesCampesinasTotalesParamDef temSoeconComunidadesCampesinasTotalesParamDef);
	public List<TemSoeconComunidadesCampesinasTotales> selectByDefaultParameterGeometry(TemSoeconComunidadesCampesinasTotalesParamDef temSoeconComunidadesCampesinasTotalesParamDef);
	public TemSoeconComunidadesCampesinasTotales selectByPrimaryKey(TemSoeconComunidadesCampesinasTotalesKey temSoeconComunidadesCampesinasTotalesKey);
	public int insertSelective(TemSoeconComunidadesCampesinasTotales temSoeconComunidadesCampesinasTotales);
	public int updateByPrimaryKeySelective(TemSoeconComunidadesCampesinasTotales temSoeconComunidadesCampesinasTotales);
	public int deleteByPrimaryKey(TemSoeconComunidadesCampesinasTotalesKey temSoeconComunidadesCampesinasTotalesKey);
	
	public int lastSequence();

	
}
