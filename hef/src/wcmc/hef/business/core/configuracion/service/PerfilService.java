package wcmc.hef.business.core.configuracion.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.configuracion.dto.PerfilDto;
import wcmc.hef.dao.configuracion.domain.Perfil;

@Service
public interface PerfilService {
	
	public List<Perfil> buscar(PerfilDto perfilDto) throws Exception;
	public Perfil buscarById(PerfilDto perfilDto) throws Exception;
	public Integer guardar(PerfilDto perfilDto) throws Exception;
	public Integer eliminar(PerfilDto perfilDto) throws Exception;
	
}
