package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.Mfauna;
import wcmc.hef.dao.capa.domain.MfaunaKey;
import wcmc.hef.dao.capa.domain.MfaunaParamDef;

@Service
public interface MfaunaMapper {
	
	public List<Mfauna> selectByDefaultParameter(MfaunaParamDef mfaunaParamDef);
	public Mfauna selectByPrimaryKey(MfaunaKey mfaunaKey);
	public int insertSelective(Mfauna mfauna);
	public int updateByPrimaryKeySelective(Mfauna mfauna);
	public int deleteByPrimaryKey(MfaunaKey mfaunaKey);
	
	public int lastSequence();

	
}
