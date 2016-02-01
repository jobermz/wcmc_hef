package wcmc.hef.dao.configuracion.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.configuracion.domain.GrupoCapas;
import wcmc.hef.dao.configuracion.domain.GrupoCapasKey;
import wcmc.hef.dao.configuracion.domain.GrupoCapasParamDef;

@Service
public interface GrupoCapasMapper {
	
	public List<GrupoCapas> selectByDefaultParameter(GrupoCapasParamDef grupoCapasParamDef);
	public GrupoCapas selectByPrimaryKey(GrupoCapasKey grupoCapasKey);
	public int insertSelective(GrupoCapas grupoCapas);
	public int updateByPrimaryKeySelective(GrupoCapas grupoCapas);
	public int deleteByPrimaryKey(GrupoCapasKey grupoCapasKey);
	
	public int lastSequence();

	
}
