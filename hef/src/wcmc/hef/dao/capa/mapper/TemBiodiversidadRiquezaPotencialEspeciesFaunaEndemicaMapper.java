package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemica;

@Service
public interface TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaMapper {
	
	public List<Double> selectByGeometry(TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemica temBiodiversidadRiquezaPotencialEspeciesFaunaEndemica);
	
}
