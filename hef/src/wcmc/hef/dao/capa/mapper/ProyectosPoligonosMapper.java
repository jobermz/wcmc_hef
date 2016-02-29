package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.ProyectosPoligonos;
import wcmc.hef.dao.capa.domain.ProyectosPoligonosKey;
import wcmc.hef.dao.capa.domain.ProyectosPoligonosParamDef;

@Service
public interface ProyectosPoligonosMapper {
	
	public List<ProyectosPoligonos> selectByDefaultParameter(ProyectosPoligonosParamDef proyectosPoligonosParamDef);
	public ProyectosPoligonos selectByPrimaryKey(ProyectosPoligonosKey proyectosPoligonosKey);
	public int insertSelective(ProyectosPoligonos proyectosPoligonos);
	public int updateByPrimaryKeySelective(ProyectosPoligonos proyectosPoligonos);
	public int deleteByPrimaryKey(ProyectosPoligonosKey proyectosPoligonosKey);
	
	public int lastSequence();

	
}
