package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.BasLimDepartamentoDto;
import wcmc.hef.dao.capa.domain.BasLimDepartamento;

@Service
public interface BasLimDepartamentoService {
	
	public List<BasLimDepartamento> buscar(BasLimDepartamentoDto basLimDepartamentoDto) throws Exception;
	public List<BasLimDepartamento> buscarGeometry(BasLimDepartamentoDto basLimDepartamentoDto) throws Exception;
	public List<BasLimDepartamento> buscarCombo(BasLimDepartamentoDto basLimDepartamentoDto) throws Exception;
	public BasLimDepartamento buscarById(BasLimDepartamentoDto basLimDepartamentoDto) throws Exception;
	public BasLimDepartamento buscarGeometryById(BasLimDepartamentoDto basLimDepartamentoDto) throws Exception;
	public Integer guardar(BasLimDepartamentoDto basLimDepartamentoDto) throws Exception;
	public Integer eliminar(BasLimDepartamentoDto basLimDepartamentoDto) throws Exception;
	
}
