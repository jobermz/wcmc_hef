package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemReservasTerritorialesIndigenas;
import wcmc.hef.dao.capa.domain.TemReservasTerritorialesIndigenasKey;
import wcmc.hef.dao.capa.domain.TemReservasTerritorialesIndigenasParamDef;

@Service
public interface TemReservasTerritorialesIndigenasMapper {
	
	public List<TemReservasTerritorialesIndigenas> selectByDefaultParameter(TemReservasTerritorialesIndigenasParamDef temReservasTerritorialesIndigenasParamDef);
	public List<TemReservasTerritorialesIndigenas> selectByDefaultParameterGeometry(TemReservasTerritorialesIndigenasParamDef temReservasTerritorialesIndigenasParamDef);
	public List<TemReservasTerritorialesIndigenas> selectByDefaultParameterCombo(TemReservasTerritorialesIndigenasParamDef temReservasTerritorialesIndigenasParamDef);
	public TemReservasTerritorialesIndigenas selectByPrimaryKey(TemReservasTerritorialesIndigenasKey temReservasTerritorialesIndigenasKey);
	public TemReservasTerritorialesIndigenas selectByPrimaryKeyGeometry(TemReservasTerritorialesIndigenasKey temReservasTerritorialesIndigenasKey);
	public int insertSelective(TemReservasTerritorialesIndigenas temReservasTerritorialesIndigenas);
	public int updateByPrimaryKeySelective(TemReservasTerritorialesIndigenas temReservasTerritorialesIndigenas);
	public int deleteByPrimaryKey(TemReservasTerritorialesIndigenasKey temReservasTerritorialesIndigenasKey);
	
	public int lastSequence();

	
}
