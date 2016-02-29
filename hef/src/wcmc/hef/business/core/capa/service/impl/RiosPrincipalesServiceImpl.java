package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.RiosPrincipalesDto;
import wcmc.hef.business.core.capa.service.RiosPrincipalesService;
import wcmc.hef.dao.capa.domain.RiosPrincipales;
import wcmc.hef.dao.capa.domain.RiosPrincipalesParamDef;
import wcmc.hef.dao.capa.domain.RiosPrincipalesParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.RiosPrincipalesMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class RiosPrincipalesServiceImpl implements RiosPrincipalesService {
	@Autowired
	private RiosPrincipalesMapper riosPrincipalesMapper;
	public List<RiosPrincipales> buscar(RiosPrincipalesDto riosPrincipalesDto) throws Exception {
		RiosPrincipalesParamDef riosPrincipalesParamDef		= new RiosPrincipalesParamDef();
		
		Criteria criteria		= riosPrincipalesParamDef.createCriteria();
		if(riosPrincipalesDto != null) {
			if(CadenaUtil.getStrNull(riosPrincipalesDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(riosPrincipalesDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(riosPrincipalesDto.getIntObjectid1()) != null) {
				criteria.andIntObjectid1EqualTo(riosPrincipalesDto.getIntObjectid1());
			}
			if(CadenaUtil.getStrNull(riosPrincipalesDto.getStrGmlId()) != null) {
				criteria.andStrGmlIdLike(riosPrincipalesDto.getStrGmlId());
			}
			if(CadenaUtil.getInteNull(riosPrincipalesDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(riosPrincipalesDto.getIntObjectid());
			}
			if(CadenaUtil.getStrNull(riosPrincipalesDto.getStrJerHidro()) != null) {
				criteria.andStrJerHidroLike(riosPrincipalesDto.getStrJerHidro());
			}
			if(CadenaUtil.getStrNull(riosPrincipalesDto.getStrDpd99()) != null) {
				criteria.andStrDpd99Like(riosPrincipalesDto.getStrDpd99());
			}
			if(CadenaUtil.getStrNull(riosPrincipalesDto.getStrPp99()) != null) {
				criteria.andStrPp99Like(riosPrincipalesDto.getStrPp99());
			}
			if(CadenaUtil.getStrNull(riosPrincipalesDto.getStrDd()) != null) {
				criteria.andStrDdLike(riosPrincipalesDto.getStrDd());
			}
			if(CadenaUtil.getStrNull(riosPrincipalesDto.getStrDin99()) != null) {
				criteria.andStrDin99Like(riosPrincipalesDto.getStrDin99());
			}
			if(CadenaUtil.getStrNull(riosPrincipalesDto.getStrPn99()) != null) {
				criteria.andStrPn99Like(riosPrincipalesDto.getStrPn99());
			}
			if(CadenaUtil.getStrNull(riosPrincipalesDto.getStrDn99()) != null) {
				criteria.andStrDn99Like(riosPrincipalesDto.getStrDn99());
			}
			if(CadenaUtil.getDoubNull(riosPrincipalesDto.getDblShapeStle()) != null) {
				criteria.andDblShapeStleEqualTo(riosPrincipalesDto.getDblShapeStle());
			}
		}
		
		List<RiosPrincipales>	 list	= riosPrincipalesMapper.selectByDefaultParameter(riosPrincipalesParamDef);
		return list;
	}
	
	public RiosPrincipales buscarById(RiosPrincipalesDto riosPrincipalesDto) throws Exception {
		RiosPrincipales riosPrincipales		= new RiosPrincipales();
		BeanUtils.copyProperties(riosPrincipalesDto, riosPrincipales);
		return riosPrincipalesMapper.selectByPrimaryKey(riosPrincipales);
	}
	
	@Transactional
	public Integer guardar(RiosPrincipalesDto riosPrincipalesDto) throws Exception {
		RiosPrincipales riosPrincipales		= new RiosPrincipales();
		BeanUtils.copyProperties(riosPrincipalesDto, riosPrincipales);
		int rs	= 0;
		RiosPrincipales exiteRiosPrincipales		= riosPrincipalesMapper.selectByPrimaryKey(riosPrincipales);
		if(exiteRiosPrincipales != null) {
			rs	= riosPrincipalesMapper.updateByPrimaryKeySelective(riosPrincipales);
		} else {
			rs	= riosPrincipalesMapper.insertSelective(riosPrincipales);
			
			Integer srlGid	= riosPrincipalesMapper.lastSequence();
			riosPrincipalesDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(RiosPrincipalesDto riosPrincipalesDto) throws Exception {
		RiosPrincipales riosPrincipales		= new RiosPrincipales();
		BeanUtils.copyProperties(riosPrincipalesDto, riosPrincipales);
		Integer rs	= riosPrincipalesMapper.deleteByPrimaryKey(riosPrincipales);
		return rs;
	}
	
}
