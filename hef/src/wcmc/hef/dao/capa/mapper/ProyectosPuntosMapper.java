package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.ProyectosPuntos;
import wcmc.hef.dao.capa.domain.ProyectosPuntosKey;
import wcmc.hef.dao.capa.domain.ProyectosPuntosParamDef;

@Service
public interface ProyectosPuntosMapper {
	
	public List<ProyectosPuntos> selectByDefaultParameter(ProyectosPuntosParamDef proyectosPuntosParamDef);
	public ProyectosPuntos selectByPrimaryKey(ProyectosPuntosKey proyectosPuntosKey);
	public int insertSelective(ProyectosPuntos proyectosPuntos);
	public int updateByPrimaryKeySelective(ProyectosPuntos proyectosPuntos);
	public int deleteByPrimaryKey(ProyectosPuntosKey proyectosPuntosKey);
	
	public int lastSequence();

	
}
