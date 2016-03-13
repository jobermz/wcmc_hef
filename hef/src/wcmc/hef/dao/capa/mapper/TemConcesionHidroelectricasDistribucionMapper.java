package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemConcesionHidroelectricasDistribucion;
import wcmc.hef.dao.capa.domain.TemConcesionHidroelectricasDistribucionKey;
import wcmc.hef.dao.capa.domain.TemConcesionHidroelectricasDistribucionParamDef;

@Service
public interface TemConcesionHidroelectricasDistribucionMapper {
	
	public List<TemConcesionHidroelectricasDistribucion> selectByDefaultParameter(TemConcesionHidroelectricasDistribucionParamDef temConcesionHidroelectricasDistribucionParamDef);
	public List<TemConcesionHidroelectricasDistribucion> selectByDefaultParameterGeometry(TemConcesionHidroelectricasDistribucionParamDef temConcesionHidroelectricasDistribucionParamDef);
	public List<TemConcesionHidroelectricasDistribucion> selectByDefaultParameterCombo(TemConcesionHidroelectricasDistribucionParamDef temConcesionHidroelectricasDistribucionParamDef);
	public TemConcesionHidroelectricasDistribucion selectByPrimaryKey(TemConcesionHidroelectricasDistribucionKey temConcesionHidroelectricasDistribucionKey);
	public TemConcesionHidroelectricasDistribucion selectByPrimaryKeyGeometry(TemConcesionHidroelectricasDistribucionKey temConcesionHidroelectricasDistribucionKey);
	public int insertSelective(TemConcesionHidroelectricasDistribucion temConcesionHidroelectricasDistribucion);
	public int updateByPrimaryKeySelective(TemConcesionHidroelectricasDistribucion temConcesionHidroelectricasDistribucion);
	public int deleteByPrimaryKey(TemConcesionHidroelectricasDistribucionKey temConcesionHidroelectricasDistribucionKey);
	
	public int lastSequence();

	
}
