package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.BasViasRedVialVecinalDto;
import wcmc.hef.business.core.capa.service.BasViasRedVialVecinalService;
import wcmc.hef.dao.capa.domain.BasViasRedVialVecinal;
import wcmc.hef.dao.capa.domain.BasViasRedVialVecinalParamDef;
import wcmc.hef.dao.capa.domain.BasViasRedVialVecinalParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.BasViasRedVialVecinalMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class BasViasRedVialVecinalServiceImpl implements BasViasRedVialVecinalService {
	@Autowired
	private BasViasRedVialVecinalMapper basViasRedVialVecinalMapper;
	public List<BasViasRedVialVecinal> buscar(BasViasRedVialVecinalDto basViasRedVialVecinalDto) throws Exception {
		BasViasRedVialVecinalParamDef basViasRedVialVecinalParamDef		= new BasViasRedVialVecinalParamDef();
		
		Criteria criteria		= basViasRedVialVecinalParamDef.createCriteria();
		if(basViasRedVialVecinalDto != null) {
			if(CadenaUtil.getStrNull(basViasRedVialVecinalDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(basViasRedVialVecinalDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(basViasRedVialVecinalDto.getStrProvinc()) != null) {
				criteria.andStrProvincEqualTo(basViasRedVialVecinalDto.getStrProvinc());
			}
			if(CadenaUtil.getStrNull(basViasRedVialVecinalDto.getStrRuta()) != null) {
				criteria.andStrRutaEqualTo(basViasRedVialVecinalDto.getStrRuta());
			}
			if(CadenaUtil.getStrNull(basViasRedVialVecinalDto.getStrSuperficie()) != null) {
				criteria.andStrSuperficieEqualTo(basViasRedVialVecinalDto.getStrSuperficie());
			}
			basViasRedVialVecinalParamDef.setStrHashConsulta(basViasRedVialVecinalDto.getStrHashConsulta());
		}
		
		basViasRedVialVecinalParamDef.setOrderByClause("de_ruta");
		List<BasViasRedVialVecinal>	 list	= basViasRedVialVecinalMapper.selectByDefaultParameter(basViasRedVialVecinalParamDef);
		return list;
	}
	
	public List<BasViasRedVialVecinal> buscarGeometry(BasViasRedVialVecinalDto basViasRedVialVecinalDto) throws Exception {
		BasViasRedVialVecinalParamDef basViasRedVialVecinalParamDef		= new BasViasRedVialVecinalParamDef();
		
		Criteria criteria		= basViasRedVialVecinalParamDef.createCriteria();
		if(basViasRedVialVecinalDto != null) {
			if(CadenaUtil.getStrNull(basViasRedVialVecinalDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(basViasRedVialVecinalDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(basViasRedVialVecinalDto.getStrProvinc()) != null) {
				criteria.andStrProvincEqualTo(basViasRedVialVecinalDto.getStrProvinc());
			}
			if(CadenaUtil.getStrNull(basViasRedVialVecinalDto.getStrRuta()) != null) {
				criteria.andStrRutaEqualTo(basViasRedVialVecinalDto.getStrRuta());
			}
			if(CadenaUtil.getStrNull(basViasRedVialVecinalDto.getStrSuperficie()) != null) {
				criteria.andStrSuperficieEqualTo(basViasRedVialVecinalDto.getStrSuperficie());
			}
		}
		
		basViasRedVialVecinalParamDef.setOrderByClause("de_ruta");
		List<BasViasRedVialVecinal>	 list	= basViasRedVialVecinalMapper.selectByDefaultParameterGeometry(basViasRedVialVecinalParamDef);
		return list;
	}
	
	public List<BasViasRedVialVecinal> buscarCombo(BasViasRedVialVecinalDto basViasRedVialVecinalDto) throws Exception {
		BasViasRedVialVecinalParamDef basViasRedVialVecinalParamDef		= new BasViasRedVialVecinalParamDef();
		
		Criteria criteria		= basViasRedVialVecinalParamDef.createCriteria();
		if(basViasRedVialVecinalDto != null) {
			if(CadenaUtil.getStrNull(basViasRedVialVecinalDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(basViasRedVialVecinalDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(basViasRedVialVecinalDto.getStrProvinc()) != null) {
				criteria.andStrProvincEqualTo(basViasRedVialVecinalDto.getStrProvinc());
			}
			if(CadenaUtil.getStrNull(basViasRedVialVecinalDto.getStrRuta()) != null) {
				criteria.andStrRutaEqualTo(basViasRedVialVecinalDto.getStrRuta());
			}
			if(CadenaUtil.getStrNull(basViasRedVialVecinalDto.getStrSuperficie()) != null) {
				criteria.andStrSuperficieEqualTo(basViasRedVialVecinalDto.getStrSuperficie());
			}
		}
		
		basViasRedVialVecinalParamDef.setOrderByClause("de_ruta");
		List<BasViasRedVialVecinal>	 list	= basViasRedVialVecinalMapper.selectByDefaultParameterCombo(basViasRedVialVecinalParamDef);
		return list;
	}
	
	public BasViasRedVialVecinal buscarById(BasViasRedVialVecinalDto basViasRedVialVecinalDto) throws Exception {
		BasViasRedVialVecinal basViasRedVialVecinal		= new BasViasRedVialVecinal();
		BeanUtils.copyProperties(basViasRedVialVecinalDto, basViasRedVialVecinal);
		return basViasRedVialVecinalMapper.selectByPrimaryKey(basViasRedVialVecinal);
	}
	
	public BasViasRedVialVecinal buscarGeometryById(BasViasRedVialVecinalDto basViasRedVialVecinalDto) throws Exception {
		BasViasRedVialVecinal basViasRedVialVecinal		= new BasViasRedVialVecinal();
		BeanUtils.copyProperties(basViasRedVialVecinalDto, basViasRedVialVecinal);
		return basViasRedVialVecinalMapper.selectByPrimaryKeyGeometry(basViasRedVialVecinal);
	}
	
	@Transactional
	public Integer guardar(BasViasRedVialVecinalDto basViasRedVialVecinalDto) throws Exception {
		BasViasRedVialVecinal basViasRedVialVecinal		= new BasViasRedVialVecinal();
		BeanUtils.copyProperties(basViasRedVialVecinalDto, basViasRedVialVecinal);
		int rs	= 0;
		BasViasRedVialVecinal exiteBasViasRedVialVecinal		= basViasRedVialVecinalMapper.selectByPrimaryKey(basViasRedVialVecinal);
		if(exiteBasViasRedVialVecinal != null) {
			rs	= basViasRedVialVecinalMapper.updateByPrimaryKeySelective(basViasRedVialVecinal);
		} else {
			rs	= basViasRedVialVecinalMapper.insertSelective(basViasRedVialVecinal);
			
			Integer srlGid	= basViasRedVialVecinalMapper.lastSequence();
			basViasRedVialVecinalDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(BasViasRedVialVecinalDto basViasRedVialVecinalDto) throws Exception {
		BasViasRedVialVecinal basViasRedVialVecinal		= new BasViasRedVialVecinal();
		BeanUtils.copyProperties(basViasRedVialVecinalDto, basViasRedVialVecinal);
		Integer rs	= basViasRedVialVecinalMapper.deleteByPrimaryKey(basViasRedVialVecinal);
		return rs;
	}
	
}
