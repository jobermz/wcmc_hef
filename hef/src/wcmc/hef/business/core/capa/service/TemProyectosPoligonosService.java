package wcmc.hef.business.core.capa.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import wcmc.hef.business.core.capa.dto.TemProyectosPoligonosDto;
import wcmc.hef.dao.capa.domain.TemProyectosPoligonos;

@Service
public interface TemProyectosPoligonosService {
	
	public List<TemProyectosPoligonos> buscar(TemProyectosPoligonosDto temProyectosPoligonosDto) throws Exception;
	public List<TemProyectosPoligonos> buscarGeometry(TemProyectosPoligonosDto temProyectosPoligonosDto) throws Exception;
	public List<TemProyectosPoligonos> buscarCombo(TemProyectosPoligonosDto temProyectosPoligonosDto) throws Exception;
	public TemProyectosPoligonos buscarById(TemProyectosPoligonosDto temProyectosPoligonosDto) throws Exception;
	public TemProyectosPoligonos buscarGeometryById(TemProyectosPoligonosDto temProyectosPoligonosDto) throws Exception;
	public Integer guardar(TemProyectosPoligonosDto temProyectosPoligonosDto) throws Exception;
	public Integer eliminar(TemProyectosPoligonosDto temProyectosPoligonosDto) throws Exception;
	
	public List<Map> selectAnioDesde() throws Exception;
	public List<Map> selectAnioHasta() throws Exception;
	public List<Map> selectGroupByCoperante() throws Exception;
	public List<Map> selectGroupByAdministra() throws Exception;
	public List<Map> selectDepartamentos() throws Exception;
	
}
