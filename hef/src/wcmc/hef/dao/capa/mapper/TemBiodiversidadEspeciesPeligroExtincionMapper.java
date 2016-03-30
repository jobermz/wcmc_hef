package wcmc.hef.dao.capa.mapper;

import java.util.List;

import org.springframework.stereotype.Service;

import wcmc.hef.dao.capa.domain.BeanRaster;

@Service
public interface TemBiodiversidadEspeciesPeligroExtincionMapper {

	public BeanRaster selectByGeometry(BeanRaster beanRaster);
	
	public List<Integer> selectRidAfectadosByGeometry(BeanRaster BeanRaster);
	public Integer insertGeometryByRangoAndGeometry(BeanRaster BeanRaster);
	public Integer deleteQueryByUsuario(BeanRaster BeanRaster);
	
}
