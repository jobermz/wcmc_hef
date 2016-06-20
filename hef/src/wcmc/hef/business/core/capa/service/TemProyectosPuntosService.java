package wcmc.hef.business.core.capa.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import wcmc.hef.business.core.capa.dto.TemProyectosPuntosDto;
import wcmc.hef.dao.capa.domain.TemProyectosPuntos;

@Service
public interface TemProyectosPuntosService {
	
	public List<TemProyectosPuntos> buscar(TemProyectosPuntosDto temProyectosPuntosDto) throws Exception;
	public List<TemProyectosPuntos> buscarGeometry(TemProyectosPuntosDto temProyectosPuntosDto) throws Exception;
	public List<TemProyectosPuntos> buscarCombo(TemProyectosPuntosDto temProyectosPuntosDto) throws Exception;
	public TemProyectosPuntos buscarById(TemProyectosPuntosDto temProyectosPuntosDto) throws Exception;
	public TemProyectosPuntos buscarGeometryById(TemProyectosPuntosDto temProyectosPuntosDto) throws Exception;
	public Integer guardar(TemProyectosPuntosDto temProyectosPuntosDto) throws Exception;
	public Integer eliminar(TemProyectosPuntosDto temProyectosPuntosDto) throws Exception;

	public List<Map> selectAnioDesde() throws Exception;
	public List<Map> selectAnioHasta() throws Exception;
	public List<Map> selectGroupByCoperante() throws Exception;
	public List<Map> selectGroupByAdministra() throws Exception;
	public List<Map> selectDepartamentos() throws Exception;
	
}
