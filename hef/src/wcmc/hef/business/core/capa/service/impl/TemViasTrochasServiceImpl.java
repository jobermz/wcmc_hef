package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemViasTrochasDto;
import wcmc.hef.business.core.capa.service.TemViasTrochasService;
import wcmc.hef.dao.capa.domain.TemViasTrochas;
import wcmc.hef.dao.capa.domain.TemViasTrochasParamDef;
import wcmc.hef.dao.capa.domain.TemViasTrochasParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemViasTrochasMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemViasTrochasServiceImpl implements TemViasTrochasService {
	@Autowired
	private TemViasTrochasMapper temViasTrochasMapper;
	public List<TemViasTrochas> buscar(TemViasTrochasDto temViasTrochasDto) throws Exception {
		TemViasTrochasParamDef temViasTrochasParamDef		= new TemViasTrochasParamDef();
		
		Criteria criteria		= temViasTrochasParamDef.createCriteria();
		if(temViasTrochasDto != null) {
			if(CadenaUtil.getStrNull(temViasTrochasDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temViasTrochasDto.getStrTheGeom());
			}
			if(CadenaUtil.getLongNull(temViasTrochasDto.getLngObjectid()) != null) {
				criteria.andLngObjectidEqualTo(temViasTrochasDto.getLngObjectid());
			}
			if(CadenaUtil.getStrNull(temViasTrochasDto.getStrEstado()) != null) {
				criteria.andStrEstadoLike(temViasTrochasDto.getStrEstado());
			}
			if(CadenaUtil.getStrNull(temViasTrochasDto.getStrDescrip()) != null) {
				criteria.andStrDescripLike(temViasTrochasDto.getStrDescrip());
			}
			if(CadenaUtil.getDoubNull(temViasTrochasDto.getDblShapeLeng()) != null) {
				criteria.andDblShapeLengEqualTo(temViasTrochasDto.getDblShapeLeng());
			}
			if(CadenaUtil.getDoubNull(temViasTrochasDto.getDblStLength()) != null) {
				criteria.andDblStLengthEqualTo(temViasTrochasDto.getDblStLength());
			}
		}
		
		List<TemViasTrochas>	 list	= temViasTrochasMapper.selectByDefaultParameter(temViasTrochasParamDef);
		return list;
	}
	
		public List<TemViasTrochas> buscarGeometry(TemViasTrochasDto temViasTrochasDto) throws Exception {
		TemViasTrochasParamDef temViasTrochasParamDef		= new TemViasTrochasParamDef();
		
		Criteria criteria		= temViasTrochasParamDef.createCriteria();
		if(temViasTrochasDto != null) {
			if(CadenaUtil.getStrNull(temViasTrochasDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temViasTrochasDto.getStrTheGeom());
			}
			if(CadenaUtil.getLongNull(temViasTrochasDto.getLngObjectid()) != null) {
				criteria.andLngObjectidEqualTo(temViasTrochasDto.getLngObjectid());
			}
			if(CadenaUtil.getStrNull(temViasTrochasDto.getStrEstado()) != null) {
				criteria.andStrEstadoLike(temViasTrochasDto.getStrEstado());
			}
			if(CadenaUtil.getStrNull(temViasTrochasDto.getStrDescrip()) != null) {
				criteria.andStrDescripLike(temViasTrochasDto.getStrDescrip());
			}
			if(CadenaUtil.getDoubNull(temViasTrochasDto.getDblShapeLeng()) != null) {
				criteria.andDblShapeLengEqualTo(temViasTrochasDto.getDblShapeLeng());
			}
			if(CadenaUtil.getDoubNull(temViasTrochasDto.getDblStLength()) != null) {
				criteria.andDblStLengthEqualTo(temViasTrochasDto.getDblStLength());
			}
		}
		
		List<TemViasTrochas>	 list	= temViasTrochasMapper.selectByDefaultParameterGeometry(temViasTrochasParamDef);
		return list;
	}
	
	public TemViasTrochas buscarById(TemViasTrochasDto temViasTrochasDto) throws Exception {
		TemViasTrochas temViasTrochas		= new TemViasTrochas();
		BeanUtils.copyProperties(temViasTrochasDto, temViasTrochas);
		return temViasTrochasMapper.selectByPrimaryKey(temViasTrochas);
	}
	
	@Transactional
	public Integer guardar(TemViasTrochasDto temViasTrochasDto) throws Exception {
		TemViasTrochas temViasTrochas		= new TemViasTrochas();
		BeanUtils.copyProperties(temViasTrochasDto, temViasTrochas);
		int rs	= 0;
		TemViasTrochas exiteTemViasTrochas		= temViasTrochasMapper.selectByPrimaryKey(temViasTrochas);
		if(exiteTemViasTrochas != null) {
			rs	= temViasTrochasMapper.updateByPrimaryKeySelective(temViasTrochas);
		} else {
			rs	= temViasTrochasMapper.insertSelective(temViasTrochas);
			
			Integer srlGid	= temViasTrochasMapper.lastSequence();
			temViasTrochasDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemViasTrochasDto temViasTrochasDto) throws Exception {
		TemViasTrochas temViasTrochas		= new TemViasTrochas();
		BeanUtils.copyProperties(temViasTrochasDto, temViasTrochas);
		Integer rs	= temViasTrochasMapper.deleteByPrimaryKey(temViasTrochas);
		return rs;
	}
	
}
