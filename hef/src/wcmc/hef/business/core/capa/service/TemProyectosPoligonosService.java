package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemProyectosPoligonosDto;
import wcmc.hef.dao.capa.domain.TemProyectosPoligonos;

@Service
public interface TemProyectosPoligonosService {
	
	public List<TemProyectosPoligonos> buscar(TemProyectosPoligonosDto temProyectosPoligonosDto) throws Exception;
	public TemProyectosPoligonos buscarById(TemProyectosPoligonosDto temProyectosPoligonosDto) throws Exception;
	public Integer guardar(TemProyectosPoligonosDto temProyectosPoligonosDto) throws Exception;
	public Integer eliminar(TemProyectosPoligonosDto temProyectosPoligonosDto) throws Exception;
	
}
