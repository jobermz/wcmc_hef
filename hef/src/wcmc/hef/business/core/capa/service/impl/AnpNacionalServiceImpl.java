package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.AnpNacionalDto;
import wcmc.hef.business.core.capa.service.AnpNacionalService;
import wcmc.hef.dao.capa.domain.AnpNacional;
import wcmc.hef.dao.capa.domain.AnpNacionalParamDef;
import wcmc.hef.dao.capa.domain.AnpNacionalParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.AnpNacionalMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class AnpNacionalServiceImpl implements AnpNacionalService {
	@Autowired
	private AnpNacionalMapper anpNacionalMapper;
	public List<AnpNacional> buscar(AnpNacionalDto anpNacionalDto) throws Exception {
		AnpNacionalParamDef anpNacionalParamDef		= new AnpNacionalParamDef();
		
		Criteria criteria		= anpNacionalParamDef.createCriteria();
		if(anpNacionalDto != null) {
			if(CadenaUtil.getStrNull(anpNacionalDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(anpNacionalDto.getStrTheGeom());
			}
			if(CadenaUtil.getLongNull(anpNacionalDto.getLngObjectid()) != null) {
				criteria.andLngObjectidEqualTo(anpNacionalDto.getLngObjectid());
			}
			if(CadenaUtil.getStrNull(anpNacionalDto.getStrAnpCate()) != null) {
				criteria.andStrAnpCateLike(anpNacionalDto.getStrAnpCate());
			}
			if(CadenaUtil.getStrNull(anpNacionalDto.getStrAnpNomb()) != null) {
				criteria.andStrAnpNombLike(anpNacionalDto.getStrAnpNomb());
			}
			if(CadenaUtil.getStrNull(anpNacionalDto.getStrAnpCodi()) != null) {
				criteria.andStrAnpCodiLike(anpNacionalDto.getStrAnpCodi());
			}
			if(CadenaUtil.getStrNull(anpNacionalDto.getStrAnpUbpo()) != null) {
				criteria.andStrAnpUbpoLike(anpNacionalDto.getStrAnpUbpo());
			}
			if(CadenaUtil.getDoubNull(anpNacionalDto.getDblAnpArle()) != null) {
				criteria.andDblAnpArleEqualTo(anpNacionalDto.getDblAnpArle());
			}
			if(CadenaUtil.getStrNull(anpNacionalDto.getStrAnpBalecr()) != null) {
				criteria.andStrAnpBalecrLike(anpNacionalDto.getStrAnpBalecr());
			}
			if(CadenaUtil.getStrNull(anpNacionalDto.getStrAnpFecrea()) != null) {
				criteria.andStrAnpFecreaLike(anpNacionalDto.getStrAnpFecrea());
			}
			if(CadenaUtil.getStrNull(anpNacionalDto.getStrAnpBalemo()) != null) {
				criteria.andStrAnpBalemoLike(anpNacionalDto.getStrAnpBalemo());
			}
			if(CadenaUtil.getStrNull(anpNacionalDto.getStrAnpFemodi()) != null) {
				criteria.andStrAnpFemodiLike(anpNacionalDto.getStrAnpFemodi());
			}
		}
		
		List<AnpNacional>	 list	= anpNacionalMapper.selectByDefaultParameter(anpNacionalParamDef);
		return list;
	}
	
	public AnpNacional buscarById(AnpNacionalDto anpNacionalDto) throws Exception {
		AnpNacional anpNacional		= new AnpNacional();
		BeanUtils.copyProperties(anpNacionalDto, anpNacional);
		return anpNacionalMapper.selectByPrimaryKey(anpNacional);
	}
	
	@Transactional
	public Integer guardar(AnpNacionalDto anpNacionalDto) throws Exception {
		AnpNacional anpNacional		= new AnpNacional();
		BeanUtils.copyProperties(anpNacionalDto, anpNacional);
		int rs	= 0;
		AnpNacional exiteAnpNacional		= anpNacionalMapper.selectByPrimaryKey(anpNacional);
		if(exiteAnpNacional != null) {
			rs	= anpNacionalMapper.updateByPrimaryKeySelective(anpNacional);
		} else {
			rs	= anpNacionalMapper.insertSelective(anpNacional);
			
			Integer srlGid	= anpNacionalMapper.lastSequence();
			anpNacionalDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(AnpNacionalDto anpNacionalDto) throws Exception {
		AnpNacional anpNacional		= new AnpNacional();
		BeanUtils.copyProperties(anpNacionalDto, anpNacional);
		Integer rs	= anpNacionalMapper.deleteByPrimaryKey(anpNacional);
		return rs;
	}
	
}
