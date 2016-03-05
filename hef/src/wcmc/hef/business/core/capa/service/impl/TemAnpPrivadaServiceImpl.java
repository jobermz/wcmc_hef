package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemAnpPrivadaDto;
import wcmc.hef.business.core.capa.service.TemAnpPrivadaService;
import wcmc.hef.dao.capa.domain.TemAnpPrivada;
import wcmc.hef.dao.capa.domain.TemAnpPrivadaParamDef;
import wcmc.hef.dao.capa.domain.TemAnpPrivadaParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemAnpPrivadaMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemAnpPrivadaServiceImpl implements TemAnpPrivadaService {
	@Autowired
	private TemAnpPrivadaMapper temAnpPrivadaMapper;
	public List<TemAnpPrivada> buscar(TemAnpPrivadaDto temAnpPrivadaDto) throws Exception {
		TemAnpPrivadaParamDef temAnpPrivadaParamDef		= new TemAnpPrivadaParamDef();
		
		Criteria criteria		= temAnpPrivadaParamDef.createCriteria();
		if(temAnpPrivadaDto != null) {
			if(CadenaUtil.getStrNull(temAnpPrivadaDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temAnpPrivadaDto.getStrTheGeom());
			}
			if(CadenaUtil.getLongNull(temAnpPrivadaDto.getLngObjectid()) != null) {
				criteria.andLngObjectidEqualTo(temAnpPrivadaDto.getLngObjectid());
			}
			if(CadenaUtil.getStrNull(temAnpPrivadaDto.getStrAnpcCat()) != null) {
				criteria.andStrAnpcCatLike(temAnpPrivadaDto.getStrAnpcCat());
			}
			if(CadenaUtil.getStrNull(temAnpPrivadaDto.getStrAnpcCodi()) != null) {
				criteria.andStrAnpcCodiLike(temAnpPrivadaDto.getStrAnpcCodi());
			}
			if(CadenaUtil.getStrNull(temAnpPrivadaDto.getStrAnpcNomb()) != null) {
				criteria.andStrAnpcNombLike(temAnpPrivadaDto.getStrAnpcNomb());
			}
			if(CadenaUtil.getDoubNull(temAnpPrivadaDto.getDblAnpcArea()) != null) {
				criteria.andDblAnpcAreaEqualTo(temAnpPrivadaDto.getDblAnpcArea());
			}
			if(CadenaUtil.getStrNull(temAnpPrivadaDto.getStrAnpcBalec()) != null) {
				criteria.andStrAnpcBalecLike(temAnpPrivadaDto.getStrAnpcBalec());
			}
			if(CadenaUtil.getStrNull(temAnpPrivadaDto.getStrAnpcFelec()) != null) {
				criteria.andStrAnpcFelecLike(temAnpPrivadaDto.getStrAnpcFelec());
			}
			if(CadenaUtil.getStrNull(temAnpPrivadaDto.getStrAnpcBalem()) != null) {
				criteria.andStrAnpcBalemLike(temAnpPrivadaDto.getStrAnpcBalem());
			}
			if(CadenaUtil.getStrNull(temAnpPrivadaDto.getStrAnpcFelem()) != null) {
				criteria.andStrAnpcFelemLike(temAnpPrivadaDto.getStrAnpcFelem());
			}
			if(CadenaUtil.getStrNull(temAnpPrivadaDto.getStrAnpcDepa()) != null) {
				criteria.andStrAnpcDepaLike(temAnpPrivadaDto.getStrAnpcDepa());
			}
			if(CadenaUtil.getStrNull(temAnpPrivadaDto.getStrAnpcTipop()) != null) {
				criteria.andStrAnpcTipopLike(temAnpPrivadaDto.getStrAnpcTipop());
			}
			if(CadenaUtil.getStrNull(temAnpPrivadaDto.getStrAnpcTitu()) != null) {
				criteria.andStrAnpcTituLike(temAnpPrivadaDto.getStrAnpcTitu());
			}
		}
		
		List<TemAnpPrivada>	 list	= temAnpPrivadaMapper.selectByDefaultParameter(temAnpPrivadaParamDef);
		return list;
	}
	
	public TemAnpPrivada buscarById(TemAnpPrivadaDto temAnpPrivadaDto) throws Exception {
		TemAnpPrivada temAnpPrivada		= new TemAnpPrivada();
		BeanUtils.copyProperties(temAnpPrivadaDto, temAnpPrivada);
		return temAnpPrivadaMapper.selectByPrimaryKey(temAnpPrivada);
	}
	
	@Transactional
	public Integer guardar(TemAnpPrivadaDto temAnpPrivadaDto) throws Exception {
		TemAnpPrivada temAnpPrivada		= new TemAnpPrivada();
		BeanUtils.copyProperties(temAnpPrivadaDto, temAnpPrivada);
		int rs	= 0;
		TemAnpPrivada exiteTemAnpPrivada		= temAnpPrivadaMapper.selectByPrimaryKey(temAnpPrivada);
		if(exiteTemAnpPrivada != null) {
			rs	= temAnpPrivadaMapper.updateByPrimaryKeySelective(temAnpPrivada);
		} else {
			rs	= temAnpPrivadaMapper.insertSelective(temAnpPrivada);
			
			Integer srlGid	= temAnpPrivadaMapper.lastSequence();
			temAnpPrivadaDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemAnpPrivadaDto temAnpPrivadaDto) throws Exception {
		TemAnpPrivada temAnpPrivada		= new TemAnpPrivada();
		BeanUtils.copyProperties(temAnpPrivadaDto, temAnpPrivada);
		Integer rs	= temAnpPrivadaMapper.deleteByPrimaryKey(temAnpPrivada);
		return rs;
	}
	
}
