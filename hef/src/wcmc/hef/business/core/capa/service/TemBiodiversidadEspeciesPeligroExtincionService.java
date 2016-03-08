package wcmc.hef.business.core.capa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import wcmc.hef.business.core.capa.dto.TemBiodiversidadEspeciesPeligroExtincionDto;
import wcmc.hef.dao.capa.domain.TemBiodiversidadEspeciesPeligroExtincion;

@Service
public interface TemBiodiversidadEspeciesPeligroExtincionService {
	
	public List<TemBiodiversidadEspeciesPeligroExtincion> selectByGeometry(TemBiodiversidadEspeciesPeligroExtincionDto temBiodiversidadEspeciesPeligroExtincionDto) throws Exception;
	
}
