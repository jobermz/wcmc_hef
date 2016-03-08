package wcmc.hef.business.core.capa.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wcmc.hef.business.core.capa.dto.TemDensidadCarbonoAereaDto;
import wcmc.hef.business.core.capa.service.TemDensidadCarbonoAereaService;
import wcmc.hef.dao.capa.domain.TemDensidadCarbonoAerea;
import wcmc.hef.dao.capa.mapper.TemDensidadCarbonoAereaMapper;

@Service
public class TemDensidadCarbonoAereaServiceImpl implements TemDensidadCarbonoAereaService {
	@Autowired
	private TemDensidadCarbonoAereaMapper temDensidadCarbonoAereaMapper;
	
	public List<TemDensidadCarbonoAerea> selectByGeometry(TemDensidadCarbonoAereaDto temDensidadCarbonoAereaDto) throws Exception {
		TemDensidadCarbonoAerea temDensidadCarbonoAerea		= new TemDensidadCarbonoAerea();
		BeanUtils.copyProperties(temDensidadCarbonoAereaDto, temDensidadCarbonoAerea);
		List<Double>	 list	= temDensidadCarbonoAereaMapper.selectByGeometry(temDensidadCarbonoAerea);
		double dblPromedioValue	= 0d;
		for(double dblValue:list) {
			dblPromedioValue	+= dblValue;
		}
		dblPromedioValue	= dblPromedioValue / ((double)list.size());
		List<TemDensidadCarbonoAerea> listRs	= new ArrayList<TemDensidadCarbonoAerea>();
		for(double dblValue:list) {
			listRs.add(new TemDensidadCarbonoAerea("", String.valueOf(dblPromedioValue), new BigDecimal(dblValue).setScale(4, BigDecimal.ROUND_HALF_EVEN).toString()));
		}
		return listRs;
	}
	
}
