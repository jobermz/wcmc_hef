package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.BasLimAmazoniaDto;
import wcmc.hef.business.core.capa.service.BasLimAmazoniaService;
import wcmc.hef.dao.capa.domain.BasLimAmazonia;
import wcmc.hef.dao.capa.domain.BasLimAmazoniaParamDef;
import wcmc.hef.dao.capa.domain.BasLimAmazoniaParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.BasLimAmazoniaMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class BasLimAmazoniaServiceImpl implements BasLimAmazoniaService {
	@Autowired
	private BasLimAmazoniaMapper basLimAmazoniaMapper;
	public List<BasLimAmazonia> buscar(BasLimAmazoniaDto basLimAmazoniaDto) throws Exception {
		BasLimAmazoniaParamDef basLimAmazoniaParamDef		= new BasLimAmazoniaParamDef();
		
		Criteria criteria		= basLimAmazoniaParamDef.createCriteria();
		if(basLimAmazoniaDto != null) {
			if(CadenaUtil.getStrNull(basLimAmazoniaDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(basLimAmazoniaDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(basLimAmazoniaDto.getIntObjectid1()) != null) {
				criteria.andIntObjectid1EqualTo(basLimAmazoniaDto.getIntObjectid1());
			}
			if(CadenaUtil.getStrNull(basLimAmazoniaDto.getStrSimbCobve()) != null) {
				criteria.andStrSimbCobveLike(basLimAmazoniaDto.getStrSimbCobve());
			}
			if(CadenaUtil.getStrNull(basLimAmazoniaDto.getStrDescCobve()) != null) {
				criteria.andStrDescCobveLike(basLimAmazoniaDto.getStrDescCobve());
			}
			if(CadenaUtil.getStrNull(basLimAmazoniaDto.getStrSimbDefor()) != null) {
				criteria.andStrSimbDeforLike(basLimAmazoniaDto.getStrSimbDefor());
			}
			if(CadenaUtil.getStrNull(basLimAmazoniaDto.getStrDescDefor()) != null) {
				criteria.andStrDescDeforLike(basLimAmazoniaDto.getStrDescDefor());
			}
			if(CadenaUtil.getDoubNull(basLimAmazoniaDto.getDblSuperfM2()) != null) {
				criteria.andDblSuperfM2EqualTo(basLimAmazoniaDto.getDblSuperfM2());
			}
			if(CadenaUtil.getDoubNull(basLimAmazoniaDto.getDblSuperfHa()) != null) {
				criteria.andDblSuperfHaEqualTo(basLimAmazoniaDto.getDblSuperfHa());
			}
			if(CadenaUtil.getStrNull(basLimAmazoniaDto.getStrSimCvDef()) != null) {
				criteria.andStrSimCvDefLike(basLimAmazoniaDto.getStrSimCvDef());
			}
			if(CadenaUtil.getDoubNull(basLimAmazoniaDto.getDblSuperfKm2()) != null) {
				criteria.andDblSuperfKm2EqualTo(basLimAmazoniaDto.getDblSuperfKm2());
			}
		}
		
		List<BasLimAmazonia>	 list	= basLimAmazoniaMapper.selectByDefaultParameter(basLimAmazoniaParamDef);
		return list;
	}
	
	public BasLimAmazonia buscarById(BasLimAmazoniaDto basLimAmazoniaDto) throws Exception {
		BasLimAmazonia basLimAmazonia		= new BasLimAmazonia();
		BeanUtils.copyProperties(basLimAmazoniaDto, basLimAmazonia);
		return basLimAmazoniaMapper.selectByPrimaryKey(basLimAmazonia);
	}
	
	@Transactional
	public Integer guardar(BasLimAmazoniaDto basLimAmazoniaDto) throws Exception {
		BasLimAmazonia basLimAmazonia		= new BasLimAmazonia();
		BeanUtils.copyProperties(basLimAmazoniaDto, basLimAmazonia);
		int rs	= 0;
		BasLimAmazonia exiteBasLimAmazonia		= basLimAmazoniaMapper.selectByPrimaryKey(basLimAmazonia);
		if(exiteBasLimAmazonia != null) {
			rs	= basLimAmazoniaMapper.updateByPrimaryKeySelective(basLimAmazonia);
		} else {
			rs	= basLimAmazoniaMapper.insertSelective(basLimAmazonia);
			
			Integer srlGid	= basLimAmazoniaMapper.lastSequence();
			basLimAmazoniaDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(BasLimAmazoniaDto basLimAmazoniaDto) throws Exception {
		BasLimAmazonia basLimAmazonia		= new BasLimAmazonia();
		BeanUtils.copyProperties(basLimAmazoniaDto, basLimAmazonia);
		Integer rs	= basLimAmazoniaMapper.deleteByPrimaryKey(basLimAmazonia);
		return rs;
	}
	
}
