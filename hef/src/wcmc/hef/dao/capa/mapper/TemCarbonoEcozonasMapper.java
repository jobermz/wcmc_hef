package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemCarbonoEcozonas;
import wcmc.hef.dao.capa.domain.TemCarbonoEcozonasKey;
import wcmc.hef.dao.capa.domain.TemCarbonoEcozonasParamDef;

@Service
public interface TemCarbonoEcozonasMapper {
	
	public List<TemCarbonoEcozonas> selectByDefaultParameter(TemCarbonoEcozonasParamDef temCarbonoEcozonasParamDef);
	public List<TemCarbonoEcozonas> selectByDefaultParameterGeometry(TemCarbonoEcozonasParamDef temCarbonoEcozonasParamDef);
	public List<TemCarbonoEcozonas> selectByDefaultParameterCombo(TemCarbonoEcozonasParamDef temCarbonoEcozonasParamDef);
	public TemCarbonoEcozonas selectByPrimaryKey(TemCarbonoEcozonasKey temCarbonoEcozonasKey);
	public TemCarbonoEcozonas selectByPrimaryKeyGeometry(TemCarbonoEcozonasKey temCarbonoEcozonasKey);
	public int insertSelective(TemCarbonoEcozonas temCarbonoEcozonas);
	public int updateByPrimaryKeySelective(TemCarbonoEcozonas temCarbonoEcozonas);
	public int deleteByPrimaryKey(TemCarbonoEcozonasKey temCarbonoEcozonasKey);
	
	public int lastSequence();

	
}
