package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemConcesionHidroelectricasGeneracionDto;
import wcmc.hef.dao.capa.domain.TemConcesionHidroelectricasGeneracion;

@Service
public interface TemConcesionHidroelectricasGeneracionService {
	
	public List<TemConcesionHidroelectricasGeneracion> buscar(TemConcesionHidroelectricasGeneracionDto temConcesionHidroelectricasGeneracionDto) throws Exception;
	public List<TemConcesionHidroelectricasGeneracion> buscarGeometry(TemConcesionHidroelectricasGeneracionDto temConcesionHidroelectricasGeneracionDto) throws Exception;
	public List<TemConcesionHidroelectricasGeneracion> buscarCombo(TemConcesionHidroelectricasGeneracionDto temConcesionHidroelectricasGeneracionDto) throws Exception;
	public TemConcesionHidroelectricasGeneracion buscarById(TemConcesionHidroelectricasGeneracionDto temConcesionHidroelectricasGeneracionDto) throws Exception;
	public TemConcesionHidroelectricasGeneracion buscarGeometryById(TemConcesionHidroelectricasGeneracionDto temConcesionHidroelectricasGeneracionDto) throws Exception;
	public Integer guardar(TemConcesionHidroelectricasGeneracionDto temConcesionHidroelectricasGeneracionDto) throws Exception;
	public Integer eliminar(TemConcesionHidroelectricasGeneracionDto temConcesionHidroelectricasGeneracionDto) throws Exception;
	
}
