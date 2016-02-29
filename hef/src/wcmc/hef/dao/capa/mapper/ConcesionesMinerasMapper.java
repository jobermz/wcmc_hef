package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.ConcesionesMineras;
import wcmc.hef.dao.capa.domain.ConcesionesMinerasKey;
import wcmc.hef.dao.capa.domain.ConcesionesMinerasParamDef;

@Service
public interface ConcesionesMinerasMapper {
	
	public List<ConcesionesMineras> selectByDefaultParameter(ConcesionesMinerasParamDef concesionesMinerasParamDef);
	public ConcesionesMineras selectByPrimaryKey(ConcesionesMinerasKey concesionesMinerasKey);
	public int insertSelective(ConcesionesMineras concesionesMineras);
	public int updateByPrimaryKeySelective(ConcesionesMineras concesionesMineras);
	public int deleteByPrimaryKey(ConcesionesMinerasKey concesionesMinerasKey);
	
	public int lastSequence();

	
}
