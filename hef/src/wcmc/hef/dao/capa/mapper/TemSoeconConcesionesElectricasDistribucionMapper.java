package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemSoeconConcesionesElectricasDistribucion;
import wcmc.hef.dao.capa.domain.TemSoeconConcesionesElectricasDistribucionKey;
import wcmc.hef.dao.capa.domain.TemSoeconConcesionesElectricasDistribucionParamDef;

@Service
public interface TemSoeconConcesionesElectricasDistribucionMapper {
	
	public List<TemSoeconConcesionesElectricasDistribucion> selectByDefaultParameter(TemSoeconConcesionesElectricasDistribucionParamDef temSoeconConcesionesElectricasDistribucionParamDef);
	public TemSoeconConcesionesElectricasDistribucion selectByPrimaryKey(TemSoeconConcesionesElectricasDistribucionKey temSoeconConcesionesElectricasDistribucionKey);
	public int insertSelective(TemSoeconConcesionesElectricasDistribucion temSoeconConcesionesElectricasDistribucion);
	public int updateByPrimaryKeySelective(TemSoeconConcesionesElectricasDistribucion temSoeconConcesionesElectricasDistribucion);
	public int deleteByPrimaryKey(TemSoeconConcesionesElectricasDistribucionKey temSoeconConcesionesElectricasDistribucionKey);
	
	
}
