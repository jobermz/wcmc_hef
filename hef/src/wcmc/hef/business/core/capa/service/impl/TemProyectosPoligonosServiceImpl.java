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
				criteria.andStrFcComunLike(temProyectosPoligonosDto.getStrFcComun());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrProyecto()) != null) {
				criteria.andStrProyectoLike(temProyectosPoligonosDto.getStrProyecto());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrInicProg()) != null) {
				criteria.andStrInicProgLike(temProyectosPoligonosDto.getStrInicProg());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrReferencia()) != null) {
				criteria.andStrReferenciaLike(temProyectosPoligonosDto.getStrReferencia());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrDetalleDe()) != null) {
				criteria.andStrDetalleDeLike(temProyectosPoligonosDto.getStrDetalleDe());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrOtros()) != null) {
				criteria.andStrOtrosLike(temProyectosPoligonosDto.getStrOtros());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrMeta()) != null) {
				criteria.andStrMetaLike(temProyectosPoligonosDto.getStrMeta());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrObjetivos()) != null) {
				criteria.andStrObjetivosLike(temProyectosPoligonosDto.getStrObjetivos());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrFechaInic()) != null) {
				criteria.andStrFechaInicLike(temProyectosPoligonosDto.getStrFechaInic());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrFechaTerm()) != null) {
				criteria.andStrFechaTermLike(temProyectosPoligonosDto.getStrFechaTerm());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrTipoDeDa()) != null) {
				criteria.andStrTipoDeDaLike(temProyectosPoligonosDto.getStrTipoDeDa());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrCooperante()) != null) {
				criteria.andStrCooperanteLike(temProyectosPoligonosDto.getStrCooperante());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrAdministra()) != null) {
				criteria.andStrAdministraLike(temProyectosPoligonosDto.getStrAdministra());
			}
			if(CadenaUtil.getDoubNull(temProyectosPoligonosDto.getDblUsd()) != null) {
				criteria.andDblUsdEqualTo(temProyectosPoligonosDto.getDblUsd());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrInstitucio()) != null) {
				criteria.andStrInstitucioLike(temProyectosPoligonosDto.getStrInstitucio());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrPersonaCo()) != null) {
				criteria.andStrPersonaCoLike(temProyectosPoligonosDto.getStrPersonaCo());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrCargo()) != null) {
				criteria.andStrCargoLike(temProyectosPoligonosDto.getStrCargo());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrContacto()) != null) {
				criteria.andStrContactoLike(temProyectosPoligonosDto.getStrContacto());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrDireccion()) != null) {
				criteria.andStrDireccionLike(temProyectosPoligonosDto.getStrDireccion());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrInstituc1()) != null) {
				criteria.andStrInstituc1Like(temProyectosPoligonosDto.getStrInstituc1());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrObs()) != null) {
				criteria.andStrObsLike(temProyectosPoligonosDto.getStrObs());
			}
			if(CadenaUtil.getStrNull(temProyectosPoligonosDto.getStrLink()) != null) {
				criteria.andStrLinkLike(temProyectosPoligonosDto.getStrLink());
			}
		}
		
		List<TemProyectosPoligonos>	 list	= temProyectosPoligonosMapper.selectByDefaultParameter(temProyectosPoligonosParamDef);
		return list;
	}
	
	public TemProyectosPoligonos buscarById(TemProyectosPoligonosDto temProyectosPoligonosDto) throws Exception {
		TemProyectosPoligonos temProyectosPoligonos		= new TemProyectosPoligonos();
		BeanUtils.copyProperties(temProyectosPoligonosDto, temProyectosPoligonos);
		return temProyectosPoligonosMapper.selectByPrimaryKey(temProyectosPoligonos);
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
