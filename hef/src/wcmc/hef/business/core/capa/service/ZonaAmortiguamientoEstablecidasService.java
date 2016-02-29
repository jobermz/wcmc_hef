package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.ZonaAmortiguamientoEstablecidasDto;
import wcmc.hef.dao.capa.domain.ZonaAmortiguamientoEstablecidas;

@Service
public interface ZonaAmortiguamientoEstablecidasService {
	
	public List<ZonaAmortiguamientoEstablecidas> buscar(ZonaAmortiguamientoEstablecidasDto zonaAmortiguamientoEstablecidasDto) throws Exception;
	public ZonaAmortiguamientoEstablecidas buscarById(ZonaAmortiguamientoEstablecidasDto zonaAmortiguamientoEstablecidasDto) throws Exception;
	public Integer guardar(ZonaAmortiguamientoEstablecidasDto zonaAmortiguamientoEstablecidasDto) throws Exception;
	public Integer eliminar(ZonaAmortiguamientoEstablecidasDto zonaAmortiguamientoEstablecidasDto) throws Exception;
	
}
