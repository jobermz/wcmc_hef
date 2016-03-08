package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemConcesionesMinerasDto;
import wcmc.hef.business.core.capa.service.TemConcesionesMinerasService;
import wcmc.hef.dao.capa.domain.TemConcesionesMineras;
import wcmc.hef.dao.capa.domain.TemConcesionesMinerasParamDef;
import wcmc.hef.dao.capa.domain.TemConcesionesMinerasParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemConcesionesMinerasMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemConcesionesMinerasServiceImpl implements TemConcesionesMinerasService {
	@Autowired
	private TemConcesionesMinerasMapper temConcesionesMinerasMapper;
	public List<TemConcesionesMineras> buscar(TemConcesionesMinerasDto temConcesionesMinerasDto) throws Exception {
		TemConcesionesMinerasParamDef temConcesionesMinerasParamDef		= new TemConcesionesMinerasParamDef();
		
		Criteria criteria		= temConcesionesMinerasParamDef.createCriteria();
		if(temConcesionesMinerasDto != null) {
			if(CadenaUtil.getStrNull(temConcesionesMinerasDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temConcesionesMinerasDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(temConcesionesMinerasDto.getIntObjectid1()) != null) {
				criteria.andIntObjectid1EqualTo(temConcesionesMinerasDto.getIntObjectid1());
			}
			if(CadenaUtil.getStrNull(temConcesionesMinerasDto.getStrGmlId()) != null) {
				criteria.andStrGmlIdLike(temConcesionesMinerasDto.getStrGmlId());
			}
			if(CadenaUtil.getInteNull(temConcesionesMinerasDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(temConcesionesMinerasDto.getIntObjectid());
			}
			if(CadenaUtil.getStrNull(temConcesionesMinerasDto.getStrCodigou()) != null) {
				criteria.andStrCodigouLike(temConcesionesMinerasDto.getStrCodigou());
			}
			if(CadenaUtil.getStrNull(temConcesionesMinerasDto.getStrZona()) != null) {
				criteria.andStrZonaLike(temConcesionesMinerasDto.getStrZona());
			}
			if(CadenaUtil.getStrNull(temConcesionesMinerasDto.getStrConcesion()) != null) {
				criteria.andStrConcesionLike(temConcesionesMinerasDto.getStrConcesion());
			}
			if(CadenaUtil.getStrNull(temConcesionesMinerasDto.getStrEstado()) != null) {
				criteria.andStrEstadoLike(temConcesionesMinerasDto.getStrEstado());
			}
			if(CadenaUtil.getStrNull(temConcesionesMinerasDto.getStrTitConces()) != null) {
				criteria.andStrTitConcesLike(temConcesionesMinerasDto.getStrTitConces());
			}
			if(CadenaUtil.getStrNull(temConcesionesMinerasDto.getStrNaturaleza()) != null) {
				criteria.andStrNaturalezaLike(temConcesionesMinerasDto.getStrNaturaleza());
			}
			if(CadenaUtil.getStrNull(temConcesionesMinerasDto.getStrFecDenu()) != null) {
				criteria.andStrFecDenuLike(temConcesionesMinerasDto.getStrFecDenu());
			}
			if(CadenaUtil.getDoubNull(temConcesionesMinerasDto.getDblHectarea()) != null) {
				criteria.andDblHectareaEqualTo(temConcesionesMinerasDto.getDblHectarea());
			}
			if(CadenaUtil.getStrNull(temConcesionesMinerasDto.getStrCarta()) != null) {
				criteria.andStrCartaLike(temConcesionesMinerasDto.getStrCarta());
			}
			if(CadenaUtil.getStrNull(temConcesionesMinerasDto.getStrNmDist()) != null) {
				criteria.andStrNmDistLike(temConcesionesMinerasDto.getStrNmDist());
			}
			if(CadenaUtil.getStrNull(temConcesionesMinerasDto.getStrNmProv()) != null) {
				criteria.andStrNmProvLike(temConcesionesMinerasDto.getStrNmProv());
			}
			if(CadenaUtil.getStrNull(temConcesionesMinerasDto.getStrNmDepa()) != null) {
				criteria.andStrNmDepaLike(temConcesionesMinerasDto.getStrNmDepa());
			}
			if(CadenaUtil.getDoubNull(temConcesionesMinerasDto.getDblShapeStar()) != null) {
				criteria.andDblShapeStarEqualTo(temConcesionesMinerasDto.getDblShapeStar());
			}
			if(CadenaUtil.getDoubNull(temConcesionesMinerasDto.getDblShapeStle()) != null) {
				criteria.andDblShapeStleEqualTo(temConcesionesMinerasDto.getDblShapeStle());
			}
		}
		
		List<TemConcesionesMineras>	 list	= temConcesionesMinerasMapper.selectByDefaultParameter(temConcesionesMinerasParamDef);
		return list;
	}
	
		public List<TemConcesionesMineras> buscarGeometry(TemConcesionesMinerasDto temConcesionesMinerasDto) throws Exception {
		TemConcesionesMinerasParamDef temConcesionesMinerasParamDef		= new TemConcesionesMinerasParamDef();
		
		Criteria criteria		= temConcesionesMinerasParamDef.createCriteria();
		if(temConcesionesMinerasDto != null) {
			if(CadenaUtil.getStrNull(temConcesionesMinerasDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temConcesionesMinerasDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(temConcesionesMinerasDto.getIntObjectid1()) != null) {
				criteria.andIntObjectid1EqualTo(temConcesionesMinerasDto.getIntObjectid1());
			}
			if(CadenaUtil.getStrNull(temConcesionesMinerasDto.getStrGmlId()) != null) {
				criteria.andStrGmlIdLike(temConcesionesMinerasDto.getStrGmlId());
			}
			if(CadenaUtil.getInteNull(temConcesionesMinerasDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(temConcesionesMinerasDto.getIntObjectid());
			}
			if(CadenaUtil.getStrNull(temConcesionesMinerasDto.getStrCodigou()) != null) {
				criteria.andStrCodigouLike(temConcesionesMinerasDto.getStrCodigou());
			}
			if(CadenaUtil.getStrNull(temConcesionesMinerasDto.getStrZona()) != null) {
				criteria.andStrZonaLike(temConcesionesMinerasDto.getStrZona());
			}
			if(CadenaUtil.getStrNull(temConcesionesMinerasDto.getStrConcesion()) != null) {
				criteria.andStrConcesionLike(temConcesionesMinerasDto.getStrConcesion());
			}
			if(CadenaUtil.getStrNull(temConcesionesMinerasDto.getStrEstado()) != null) {
				criteria.andStrEstadoLike(temConcesionesMinerasDto.getStrEstado());
			}
			if(CadenaUtil.getStrNull(temConcesionesMinerasDto.getStrTitConces()) != null) {
				criteria.andStrTitConcesLike(temConcesionesMinerasDto.getStrTitConces());
			}
			if(CadenaUtil.getStrNull(temConcesionesMinerasDto.getStrNaturaleza()) != null) {
				criteria.andStrNaturalezaLike(temConcesionesMinerasDto.getStrNaturaleza());
			}
			if(CadenaUtil.getStrNull(temConcesionesMinerasDto.getStrFecDenu()) != null) {
				criteria.andStrFecDenuLike(temConcesionesMinerasDto.getStrFecDenu());
			}
			if(CadenaUtil.getDoubNull(temConcesionesMinerasDto.getDblHectarea()) != null) {
				criteria.andDblHectareaEqualTo(temConcesionesMinerasDto.getDblHectarea());
			}
			if(CadenaUtil.getStrNull(temConcesionesMinerasDto.getStrCarta()) != null) {
				criteria.andStrCartaLike(temConcesionesMinerasDto.getStrCarta());
			}
			if(CadenaUtil.getStrNull(temConcesionesMinerasDto.getStrNmDist()) != null) {
				criteria.andStrNmDistLike(temConcesionesMinerasDto.getStrNmDist());
			}
			if(CadenaUtil.getStrNull(temConcesionesMinerasDto.getStrNmProv()) != null) {
				criteria.andStrNmProvLike(temConcesionesMinerasDto.getStrNmProv());
			}
			if(CadenaUtil.getStrNull(temConcesionesMinerasDto.getStrNmDepa()) != null) {
				criteria.andStrNmDepaLike(temConcesionesMinerasDto.getStrNmDepa());
			}
			if(CadenaUtil.getDoubNull(temConcesionesMinerasDto.getDblShapeStar()) != null) {
				criteria.andDblShapeStarEqualTo(temConcesionesMinerasDto.getDblShapeStar());
			}
			if(CadenaUtil.getDoubNull(temConcesionesMinerasDto.getDblShapeStle()) != null) {
				criteria.andDblShapeStleEqualTo(temConcesionesMinerasDto.getDblShapeStle());
			}
		}
		
		List<TemConcesionesMineras>	 list	= temConcesionesMinerasMapper.selectByDefaultParameterGeometry(temConcesionesMinerasParamDef);
		return list;
	}
	
	public TemConcesionesMineras buscarById(TemConcesionesMinerasDto temConcesionesMinerasDto) throws Exception {
		TemConcesionesMineras temConcesionesMineras		= new TemConcesionesMineras();
		BeanUtils.copyProperties(temConcesionesMinerasDto, temConcesionesMineras);
		return temConcesionesMinerasMapper.selectByPrimaryKey(temConcesionesMineras);
	}
	
	@Transactional
	public Integer guardar(TemConcesionesMinerasDto temConcesionesMinerasDto) throws Exception {
		TemConcesionesMineras temConcesionesMineras		= new TemConcesionesMineras();
		BeanUtils.copyProperties(temConcesionesMinerasDto, temConcesionesMineras);
		int rs	= 0;
		TemConcesionesMineras exiteTemConcesionesMineras		= temConcesionesMinerasMapper.selectByPrimaryKey(temConcesionesMineras);
		if(exiteTemConcesionesMineras != null) {
			rs	= temConcesionesMinerasMapper.updateByPrimaryKeySelective(temConcesionesMineras);
		} else {
			rs	= temConcesionesMinerasMapper.insertSelective(temConcesionesMineras);
			
			Integer srlGid	= temConcesionesMinerasMapper.lastSequence();
			temConcesionesMinerasDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemConcesionesMinerasDto temConcesionesMinerasDto) throws Exception {
		TemConcesionesMineras temConcesionesMineras		= new TemConcesionesMineras();
		BeanUtils.copyProperties(temConcesionesMinerasDto, temConcesionesMineras);
		Integer rs	= temConcesionesMinerasMapper.deleteByPrimaryKey(temConcesionesMineras);
		return rs;
	}
	
}
