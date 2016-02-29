package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.ProyectosPoligonosDto;
import wcmc.hef.dao.capa.domain.ProyectosPoligonos;

@Service
public interface ProyectosPoligonosService {
	
	public List<ProyectosPoligonos> buscar(ProyectosPoligonosDto proyectosPoligonosDto) throws Exception;
	public ProyectosPoligonos buscarById(ProyectosPoligonosDto proyectosPoligonosDto) throws Exception;
	public Integer guardar(ProyectosPoligonosDto proyectosPoligonosDto) throws Exception;
	public Integer eliminar(ProyectosPoligonosDto proyectosPoligonosDto) throws Exception;
	
}
