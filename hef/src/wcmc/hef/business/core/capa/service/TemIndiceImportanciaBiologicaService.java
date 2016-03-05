package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemIndiceImportanciaBiologicaDto;
import wcmc.hef.dao.capa.domain.TemIndiceImportanciaBiologica;

@Service
public interface TemIndiceImportanciaBiologicaService {
	
	public List<TemIndiceImportanciaBiologica> buscar(TemIndiceImportanciaBiologicaDto temIndiceImportanciaBiologicaDto) throws Exception;
	public TemIndiceImportanciaBiologica buscarById(TemIndiceImportanciaBiologicaDto temIndiceImportanciaBiologicaDto) throws Exception;
	public Integer guardar(TemIndiceImportanciaBiologicaDto temIndiceImportanciaBiologicaDto) throws Exception;
	public Integer eliminar(TemIndiceImportanciaBiologicaDto temIndiceImportanciaBiologicaDto) throws Exception;
	
}
