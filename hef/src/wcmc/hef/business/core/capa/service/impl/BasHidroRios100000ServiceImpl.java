package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.BasHidroRios100000Dto;
import wcmc.hef.business.core.capa.service.BasHidroRios100000Service;
import wcmc.hef.dao.capa.domain.BasHidroRios100000;
import wcmc.hef.dao.capa.domain.BasHidroRios100000ParamDef;
import wcmc.hef.dao.capa.domain.BasHidroRios100000ParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.BasHidroRios100000Mapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class BasHidroRios100000ServiceImpl implements BasHidroRios100000Service {
	@Autowired
	private BasHidroRios100000Mapper basHidroRios100000Mapper;
	public List<BasHidroRios100000> buscar(BasHidroRios100000Dto basHidroRios100000Dto) throws Exception {
		BasHidroRios100000ParamDef basHidroRios100000ParamDef		= new BasHidroRios100000ParamDef();
		
		Criteria criteria		= basHidroRios100000ParamDef.createCriteria();
		if(basHidroRios100000Dto != null) {
			if(CadenaUtil.getStrNull(basHidroRios100000Dto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(basHidroRios100000Dto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(basHidroRios100000Dto.getIntObjectid1()) != null) {
				criteria.andIntObjectid1EqualTo(basHidroRios100000Dto.getIntObjectid1());
			}
			if(CadenaUtil.getStrNull(basHidroRios100000Dto.getStrGmlId()) != null) {
				criteria.andStrGmlIdLike(basHidroRios100000Dto.getStrGmlId());
			}
			if(CadenaUtil.getInteNull(basHidroRios100000Dto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(basHidroRios100000Dto.getIntObjectid());
			}
			if(CadenaUtil.getStrNull(basHidroRios100000Dto.getStrJerHidro()) != null) {
				criteria.andStrJerHidroLike(basHidroRios100000Dto.getStrJerHidro());
			}
			if(CadenaUtil.getStrNull(basHidroRios100000Dto.getStrDpd99()) != null) {
				criteria.andStrDpd99Like(basHidroRios100000Dto.getStrDpd99());
			}
			if(CadenaUtil.getStrNull(basHidroRios100000Dto.getStrPp99()) != null) {
				criteria.andStrPp99Like(basHidroRios100000Dto.getStrPp99());
			}
			if(CadenaUtil.getStrNull(basHidroRios100000Dto.getStrDd()) != null) {
				criteria.andStrDdLike(basHidroRios100000Dto.getStrDd());
			}
			if(CadenaUtil.getStrNull(basHidroRios100000Dto.getStrDin99()) != null) {
				criteria.andStrDin99Like(basHidroRios100000Dto.getStrDin99());
			}
			if(CadenaUtil.getStrNull(basHidroRios100000Dto.getStrPn99()) != null) {
				criteria.andStrPn99Like(basHidroRios100000Dto.getStrPn99());
			}
			if(CadenaUtil.getStrNull(basHidroRios100000Dto.getStrDn99()) != null) {
				criteria.andStrDn99Like(basHidroRios100000Dto.getStrDn99());
			}
			if(CadenaUtil.getDoubNull(basHidroRios100000Dto.getDblShapeStle()) != null) {
				criteria.andDblShapeStleEqualTo(basHidroRios100000Dto.getDblShapeStle());
			}
		}
		
		List<BasHidroRios100000>	 list	= basHidroRios100000Mapper.selectByDefaultParameter(basHidroRios100000ParamDef);
		return list;
	}
	
	public BasHidroRios100000 buscarById(BasHidroRios100000Dto basHidroRios100000Dto) throws Exception {
		BasHidroRios100000 basHidroRios100000		= new BasHidroRios100000();
		BeanUtils.copyProperties(basHidroRios100000Dto, basHidroRios100000);
		return basHidroRios100000Mapper.selectByPrimaryKey(basHidroRios100000);
	}
	
	@Transactional
	public Integer guardar(BasHidroRios100000Dto basHidroRios100000Dto) throws Exception {
		BasHidroRios100000 basHidroRios100000		= new BasHidroRios100000();
		BeanUtils.copyProperties(basHidroRios100000Dto, basHidroRios100000);
		int rs	= 0;
		BasHidroRios100000 exiteBasHidroRios100000		= basHidroRios100000Mapper.selectByPrimaryKey(basHidroRios100000);
		if(exiteBasHidroRios100000 != null) {
			rs	= basHidroRios100000Mapper.updateByPrimaryKeySelective(basHidroRios100000);
		} else {
			rs	= basHidroRios100000Mapper.insertSelective(basHidroRios100000);
			
			Integer srlGid	= basHidroRios100000Mapper.lastSequence();
			basHidroRios100000Dto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(BasHidroRios100000Dto basHidroRios100000Dto) throws Exception {
		BasHidroRios100000 basHidroRios100000		= new BasHidroRios100000();
		BeanUtils.copyProperties(basHidroRios100000Dto, basHidroRios100000);
		Integer rs	= basHidroRios100000Mapper.deleteByPrimaryKey(basHidroRios100000);
		return rs;
	}
	
}
