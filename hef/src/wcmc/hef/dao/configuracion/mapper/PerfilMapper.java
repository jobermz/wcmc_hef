package wcmc.hef.dao.configuracion.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.configuracion.domain.Perfil;
import wcmc.hef.dao.configuracion.domain.PerfilKey;
import wcmc.hef.dao.configuracion.domain.PerfilParamDef;

@Service
public interface PerfilMapper {
	
	public List<Perfil> selectByDefaultParameter(PerfilParamDef perfilParamDef);
	public Perfil selectByPrimaryKey(PerfilKey perfilKey);
	public int insertSelective(Perfil perfil);
	public int updateByPrimaryKeySelective(Perfil perfil);
	public int deleteByPrimaryKey(PerfilKey perfilKey);
	
	public int lastSequence();

	
}
