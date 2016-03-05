package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemConcesionHidroelectricasDistribucionDto;
import wcmc.hef.business.core.capa.service.TemConcesionHidroelectricasDistribucionService;
import wcmc.hef.dao.capa.domain.TemConcesionHidroelectricasDistribucion;
import wcmc.hef.dao.capa.domain.TemConcesionHidroelectricasDistribucionParamDef;
import wcmc.hef.dao.capa.domain.TemConcesionHidroelectricasDistribucionParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemConcesionHidroelectricasDistribucionMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemConcesionHidroelectricasDistribucionServiceImpl implements TemConcesionHidroelectricasDistribucionService {
	@Autowired
	private TemConcesionHidroelectricasDistribucionMapper temConcesionHidroelectricasDistribucionMapper;
	public List<TemConcesionHidroelectricasDistribucion> buscar(TemConcesionHidroelectricasDistribucionDto temConcesionHidroelectricasDistribucionDto) throws Exception {
		TemConcesionHidroelectricasDistribucionParamDef temConcesionHidroelectricasDistribucionParamDef		= new TemConcesionHidroelectricasDistribucionParamDef();
		
		Criteria criteria		= temConcesionHidroelectricasDistribucionParamDef.createCriteria();
		if(temConcesionHidroelectricasDistribucionDto != null) {
		}
		
		List<TemConcesionHidroelectricasDistribucion>	 list	= temConcesionHidroelectricasDistribucionMapper.selectByDefaultParameter(temConcesionHidroelectricasDistribucionParamDef);
		return list;
	}
	
	public TemConcesionHidroelectricasDistribucion buscarById(TemConcesionHidroelectricasDistribucionDto temConcesionHidroelectricasDistribucionDto) throws Exception {
		TemConcesionHidroelectricasDistribucion temConcesionHidroelectricasDistribucion		= new TemConcesionHidroelectricasDistribucion();
		BeanUtils.copyProperties(temConcesionHidroelectricasDistribucionDto, temConcesionHidroelectricasDistribucion);
		return temConcesionHidroelectricasDistribucionMapper.selectByPrimaryKey(temConcesionHidroelectricasDistribucion);
	}
	
	@Transactional
	public Integer guardar(TemConcesionHidroelectricasDistribucionDto temConcesionHidroelectricasDistribucionDto) throws Exception {
		TemConcesionHidroelectricasDistribucion temConcesionHidroelectricasDistribucion		= new TemConcesionHidroelectricasDistribucion();
		BeanUtils.copyProperties(temConcesionHidroelectricasDistribucionDto, temConcesionHidroelectricasDistribucion);
		int rs	= 0;
		TemConcesionHidroelectricasDistribucion exiteTemConcesionHidroelectricasDistribucion		= temConcesionHidroelectricasDistribucionMapper.selectByPrimaryKey(temConcesionHidroelectricasDistribucion);
		if(exiteTemConcesionHidroelectricasDistribucion != null) {
			rs	= temConcesionHidroelectricasDistribucionMapper.updateByPrimaryKeySelective(temConcesionHidroelectricasDistribucion);
		} else {
			rs	= temConcesionHidroelectricasDistribucionMapper.insertSelective(temConcesionHidroelectricasDistribucion);
			

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemConcesionHidroelectricasDistribucionDto temConcesionHidroelectricasDistribucionDto) throws Exception {
		TemConcesionHidroelectricasDistribucion temConcesionHidroelectricasDistribucion		= new TemConcesionHidroelectricasDistribucion();
		BeanUtils.copyProperties(temConcesionHidroelectricasDistribucionDto, temConcesionHidroelectricasDistribucion);
		Integer rs	= temConcesionHidroelectricasDistribucionMapper.deleteByPrimaryKey(temConcesionHidroelectricasDistribucion);
		return rs;
	}
	
}
