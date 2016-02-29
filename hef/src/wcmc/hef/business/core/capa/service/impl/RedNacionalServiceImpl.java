package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.RedNacionalDto;
import wcmc.hef.business.core.capa.service.RedNacionalService;
import wcmc.hef.dao.capa.domain.RedNacional;
import wcmc.hef.dao.capa.domain.RedNacionalParamDef;
import wcmc.hef.dao.capa.domain.RedNacionalParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.RedNacionalMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class RedNacionalServiceImpl implements RedNacionalService {
	@Autowired
	private RedNacionalMapper redNacionalMapper;
	public List<RedNacional> buscar(RedNacionalDto redNacionalDto) throws Exception {
		RedNacionalParamDef redNacionalParamDef		= new RedNacionalParamDef();
		
		Criteria criteria		= redNacionalParamDef.createCriteria();
		if(redNacionalDto != null) {
			if(CadenaUtil.getStrNull(redNacionalDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(redNacionalDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(redNacionalDto.getStrDpto()) != null) {
				criteria.andStrDptoLike(redNacionalDto.getStrDpto());
			}
			if(CadenaUtil.getStrNull(redNacionalDto.getStrRutaD044()) != null) {
				criteria.andStrRutaD044Like(redNacionalDto.getStrRutaD044());
			}
			if(CadenaUtil.getStrNull(redNacionalDto.getStrRed044()) != null) {
				criteria.andStrRed044Like(redNacionalDto.getStrRed044());
			}
			if(CadenaUtil.getDoubNull(redNacionalDto.getDblLongkmD44()) != null) {
				criteria.andDblLongkmD44EqualTo(redNacionalDto.getDblLongkmD44());
			}
			if(CadenaUtil.getStrNull(redNacionalDto.getStrSuperRod()) != null) {
				criteria.andStrSuperRodLike(redNacionalDto.getStrSuperRod());
			}
		}
		
		List<RedNacional>	 list	= redNacionalMapper.selectByDefaultParameter(redNacionalParamDef);
		return list;
	}
	
	public RedNacional buscarById(RedNacionalDto redNacionalDto) throws Exception {
		RedNacional redNacional		= new RedNacional();
		BeanUtils.copyProperties(redNacionalDto, redNacional);
		return redNacionalMapper.selectByPrimaryKey(redNacional);
	}
	
	@Transactional
	public Integer guardar(RedNacionalDto redNacionalDto) throws Exception {
		RedNacional redNacional		= new RedNacional();
		BeanUtils.copyProperties(redNacionalDto, redNacional);
		int rs	= 0;
		RedNacional exiteRedNacional		= redNacionalMapper.selectByPrimaryKey(redNacional);
		if(exiteRedNacional != null) {
			rs	= redNacionalMapper.updateByPrimaryKeySelective(redNacional);
		} else {
			rs	= redNacionalMapper.insertSelective(redNacional);
			
			Integer srlGid	= redNacionalMapper.lastSequence();
			redNacionalDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(RedNacionalDto redNacionalDto) throws Exception {
		RedNacional redNacional		= new RedNacional();
		BeanUtils.copyProperties(redNacionalDto, redNacional);
		Integer rs	= redNacionalMapper.deleteByPrimaryKey(redNacional);
		return rs;
	}
	
}
