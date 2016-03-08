package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemClaveBiodiversidadDto;
import wcmc.hef.dao.capa.domain.TemClaveBiodiversidad;

@Service
public interface TemClaveBiodiversidadService {
	
	public List<TemClaveBiodiversidad> buscar(TemClaveBiodiversidadDto temClaveBiodiversidadDto) throws Exception;
	public List<TemClaveBiodiversidad> buscarGeometry(TemClaveBiodiversidadDto temClaveBiodiversidadDto) throws Exception;
	public TemClaveBiodiversidad buscarById(TemClaveBiodiversidadDto temClaveBiodiversidadDto) throws Exception;
	public Integer guardar(TemClaveBiodiversidadDto temClaveBiodiversidadDto) throws Exception;
	public Integer eliminar(TemClaveBiodiversidadDto temClaveBiodiversidadDto) throws Exception;
	
}
