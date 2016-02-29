package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.CuencasHidrograficas;
import wcmc.hef.dao.capa.domain.CuencasHidrograficasKey;
import wcmc.hef.dao.capa.domain.CuencasHidrograficasParamDef;

@Service
public interface CuencasHidrograficasMapper {
	
	public List<CuencasHidrograficas> selectByDefaultParameter(CuencasHidrograficasParamDef cuencasHidrograficasParamDef);
	public CuencasHidrograficas selectByPrimaryKey(CuencasHidrograficasKey cuencasHidrograficasKey);
	public int insertSelective(CuencasHidrograficas cuencasHidrograficas);
	public int updateByPrimaryKeySelective(CuencasHidrograficas cuencasHidrograficas);
	public int deleteByPrimaryKey(CuencasHidrograficasKey cuencasHidrograficasKey);
	
	public int lastSequence();

	
}
