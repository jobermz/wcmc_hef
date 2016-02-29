package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.ReservasTerritorialesIndigenasDto;
import wcmc.hef.dao.capa.domain.ReservasTerritorialesIndigenas;

@Service
public interface ReservasTerritorialesIndigenasService {
	
	public List<ReservasTerritorialesIndigenas> buscar(ReservasTerritorialesIndigenasDto reservasTerritorialesIndigenasDto) throws Exception;
	public ReservasTerritorialesIndigenas buscarById(ReservasTerritorialesIndigenasDto reservasTerritorialesIndigenasDto) throws Exception;
	public Integer guardar(ReservasTerritorialesIndigenasDto reservasTerritorialesIndigenasDto) throws Exception;
	public Integer eliminar(ReservasTerritorialesIndigenasDto reservasTerritorialesIndigenasDto) throws Exception;
	
}
