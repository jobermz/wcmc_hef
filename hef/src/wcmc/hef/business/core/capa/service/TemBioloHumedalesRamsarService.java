package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemBioloHumedalesRamsarDto;
import wcmc.hef.dao.capa.domain.TemBioloHumedalesRamsar;

@Service
public interface TemBioloHumedalesRamsarService {
	
	public List<TemBioloHumedalesRamsar> buscar(TemBioloHumedalesRamsarDto temBioloHumedalesRamsarDto) throws Exception;
	public TemBioloHumedalesRamsar buscarById(TemBioloHumedalesRamsarDto temBioloHumedalesRamsarDto) throws Exception;
	public Integer guardar(TemBioloHumedalesRamsarDto temBioloHumedalesRamsarDto) throws Exception;
	public Integer eliminar(TemBioloHumedalesRamsarDto temBioloHumedalesRamsarDto) throws Exception;
	
}
