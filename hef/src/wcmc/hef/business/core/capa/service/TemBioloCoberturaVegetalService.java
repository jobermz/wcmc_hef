package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemBioloCoberturaVegetalDto;
import wcmc.hef.dao.capa.domain.TemBioloCoberturaVegetal;

@Service
public interface TemBioloCoberturaVegetalService {
	
	public List<TemBioloCoberturaVegetal> buscar(TemBioloCoberturaVegetalDto temBioloCoberturaVegetalDto) throws Exception;
	public TemBioloCoberturaVegetal buscarById(TemBioloCoberturaVegetalDto temBioloCoberturaVegetalDto) throws Exception;
	public Integer guardar(TemBioloCoberturaVegetalDto temBioloCoberturaVegetalDto) throws Exception;
	public Integer eliminar(TemBioloCoberturaVegetalDto temBioloCoberturaVegetalDto) throws Exception;
	
}
