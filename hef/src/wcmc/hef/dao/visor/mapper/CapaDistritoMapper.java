package wcmc.hef.dao.visor.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.visor.domain.CapaDistrito;
import wcmc.hef.dao.visor.domain.CapaDistritoKey;
import wcmc.hef.dao.visor.domain.CapaDistritoParamDef;

@Service
public interface CapaDistritoMapper {
	
	public List<CapaDistrito> selectByDefaultParameter(CapaDistritoParamDef capaDistritoParamDef);
	public CapaDistrito selectByPrimaryKey(CapaDistritoKey capaDistritoKey);
	public int insertSelective(CapaDistrito capaDistrito);
	public int updateByPrimaryKeySelective(CapaDistrito capaDistrito);
	public int deleteByPrimaryKey(CapaDistritoKey capaDistritoKey);
	
	
}
