package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.BasLimDepartamento;
import wcmc.hef.dao.capa.domain.BasLimDepartamentoKey;
import wcmc.hef.dao.capa.domain.BasLimDepartamentoParamDef;

@Service
public interface BasLimDepartamentoMapper {
	
	public List<BasLimDepartamento> selectByDefaultParameter(BasLimDepartamentoParamDef basLimDepartamentoParamDef);
	public List<BasLimDepartamento> selectByDefaultParameterGeometry(BasLimDepartamentoParamDef basLimDepartamentoParamDef);
	public BasLimDepartamento selectByPrimaryKey(BasLimDepartamentoKey basLimDepartamentoKey);
	public int insertSelective(BasLimDepartamento basLimDepartamento);
	public int updateByPrimaryKeySelective(BasLimDepartamento basLimDepartamento);
	public int deleteByPrimaryKey(BasLimDepartamentoKey basLimDepartamentoKey);
	
	public int lastSequence();

	
}
