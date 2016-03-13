package wcmc.hef.business.core.capa.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.BeanRasterDto;
import wcmc.hef.business.core.capa.service.TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaService;
import wcmc.hef.dao.capa.domain.BeanRaster;
import wcmc.hef.dao.capa.mapper.TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaMapper;

@Service
public class TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaServiceImpl implements TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaService {
	@Autowired
	private TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaMapper temBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaMapper;

	public BeanRaster selectByGeometry(BeanRasterDto beanRasterDto) throws Exception {
		BeanRaster beanRaster		= new BeanRaster();
		BeanUtils.copyProperties(beanRasterDto, beanRaster);
		BeanRaster	 bean	= temBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaMapper.selectByGeometry(beanRaster);
		return bean;
	}

	public String selectGeometryByRangoAndGeometry(BeanRasterDto beanRasterDto) throws Exception {
		BeanRaster beanRaster		= new BeanRaster();
		BeanUtils.copyProperties(beanRasterDto, beanRaster);
		String strGeometriaRespuesta	= temBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaMapper.selectGeometryByRangoAndGeometry(beanRaster);
		return strGeometriaRespuesta;
	}
	
}
