package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.ZonaAmortiguamientoEstablecidas;
import wcmc.hef.dao.capa.domain.ZonaAmortiguamientoEstablecidasKey;
import wcmc.hef.dao.capa.domain.ZonaAmortiguamientoEstablecidasParamDef;

@Service
public interface ZonaAmortiguamientoEstablecidasMapper {
	
	public List<ZonaAmortiguamientoEstablecidas> selectByDefaultParameter(ZonaAmortiguamientoEstablecidasParamDef zonaAmortiguamientoEstablecidasParamDef);
	public ZonaAmortiguamientoEstablecidas selectByPrimaryKey(ZonaAmortiguamientoEstablecidasKey zonaAmortiguamientoEstablecidasKey);
	public int insertSelective(ZonaAmortiguamientoEstablecidas zonaAmortiguamientoEstablecidas);
	public int updateByPrimaryKeySelective(ZonaAmortiguamientoEstablecidas zonaAmortiguamientoEstablecidas);
	public int deleteByPrimaryKey(ZonaAmortiguamientoEstablecidasKey zonaAmortiguamientoEstablecidasKey);
	
	public int lastSequence();

	
}
