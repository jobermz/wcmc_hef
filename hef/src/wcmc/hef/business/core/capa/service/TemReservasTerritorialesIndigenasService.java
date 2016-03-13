package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemReservasTerritorialesIndigenasDto;
import wcmc.hef.dao.capa.domain.TemReservasTerritorialesIndigenas;

@Service
public interface TemReservasTerritorialesIndigenasService {
	
	public List<TemReservasTerritorialesIndigenas> buscar(TemReservasTerritorialesIndigenasDto temReservasTerritorialesIndigenasDto) throws Exception;
	public List<TemReservasTerritorialesIndigenas> buscarGeometry(TemReservasTerritorialesIndigenasDto temReservasTerritorialesIndigenasDto) throws Exception;
	public List<TemReservasTerritorialesIndigenas> buscarCombo(TemReservasTerritorialesIndigenasDto temReservasTerritorialesIndigenasDto) throws Exception;
	public TemReservasTerritorialesIndigenas buscarById(TemReservasTerritorialesIndigenasDto temReservasTerritorialesIndigenasDto) throws Exception;
	public TemReservasTerritorialesIndigenas buscarGeometryById(TemReservasTerritorialesIndigenasDto temReservasTerritorialesIndigenasDto) throws Exception;
	public Integer guardar(TemReservasTerritorialesIndigenasDto temReservasTerritorialesIndigenasDto) throws Exception;
	public Integer eliminar(TemReservasTerritorialesIndigenasDto temReservasTerritorialesIndigenasDto) throws Exception;
	
}
