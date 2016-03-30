package wcmc.hef.business.core.configuracion.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.configuracion.dto.CampoMetadataDto;
import wcmc.hef.business.core.configuracion.service.CampoMetadataService;
import wcmc.hef.dao.configuracion.domain.CampoMetadata;
import wcmc.hef.dao.configuracion.domain.CampoMetadataParamDef;
import wcmc.hef.dao.configuracion.domain.CampoMetadataParamDef.Criteria;
import wcmc.hef.dao.configuracion.mapper.CampoMetadataMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class CampoMetadataServiceImpl implements CampoMetadataService {
	@Autowired
	private CampoMetadataMapper campoMetadataMapper;
	public List<CampoMetadata> buscar(CampoMetadataDto campoMetadataDto) throws Exception {
		CampoMetadataParamDef campoMetadataParamDef		= new CampoMetadataParamDef();
		
		Criteria criteria		= campoMetadataParamDef.createCriteria();
		if(campoMetadataDto != null) {
			if(CadenaUtil.getStrNull(campoMetadataDto.getStrNombre()) != null) {
				criteria.andStrNombreLike(campoMetadataDto.getStrNombre());
			}
			if(CadenaUtil.getInteNull(campoMetadataDto.getIntIdCapa()) != null) {
				criteria.andIntIdCapaEqualTo(campoMetadataDto.getIntIdCapa());
			}
		}
		campoMetadataParamDef.setOrderByClause("cd_campometadata");
		List<CampoMetadata>	 list	= campoMetadataMapper.selectByDefaultParameter(campoMetadataParamDef);
		return list;
	}
	
	public CampoMetadata buscarById(CampoMetadataDto campoMetadataDto) throws Exception {
		CampoMetadata campoMetadata		= new CampoMetadata();
		BeanUtils.copyProperties(campoMetadataDto, campoMetadata);
		return campoMetadataMapper.selectByPrimaryKey(campoMetadata);
	}
	
	@Transactional
	public Integer guardar(CampoMetadataDto campoMetadataDto) throws Exception {
		CampoMetadata campoMetadata		= new CampoMetadata();
		BeanUtils.copyProperties(campoMetadataDto, campoMetadata);
		int rs	= 0;
		CampoMetadata exiteCampoMetadata		= campoMetadataMapper.selectByPrimaryKey(campoMetadata);
		if(exiteCampoMetadata != null) {
			rs	= campoMetadataMapper.updateByPrimaryKeySelective(campoMetadata);
		} else {
			rs	= campoMetadataMapper.insertSelective(campoMetadata);
			
			Integer srlIdCampoMetadata	= campoMetadataMapper.lastSequence();
			campoMetadataDto.setSrlIdCampoMetadata(srlIdCampoMetadata);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(CampoMetadataDto campoMetadataDto) throws Exception {
		CampoMetadata campoMetadata		= new CampoMetadata();
		BeanUtils.copyProperties(campoMetadataDto, campoMetadata);
		Integer rs	= campoMetadataMapper.deleteByPrimaryKey(campoMetadata);
		return rs;
	}
	
}
