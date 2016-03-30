package wcmc.hef.dao.configuracion.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.configuracion.domain.CampoMetadata;
import wcmc.hef.dao.configuracion.domain.CampoMetadataKey;
import wcmc.hef.dao.configuracion.domain.CampoMetadataParamDef;

@Service
public interface CampoMetadataMapper {
	
	public List<CampoMetadata> selectByDefaultParameter(CampoMetadataParamDef campoMetadataParamDef);
	public CampoMetadata selectByPrimaryKey(CampoMetadataKey campoMetadataKey);
	public int insertSelective(CampoMetadata campoMetadata);
	public int updateByPrimaryKeySelective(CampoMetadata campoMetadata);
	public int deleteByPrimaryKey(CampoMetadataKey campoMetadataKey);
	
	public int lastSequence();

	
}
