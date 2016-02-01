package wcmc.hef.business.core.visor.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.visor.dto.CapaDepartamentoDto;
import wcmc.hef.dao.visor.domain.CapaDepartamento;

@Service
public interface CapaDepartamentoService {
	
	public List<CapaDepartamento> buscar(CapaDepartamentoDto capaDepartamentoDto) throws Exception;
	public CapaDepartamento buscarById(CapaDepartamentoDto capaDepartamentoDto) throws Exception;
	public Integer guardar(CapaDepartamentoDto capaDepartamentoDto) throws Exception;
	public Integer eliminar(CapaDepartamentoDto capaDepartamentoDto) throws Exception;
	
}
