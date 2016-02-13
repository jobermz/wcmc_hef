package wcmc.hef.dao.configuracion.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.configuracion.domain.CapaUmbral;
import wcmc.hef.dao.configuracion.domain.CapaUmbralKey;
import wcmc.hef.dao.configuracion.domain.CapaUmbralParamDef;

@Service
public interface CapaUmbralMapper {
	
	public List<CapaUmbral> selectByDefaultParameter(CapaUmbralParamDef capaUmbralParamDef);
	public CapaUmbral selectByPrimaryKey(CapaUmbralKey capaUmbralKey);
	public int insertSelective(CapaUmbral capaUmbral);
	public int updateByPrimaryKeySelective(CapaUmbral capaUmbral);
	public int deleteByPrimaryKey(CapaUmbralKey capaUmbralKey);
	
	public int lastSequence();

	
}
