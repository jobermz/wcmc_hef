package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemSoeconComunidadesCampesinasTotalesDto;
import wcmc.hef.dao.capa.domain.TemSoeconComunidadesCampesinasTotales;

@Service
public interface TemSoeconComunidadesCampesinasTotalesService {
	
	public List<TemSoeconComunidadesCampesinasTotales> buscar(TemSoeconComunidadesCampesinasTotalesDto temSoeconComunidadesCampesinasTotalesDto) throws Exception;
	public List<TemSoeconComunidadesCampesinasTotales> buscarGeometry(TemSoeconComunidadesCampesinasTotalesDto temSoeconComunidadesCampesinasTotalesDto) throws Exception;
	public TemSoeconComunidadesCampesinasTotales buscarById(TemSoeconComunidadesCampesinasTotalesDto temSoeconComunidadesCampesinasTotalesDto) throws Exception;
	public Integer guardar(TemSoeconComunidadesCampesinasTotalesDto temSoeconComunidadesCampesinasTotalesDto) throws Exception;
	public Integer eliminar(TemSoeconComunidadesCampesinasTotalesDto temSoeconComunidadesCampesinasTotalesDto) throws Exception;
	
}
