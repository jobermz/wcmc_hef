package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.Bpp;
import wcmc.hef.dao.capa.domain.BppKey;
import wcmc.hef.dao.capa.domain.BppParamDef;

@Service
public interface BppMapper {
	
	public List<Bpp> selectByDefaultParameter(BppParamDef bppParamDef);
	public Bpp selectByPrimaryKey(BppKey bppKey);
	public int insertSelective(Bpp bpp);
	public int updateByPrimaryKeySelective(Bpp bpp);
	public int deleteByPrimaryKey(BppKey bppKey);
	
	public int lastSequence();

	
}
