package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemSinanpeAmortiguamientoDto;
import wcmc.hef.dao.capa.domain.TemSinanpeAmortiguamiento;

@Service
public interface TemSinanpeAmortiguamientoService {
	
	public List<TemSinanpeAmortiguamiento> buscar(TemSinanpeAmortiguamientoDto temSinanpeAmortiguamientoDto) throws Exception;
	public List<TemSinanpeAmortiguamiento> buscarGeometry(TemSinanpeAmortiguamientoDto temSinanpeAmortiguamientoDto) throws Exception;
	public TemSinanpeAmortiguamiento buscarById(TemSinanpeAmortiguamientoDto temSinanpeAmortiguamientoDto) throws Exception;
	public Integer guardar(TemSinanpeAmortiguamientoDto temSinanpeAmortiguamientoDto) throws Exception;
	public Integer eliminar(TemSinanpeAmortiguamientoDto temSinanpeAmortiguamientoDto) throws Exception;
	
}
