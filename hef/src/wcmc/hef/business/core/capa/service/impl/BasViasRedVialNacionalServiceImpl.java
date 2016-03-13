package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.BasViasRedVialNacionalDto;
import wcmc.hef.business.core.capa.service.BasViasRedVialNacionalService;
import wcmc.hef.dao.capa.domain.BasViasRedVialNacional;
import wcmc.hef.dao.capa.domain.BasViasRedVialNacionalParamDef;
import wcmc.hef.dao.capa.domain.BasViasRedVialNacionalParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.BasViasRedVialNacionalMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class BasViasRedVialNacionalServiceImpl implements BasViasRedVialNacionalService {
	@Autowired
	private BasViasRedVialNacionalMapper basViasRedVialNacionalMapper;
	public List<BasViasRedVialNacional> buscar(BasViasRedVialNacionalDto basViasRedVialNacionalDto) throws Exception {
		BasViasRedVialNacionalParamDef basViasRedVialNacionalParamDef		= new BasViasRedVialNacionalParamDef();
		
		Criteria criteria		= basViasRedVialNacionalParamDef.createCriteria();
		if(basViasRedVialNacionalDto != null) {
			if(CadenaUtil.getStrNull(basViasRedVialNacionalDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(basViasRedVialNacionalDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(basViasRedVialNacionalDto.getStrDpto()) != null) {
				criteria.andStrDptoEqualTo(basViasRedVialNacionalDto.getStrDpto());
			}
			if(CadenaUtil.getStrNull(basViasRedVialNacionalDto.getStrRutaD044()) != null) {
				criteria.andStrRutaD044EqualTo(basViasRedVialNacionalDto.getStrRutaD044());
			}
			if(CadenaUtil.getStrNull(basViasRedVialNacionalDto.getStrRed044()) != null) {
				criteria.andStrRed044EqualTo(basViasRedVialNacionalDto.getStrRed044());
			}
			if(CadenaUtil.getDoubNull(basViasRedVialNacionalDto.getDblLongkmD44()) != null) {
				criteria.andDblLongkmD44EqualTo(basViasRedVialNacionalDto.getDblLongkmD44());
			}
			if(CadenaUtil.getStrNull(basViasRedVialNacionalDto.getStrSuperRod()) != null) {
				criteria.andStrSuperRodEqualTo(basViasRedVialNacionalDto.getStrSuperRod());
			}
		}
		
		basViasRedVialNacionalParamDef.setOrderByClause("de_ruta_d044");
		List<BasViasRedVialNacional>	 list	= basViasRedVialNacionalMapper.selectByDefaultParameter(basViasRedVialNacionalParamDef);
		return list;
	}
	
	public List<BasViasRedVialNacional> buscarGeometry(BasViasRedVialNacionalDto basViasRedVialNacionalDto) throws Exception {
		BasViasRedVialNacionalParamDef basViasRedVialNacionalParamDef		= new BasViasRedVialNacionalParamDef();
		
		Criteria criteria		= basViasRedVialNacionalParamDef.createCriteria();
		if(basViasRedVialNacionalDto != null) {
			if(CadenaUtil.getStrNull(basViasRedVialNacionalDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(basViasRedVialNacionalDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(basViasRedVialNacionalDto.getStrDpto()) != null) {
				criteria.andStrDptoEqualTo(basViasRedVialNacionalDto.getStrDpto());
			}
			if(CadenaUtil.getStrNull(basViasRedVialNacionalDto.getStrRutaD044()) != null) {
				criteria.andStrRutaD044EqualTo(basViasRedVialNacionalDto.getStrRutaD044());
			}
			if(CadenaUtil.getStrNull(basViasRedVialNacionalDto.getStrRed044()) != null) {
				criteria.andStrRed044EqualTo(basViasRedVialNacionalDto.getStrRed044());
			}
			if(CadenaUtil.getDoubNull(basViasRedVialNacionalDto.getDblLongkmD44()) != null) {
				criteria.andDblLongkmD44EqualTo(basViasRedVialNacionalDto.getDblLongkmD44());
			}
			if(CadenaUtil.getStrNull(basViasRedVialNacionalDto.getStrSuperRod()) != null) {
				criteria.andStrSuperRodEqualTo(basViasRedVialNacionalDto.getStrSuperRod());
			}
		}
		
		basViasRedVialNacionalParamDef.setOrderByClause("de_ruta_d044");
		List<BasViasRedVialNacional>	 list	= basViasRedVialNacionalMapper.selectByDefaultParameterGeometry(basViasRedVialNacionalParamDef);
		return list;
	}
	
	public List<BasViasRedVialNacional> buscarCombo(BasViasRedVialNacionalDto basViasRedVialNacionalDto) throws Exception {
		BasViasRedVialNacionalParamDef basViasRedVialNacionalParamDef		= new BasViasRedVialNacionalParamDef();
		
		Criteria criteria		= basViasRedVialNacionalParamDef.createCriteria();
		if(basViasRedVialNacionalDto != null) {
			if(CadenaUtil.getStrNull(basViasRedVialNacionalDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(basViasRedVialNacionalDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(basViasRedVialNacionalDto.getStrDpto()) != null) {
				criteria.andStrDptoEqualTo(basViasRedVialNacionalDto.getStrDpto());
			}
			if(CadenaUtil.getStrNull(basViasRedVialNacionalDto.getStrRutaD044()) != null) {
				criteria.andStrRutaD044EqualTo(basViasRedVialNacionalDto.getStrRutaD044());
			}
			if(CadenaUtil.getStrNull(basViasRedVialNacionalDto.getStrRed044()) != null) {
				criteria.andStrRed044EqualTo(basViasRedVialNacionalDto.getStrRed044());
			}
			if(CadenaUtil.getDoubNull(basViasRedVialNacionalDto.getDblLongkmD44()) != null) {
				criteria.andDblLongkmD44EqualTo(basViasRedVialNacionalDto.getDblLongkmD44());
			}
			if(CadenaUtil.getStrNull(basViasRedVialNacionalDto.getStrSuperRod()) != null) {
				criteria.andStrSuperRodEqualTo(basViasRedVialNacionalDto.getStrSuperRod());
			}
		}
		
		basViasRedVialNacionalParamDef.setOrderByClause("de_ruta_d044");
		List<BasViasRedVialNacional>	 list	= basViasRedVialNacionalMapper.selectByDefaultParameterCombo(basViasRedVialNacionalParamDef);
		return list;
	}
	
	public BasViasRedVialNacional buscarById(BasViasRedVialNacionalDto basViasRedVialNacionalDto) throws Exception {
		BasViasRedVialNacional basViasRedVialNacional		= new BasViasRedVialNacional();
		BeanUtils.copyProperties(basViasRedVialNacionalDto, basViasRedVialNacional);
		return basViasRedVialNacionalMapper.selectByPrimaryKey(basViasRedVialNacional);
	}
	
	public BasViasRedVialNacional buscarGeometryById(BasViasRedVialNacionalDto basViasRedVialNacionalDto) throws Exception {
		BasViasRedVialNacional basViasRedVialNacional		= new BasViasRedVialNacional();
		BeanUtils.copyProperties(basViasRedVialNacionalDto, basViasRedVialNacional);
		return basViasRedVialNacionalMapper.selectByPrimaryKeyGeometry(basViasRedVialNacional);
	}
	
	@Transactional
	public Integer guardar(BasViasRedVialNacionalDto basViasRedVialNacionalDto) throws Exception {
		BasViasRedVialNacional basViasRedVialNacional		= new BasViasRedVialNacional();
		BeanUtils.copyProperties(basViasRedVialNacionalDto, basViasRedVialNacional);
		int rs	= 0;
		BasViasRedVialNacional exiteBasViasRedVialNacional		= basViasRedVialNacionalMapper.selectByPrimaryKey(basViasRedVialNacional);
		if(exiteBasViasRedVialNacional != null) {
			rs	= basViasRedVialNacionalMapper.updateByPrimaryKeySelective(basViasRedVialNacional);
		} else {
			rs	= basViasRedVialNacionalMapper.insertSelective(basViasRedVialNacional);
			
			Integer srlGid	= basViasRedVialNacionalMapper.lastSequence();
			basViasRedVialNacionalDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(BasViasRedVialNacionalDto basViasRedVialNacionalDto) throws Exception {
		BasViasRedVialNacional basViasRedVialNacional		= new BasViasRedVialNacional();
		BeanUtils.copyProperties(basViasRedVialNacionalDto, basViasRedVialNacional);
		Integer rs	= basViasRedVialNacionalMapper.deleteByPrimaryKey(basViasRedVialNacional);
		return rs;
	}
	
}
