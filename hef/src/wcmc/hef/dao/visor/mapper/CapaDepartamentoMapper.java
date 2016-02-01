package wcmc.hef.dao.visor.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.visor.domain.CapaDepartamento;
import wcmc.hef.dao.visor.domain.CapaDepartamentoKey;
import wcmc.hef.dao.visor.domain.CapaDepartamentoParamDef;

@Service
public interface CapaDepartamentoMapper {
	
	public List<CapaDepartamento> selectByDefaultParameter(CapaDepartamentoParamDef capaDepartamentoParamDef);
	public CapaDepartamento selectByPrimaryKey(CapaDepartamentoKey capaDepartamentoKey);
	public int insertSelective(CapaDepartamento capaDepartamento);
	public int updateByPrimaryKeySelective(CapaDepartamento capaDepartamento);
	public int deleteByPrimaryKey(CapaDepartamentoKey capaDepartamentoKey);
	
	
}
