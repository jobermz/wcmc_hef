package wcmc.hef.business.core.capa.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.BeanRasterDto;
import wcmc.hef.business.core.capa.service.TemBiodiversidadEspeciesPeligroExtincionService;
import wcmc.hef.dao.capa.domain.BeanRaster;
import wcmc.hef.dao.capa.mapper.TemBiodiversidadEspeciesPeligroExtincionMapper;

@Service
public class TemBiodiversidadEspeciesPeligroExtincionServiceImpl implements TemBiodiversidadEspeciesPeligroExtincionService {
	@Autowired
	private TemBiodiversidadEspeciesPeligroExtincionMapper temBiodiversidadEspeciesPeligroExtincionMapper;
	
	public BeanRaster selectByGeometry(BeanRasterDto beanRasterDto) throws Exception {
		BeanRaster beanRaster		= new BeanRaster();
		BeanUtils.copyProperties(beanRasterDto, beanRaster);
		BeanRaster	 bean	= temBiodiversidadEspeciesPeligroExtincionMapper.selectByGeometry(beanRaster);
		return bean;
	}

	public String selectGeometryByRangoAndGeometry(BeanRasterDto beanRasterDto) throws Exception {
		BeanRaster beanRaster		= new BeanRaster();
		BeanUtils.copyProperties(beanRasterDto, beanRaster);
		String strGeometriaRespuesta	= temBiodiversidadEspeciesPeligroExtincionMapper.selectGeometryByRangoAndGeometry(beanRaster);
		return strGeometriaRespuesta;
	}
	
}
