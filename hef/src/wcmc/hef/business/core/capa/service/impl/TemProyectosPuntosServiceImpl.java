package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemProyectosPuntosDto;
import wcmc.hef.business.core.capa.service.TemProyectosPuntosService;
import wcmc.hef.dao.capa.domain.TemProyectosPuntos;
import wcmc.hef.dao.capa.domain.TemProyectosPuntosParamDef;
import wcmc.hef.dao.capa.domain.TemProyectosPuntosParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemProyectosPuntosMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemProyectosPuntosServiceImpl implements TemProyectosPuntosService {
	@Autowired
	private TemProyectosPuntosMapper temProyectosPuntosMapper;
	public List<TemProyectosPuntos> buscar(TemProyectosPuntosDto temProyectosPuntosDto) throws Exception {
		TemProyectosPuntosParamDef temProyectosPuntosParamDef		= new TemProyectosPuntosParamDef();
		
		Criteria criteria		= temProyectosPuntosParamDef.createCriteria();
		if(temProyectosPuntosDto != null) {
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temProyectosPuntosDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrNombre()) != null) {
				criteria.andStrNombreEqualTo(temProyectosPuntosDto.getStrNombre());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrIniciativa()) != null) {
				criteria.andStrIniciativaEqualTo(temProyectosPuntosDto.getStrIniciativa());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrReferencia()) != null) {
				criteria.andStrReferenciaEqualTo(temProyectosPuntosDto.getStrReferencia());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrRegionGeo()) != null) {
				criteria.andStrRegionGeoEqualTo(temProyectosPuntosDto.getStrRegionGeo());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrDetalleDe()) != null) {
				criteria.andStrDetalleDeEqualTo(temProyectosPuntosDto.getStrDetalleDe());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrOtros()) != null) {
				criteria.andStrOtrosEqualTo(temProyectosPuntosDto.getStrOtros());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrFechaInic()) != null) {
				criteria.andStrFechaInicEqualTo(temProyectosPuntosDto.getStrFechaInic());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrFechaTerm()) != null) {
				criteria.andStrFechaTermEqualTo(temProyectosPuntosDto.getStrFechaTerm());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrResultados()) != null) {
				criteria.andStrResultadosEqualTo(temProyectosPuntosDto.getStrResultados());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrCooperante()) != null) {
				criteria.andStrCooperanteEqualTo(temProyectosPuntosDto.getStrCooperante());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrAdministra()) != null) {
				criteria.andStrAdministraEqualTo(temProyectosPuntosDto.getStrAdministra());
			}
			if(CadenaUtil.getDoubNull(temProyectosPuntosDto.getDblUsd()) != null) {
				criteria.andDblUsdEqualTo(temProyectosPuntosDto.getDblUsd());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrInstitucio()) != null) {
				criteria.andStrInstitucioEqualTo(temProyectosPuntosDto.getStrInstitucio());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrPersonaCo()) != null) {
				criteria.andStrPersonaCoEqualTo(temProyectosPuntosDto.getStrPersonaCo());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrCargo()) != null) {
				criteria.andStrCargoEqualTo(temProyectosPuntosDto.getStrCargo());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrContacto()) != null) {
				criteria.andStrContactoEqualTo(temProyectosPuntosDto.getStrContacto());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrDireccion()) != null) {
				criteria.andStrDireccionEqualTo(temProyectosPuntosDto.getStrDireccion());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrInstituc1()) != null) {
				criteria.andStrInstituc1EqualTo(temProyectosPuntosDto.getStrInstituc1());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrLink()) != null) {
				criteria.andStrLinkEqualTo(temProyectosPuntosDto.getStrLink());
			}
			temProyectosPuntosParamDef.setStrHashConsulta(temProyectosPuntosDto.getStrHashConsulta());
		}
		
		temProyectosPuntosParamDef.setOrderByClause("de_iniciativa");
		List<TemProyectosPuntos>	 list	= temProyectosPuntosMapper.selectByDefaultParameter(temProyectosPuntosParamDef);
		return list;
	}
	
	public List<TemProyectosPuntos> buscarGeometry(TemProyectosPuntosDto temProyectosPuntosDto) throws Exception {
		TemProyectosPuntosParamDef temProyectosPuntosParamDef		= new TemProyectosPuntosParamDef();
		
		Criteria criteria		= temProyectosPuntosParamDef.createCriteria();
		if(temProyectosPuntosDto != null) {
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temProyectosPuntosDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrNombre()) != null) {
				criteria.andStrNombreEqualTo(temProyectosPuntosDto.getStrNombre());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrIniciativa()) != null) {
				criteria.andStrIniciativaEqualTo(temProyectosPuntosDto.getStrIniciativa());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrReferencia()) != null) {
				criteria.andStrReferenciaEqualTo(temProyectosPuntosDto.getStrReferencia());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrRegionGeo()) != null) {
				criteria.andStrRegionGeoEqualTo(temProyectosPuntosDto.getStrRegionGeo());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrDetalleDe()) != null) {
				criteria.andStrDetalleDeEqualTo(temProyectosPuntosDto.getStrDetalleDe());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrOtros()) != null) {
				criteria.andStrOtrosEqualTo(temProyectosPuntosDto.getStrOtros());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrFechaInic()) != null) {
				criteria.andStrFechaInicEqualTo(temProyectosPuntosDto.getStrFechaInic());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrFechaTerm()) != null) {
				criteria.andStrFechaTermEqualTo(temProyectosPuntosDto.getStrFechaTerm());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrResultados()) != null) {
				criteria.andStrResultadosEqualTo(temProyectosPuntosDto.getStrResultados());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrCooperante()) != null) {
				criteria.andStrCooperanteEqualTo(temProyectosPuntosDto.getStrCooperante());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrAdministra()) != null) {
				criteria.andStrAdministraEqualTo(temProyectosPuntosDto.getStrAdministra());
			}
			if(CadenaUtil.getDoubNull(temProyectosPuntosDto.getDblUsd()) != null) {
				criteria.andDblUsdEqualTo(temProyectosPuntosDto.getDblUsd());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrInstitucio()) != null) {
				criteria.andStrInstitucioEqualTo(temProyectosPuntosDto.getStrInstitucio());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrPersonaCo()) != null) {
				criteria.andStrPersonaCoEqualTo(temProyectosPuntosDto.getStrPersonaCo());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrCargo()) != null) {
				criteria.andStrCargoEqualTo(temProyectosPuntosDto.getStrCargo());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrContacto()) != null) {
				criteria.andStrContactoEqualTo(temProyectosPuntosDto.getStrContacto());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrDireccion()) != null) {
				criteria.andStrDireccionEqualTo(temProyectosPuntosDto.getStrDireccion());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrInstituc1()) != null) {
				criteria.andStrInstituc1EqualTo(temProyectosPuntosDto.getStrInstituc1());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrLink()) != null) {
				criteria.andStrLinkEqualTo(temProyectosPuntosDto.getStrLink());
			}
		}
		
		temProyectosPuntosParamDef.setOrderByClause("de_iniciativa");
		List<TemProyectosPuntos>	 list	= temProyectosPuntosMapper.selectByDefaultParameterGeometry(temProyectosPuntosParamDef);
		return list;
	}
	
	public List<TemProyectosPuntos> buscarCombo(TemProyectosPuntosDto temProyectosPuntosDto) throws Exception {
		TemProyectosPuntosParamDef temProyectosPuntosParamDef		= new TemProyectosPuntosParamDef();
		
		Criteria criteria		= temProyectosPuntosParamDef.createCriteria();
		if(temProyectosPuntosDto != null) {
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temProyectosPuntosDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrNombre()) != null) {
				criteria.andStrNombreEqualTo(temProyectosPuntosDto.getStrNombre());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrIniciativa()) != null) {
				criteria.andStrIniciativaEqualTo(temProyectosPuntosDto.getStrIniciativa());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrReferencia()) != null) {
				criteria.andStrReferenciaEqualTo(temProyectosPuntosDto.getStrReferencia());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrRegionGeo()) != null) {
				criteria.andStrRegionGeoEqualTo(temProyectosPuntosDto.getStrRegionGeo());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrDetalleDe()) != null) {
				criteria.andStrDetalleDeEqualTo(temProyectosPuntosDto.getStrDetalleDe());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrOtros()) != null) {
				criteria.andStrOtrosEqualTo(temProyectosPuntosDto.getStrOtros());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrFechaInic()) != null) {
				criteria.andStrFechaInicEqualTo(temProyectosPuntosDto.getStrFechaInic());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrFechaTerm()) != null) {
				criteria.andStrFechaTermEqualTo(temProyectosPuntosDto.getStrFechaTerm());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrResultados()) != null) {
				criteria.andStrResultadosEqualTo(temProyectosPuntosDto.getStrResultados());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrCooperante()) != null) {
				criteria.andStrCooperanteEqualTo(temProyectosPuntosDto.getStrCooperante());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrAdministra()) != null) {
				criteria.andStrAdministraEqualTo(temProyectosPuntosDto.getStrAdministra());
			}
			if(CadenaUtil.getDoubNull(temProyectosPuntosDto.getDblUsd()) != null) {
				criteria.andDblUsdEqualTo(temProyectosPuntosDto.getDblUsd());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrInstitucio()) != null) {
				criteria.andStrInstitucioEqualTo(temProyectosPuntosDto.getStrInstitucio());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrPersonaCo()) != null) {
				criteria.andStrPersonaCoEqualTo(temProyectosPuntosDto.getStrPersonaCo());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrCargo()) != null) {
				criteria.andStrCargoEqualTo(temProyectosPuntosDto.getStrCargo());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrContacto()) != null) {
				criteria.andStrContactoEqualTo(temProyectosPuntosDto.getStrContacto());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrDireccion()) != null) {
				criteria.andStrDireccionEqualTo(temProyectosPuntosDto.getStrDireccion());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrInstituc1()) != null) {
				criteria.andStrInstituc1EqualTo(temProyectosPuntosDto.getStrInstituc1());
			}
			if(CadenaUtil.getStrNull(temProyectosPuntosDto.getStrLink()) != null) {
				criteria.andStrLinkEqualTo(temProyectosPuntosDto.getStrLink());
			}
		}
		
		temProyectosPuntosParamDef.setOrderByClause("de_iniciativa");
		List<TemProyectosPuntos>	 list	= temProyectosPuntosMapper.selectByDefaultParameterCombo(temProyectosPuntosParamDef);
		return list;
	}
	
	public TemProyectosPuntos buscarById(TemProyectosPuntosDto temProyectosPuntosDto) throws Exception {
		TemProyectosPuntos temProyectosPuntos		= new TemProyectosPuntos();
		BeanUtils.copyProperties(temProyectosPuntosDto, temProyectosPuntos);
		return temProyectosPuntosMapper.selectByPrimaryKey(temProyectosPuntos);
	}
	
	public TemProyectosPuntos buscarGeometryById(TemProyectosPuntosDto temProyectosPuntosDto) throws Exception {
		TemProyectosPuntos temProyectosPuntos		= new TemProyectosPuntos();
		BeanUtils.copyProperties(temProyectosPuntosDto, temProyectosPuntos);
		return temProyectosPuntosMapper.selectByPrimaryKeyGeometry(temProyectosPuntos);
	}
	
	@Transactional
	public Integer guardar(TemProyectosPuntosDto temProyectosPuntosDto) throws Exception {
		TemProyectosPuntos temProyectosPuntos		= new TemProyectosPuntos();
		BeanUtils.copyProperties(temProyectosPuntosDto, temProyectosPuntos);
		int rs	= 0;
		TemProyectosPuntos exiteTemProyectosPuntos		= temProyectosPuntosMapper.selectByPrimaryKey(temProyectosPuntos);
		if(exiteTemProyectosPuntos != null) {
			rs	= temProyectosPuntosMapper.updateByPrimaryKeySelective(temProyectosPuntos);
		} else {
			rs	= temProyectosPuntosMapper.insertSelective(temProyectosPuntos);
			
			Integer srlGid	= temProyectosPuntosMapper.lastSequence();
			temProyectosPuntosDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemProyectosPuntosDto temProyectosPuntosDto) throws Exception {
		TemProyectosPuntos temProyectosPuntos		= new TemProyectosPuntos();
		BeanUtils.copyProperties(temProyectosPuntosDto, temProyectosPuntos);
		Integer rs	= temProyectosPuntosMapper.deleteByPrimaryKey(temProyectosPuntos);
		return rs;
	}
	
}
