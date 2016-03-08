package wcmc.hef.business.core.capa.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wcmc.hef.business.core.capa.dto.TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaDto;
import wcmc.hef.business.core.capa.service.TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaService;
import wcmc.hef.dao.capa.domain.TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemica;
import wcmc.hef.dao.capa.mapper.TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaMapper;

@Service
public class TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaServiceImpl implements TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaService {
	@Autowired
	private TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaMapper temBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaMapper;
	
	public List<TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemica> selectByGeometry(TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaDto temBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaDto) throws Exception {
		TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemica temBiodiversidadRiquezaPotencialEspeciesFaunaEndemica		= new TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemica();
		BeanUtils.copyProperties(temBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaDto, temBiodiversidadRiquezaPotencialEspeciesFaunaEndemica);
		List<Double>	 list	= temBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaMapper.selectByGeometry(temBiodiversidadRiquezaPotencialEspeciesFaunaEndemica);
		double dblPromedioValue	= 0d;
		for(double dblValue:list) {
			dblPromedioValue	+= dblValue;
		}
		dblPromedioValue	= dblPromedioValue / ((double)list.size());
		List<TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemica> listRs	= new ArrayList<TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemica>();
		for(double dblValue:list) {
			listRs.add(new TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemica("", String.valueOf(dblPromedioValue), new BigDecimal(dblValue).setScale(4, BigDecimal.ROUND_HALF_EVEN).toString()));
		}
		return listRs;
	}
	
}
