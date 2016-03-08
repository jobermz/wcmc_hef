package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemRiesgoErosionHidrica;

@Service
public interface TemRiesgoErosionHidricaMapper {
	
	public List<Double> selectByGeometry(TemRiesgoErosionHidrica temRiesgoErosionHidrica);
	
}
