package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemAnpNacionalDto;
import wcmc.hef.dao.capa.domain.TemAnpNacional;

@Service
public interface TemAnpNacionalService {
	
	public List<TemAnpNacional> buscar(TemAnpNacionalDto temAnpNacionalDto) throws Exception;
	public List<TemAnpNacional> buscarGeometry(TemAnpNacionalDto temAnpNacionalDto) throws Exception;
	public List<TemAnpNacional> buscarCombo(TemAnpNacionalDto temAnpNacionalDto) throws Exception;
	public TemAnpNacional buscarById(TemAnpNacionalDto temAnpNacionalDto) throws Exception;
	public TemAnpNacional buscarGeometryById(TemAnpNacionalDto temAnpNacionalDto) throws Exception;
	public Integer guardar(TemAnpNacionalDto temAnpNacionalDto) throws Exception;
	public Integer eliminar(TemAnpNacionalDto temAnpNacionalDto) throws Exception;
	
}
