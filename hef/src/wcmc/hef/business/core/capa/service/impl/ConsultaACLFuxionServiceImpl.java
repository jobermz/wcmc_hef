package wcmc.hef.business.core.capa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wcmc.hef.business.core.capa.service.ConsultaACLFuxionService;
import wcmc.hef.dao.capa.domain.ConsultaACLFuxion;
import wcmc.hef.dao.capa.mapper.ConsultaACLFuxionMapper;

@Service
public class ConsultaACLFuxionServiceImpl implements ConsultaACLFuxionService {
	
	@Autowired
	private ConsultaACLFuxionMapper consultaACLFuxionMapper;
	
	public String selectFuxion(ConsultaACLFuxion consultaACLFuxion) {
		return consultaACLFuxionMapper.selectFuxion(consultaACLFuxion);
	}

}
