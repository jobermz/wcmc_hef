package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemBioloCoberturaVegetalDto;
import wcmc.hef.business.core.capa.service.TemBioloCoberturaVegetalService;
import wcmc.hef.dao.capa.domain.TemBioloCoberturaVegetal;
import wcmc.hef.dao.capa.domain.TemBioloCoberturaVegetalParamDef;
import wcmc.hef.dao.capa.domain.TemBioloCoberturaVegetalParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemBioloCoberturaVegetalMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemBioloCoberturaVegetalServiceImpl implements TemBioloCoberturaVegetalService {
	@Autowired
	private TemBioloCoberturaVegetalMapper temBioloCoberturaVegetalMapper;
	public List<TemBioloCoberturaVegetal> buscar(TemBioloCoberturaVegetalDto temBioloCoberturaVegetalDto) throws Exception {
		TemBioloCoberturaVegetalParamDef temBioloCoberturaVegetalParamDef		= new TemBioloCoberturaVegetalParamDef();
		
		Criteria criteria		= temBioloCoberturaVegetalParamDef.createCriteria();
		if(temBioloCoberturaVegetalDto != null) {
			if(CadenaUtil.getStrNull(temBioloCoberturaVegetalDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(temBioloCoberturaVegetalDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temBioloCoberturaVegetalDto.getStrCobveg2013()) != null) {
				criteria.andStrCobveg2013Like(temBioloCoberturaVegetalDto.getStrCobveg2013());
			}
			if(CadenaUtil.getStrNull(temBioloCoberturaVegetalDto.getStrSimbolo()) != null) {
				criteria.andStrSimboloLike(temBioloCoberturaVegetalDto.getStrSimbolo());
			}
			if(CadenaUtil.getStrNull(temBioloCoberturaVegetalDto.getStrFisiogr()) != null) {
				criteria.andStrFisiogrLike(temBioloCoberturaVegetalDto.getStrFisiogr());
			}
			if(CadenaUtil.getDoubNull(temBioloCoberturaVegetalDto.getDblShapeLeng()) != null) {
				criteria.andDblShapeLengEqualTo(temBioloCoberturaVegetalDto.getDblShapeLeng());
			}
			if(CadenaUtil.getDoubNull(temBioloCoberturaVegetalDto.getDblShapeArea()) != null) {
				criteria.andDblShapeAreaEqualTo(temBioloCoberturaVegetalDto.getDblShapeArea());
			}
			if(CadenaUtil.getStrNull(temBioloCoberturaVegetalDto.getStrCvLabel()) != null) {
				criteria.andStrCvLabelLike(temBioloCoberturaVegetalDto.getStrCvLabel());
			}
		}
		
		List<TemBioloCoberturaVegetal>	 list	= temBioloCoberturaVegetalMapper.selectByDefaultParameter(temBioloCoberturaVegetalParamDef);
		return list;
	}
	
	public TemBioloCoberturaVegetal buscarById(TemBioloCoberturaVegetalDto temBioloCoberturaVegetalDto) throws Exception {
		TemBioloCoberturaVegetal temBioloCoberturaVegetal		= new TemBioloCoberturaVegetal();
		BeanUtils.copyProperties(temBioloCoberturaVegetalDto, temBioloCoberturaVegetal);
		return temBioloCoberturaVegetalMapper.selectByPrimaryKey(temBioloCoberturaVegetal);
	}
	
	@Transactional
	public Integer guardar(TemBioloCoberturaVegetalDto temBioloCoberturaVegetalDto) throws Exception {
		TemBioloCoberturaVegetal temBioloCoberturaVegetal		= new TemBioloCoberturaVegetal();
		BeanUtils.copyProperties(temBioloCoberturaVegetalDto, temBioloCoberturaVegetal);
		int rs	= 0;
		TemBioloCoberturaVegetal exiteTemBioloCoberturaVegetal		= temBioloCoberturaVegetalMapper.selectByPrimaryKey(temBioloCoberturaVegetal);
		if(exiteTemBioloCoberturaVegetal != null) {
			rs	= temBioloCoberturaVegetalMapper.updateByPrimaryKeySelective(temBioloCoberturaVegetal);
		} else {
			rs	= temBioloCoberturaVegetalMapper.insertSelective(temBioloCoberturaVegetal);
			
			Integer srlGid	= temBioloCoberturaVegetalMapper.lastSequence();
			temBioloCoberturaVegetalDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemBioloCoberturaVegetalDto temBioloCoberturaVegetalDto) throws Exception {
		TemBioloCoberturaVegetal temBioloCoberturaVegetal		= new TemBioloCoberturaVegetal();
		BeanUtils.copyProperties(temBioloCoberturaVegetalDto, temBioloCoberturaVegetal);
		Integer rs	= temBioloCoberturaVegetalMapper.deleteByPrimaryKey(temBioloCoberturaVegetal);
		return rs;
	}
	
}
