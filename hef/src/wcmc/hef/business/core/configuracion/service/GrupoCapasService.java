package wcmc.hef.business.core.configuracion.service;

import java.util.List;

import org.springframework.stereotype.Service;

import wcmc.hef.business.core.configuracion.dto.GrupoCapasDto;
import wcmc.hef.dao.configuracion.domain.GrupoCapas;

@Service
public interface GrupoCapasService {
	
	public List<GrupoCapas> buscar(GrupoCapasDto grupoCapasDto) throws Exception;
	public List<GrupoCapas> buscarGruposBase(GrupoCapasDto grupoCapasDto) throws Exception;
	public List<GrupoCapas> buscarTodos(GrupoCapasDto grupoCapasDto) throws Exception;
	public GrupoCapas buscarById(GrupoCapasDto grupoCapasDto) throws Exception;
	public Integer guardar(GrupoCapasDto grupoCapasDto) throws Exception;
	public Integer eliminar(GrupoCapasDto grupoCapasDto) throws Exception;
	
}
