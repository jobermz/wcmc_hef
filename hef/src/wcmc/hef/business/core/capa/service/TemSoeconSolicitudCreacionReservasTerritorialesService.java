package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemSoeconSolicitudCreacionReservasTerritorialesDto;
import wcmc.hef.dao.capa.domain.TemSoeconSolicitudCreacionReservasTerritoriales;

@Service
public interface TemSoeconSolicitudCreacionReservasTerritorialesService {
	
	public List<TemSoeconSolicitudCreacionReservasTerritoriales> buscar(TemSoeconSolicitudCreacionReservasTerritorialesDto temSoeconSolicitudCreacionReservasTerritorialesDto) throws Exception;
	public TemSoeconSolicitudCreacionReservasTerritoriales buscarById(TemSoeconSolicitudCreacionReservasTerritorialesDto temSoeconSolicitudCreacionReservasTerritorialesDto) throws Exception;
	public Integer guardar(TemSoeconSolicitudCreacionReservasTerritorialesDto temSoeconSolicitudCreacionReservasTerritorialesDto) throws Exception;
	public Integer eliminar(TemSoeconSolicitudCreacionReservasTerritorialesDto temSoeconSolicitudCreacionReservasTerritorialesDto) throws Exception;
	
}
