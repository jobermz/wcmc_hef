package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemSoeconComunidadesCampesinasTotalesDto;
import wcmc.hef.business.core.capa.service.TemSoeconComunidadesCampesinasTotalesService;
import wcmc.hef.dao.capa.domain.TemSoeconComunidadesCampesinasTotales;
import wcmc.hef.dao.capa.domain.TemSoeconComunidadesCampesinasTotalesParamDef;
import wcmc.hef.dao.capa.domain.TemSoeconComunidadesCampesinasTotalesParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemSoeconComunidadesCampesinasTotalesMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemSoeconComunidadesCampesinasTotalesServiceImpl implements TemSoeconComunidadesCampesinasTotalesService {
	@Autowired
	private TemSoeconComunidadesCampesinasTotalesMapper temSoeconComunidadesCampesinasTotalesMapper;
	public List<TemSoeconComunidadesCampesinasTotales> buscar(TemSoeconComunidadesCampesinasTotalesDto temSoeconComunidadesCampesinasTotalesDto) throws Exception {
		TemSoeconComunidadesCampesinasTotalesParamDef temSoeconComunidadesCampesinasTotalesParamDef		= new TemSoeconComunidadesCampesinasTotalesParamDef();
		
		Criteria criteria		= temSoeconComunidadesCampesinasTotalesParamDef.createCriteria();
		if(temSoeconComunidadesCampesinasTotalesDto != null) {
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasTotalesDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(temSoeconComunidadesCampesinasTotalesDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(temSoeconComunidadesCampesinasTotalesDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(temSoeconComunidadesCampesinasTotalesDto.getIntObjectid());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasTotalesDto.getStrNombre()) != null) {
				criteria.andStrNombreLike(temSoeconComunidadesCampesinasTotalesDto.getStrNombre());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasTotalesDto.getStrEstado()) != null) {
				criteria.andStrEstadoLike(temSoeconComunidadesCampesinasTotalesDto.getStrEstado());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasTotalesDto.getStrResolucion()) != null) {
				criteria.andStrResolucionLike(temSoeconComunidadesCampesinasTotalesDto.getStrResolucion());
			}
			if(CadenaUtil.getDoubNull(temSoeconComunidadesCampesinasTotalesDto.getDblAreaHa()) != null) {
				criteria.andDblAreaHaEqualTo(temSoeconComunidadesCampesinasTotalesDto.getDblAreaHa());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasTotalesDto.getStrNomdpto()) != null) {
				criteria.andStrNomdptoLike(temSoeconComunidadesCampesinasTotalesDto.getStrNomdpto());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasTotalesDto.getStrNomprov()) != null) {
				criteria.andStrNomprovLike(temSoeconComunidadesCampesinasTotalesDto.getStrNomprov());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasTotalesDto.getStrDistrito()) != null) {
				criteria.andStrDistritoLike(temSoeconComunidadesCampesinasTotalesDto.getStrDistrito());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasTotalesDto.getStrFechaReso()) != null) {
				criteria.andStrFechaResoLike(temSoeconComunidadesCampesinasTotalesDto.getStrFechaReso());
			}
			if(CadenaUtil.getStrNull(temSoeconComunidadesCampesinasTotalesDto.getStrNTitulo()) != null) {
				criteria.andStrNTituloLike(temSoeconComunidadesCampesinasTotalesDto.getStrNTitulo());
			}
			if(CadenaUtil.getDoubNull(temSoeconComunidadesCampesinasTotalesDto.getDblShapeLeng()) != null) {
				criteria.andDblShapeLengEqualTo(temSoeconComunidadesCampesinasTotalesDto.getDblShapeLeng());
			}
			if(CadenaUtil.getDoubNull(temSoeconComunidadesCampesinasTotalesDto.getDblShapeArea()) != null) {
				criteria.andDblShapeAreaEqualTo(temSoeconComunidadesCampesinasTotalesDto.getDblShapeArea());
			}
		}
		
		List<TemSoeconComunidadesCampesinasTotales>	 list	= temSoeconComunidadesCampesinasTotalesMapper.selectByDefaultParameter(temSoeconComunidadesCampesinasTotalesParamDef);
		return list;
	}
	
	public TemSoeconComunidadesCampesinasTotales buscarById(TemSoeconComunidadesCampesinasTotalesDto temSoeconComunidadesCampesinasTotalesDto) throws Exception {
		TemSoeconComunidadesCampesinasTotales temSoeconComunidadesCampesinasTotales		= new TemSoeconComunidadesCampesinasTotales();
		BeanUtils.copyProperties(temSoeconComunidadesCampesinasTotalesDto, temSoeconComunidadesCampesinasTotales);
		return temSoeconComunidadesCampesinasTotalesMapper.selectByPrimaryKey(temSoeconComunidadesCampesinasTotales);
	}
	
	@Transactional
	public Integer guardar(TemSoeconComunidadesCampesinasTotalesDto temSoeconComunidadesCampesinasTotalesDto) throws Exception {
		TemSoeconComunidadesCampesinasTotales temSoeconComunidadesCampesinasTotales		= new TemSoeconComunidadesCampesinasTotales();
		BeanUtils.copyProperties(temSoeconComunidadesCampesinasTotalesDto, temSoeconComunidadesCampesinasTotales);
		int rs	= 0;
		TemSoeconComunidadesCampesinasTotales exiteTemSoeconComunidadesCampesinasTotales		= temSoeconComunidadesCampesinasTotalesMapper.selectByPrimaryKey(temSoeconComunidadesCampesinasTotales);
		if(exiteTemSoeconComunidadesCampesinasTotales != null) {
			rs	= temSoeconComunidadesCampesinasTotalesMapper.updateByPrimaryKeySelective(temSoeconComunidadesCampesinasTotales);
		} else {
			rs	= temSoeconComunidadesCampesinasTotalesMapper.insertSelective(temSoeconComunidadesCampesinasTotales);
			
			Integer srlGid	= temSoeconComunidadesCampesinasTotalesMapper.lastSequence();
			temSoeconComunidadesCampesinasTotalesDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemSoeconComunidadesCampesinasTotalesDto temSoeconComunidadesCampesinasTotalesDto) throws Exception {
		TemSoeconComunidadesCampesinasTotales temSoeconComunidadesCampesinasTotales		= new TemSoeconComunidadesCampesinasTotales();
		BeanUtils.copyProperties(temSoeconComunidadesCampesinasTotalesDto, temSoeconComunidadesCampesinasTotales);
		Integer rs	= temSoeconComunidadesCampesinasTotalesMapper.deleteByPrimaryKey(temSoeconComunidadesCampesinasTotales);
		return rs;
	}
	
}
