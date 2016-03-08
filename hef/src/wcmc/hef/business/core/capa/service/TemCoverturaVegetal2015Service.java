package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemCoverturaVegetal2015Dto;
import wcmc.hef.dao.capa.domain.TemCoverturaVegetal2015;

@Service
public interface TemCoverturaVegetal2015Service {
	
	public List<TemCoverturaVegetal2015> buscar(TemCoverturaVegetal2015Dto temCoverturaVegetal2015Dto) throws Exception;
	public List<TemCoverturaVegetal2015> buscarGeometry(TemCoverturaVegetal2015Dto temCoverturaVegetal2015Dto) throws Exception;
	public TemCoverturaVegetal2015 buscarById(TemCoverturaVegetal2015Dto temCoverturaVegetal2015Dto) throws Exception;
	public Integer guardar(TemCoverturaVegetal2015Dto temCoverturaVegetal2015Dto) throws Exception;
	public Integer eliminar(TemCoverturaVegetal2015Dto temCoverturaVegetal2015Dto) throws Exception;
	
}
