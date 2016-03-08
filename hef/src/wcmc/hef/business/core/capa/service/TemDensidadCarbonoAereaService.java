package wcmc.hef.business.core.capa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import wcmc.hef.business.core.capa.dto.TemDensidadCarbonoAereaDto;
import wcmc.hef.dao.capa.domain.TemDensidadCarbonoAerea;

@Service
public interface TemDensidadCarbonoAereaService {
		
	public List<TemDensidadCarbonoAerea> selectByGeometry(TemDensidadCarbonoAereaDto temDensidadCarbonoAereaDto) throws Exception;
	
}
