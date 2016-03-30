package wcmc.hef.business.core.capa.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wcmc.hef.business.core.capa.dto.BeanRasterDto;
import wcmc.hef.business.core.capa.service.TemDensidadCarbonoAereaService;
import wcmc.hef.dao.capa.domain.BeanRaster;
import wcmc.hef.dao.capa.mapper.TemDensidadCarbonoAereaMapper;

@Service
public class TemDensidadCarbonoAereaServiceImpl implements TemDensidadCarbonoAereaService {
	@Autowired
	private TemDensidadCarbonoAereaMapper temDensidadCarbonoAereaMapper;

	public BeanRaster selectByGeometry(BeanRasterDto beanRasterDto) throws Exception {
		BeanRaster beanRaster		= new BeanRaster();
		BeanUtils.copyProperties(beanRasterDto, beanRaster);
		BeanRaster	 bean	= temDensidadCarbonoAereaMapper.selectByGeometry(beanRaster);
		return bean;
	}
	
	public List<Integer> selectRidAfectadosByGeometry(BeanRasterDto beanRasterDto) throws Exception {
		BeanRaster beanRaster		= new BeanRaster();
		BeanUtils.copyProperties(beanRasterDto, beanRaster);
		List<Integer> listRids	= temDensidadCarbonoAereaMapper.selectRidAfectadosByGeometry(beanRaster);
		return listRids;
	}
	
	public void insertGeometryByRangoAndGeometry(BeanRasterDto beanRasterDto) throws Exception {
		BeanRaster beanRaster		= new BeanRaster();
		BeanUtils.copyProperties(beanRasterDto, beanRaster);
		temDensidadCarbonoAereaMapper.insertGeometryByRangoAndGeometry(beanRaster);
	}
	
	public void deleteQueryByUsuario(BeanRasterDto beanRasterDto) throws Exception {
		BeanRaster beanRaster		= new BeanRaster();
		BeanUtils.copyProperties(beanRasterDto, beanRaster);
		temDensidadCarbonoAereaMapper.deleteQueryByUsuario(beanRaster);
	}
	
}
