package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemProyectosPoligonosDto;
import wcmc.hef.business.core.capa.service.TemProyectosPoligonosService;
import wcmc.hef.dao.capa.domain.TemProyectosPoligonos;
import wcmc.hef.dao.capa.domain.TemProyectosPoligonosParamDef;
import wcmc.hef.dao.capa.domain.TemProyectosPoligonosParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemProyectosPoligonosMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemProyectosPoligonosServiceImpl implements TemProyectosPoligonosService {
	@Autowired
	private TemProyectosPoligonosMapper temProyectosPoligonosMapper;
	public List<TemProyectosPoligonos> buscar(TemProyectosPoligonosDto temProyectosPoligonosDto) throws Exception {
		TemProyectosPoligonosParamDef temProyectosPoligonosParamDef		= new TemProyectosPoligonosParamDef();
		
		Criteria criteria		= temProyectosPoligonosParamDef.createCriteria();
		if(temProyectosPoligonosDto != null) {
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temProyectosPoligonosDto.getStrTheGeom());
			}
			if(CadenaUtil.getDoubNull(temProyectosPoligonosDto.getDblShCodigo()) != null) {
				criteria.andDblShCodigoEqualTo(temProyectosPoligonosDto.getDblShCodigo());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrFcComun()) != null) {
				criteria.andStrFcComunEqualTo(temProyectosPoligonosDto.getStrFcComun());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrProyecto()) != null) {
				criteria.andStrProyectoEqualTo(temProyectosPoligonosDto.getStrProyecto());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrInicProg()) != null) {
				criteria.andStrInicProgEqualTo(temProyectosPoligonosDto.getStrInicProg());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrReferencia()) != null) {
				criteria.andStrReferenciaEqualTo(temProyectosPoligonosDto.getStrReferencia());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrDetalleDe()) != null) {
				criteria.andStrDetalleDeEqualTo(temProyectosPoligonosDto.getStrDetalleDe());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrOtros()) != null) {
				criteria.andStrOtrosEqualTo(temProyectosPoligonosDto.getStrOtros());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrMeta()) != null) {
				criteria.andStrMetaEqualTo(temProyectosPoligonosDto.getStrMeta());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrObjetivos()) != null) {
				criteria.andStrObjetivosEqualTo(temProyectosPoligonosDto.getStrObjetivos());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrFechaInic()) != null) {
				criteria.andStrFechaInicEqualTo(temProyectosPoligonosDto.getStrFechaInic());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrFechaTerm()) != null) {
				criteria.andStrFechaTermEqualTo(temProyectosPoligonosDto.getStrFechaTerm());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrTipoDeDa()) != null) {
				criteria.andStrTipoDeDaEqualTo(temProyectosPoligonosDto.getStrTipoDeDa());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrCooperante()) != null) {
				criteria.andStrCooperanteEqualTo(temProyectosPoligonosDto.getStrCooperante());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrAdministra()) != null) {
				criteria.andStrAdministraEqualTo(temProyectosPoligonosDto.getStrAdministra());
			}
			if(CadenaUtil.getDoubNull(temProyectosPoligonosDto.getDblUsd()) != null) {
				criteria.andDblUsdEqualTo(temProyectosPoligonosDto.getDblUsd());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrInstitucio()) != null) {
				criteria.andStrInstitucioEqualTo(temProyectosPoligonosDto.getStrInstitucio());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrPersonaCo()) != null) {
				criteria.andStrPersonaCoEqualTo(temProyectosPoligonosDto.getStrPersonaCo());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrCargo()) != null) {
				criteria.andStrCargoEqualTo(temProyectosPoligonosDto.getStrCargo());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrContacto()) != null) {
				criteria.andStrContactoEqualTo(temProyectosPoligonosDto.getStrContacto());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrDireccion()) != null) {
				criteria.andStrDireccionEqualTo(temProyectosPoligonosDto.getStrDireccion());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrInstituc1()) != null) {
				criteria.andStrInstituc1EqualTo(temProyectosPoligonosDto.getStrInstituc1());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrObs()) != null) {
				criteria.andStrObsEqualTo(temProyectosPoligonosDto.getStrObs());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrLink()) != null) {
				criteria.andStrLinkEqualTo(temProyectosPoligonosDto.getStrLink());
			}
		}
		
		temProyectosPoligonosParamDef.setOrderByClause("de_inic_prog_");
		List<TemProyectosPoligonos>	 list	= temProyectosPoligonosMapper.selectByDefaultParameter(temProyectosPoligonosParamDef);
		return list;
	}
	
	public List<TemProyectosPoligonos> buscarGeometry(TemProyectosPoligonosDto temProyectosPoligonosDto) throws Exception {
		TemProyectosPoligonosParamDef temProyectosPoligonosParamDef		= new TemProyectosPoligonosParamDef();
		
		Criteria criteria		= temProyectosPoligonosParamDef.createCriteria();
		if(temProyectosPoligonosDto != null) {
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temProyectosPoligonosDto.getStrTheGeom());
			}
			if(CadenaUtil.getDoubNull(temProyectosPoligonosDto.getDblShCodigo()) != null) {
				criteria.andDblShCodigoEqualTo(temProyectosPoligonosDto.getDblShCodigo());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrFcComun()) != null) {
				criteria.andStrFcComunEqualTo(temProyectosPoligonosDto.getStrFcComun());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrProyecto()) != null) {
				criteria.andStrProyectoEqualTo(temProyectosPoligonosDto.getStrProyecto());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrInicProg()) != null) {
				criteria.andStrInicProgEqualTo(temProyectosPoligonosDto.getStrInicProg());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrReferencia()) != null) {
				criteria.andStrReferenciaEqualTo(temProyectosPoligonosDto.getStrReferencia());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrDetalleDe()) != null) {
				criteria.andStrDetalleDeEqualTo(temProyectosPoligonosDto.getStrDetalleDe());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrOtros()) != null) {
				criteria.andStrOtrosEqualTo(temProyectosPoligonosDto.getStrOtros());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrMeta()) != null) {
				criteria.andStrMetaEqualTo(temProyectosPoligonosDto.getStrMeta());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrObjetivos()) != null) {
				criteria.andStrObjetivosEqualTo(temProyectosPoligonosDto.getStrObjetivos());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrFechaInic()) != null) {
				criteria.andStrFechaInicEqualTo(temProyectosPoligonosDto.getStrFechaInic());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrFechaTerm()) != null) {
				criteria.andStrFechaTermEqualTo(temProyectosPoligonosDto.getStrFechaTerm());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrTipoDeDa()) != null) {
				criteria.andStrTipoDeDaEqualTo(temProyectosPoligonosDto.getStrTipoDeDa());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrCooperante()) != null) {
				criteria.andStrCooperanteEqualTo(temProyectosPoligonosDto.getStrCooperante());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrAdministra()) != null) {
				criteria.andStrAdministraEqualTo(temProyectosPoligonosDto.getStrAdministra());
			}
			if(CadenaUtil.getDoubNull(temProyectosPoligonosDto.getDblUsd()) != null) {
				criteria.andDblUsdEqualTo(temProyectosPoligonosDto.getDblUsd());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrInstitucio()) != null) {
				criteria.andStrInstitucioEqualTo(temProyectosPoligonosDto.getStrInstitucio());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrPersonaCo()) != null) {
				criteria.andStrPersonaCoEqualTo(temProyectosPoligonosDto.getStrPersonaCo());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrCargo()) != null) {
				criteria.andStrCargoEqualTo(temProyectosPoligonosDto.getStrCargo());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrContacto()) != null) {
				criteria.andStrContactoEqualTo(temProyectosPoligonosDto.getStrContacto());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrDireccion()) != null) {
				criteria.andStrDireccionEqualTo(temProyectosPoligonosDto.getStrDireccion());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrInstituc1()) != null) {
				criteria.andStrInstituc1EqualTo(temProyectosPoligonosDto.getStrInstituc1());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrObs()) != null) {
				criteria.andStrObsEqualTo(temProyectosPoligonosDto.getStrObs());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrLink()) != null) {
				criteria.andStrLinkEqualTo(temProyectosPoligonosDto.getStrLink());
			}
		}
		
		temProyectosPoligonosParamDef.setOrderByClause("de_inic_prog_");
		List<TemProyectosPoligonos>	 list	= temProyectosPoligonosMapper.selectByDefaultParameterGeometry(temProyectosPoligonosParamDef);
		return list;
	}
	
	public List<TemProyectosPoligonos> buscarCombo(TemProyectosPoligonosDto temProyectosPoligonosDto) throws Exception {
		TemProyectosPoligonosParamDef temProyectosPoligonosParamDef		= new TemProyectosPoligonosParamDef();
		
		Criteria criteria		= temProyectosPoligonosParamDef.createCriteria();
		if(temProyectosPoligonosDto != null) {
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temProyectosPoligonosDto.getStrTheGeom());
			}
			if(CadenaUtil.getDoubNull(temProyectosPoligonosDto.getDblShCodigo()) != null) {
				criteria.andDblShCodigoEqualTo(temProyectosPoligonosDto.getDblShCodigo());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrFcComun()) != null) {
				criteria.andStrFcComunEqualTo(temProyectosPoligonosDto.getStrFcComun());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrProyecto()) != null) {
				criteria.andStrProyectoEqualTo(temProyectosPoligonosDto.getStrProyecto());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrInicProg()) != null) {
				criteria.andStrInicProgEqualTo(temProyectosPoligonosDto.getStrInicProg());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrReferencia()) != null) {
				criteria.andStrReferenciaEqualTo(temProyectosPoligonosDto.getStrReferencia());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrDetalleDe()) != null) {
				criteria.andStrDetalleDeEqualTo(temProyectosPoligonosDto.getStrDetalleDe());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrOtros()) != null) {
				criteria.andStrOtrosEqualTo(temProyectosPoligonosDto.getStrOtros());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrMeta()) != null) {
				criteria.andStrMetaEqualTo(temProyectosPoligonosDto.getStrMeta());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrObjetivos()) != null) {
				criteria.andStrObjetivosEqualTo(temProyectosPoligonosDto.getStrObjetivos());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrFechaInic()) != null) {
				criteria.andStrFechaInicEqualTo(temProyectosPoligonosDto.getStrFechaInic());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrFechaTerm()) != null) {
				criteria.andStrFechaTermEqualTo(temProyectosPoligonosDto.getStrFechaTerm());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrTipoDeDa()) != null) {
				criteria.andStrTipoDeDaEqualTo(temProyectosPoligonosDto.getStrTipoDeDa());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrCooperante()) != null) {
				criteria.andStrCooperanteEqualTo(temProyectosPoligonosDto.getStrCooperante());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrAdministra()) != null) {
				criteria.andStrAdministraEqualTo(temProyectosPoligonosDto.getStrAdministra());
			}
			if(CadenaUtil.getDoubNull(temProyectosPoligonosDto.getDblUsd()) != null) {
				criteria.andDblUsdEqualTo(temProyectosPoligonosDto.getDblUsd());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrInstitucio()) != null) {
				criteria.andStrInstitucioEqualTo(temProyectosPoligonosDto.getStrInstitucio());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrPersonaCo()) != null) {
				criteria.andStrPersonaCoEqualTo(temProyectosPoligonosDto.getStrPersonaCo());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrCargo()) != null) {
				criteria.andStrCargoEqualTo(temProyectosPoligonosDto.getStrCargo());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrContacto()) != null) {
				criteria.andStrContactoEqualTo(temProyectosPoligonosDto.getStrContacto());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrDireccion()) != null) {
				criteria.andStrDireccionEqualTo(temProyectosPoligonosDto.getStrDireccion());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrInstituc1()) != null) {
				criteria.andStrInstituc1EqualTo(temProyectosPoligonosDto.getStrInstituc1());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrObs()) != null) {
				criteria.andStrObsEqualTo(temProyectosPoligonosDto.getStrObs());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrLink()) != null) {
				criteria.andStrLinkEqualTo(temProyectosPoligonosDto.getStrLink());
			}
		}
		
		temProyectosPoligonosParamDef.setOrderByClause("de_inic_prog_");
		List<TemProyectosPoligonos>	 list	= temProyectosPoligonosMapper.selectByDefaultParameterCombo(temProyectosPoligonosParamDef);
		return list;
	}
	
	public TemProyectosPoligonos buscarById(TemProyectosPoligonosDto temProyectosPoligonosDto) throws Exception {
		TemProyectosPoligonos temProyectosPoligonos		= new TemProyectosPoligonos();
		BeanUtils.copyProperties(temProyectosPoligonosDto, temProyectosPoligonos);
		return temProyectosPoligonosMapper.selectByPrimaryKey(temProyectosPoligonos);
	}
	
	public TemProyectosPoligonos buscarGeometryById(TemProyectosPoligonosDto temProyectosPoligonosDto) throws Exception {
		TemProyectosPoligonos temProyectosPoligonos		= new TemProyectosPoligonos();
		BeanUtils.copyProperties(temProyectosPoligonosDto, temProyectosPoligonos);
		return temProyectosPoligonosMapper.selectByPrimaryKeyGeometry(temProyectosPoligonos);
	}
	
	@Transactional
	public Integer guardar(TemProyectosPoligonosDto temProyectosPoligonosDto) throws Exception {
		TemProyectosPoligonos temProyectosPoligonos		= new TemProyectosPoligonos();
		BeanUtils.copyProperties(temProyectosPoligonosDto, temProyectosPoligonos);
		int rs	= 0;
		TemProyectosPoligonos exiteTemProyectosPoligonos		= temProyectosPoligonosMapper.selectByPrimaryKey(temProyectosPoligonos);
		if(exiteTemProyectosPoligonos != null) {
			rs	= temProyectosPoligonosMapper.updateByPrimaryKeySelective(temProyectosPoligonos);
		} else {
			rs	= temProyectosPoligonosMapper.insertSelective(temProyectosPoligonos);
			
			Integer srlGid	= temProyectosPoligonosMapper.lastSequence();
			temProyectosPoligonosDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemProyectosPoligonosDto temProyectosPoligonosDto) throws Exception {
		TemProyectosPoligonos temProyectosPoligonos		= new TemProyectosPoligonos();
		BeanUtils.copyProperties(temProyectosPoligonosDto, temProyectosPoligonos);
		Integer rs	= temProyectosPoligonosMapper.deleteByPrimaryKey(temProyectosPoligonos);
		return rs;
	}
	
}
