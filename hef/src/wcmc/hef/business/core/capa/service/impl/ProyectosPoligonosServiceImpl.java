package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.ProyectosPoligonosDto;
import wcmc.hef.business.core.capa.service.ProyectosPoligonosService;
import wcmc.hef.dao.capa.domain.ProyectosPoligonos;
import wcmc.hef.dao.capa.domain.ProyectosPoligonosParamDef;
import wcmc.hef.dao.capa.domain.ProyectosPoligonosParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.ProyectosPoligonosMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class ProyectosPoligonosServiceImpl implements ProyectosPoligonosService {
	@Autowired
	private ProyectosPoligonosMapper proyectosPoligonosMapper;
	public List<ProyectosPoligonos> buscar(ProyectosPoligonosDto proyectosPoligonosDto) throws Exception {
		ProyectosPoligonosParamDef proyectosPoligonosParamDef		= new ProyectosPoligonosParamDef();
		
		Criteria criteria		= proyectosPoligonosParamDef.createCriteria();
		if(proyectosPoligonosDto != null) {
			if(CadenaUtil.getStrNull(proyectosPoligonosDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(proyectosPoligonosDto.getStrTheGeom());
			}
			if(CadenaUtil.getDoubNull(proyectosPoligonosDto.getDblShCodigo()) != null) {
				criteria.andDblShCodigoEqualTo(proyectosPoligonosDto.getDblShCodigo());
			}
			if(CadenaUtil.getStrNull(proyectosPoligonosDto.getStrFcComun()) != null) {
				criteria.andStrFcComunLike(proyectosPoligonosDto.getStrFcComun());
			}
			if(CadenaUtil.getStrNull(proyectosPoligonosDto.getStrProyecto()) != null) {
				criteria.andStrProyectoLike(proyectosPoligonosDto.getStrProyecto());
			}
			if(CadenaUtil.getStrNull(proyectosPoligonosDto.getStrInicProg()) != null) {
				criteria.andStrInicProgLike(proyectosPoligonosDto.getStrInicProg());
			}
			if(CadenaUtil.getStrNull(proyectosPoligonosDto.getStrReferencia()) != null) {
				criteria.andStrReferenciaLike(proyectosPoligonosDto.getStrReferencia());
			}
			if(CadenaUtil.getStrNull(proyectosPoligonosDto.getStrDetalleDe()) != null) {
				criteria.andStrDetalleDeLike(proyectosPoligonosDto.getStrDetalleDe());
			}
			if(CadenaUtil.getStrNull(proyectosPoligonosDto.getStrOtros()) != null) {
				criteria.andStrOtrosLike(proyectosPoligonosDto.getStrOtros());
			}
			if(CadenaUtil.getStrNull(proyectosPoligonosDto.getStrMeta()) != null) {
				criteria.andStrMetaLike(proyectosPoligonosDto.getStrMeta());
			}
			if(CadenaUtil.getStrNull(proyectosPoligonosDto.getStrObjetivos()) != null) {
				criteria.andStrObjetivosLike(proyectosPoligonosDto.getStrObjetivos());
			}
			if(CadenaUtil.getStrNull(proyectosPoligonosDto.getStrFechaInic()) != null) {
				criteria.andStrFechaInicLike(proyectosPoligonosDto.getStrFechaInic());
			}
			if(CadenaUtil.getStrNull(proyectosPoligonosDto.getStrFechaTerm()) != null) {
				criteria.andStrFechaTermLike(proyectosPoligonosDto.getStrFechaTerm());
			}
			if(CadenaUtil.getStrNull(proyectosPoligonosDto.getStrTipoDeDa()) != null) {
				criteria.andStrTipoDeDaLike(proyectosPoligonosDto.getStrTipoDeDa());
			}
			if(CadenaUtil.getStrNull(proyectosPoligonosDto.getStrCooperante()) != null) {
				criteria.andStrCooperanteLike(proyectosPoligonosDto.getStrCooperante());
			}
			if(CadenaUtil.getStrNull(proyectosPoligonosDto.getStrAdministra()) != null) {
				criteria.andStrAdministraLike(proyectosPoligonosDto.getStrAdministra());
			}
			if(CadenaUtil.getDoubNull(proyectosPoligonosDto.getDblUsd()) != null) {
				criteria.andDblUsdEqualTo(proyectosPoligonosDto.getDblUsd());
			}
			if(CadenaUtil.getStrNull(proyectosPoligonosDto.getStrInstitucio()) != null) {
				criteria.andStrInstitucioLike(proyectosPoligonosDto.getStrInstitucio());
			}
			if(CadenaUtil.getStrNull(proyectosPoligonosDto.getStrPersonaCo()) != null) {
				criteria.andStrPersonaCoLike(proyectosPoligonosDto.getStrPersonaCo());
			}
			if(CadenaUtil.getStrNull(proyectosPoligonosDto.getStrCargo()) != null) {
				criteria.andStrCargoLike(proyectosPoligonosDto.getStrCargo());
			}
			if(CadenaUtil.getStrNull(proyectosPoligonosDto.getStrContacto()) != null) {
				criteria.andStrContactoLike(proyectosPoligonosDto.getStrContacto());
			}
			if(CadenaUtil.getStrNull(proyectosPoligonosDto.getStrDireccion()) != null) {
				criteria.andStrDireccionLike(proyectosPoligonosDto.getStrDireccion());
			}
			if(CadenaUtil.getStrNull(proyectosPoligonosDto.getStrInstituc1()) != null) {
				criteria.andStrInstituc1Like(proyectosPoligonosDto.getStrInstituc1());
			}
			if(CadenaUtil.getStrNull(proyectosPoligonosDto.getStrObs()) != null) {
				criteria.andStrObsLike(proyectosPoligonosDto.getStrObs());
			}
			if(CadenaUtil.getStrNull(proyectosPoligonosDto.getStrLink()) != null) {
				criteria.andStrLinkLike(proyectosPoligonosDto.getStrLink());
			}
		}
		
		List<ProyectosPoligonos>	 list	= proyectosPoligonosMapper.selectByDefaultParameter(proyectosPoligonosParamDef);
		return list;
	}
	
	public ProyectosPoligonos buscarById(ProyectosPoligonosDto proyectosPoligonosDto) throws Exception {
		ProyectosPoligonos proyectosPoligonos		= new ProyectosPoligonos();
		BeanUtils.copyProperties(proyectosPoligonosDto, proyectosPoligonos);
		return proyectosPoligonosMapper.selectByPrimaryKey(proyectosPoligonos);
	}
	
	@Transactional
	public Integer guardar(ProyectosPoligonosDto proyectosPoligonosDto) throws Exception {
		ProyectosPoligonos proyectosPoligonos		= new ProyectosPoligonos();
		BeanUtils.copyProperties(proyectosPoligonosDto, proyectosPoligonos);
		int rs	= 0;
		ProyectosPoligonos exiteProyectosPoligonos		= proyectosPoligonosMapper.selectByPrimaryKey(proyectosPoligonos);
		if(exiteProyectosPoligonos != null) {
			rs	= proyectosPoligonosMapper.updateByPrimaryKeySelective(proyectosPoligonos);
		} else {
			rs	= proyectosPoligonosMapper.insertSelective(proyectosPoligonos);
			
			Integer srlGid	= proyectosPoligonosMapper.lastSequence();
			proyectosPoligonosDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(ProyectosPoligonosDto proyectosPoligonosDto) throws Exception {
		ProyectosPoligonos proyectosPoligonos		= new ProyectosPoligonos();
		BeanUtils.copyProperties(proyectosPoligonosDto, proyectosPoligonos);
		Integer rs	= proyectosPoligonosMapper.deleteByPrimaryKey(proyectosPoligonos);
		return rs;
	}
	
}
