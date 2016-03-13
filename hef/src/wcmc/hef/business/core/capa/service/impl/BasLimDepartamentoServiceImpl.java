package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.BasLimDepartamentoDto;
import wcmc.hef.business.core.capa.service.BasLimDepartamentoService;
import wcmc.hef.dao.capa.domain.BasLimDepartamento;
import wcmc.hef.dao.capa.domain.BasLimDepartamentoParamDef;
import wcmc.hef.dao.capa.domain.BasLimDepartamentoParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.BasLimDepartamentoMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class BasLimDepartamentoServiceImpl implements BasLimDepartamentoService {
	@Autowired
	private BasLimDepartamentoMapper basLimDepartamentoMapper;
	public List<BasLimDepartamento> buscar(BasLimDepartamentoDto basLimDepartamentoDto) throws Exception {
		BasLimDepartamentoParamDef basLimDepartamentoParamDef		= new BasLimDepartamentoParamDef();
		
		Criteria criteria		= basLimDepartamentoParamDef.createCriteria();
		if(basLimDepartamentoDto != null) {
			if(CadenaUtil.getStrNull(basLimDepartamentoDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(basLimDepartamentoDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(basLimDepartamentoDto.getStrIddpto()) != null) {
				criteria.andStrIddptoEqualTo(basLimDepartamentoDto.getStrIddpto());
			}
			if(CadenaUtil.getStrNull(basLimDepartamentoDto.getStrNombdep()) != null) {
				criteria.andStrNombdepEqualTo(basLimDepartamentoDto.getStrNombdep());
			}
		}
		
		basLimDepartamentoParamDef.setOrderByClause("de_nombdep");
		List<BasLimDepartamento>	 list	= basLimDepartamentoMapper.selectByDefaultParameter(basLimDepartamentoParamDef);
		return list;
	}
	
	public List<BasLimDepartamento> buscarGeometry(BasLimDepartamentoDto basLimDepartamentoDto) throws Exception {
		BasLimDepartamentoParamDef basLimDepartamentoParamDef		= new BasLimDepartamentoParamDef();
		
		Criteria criteria		= basLimDepartamentoParamDef.createCriteria();
		if(basLimDepartamentoDto != null) {
			if(CadenaUtil.getStrNull(basLimDepartamentoDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(basLimDepartamentoDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(basLimDepartamentoDto.getStrIddpto()) != null) {
				criteria.andStrIddptoEqualTo(basLimDepartamentoDto.getStrIddpto());
			}
			if(CadenaUtil.getStrNull(basLimDepartamentoDto.getStrNombdep()) != null) {
				criteria.andStrNombdepEqualTo(basLimDepartamentoDto.getStrNombdep());
			}
		}
		
		basLimDepartamentoParamDef.setOrderByClause("de_nombdep");
		List<BasLimDepartamento>	 list	= basLimDepartamentoMapper.selectByDefaultParameterGeometry(basLimDepartamentoParamDef);
		return list;
	}
	
	public List<BasLimDepartamento> buscarCombo(BasLimDepartamentoDto basLimDepartamentoDto) throws Exception {
		BasLimDepartamentoParamDef basLimDepartamentoParamDef		= new BasLimDepartamentoParamDef();
		
		Criteria criteria		= basLimDepartamentoParamDef.createCriteria();
		if(basLimDepartamentoDto != null) {
			if(CadenaUtil.getStrNull(basLimDepartamentoDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(basLimDepartamentoDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(basLimDepartamentoDto.getStrIddpto()) != null) {
				criteria.andStrIddptoEqualTo(basLimDepartamentoDto.getStrIddpto());
			}
			if(CadenaUtil.getStrNull(basLimDepartamentoDto.getStrNombdep()) != null) {
				criteria.andStrNombdepEqualTo(basLimDepartamentoDto.getStrNombdep());
			}
		}
		
		basLimDepartamentoParamDef.setOrderByClause("de_nombdep");
		List<BasLimDepartamento>	 list	= basLimDepartamentoMapper.selectByDefaultParameterCombo(basLimDepartamentoParamDef);
		return list;
	}
	
	public BasLimDepartamento buscarById(BasLimDepartamentoDto basLimDepartamentoDto) throws Exception {
		BasLimDepartamento basLimDepartamento		= new BasLimDepartamento();
		BeanUtils.copyProperties(basLimDepartamentoDto, basLimDepartamento);
		return basLimDepartamentoMapper.selectByPrimaryKey(basLimDepartamento);
	}
	
	public BasLimDepartamento buscarGeometryById(BasLimDepartamentoDto basLimDepartamentoDto) throws Exception {
		BasLimDepartamento basLimDepartamento		= new BasLimDepartamento();
		BeanUtils.copyProperties(basLimDepartamentoDto, basLimDepartamento);
		return basLimDepartamentoMapper.selectByPrimaryKeyGeometry(basLimDepartamento);
	}
	
	@Transactional
	public Integer guardar(BasLimDepartamentoDto basLimDepartamentoDto) throws Exception {
		BasLimDepartamento basLimDepartamento		= new BasLimDepartamento();
		BeanUtils.copyProperties(basLimDepartamentoDto, basLimDepartamento);
		int rs	= 0;
		BasLimDepartamento exiteBasLimDepartamento		= basLimDepartamentoMapper.selectByPrimaryKey(basLimDepartamento);
		if(exiteBasLimDepartamento != null) {
			rs	= basLimDepartamentoMapper.updateByPrimaryKeySelective(basLimDepartamento);
		} else {
			rs	= basLimDepartamentoMapper.insertSelective(basLimDepartamento);
			
			Integer srlGid	= basLimDepartamentoMapper.lastSequence();
			basLimDepartamentoDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(BasLimDepartamentoDto basLimDepartamentoDto) throws Exception {
		BasLimDepartamento basLimDepartamento		= new BasLimDepartamento();
		BeanUtils.copyProperties(basLimDepartamentoDto, basLimDepartamento);
		Integer rs	= basLimDepartamentoMapper.deleteByPrimaryKey(basLimDepartamento);
		return rs;
	}
	
}
