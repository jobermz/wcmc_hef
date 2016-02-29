package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemSoeconConcesionesElectricasDistribucionDto;
import wcmc.hef.business.core.capa.service.TemSoeconConcesionesElectricasDistribucionService;
import wcmc.hef.dao.capa.domain.TemSoeconConcesionesElectricasDistribucion;
import wcmc.hef.dao.capa.domain.TemSoeconConcesionesElectricasDistribucionParamDef;
import wcmc.hef.dao.capa.domain.TemSoeconConcesionesElectricasDistribucionParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemSoeconConcesionesElectricasDistribucionMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemSoeconConcesionesElectricasDistribucionServiceImpl implements TemSoeconConcesionesElectricasDistribucionService {
	@Autowired
	private TemSoeconConcesionesElectricasDistribucionMapper temSoeconConcesionesElectricasDistribucionMapper;
	public List<TemSoeconConcesionesElectricasDistribucion> buscar(TemSoeconConcesionesElectricasDistribucionDto temSoeconConcesionesElectricasDistribucionDto) throws Exception {
		TemSoeconConcesionesElectricasDistribucionParamDef temSoeconConcesionesElectricasDistribucionParamDef		= new TemSoeconConcesionesElectricasDistribucionParamDef();
		
		Criteria criteria		= temSoeconConcesionesElectricasDistribucionParamDef.createCriteria();
		if(temSoeconConcesionesElectricasDistribucionDto != null) {
		}
		
		List<TemSoeconConcesionesElectricasDistribucion>	 list	= temSoeconConcesionesElectricasDistribucionMapper.selectByDefaultParameter(temSoeconConcesionesElectricasDistribucionParamDef);
		return list;
	}
	
	public TemSoeconConcesionesElectricasDistribucion buscarById(TemSoeconConcesionesElectricasDistribucionDto temSoeconConcesionesElectricasDistribucionDto) throws Exception {
		TemSoeconConcesionesElectricasDistribucion temSoeconConcesionesElectricasDistribucion		= new TemSoeconConcesionesElectricasDistribucion();
		BeanUtils.copyProperties(temSoeconConcesionesElectricasDistribucionDto, temSoeconConcesionesElectricasDistribucion);
		return temSoeconConcesionesElectricasDistribucionMapper.selectByPrimaryKey(temSoeconConcesionesElectricasDistribucion);
	}
	
	@Transactional
	public Integer guardar(TemSoeconConcesionesElectricasDistribucionDto temSoeconConcesionesElectricasDistribucionDto) throws Exception {
		TemSoeconConcesionesElectricasDistribucion temSoeconConcesionesElectricasDistribucion		= new TemSoeconConcesionesElectricasDistribucion();
		BeanUtils.copyProperties(temSoeconConcesionesElectricasDistribucionDto, temSoeconConcesionesElectricasDistribucion);
		int rs	= 0;
		TemSoeconConcesionesElectricasDistribucion exiteTemSoeconConcesionesElectricasDistribucion		= temSoeconConcesionesElectricasDistribucionMapper.selectByPrimaryKey(temSoeconConcesionesElectricasDistribucion);
		if(exiteTemSoeconConcesionesElectricasDistribucion != null) {
			rs	= temSoeconConcesionesElectricasDistribucionMapper.updateByPrimaryKeySelective(temSoeconConcesionesElectricasDistribucion);
		} else {
			rs	= temSoeconConcesionesElectricasDistribucionMapper.insertSelective(temSoeconConcesionesElectricasDistribucion);
			

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemSoeconConcesionesElectricasDistribucionDto temSoeconConcesionesElectricasDistribucionDto) throws Exception {
		TemSoeconConcesionesElectricasDistribucion temSoeconConcesionesElectricasDistribucion		= new TemSoeconConcesionesElectricasDistribucion();
		BeanUtils.copyProperties(temSoeconConcesionesElectricasDistribucionDto, temSoeconConcesionesElectricasDistribucion);
		Integer rs	= temSoeconConcesionesElectricasDistribucionMapper.deleteByPrimaryKey(temSoeconConcesionesElectricasDistribucion);
		return rs;
	}
	
}
