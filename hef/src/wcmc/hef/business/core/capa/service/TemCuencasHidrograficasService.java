package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemCuencasHidrograficasDto;
import wcmc.hef.dao.capa.domain.TemCuencasHidrograficas;

@Service
public interface TemCuencasHidrograficasService {
	
	public List<TemCuencasHidrograficas> buscar(TemCuencasHidrograficasDto temCuencasHidrograficasDto) throws Exception;
	public TemCuencasHidrograficas buscarById(TemCuencasHidrograficasDto temCuencasHidrograficasDto) throws Exception;
	public Integer guardar(TemCuencasHidrograficasDto temCuencasHidrograficasDto) throws Exception;
	public Integer eliminar(TemCuencasHidrograficasDto temCuencasHidrograficasDto) throws Exception;
	
}
