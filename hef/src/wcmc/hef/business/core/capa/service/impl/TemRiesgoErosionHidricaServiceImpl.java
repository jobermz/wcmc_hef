package wcmc.hef.business.core.capa.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.BeanRasterDto;
import wcmc.hef.business.core.capa.service.TemRiesgoErosionHidricaService;
import wcmc.hef.dao.capa.domain.BeanRaster;
import wcmc.hef.dao.capa.mapper.TemRiesgoErosionHidricaMapper;

@Service
public class TemRiesgoErosionHidricaServiceImpl implements TemRiesgoErosionHidricaService {
	@Autowired
	private TemRiesgoErosionHidricaMapper temRiesgoErosionHidricaMapper;
	
	public BeanRaster selectByGeometry(BeanRasterDto beanRasterDto) throws Exception {
		BeanRaster beanRaster		= new BeanRaster();
		BeanUtils.copyProperties(beanRasterDto, beanRaster);
		BeanRaster	 bean	= temRiesgoErosionHidricaMapper.selectByGeometry(beanRaster);
		return bean;
	}

	public String selectGeometryByRangoAndGeometry(BeanRasterDto beanRasterDto) throws Exception {
		BeanRaster beanRaster		= new BeanRaster();
		BeanUtils.copyProperties(beanRasterDto, beanRaster);
		String strGeometriaRespuesta	= temRiesgoErosionHidricaMapper.selectGeometryByRangoAndGeometry(beanRaster);
		return strGeometriaRespuesta;
	}
	
}
