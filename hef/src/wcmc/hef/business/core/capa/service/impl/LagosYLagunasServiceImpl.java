package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.LagosYLagunasDto;
import wcmc.hef.business.core.capa.service.LagosYLagunasService;
import wcmc.hef.dao.capa.domain.LagosYLagunas;
import wcmc.hef.dao.capa.domain.LagosYLagunasParamDef;
import wcmc.hef.dao.capa.domain.LagosYLagunasParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.LagosYLagunasMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class LagosYLagunasServiceImpl implements LagosYLagunasService {
	@Autowired
	private LagosYLagunasMapper lagosYLagunasMapper;
	public List<LagosYLagunas> buscar(LagosYLagunasDto lagosYLagunasDto) throws Exception {
		LagosYLagunasParamDef lagosYLagunasParamDef		= new LagosYLagunasParamDef();
		
		Criteria criteria		= lagosYLagunasParamDef.createCriteria();
		if(lagosYLagunasDto != null) {
			if(CadenaUtil.getStrNull(lagosYLagunasDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(lagosYLagunasDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(lagosYLagunasDto.getIntObjectid1()) != null) {
				criteria.andIntObjectid1EqualTo(lagosYLagunasDto.getIntObjectid1());
			}
			if(CadenaUtil.getStrNull(lagosYLagunasDto.getStrGmlId()) != null) {
				criteria.andStrGmlIdLike(lagosYLagunasDto.getStrGmlId());
			}
			if(CadenaUtil.getInteNull(lagosYLagunasDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(lagosYLagunasDto.getIntObjectid());
			}
			if(CadenaUtil.getDoubNull(lagosYLagunasDto.getDblCount()) != null) {
				criteria.andDblCountEqualTo(lagosYLagunasDto.getDblCount());
			}
			if(CadenaUtil.getStrNull(lagosYLagunasDto.getStrFirstIdpr()) != null) {
				criteria.andStrFirstIdprLike(lagosYLagunasDto.getStrFirstIdpr());
			}
			if(CadenaUtil.getStrNull(lagosYLagunasDto.getStrNombprov()) != null) {
				criteria.andStrNombprovLike(lagosYLagunasDto.getStrNombprov());
			}
			if(CadenaUtil.getStrNull(lagosYLagunasDto.getStrFirstNomb()) != null) {
				criteria.andStrFirstNombLike(lagosYLagunasDto.getStrFirstNomb());
			}
			if(CadenaUtil.getStrNull(lagosYLagunasDto.getStrLastDcto()) != null) {
				criteria.andStrLastDctoLike(lagosYLagunasDto.getStrLastDcto());
			}
			if(CadenaUtil.getStrNull(lagosYLagunasDto.getStrLastLey()) != null) {
				criteria.andStrLastLeyLike(lagosYLagunasDto.getStrLastLey());
			}
			if(CadenaUtil.getStrNull(lagosYLagunasDto.getStrFirstFech()) != null) {
				criteria.andStrFirstFechLike(lagosYLagunasDto.getStrFirstFech());
			}
			if(CadenaUtil.getStrNull(lagosYLagunasDto.getStrLastFecha()) != null) {
				criteria.andStrLastFechaLike(lagosYLagunasDto.getStrLastFecha());
			}
			if(CadenaUtil.getDoubNull(lagosYLagunasDto.getDblMinShape()) != null) {
				criteria.andDblMinShapeEqualTo(lagosYLagunasDto.getDblMinShape());
			}
			if(CadenaUtil.getDoubNull(lagosYLagunasDto.getDblShapeStar()) != null) {
				criteria.andDblShapeStarEqualTo(lagosYLagunasDto.getDblShapeStar());
			}
			if(CadenaUtil.getDoubNull(lagosYLagunasDto.getDblShapeStle()) != null) {
				criteria.andDblShapeStleEqualTo(lagosYLagunasDto.getDblShapeStle());
			}
		}
		
		List<LagosYLagunas>	 list	= lagosYLagunasMapper.selectByDefaultParameter(lagosYLagunasParamDef);
		return list;
	}
	
	public LagosYLagunas buscarById(LagosYLagunasDto lagosYLagunasDto) throws Exception {
		LagosYLagunas lagosYLagunas		= new LagosYLagunas();
		BeanUtils.copyProperties(lagosYLagunasDto, lagosYLagunas);
		return lagosYLagunasMapper.selectByPrimaryKey(lagosYLagunas);
	}
	
	@Transactional
	public Integer guardar(LagosYLagunasDto lagosYLagunasDto) throws Exception {
		LagosYLagunas lagosYLagunas		= new LagosYLagunas();
		BeanUtils.copyProperties(lagosYLagunasDto, lagosYLagunas);
		int rs	= 0;
		LagosYLagunas exiteLagosYLagunas		= lagosYLagunasMapper.selectByPrimaryKey(lagosYLagunas);
		if(exiteLagosYLagunas != null) {
			rs	= lagosYLagunasMapper.updateByPrimaryKeySelective(lagosYLagunas);
		} else {
			rs	= lagosYLagunasMapper.insertSelective(lagosYLagunas);
			
			Integer srlGid	= lagosYLagunasMapper.lastSequence();
			lagosYLagunasDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(LagosYLagunasDto lagosYLagunasDto) throws Exception {
		LagosYLagunas lagosYLagunas		= new LagosYLagunas();
		BeanUtils.copyProperties(lagosYLagunasDto, lagosYLagunas);
		Integer rs	= lagosYLagunasMapper.deleteByPrimaryKey(lagosYLagunas);
		return rs;
	}
	
}
