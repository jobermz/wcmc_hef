package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.AnpPrivadaDto;
import wcmc.hef.business.core.capa.service.AnpPrivadaService;
import wcmc.hef.dao.capa.domain.AnpPrivada;
import wcmc.hef.dao.capa.domain.AnpPrivadaParamDef;
import wcmc.hef.dao.capa.domain.AnpPrivadaParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.AnpPrivadaMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class AnpPrivadaServiceImpl implements AnpPrivadaService {
	@Autowired
	private AnpPrivadaMapper anpPrivadaMapper;
	public List<AnpPrivada> buscar(AnpPrivadaDto anpPrivadaDto) throws Exception {
		AnpPrivadaParamDef anpPrivadaParamDef		= new AnpPrivadaParamDef();
		
		Criteria criteria		= anpPrivadaParamDef.createCriteria();
		if(anpPrivadaDto != null) {
			if(CadenaUtil.getStrNull(anpPrivadaDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(anpPrivadaDto.getStrTheGeom());
			}
			if(CadenaUtil.getLongNull(anpPrivadaDto.getLngObjectid()) != null) {
				criteria.andLngObjectidEqualTo(anpPrivadaDto.getLngObjectid());
			}
			if(CadenaUtil.getStrNull(anpPrivadaDto.getStrAnpcCat()) != null) {
				criteria.andStrAnpcCatLike(anpPrivadaDto.getStrAnpcCat());
			}
			if(CadenaUtil.getStrNull(anpPrivadaDto.getStrAnpcCodi()) != null) {
				criteria.andStrAnpcCodiLike(anpPrivadaDto.getStrAnpcCodi());
			}
			if(CadenaUtil.getStrNull(anpPrivadaDto.getStrAnpcNomb()) != null) {
				criteria.andStrAnpcNombLike(anpPrivadaDto.getStrAnpcNomb());
			}
			if(CadenaUtil.getDoubNull(anpPrivadaDto.getDblAnpcArea()) != null) {
				criteria.andDblAnpcAreaEqualTo(anpPrivadaDto.getDblAnpcArea());
			}
			if(CadenaUtil.getStrNull(anpPrivadaDto.getStrAnpcBalec()) != null) {
				criteria.andStrAnpcBalecLike(anpPrivadaDto.getStrAnpcBalec());
			}
			if(CadenaUtil.getStrNull(anpPrivadaDto.getStrAnpcFelec()) != null) {
				criteria.andStrAnpcFelecLike(anpPrivadaDto.getStrAnpcFelec());
			}
			if(CadenaUtil.getStrNull(anpPrivadaDto.getStrAnpcBalem()) != null) {
				criteria.andStrAnpcBalemLike(anpPrivadaDto.getStrAnpcBalem());
			}
			if(CadenaUtil.getStrNull(anpPrivadaDto.getStrAnpcFelem()) != null) {
				criteria.andStrAnpcFelemLike(anpPrivadaDto.getStrAnpcFelem());
			}
			if(CadenaUtil.getStrNull(anpPrivadaDto.getStrAnpcDepa()) != null) {
				criteria.andStrAnpcDepaLike(anpPrivadaDto.getStrAnpcDepa());
			}
			if(CadenaUtil.getStrNull(anpPrivadaDto.getStrAnpcTipop()) != null) {
				criteria.andStrAnpcTipopLike(anpPrivadaDto.getStrAnpcTipop());
			}
			if(CadenaUtil.getStrNull(anpPrivadaDto.getStrAnpcTitu()) != null) {
				criteria.andStrAnpcTituLike(anpPrivadaDto.getStrAnpcTitu());
			}
		}
		
		List<AnpPrivada>	 list	= anpPrivadaMapper.selectByDefaultParameter(anpPrivadaParamDef);
		return list;
	}
	
	public AnpPrivada buscarById(AnpPrivadaDto anpPrivadaDto) throws Exception {
		AnpPrivada anpPrivada		= new AnpPrivada();
		BeanUtils.copyProperties(anpPrivadaDto, anpPrivada);
		return anpPrivadaMapper.selectByPrimaryKey(anpPrivada);
	}
	
	@Transactional
	public Integer guardar(AnpPrivadaDto anpPrivadaDto) throws Exception {
		AnpPrivada anpPrivada		= new AnpPrivada();
		BeanUtils.copyProperties(anpPrivadaDto, anpPrivada);
		int rs	= 0;
		AnpPrivada exiteAnpPrivada		= anpPrivadaMapper.selectByPrimaryKey(anpPrivada);
		if(exiteAnpPrivada != null) {
			rs	= anpPrivadaMapper.updateByPrimaryKeySelective(anpPrivada);
		} else {
			rs	= anpPrivadaMapper.insertSelective(anpPrivada);
			
			Integer srlGid	= anpPrivadaMapper.lastSequence();
			anpPrivadaDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(AnpPrivadaDto anpPrivadaDto) throws Exception {
		AnpPrivada anpPrivada		= new AnpPrivada();
		BeanUtils.copyProperties(anpPrivadaDto, anpPrivada);
		Integer rs	= anpPrivadaMapper.deleteByPrimaryKey(anpPrivada);
		return rs;
	}
	
}
