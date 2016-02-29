package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemSoeconConcesionesElectricasGeneracion;
import wcmc.hef.dao.capa.domain.TemSoeconConcesionesElectricasGeneracionKey;
import wcmc.hef.dao.capa.domain.TemSoeconConcesionesElectricasGeneracionParamDef;

@Service
public interface TemSoeconConcesionesElectricasGeneracionMapper {
	
	public List<TemSoeconConcesionesElectricasGeneracion> selectByDefaultParameter(TemSoeconConcesionesElectricasGeneracionParamDef temSoeconConcesionesElectricasGeneracionParamDef);
	public TemSoeconConcesionesElectricasGeneracion selectByPrimaryKey(TemSoeconConcesionesElectricasGeneracionKey temSoeconConcesionesElectricasGeneracionKey);
	public int insertSelective(TemSoeconConcesionesElectricasGeneracion temSoeconConcesionesElectricasGeneracion);
	public int updateByPrimaryKeySelective(TemSoeconConcesionesElectricasGeneracion temSoeconConcesionesElectricasGeneracion);
	public int deleteByPrimaryKey(TemSoeconConcesionesElectricasGeneracionKey temSoeconConcesionesElectricasGeneracionKey);
	
	public int lastSequence();

	
}
