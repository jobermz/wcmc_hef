package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.BasViasRedVialDepartamentalDto;
import wcmc.hef.business.core.capa.service.BasViasRedVialDepartamentalService;
import wcmc.hef.dao.capa.domain.BasViasRedVialDepartamental;
import wcmc.hef.dao.capa.domain.BasViasRedVialDepartamentalParamDef;
import wcmc.hef.dao.capa.domain.BasViasRedVialDepartamentalParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.BasViasRedVialDepartamentalMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class BasViasRedVialDepartamentalServiceImpl implements BasViasRedVialDepartamentalService {
	@Autowired
	private BasViasRedVialDepartamentalMapper basViasRedVialDepartamentalMapper;
	public List<BasViasRedVialDepartamental> buscar(BasViasRedVialDepartamentalDto basViasRedVialDepartamentalDto) throws Exception {
		BasViasRedVialDepartamentalParamDef basViasRedVialDepartamentalParamDef		= new BasViasRedVialDepartamentalParamDef();
		
		Criteria criteria		= basViasRedVialDepartamentalParamDef.createCriteria();
		if(basViasRedVialDepartamentalDto != null) {
			if(CadenaUtil.getStrNull(basViasRedVialDepartamentalDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(basViasRedVialDepartamentalDto.getStrTheGeom());
			}
			if(CadenaUtil.getDoubNull(basViasRedVialDepartamentalDto.getDblLongitud()) != null) {
				criteria.andDblLongitudEqualTo(basViasRedVialDepartamentalDto.getDblLongitud());
			}
			if(CadenaUtil.getStrNull(basViasRedVialDepartamentalDto.getStrDpto()) != null) {
				criteria.andStrDptoLike(basViasRedVialDepartamentalDto.getStrDpto());
			}
			if(CadenaUtil.getStrNull(basViasRedVialDepartamentalDto.getStrRutaD044()) != null) {
				criteria.andStrRutaD044Like(basViasRedVialDepartamentalDto.getStrRutaD044());
			}
			if(CadenaUtil.getStrNull(basViasRedVialDepartamentalDto.getStrRed044()) != null) {
				criteria.andStrRed044Like(basViasRedVialDepartamentalDto.getStrRed044());
			}
			if(CadenaUtil.getStrNull(basViasRedVialDepartamentalDto.getStrSupercicie()) != null) {
				criteria.andStrSupercicieLike(basViasRedVialDepartamentalDto.getStrSupercicie());
			}
		}
		
		List<BasViasRedVialDepartamental>	 list	= basViasRedVialDepartamentalMapper.selectByDefaultParameter(basViasRedVialDepartamentalParamDef);
		return list;
	}
	
	public BasViasRedVialDepartamental buscarById(BasViasRedVialDepartamentalDto basViasRedVialDepartamentalDto) throws Exception {
		BasViasRedVialDepartamental basViasRedVialDepartamental		= new BasViasRedVialDepartamental();
		BeanUtils.copyProperties(basViasRedVialDepartamentalDto, basViasRedVialDepartamental);
		return basViasRedVialDepartamentalMapper.selectByPrimaryKey(basViasRedVialDepartamental);
	}
	
	@Transactional
	public Integer guardar(BasViasRedVialDepartamentalDto basViasRedVialDepartamentalDto) throws Exception {
		BasViasRedVialDepartamental basViasRedVialDepartamental		= new BasViasRedVialDepartamental();
		BeanUtils.copyProperties(basViasRedVialDepartamentalDto, basViasRedVialDepartamental);
		int rs	= 0;
		BasViasRedVialDepartamental exiteBasViasRedVialDepartamental		= basViasRedVialDepartamentalMapper.selectByPrimaryKey(basViasRedVialDepartamental);
		if(exiteBasViasRedVialDepartamental != null) {
			rs	= basViasRedVialDepartamentalMapper.updateByPrimaryKeySelective(basViasRedVialDepartamental);
		} else {
			rs	= basViasRedVialDepartamentalMapper.insertSelective(basViasRedVialDepartamental);
			
			Integer srlGid	= basViasRedVialDepartamentalMapper.lastSequence();
			basViasRedVialDepartamentalDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(BasViasRedVialDepartamentalDto basViasRedVialDepartamentalDto) throws Exception {
		BasViasRedVialDepartamental basViasRedVialDepartamental		= new BasViasRedVialDepartamental();
		BeanUtils.copyProperties(basViasRedVialDepartamentalDto, basViasRedVialDepartamental);
		Integer rs	= basViasRedVialDepartamentalMapper.deleteByPrimaryKey(basViasRedVialDepartamental);
		return rs;
	}
	
}
