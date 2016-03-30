package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.BeanRasterDto;
import wcmc.hef.dao.capa.domain.BeanRaster;

@Service
public interface TemDensidadCarbonoAereaService {
	
	public BeanRaster selectByGeometry(BeanRasterDto beanRasterDto) throws Exception;
	
	public List<Integer> selectRidAfectadosByGeometry(BeanRasterDto beanRasterDto) throws Exception;
	
	public void insertGeometryByRangoAndGeometry(BeanRasterDto beanRasterDto) throws Exception;
	
	public void deleteQueryByUsuario(BeanRasterDto beanRasterDto) throws Exception;
	
}
