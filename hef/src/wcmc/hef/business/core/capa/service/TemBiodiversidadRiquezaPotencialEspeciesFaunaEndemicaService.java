package wcmc.hef.business.core.capa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import wcmc.hef.business.core.capa.dto.TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaDto;
import wcmc.hef.dao.capa.domain.TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemica;

@Service
public interface TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaService {
	
	public List<TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemica> selectByGeometry(TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaDto temBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaDto) throws Exception;
	
}
