package wcmc.hef.dao.configuracion.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.configuracion.domain.TipoCapa;
import wcmc.hef.dao.configuracion.domain.TipoCapaKey;
import wcmc.hef.dao.configuracion.domain.TipoCapaParamDef;

@Service
public interface TipoCapaMapper {
	
	public List<TipoCapa> selectByDefaultParameter(TipoCapaParamDef tipoCapaParamDef);
	public TipoCapa selectByPrimaryKey(TipoCapaKey tipoCapaKey);
	public int insertSelective(TipoCapa tipoCapa);
	public int updateByPrimaryKeySelective(TipoCapa tipoCapa);
	public int deleteByPrimaryKey(TipoCapaKey tipoCapaKey);
	
	public int lastSequence();

	
}
