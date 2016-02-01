package wcmc.hef.business.core.seguridad.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.seguridad.dto.CuentaUsuarioDto;
import wcmc.hef.dao.seguridad.domain.CuentaUsuario;

@Service
public interface CuentaUsuarioService {
	
	public List<CuentaUsuario> buscar(CuentaUsuarioDto cuentaUsuarioDto) throws Exception;
	public CuentaUsuario buscarById(CuentaUsuarioDto cuentaUsuarioDto) throws Exception;
	public Integer guardar(CuentaUsuarioDto cuentaUsuarioDto) throws Exception;
	public Integer eliminar(CuentaUsuarioDto cuentaUsuarioDto) throws Exception;
	
}
