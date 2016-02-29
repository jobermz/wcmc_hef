package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemBioloHumedalesRamsar;
import wcmc.hef.dao.capa.domain.TemBioloHumedalesRamsarKey;
import wcmc.hef.dao.capa.domain.TemBioloHumedalesRamsarParamDef;

@Service
public interface TemBioloHumedalesRamsarMapper {
	
	public List<TemBioloHumedalesRamsar> selectByDefaultParameter(TemBioloHumedalesRamsarParamDef temBioloHumedalesRamsarParamDef);
	public TemBioloHumedalesRamsar selectByPrimaryKey(TemBioloHumedalesRamsarKey temBioloHumedalesRamsarKey);
	public int insertSelective(TemBioloHumedalesRamsar temBioloHumedalesRamsar);
	public int updateByPrimaryKeySelective(TemBioloHumedalesRamsar temBioloHumedalesRamsar);
	public int deleteByPrimaryKey(TemBioloHumedalesRamsarKey temBioloHumedalesRamsarKey);
	
	public int lastSequence();

	
}
