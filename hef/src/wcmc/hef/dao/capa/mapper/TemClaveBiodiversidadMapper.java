package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemClaveBiodiversidad;
import wcmc.hef.dao.capa.domain.TemClaveBiodiversidadKey;
import wcmc.hef.dao.capa.domain.TemClaveBiodiversidadParamDef;

@Service
public interface TemClaveBiodiversidadMapper {
	
	public List<TemClaveBiodiversidad> selectByDefaultParameter(TemClaveBiodiversidadParamDef temClaveBiodiversidadParamDef);
	public List<TemClaveBiodiversidad> selectByDefaultParameterGeometry(TemClaveBiodiversidadParamDef temClaveBiodiversidadParamDef);
	public TemClaveBiodiversidad selectByPrimaryKey(TemClaveBiodiversidadKey temClaveBiodiversidadKey);
	public int insertSelective(TemClaveBiodiversidad temClaveBiodiversidad);
	public int updateByPrimaryKeySelective(TemClaveBiodiversidad temClaveBiodiversidad);
	public int deleteByPrimaryKey(TemClaveBiodiversidadKey temClaveBiodiversidadKey);
	
	public int lastSequence();

	
}
