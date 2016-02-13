package wcmc.hef.dao.configuracion.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.configuracion.domain.Capa;
import wcmc.hef.dao.configuracion.domain.CapaKey;
import wcmc.hef.dao.configuracion.domain.CapaParamDef;

@Service
public interface CapaMapper {
	
	public List<Capa> selectByDefaultParameter(CapaParamDef capaParamDef);
	public Capa selectByPrimaryKey(CapaKey capaKey);
	public int insertSelective(Capa capa);
	public int updateByPrimaryKeySelective(Capa capa);
	public int deleteByPrimaryKey(CapaKey capaKey);
	
	public int lastSequence();

	
}
