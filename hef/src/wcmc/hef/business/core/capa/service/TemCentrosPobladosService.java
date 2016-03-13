package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemCentrosPobladosDto;
import wcmc.hef.dao.capa.domain.TemCentrosPoblados;

@Service
public interface TemCentrosPobladosService {
	
	public List<TemCentrosPoblados> buscar(TemCentrosPobladosDto temCentrosPobladosDto) throws Exception;
	public List<TemCentrosPoblados> buscarGeometry(TemCentrosPobladosDto temCentrosPobladosDto) throws Exception;
	public List<TemCentrosPoblados> buscarCombo(TemCentrosPobladosDto temCentrosPobladosDto) throws Exception;
	public TemCentrosPoblados buscarById(TemCentrosPobladosDto temCentrosPobladosDto) throws Exception;
	public TemCentrosPoblados buscarGeometryById(TemCentrosPobladosDto temCentrosPobladosDto) throws Exception;
	public Integer guardar(TemCentrosPobladosDto temCentrosPobladosDto) throws Exception;
	public Integer eliminar(TemCentrosPobladosDto temCentrosPobladosDto) throws Exception;
	
}
