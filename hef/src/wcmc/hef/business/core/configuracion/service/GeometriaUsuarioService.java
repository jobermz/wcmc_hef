package wcmc.hef.business.core.configuracion.service;

import java.util.List;

import org.springframework.stereotype.Service;

import wcmc.hef.business.core.configuracion.dto.GeometriaUsuarioDto;
import wcmc.hef.dao.configuracion.domain.GeometriaUsuario;

@Service
public interface GeometriaUsuarioService {
	
	public List<GeometriaUsuario> buscar(GeometriaUsuarioDto geometriaUsuarioDto) throws Exception;
	public GeometriaUsuario buscarById(GeometriaUsuarioDto geometriaUsuarioDto) throws Exception;
	public Integer guardar(GeometriaUsuarioDto geometriaUsuarioDto) throws Exception;
	public Integer eliminar(GeometriaUsuarioDto geometriaUsuarioDto) throws Exception;
	public void insert(GeometriaUsuarioDto geometriaUsuarioDto) throws Exception;
	
}
