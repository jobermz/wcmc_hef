package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.ConcesionesMinerasDto;
import wcmc.hef.business.core.capa.service.ConcesionesMinerasService;
import wcmc.hef.dao.capa.domain.ConcesionesMineras;
import wcmc.hef.dao.capa.domain.ConcesionesMinerasParamDef;
import wcmc.hef.dao.capa.domain.ConcesionesMinerasParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.ConcesionesMinerasMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class ConcesionesMinerasServiceImpl implements ConcesionesMinerasService {
	@Autowired
	private ConcesionesMinerasMapper concesionesMinerasMapper;
	public List<ConcesionesMineras> buscar(ConcesionesMinerasDto concesionesMinerasDto) throws Exception {
		ConcesionesMinerasParamDef concesionesMinerasParamDef		= new ConcesionesMinerasParamDef();
		
		Criteria criteria		= concesionesMinerasParamDef.createCriteria();
		if(concesionesMinerasDto != null) {
			if(CadenaUtil.getStrNull(concesionesMinerasDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(concesionesMinerasDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(concesionesMinerasDto.getIntObjectid1()) != null) {
				criteria.andIntObjectid1EqualTo(concesionesMinerasDto.getIntObjectid1());
			}
			if(CadenaUtil.getStrNull(concesionesMinerasDto.getStrGmlId()) != null) {
				criteria.andStrGmlIdLike(concesionesMinerasDto.getStrGmlId());
			}
			if(CadenaUtil.getInteNull(concesionesMinerasDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(concesionesMinerasDto.getIntObjectid());
			}
			if(CadenaUtil.getStrNull(concesionesMinerasDto.getStrCodigou()) != null) {
				criteria.andStrCodigouLike(concesionesMinerasDto.getStrCodigou());
			}
			if(CadenaUtil.getStrNull(concesionesMinerasDto.getStrZona()) != null) {
				criteria.andStrZonaLike(concesionesMinerasDto.getStrZona());
			}
			if(CadenaUtil.getStrNull(concesionesMinerasDto.getStrConcesion()) != null) {
				criteria.andStrConcesionLike(concesionesMinerasDto.getStrConcesion());
			}
			if(CadenaUtil.getStrNull(concesionesMinerasDto.getStrEstado()) != null) {
				criteria.andStrEstadoLike(concesionesMinerasDto.getStrEstado());
			}
			if(CadenaUtil.getStrNull(concesionesMinerasDto.getStrTitConces()) != null) {
				criteria.andStrTitConcesLike(concesionesMinerasDto.getStrTitConces());
			}
			if(CadenaUtil.getStrNull(concesionesMinerasDto.getStrNaturaleza()) != null) {
				criteria.andStrNaturalezaLike(concesionesMinerasDto.getStrNaturaleza());
			}
			if(CadenaUtil.getStrNull(concesionesMinerasDto.getStrFecDenu()) != null) {
				criteria.andStrFecDenuLike(concesionesMinerasDto.getStrFecDenu());
			}
			if(CadenaUtil.getDoubNull(concesionesMinerasDto.getDblHectarea()) != null) {
				criteria.andDblHectareaEqualTo(concesionesMinerasDto.getDblHectarea());
			}
			if(CadenaUtil.getStrNull(concesionesMinerasDto.getStrCarta()) != null) {
				criteria.andStrCartaLike(concesionesMinerasDto.getStrCarta());
			}
			if(CadenaUtil.getStrNull(concesionesMinerasDto.getStrNmDist()) != null) {
				criteria.andStrNmDistLike(concesionesMinerasDto.getStrNmDist());
			}
			if(CadenaUtil.getStrNull(concesionesMinerasDto.getStrNmProv()) != null) {
				criteria.andStrNmProvLike(concesionesMinerasDto.getStrNmProv());
			}
			if(CadenaUtil.getStrNull(concesionesMinerasDto.getStrNmDepa()) != null) {
				criteria.andStrNmDepaLike(concesionesMinerasDto.getStrNmDepa());
			}
			if(CadenaUtil.getDoubNull(concesionesMinerasDto.getDblShapeStar()) != null) {
				criteria.andDblShapeStarEqualTo(concesionesMinerasDto.getDblShapeStar());
			}
			if(CadenaUtil.getDoubNull(concesionesMinerasDto.getDblShapeStle()) != null) {
				criteria.andDblShapeStleEqualTo(concesionesMinerasDto.getDblShapeStle());
			}
		}
		
		List<ConcesionesMineras>	 list	= concesionesMinerasMapper.selectByDefaultParameter(concesionesMinerasParamDef);
		return list;
	}
	
	public ConcesionesMineras buscarById(ConcesionesMinerasDto concesionesMinerasDto) throws Exception {
		ConcesionesMineras concesionesMineras		= new ConcesionesMineras();
		BeanUtils.copyProperties(concesionesMinerasDto, concesionesMineras);
		return concesionesMinerasMapper.selectByPrimaryKey(concesionesMineras);
	}
	
	@Transactional
	public Integer guardar(ConcesionesMinerasDto concesionesMinerasDto) throws Exception {
		ConcesionesMineras concesionesMineras		= new ConcesionesMineras();
		BeanUtils.copyProperties(concesionesMinerasDto, concesionesMineras);
		int rs	= 0;
		ConcesionesMineras exiteConcesionesMineras		= concesionesMinerasMapper.selectByPrimaryKey(concesionesMineras);
		if(exiteConcesionesMineras != null) {
			rs	= concesionesMinerasMapper.updateByPrimaryKeySelective(concesionesMineras);
		} else {
			rs	= concesionesMinerasMapper.insertSelective(concesionesMineras);
			
			Integer srlGid	= concesionesMinerasMapper.lastSequence();
			concesionesMinerasDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(ConcesionesMinerasDto concesionesMinerasDto) throws Exception {
		ConcesionesMineras concesionesMineras		= new ConcesionesMineras();
		BeanUtils.copyProperties(concesionesMinerasDto, concesionesMineras);
		Integer rs	= concesionesMinerasMapper.deleteByPrimaryKey(concesionesMineras);
		return rs;
	}
	
}
