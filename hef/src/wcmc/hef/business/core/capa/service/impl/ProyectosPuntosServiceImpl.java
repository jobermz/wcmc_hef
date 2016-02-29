package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.ProyectosPuntosDto;
import wcmc.hef.business.core.capa.service.ProyectosPuntosService;
import wcmc.hef.dao.capa.domain.ProyectosPuntos;
import wcmc.hef.dao.capa.domain.ProyectosPuntosParamDef;
import wcmc.hef.dao.capa.domain.ProyectosPuntosParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.ProyectosPuntosMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class ProyectosPuntosServiceImpl implements ProyectosPuntosService {
	@Autowired
	private ProyectosPuntosMapper proyectosPuntosMapper;
	public List<ProyectosPuntos> buscar(ProyectosPuntosDto proyectosPuntosDto) throws Exception {
		ProyectosPuntosParamDef proyectosPuntosParamDef		= new ProyectosPuntosParamDef();
		
		Criteria criteria		= proyectosPuntosParamDef.createCriteria();
		if(proyectosPuntosDto != null) {
			if(CadenaUtil.getStrNull(proyectosPuntosDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(proyectosPuntosDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(proyectosPuntosDto.getStrNombre()) != null) {
				criteria.andStrNombreLike(proyectosPuntosDto.getStrNombre());
			}
			if(CadenaUtil.getStrNull(proyectosPuntosDto.getStrIniciativa()) != null) {
				criteria.andStrIniciativaLike(proyectosPuntosDto.getStrIniciativa());
			}
			if(CadenaUtil.getStrNull(proyectosPuntosDto.getStrReferencia()) != null) {
				criteria.andStrReferenciaLike(proyectosPuntosDto.getStrReferencia());
			}
			if(CadenaUtil.getStrNull(proyectosPuntosDto.getStrRegionGeo()) != null) {
				criteria.andStrRegionGeoLike(proyectosPuntosDto.getStrRegionGeo());
			}
			if(CadenaUtil.getStrNull(proyectosPuntosDto.getStrDetalleDe()) != null) {
				criteria.andStrDetalleDeLike(proyectosPuntosDto.getStrDetalleDe());
			}
			if(CadenaUtil.getStrNull(proyectosPuntosDto.getStrOtros()) != null) {
				criteria.andStrOtrosLike(proyectosPuntosDto.getStrOtros());
			}
			if(CadenaUtil.getStrNull(proyectosPuntosDto.getStrFechaInic()) != null) {
				criteria.andStrFechaInicLike(proyectosPuntosDto.getStrFechaInic());
			}
			if(CadenaUtil.getStrNull(proyectosPuntosDto.getStrFechaTerm()) != null) {
				criteria.andStrFechaTermLike(proyectosPuntosDto.getStrFechaTerm());
			}
			if(CadenaUtil.getStrNull(proyectosPuntosDto.getStrResultados()) != null) {
				criteria.andStrResultadosLike(proyectosPuntosDto.getStrResultados());
			}
			if(CadenaUtil.getStrNull(proyectosPuntosDto.getStrCooperante()) != null) {
				criteria.andStrCooperanteLike(proyectosPuntosDto.getStrCooperante());
			}
			if(CadenaUtil.getStrNull(proyectosPuntosDto.getStrAdministra()) != null) {
				criteria.andStrAdministraLike(proyectosPuntosDto.getStrAdministra());
			}
			if(CadenaUtil.getDoubNull(proyectosPuntosDto.getDblUsd()) != null) {
				criteria.andDblUsdEqualTo(proyectosPuntosDto.getDblUsd());
			}
			if(CadenaUtil.getStrNull(proyectosPuntosDto.getStrInstitucio()) != null) {
				criteria.andStrInstitucioLike(proyectosPuntosDto.getStrInstitucio());
			}
			if(CadenaUtil.getStrNull(proyectosPuntosDto.getStrPersonaCo()) != null) {
				criteria.andStrPersonaCoLike(proyectosPuntosDto.getStrPersonaCo());
			}
			if(CadenaUtil.getStrNull(proyectosPuntosDto.getStrCargo()) != null) {
				criteria.andStrCargoLike(proyectosPuntosDto.getStrCargo());
			}
			if(CadenaUtil.getStrNull(proyectosPuntosDto.getStrContacto()) != null) {
				criteria.andStrContactoLike(proyectosPuntosDto.getStrContacto());
			}
			if(CadenaUtil.getStrNull(proyectosPuntosDto.getStrDireccion()) != null) {
				criteria.andStrDireccionLike(proyectosPuntosDto.getStrDireccion());
			}
			if(CadenaUtil.getStrNull(proyectosPuntosDto.getStrInstituc1()) != null) {
				criteria.andStrInstituc1Like(proyectosPuntosDto.getStrInstituc1());
			}
			if(CadenaUtil.getStrNull(proyectosPuntosDto.getStrLink()) != null) {
				criteria.andStrLinkLike(proyectosPuntosDto.getStrLink());
			}
		}
		
		List<ProyectosPuntos>	 list	= proyectosPuntosMapper.selectByDefaultParameter(proyectosPuntosParamDef);
		return list;
	}
	
	public ProyectosPuntos buscarById(ProyectosPuntosDto proyectosPuntosDto) throws Exception {
		ProyectosPuntos proyectosPuntos		= new ProyectosPuntos();
		BeanUtils.copyProperties(proyectosPuntosDto, proyectosPuntos);
		return proyectosPuntosMapper.selectByPrimaryKey(proyectosPuntos);
	}
	
	@Transactional
	public Integer guardar(ProyectosPuntosDto proyectosPuntosDto) throws Exception {
		ProyectosPuntos proyectosPuntos		= new ProyectosPuntos();
		BeanUtils.copyProperties(proyectosPuntosDto, proyectosPuntos);
		int rs	= 0;
		ProyectosPuntos exiteProyectosPuntos		= proyectosPuntosMapper.selectByPrimaryKey(proyectosPuntos);
		if(exiteProyectosPuntos != null) {
			rs	= proyectosPuntosMapper.updateByPrimaryKeySelective(proyectosPuntos);
		} else {
			rs	= proyectosPuntosMapper.insertSelective(proyectosPuntos);
			
			Integer srlGid	= proyectosPuntosMapper.lastSequence();
			proyectosPuntosDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(ProyectosPuntosDto proyectosPuntosDto) throws Exception {
		ProyectosPuntos proyectosPuntos		= new ProyectosPuntos();
		BeanUtils.copyProperties(proyectosPuntosDto, proyectosPuntos);
		Integer rs	= proyectosPuntosMapper.deleteByPrimaryKey(proyectosPuntos);
		return rs;
	}
	
}
