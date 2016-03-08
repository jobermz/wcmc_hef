package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemConcesionesMineras;
import wcmc.hef.dao.capa.domain.TemConcesionesMinerasKey;
import wcmc.hef.dao.capa.domain.TemConcesionesMinerasParamDef;

@Service
public interface TemConcesionesMinerasMapper {
	
	public List<TemConcesionesMineras> selectByDefaultParameter(TemConcesionesMinerasParamDef temConcesionesMinerasParamDef);
	public List<TemConcesionesMineras> selectByDefaultParameterGeometry(TemConcesionesMinerasParamDef temConcesionesMinerasParamDef);
	public TemConcesionesMineras selectByPrimaryKey(TemConcesionesMinerasKey temConcesionesMinerasKey);
	public int insertSelective(TemConcesionesMineras temConcesionesMineras);
	public int updateByPrimaryKeySelective(TemConcesionesMineras temConcesionesMineras);
	public int deleteByPrimaryKey(TemConcesionesMinerasKey temConcesionesMinerasKey);
	
	public int lastSequence();

	
}
