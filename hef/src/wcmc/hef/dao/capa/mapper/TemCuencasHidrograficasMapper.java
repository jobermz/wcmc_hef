package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemCuencasHidrograficas;
import wcmc.hef.dao.capa.domain.TemCuencasHidrograficasKey;
import wcmc.hef.dao.capa.domain.TemCuencasHidrograficasParamDef;

@Service
public interface TemCuencasHidrograficasMapper {
	
	public List<TemCuencasHidrograficas> selectByDefaultParameter(TemCuencasHidrograficasParamDef temCuencasHidrograficasParamDef);
	public List<TemCuencasHidrograficas> selectByDefaultParameterGeometry(TemCuencasHidrograficasParamDef temCuencasHidrograficasParamDef);
	public TemCuencasHidrograficas selectByPrimaryKey(TemCuencasHidrograficasKey temCuencasHidrograficasKey);
	public int insertSelective(TemCuencasHidrograficas temCuencasHidrograficas);
	public int updateByPrimaryKeySelective(TemCuencasHidrograficas temCuencasHidrograficas);
	public int deleteByPrimaryKey(TemCuencasHidrograficasKey temCuencasHidrograficasKey);
	
	public int lastSequence();

	
}
