package wcmc.hef.business.core.capa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import wcmc.hef.business.core.capa.dto.TemRiesgoErosionHidricaDto;
import wcmc.hef.dao.capa.domain.TemRiesgoErosionHidrica;

@Service
public interface TemRiesgoErosionHidricaService {
	
	public List<TemRiesgoErosionHidrica> selectByGeometry(TemRiesgoErosionHidricaDto temRiesgoErosionHidricaDto) throws Exception;
	
}
