package wcmc.hef.business.core.configuracion.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.configuracion.dto.CampoMetadataDto;
import wcmc.hef.dao.configuracion.domain.CampoMetadata;

@Service
public interface CampoMetadataService {
	
	public List<CampoMetadata> buscar(CampoMetadataDto campoMetadataDto) throws Exception;
	public CampoMetadata buscarById(CampoMetadataDto campoMetadataDto) throws Exception;
	public Integer guardar(CampoMetadataDto campoMetadataDto) throws Exception;
	public Integer eliminar(CampoMetadataDto campoMetadataDto) throws Exception;
	
}
