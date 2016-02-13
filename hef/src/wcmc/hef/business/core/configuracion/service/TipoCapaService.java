package wcmc.hef.business.core.configuracion.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.configuracion.dto.TipoCapaDto;
import wcmc.hef.dao.configuracion.domain.TipoCapa;

@Service
public interface TipoCapaService {
	
	public List<TipoCapa> buscar(TipoCapaDto tipoCapaDto) throws Exception;
	public TipoCapa buscarById(TipoCapaDto tipoCapaDto) throws Exception;
	public Integer guardar(TipoCapaDto tipoCapaDto) throws Exception;
	public Integer eliminar(TipoCapaDto tipoCapaDto) throws Exception;
	
}
