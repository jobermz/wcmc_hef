package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemHumedalesRamsar;
import wcmc.hef.dao.capa.domain.TemHumedalesRamsarKey;
import wcmc.hef.dao.capa.domain.TemHumedalesRamsarParamDef;

@Service
public interface TemHumedalesRamsarMapper {
	
	public List<TemHumedalesRamsar> selectByDefaultParameter(TemHumedalesRamsarParamDef temHumedalesRamsarParamDef);
	public List<TemHumedalesRamsar> selectByDefaultParameterGeometry(TemHumedalesRamsarParamDef temHumedalesRamsarParamDef);
	public TemHumedalesRamsar selectByPrimaryKey(TemHumedalesRamsarKey temHumedalesRamsarKey);
	public int insertSelective(TemHumedalesRamsar temHumedalesRamsar);
	public int updateByPrimaryKeySelective(TemHumedalesRamsar temHumedalesRamsar);
	public int deleteByPrimaryKey(TemHumedalesRamsarKey temHumedalesRamsarKey);
	
	public int lastSequence();

	
}
