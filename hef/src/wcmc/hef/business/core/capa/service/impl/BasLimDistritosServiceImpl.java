package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.BasLimDistritosDto;
import wcmc.hef.business.core.capa.service.BasLimDistritosService;
import wcmc.hef.dao.capa.domain.BasLimDistritos;
import wcmc.hef.dao.capa.domain.BasLimDistritosParamDef;
import wcmc.hef.dao.capa.domain.BasLimDistritosParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.BasLimDistritosMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class BasLimDistritosServiceImpl implements BasLimDistritosService {
	@Autowired
	private BasLimDistritosMapper basLimDistritosMapper;
	public List<BasLimDistritos> buscar(BasLimDistritosDto basLimDistritosDto) throws Exception {
		BasLimDistritosParamDef basLimDistritosParamDef		= new BasLimDistritosParamDef();
		
		Criteria criteria		= basLimDistritosParamDef.createCriteria();
		if(basLimDistritosDto != null) {
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(basLimDistritosDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrIddpto()) != null) {
				criteria.andStrIddptoEqualTo(basLimDistritosDto.getStrIddpto());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrNombdep()) != null) {
				criteria.andStrNombdepEqualTo(basLimDistritosDto.getStrNombdep());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrIdprov()) != null) {
				criteria.andStrIdprovEqualTo(basLimDistritosDto.getStrIdprov());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrNombprov()) != null) {
				criteria.andStrNombprovEqualTo(basLimDistritosDto.getStrNombprov());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrIddist()) != null) {
				criteria.andStrIddistEqualTo(basLimDistritosDto.getStrIddist());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrNombdist()) != null) {
				criteria.andStrNombdistEqualTo(basLimDistritosDto.getStrNombdist());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrDcto()) != null) {
				criteria.andStrDctoEqualTo(basLimDistritosDto.getStrDcto());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrLey()) != null) {
				criteria.andStrLeyEqualTo(basLimDistritosDto.getStrLey());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrFecha()) != null) {
				criteria.andStrFechaEqualTo(basLimDistritosDto.getStrFecha());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrNomCap()) != null) {
				criteria.andStrNomCapEqualTo(basLimDistritosDto.getStrNomCap());
			}
			if(CadenaUtil.getDoubNull(basLimDistritosDto.getDblSupContin()) != null) {
				criteria.andDblSupContinEqualTo(basLimDistritosDto.getDblSupContin());
			}
			if(CadenaUtil.getDoubNull(basLimDistritosDto.getDblSupInsula()) != null) {
				criteria.andDblSupInsulaEqualTo(basLimDistritosDto.getDblSupInsula());
			}
			if(CadenaUtil.getDoubNull(basLimDistritosDto.getDblSupLacust()) != null) {
				criteria.andDblSupLacustEqualTo(basLimDistritosDto.getDblSupLacust());
			}
			if(CadenaUtil.getDoubNull(basLimDistritosDto.getDblSupInsD()) != null) {
				criteria.andDblSupInsDEqualTo(basLimDistritosDto.getDblSupInsD());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrUbigeo()) != null) {
				criteria.andStrUbigeoEqualTo(basLimDistritosDto.getStrUbigeo());
			}
		}
		
		basLimDistritosParamDef.setOrderByClause("de_nombdep,de_nombprov,de_nombdist");
		List<BasLimDistritos>	 list	= basLimDistritosMapper.selectByDefaultParameter(basLimDistritosParamDef);
		return list;
	}
	
	public List<BasLimDistritos> buscarGeometry(BasLimDistritosDto basLimDistritosDto) throws Exception {
		BasLimDistritosParamDef basLimDistritosParamDef		= new BasLimDistritosParamDef();
		
		Criteria criteria		= basLimDistritosParamDef.createCriteria();
		if(basLimDistritosDto != null) {
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(basLimDistritosDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrIddpto()) != null) {
				criteria.andStrIddptoEqualTo(basLimDistritosDto.getStrIddpto());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrNombdep()) != null) {
				criteria.andStrNombdepEqualTo(basLimDistritosDto.getStrNombdep());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrIdprov()) != null) {
				criteria.andStrIdprovEqualTo(basLimDistritosDto.getStrIdprov());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrNombprov()) != null) {
				criteria.andStrNombprovEqualTo(basLimDistritosDto.getStrNombprov());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrIddist()) != null) {
				criteria.andStrIddistEqualTo(basLimDistritosDto.getStrIddist());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrNombdist()) != null) {
				criteria.andStrNombdistEqualTo(basLimDistritosDto.getStrNombdist());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrDcto()) != null) {
				criteria.andStrDctoEqualTo(basLimDistritosDto.getStrDcto());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrLey()) != null) {
				criteria.andStrLeyEqualTo(basLimDistritosDto.getStrLey());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrFecha()) != null) {
				criteria.andStrFechaEqualTo(basLimDistritosDto.getStrFecha());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrNomCap()) != null) {
				criteria.andStrNomCapEqualTo(basLimDistritosDto.getStrNomCap());
			}
			if(CadenaUtil.getDoubNull(basLimDistritosDto.getDblSupContin()) != null) {
				criteria.andDblSupContinEqualTo(basLimDistritosDto.getDblSupContin());
			}
			if(CadenaUtil.getDoubNull(basLimDistritosDto.getDblSupInsula()) != null) {
				criteria.andDblSupInsulaEqualTo(basLimDistritosDto.getDblSupInsula());
			}
			if(CadenaUtil.getDoubNull(basLimDistritosDto.getDblSupLacust()) != null) {
				criteria.andDblSupLacustEqualTo(basLimDistritosDto.getDblSupLacust());
			}
			if(CadenaUtil.getDoubNull(basLimDistritosDto.getDblSupInsD()) != null) {
				criteria.andDblSupInsDEqualTo(basLimDistritosDto.getDblSupInsD());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrUbigeo()) != null) {
				criteria.andStrUbigeoEqualTo(basLimDistritosDto.getStrUbigeo());
			}
		}
		
		basLimDistritosParamDef.setOrderByClause("de_nombdep,de_nombprov,de_nombdist");
		List<BasLimDistritos>	 list	= basLimDistritosMapper.selectByDefaultParameterGeometry(basLimDistritosParamDef);
		return list;
	}
	
	public List<BasLimDistritos> buscarCombo(BasLimDistritosDto basLimDistritosDto) throws Exception {
		BasLimDistritosParamDef basLimDistritosParamDef		= new BasLimDistritosParamDef();
		
		Criteria criteria		= basLimDistritosParamDef.createCriteria();
		if(basLimDistritosDto != null) {
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(basLimDistritosDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrIddpto()) != null) {
				criteria.andStrIddptoEqualTo(basLimDistritosDto.getStrIddpto());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrNombdep()) != null) {
				criteria.andStrNombdepEqualTo(basLimDistritosDto.getStrNombdep());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrIdprov()) != null) {
				criteria.andStrIdprovEqualTo(basLimDistritosDto.getStrIdprov());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrNombprov()) != null) {
				criteria.andStrNombprovEqualTo(basLimDistritosDto.getStrNombprov());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrIddist()) != null) {
				criteria.andStrIddistEqualTo(basLimDistritosDto.getStrIddist());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrNombdist()) != null) {
				criteria.andStrNombdistEqualTo(basLimDistritosDto.getStrNombdist());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrDcto()) != null) {
				criteria.andStrDctoEqualTo(basLimDistritosDto.getStrDcto());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrLey()) != null) {
				criteria.andStrLeyEqualTo(basLimDistritosDto.getStrLey());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrFecha()) != null) {
				criteria.andStrFechaEqualTo(basLimDistritosDto.getStrFecha());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrNomCap()) != null) {
				criteria.andStrNomCapEqualTo(basLimDistritosDto.getStrNomCap());
			}
			if(CadenaUtil.getDoubNull(basLimDistritosDto.getDblSupContin()) != null) {
				criteria.andDblSupContinEqualTo(basLimDistritosDto.getDblSupContin());
			}
			if(CadenaUtil.getDoubNull(basLimDistritosDto.getDblSupInsula()) != null) {
				criteria.andDblSupInsulaEqualTo(basLimDistritosDto.getDblSupInsula());
			}
			if(CadenaUtil.getDoubNull(basLimDistritosDto.getDblSupLacust()) != null) {
				criteria.andDblSupLacustEqualTo(basLimDistritosDto.getDblSupLacust());
			}
			if(CadenaUtil.getDoubNull(basLimDistritosDto.getDblSupInsD()) != null) {
				criteria.andDblSupInsDEqualTo(basLimDistritosDto.getDblSupInsD());
			}
			if(CadenaUtil.getStrNull(basLimDistritosDto.getStrUbigeo()) != null) {
				criteria.andStrUbigeoEqualTo(basLimDistritosDto.getStrUbigeo());
			}
		}
		
		basLimDistritosParamDef.setOrderByClause("de_nombdep,de_nombprov,de_nombdist");
		List<BasLimDistritos>	 list	= basLimDistritosMapper.selectByDefaultParameterCombo(basLimDistritosParamDef);
		return list;
	}
	
	public BasLimDistritos buscarById(BasLimDistritosDto basLimDistritosDto) throws Exception {
		BasLimDistritos basLimDistritos		= new BasLimDistritos();
		BeanUtils.copyProperties(basLimDistritosDto, basLimDistritos);
		return basLimDistritosMapper.selectByPrimaryKey(basLimDistritos);
	}
	
	public BasLimDistritos buscarGeometryById(BasLimDistritosDto basLimDistritosDto) throws Exception {
		BasLimDistritos basLimDistritos		= new BasLimDistritos();
		BeanUtils.copyProperties(basLimDistritosDto, basLimDistritos);
		return basLimDistritosMapper.selectByPrimaryKeyGeometry(basLimDistritos);
	}
	
	@Transactional
	public Integer guardar(BasLimDistritosDto basLimDistritosDto) throws Exception {
		BasLimDistritos basLimDistritos		= new BasLimDistritos();
		BeanUtils.copyProperties(basLimDistritosDto, basLimDistritos);
		int rs	= 0;
		BasLimDistritos exiteBasLimDistritos		= basLimDistritosMapper.selectByPrimaryKey(basLimDistritos);
		if(exiteBasLimDistritos != null) {
			rs	= basLimDistritosMapper.updateByPrimaryKeySelective(basLimDistritos);
		} else {
			rs	= basLimDistritosMapper.insertSelective(basLimDistritos);
			
			Integer srlGid	= basLimDistritosMapper.lastSequence();
			basLimDistritosDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(BasLimDistritosDto basLimDistritosDto) throws Exception {
		BasLimDistritos basLimDistritos		= new BasLimDistritos();
		BeanUtils.copyProperties(basLimDistritosDto, basLimDistritos);
		Integer rs	= basLimDistritosMapper.deleteByPrimaryKey(basLimDistritos);
		return rs;
	}
	
}
