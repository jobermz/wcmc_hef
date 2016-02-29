package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.OppcostsAmazoniaOnlyDto;
import wcmc.hef.business.core.capa.service.OppcostsAmazoniaOnlyService;
import wcmc.hef.dao.capa.domain.OppcostsAmazoniaOnly;
import wcmc.hef.dao.capa.domain.OppcostsAmazoniaOnlyParamDef;
import wcmc.hef.dao.capa.domain.OppcostsAmazoniaOnlyParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.OppcostsAmazoniaOnlyMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class OppcostsAmazoniaOnlyServiceImpl implements OppcostsAmazoniaOnlyService {
	@Autowired
	private OppcostsAmazoniaOnlyMapper oppcostsAmazoniaOnlyMapper;
	public List<OppcostsAmazoniaOnly> buscar(OppcostsAmazoniaOnlyDto oppcostsAmazoniaOnlyDto) throws Exception {
		OppcostsAmazoniaOnlyParamDef oppcostsAmazoniaOnlyParamDef		= new OppcostsAmazoniaOnlyParamDef();
		
		Criteria criteria		= oppcostsAmazoniaOnlyParamDef.createCriteria();
		if(oppcostsAmazoniaOnlyDto != null) {
			if(CadenaUtil.getStrNull(oppcostsAmazoniaOnlyDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(oppcostsAmazoniaOnlyDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(oppcostsAmazoniaOnlyDto.getStrNombdist()) != null) {
				criteria.andStrNombdistLike(oppcostsAmazoniaOnlyDto.getStrNombdist());
			}
			if(CadenaUtil.getDoubNull(oppcostsAmazoniaOnlyDto.getDblCopTco2H()) != null) {
				criteria.andDblCopTco2HEqualTo(oppcostsAmazoniaOnlyDto.getDblCopTco2H());
			}
		}
		
		List<OppcostsAmazoniaOnly>	 list	= oppcostsAmazoniaOnlyMapper.selectByDefaultParameter(oppcostsAmazoniaOnlyParamDef);
		return list;
	}
	
	public OppcostsAmazoniaOnly buscarById(OppcostsAmazoniaOnlyDto oppcostsAmazoniaOnlyDto) throws Exception {
		OppcostsAmazoniaOnly oppcostsAmazoniaOnly		= new OppcostsAmazoniaOnly();
		BeanUtils.copyProperties(oppcostsAmazoniaOnlyDto, oppcostsAmazoniaOnly);
		return oppcostsAmazoniaOnlyMapper.selectByPrimaryKey(oppcostsAmazoniaOnly);
	}
	
	@Transactional
	public Integer guardar(OppcostsAmazoniaOnlyDto oppcostsAmazoniaOnlyDto) throws Exception {
		OppcostsAmazoniaOnly oppcostsAmazoniaOnly		= new OppcostsAmazoniaOnly();
		BeanUtils.copyProperties(oppcostsAmazoniaOnlyDto, oppcostsAmazoniaOnly);
		int rs	= 0;
		OppcostsAmazoniaOnly exiteOppcostsAmazoniaOnly		= oppcostsAmazoniaOnlyMapper.selectByPrimaryKey(oppcostsAmazoniaOnly);
		if(exiteOppcostsAmazoniaOnly != null) {
			rs	= oppcostsAmazoniaOnlyMapper.updateByPrimaryKeySelective(oppcostsAmazoniaOnly);
		} else {
			rs	= oppcostsAmazoniaOnlyMapper.insertSelective(oppcostsAmazoniaOnly);
			
			Integer srlGid	= oppcostsAmazoniaOnlyMapper.lastSequence();
			oppcostsAmazoniaOnlyDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(OppcostsAmazoniaOnlyDto oppcostsAmazoniaOnlyDto) throws Exception {
		OppcostsAmazoniaOnly oppcostsAmazoniaOnly		= new OppcostsAmazoniaOnly();
		BeanUtils.copyProperties(oppcostsAmazoniaOnlyDto, oppcostsAmazoniaOnly);
		Integer rs	= oppcostsAmazoniaOnlyMapper.deleteByPrimaryKey(oppcostsAmazoniaOnly);
		return rs;
	}
	
}
