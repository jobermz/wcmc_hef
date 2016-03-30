package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemAnpNacionalDto;
import wcmc.hef.business.core.capa.service.TemAnpNacionalService;
import wcmc.hef.dao.capa.domain.TemAnpNacional;
import wcmc.hef.dao.capa.domain.TemAnpNacionalParamDef;
import wcmc.hef.dao.capa.domain.TemAnpNacionalParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemAnpNacionalMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemAnpNacionalServiceImpl implements TemAnpNacionalService {
	@Autowired
	private TemAnpNacionalMapper temAnpNacionalMapper;
	public List<TemAnpNacional> buscar(TemAnpNacionalDto temAnpNacionalDto) throws Exception {
		TemAnpNacionalParamDef temAnpNacionalParamDef		= new TemAnpNacionalParamDef();
		
		Criteria criteria		= temAnpNacionalParamDef.createCriteria();
		if(temAnpNacionalDto != null) {
			if(CadenaUtil.getStrNull(temAnpNacionalDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temAnpNacionalDto.getStrTheGeom());
			}
			if(CadenaUtil.getLongNull(temAnpNacionalDto.getLngObjectid()) != null) {
				criteria.andLngObjectidEqualTo(temAnpNacionalDto.getLngObjectid());
			}
			if(CadenaUtil.getStrNull(temAnpNacionalDto.getStrAnpCate()) != null) {
				criteria.andStrAnpCateEqualTo(temAnpNacionalDto.getStrAnpCate());
			}
			if(CadenaUtil.getStrNull(temAnpNacionalDto.getStrAnpNomb()) != null) {
				criteria.andStrAnpNombEqualTo(temAnpNacionalDto.getStrAnpNomb());
			}
			if(CadenaUtil.getStrNull(temAnpNacionalDto.getStrAnpCodi()) != null) {
				criteria.andStrAnpCodiEqualTo(temAnpNacionalDto.getStrAnpCodi());
			}
			if(CadenaUtil.getStrNull(temAnpNacionalDto.getStrAnpUbpo()) != null) {
				criteria.andStrAnpUbpoEqualTo(temAnpNacionalDto.getStrAnpUbpo());
			}
			if(CadenaUtil.getDoubNull(temAnpNacionalDto.getDblAnpArle()) != null) {
				criteria.andDblAnpArleEqualTo(temAnpNacionalDto.getDblAnpArle());
			}
			if(CadenaUtil.getStrNull(temAnpNacionalDto.getStrAnpBalecr()) != null) {
				criteria.andStrAnpBalecrEqualTo(temAnpNacionalDto.getStrAnpBalecr());
			}
			if(CadenaUtil.getStrNull(temAnpNacionalDto.getStrAnpFecrea()) != null) {
				criteria.andStrAnpFecreaEqualTo(temAnpNacionalDto.getStrAnpFecrea());
			}
			if(CadenaUtil.getStrNull(temAnpNacionalDto.getStrAnpBalemo()) != null) {
				criteria.andStrAnpBalemoEqualTo(temAnpNacionalDto.getStrAnpBalemo());
			}
			if(CadenaUtil.getStrNull(temAnpNacionalDto.getStrAnpFemodi()) != null) {
				criteria.andStrAnpFemodiEqualTo(temAnpNacionalDto.getStrAnpFemodi());
			}
			temAnpNacionalParamDef.setStrHashConsulta(temAnpNacionalDto.getStrHashConsulta());
		}
		
		temAnpNacionalParamDef.setOrderByClause("de_anp_cate,de_anp_nomb");
		List<TemAnpNacional>	 list	= temAnpNacionalMapper.selectByDefaultParameter(temAnpNacionalParamDef);
		return list;
	}
	
	public List<TemAnpNacional> buscarGeometry(TemAnpNacionalDto temAnpNacionalDto) throws Exception {
		TemAnpNacionalParamDef temAnpNacionalParamDef		= new TemAnpNacionalParamDef();
		
		Criteria criteria		= temAnpNacionalParamDef.createCriteria();
		if(temAnpNacionalDto != null) {
			if(CadenaUtil.getStrNull(temAnpNacionalDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temAnpNacionalDto.getStrTheGeom());
			}
			if(CadenaUtil.getLongNull(temAnpNacionalDto.getLngObjectid()) != null) {
				criteria.andLngObjectidEqualTo(temAnpNacionalDto.getLngObjectid());
			}
			if(CadenaUtil.getStrNull(temAnpNacionalDto.getStrAnpCate()) != null) {
				criteria.andStrAnpCateEqualTo(temAnpNacionalDto.getStrAnpCate());
			}
			if(CadenaUtil.getStrNull(temAnpNacionalDto.getStrAnpNomb()) != null) {
				criteria.andStrAnpNombEqualTo(temAnpNacionalDto.getStrAnpNomb());
			}
			if(CadenaUtil.getStrNull(temAnpNacionalDto.getStrAnpCodi()) != null) {
				criteria.andStrAnpCodiEqualTo(temAnpNacionalDto.getStrAnpCodi());
			}
			if(CadenaUtil.getStrNull(temAnpNacionalDto.getStrAnpUbpo()) != null) {
				criteria.andStrAnpUbpoEqualTo(temAnpNacionalDto.getStrAnpUbpo());
			}
			if(CadenaUtil.getDoubNull(temAnpNacionalDto.getDblAnpArle()) != null) {
				criteria.andDblAnpArleEqualTo(temAnpNacionalDto.getDblAnpArle());
			}
			if(CadenaUtil.getStrNull(temAnpNacionalDto.getStrAnpBalecr()) != null) {
				criteria.andStrAnpBalecrEqualTo(temAnpNacionalDto.getStrAnpBalecr());
			}
			if(CadenaUtil.getStrNull(temAnpNacionalDto.getStrAnpFecrea()) != null) {
				criteria.andStrAnpFecreaEqualTo(temAnpNacionalDto.getStrAnpFecrea());
			}
			if(CadenaUtil.getStrNull(temAnpNacionalDto.getStrAnpBalemo()) != null) {
				criteria.andStrAnpBalemoEqualTo(temAnpNacionalDto.getStrAnpBalemo());
			}
			if(CadenaUtil.getStrNull(temAnpNacionalDto.getStrAnpFemodi()) != null) {
				criteria.andStrAnpFemodiEqualTo(temAnpNacionalDto.getStrAnpFemodi());
			}
		}
		
		temAnpNacionalParamDef.setOrderByClause("de_anp_cate,de_anp_nomb");
		List<TemAnpNacional>	 list	= temAnpNacionalMapper.selectByDefaultParameterGeometry(temAnpNacionalParamDef);
		return list;
	}
	
	public List<TemAnpNacional> buscarCombo(TemAnpNacionalDto temAnpNacionalDto) throws Exception {
		TemAnpNacionalParamDef temAnpNacionalParamDef		= new TemAnpNacionalParamDef();
		
		Criteria criteria		= temAnpNacionalParamDef.createCriteria();
		if(temAnpNacionalDto != null) {
			if(CadenaUtil.getStrNull(temAnpNacionalDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temAnpNacionalDto.getStrTheGeom());
			}
			if(CadenaUtil.getLongNull(temAnpNacionalDto.getLngObjectid()) != null) {
				criteria.andLngObjectidEqualTo(temAnpNacionalDto.getLngObjectid());
			}
			if(CadenaUtil.getStrNull(temAnpNacionalDto.getStrAnpCate()) != null) {
				criteria.andStrAnpCateEqualTo(temAnpNacionalDto.getStrAnpCate());
			}
			if(CadenaUtil.getStrNull(temAnpNacionalDto.getStrAnpNomb()) != null) {
				criteria.andStrAnpNombEqualTo(temAnpNacionalDto.getStrAnpNomb());
			}
			if(CadenaUtil.getStrNull(temAnpNacionalDto.getStrAnpCodi()) != null) {
				criteria.andStrAnpCodiEqualTo(temAnpNacionalDto.getStrAnpCodi());
			}
			if(CadenaUtil.getStrNull(temAnpNacionalDto.getStrAnpUbpo()) != null) {
				criteria.andStrAnpUbpoEqualTo(temAnpNacionalDto.getStrAnpUbpo());
			}
			if(CadenaUtil.getDoubNull(temAnpNacionalDto.getDblAnpArle()) != null) {
				criteria.andDblAnpArleEqualTo(temAnpNacionalDto.getDblAnpArle());
			}
			if(CadenaUtil.getStrNull(temAnpNacionalDto.getStrAnpBalecr()) != null) {
				criteria.andStrAnpBalecrEqualTo(temAnpNacionalDto.getStrAnpBalecr());
			}
			if(CadenaUtil.getStrNull(temAnpNacionalDto.getStrAnpFecrea()) != null) {
				criteria.andStrAnpFecreaEqualTo(temAnpNacionalDto.getStrAnpFecrea());
			}
			if(CadenaUtil.getStrNull(temAnpNacionalDto.getStrAnpBalemo()) != null) {
				criteria.andStrAnpBalemoEqualTo(temAnpNacionalDto.getStrAnpBalemo());
			}
			if(CadenaUtil.getStrNull(temAnpNacionalDto.getStrAnpFemodi()) != null) {
				criteria.andStrAnpFemodiEqualTo(temAnpNacionalDto.getStrAnpFemodi());
			}
		}
		
		temAnpNacionalParamDef.setOrderByClause("de_anp_cate,de_anp_nomb");
		List<TemAnpNacional>	 list	= temAnpNacionalMapper.selectByDefaultParameterCombo(temAnpNacionalParamDef);
		return list;
	}
	
	public TemAnpNacional buscarById(TemAnpNacionalDto temAnpNacionalDto) throws Exception {
		TemAnpNacional temAnpNacional		= new TemAnpNacional();
		BeanUtils.copyProperties(temAnpNacionalDto, temAnpNacional);
		return temAnpNacionalMapper.selectByPrimaryKey(temAnpNacional);
	}
	
	public TemAnpNacional buscarGeometryById(TemAnpNacionalDto temAnpNacionalDto) throws Exception {
		TemAnpNacional temAnpNacional		= new TemAnpNacional();
		BeanUtils.copyProperties(temAnpNacionalDto, temAnpNacional);
		return temAnpNacionalMapper.selectByPrimaryKeyGeometry(temAnpNacional);
	}
	
	@Transactional
	public Integer guardar(TemAnpNacionalDto temAnpNacionalDto) throws Exception {
		TemAnpNacional temAnpNacional		= new TemAnpNacional();
		BeanUtils.copyProperties(temAnpNacionalDto, temAnpNacional);
		int rs	= 0;
		TemAnpNacional exiteTemAnpNacional		= temAnpNacionalMapper.selectByPrimaryKey(temAnpNacional);
		if(exiteTemAnpNacional != null) {
			rs	= temAnpNacionalMapper.updateByPrimaryKeySelective(temAnpNacional);
		} else {
			rs	= temAnpNacionalMapper.insertSelective(temAnpNacional);
			
			Integer srlGid	= temAnpNacionalMapper.lastSequence();
			temAnpNacionalDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemAnpNacionalDto temAnpNacionalDto) throws Exception {
		TemAnpNacional temAnpNacional		= new TemAnpNacional();
		BeanUtils.copyProperties(temAnpNacionalDto, temAnpNacional);
		Integer rs	= temAnpNacionalMapper.deleteByPrimaryKey(temAnpNacional);
		return rs;
	}
	
}
