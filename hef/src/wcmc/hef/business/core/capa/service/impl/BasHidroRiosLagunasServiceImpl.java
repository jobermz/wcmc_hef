package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.BasHidroRiosLagunasDto;
import wcmc.hef.business.core.capa.service.BasHidroRiosLagunasService;
import wcmc.hef.dao.capa.domain.BasHidroRiosLagunas;
import wcmc.hef.dao.capa.domain.BasHidroRiosLagunasParamDef;
import wcmc.hef.dao.capa.domain.BasHidroRiosLagunasParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.BasHidroRiosLagunasMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class BasHidroRiosLagunasServiceImpl implements BasHidroRiosLagunasService {
	@Autowired
	private BasHidroRiosLagunasMapper basHidroRiosLagunasMapper;
	public List<BasHidroRiosLagunas> buscar(BasHidroRiosLagunasDto basHidroRiosLagunasDto) throws Exception {
		BasHidroRiosLagunasParamDef basHidroRiosLagunasParamDef		= new BasHidroRiosLagunasParamDef();
		
		Criteria criteria		= basHidroRiosLagunasParamDef.createCriteria();
		if(basHidroRiosLagunasDto != null) {
			if(CadenaUtil.getStrNull(basHidroRiosLagunasDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(basHidroRiosLagunasDto.getStrTheGeom());
			}
			if(CadenaUtil.getLongNull(basHidroRiosLagunasDto.getLngCount()) != null) {
				criteria.andLngCountEqualTo(basHidroRiosLagunasDto.getLngCount());
			}
			if(CadenaUtil.getStrNull(basHidroRiosLagunasDto.getStrFirstIdpr()) != null) {
				criteria.andStrFirstIdprEqualTo(basHidroRiosLagunasDto.getStrFirstIdpr());
			}
			if(CadenaUtil.getStrNull(basHidroRiosLagunasDto.getStrNombprov()) != null) {
				criteria.andStrNombprovEqualTo(basHidroRiosLagunasDto.getStrNombprov());
			}
			if(CadenaUtil.getStrNull(basHidroRiosLagunasDto.getStrFirstNomb()) != null) {
				criteria.andStrFirstNombEqualTo(basHidroRiosLagunasDto.getStrFirstNomb());
			}
			if(CadenaUtil.getStrNull(basHidroRiosLagunasDto.getStrLastDcto()) != null) {
				criteria.andStrLastDctoEqualTo(basHidroRiosLagunasDto.getStrLastDcto());
			}
			if(CadenaUtil.getStrNull(basHidroRiosLagunasDto.getStrLastLey()) != null) {
				criteria.andStrLastLeyEqualTo(basHidroRiosLagunasDto.getStrLastLey());
			}
			if(CadenaUtil.getStrNull(basHidroRiosLagunasDto.getStrFirstFech()) != null) {
				criteria.andStrFirstFechEqualTo(basHidroRiosLagunasDto.getStrFirstFech());
			}
			if(CadenaUtil.getStrNull(basHidroRiosLagunasDto.getStrLastFecha()) != null) {
				criteria.andStrLastFechaEqualTo(basHidroRiosLagunasDto.getStrLastFecha());
			}
			if(CadenaUtil.getDoubNull(basHidroRiosLagunasDto.getDblMinShape()) != null) {
				criteria.andDblMinShapeEqualTo(basHidroRiosLagunasDto.getDblMinShape());
			}
			if(CadenaUtil.getDoubNull(basHidroRiosLagunasDto.getDblArea()) != null) {
				criteria.andDblAreaEqualTo(basHidroRiosLagunasDto.getDblArea());
			}
			if(CadenaUtil.getDoubNull(basHidroRiosLagunasDto.getDblPerimeter()) != null) {
				criteria.andDblPerimeterEqualTo(basHidroRiosLagunasDto.getDblPerimeter());
			}
			if(CadenaUtil.getLongNull(basHidroRiosLagunasDto.getLngTiticacg()) != null) {
				criteria.andLngTiticacgEqualTo(basHidroRiosLagunasDto.getLngTiticacg());
			}
			if(CadenaUtil.getLongNull(basHidroRiosLagunasDto.getLngTiticacgI()) != null) {
				criteria.andLngTiticacgIEqualTo(basHidroRiosLagunasDto.getLngTiticacgI());
			}
			if(CadenaUtil.getStrNull(basHidroRiosLagunasDto.getStrDxfLayer()) != null) {
				criteria.andStrDxfLayerEqualTo(basHidroRiosLagunasDto.getStrDxfLayer());
			}
			if(CadenaUtil.getStrNull(basHidroRiosLagunasDto.getStrDxfText()) != null) {
				criteria.andStrDxfTextEqualTo(basHidroRiosLagunasDto.getStrDxfText());
			}
		}
		
		List<BasHidroRiosLagunas>	 list	= basHidroRiosLagunasMapper.selectByDefaultParameter(basHidroRiosLagunasParamDef);
		return list;
	}
	
	public List<BasHidroRiosLagunas> buscarGeometry(BasHidroRiosLagunasDto basHidroRiosLagunasDto) throws Exception {
		BasHidroRiosLagunasParamDef basHidroRiosLagunasParamDef		= new BasHidroRiosLagunasParamDef();
		
		Criteria criteria		= basHidroRiosLagunasParamDef.createCriteria();
		if(basHidroRiosLagunasDto != null) {
			if(CadenaUtil.getStrNull(basHidroRiosLagunasDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(basHidroRiosLagunasDto.getStrTheGeom());
			}
			if(CadenaUtil.getLongNull(basHidroRiosLagunasDto.getLngCount()) != null) {
				criteria.andLngCountEqualTo(basHidroRiosLagunasDto.getLngCount());
			}
			if(CadenaUtil.getStrNull(basHidroRiosLagunasDto.getStrFirstIdpr()) != null) {
				criteria.andStrFirstIdprEqualTo(basHidroRiosLagunasDto.getStrFirstIdpr());
			}
			if(CadenaUtil.getStrNull(basHidroRiosLagunasDto.getStrNombprov()) != null) {
				criteria.andStrNombprovEqualTo(basHidroRiosLagunasDto.getStrNombprov());
			}
			if(CadenaUtil.getStrNull(basHidroRiosLagunasDto.getStrFirstNomb()) != null) {
				criteria.andStrFirstNombEqualTo(basHidroRiosLagunasDto.getStrFirstNomb());
			}
			if(CadenaUtil.getStrNull(basHidroRiosLagunasDto.getStrLastDcto()) != null) {
				criteria.andStrLastDctoEqualTo(basHidroRiosLagunasDto.getStrLastDcto());
			}
			if(CadenaUtil.getStrNull(basHidroRiosLagunasDto.getStrLastLey()) != null) {
				criteria.andStrLastLeyEqualTo(basHidroRiosLagunasDto.getStrLastLey());
			}
			if(CadenaUtil.getStrNull(basHidroRiosLagunasDto.getStrFirstFech()) != null) {
				criteria.andStrFirstFechEqualTo(basHidroRiosLagunasDto.getStrFirstFech());
			}
			if(CadenaUtil.getStrNull(basHidroRiosLagunasDto.getStrLastFecha()) != null) {
				criteria.andStrLastFechaEqualTo(basHidroRiosLagunasDto.getStrLastFecha());
			}
			if(CadenaUtil.getDoubNull(basHidroRiosLagunasDto.getDblMinShape()) != null) {
				criteria.andDblMinShapeEqualTo(basHidroRiosLagunasDto.getDblMinShape());
			}
			if(CadenaUtil.getDoubNull(basHidroRiosLagunasDto.getDblArea()) != null) {
				criteria.andDblAreaEqualTo(basHidroRiosLagunasDto.getDblArea());
			}
			if(CadenaUtil.getDoubNull(basHidroRiosLagunasDto.getDblPerimeter()) != null) {
				criteria.andDblPerimeterEqualTo(basHidroRiosLagunasDto.getDblPerimeter());
			}
			if(CadenaUtil.getLongNull(basHidroRiosLagunasDto.getLngTiticacg()) != null) {
				criteria.andLngTiticacgEqualTo(basHidroRiosLagunasDto.getLngTiticacg());
			}
			if(CadenaUtil.getLongNull(basHidroRiosLagunasDto.getLngTiticacgI()) != null) {
				criteria.andLngTiticacgIEqualTo(basHidroRiosLagunasDto.getLngTiticacgI());
			}
			if(CadenaUtil.getStrNull(basHidroRiosLagunasDto.getStrDxfLayer()) != null) {
				criteria.andStrDxfLayerEqualTo(basHidroRiosLagunasDto.getStrDxfLayer());
			}
			if(CadenaUtil.getStrNull(basHidroRiosLagunasDto.getStrDxfText()) != null) {
				criteria.andStrDxfTextEqualTo(basHidroRiosLagunasDto.getStrDxfText());
			}
		}
		
		List<BasHidroRiosLagunas>	 list	= basHidroRiosLagunasMapper.selectByDefaultParameterGeometry(basHidroRiosLagunasParamDef);
		return list;
	}
	
	public List<BasHidroRiosLagunas> buscarCombo(BasHidroRiosLagunasDto basHidroRiosLagunasDto) throws Exception {
		BasHidroRiosLagunasParamDef basHidroRiosLagunasParamDef		= new BasHidroRiosLagunasParamDef();
		
		Criteria criteria		= basHidroRiosLagunasParamDef.createCriteria();
		if(basHidroRiosLagunasDto != null) {
			if(CadenaUtil.getStrNull(basHidroRiosLagunasDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(basHidroRiosLagunasDto.getStrTheGeom());
			}
			if(CadenaUtil.getLongNull(basHidroRiosLagunasDto.getLngCount()) != null) {
				criteria.andLngCountEqualTo(basHidroRiosLagunasDto.getLngCount());
			}
			if(CadenaUtil.getStrNull(basHidroRiosLagunasDto.getStrFirstIdpr()) != null) {
				criteria.andStrFirstIdprEqualTo(basHidroRiosLagunasDto.getStrFirstIdpr());
			}
			if(CadenaUtil.getStrNull(basHidroRiosLagunasDto.getStrNombprov()) != null) {
				criteria.andStrNombprovEqualTo(basHidroRiosLagunasDto.getStrNombprov());
			}
			if(CadenaUtil.getStrNull(basHidroRiosLagunasDto.getStrFirstNomb()) != null) {
				criteria.andStrFirstNombEqualTo(basHidroRiosLagunasDto.getStrFirstNomb());
			}
			if(CadenaUtil.getStrNull(basHidroRiosLagunasDto.getStrLastDcto()) != null) {
				criteria.andStrLastDctoEqualTo(basHidroRiosLagunasDto.getStrLastDcto());
			}
			if(CadenaUtil.getStrNull(basHidroRiosLagunasDto.getStrLastLey()) != null) {
				criteria.andStrLastLeyEqualTo(basHidroRiosLagunasDto.getStrLastLey());
			}
			if(CadenaUtil.getStrNull(basHidroRiosLagunasDto.getStrFirstFech()) != null) {
				criteria.andStrFirstFechEqualTo(basHidroRiosLagunasDto.getStrFirstFech());
			}
			if(CadenaUtil.getStrNull(basHidroRiosLagunasDto.getStrLastFecha()) != null) {
				criteria.andStrLastFechaEqualTo(basHidroRiosLagunasDto.getStrLastFecha());
			}
			if(CadenaUtil.getDoubNull(basHidroRiosLagunasDto.getDblMinShape()) != null) {
				criteria.andDblMinShapeEqualTo(basHidroRiosLagunasDto.getDblMinShape());
			}
			if(CadenaUtil.getDoubNull(basHidroRiosLagunasDto.getDblArea()) != null) {
				criteria.andDblAreaEqualTo(basHidroRiosLagunasDto.getDblArea());
			}
			if(CadenaUtil.getDoubNull(basHidroRiosLagunasDto.getDblPerimeter()) != null) {
				criteria.andDblPerimeterEqualTo(basHidroRiosLagunasDto.getDblPerimeter());
			}
			if(CadenaUtil.getLongNull(basHidroRiosLagunasDto.getLngTiticacg()) != null) {
				criteria.andLngTiticacgEqualTo(basHidroRiosLagunasDto.getLngTiticacg());
			}
			if(CadenaUtil.getLongNull(basHidroRiosLagunasDto.getLngTiticacgI()) != null) {
				criteria.andLngTiticacgIEqualTo(basHidroRiosLagunasDto.getLngTiticacgI());
			}
			if(CadenaUtil.getStrNull(basHidroRiosLagunasDto.getStrDxfLayer()) != null) {
				criteria.andStrDxfLayerEqualTo(basHidroRiosLagunasDto.getStrDxfLayer());
			}
			if(CadenaUtil.getStrNull(basHidroRiosLagunasDto.getStrDxfText()) != null) {
				criteria.andStrDxfTextEqualTo(basHidroRiosLagunasDto.getStrDxfText());
			}
		}
		
		List<BasHidroRiosLagunas>	 list	= basHidroRiosLagunasMapper.selectByDefaultParameterCombo(basHidroRiosLagunasParamDef);
		return list;
	}
	
	public BasHidroRiosLagunas buscarById(BasHidroRiosLagunasDto basHidroRiosLagunasDto) throws Exception {
		BasHidroRiosLagunas basHidroRiosLagunas		= new BasHidroRiosLagunas();
		BeanUtils.copyProperties(basHidroRiosLagunasDto, basHidroRiosLagunas);
		return basHidroRiosLagunasMapper.selectByPrimaryKey(basHidroRiosLagunas);
	}
	
	public BasHidroRiosLagunas buscarGeometryById(BasHidroRiosLagunasDto basHidroRiosLagunasDto) throws Exception {
		BasHidroRiosLagunas basHidroRiosLagunas		= new BasHidroRiosLagunas();
		BeanUtils.copyProperties(basHidroRiosLagunasDto, basHidroRiosLagunas);
		return basHidroRiosLagunasMapper.selectByPrimaryKeyGeometry(basHidroRiosLagunas);
	}
	
	@Transactional
	public Integer guardar(BasHidroRiosLagunasDto basHidroRiosLagunasDto) throws Exception {
		BasHidroRiosLagunas basHidroRiosLagunas		= new BasHidroRiosLagunas();
		BeanUtils.copyProperties(basHidroRiosLagunasDto, basHidroRiosLagunas);
		int rs	= 0;
		BasHidroRiosLagunas exiteBasHidroRiosLagunas		= basHidroRiosLagunasMapper.selectByPrimaryKey(basHidroRiosLagunas);
		if(exiteBasHidroRiosLagunas != null) {
			rs	= basHidroRiosLagunasMapper.updateByPrimaryKeySelective(basHidroRiosLagunas);
		} else {
			rs	= basHidroRiosLagunasMapper.insertSelective(basHidroRiosLagunas);
			
			Integer srlGid	= basHidroRiosLagunasMapper.lastSequence();
			basHidroRiosLagunasDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(BasHidroRiosLagunasDto basHidroRiosLagunasDto) throws Exception {
		BasHidroRiosLagunas basHidroRiosLagunas		= new BasHidroRiosLagunas();
		BeanUtils.copyProperties(basHidroRiosLagunasDto, basHidroRiosLagunas);
		Integer rs	= basHidroRiosLagunasMapper.deleteByPrimaryKey(basHidroRiosLagunas);
		return rs;
	}
	
}
