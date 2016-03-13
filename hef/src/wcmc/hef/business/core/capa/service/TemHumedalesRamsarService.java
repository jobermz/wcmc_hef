package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemHumedalesRamsarDto;
import wcmc.hef.dao.capa.domain.TemHumedalesRamsar;

@Service
public interface TemHumedalesRamsarService {
	
	public List<TemHumedalesRamsar> buscar(TemHumedalesRamsarDto temHumedalesRamsarDto) throws Exception;
	public List<TemHumedalesRamsar> buscarGeometry(TemHumedalesRamsarDto temHumedalesRamsarDto) throws Exception;
	public List<TemHumedalesRamsar> buscarCombo(TemHumedalesRamsarDto temHumedalesRamsarDto) throws Exception;
	public TemHumedalesRamsar buscarById(TemHumedalesRamsarDto temHumedalesRamsarDto) throws Exception;
	public TemHumedalesRamsar buscarGeometryById(TemHumedalesRamsarDto temHumedalesRamsarDto) throws Exception;
	public Integer guardar(TemHumedalesRamsarDto temHumedalesRamsarDto) throws Exception;
	public Integer eliminar(TemHumedalesRamsarDto temHumedalesRamsarDto) throws Exception;
	
}
