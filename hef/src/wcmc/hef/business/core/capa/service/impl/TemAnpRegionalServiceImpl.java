package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemAnpRegionalDto;
import wcmc.hef.business.core.capa.service.TemAnpRegionalService;
import wcmc.hef.dao.capa.domain.TemAnpRegional;
import wcmc.hef.dao.capa.domain.TemAnpRegionalParamDef;
import wcmc.hef.dao.capa.domain.TemAnpRegionalParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemAnpRegionalMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemAnpRegionalServiceImpl implements TemAnpRegionalService {
	@Autowired
	private TemAnpRegionalMapper temAnpRegionalMapper;
	public List<TemAnpRegional> buscar(TemAnpRegionalDto temAnpRegionalDto) throws Exception {
		TemAnpRegionalParamDef temAnpRegionalParamDef		= new TemAnpRegionalParamDef();
		
		Criteria criteria		= temAnpRegionalParamDef.createCriteria();
		if(temAnpRegionalDto != null) {
			if(CadenaUtil.getStrNull(temAnpRegionalDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temAnpRegionalDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(temAnpRegionalDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(temAnpRegionalDto.getIntObjectid());
			}
			if(CadenaUtil.getStrNull(temAnpRegionalDto.getStrAnpcCat()) != null) {
				criteria.andStrAnpcCatEqualTo(temAnpRegionalDto.getStrAnpcCat());
			}
			if(CadenaUtil.getStrNull(temAnpRegionalDto.getStrAnpcCodi()) != null) {
				criteria.andStrAnpcCodiEqualTo(temAnpRegionalDto.getStrAnpcCodi());
			}
			if(CadenaUtil.getStrNull(temAnpRegionalDto.getStrAnpcNomb()) != null) {
				criteria.andStrAnpcNombEqualTo(temAnpRegionalDto.getStrAnpcNomb());
			}
			if(CadenaUtil.getDoubNull(temAnpRegionalDto.getDblAnpcArea()) != null) {
				criteria.andDblAnpcAreaEqualTo(temAnpRegionalDto.getDblAnpcArea());
			}
			if(CadenaUtil.getStrNull(temAnpRegionalDto.getStrAnpcBalec()) != null) {
				criteria.andStrAnpcBalecEqualTo(temAnpRegionalDto.getStrAnpcBalec());
			}
			if(CadenaUtil.getStrNull(temAnpRegionalDto.getStrAnpcFelec()) != null) {
				criteria.andStrAnpcFelecEqualTo(temAnpRegionalDto.getStrAnpcFelec());
			}
			if(CadenaUtil.getStrNull(temAnpRegionalDto.getStrAnpcBalem()) != null) {
				criteria.andStrAnpcBalemEqualTo(temAnpRegionalDto.getStrAnpcBalem());
			}
			if(CadenaUtil.getStrNull(temAnpRegionalDto.getStrAnpcFelem()) != null) {
				criteria.andStrAnpcFelemEqualTo(temAnpRegionalDto.getStrAnpcFelem());
			}
			if(CadenaUtil.getStrNull(temAnpRegionalDto.getStrAnpcDepa()) != null) {
				criteria.andStrAnpcDepaEqualTo(temAnpRegionalDto.getStrAnpcDepa());
			}
		}
		
		temAnpRegionalParamDef.setOrderByClause("de_anpc_nomb");
		List<TemAnpRegional>	 list	= temAnpRegionalMapper.selectByDefaultParameter(temAnpRegionalParamDef);
		return list;
	}
	
	public List<TemAnpRegional> buscarGeometry(TemAnpRegionalDto temAnpRegionalDto) throws Exception {
		TemAnpRegionalParamDef temAnpRegionalParamDef		= new TemAnpRegionalParamDef();
		
		Criteria criteria		= temAnpRegionalParamDef.createCriteria();
		if(temAnpRegionalDto != null) {
			if(CadenaUtil.getStrNull(temAnpRegionalDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temAnpRegionalDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(temAnpRegionalDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(temAnpRegionalDto.getIntObjectid());
			}
			if(CadenaUtil.getStrNull(temAnpRegionalDto.getStrAnpcCat()) != null) {
				criteria.andStrAnpcCatEqualTo(temAnpRegionalDto.getStrAnpcCat());
			}
			if(CadenaUtil.getStrNull(temAnpRegionalDto.getStrAnpcCodi()) != null) {
				criteria.andStrAnpcCodiEqualTo(temAnpRegionalDto.getStrAnpcCodi());
			}
			if(CadenaUtil.getStrNull(temAnpRegionalDto.getStrAnpcNomb()) != null) {
				criteria.andStrAnpcNombEqualTo(temAnpRegionalDto.getStrAnpcNomb());
			}
			if(CadenaUtil.getDoubNull(temAnpRegionalDto.getDblAnpcArea()) != null) {
				criteria.andDblAnpcAreaEqualTo(temAnpRegionalDto.getDblAnpcArea());
			}
			if(CadenaUtil.getStrNull(temAnpRegionalDto.getStrAnpcBalec()) != null) {
				criteria.andStrAnpcBalecEqualTo(temAnpRegionalDto.getStrAnpcBalec());
			}
			if(CadenaUtil.getStrNull(temAnpRegionalDto.getStrAnpcFelec()) != null) {
				criteria.andStrAnpcFelecEqualTo(temAnpRegionalDto.getStrAnpcFelec());
			}
			if(CadenaUtil.getStrNull(temAnpRegionalDto.getStrAnpcBalem()) != null) {
				criteria.andStrAnpcBalemEqualTo(temAnpRegionalDto.getStrAnpcBalem());
			}
			if(CadenaUtil.getStrNull(temAnpRegionalDto.getStrAnpcFelem()) != null) {
				criteria.andStrAnpcFelemEqualTo(temAnpRegionalDto.getStrAnpcFelem());
			}
			if(CadenaUtil.getStrNull(temAnpRegionalDto.getStrAnpcDepa()) != null) {
				criteria.andStrAnpcDepaEqualTo(temAnpRegionalDto.getStrAnpcDepa());
			}
		}
		
		temAnpRegionalParamDef.setOrderByClause("de_anpc_nomb");
		List<TemAnpRegional>	 list	= temAnpRegionalMapper.selectByDefaultParameterGeometry(temAnpRegionalParamDef);
		return list;
	}
	
	public List<TemAnpRegional> buscarCombo(TemAnpRegionalDto temAnpRegionalDto) throws Exception {
		TemAnpRegionalParamDef temAnpRegionalParamDef		= new TemAnpRegionalParamDef();
		
		Criteria criteria		= temAnpRegionalParamDef.createCriteria();
		if(temAnpRegionalDto != null) {
			if(CadenaUtil.getStrNull(temAnpRegionalDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temAnpRegionalDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(temAnpRegionalDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(temAnpRegionalDto.getIntObjectid());
			}
			if(CadenaUtil.getStrNull(temAnpRegionalDto.getStrAnpcCat()) != null) {
				criteria.andStrAnpcCatEqualTo(temAnpRegionalDto.getStrAnpcCat());
			}
			if(CadenaUtil.getStrNull(temAnpRegionalDto.getStrAnpcCodi()) != null) {
				criteria.andStrAnpcCodiEqualTo(temAnpRegionalDto.getStrAnpcCodi());
			}
			if(CadenaUtil.getStrNull(temAnpRegionalDto.getStrAnpcNomb()) != null) {
				criteria.andStrAnpcNombEqualTo(temAnpRegionalDto.getStrAnpcNomb());
			}
			if(CadenaUtil.getDoubNull(temAnpRegionalDto.getDblAnpcArea()) != null) {
				criteria.andDblAnpcAreaEqualTo(temAnpRegionalDto.getDblAnpcArea());
			}
			if(CadenaUtil.getStrNull(temAnpRegionalDto.getStrAnpcBalec()) != null) {
				criteria.andStrAnpcBalecEqualTo(temAnpRegionalDto.getStrAnpcBalec());
			}
			if(CadenaUtil.getStrNull(temAnpRegionalDto.getStrAnpcFelec()) != null) {
				criteria.andStrAnpcFelecEqualTo(temAnpRegionalDto.getStrAnpcFelec());
			}
			if(CadenaUtil.getStrNull(temAnpRegionalDto.getStrAnpcBalem()) != null) {
				criteria.andStrAnpcBalemEqualTo(temAnpRegionalDto.getStrAnpcBalem());
			}
			if(CadenaUtil.getStrNull(temAnpRegionalDto.getStrAnpcFelem()) != null) {
				criteria.andStrAnpcFelemEqualTo(temAnpRegionalDto.getStrAnpcFelem());
			}
			if(CadenaUtil.getStrNull(temAnpRegionalDto.getStrAnpcDepa()) != null) {
				criteria.andStrAnpcDepaEqualTo(temAnpRegionalDto.getStrAnpcDepa());
			}
		}
		
		temAnpRegionalParamDef.setOrderByClause("de_anpc_nomb");
		List<TemAnpRegional>	 list	= temAnpRegionalMapper.selectByDefaultParameterCombo(temAnpRegionalParamDef);
		return list;
	}
	
	public TemAnpRegional buscarById(TemAnpRegionalDto temAnpRegionalDto) throws Exception {
		TemAnpRegional temAnpRegional		= new TemAnpRegional();
		BeanUtils.copyProperties(temAnpRegionalDto, temAnpRegional);
		return temAnpRegionalMapper.selectByPrimaryKey(temAnpRegional);
	}
	
	public TemAnpRegional buscarGeometryById(TemAnpRegionalDto temAnpRegionalDto) throws Exception {
		TemAnpRegional temAnpRegional		= new TemAnpRegional();
		BeanUtils.copyProperties(temAnpRegionalDto, temAnpRegional);
		return temAnpRegionalMapper.selectByPrimaryKeyGeometry(temAnpRegional);
	}
	
	@Transactional
	public Integer guardar(TemAnpRegionalDto temAnpRegionalDto) throws Exception {
		TemAnpRegional temAnpRegional		= new TemAnpRegional();
		BeanUtils.copyProperties(temAnpRegionalDto, temAnpRegional);
		int rs	= 0;
		TemAnpRegional exiteTemAnpRegional		= temAnpRegionalMapper.selectByPrimaryKey(temAnpRegional);
		if(exiteTemAnpRegional != null) {
			rs	= temAnpRegionalMapper.updateByPrimaryKeySelective(temAnpRegional);
		} else {
			rs	= temAnpRegionalMapper.insertSelective(temAnpRegional);
			
			Integer srlGid	= temAnpRegionalMapper.lastSequence();
			temAnpRegionalDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemAnpRegionalDto temAnpRegionalDto) throws Exception {
		TemAnpRegional temAnpRegional		= new TemAnpRegional();
		BeanUtils.copyProperties(temAnpRegionalDto, temAnpRegional);
		Integer rs	= temAnpRegionalMapper.deleteByPrimaryKey(temAnpRegional);
		return rs;
	}
	
}
