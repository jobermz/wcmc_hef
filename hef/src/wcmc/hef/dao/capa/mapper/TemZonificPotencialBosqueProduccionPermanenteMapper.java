package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemZonificPotencialBosqueProduccionPermanente;
import wcmc.hef.dao.capa.domain.TemZonificPotencialBosqueProduccionPermanenteKey;
import wcmc.hef.dao.capa.domain.TemZonificPotencialBosqueProduccionPermanenteParamDef;

@Service
public interface TemZonificPotencialBosqueProduccionPermanenteMapper {
	
	public List<TemZonificPotencialBosqueProduccionPermanente> selectByDefaultParameter(TemZonificPotencialBosqueProduccionPermanenteParamDef temZonificPotencialBosqueProduccionPermanenteParamDef);
	public TemZonificPotencialBosqueProduccionPermanente selectByPrimaryKey(TemZonificPotencialBosqueProduccionPermanenteKey temZonificPotencialBosqueProduccionPermanenteKey);
	public int insertSelective(TemZonificPotencialBosqueProduccionPermanente temZonificPotencialBosqueProduccionPermanente);
	public int updateByPrimaryKeySelective(TemZonificPotencialBosqueProduccionPermanente temZonificPotencialBosqueProduccionPermanente);
	public int deleteByPrimaryKey(TemZonificPotencialBosqueProduccionPermanenteKey temZonificPotencialBosqueProduccionPermanenteKey);
	
	public int lastSequence();

	
}
