package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.ViaFerreaDto;
import wcmc.hef.dao.capa.domain.ViaFerrea;

@Service
public interface ViaFerreaService {
	
	public List<ViaFerrea> buscar(ViaFerreaDto viaFerreaDto) throws Exception;
	public ViaFerrea buscarById(ViaFerreaDto viaFerreaDto) throws Exception;
	public Integer guardar(ViaFerreaDto viaFerreaDto) throws Exception;
	public Integer eliminar(ViaFerreaDto viaFerreaDto) throws Exception;
	
}
