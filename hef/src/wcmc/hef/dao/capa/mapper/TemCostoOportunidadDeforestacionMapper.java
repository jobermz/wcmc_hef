package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemCostoOportunidadDeforestacion;
import wcmc.hef.dao.capa.domain.TemCostoOportunidadDeforestacionKey;
import wcmc.hef.dao.capa.domain.TemCostoOportunidadDeforestacionParamDef;

@Service
public interface TemCostoOportunidadDeforestacionMapper {
	
	public List<TemCostoOportunidadDeforestacion> selectByDefaultParameter(TemCostoOportunidadDeforestacionParamDef temCostoOportunidadDeforestacionParamDef);
	public List<TemCostoOportunidadDeforestacion> selectByDefaultParameterGeometry(TemCostoOportunidadDeforestacionParamDef temCostoOportunidadDeforestacionParamDef);
	public List<TemCostoOportunidadDeforestacion> selectByDefaultParameterCombo(TemCostoOportunidadDeforestacionParamDef temCostoOportunidadDeforestacionParamDef);
	public TemCostoOportunidadDeforestacion selectByPrimaryKey(TemCostoOportunidadDeforestacionKey temCostoOportunidadDeforestacionKey);
	public TemCostoOportunidadDeforestacion selectByPrimaryKeyGeometry(TemCostoOportunidadDeforestacionKey temCostoOportunidadDeforestacionKey);
	public int insertSelective(TemCostoOportunidadDeforestacion temCostoOportunidadDeforestacion);
	public int updateByPrimaryKeySelective(TemCostoOportunidadDeforestacion temCostoOportunidadDeforestacion);
	public int deleteByPrimaryKey(TemCostoOportunidadDeforestacionKey temCostoOportunidadDeforestacionKey);
	
	public int lastSequence();

	
}
