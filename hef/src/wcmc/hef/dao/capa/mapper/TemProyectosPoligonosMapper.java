package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemProyectosPoligonos;
import wcmc.hef.dao.capa.domain.TemProyectosPoligonosKey;
import wcmc.hef.dao.capa.domain.TemProyectosPoligonosParamDef;

@Service
public interface TemProyectosPoligonosMapper {
	
	public List<TemProyectosPoligonos> selectByDefaultParameter(TemProyectosPoligonosParamDef temProyectosPoligonosParamDef);
	public List<TemProyectosPoligonos> selectByDefaultParameterGeometry(TemProyectosPoligonosParamDef temProyectosPoligonosParamDef);
	public TemProyectosPoligonos selectByPrimaryKey(TemProyectosPoligonosKey temProyectosPoligonosKey);
	public int insertSelective(TemProyectosPoligonos temProyectosPoligonos);
	public int updateByPrimaryKeySelective(TemProyectosPoligonos temProyectosPoligonos);
	public int deleteByPrimaryKey(TemProyectosPoligonosKey temProyectosPoligonosKey);
	
	public int lastSequence();

	
}
