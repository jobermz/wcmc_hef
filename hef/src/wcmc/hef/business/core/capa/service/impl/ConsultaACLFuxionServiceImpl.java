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
	public String selectBoundary(String value) {
		return consultaACLFuxionMapper.selectBoundary(value);
	}
	public String selectBBOX(String value) {
		return consultaACLFuxionMapper.selectBBOX(value);
	}
	public String selectBBOX4326(String value) {
		return consultaACLFuxionMapper.selectBBOX4326(value);
	}
	public String selectCenter4326(String value) {
		return consultaACLFuxionMapper.selectCenter4326(value);
	}
	public String selectCenter_Y_X_4326(String value) {
		return consultaACLFuxionMapper.selectCenter_Y_X_4326(value);
	}
}
