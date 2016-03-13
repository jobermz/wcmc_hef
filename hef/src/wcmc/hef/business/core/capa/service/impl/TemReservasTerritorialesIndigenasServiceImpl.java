package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemReservasTerritorialesIndigenasDto;
import wcmc.hef.business.core.capa.service.TemReservasTerritorialesIndigenasService;
import wcmc.hef.dao.capa.domain.TemReservasTerritorialesIndigenas;
import wcmc.hef.dao.capa.domain.TemReservasTerritorialesIndigenasParamDef;
import wcmc.hef.dao.capa.domain.TemReservasTerritorialesIndigenasParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemReservasTerritorialesIndigenasMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemReservasTerritorialesIndigenasServiceImpl implements TemReservasTerritorialesIndigenasService {
	@Autowired
	private TemReservasTerritorialesIndigenasMapper temReservasTerritorialesIndigenasMapper;
	public List<TemReservasTerritorialesIndigenas> buscar(TemReservasTerritorialesIndigenasDto temReservasTerritorialesIndigenasDto) throws Exception {
		TemReservasTerritorialesIndigenasParamDef temReservasTerritorialesIndigenasParamDef		= new TemReservasTerritorialesIndigenasParamDef();
		
		Criteria criteria		= temReservasTerritorialesIndigenasParamDef.createCriteria();
		if(temReservasTerritorialesIndigenasDto != null) {
			if(CadenaUtil.getStrNull(temReservasTerritorialesIndigenasDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temReservasTerritorialesIndigenasDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(temReservasTerritorialesIndigenasDto.getIntObjectid1()) != null) {
				criteria.andIntObjectid1EqualTo(temReservasTerritorialesIndigenasDto.getIntObjectid1());
			}
			if(CadenaUtil.getStrNull(temReservasTerritorialesIndigenasDto.getStrGmlId()) != null) {
				criteria.andStrGmlIdEqualTo(temReservasTerritorialesIndigenasDto.getStrGmlId());
			}
			if(CadenaUtil.getInteNull(temReservasTerritorialesIndigenasDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(temReservasTerritorialesIndigenasDto.getIntObjectid());
			}
			if(CadenaUtil.getInteNull(temReservasTerritorialesIndigenasDto.getIntId()) != null) {
				criteria.andIntIdEqualTo(temReservasTerritorialesIndigenasDto.getIntId());
			}
			if(CadenaUtil.getDoubNull(temReservasTerritorialesIndigenasDto.getDblSdeDboTe()) != null) {
				criteria.andDblSdeDboTeEqualTo(temReservasTerritorialesIndigenasDto.getDblSdeDboTe());
			}
			if(CadenaUtil.getDoubNull(temReservasTerritorialesIndigenasDto.getDblPerimeter()) != null) {
				criteria.andDblPerimeterEqualTo(temReservasTerritorialesIndigenasDto.getDblPerimeter());
			}
			if(CadenaUtil.getStrNull(temReservasTerritorialesIndigenasDto.getStrNombre()) != null) {
				criteria.andStrNombreEqualTo(temReservasTerritorialesIndigenasDto.getStrNombre());
			}
			if(CadenaUtil.getStrNull(temReservasTerritorialesIndigenasDto.getStrBaseLegal()) != null) {
				criteria.andStrBaseLegalEqualTo(temReservasTerritorialesIndigenasDto.getStrBaseLegal());
			}
			if(CadenaUtil.getDoubNull(temReservasTerritorialesIndigenasDto.getDblNHaIbc()) != null) {
				criteria.andDblNHaIbcEqualTo(temReservasTerritorialesIndigenasDto.getDblNHaIbc());
			}
			if(CadenaUtil.getStrNull(temReservasTerritorialesIndigenasDto.getStrNUbicAnp()) != null) {
				criteria.andStrNUbicAnpEqualTo(temReservasTerritorialesIndigenasDto.getStrNUbicAnp());
			}
			if(CadenaUtil.getStrNull(temReservasTerritorialesIndigenasDto.getStrNMapA0()) != null) {
				criteria.andStrNMapA0EqualTo(temReservasTerritorialesIndigenasDto.getStrNMapA0());
			}
			if(CadenaUtil.getStrNull(temReservasTerritorialesIndigenasDto.getStrCategoria()) != null) {
				criteria.andStrCategoriaEqualTo(temReservasTerritorialesIndigenasDto.getStrCategoria());
			}
			if(CadenaUtil.getStrNull(temReservasTerritorialesIndigenasDto.getStrEtnia()) != null) {
				criteria.andStrEtniaEqualTo(temReservasTerritorialesIndigenasDto.getStrEtnia());
			}
			if(CadenaUtil.getStrNull(temReservasTerritorialesIndigenasDto.getStrUbicaPoli()) != null) {
				criteria.andStrUbicaPoliEqualTo(temReservasTerritorialesIndigenasDto.getStrUbicaPoli());
			}
			if(CadenaUtil.getStrNull(temReservasTerritorialesIndigenasDto.getStrAreaLegal()) != null) {
				criteria.andStrAreaLegalEqualTo(temReservasTerritorialesIndigenasDto.getStrAreaLegal());
			}
			if(CadenaUtil.getDoubNull(temReservasTerritorialesIndigenasDto.getDblShapeStar()) != null) {
				criteria.andDblShapeStarEqualTo(temReservasTerritorialesIndigenasDto.getDblShapeStar());
			}
			if(CadenaUtil.getDoubNull(temReservasTerritorialesIndigenasDto.getDblShapeStle()) != null) {
				criteria.andDblShapeStleEqualTo(temReservasTerritorialesIndigenasDto.getDblShapeStle());
			}
		}
		
		temReservasTerritorialesIndigenasParamDef.setOrderByClause("de_nombre,de_etnia");
		List<TemReservasTerritorialesIndigenas>	 list	= temReservasTerritorialesIndigenasMapper.selectByDefaultParameter(temReservasTerritorialesIndigenasParamDef);
		return list;
	}
	
	public List<TemReservasTerritorialesIndigenas> buscarGeometry(TemReservasTerritorialesIndigenasDto temReservasTerritorialesIndigenasDto) throws Exception {
		TemReservasTerritorialesIndigenasParamDef temReservasTerritorialesIndigenasParamDef		= new TemReservasTerritorialesIndigenasParamDef();
		
		Criteria criteria		= temReservasTerritorialesIndigenasParamDef.createCriteria();
		if(temReservasTerritorialesIndigenasDto != null) {
			if(CadenaUtil.getStrNull(temReservasTerritorialesIndigenasDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temReservasTerritorialesIndigenasDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(temReservasTerritorialesIndigenasDto.getIntObjectid1()) != null) {
				criteria.andIntObjectid1EqualTo(temReservasTerritorialesIndigenasDto.getIntObjectid1());
			}
			if(CadenaUtil.getStrNull(temReservasTerritorialesIndigenasDto.getStrGmlId()) != null) {
				criteria.andStrGmlIdEqualTo(temReservasTerritorialesIndigenasDto.getStrGmlId());
			}
			if(CadenaUtil.getInteNull(temReservasTerritorialesIndigenasDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(temReservasTerritorialesIndigenasDto.getIntObjectid());
			}
			if(CadenaUtil.getInteNull(temReservasTerritorialesIndigenasDto.getIntId()) != null) {
				criteria.andIntIdEqualTo(temReservasTerritorialesIndigenasDto.getIntId());
			}
			if(CadenaUtil.getDoubNull(temReservasTerritorialesIndigenasDto.getDblSdeDboTe()) != null) {
				criteria.andDblSdeDboTeEqualTo(temReservasTerritorialesIndigenasDto.getDblSdeDboTe());
			}
			if(CadenaUtil.getDoubNull(temReservasTerritorialesIndigenasDto.getDblPerimeter()) != null) {
				criteria.andDblPerimeterEqualTo(temReservasTerritorialesIndigenasDto.getDblPerimeter());
			}
			if(CadenaUtil.getStrNull(temReservasTerritorialesIndigenasDto.getStrNombre()) != null) {
				criteria.andStrNombreEqualTo(temReservasTerritorialesIndigenasDto.getStrNombre());
			}
			if(CadenaUtil.getStrNull(temReservasTerritorialesIndigenasDto.getStrBaseLegal()) != null) {
				criteria.andStrBaseLegalEqualTo(temReservasTerritorialesIndigenasDto.getStrBaseLegal());
			}
			if(CadenaUtil.getDoubNull(temReservasTerritorialesIndigenasDto.getDblNHaIbc()) != null) {
				criteria.andDblNHaIbcEqualTo(temReservasTerritorialesIndigenasDto.getDblNHaIbc());
			}
			if(CadenaUtil.getStrNull(temReservasTerritorialesIndigenasDto.getStrNUbicAnp()) != null) {
				criteria.andStrNUbicAnpEqualTo(temReservasTerritorialesIndigenasDto.getStrNUbicAnp());
			}
			if(CadenaUtil.getStrNull(temReservasTerritorialesIndigenasDto.getStrNMapA0()) != null) {
				criteria.andStrNMapA0EqualTo(temReservasTerritorialesIndigenasDto.getStrNMapA0());
			}
			if(CadenaUtil.getStrNull(temReservasTerritorialesIndigenasDto.getStrCategoria()) != null) {
				criteria.andStrCategoriaEqualTo(temReservasTerritorialesIndigenasDto.getStrCategoria());
			}
			if(CadenaUtil.getStrNull(temReservasTerritorialesIndigenasDto.getStrEtnia()) != null) {
				criteria.andStrEtniaEqualTo(temReservasTerritorialesIndigenasDto.getStrEtnia());
			}
			if(CadenaUtil.getStrNull(temReservasTerritorialesIndigenasDto.getStrUbicaPoli()) != null) {
				criteria.andStrUbicaPoliEqualTo(temReservasTerritorialesIndigenasDto.getStrUbicaPoli());
			}
			if(CadenaUtil.getStrNull(temReservasTerritorialesIndigenasDto.getStrAreaLegal()) != null) {
				criteria.andStrAreaLegalEqualTo(temReservasTerritorialesIndigenasDto.getStrAreaLegal());
			}
			if(CadenaUtil.getDoubNull(temReservasTerritorialesIndigenasDto.getDblShapeStar()) != null) {
				criteria.andDblShapeStarEqualTo(temReservasTerritorialesIndigenasDto.getDblShapeStar());
			}
			if(CadenaUtil.getDoubNull(temReservasTerritorialesIndigenasDto.getDblShapeStle()) != null) {
				criteria.andDblShapeStleEqualTo(temReservasTerritorialesIndigenasDto.getDblShapeStle());
			}
		}
		
		temReservasTerritorialesIndigenasParamDef.setOrderByClause("de_nombre,de_etnia");
		List<TemReservasTerritorialesIndigenas>	 list	= temReservasTerritorialesIndigenasMapper.selectByDefaultParameterGeometry(temReservasTerritorialesIndigenasParamDef);
		return list;
	}
	
	public List<TemReservasTerritorialesIndigenas> buscarCombo(TemReservasTerritorialesIndigenasDto temReservasTerritorialesIndigenasDto) throws Exception {
		TemReservasTerritorialesIndigenasParamDef temReservasTerritorialesIndigenasParamDef		= new TemReservasTerritorialesIndigenasParamDef();
		
		Criteria criteria		= temReservasTerritorialesIndigenasParamDef.createCriteria();
		if(temReservasTerritorialesIndigenasDto != null) {
			if(CadenaUtil.getStrNull(temReservasTerritorialesIndigenasDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temReservasTerritorialesIndigenasDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(temReservasTerritorialesIndigenasDto.getIntObjectid1()) != null) {
				criteria.andIntObjectid1EqualTo(temReservasTerritorialesIndigenasDto.getIntObjectid1());
			}
			if(CadenaUtil.getStrNull(temReservasTerritorialesIndigenasDto.getStrGmlId()) != null) {
				criteria.andStrGmlIdEqualTo(temReservasTerritorialesIndigenasDto.getStrGmlId());
			}
			if(CadenaUtil.getInteNull(temReservasTerritorialesIndigenasDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(temReservasTerritorialesIndigenasDto.getIntObjectid());
			}
			if(CadenaUtil.getInteNull(temReservasTerritorialesIndigenasDto.getIntId()) != null) {
				criteria.andIntIdEqualTo(temReservasTerritorialesIndigenasDto.getIntId());
			}
			if(CadenaUtil.getDoubNull(temReservasTerritorialesIndigenasDto.getDblSdeDboTe()) != null) {
				criteria.andDblSdeDboTeEqualTo(temReservasTerritorialesIndigenasDto.getDblSdeDboTe());
			}
			if(CadenaUtil.getDoubNull(temReservasTerritorialesIndigenasDto.getDblPerimeter()) != null) {
				criteria.andDblPerimeterEqualTo(temReservasTerritorialesIndigenasDto.getDblPerimeter());
			}
			if(CadenaUtil.getStrNull(temReservasTerritorialesIndigenasDto.getStrNombre()) != null) {
				criteria.andStrNombreEqualTo(temReservasTerritorialesIndigenasDto.getStrNombre());
			}
			if(CadenaUtil.getStrNull(temReservasTerritorialesIndigenasDto.getStrBaseLegal()) != null) {
				criteria.andStrBaseLegalEqualTo(temReservasTerritorialesIndigenasDto.getStrBaseLegal());
			}
			if(CadenaUtil.getDoubNull(temReservasTerritorialesIndigenasDto.getDblNHaIbc()) != null) {
				criteria.andDblNHaIbcEqualTo(temReservasTerritorialesIndigenasDto.getDblNHaIbc());
			}
			if(CadenaUtil.getStrNull(temReservasTerritorialesIndigenasDto.getStrNUbicAnp()) != null) {
				criteria.andStrNUbicAnpEqualTo(temReservasTerritorialesIndigenasDto.getStrNUbicAnp());
			}
			if(CadenaUtil.getStrNull(temReservasTerritorialesIndigenasDto.getStrNMapA0()) != null) {
				criteria.andStrNMapA0EqualTo(temReservasTerritorialesIndigenasDto.getStrNMapA0());
			}
			if(CadenaUtil.getStrNull(temReservasTerritorialesIndigenasDto.getStrCategoria()) != null) {
				criteria.andStrCategoriaEqualTo(temReservasTerritorialesIndigenasDto.getStrCategoria());
			}
			if(CadenaUtil.getStrNull(temReservasTerritorialesIndigenasDto.getStrEtnia()) != null) {
				criteria.andStrEtniaEqualTo(temReservasTerritorialesIndigenasDto.getStrEtnia());
			}
			if(CadenaUtil.getStrNull(temReservasTerritorialesIndigenasDto.getStrUbicaPoli()) != null) {
				criteria.andStrUbicaPoliEqualTo(temReservasTerritorialesIndigenasDto.getStrUbicaPoli());
			}
			if(CadenaUtil.getStrNull(temReservasTerritorialesIndigenasDto.getStrAreaLegal()) != null) {
				criteria.andStrAreaLegalEqualTo(temReservasTerritorialesIndigenasDto.getStrAreaLegal());
			}
			if(CadenaUtil.getDoubNull(temReservasTerritorialesIndigenasDto.getDblShapeStar()) != null) {
				criteria.andDblShapeStarEqualTo(temReservasTerritorialesIndigenasDto.getDblShapeStar());
			}
			if(CadenaUtil.getDoubNull(temReservasTerritorialesIndigenasDto.getDblShapeStle()) != null) {
				criteria.andDblShapeStleEqualTo(temReservasTerritorialesIndigenasDto.getDblShapeStle());
			}
		}
		
		temReservasTerritorialesIndigenasParamDef.setOrderByClause("de_nombre,de_etnia");
		List<TemReservasTerritorialesIndigenas>	 list	= temReservasTerritorialesIndigenasMapper.selectByDefaultParameterCombo(temReservasTerritorialesIndigenasParamDef);
		return list;
	}
	
	public TemReservasTerritorialesIndigenas buscarById(TemReservasTerritorialesIndigenasDto temReservasTerritorialesIndigenasDto) throws Exception {
		TemReservasTerritorialesIndigenas temReservasTerritorialesIndigenas		= new TemReservasTerritorialesIndigenas();
		BeanUtils.copyProperties(temReservasTerritorialesIndigenasDto, temReservasTerritorialesIndigenas);
		return temReservasTerritorialesIndigenasMapper.selectByPrimaryKey(temReservasTerritorialesIndigenas);
	}
	
	public TemReservasTerritorialesIndigenas buscarGeometryById(TemReservasTerritorialesIndigenasDto temReservasTerritorialesIndigenasDto) throws Exception {
		TemReservasTerritorialesIndigenas temReservasTerritorialesIndigenas		= new TemReservasTerritorialesIndigenas();
		BeanUtils.copyProperties(temReservasTerritorialesIndigenasDto, temReservasTerritorialesIndigenas);
		return temReservasTerritorialesIndigenasMapper.selectByPrimaryKeyGeometry(temReservasTerritorialesIndigenas);
	}
	
	@Transactional
	public Integer guardar(TemReservasTerritorialesIndigenasDto temReservasTerritorialesIndigenasDto) throws Exception {
		TemReservasTerritorialesIndigenas temReservasTerritorialesIndigenas		= new TemReservasTerritorialesIndigenas();
		BeanUtils.copyProperties(temReservasTerritorialesIndigenasDto, temReservasTerritorialesIndigenas);
		int rs	= 0;
		TemReservasTerritorialesIndigenas exiteTemReservasTerritorialesIndigenas		= temReservasTerritorialesIndigenasMapper.selectByPrimaryKey(temReservasTerritorialesIndigenas);
		if(exiteTemReservasTerritorialesIndigenas != null) {
			rs	= temReservasTerritorialesIndigenasMapper.updateByPrimaryKeySelective(temReservasTerritorialesIndigenas);
		} else {
			rs	= temReservasTerritorialesIndigenasMapper.insertSelective(temReservasTerritorialesIndigenas);
			
			Integer srlGid	= temReservasTerritorialesIndigenasMapper.lastSequence();
			temReservasTerritorialesIndigenasDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemReservasTerritorialesIndigenasDto temReservasTerritorialesIndigenasDto) throws Exception {
		TemReservasTerritorialesIndigenas temReservasTerritorialesIndigenas		= new TemReservasTerritorialesIndigenas();
		BeanUtils.copyProperties(temReservasTerritorialesIndigenasDto, temReservasTerritorialesIndigenas);
		Integer rs	= temReservasTerritorialesIndigenasMapper.deleteByPrimaryKey(temReservasTerritorialesIndigenas);
		return rs;
	}
	
}
