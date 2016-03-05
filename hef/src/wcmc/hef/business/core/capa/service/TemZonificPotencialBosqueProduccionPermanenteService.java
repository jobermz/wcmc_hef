package wcmc.hef.business.core.capa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.business.core.capa.dto.TemZonificPotencialBosqueProduccionPermanenteDto;
import wcmc.hef.dao.capa.domain.TemZonificPotencialBosqueProduccionPermanente;

@Service
public interface TemZonificPotencialBosqueProduccionPermanenteService {
	
	public List<TemZonificPotencialBosqueProduccionPermanente> buscar(TemZonificPotencialBosqueProduccionPermanenteDto temZonificPotencialBosqueProduccionPermanenteDto) throws Exception;
	public TemZonificPotencialBosqueProduccionPermanente buscarById(TemZonificPotencialBosqueProduccionPermanenteDto temZonificPotencialBosqueProduccionPermanenteDto) throws Exception;
	public Integer guardar(TemZonificPotencialBosqueProduccionPermanenteDto temZonificPotencialBosqueProduccionPermanenteDto) throws Exception;
	public Integer eliminar(TemZonificPotencialBosqueProduccionPermanenteDto temZonificPotencialBosqueProduccionPermanenteDto) throws Exception;
	
}
