package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.ProyectosPuntosDto;
import wcmc.hef.dao.capa.domain.ProyectosPuntos;

@Service
public interface ProyectosPuntosService {
	
	public List<ProyectosPuntos> buscar(ProyectosPuntosDto proyectosPuntosDto) throws Exception;
	public ProyectosPuntos buscarById(ProyectosPuntosDto proyectosPuntosDto) throws Exception;
	public Integer guardar(ProyectosPuntosDto proyectosPuntosDto) throws Exception;
	public Integer eliminar(ProyectosPuntosDto proyectosPuntosDto) throws Exception;
	
}
