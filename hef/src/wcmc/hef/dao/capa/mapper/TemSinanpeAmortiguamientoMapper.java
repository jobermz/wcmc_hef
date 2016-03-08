package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemSinanpeAmortiguamiento;
import wcmc.hef.dao.capa.domain.TemSinanpeAmortiguamientoKey;
import wcmc.hef.dao.capa.domain.TemSinanpeAmortiguamientoParamDef;

@Service
public interface TemSinanpeAmortiguamientoMapper {
	
	public List<TemSinanpeAmortiguamiento> selectByDefaultParameter(TemSinanpeAmortiguamientoParamDef temSinanpeAmortiguamientoParamDef);
	public List<TemSinanpeAmortiguamiento> selectByDefaultParameterGeometry(TemSinanpeAmortiguamientoParamDef temSinanpeAmortiguamientoParamDef);
	public TemSinanpeAmortiguamiento selectByPrimaryKey(TemSinanpeAmortiguamientoKey temSinanpeAmortiguamientoKey);
	public int insertSelective(TemSinanpeAmortiguamiento temSinanpeAmortiguamiento);
	public int updateByPrimaryKeySelective(TemSinanpeAmortiguamiento temSinanpeAmortiguamiento);
	public int deleteByPrimaryKey(TemSinanpeAmortiguamientoKey temSinanpeAmortiguamientoKey);
	
	public int lastSequence();

	
}
