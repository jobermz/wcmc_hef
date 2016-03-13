package wcmc.hef.dao.capa.mapper;

import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.BeanRaster;

@Service
public interface TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaMapper {

	public BeanRaster selectByGeometry(BeanRaster beanRaster);
	public String selectGeometryByRangoAndGeometry(BeanRaster BeanRaster);
	
}