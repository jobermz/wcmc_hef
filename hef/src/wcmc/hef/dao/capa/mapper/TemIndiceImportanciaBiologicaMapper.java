package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemIndiceImportanciaBiologica;
import wcmc.hef.dao.capa.domain.TemIndiceImportanciaBiologicaKey;
import wcmc.hef.dao.capa.domain.TemIndiceImportanciaBiologicaParamDef;

@Service
public interface TemIndiceImportanciaBiologicaMapper {
	
	public List<TemIndiceImportanciaBiologica> selectByDefaultParameter(TemIndiceImportanciaBiologicaParamDef temIndiceImportanciaBiologicaParamDef);
	public List<TemIndiceImportanciaBiologica> selectByDefaultParameterGeometry(TemIndiceImportanciaBiologicaParamDef temIndiceImportanciaBiologicaParamDef);
	public List<TemIndiceImportanciaBiologica> selectByDefaultParameterCombo(TemIndiceImportanciaBiologicaParamDef temIndiceImportanciaBiologicaParamDef);
	public TemIndiceImportanciaBiologica selectByPrimaryKey(TemIndiceImportanciaBiologicaKey temIndiceImportanciaBiologicaKey);
	public TemIndiceImportanciaBiologica selectByPrimaryKeyGeometry(TemIndiceImportanciaBiologicaKey temIndiceImportanciaBiologicaKey);
	public int insertSelective(TemIndiceImportanciaBiologica temIndiceImportanciaBiologica);
	public int updateByPrimaryKeySelective(TemIndiceImportanciaBiologica temIndiceImportanciaBiologica);
	public int deleteByPrimaryKey(TemIndiceImportanciaBiologicaKey temIndiceImportanciaBiologicaKey);
	
	public int lastSequence();

	
}
