package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.AnpRegionalDto;
import wcmc.hef.business.core.capa.service.AnpRegionalService;
import wcmc.hef.dao.capa.domain.AnpRegional;
import wcmc.hef.dao.capa.domain.AnpRegionalParamDef;
import wcmc.hef.dao.capa.domain.AnpRegionalParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.AnpRegionalMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class AnpRegionalServiceImpl implements AnpRegionalService {
	@Autowired
	private AnpRegionalMapper anpRegionalMapper;
	public List<AnpRegional> buscar(AnpRegionalDto anpRegionalDto) throws Exception {
		AnpRegionalParamDef anpRegionalParamDef		= new AnpRegionalParamDef();
		
		Criteria criteria		= anpRegionalParamDef.createCriteria();
		if(anpRegionalDto != null) {
			if(CadenaUtil.getStrNull(anpRegionalDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(anpRegionalDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(anpRegionalDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(anpRegionalDto.getIntObjectid());
			}
			if(CadenaUtil.getStrNull(anpRegionalDto.getStrAnpcCat()) != null) {
				criteria.andStrAnpcCatLike(anpRegionalDto.getStrAnpcCat());
			}
			if(CadenaUtil.getStrNull(anpRegionalDto.getStrAnpcCodi()) != null) {
				criteria.andStrAnpcCodiLike(anpRegionalDto.getStrAnpcCodi());
			}
			if(CadenaUtil.getStrNull(anpRegionalDto.getStrAnpcNomb()) != null) {
				criteria.andStrAnpcNombLike(anpRegionalDto.getStrAnpcNomb());
			}
			if(CadenaUtil.getDoubNull(anpRegionalDto.getDblAnpcArea()) != null) {
				criteria.andDblAnpcAreaEqualTo(anpRegionalDto.getDblAnpcArea());
			}
			if(CadenaUtil.getStrNull(anpRegionalDto.getStrAnpcBalec()) != null) {
				criteria.andStrAnpcBalecLike(anpRegionalDto.getStrAnpcBalec());
			}
			if(CadenaUtil.getStrNull(anpRegionalDto.getStrAnpcFelec()) != null) {
				criteria.andStrAnpcFelecLike(anpRegionalDto.getStrAnpcFelec());
			}
			if(CadenaUtil.getStrNull(anpRegionalDto.getStrAnpcBalem()) != null) {
				criteria.andStrAnpcBalemLike(anpRegionalDto.getStrAnpcBalem());
			}
			if(CadenaUtil.getStrNull(anpRegionalDto.getStrAnpcFelem()) != null) {
				criteria.andStrAnpcFelemLike(anpRegionalDto.getStrAnpcFelem());
			}
			if(CadenaUtil.getStrNull(anpRegionalDto.getStrAnpcDepa()) != null) {
				criteria.andStrAnpcDepaLike(anpRegionalDto.getStrAnpcDepa());
			}
		}
		
		List<AnpRegional>	 list	= anpRegionalMapper.selectByDefaultParameter(anpRegionalParamDef);
		return list;
	}
	
	public AnpRegional buscarById(AnpRegionalDto anpRegionalDto) throws Exception {
		AnpRegional anpRegional		= new AnpRegional();
		BeanUtils.copyProperties(anpRegionalDto, anpRegional);
		return anpRegionalMapper.selectByPrimaryKey(anpRegional);
	}
	
	@Transactional
	public Integer guardar(AnpRegionalDto anpRegionalDto) throws Exception {
		AnpRegional anpRegional		= new AnpRegional();
		BeanUtils.copyProperties(anpRegionalDto, anpRegional);
		int rs	= 0;
		AnpRegional exiteAnpRegional		= anpRegionalMapper.selectByPrimaryKey(anpRegional);
		if(exiteAnpRegional != null) {
			rs	= anpRegionalMapper.updateByPrimaryKeySelective(anpRegional);
		} else {
			rs	= anpRegionalMapper.insertSelective(anpRegional);
			
			Integer srlGid	= anpRegionalMapper.lastSequence();
			anpRegionalDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(AnpRegionalDto anpRegionalDto) throws Exception {
		AnpRegional anpRegional		= new AnpRegional();
		BeanUtils.copyProperties(anpRegionalDto, anpRegional);
		Integer rs	= anpRegionalMapper.deleteByPrimaryKey(anpRegional);
		return rs;
	}
	
}
