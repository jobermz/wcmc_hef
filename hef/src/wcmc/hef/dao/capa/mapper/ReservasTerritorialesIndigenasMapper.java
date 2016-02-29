package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.ReservasTerritorialesIndigenas;
import wcmc.hef.dao.capa.domain.ReservasTerritorialesIndigenasKey;
import wcmc.hef.dao.capa.domain.ReservasTerritorialesIndigenasParamDef;

@Service
public interface ReservasTerritorialesIndigenasMapper {
	
	public List<ReservasTerritorialesIndigenas> selectByDefaultParameter(ReservasTerritorialesIndigenasParamDef reservasTerritorialesIndigenasParamDef);
	public ReservasTerritorialesIndigenas selectByPrimaryKey(ReservasTerritorialesIndigenasKey reservasTerritorialesIndigenasKey);
	public int insertSelective(ReservasTerritorialesIndigenas reservasTerritorialesIndigenas);
	public int updateByPrimaryKeySelective(ReservasTerritorialesIndigenas reservasTerritorialesIndigenas);
	public int deleteByPrimaryKey(ReservasTerritorialesIndigenasKey reservasTerritorialesIndigenasKey);
	
	public int lastSequence();

	
}
