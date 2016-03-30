package wcmc.hef.dao.configuracion.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.configuracion.domain.GeometriaUsuario;
import wcmc.hef.dao.configuracion.domain.GeometriaUsuarioKey;
import wcmc.hef.dao.configuracion.domain.GeometriaUsuarioParamDef;

@Service
public interface GeometriaUsuarioMapper {
	
	public List<GeometriaUsuario> selectByDefaultParameter(GeometriaUsuarioParamDef geometriaUsuarioParamDef);
	public GeometriaUsuario selectByPrimaryKey(GeometriaUsuarioKey geometriaUsuarioKey);
	public int insertSelective(GeometriaUsuario geometriaUsuario);
	public int updateByPrimaryKeySelective(GeometriaUsuario geometriaUsuario);
	public int deleteByPrimaryKey(GeometriaUsuarioKey geometriaUsuarioKey);
	
	public int lastSequence();

	
}
