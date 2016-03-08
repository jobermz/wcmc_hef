package wcmc.hef.business.core.capa.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wcmc.hef.business.core.capa.dto.TemBiodiversidadEspeciesPeligroExtincionDto;
import wcmc.hef.business.core.capa.service.TemBiodiversidadEspeciesPeligroExtincionService;
import wcmc.hef.dao.capa.domain.TemBiodiversidadEspeciesPeligroExtincion;
import wcmc.hef.dao.capa.mapper.TemBiodiversidadEspeciesPeligroExtincionMapper;

@Service
public class TemBiodiversidadEspeciesPeligroExtincionServiceImpl implements TemBiodiversidadEspeciesPeligroExtincionService {
	@Autowired
	private TemBiodiversidadEspeciesPeligroExtincionMapper temBiodiversidadEspeciesPeligroExtincionMapper;
	
	public List<TemBiodiversidadEspeciesPeligroExtincion> selectByGeometry(TemBiodiversidadEspeciesPeligroExtincionDto temBiodiversidadEspeciesPeligroExtincionDto) throws Exception {
		TemBiodiversidadEspeciesPeligroExtincion temBiodiversidadEspeciesPeligroExtincion		= new TemBiodiversidadEspeciesPeligroExtincion();
		BeanUtils.copyProperties(temBiodiversidadEspeciesPeligroExtincionDto, temBiodiversidadEspeciesPeligroExtincion);
		List<Double>	 list	= temBiodiversidadEspeciesPeligroExtincionMapper.selectByGeometry(temBiodiversidadEspeciesPeligroExtincion);
		double dblPromedioValue	= 0d;
		for(double dblValue:list) {
			dblPromedioValue	+= dblValue;
		}
		dblPromedioValue	= dblPromedioValue / ((double)list.size());
		List<TemBiodiversidadEspeciesPeligroExtincion> listRs	= new ArrayList<TemBiodiversidadEspeciesPeligroExtincion>();
		for(double dblValue:list) {
			listRs.add(new TemBiodiversidadEspeciesPeligroExtincion("", String.valueOf(dblPromedioValue), new BigDecimal(dblValue).setScale(4, BigDecimal.ROUND_HALF_EVEN).toString()));
		}
		return listRs;
	}
	
}
