package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemProyeccionDensidadPob2015Dto;
import wcmc.hef.dao.capa.domain.TemProyeccionDensidadPob2015;

@Service
public interface TemProyeccionDensidadPob2015Service {
	
	public List<TemProyeccionDensidadPob2015> buscar(TemProyeccionDensidadPob2015Dto temProyeccionDensidadPob2015Dto) throws Exception;
	public List<TemProyeccionDensidadPob2015> buscarGeometry(TemProyeccionDensidadPob2015Dto temProyeccionDensidadPob2015Dto) throws Exception;
	public List<TemProyeccionDensidadPob2015> buscarCombo(TemProyeccionDensidadPob2015Dto temProyeccionDensidadPob2015Dto) throws Exception;
	public TemProyeccionDensidadPob2015 buscarById(TemProyeccionDensidadPob2015Dto temProyeccionDensidadPob2015Dto) throws Exception;
	public TemProyeccionDensidadPob2015 buscarGeometryById(TemProyeccionDensidadPob2015Dto temProyeccionDensidadPob2015Dto) throws Exception;
	public Integer guardar(TemProyeccionDensidadPob2015Dto temProyeccionDensidadPob2015Dto) throws Exception;
	public Integer eliminar(TemProyeccionDensidadPob2015Dto temProyeccionDensidadPob2015Dto) throws Exception;
	
}
