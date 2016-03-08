package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemSinanpeAmortiguamientoDto;
import wcmc.hef.business.core.capa.service.TemSinanpeAmortiguamientoService;
import wcmc.hef.dao.capa.domain.TemSinanpeAmortiguamiento;
import wcmc.hef.dao.capa.domain.TemSinanpeAmortiguamientoParamDef;
import wcmc.hef.dao.capa.domain.TemSinanpeAmortiguamientoParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemSinanpeAmortiguamientoMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemSinanpeAmortiguamientoServiceImpl implements TemSinanpeAmortiguamientoService {
	@Autowired
	private TemSinanpeAmortiguamientoMapper temSinanpeAmortiguamientoMapper;
	public List<TemSinanpeAmortiguamiento> buscar(TemSinanpeAmortiguamientoDto temSinanpeAmortiguamientoDto) throws Exception {
		TemSinanpeAmortiguamientoParamDef temSinanpeAmortiguamientoParamDef		= new TemSinanpeAmortiguamientoParamDef();
		
		Criteria criteria		= temSinanpeAmortiguamientoParamDef.createCriteria();
		if(temSinanpeAmortiguamientoDto != null) {
			if(CadenaUtil.getStrNull(temSinanpeAmortiguamientoDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temSinanpeAmortiguamientoDto.getStrTheGeom());
			}
			if(CadenaUtil.getLongNull(temSinanpeAmortiguamientoDto.getLngObjectid()) != null) {
				criteria.andLngObjectidEqualTo(temSinanpeAmortiguamientoDto.getLngObjectid());
			}
			if(CadenaUtil.getStrNull(temSinanpeAmortiguamientoDto.getStrZaNomb()) != null) {
				criteria.andStrZaNombLike(temSinanpeAmortiguamientoDto.getStrZaNomb());
			}
			if(CadenaUtil.getStrNull(temSinanpeAmortiguamientoDto.getStrZaBale()) != null) {
				criteria.andStrZaBaleLike(temSinanpeAmortiguamientoDto.getStrZaBale());
			}
			if(temSinanpeAmortiguamientoDto.getDteZaFecr() != null) {
				criteria.andDteZaFecrEqualTo(temSinanpeAmortiguamientoDto.getDteZaFecr());
			}
		}
		
		List<TemSinanpeAmortiguamiento>	 list	= temSinanpeAmortiguamientoMapper.selectByDefaultParameter(temSinanpeAmortiguamientoParamDef);
		return list;
	}
	
		public List<TemSinanpeAmortiguamiento> buscarGeometry(TemSinanpeAmortiguamientoDto temSinanpeAmortiguamientoDto) throws Exception {
		TemSinanpeAmortiguamientoParamDef temSinanpeAmortiguamientoParamDef		= new TemSinanpeAmortiguamientoParamDef();
		
		Criteria criteria		= temSinanpeAmortiguamientoParamDef.createCriteria();
		if(temSinanpeAmortiguamientoDto != null) {
			if(CadenaUtil.getStrNull(temSinanpeAmortiguamientoDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temSinanpeAmortiguamientoDto.getStrTheGeom());
			}
			if(CadenaUtil.getLongNull(temSinanpeAmortiguamientoDto.getLngObjectid()) != null) {
				criteria.andLngObjectidEqualTo(temSinanpeAmortiguamientoDto.getLngObjectid());
			}
			if(CadenaUtil.getStrNull(temSinanpeAmortiguamientoDto.getStrZaNomb()) != null) {
				criteria.andStrZaNombLike(temSinanpeAmortiguamientoDto.getStrZaNomb());
			}
			if(CadenaUtil.getStrNull(temSinanpeAmortiguamientoDto.getStrZaBale()) != null) {
				criteria.andStrZaBaleLike(temSinanpeAmortiguamientoDto.getStrZaBale());
			}
			if(temSinanpeAmortiguamientoDto.getDteZaFecr() != null) {
				criteria.andDteZaFecrEqualTo(temSinanpeAmortiguamientoDto.getDteZaFecr());
			}
		}
		
		List<TemSinanpeAmortiguamiento>	 list	= temSinanpeAmortiguamientoMapper.selectByDefaultParameterGeometry(temSinanpeAmortiguamientoParamDef);
		return list;
	}
	
	public TemSinanpeAmortiguamiento buscarById(TemSinanpeAmortiguamientoDto temSinanpeAmortiguamientoDto) throws Exception {
		TemSinanpeAmortiguamiento temSinanpeAmortiguamiento		= new TemSinanpeAmortiguamiento();
		BeanUtils.copyProperties(temSinanpeAmortiguamientoDto, temSinanpeAmortiguamiento);
		return temSinanpeAmortiguamientoMapper.selectByPrimaryKey(temSinanpeAmortiguamiento);
	}
	
	@Transactional
	public Integer guardar(TemSinanpeAmortiguamientoDto temSinanpeAmortiguamientoDto) throws Exception {
		TemSinanpeAmortiguamiento temSinanpeAmortiguamiento		= new TemSinanpeAmortiguamiento();
		BeanUtils.copyProperties(temSinanpeAmortiguamientoDto, temSinanpeAmortiguamiento);
		int rs	= 0;
		TemSinanpeAmortiguamiento exiteTemSinanpeAmortiguamiento		= temSinanpeAmortiguamientoMapper.selectByPrimaryKey(temSinanpeAmortiguamiento);
		if(exiteTemSinanpeAmortiguamiento != null) {
			rs	= temSinanpeAmortiguamientoMapper.updateByPrimaryKeySelective(temSinanpeAmortiguamiento);
		} else {
			rs	= temSinanpeAmortiguamientoMapper.insertSelective(temSinanpeAmortiguamiento);
			
			Integer srlGid	= temSinanpeAmortiguamientoMapper.lastSequence();
			temSinanpeAmortiguamientoDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemSinanpeAmortiguamientoDto temSinanpeAmortiguamientoDto) throws Exception {
		TemSinanpeAmortiguamiento temSinanpeAmortiguamiento		= new TemSinanpeAmortiguamiento();
		BeanUtils.copyProperties(temSinanpeAmortiguamientoDto, temSinanpeAmortiguamiento);
		Integer rs	= temSinanpeAmortiguamientoMapper.deleteByPrimaryKey(temSinanpeAmortiguamiento);
		return rs;
	}
	
}
