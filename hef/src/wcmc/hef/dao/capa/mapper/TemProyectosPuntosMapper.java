package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemProyectosPuntos;
import wcmc.hef.dao.capa.domain.TemProyectosPuntosKey;
import wcmc.hef.dao.capa.domain.TemProyectosPuntosParamDef;

@Service
public interface TemProyectosPuntosMapper {
	
	public List<TemProyectosPuntos> selectByDefaultParameter(TemProyectosPuntosParamDef temProyectosPuntosParamDef);
	public List<TemProyectosPuntos> selectByDefaultParameterGeometry(TemProyectosPuntosParamDef temProyectosPuntosParamDef);
	public List<TemProyectosPuntos> selectByDefaultParameterCombo(TemProyectosPuntosParamDef temProyectosPuntosParamDef);
	public TemProyectosPuntos selectByPrimaryKey(TemProyectosPuntosKey temProyectosPuntosKey);
	public TemProyectosPuntos selectByPrimaryKeyGeometry(TemProyectosPuntosKey temProyectosPuntosKey);
	public int insertSelective(TemProyectosPuntos temProyectosPuntos);
	public int updateByPrimaryKeySelective(TemProyectosPuntos temProyectosPuntos);
	public int deleteByPrimaryKey(TemProyectosPuntosKey temProyectosPuntosKey);
	
	public int lastSequence();

	
}
