package wcmc.hef.dao.visor.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.visor.domain.CapaProvincia;
import wcmc.hef.dao.visor.domain.CapaProvinciaKey;
import wcmc.hef.dao.visor.domain.CapaProvinciaParamDef;

@Service
public interface CapaProvinciaMapper {
	
	public List<CapaProvincia> selectByDefaultParameter(CapaProvinciaParamDef capaProvinciaParamDef);
	public CapaProvincia selectByPrimaryKey(CapaProvinciaKey capaProvinciaKey);
	public int insertSelective(CapaProvincia capaProvincia);
	public int updateByPrimaryKeySelective(CapaProvincia capaProvincia);
	public int deleteByPrimaryKey(CapaProvinciaKey capaProvinciaKey);
	
	
}
