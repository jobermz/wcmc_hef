package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemDensidadCarbonoAerea;

@Service
public interface TemDensidadCarbonoAereaMapper {
	
	public List<Double> selectByGeometry(TemDensidadCarbonoAerea temDensidadCarbonoAerea);
	
}
