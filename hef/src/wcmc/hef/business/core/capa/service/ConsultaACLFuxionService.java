package wcmc.hef.business.core.capa.service;

import org.springframework.stereotype.Service;

import wcmc.hef.dao.capa.domain.ConsultaACLFuxion;

@Service
public interface ConsultaACLFuxionService {
	public String selectFuxion(ConsultaACLFuxion consultaACLFuxion);
}
