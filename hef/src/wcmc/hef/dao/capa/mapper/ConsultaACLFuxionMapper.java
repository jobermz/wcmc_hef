package wcmc.hef.dao.capa.mapper;

import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.ConsultaACLFuxion;

@Service
public interface ConsultaACLFuxionMapper {
	
	public String selectFuxion(ConsultaACLFuxion consultaACLFuxion);
	
}
