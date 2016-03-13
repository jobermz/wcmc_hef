package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemCoverturaVegetal2015Dto;
import wcmc.hef.business.core.capa.service.TemCoverturaVegetal2015Service;
import wcmc.hef.dao.capa.domain.TemCoverturaVegetal2015;
import wcmc.hef.dao.capa.domain.TemCoverturaVegetal2015ParamDef;
import wcmc.hef.dao.capa.domain.TemCoverturaVegetal2015ParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemCoverturaVegetal2015Mapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemCoverturaVegetal2015ServiceImpl implements TemCoverturaVegetal2015Service {
	@Autowired
	private TemCoverturaVegetal2015Mapper temCoverturaVegetal2015Mapper;
	public List<TemCoverturaVegetal2015> buscar(TemCoverturaVegetal2015Dto temCoverturaVegetal2015Dto) throws Exception {
		TemCoverturaVegetal2015ParamDef temCoverturaVegetal2015ParamDef		= new TemCoverturaVegetal2015ParamDef();
		
		Criteria criteria		= temCoverturaVegetal2015ParamDef.createCriteria();
		if(temCoverturaVegetal2015Dto != null) {
			if(CadenaUtil.getStrNull(temCoverturaVegetal2015Dto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temCoverturaVegetal2015Dto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temCoverturaVegetal2015Dto.getStrCobveg2013()) != null) {
				criteria.andStrCobveg2013EqualTo(temCoverturaVegetal2015Dto.getStrCobveg2013());
			}
			if(CadenaUtil.getStrNull(temCoverturaVegetal2015Dto.getStrSimbolo()) != null) {
				criteria.andStrSimboloEqualTo(temCoverturaVegetal2015Dto.getStrSimbolo());
			}
			if(CadenaUtil.getStrNull(temCoverturaVegetal2015Dto.getStrFisiogr()) != null) {
				criteria.andStrFisiogrEqualTo(temCoverturaVegetal2015Dto.getStrFisiogr());
			}
			if(CadenaUtil.getDoubNull(temCoverturaVegetal2015Dto.getDblShapeLeng()) != null) {
				criteria.andDblShapeLengEqualTo(temCoverturaVegetal2015Dto.getDblShapeLeng());
			}
			if(CadenaUtil.getDoubNull(temCoverturaVegetal2015Dto.getDblShapeArea()) != null) {
				criteria.andDblShapeAreaEqualTo(temCoverturaVegetal2015Dto.getDblShapeArea());
			}
			if(CadenaUtil.getStrNull(temCoverturaVegetal2015Dto.getStrCvLabel()) != null) {
				criteria.andStrCvLabelEqualTo(temCoverturaVegetal2015Dto.getStrCvLabel());
			}
		}
		
		temCoverturaVegetal2015ParamDef.setOrderByClause("de_cobveg2013");
		List<TemCoverturaVegetal2015>	 list	= temCoverturaVegetal2015Mapper.selectByDefaultParameter(temCoverturaVegetal2015ParamDef);
		return list;
	}
	
	public List<TemCoverturaVegetal2015> buscarGeometry(TemCoverturaVegetal2015Dto temCoverturaVegetal2015Dto) throws Exception {
		TemCoverturaVegetal2015ParamDef temCoverturaVegetal2015ParamDef		= new TemCoverturaVegetal2015ParamDef();
		
		Criteria criteria		= temCoverturaVegetal2015ParamDef.createCriteria();
		if(temCoverturaVegetal2015Dto != null) {
			if(CadenaUtil.getStrNull(temCoverturaVegetal2015Dto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temCoverturaVegetal2015Dto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temCoverturaVegetal2015Dto.getStrCobveg2013()) != null) {
				criteria.andStrCobveg2013EqualTo(temCoverturaVegetal2015Dto.getStrCobveg2013());
			}
			if(CadenaUtil.getStrNull(temCoverturaVegetal2015Dto.getStrSimbolo()) != null) {
				criteria.andStrSimboloEqualTo(temCoverturaVegetal2015Dto.getStrSimbolo());
			}
			if(CadenaUtil.getStrNull(temCoverturaVegetal2015Dto.getStrFisiogr()) != null) {
				criteria.andStrFisiogrEqualTo(temCoverturaVegetal2015Dto.getStrFisiogr());
			}
			if(CadenaUtil.getDoubNull(temCoverturaVegetal2015Dto.getDblShapeLeng()) != null) {
				criteria.andDblShapeLengEqualTo(temCoverturaVegetal2015Dto.getDblShapeLeng());
			}
			if(CadenaUtil.getDoubNull(temCoverturaVegetal2015Dto.getDblShapeArea()) != null) {
				criteria.andDblShapeAreaEqualTo(temCoverturaVegetal2015Dto.getDblShapeArea());
			}
			if(CadenaUtil.getStrNull(temCoverturaVegetal2015Dto.getStrCvLabel()) != null) {
				criteria.andStrCvLabelEqualTo(temCoverturaVegetal2015Dto.getStrCvLabel());
			}
		}
		
		temCoverturaVegetal2015ParamDef.setOrderByClause("de_cobveg2013");
		List<TemCoverturaVegetal2015>	 list	= temCoverturaVegetal2015Mapper.selectByDefaultParameterGeometry(temCoverturaVegetal2015ParamDef);
		return list;
	}
	
	public List<TemCoverturaVegetal2015> buscarCombo(TemCoverturaVegetal2015Dto temCoverturaVegetal2015Dto) throws Exception {
		TemCoverturaVegetal2015ParamDef temCoverturaVegetal2015ParamDef		= new TemCoverturaVegetal2015ParamDef();
		
		Criteria criteria		= temCoverturaVegetal2015ParamDef.createCriteria();
		if(temCoverturaVegetal2015Dto != null) {
			if(CadenaUtil.getStrNull(temCoverturaVegetal2015Dto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temCoverturaVegetal2015Dto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temCoverturaVegetal2015Dto.getStrCobveg2013()) != null) {
				criteria.andStrCobveg2013EqualTo(temCoverturaVegetal2015Dto.getStrCobveg2013());
			}
			if(CadenaUtil.getStrNull(temCoverturaVegetal2015Dto.getStrSimbolo()) != null) {
				criteria.andStrSimboloEqualTo(temCoverturaVegetal2015Dto.getStrSimbolo());
			}
			if(CadenaUtil.getStrNull(temCoverturaVegetal2015Dto.getStrFisiogr()) != null) {
				criteria.andStrFisiogrEqualTo(temCoverturaVegetal2015Dto.getStrFisiogr());
			}
			if(CadenaUtil.getDoubNull(temCoverturaVegetal2015Dto.getDblShapeLeng()) != null) {
				criteria.andDblShapeLengEqualTo(temCoverturaVegetal2015Dto.getDblShapeLeng());
			}
			if(CadenaUtil.getDoubNull(temCoverturaVegetal2015Dto.getDblShapeArea()) != null) {
				criteria.andDblShapeAreaEqualTo(temCoverturaVegetal2015Dto.getDblShapeArea());
			}
			if(CadenaUtil.getStrNull(temCoverturaVegetal2015Dto.getStrCvLabel()) != null) {
				criteria.andStrCvLabelEqualTo(temCoverturaVegetal2015Dto.getStrCvLabel());
			}
		}
		
		temCoverturaVegetal2015ParamDef.setOrderByClause("de_cobveg2013");
		List<TemCoverturaVegetal2015>	 list	= temCoverturaVegetal2015Mapper.selectByDefaultParameterCombo(temCoverturaVegetal2015ParamDef);
		return list;
	}
	
	public TemCoverturaVegetal2015 buscarById(TemCoverturaVegetal2015Dto temCoverturaVegetal2015Dto) throws Exception {
		TemCoverturaVegetal2015 temCoverturaVegetal2015		= new TemCoverturaVegetal2015();
		BeanUtils.copyProperties(temCoverturaVegetal2015Dto, temCoverturaVegetal2015);
		return temCoverturaVegetal2015Mapper.selectByPrimaryKey(temCoverturaVegetal2015);
	}
	
	public TemCoverturaVegetal2015 buscarGeometryById(TemCoverturaVegetal2015Dto temCoverturaVegetal2015Dto) throws Exception {
		TemCoverturaVegetal2015 temCoverturaVegetal2015		= new TemCoverturaVegetal2015();
		BeanUtils.copyProperties(temCoverturaVegetal2015Dto, temCoverturaVegetal2015);
		return temCoverturaVegetal2015Mapper.selectByPrimaryKeyGeometry(temCoverturaVegetal2015);
	}
	
	@Transactional
	public Integer guardar(TemCoverturaVegetal2015Dto temCoverturaVegetal2015Dto) throws Exception {
		TemCoverturaVegetal2015 temCoverturaVegetal2015		= new TemCoverturaVegetal2015();
		BeanUtils.copyProperties(temCoverturaVegetal2015Dto, temCoverturaVegetal2015);
		int rs	= 0;
		TemCoverturaVegetal2015 exiteTemCoverturaVegetal2015		= temCoverturaVegetal2015Mapper.selectByPrimaryKey(temCoverturaVegetal2015);
		if(exiteTemCoverturaVegetal2015 != null) {
			rs	= temCoverturaVegetal2015Mapper.updateByPrimaryKeySelective(temCoverturaVegetal2015);
		} else {
			rs	= temCoverturaVegetal2015Mapper.insertSelective(temCoverturaVegetal2015);
			
			Integer srlGid	= temCoverturaVegetal2015Mapper.lastSequence();
			temCoverturaVegetal2015Dto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemCoverturaVegetal2015Dto temCoverturaVegetal2015Dto) throws Exception {
		TemCoverturaVegetal2015 temCoverturaVegetal2015		= new TemCoverturaVegetal2015();
		BeanUtils.copyProperties(temCoverturaVegetal2015Dto, temCoverturaVegetal2015);
		Integer rs	= temCoverturaVegetal2015Mapper.deleteByPrimaryKey(temCoverturaVegetal2015);
		return rs;
	}
	
}
