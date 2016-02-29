package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.RedDepartamentalDto;
import wcmc.hef.business.core.capa.service.RedDepartamentalService;
import wcmc.hef.dao.capa.domain.RedDepartamental;
import wcmc.hef.dao.capa.domain.RedDepartamentalParamDef;
import wcmc.hef.dao.capa.domain.RedDepartamentalParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.RedDepartamentalMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class RedDepartamentalServiceImpl implements RedDepartamentalService {
	@Autowired
	private RedDepartamentalMapper redDepartamentalMapper;
	public List<RedDepartamental> buscar(RedDepartamentalDto redDepartamentalDto) throws Exception {
		RedDepartamentalParamDef redDepartamentalParamDef		= new RedDepartamentalParamDef();
		
		Criteria criteria		= redDepartamentalParamDef.createCriteria();
		if(redDepartamentalDto != null) {
			if(CadenaUtil.getStrNull(redDepartamentalDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(redDepartamentalDto.getStrTheGeom());
			}
			if(CadenaUtil.getDoubNull(redDepartamentalDto.getDblLongitud()) != null) {
				criteria.andDblLongitudEqualTo(redDepartamentalDto.getDblLongitud());
			}
			if(CadenaUtil.getStrNull(redDepartamentalDto.getStrDpto()) != null) {
				criteria.andStrDptoLike(redDepartamentalDto.getStrDpto());
			}
			if(CadenaUtil.getStrNull(redDepartamentalDto.getStrRutaD044()) != null) {
				criteria.andStrRutaD044Like(redDepartamentalDto.getStrRutaD044());
			}
			if(CadenaUtil.getStrNull(redDepartamentalDto.getStrRed044()) != null) {
				criteria.andStrRed044Like(redDepartamentalDto.getStrRed044());
			}
			if(CadenaUtil.getStrNull(redDepartamentalDto.getStrSupercicie()) != null) {
				criteria.andStrSupercicieLike(redDepartamentalDto.getStrSupercicie());
			}
		}
		
		List<RedDepartamental>	 list	= redDepartamentalMapper.selectByDefaultParameter(redDepartamentalParamDef);
		return list;
	}
	
	public RedDepartamental buscarById(RedDepartamentalDto redDepartamentalDto) throws Exception {
		RedDepartamental redDepartamental		= new RedDepartamental();
		BeanUtils.copyProperties(redDepartamentalDto, redDepartamental);
		return redDepartamentalMapper.selectByPrimaryKey(redDepartamental);
	}
	
	@Transactional
	public Integer guardar(RedDepartamentalDto redDepartamentalDto) throws Exception {
		RedDepartamental redDepartamental		= new RedDepartamental();
		BeanUtils.copyProperties(redDepartamentalDto, redDepartamental);
		int rs	= 0;
		RedDepartamental exiteRedDepartamental		= redDepartamentalMapper.selectByPrimaryKey(redDepartamental);
		if(exiteRedDepartamental != null) {
			rs	= redDepartamentalMapper.updateByPrimaryKeySelective(redDepartamental);
		} else {
			rs	= redDepartamentalMapper.insertSelective(redDepartamental);
			
			Integer srlGid	= redDepartamentalMapper.lastSequence();
			redDepartamentalDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(RedDepartamentalDto redDepartamentalDto) throws Exception {
		RedDepartamental redDepartamental		= new RedDepartamental();
		BeanUtils.copyProperties(redDepartamentalDto, redDepartamental);
		Integer rs	= redDepartamentalMapper.deleteByPrimaryKey(redDepartamental);
		return rs;
	}
	
}
