package wcmc.hef.business.core.capa.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wcmc.hef.business.core.capa.dto.TemRiesgoErosionHidricaDto;
import wcmc.hef.business.core.capa.service.TemRiesgoErosionHidricaService;
import wcmc.hef.dao.capa.domain.TemRiesgoErosionHidrica;
import wcmc.hef.dao.capa.mapper.TemRiesgoErosionHidricaMapper;

@Service
public class TemRiesgoErosionHidricaServiceImpl implements TemRiesgoErosionHidricaService {
	@Autowired
	private TemRiesgoErosionHidricaMapper temRiesgoErosionHidricaMapper;
	
	public List<TemRiesgoErosionHidrica> selectByGeometry(TemRiesgoErosionHidricaDto temRiesgoErosionHidricaDto) throws Exception {
		TemRiesgoErosionHidrica temRiesgoErosionHidrica		= new TemRiesgoErosionHidrica();
		BeanUtils.copyProperties(temRiesgoErosionHidricaDto, temRiesgoErosionHidrica);
		List<Double>	 list	= temRiesgoErosionHidricaMapper.selectByGeometry(temRiesgoErosionHidrica);
		double dblPromedioValue	= 0d;
		for(double dblValue:list) {
			dblPromedioValue	+= dblValue;
		}
		dblPromedioValue	= dblPromedioValue / ((double)list.size());
		List<TemRiesgoErosionHidrica> listRs	= new ArrayList<TemRiesgoErosionHidrica>();
		for(double dblValue:list) {
			listRs.add(new TemRiesgoErosionHidrica("", String.valueOf(dblPromedioValue), new BigDecimal(dblValue).setScale(4, BigDecimal.ROUND_HALF_EVEN).toString()));
		}
		return listRs;
	}
	
}
