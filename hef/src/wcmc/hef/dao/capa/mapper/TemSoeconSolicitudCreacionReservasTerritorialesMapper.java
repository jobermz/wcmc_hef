package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemSoeconSolicitudCreacionReservasTerritoriales;
import wcmc.hef.dao.capa.domain.TemSoeconSolicitudCreacionReservasTerritorialesKey;
import wcmc.hef.dao.capa.domain.TemSoeconSolicitudCreacionReservasTerritorialesParamDef;

@Service
public interface TemSoeconSolicitudCreacionReservasTerritorialesMapper {
	
	public List<TemSoeconSolicitudCreacionReservasTerritoriales> selectByDefaultParameter(TemSoeconSolicitudCreacionReservasTerritorialesParamDef temSoeconSolicitudCreacionReservasTerritorialesParamDef);
	public List<TemSoeconSolicitudCreacionReservasTerritoriales> selectByDefaultParameterGeometry(TemSoeconSolicitudCreacionReservasTerritorialesParamDef temSoeconSolicitudCreacionReservasTerritorialesParamDef);
	public TemSoeconSolicitudCreacionReservasTerritoriales selectByPrimaryKey(TemSoeconSolicitudCreacionReservasTerritorialesKey temSoeconSolicitudCreacionReservasTerritorialesKey);
	public int insertSelective(TemSoeconSolicitudCreacionReservasTerritoriales temSoeconSolicitudCreacionReservasTerritoriales);
	public int updateByPrimaryKeySelective(TemSoeconSolicitudCreacionReservasTerritoriales temSoeconSolicitudCreacionReservasTerritoriales);
	public int deleteByPrimaryKey(TemSoeconSolicitudCreacionReservasTerritorialesKey temSoeconSolicitudCreacionReservasTerritorialesKey);
	
	public int lastSequence();

	
}
