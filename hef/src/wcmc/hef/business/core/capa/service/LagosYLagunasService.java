package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.LagosYLagunasDto;
import wcmc.hef.dao.capa.domain.LagosYLagunas;

@Service
public interface LagosYLagunasService {
	
	public List<LagosYLagunas> buscar(LagosYLagunasDto lagosYLagunasDto) throws Exception;
	public LagosYLagunas buscarById(LagosYLagunasDto lagosYLagunasDto) throws Exception;
	public Integer guardar(LagosYLagunasDto lagosYLagunasDto) throws Exception;
	public Integer eliminar(LagosYLagunasDto lagosYLagunasDto) throws Exception;
	
}
