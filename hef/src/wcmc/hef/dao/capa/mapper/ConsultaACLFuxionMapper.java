package wcmc.hef.dao.capa.mapper;

import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.ConsultaACLFuxion;

@Service
public interface ConsultaACLFuxionMapper {
	
	public String selectFuxion(ConsultaACLFuxion consultaACLFuxion);
	public String selectBoundary(String value);
	public String selectBBOX(String value);
	public String selectBBOX4326(String value);
	public String selectCenter4326(String value);
	public String selectCenter_Y_X_4326(String value);
}
