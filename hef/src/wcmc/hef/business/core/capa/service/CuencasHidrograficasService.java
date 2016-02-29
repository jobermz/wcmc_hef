package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.CuencasHidrograficasDto;
import wcmc.hef.dao.capa.domain.CuencasHidrograficas;

@Service
public interface CuencasHidrograficasService {
	
	public List<CuencasHidrograficas> buscar(CuencasHidrograficasDto cuencasHidrograficasDto) throws Exception;
	public CuencasHidrograficas buscarById(CuencasHidrograficasDto cuencasHidrograficasDto) throws Exception;
	public Integer guardar(CuencasHidrograficasDto cuencasHidrograficasDto) throws Exception;
	public Integer eliminar(CuencasHidrograficasDto cuencasHidrograficasDto) throws Exception;
	
}
