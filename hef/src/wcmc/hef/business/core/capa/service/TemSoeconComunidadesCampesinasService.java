package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemSoeconComunidadesCampesinasDto;
import wcmc.hef.dao.capa.domain.TemSoeconComunidadesCampesinas;

@Service
public interface TemSoeconComunidadesCampesinasService {
	
	public List<TemSoeconComunidadesCampesinas> buscar(TemSoeconComunidadesCampesinasDto temSoeconComunidadesCampesinasDto) throws Exception;
	public List<TemSoeconComunidadesCampesinas> buscarGeometry(TemSoeconComunidadesCampesinasDto temSoeconComunidadesCampesinasDto) throws Exception;
	public List<TemSoeconComunidadesCampesinas> buscarCombo(TemSoeconComunidadesCampesinasDto temSoeconComunidadesCampesinasDto) throws Exception;
	public TemSoeconComunidadesCampesinas buscarById(TemSoeconComunidadesCampesinasDto temSoeconComunidadesCampesinasDto) throws Exception;
	public TemSoeconComunidadesCampesinas buscarGeometryById(TemSoeconComunidadesCampesinasDto temSoeconComunidadesCampesinasDto) throws Exception;
	public Integer guardar(TemSoeconComunidadesCampesinasDto temSoeconComunidadesCampesinasDto) throws Exception;
	public Integer eliminar(TemSoeconComunidadesCampesinasDto temSoeconComunidadesCampesinasDto) throws Exception;
	
}
