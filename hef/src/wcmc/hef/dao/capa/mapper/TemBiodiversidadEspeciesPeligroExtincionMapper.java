package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemBiodiversidadEspeciesPeligroExtincion;

@Service
public interface TemBiodiversidadEspeciesPeligroExtincionMapper {
	
	public List<Double> selectByGeometry(TemBiodiversidadEspeciesPeligroExtincion temBiodiversidadEspeciesPeligroExtincion);
	
}
