package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemCostoOportunidadDeforestacionDto;
import wcmc.hef.dao.capa.domain.TemCostoOportunidadDeforestacion;

@Service
public interface TemCostoOportunidadDeforestacionService {
	
	public List<TemCostoOportunidadDeforestacion> buscar(TemCostoOportunidadDeforestacionDto temCostoOportunidadDeforestacionDto) throws Exception;
	public TemCostoOportunidadDeforestacion buscarById(TemCostoOportunidadDeforestacionDto temCostoOportunidadDeforestacionDto) throws Exception;
	public Integer guardar(TemCostoOportunidadDeforestacionDto temCostoOportunidadDeforestacionDto) throws Exception;
	public Integer eliminar(TemCostoOportunidadDeforestacionDto temCostoOportunidadDeforestacionDto) throws Exception;
	
}
