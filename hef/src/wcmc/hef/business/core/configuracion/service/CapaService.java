package wcmc.hef.business.core.configuracion.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.configuracion.dto.CapaDto;
import wcmc.hef.dao.configuracion.domain.Capa;

@Service
public interface CapaService {
	
	public List<Capa> buscar(CapaDto capaDto) throws Exception;
	public List<Capa> buscarConfig(CapaDto capaDto) throws Exception;
	public Capa buscarById(CapaDto capaDto) throws Exception;
	public Integer guardar(CapaDto capaDto) throws Exception;
	public Integer eliminar(CapaDto capaDto) throws Exception;
	
}
