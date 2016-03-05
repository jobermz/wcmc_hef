package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemConcesionHidroelectricasGeneracion;
import wcmc.hef.dao.capa.domain.TemConcesionHidroelectricasGeneracionKey;
import wcmc.hef.dao.capa.domain.TemConcesionHidroelectricasGeneracionParamDef;

@Service
public interface TemConcesionHidroelectricasGeneracionMapper {
	
	public List<TemConcesionHidroelectricasGeneracion> selectByDefaultParameter(TemConcesionHidroelectricasGeneracionParamDef temConcesionHidroelectricasGeneracionParamDef);
	public TemConcesionHidroelectricasGeneracion selectByPrimaryKey(TemConcesionHidroelectricasGeneracionKey temConcesionHidroelectricasGeneracionKey);
	public int insertSelective(TemConcesionHidroelectricasGeneracion temConcesionHidroelectricasGeneracion);
	public int updateByPrimaryKeySelective(TemConcesionHidroelectricasGeneracion temConcesionHidroelectricasGeneracion);
	public int deleteByPrimaryKey(TemConcesionHidroelectricasGeneracionKey temConcesionHidroelectricasGeneracionKey);
	
	public int lastSequence();

	
}
