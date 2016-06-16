package wcmc.hef.business.core.capa.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wcmc.hef.business.core.capa.dto.BeanRasterDto;
import wcmc.hef.business.core.capa.service.TemCoberturaBoscosa2014Service;
import wcmc.hef.dao.capa.domain.BeanRaster;
import wcmc.hef.dao.capa.mapper.TemCoberturaBoscosa2014Mapper;

@Service
public class TemCoberturaBoscosa2014ServiceImpl implements TemCoberturaBoscosa2014Service {
	@Autowired
	private TemCoberturaBoscosa2014Mapper temCoberturaBoscosa2014Mapper;

	public BeanRaster selectByGeometry(BeanRasterDto beanRasterDto) throws Exception {
		BeanRaster beanRaster		= new BeanRaster();
		BeanUtils.copyProperties(beanRasterDto, beanRaster);
		BeanRaster	 bean	= temCoberturaBoscosa2014Mapper.selectByGeometry(beanRaster);
		return bean;
	}
	
	public List<Integer> selectRidAfectadosByGeometry(BeanRasterDto beanRasterDto) throws Exception {
		BeanRaster beanRaster		= new BeanRaster();
		BeanUtils.copyProperties(beanRasterDto, beanRaster);
		List<Integer> listRids	= temCoberturaBoscosa2014Mapper.selectRidAfectadosByGeometry(beanRaster);
		return listRids;
	}
	
	public void insertGeometryByRangoAndGeometry(BeanRasterDto beanRasterDto) throws Exception {
		BeanRaster beanRaster		= new BeanRaster();
		BeanUtils.copyProperties(beanRasterDto, beanRaster);
		temCoberturaBoscosa2014Mapper.insertGeometryByRangoAndGeometry(beanRaster);
	}
	
	public void deleteQueryByUsuario(BeanRasterDto beanRasterDto) throws Exception {
		BeanRaster beanRaster		= new BeanRaster();
		BeanUtils.copyProperties(beanRasterDto, beanRaster);
		temCoberturaBoscosa2014Mapper.deleteQueryByUsuario(beanRaster);
	}
	
}
