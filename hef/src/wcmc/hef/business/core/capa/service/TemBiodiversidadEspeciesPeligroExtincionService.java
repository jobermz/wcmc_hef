package wcmc.hef.business.core.capa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import wcmc.hef.business.core.capa.dto.BeanRasterDto;
import wcmc.hef.dao.capa.domain.BeanRaster;

@Service
public interface TemBiodiversidadEspeciesPeligroExtincionService {

	public BeanRaster selectByGeometry(BeanRasterDto beanRasterDto) throws Exception;
	public String selectGeometryByRangoAndGeometry(BeanRasterDto beanRasterDto) throws Exception;
	
}
