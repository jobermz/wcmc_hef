package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemPrediosRuralesDto;
import wcmc.hef.dao.capa.domain.TemPrediosRurales;

@Service
public interface TemPrediosRuralesService {
	
	public List<TemPrediosRurales> buscar(TemPrediosRuralesDto temPrediosRuralesDto) throws Exception;
	public List<TemPrediosRurales> buscarGeometry(TemPrediosRuralesDto temPrediosRuralesDto) throws Exception;
	public List<TemPrediosRurales> buscarCombo(TemPrediosRuralesDto temPrediosRuralesDto) throws Exception;
	public TemPrediosRurales buscarById(TemPrediosRuralesDto temPrediosRuralesDto) throws Exception;
	public TemPrediosRurales buscarGeometryById(TemPrediosRuralesDto temPrediosRuralesDto) throws Exception;
	public Integer guardar(TemPrediosRuralesDto temPrediosRuralesDto) throws Exception;
	public Integer eliminar(TemPrediosRuralesDto temPrediosRuralesDto) throws Exception;
	
}
