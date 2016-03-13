package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemSoeconComunidadesCampesinasDto;
import wcmc.hef.business.core.capa.service.TemSoeconComunidadesCampesinasService;
import wcmc.hef.dao.capa.domain.TemSoeconComunidadesCampesinas;
import wcmc.hef.dao.capa.domain.TemSoeconComunidadesCampesinasParamDef;
import wcmc.hef.dao.capa.domain.TemSoeconComunidadesCampesinasParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemSoeconComunidadesCampesinasMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemSoeconComunidadesCampesinasServiceImpl implements TemSoeconComunidadesCampesinasService {
	@Autowired
	private TemSoeconComunidadesCampesinasMapper temSoeconComunidadesCampesinasMapper;
	public List<TemSoeconComunidadesCampesinas> buscar(TemSoeconComunidadesCampesinasDto temSoeconComunidadesCampesinasDto) throws Exception {
		TemSoeconComunidadesCampesinasParamDef temSoeconComunidadesCampesinasParamDef		= new TemSoeconComunidadesCampesinasParamDef();
		
		Criteria criteria		= temSoeconComunidadesCampesinasParamDef.createCriteria();
		if(temSoeconComunidadesCampesinasDto != null) {
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temSoeconComunidadesCampesinasDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(temSoeconComunidadesCampesinasDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(temSoeconComunidadesCampesinasDto.getIntObjectid());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasDto.getStrNombre()) != null) {
				criteria.andStrNombreEqualTo(temSoeconComunidadesCampesinasDto.getStrNombre());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasDto.getStrEstado()) != null) {
				criteria.andStrEstadoEqualTo(temSoeconComunidadesCampesinasDto.getStrEstado());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasDto.getStrResolucion()) != null) {
				criteria.andStrResolucionEqualTo(temSoeconComunidadesCampesinasDto.getStrResolucion());
			}
			if(CadenaUtil.getDoubNull(temSoeconComunidadesCampesinasDto.getDblAreaHa()) != null) {
				criteria.andDblAreaHaEqualTo(temSoeconComunidadesCampesinasDto.getDblAreaHa());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasDto.getStrNomdpto()) != null) {
				criteria.andStrNomdptoEqualTo(temSoeconComunidadesCampesinasDto.getStrNomdpto());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasDto.getStrNomprov()) != null) {
				criteria.andStrNomprovEqualTo(temSoeconComunidadesCampesinasDto.getStrNomprov());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasDto.getStrDistrito()) != null) {
				criteria.andStrDistritoEqualTo(temSoeconComunidadesCampesinasDto.getStrDistrito());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasDto.getStrFechaReso()) != null) {
				criteria.andStrFechaResoEqualTo(temSoeconComunidadesCampesinasDto.getStrFechaReso());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasDto.getStrNTitulo()) != null) {
				criteria.andStrNTituloEqualTo(temSoeconComunidadesCampesinasDto.getStrNTitulo());
			}
			if(CadenaUtil.getDoubNull(temSoeconComunidadesCampesinasDto.getDblShapeLeng()) != null) {
				criteria.andDblShapeLengEqualTo(temSoeconComunidadesCampesinasDto.getDblShapeLeng());
			}
			if(CadenaUtil.getDoubNull(temSoeconComunidadesCampesinasDto.getDblShapeArea()) != null) {
				criteria.andDblShapeAreaEqualTo(temSoeconComunidadesCampesinasDto.getDblShapeArea());
			}
		}
		
		temSoeconComunidadesCampesinasParamDef.setOrderByClause("de_nombre");
		List<TemSoeconComunidadesCampesinas>	 list	= temSoeconComunidadesCampesinasMapper.selectByDefaultParameter(temSoeconComunidadesCampesinasParamDef);
		return list;
	}
	
	public List<TemSoeconComunidadesCampesinas> buscarGeometry(TemSoeconComunidadesCampesinasDto temSoeconComunidadesCampesinasDto) throws Exception {
		TemSoeconComunidadesCampesinasParamDef temSoeconComunidadesCampesinasParamDef		= new TemSoeconComunidadesCampesinasParamDef();
		
		Criteria criteria		= temSoeconComunidadesCampesinasParamDef.createCriteria();
		if(temSoeconComunidadesCampesinasDto != null) {
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temSoeconComunidadesCampesinasDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(temSoeconComunidadesCampesinasDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(temSoeconComunidadesCampesinasDto.getIntObjectid());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasDto.getStrNombre()) != null) {
				criteria.andStrNombreEqualTo(temSoeconComunidadesCampesinasDto.getStrNombre());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasDto.getStrEstado()) != null) {
				criteria.andStrEstadoEqualTo(temSoeconComunidadesCampesinasDto.getStrEstado());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasDto.getStrResolucion()) != null) {
				criteria.andStrResolucionEqualTo(temSoeconComunidadesCampesinasDto.getStrResolucion());
			}
			if(CadenaUtil.getDoubNull(temSoeconComunidadesCampesinasDto.getDblAreaHa()) != null) {
				criteria.andDblAreaHaEqualTo(temSoeconComunidadesCampesinasDto.getDblAreaHa());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasDto.getStrNomdpto()) != null) {
				criteria.andStrNomdptoEqualTo(temSoeconComunidadesCampesinasDto.getStrNomdpto());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasDto.getStrNomprov()) != null) {
				criteria.andStrNomprovEqualTo(temSoeconComunidadesCampesinasDto.getStrNomprov());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasDto.getStrDistrito()) != null) {
				criteria.andStrDistritoEqualTo(temSoeconComunidadesCampesinasDto.getStrDistrito());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasDto.getStrFechaReso()) != null) {
				criteria.andStrFechaResoEqualTo(temSoeconComunidadesCampesinasDto.getStrFechaReso());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasDto.getStrNTitulo()) != null) {
				criteria.andStrNTituloEqualTo(temSoeconComunidadesCampesinasDto.getStrNTitulo());
			}
			if(CadenaUtil.getDoubNull(temSoeconComunidadesCampesinasDto.getDblShapeLeng()) != null) {
				criteria.andDblShapeLengEqualTo(temSoeconComunidadesCampesinasDto.getDblShapeLeng());
			}
			if(CadenaUtil.getDoubNull(temSoeconComunidadesCampesinasDto.getDblShapeArea()) != null) {
				criteria.andDblShapeAreaEqualTo(temSoeconComunidadesCampesinasDto.getDblShapeArea());
			}
		}
		
		temSoeconComunidadesCampesinasParamDef.setOrderByClause("de_nombre");
		List<TemSoeconComunidadesCampesinas>	 list	= temSoeconComunidadesCampesinasMapper.selectByDefaultParameterGeometry(temSoeconComunidadesCampesinasParamDef);
		return list;
	}
	
	public List<TemSoeconComunidadesCampesinas> buscarCombo(TemSoeconComunidadesCampesinasDto temSoeconComunidadesCampesinasDto) throws Exception {
		TemSoeconComunidadesCampesinasParamDef temSoeconComunidadesCampesinasParamDef		= new TemSoeconComunidadesCampesinasParamDef();
		
		Criteria criteria		= temSoeconComunidadesCampesinasParamDef.createCriteria();
		if(temSoeconComunidadesCampesinasDto != null) {
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temSoeconComunidadesCampesinasDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(temSoeconComunidadesCampesinasDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(temSoeconComunidadesCampesinasDto.getIntObjectid());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasDto.getStrNombre()) != null) {
				criteria.andStrNombreEqualTo(temSoeconComunidadesCampesinasDto.getStrNombre());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasDto.getStrEstado()) != null) {
				criteria.andStrEstadoEqualTo(temSoeconComunidadesCampesinasDto.getStrEstado());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasDto.getStrResolucion()) != null) {
				criteria.andStrResolucionEqualTo(temSoeconComunidadesCampesinasDto.getStrResolucion());
			}
			if(CadenaUtil.getDoubNull(temSoeconComunidadesCampesinasDto.getDblAreaHa()) != null) {
				criteria.andDblAreaHaEqualTo(temSoeconComunidadesCampesinasDto.getDblAreaHa());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasDto.getStrNomdpto()) != null) {
				criteria.andStrNomdptoEqualTo(temSoeconComunidadesCampesinasDto.getStrNomdpto());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasDto.getStrNomprov()) != null) {
				criteria.andStrNomprovEqualTo(temSoeconComunidadesCampesinasDto.getStrNomprov());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasDto.getStrDistrito()) != null) {
				criteria.andStrDistritoEqualTo(temSoeconComunidadesCampesinasDto.getStrDistrito());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasDto.getStrFechaReso()) != null) {
				criteria.andStrFechaResoEqualTo(temSoeconComunidadesCampesinasDto.getStrFechaReso());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasDto.getStrNTitulo()) != null) {
				criteria.andStrNTituloEqualTo(temSoeconComunidadesCampesinasDto.getStrNTitulo());
			}
			if(CadenaUtil.getDoubNull(temSoeconComunidadesCampesinasDto.getDblShapeLeng()) != null) {
				criteria.andDblShapeLengEqualTo(temSoeconComunidadesCampesinasDto.getDblShapeLeng());
			}
			if(CadenaUtil.getDoubNull(temSoeconComunidadesCampesinasDto.getDblShapeArea()) != null) {
				criteria.andDblShapeAreaEqualTo(temSoeconComunidadesCampesinasDto.getDblShapeArea());
			}
		}
		
		temSoeconComunidadesCampesinasParamDef.setOrderByClause("de_nombre");
		List<TemSoeconComunidadesCampesinas>	 list	= temSoeconComunidadesCampesinasMapper.selectByDefaultParameterCombo(temSoeconComunidadesCampesinasParamDef);
		return list;
	}
	
	public TemSoeconComunidadesCampesinas buscarById(TemSoeconComunidadesCampesinasDto temSoeconComunidadesCampesinasDto) throws Exception {
		TemSoeconComunidadesCampesinas temSoeconComunidadesCampesinas		= new TemSoeconComunidadesCampesinas();
		BeanUtils.copyProperties(temSoeconComunidadesCampesinasDto, temSoeconComunidadesCampesinas);
		return temSoeconComunidadesCampesinasMapper.selectByPrimaryKey(temSoeconComunidadesCampesinas);
	}
	
	public TemSoeconComunidadesCampesinas buscarGeometryById(TemSoeconComunidadesCampesinasDto temSoeconComunidadesCampesinasDto) throws Exception {
		TemSoeconComunidadesCampesinas temSoeconComunidadesCampesinas		= new TemSoeconComunidadesCampesinas();
		BeanUtils.copyProperties(temSoeconComunidadesCampesinasDto, temSoeconComunidadesCampesinas);
		return temSoeconComunidadesCampesinasMapper.selectByPrimaryKeyGeometry(temSoeconComunidadesCampesinas);
	}
	
	@Transactional
	public Integer guardar(TemSoeconComunidadesCampesinasDto temSoeconComunidadesCampesinasDto) throws Exception {
		TemSoeconComunidadesCampesinas temSoeconComunidadesCampesinas		= new TemSoeconComunidadesCampesinas();
		BeanUtils.copyProperties(temSoeconComunidadesCampesinasDto, temSoeconComunidadesCampesinas);
		int rs	= 0;
		TemSoeconComunidadesCampesinas exiteTemSoeconComunidadesCampesinas		= temSoeconComunidadesCampesinasMapper.selectByPrimaryKey(temSoeconComunidadesCampesinas);
		if(exiteTemSoeconComunidadesCampesinas != null) {
			rs	= temSoeconComunidadesCampesinasMapper.updateByPrimaryKeySelective(temSoeconComunidadesCampesinas);
		} else {
			rs	= temSoeconComunidadesCampesinasMapper.insertSelective(temSoeconComunidadesCampesinas);
			
			Integer srlGid	= temSoeconComunidadesCampesinasMapper.lastSequence();
			temSoeconComunidadesCampesinasDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemSoeconComunidadesCampesinasDto temSoeconComunidadesCampesinasDto) throws Exception {
		TemSoeconComunidadesCampesinas temSoeconComunidadesCampesinas		= new TemSoeconComunidadesCampesinas();
		BeanUtils.copyProperties(temSoeconComunidadesCampesinasDto, temSoeconComunidadesCampesinas);
		Integer rs	= temSoeconComunidadesCampesinasMapper.deleteByPrimaryKey(temSoeconComunidadesCampesinas);
		return rs;
	}
	
}
