package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemProyeccionDensidadPob2015;
import wcmc.hef.dao.capa.domain.TemProyeccionDensidadPob2015Key;
import wcmc.hef.dao.capa.domain.TemProyeccionDensidadPob2015ParamDef;

@Service
public interface TemProyeccionDensidadPob2015Mapper {
	
	public List<TemProyeccionDensidadPob2015> selectByDefaultParameter(TemProyeccionDensidadPob2015ParamDef temProyeccionDensidadPob2015ParamDef);
	public List<TemProyeccionDensidadPob2015> selectByDefaultParameterGeometry(TemProyeccionDensidadPob2015ParamDef temProyeccionDensidadPob2015ParamDef);
	public List<TemProyeccionDensidadPob2015> selectByDefaultParameterCombo(TemProyeccionDensidadPob2015ParamDef temProyeccionDensidadPob2015ParamDef);
	public TemProyeccionDensidadPob2015 selectByPrimaryKey(TemProyeccionDensidadPob2015Key temProyeccionDensidadPob2015Key);
	public TemProyeccionDensidadPob2015 selectByPrimaryKeyGeometry(TemProyeccionDensidadPob2015Key temProyeccionDensidadPob2015Key);
	public int insertSelective(TemProyeccionDensidadPob2015 temProyeccionDensidadPob2015);
	public int updateByPrimaryKeySelective(TemProyeccionDensidadPob2015 temProyeccionDensidadPob2015);
	public int deleteByPrimaryKey(TemProyeccionDensidadPob2015Key temProyeccionDensidadPob2015Key);
	
	public int lastSequence();

	
}
