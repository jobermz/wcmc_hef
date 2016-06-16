package wcmc.hef.business.core.capa.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wcmc.hef.business.core.capa.dto.BeanRasterDto;
import wcmc.hef.business.core.capa.service.TemPerdidaBosque20012014Service;
import wcmc.hef.dao.capa.domain.BeanRaster;
import wcmc.hef.dao.capa.mapper.TemPerdidaBosque20012014Mapper;

@Service
public class TemPerdidaBosque20012014ServiceImpl implements TemPerdidaBosque20012014Service {
	@Autowired
	private TemPerdidaBosque20012014Mapper temPerdidaBosque20012014Mapper;

	public BeanRaster selectByGeometry(BeanRasterDto beanRasterDto) throws Exception {
		BeanRaster beanRaster		= new BeanRaster();
		BeanUtils.copyProperties(beanRasterDto, beanRaster);
		BeanRaster	 bean	= temPerdidaBosque20012014Mapper.selectByGeometry(beanRaster);
		return bean;
	}
	
	public List<Integer> selectRidAfectadosByGeometry(BeanRasterDto beanRasterDto) throws Exception {
		BeanRaster beanRaster		= new BeanRaster();
		BeanUtils.copyProperties(beanRasterDto, beanRaster);
		List<Integer> listRids	= temPerdidaBosque20012014Mapper.selectRidAfectadosByGeometry(beanRaster);
		return listRids;
	}
	
	public void insertGeometryByRangoAndGeometry(BeanRasterDto beanRasterDto) throws Exception {
		BeanRaster beanRaster		= new BeanRaster();
		BeanUtils.copyProperties(beanRasterDto, beanRaster);
		temPerdidaBosque20012014Mapper.insertGeometryByRangoAndGeometry(beanRaster);
	}
	
	public void deleteQueryByUsuario(BeanRasterDto beanRasterDto) throws Exception {
		BeanRaster beanRaster		= new BeanRaster();
		BeanUtils.copyProperties(beanRasterDto, beanRaster);
		temPerdidaBosque20012014Mapper.deleteQueryByUsuario(beanRaster);
	}
	
}
