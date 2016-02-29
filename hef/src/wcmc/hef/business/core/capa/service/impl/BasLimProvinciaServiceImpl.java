package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.BasLimProvinciaDto;
import wcmc.hef.business.core.capa.service.BasLimProvinciaService;
import wcmc.hef.dao.capa.domain.BasLimProvincia;
import wcmc.hef.dao.capa.domain.BasLimProvinciaParamDef;
import wcmc.hef.dao.capa.domain.BasLimProvinciaParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.BasLimProvinciaMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class BasLimProvinciaServiceImpl implements BasLimProvinciaService {
	@Autowired
	private BasLimProvinciaMapper basLimProvinciaMapper;
	public List<BasLimProvincia> buscar(BasLimProvinciaDto basLimProvinciaDto) throws Exception {
		BasLimProvinciaParamDef basLimProvinciaParamDef		= new BasLimProvinciaParamDef();
		
		Criteria criteria		= basLimProvinciaParamDef.createCriteria();
		if(basLimProvinciaDto != null) {
			if(CadenaUtil.getStrNull(basLimProvinciaDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(basLimProvinciaDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(basLimProvinciaDto.getStrIddpto()) != null) {
				criteria.andStrIddptoLike(basLimProvinciaDto.getStrIddpto());
			}
			if(CadenaUtil.getStrNull(basLimProvinciaDto.getStrNombdep()) != null) {
				criteria.andStrNombdepLike(basLimProvinciaDto.getStrNombdep());
			}
			if(CadenaUtil.getStrNull(basLimProvinciaDto.getStrIdprov()) != null) {
				criteria.andStrIdprovLike(basLimProvinciaDto.getStrIdprov());
			}
			if(CadenaUtil.getStrNull(basLimProvinciaDto.getStrNombprov()) != null) {
				criteria.andStrNombprovLike(basLimProvinciaDto.getStrNombprov());
			}
			if(CadenaUtil.getStrNull(basLimProvinciaDto.getStrCapital()) != null) {
				criteria.andStrCapitalLike(basLimProvinciaDto.getStrCapital());
			}
		}
		
		List<BasLimProvincia>	 list	= basLimProvinciaMapper.selectByDefaultParameter(basLimProvinciaParamDef);
		return list;
	}
	
	public BasLimProvincia buscarById(BasLimProvinciaDto basLimProvinciaDto) throws Exception {
		BasLimProvincia basLimProvincia		= new BasLimProvincia();
		BeanUtils.copyProperties(basLimProvinciaDto, basLimProvincia);
		return basLimProvinciaMapper.selectByPrimaryKey(basLimProvincia);
	}
	
	@Transactional
	public Integer guardar(BasLimProvinciaDto basLimProvinciaDto) throws Exception {
		BasLimProvincia basLimProvincia		= new BasLimProvincia();
		BeanUtils.copyProperties(basLimProvinciaDto, basLimProvincia);
		int rs	= 0;
		BasLimProvincia exiteBasLimProvincia		= basLimProvinciaMapper.selectByPrimaryKey(basLimProvincia);
		if(exiteBasLimProvincia != null) {
			rs	= basLimProvinciaMapper.updateByPrimaryKeySelective(basLimProvincia);
		} else {
			rs	= basLimProvinciaMapper.insertSelective(basLimProvincia);
			
			Integer srlGid	= basLimProvinciaMapper.lastSequence();
			basLimProvinciaDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(BasLimProvinciaDto basLimProvinciaDto) throws Exception {
		BasLimProvincia basLimProvincia		= new BasLimProvincia();
		BeanUtils.copyProperties(basLimProvinciaDto, basLimProvincia);
		Integer rs	= basLimProvinciaMapper.deleteByPrimaryKey(basLimProvincia);
		return rs;
	}
	
}
