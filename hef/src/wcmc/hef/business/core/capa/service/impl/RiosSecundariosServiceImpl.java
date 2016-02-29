package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.RiosSecundariosDto;
import wcmc.hef.business.core.capa.service.RiosSecundariosService;
import wcmc.hef.dao.capa.domain.RiosSecundarios;
import wcmc.hef.dao.capa.domain.RiosSecundariosParamDef;
import wcmc.hef.dao.capa.domain.RiosSecundariosParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.RiosSecundariosMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class RiosSecundariosServiceImpl implements RiosSecundariosService {
	@Autowired
	private RiosSecundariosMapper riosSecundariosMapper;
	public List<RiosSecundarios> buscar(RiosSecundariosDto riosSecundariosDto) throws Exception {
		RiosSecundariosParamDef riosSecundariosParamDef		= new RiosSecundariosParamDef();
		
		Criteria criteria		= riosSecundariosParamDef.createCriteria();
		if(riosSecundariosDto != null) {
			if(CadenaUtil.getStrNull(riosSecundariosDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(riosSecundariosDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(riosSecundariosDto.getIntObjectid1()) != null) {
				criteria.andIntObjectid1EqualTo(riosSecundariosDto.getIntObjectid1());
			}
			if(CadenaUtil.getStrNull(riosSecundariosDto.getStrGmlId()) != null) {
				criteria.andStrGmlIdLike(riosSecundariosDto.getStrGmlId());
			}
			if(CadenaUtil.getInteNull(riosSecundariosDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(riosSecundariosDto.getIntObjectid());
			}
			if(CadenaUtil.getStrNull(riosSecundariosDto.getStrJerHidro()) != null) {
				criteria.andStrJerHidroLike(riosSecundariosDto.getStrJerHidro());
			}
			if(CadenaUtil.getStrNull(riosSecundariosDto.getStrDpd99()) != null) {
				criteria.andStrDpd99Like(riosSecundariosDto.getStrDpd99());
			}
			if(CadenaUtil.getStrNull(riosSecundariosDto.getStrPp99()) != null) {
				criteria.andStrPp99Like(riosSecundariosDto.getStrPp99());
			}
			if(CadenaUtil.getStrNull(riosSecundariosDto.getStrDd()) != null) {
				criteria.andStrDdLike(riosSecundariosDto.getStrDd());
			}
			if(CadenaUtil.getStrNull(riosSecundariosDto.getStrDin99()) != null) {
				criteria.andStrDin99Like(riosSecundariosDto.getStrDin99());
			}
			if(CadenaUtil.getStrNull(riosSecundariosDto.getStrPn99()) != null) {
				criteria.andStrPn99Like(riosSecundariosDto.getStrPn99());
			}
			if(CadenaUtil.getStrNull(riosSecundariosDto.getStrDn99()) != null) {
				criteria.andStrDn99Like(riosSecundariosDto.getStrDn99());
			}
			if(CadenaUtil.getDoubNull(riosSecundariosDto.getDblShapeStle()) != null) {
				criteria.andDblShapeStleEqualTo(riosSecundariosDto.getDblShapeStle());
			}
		}
		
		List<RiosSecundarios>	 list	= riosSecundariosMapper.selectByDefaultParameter(riosSecundariosParamDef);
		return list;
	}
	
	public RiosSecundarios buscarById(RiosSecundariosDto riosSecundariosDto) throws Exception {
		RiosSecundarios riosSecundarios		= new RiosSecundarios();
		BeanUtils.copyProperties(riosSecundariosDto, riosSecundarios);
		return riosSecundariosMapper.selectByPrimaryKey(riosSecundarios);
	}
	
	@Transactional
	public Integer guardar(RiosSecundariosDto riosSecundariosDto) throws Exception {
		RiosSecundarios riosSecundarios		= new RiosSecundarios();
		BeanUtils.copyProperties(riosSecundariosDto, riosSecundarios);
		int rs	= 0;
		RiosSecundarios exiteRiosSecundarios		= riosSecundariosMapper.selectByPrimaryKey(riosSecundarios);
		if(exiteRiosSecundarios != null) {
			rs	= riosSecundariosMapper.updateByPrimaryKeySelective(riosSecundarios);
		} else {
			rs	= riosSecundariosMapper.insertSelective(riosSecundarios);
			
			Integer srlGid	= riosSecundariosMapper.lastSequence();
			riosSecundariosDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(RiosSecundariosDto riosSecundariosDto) throws Exception {
		RiosSecundarios riosSecundarios		= new RiosSecundarios();
		BeanUtils.copyProperties(riosSecundariosDto, riosSecundarios);
		Integer rs	= riosSecundariosMapper.deleteByPrimaryKey(riosSecundarios);
		return rs;
	}
	
}
