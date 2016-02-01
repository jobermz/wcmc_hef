package wcmc.hef.dao.seguridad.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.seguridad.domain.CuentaUsuario;
import wcmc.hef.dao.seguridad.domain.CuentaUsuarioKey;
import wcmc.hef.dao.seguridad.domain.CuentaUsuarioParamDef;

@Service
public interface CuentaUsuarioMapper {
	
	public List<CuentaUsuario> selectByDefaultParameter(CuentaUsuarioParamDef cuentaUsuarioParamDef);
	public CuentaUsuario selectByPrimaryKey(CuentaUsuarioKey cuentaUsuarioKey);
	public int insertSelective(CuentaUsuario cuentaUsuario);
	public int updateByPrimaryKeySelective(CuentaUsuario cuentaUsuario);
	public int deleteByPrimaryKey(CuentaUsuarioKey cuentaUsuarioKey);
	
	public int lastSequence();

	
}
