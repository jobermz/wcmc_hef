package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemConcesionHidroelectricasDistribucionDto;
import wcmc.hef.business.core.capa.service.TemConcesionHidroelectricasDistribucionService;
import wcmc.hef.dao.capa.domain.TemConcesionHidroelectricasDistribucion;
import wcmc.hef.dao.capa.domain.TemConcesionHidroelectricasDistribucionParamDef;
import wcmc.hef.dao.capa.domain.TemConcesionHidroelectricasDistribucionParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemConcesionHidroelectricasDistribucionMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemConcesionHidroelectricasDistribucionServiceImpl implements TemConcesionHidroelectricasDistribucionService {
	@Autowired
	private TemConcesionHidroelectricasDistribucionMapper temConcesionHidroelectricasDistribucionMapper;
	public List<TemConcesionHidroelectricasDistribucion> buscar(TemConcesionHidroelectricasDistribucionDto temConcesionHidroelectricasDistribucionDto) throws Exception {
		TemConcesionHidroelectricasDistribucionParamDef temConcesionHidroelectricasDistribucionParamDef		= new TemConcesionHidroelectricasDistribucionParamDef();
		
		Criteria criteria		= temConcesionHidroelectricasDistribucionParamDef.createCriteria();
		if(temConcesionHidroelectricasDistribucionDto != null) {
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasDistribucionDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temConcesionHidroelectricasDistribucionDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasDistribucionDto.getStrIdGrafico()) != null) {
				criteria.andStrIdGraficoEqualTo(temConcesionHidroelectricasDistribucionDto.getStrIdGrafico());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasDistribucionDto.getStrExpediente()) != null) {
				criteria.andStrExpedienteEqualTo(temConcesionHidroelectricasDistribucionDto.getStrExpediente());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasDistribucionDto.getStrConcesion()) != null) {
				criteria.andStrConcesionEqualTo(temConcesionHidroelectricasDistribucionDto.getStrConcesion());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasDistribucionDto.getStrNombreZon()) != null) {
				criteria.andStrNombreZonEqualTo(temConcesionHidroelectricasDistribucionDto.getStrNombreZon());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasDistribucionDto.getStrTipoConce()) != null) {
				criteria.andStrTipoConceEqualTo(temConcesionHidroelectricasDistribucionDto.getStrTipoConce());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasDistribucionDto.getStrEmpresa()) != null) {
				criteria.andStrEmpresaEqualTo(temConcesionHidroelectricasDistribucionDto.getStrEmpresa());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasDistribucionDto.getStrSistemaEl()) != null) {
				criteria.andStrSistemaElEqualTo(temConcesionHidroelectricasDistribucionDto.getStrSistemaEl());
			}
			if(CadenaUtil.getLongNull(temConcesionHidroelectricasDistribucionDto.getLngAreaInflu()) != null) {
				criteria.andLngAreaInfluEqualTo(temConcesionHidroelectricasDistribucionDto.getLngAreaInflu());
			}
			if(CadenaUtil.getDoubNull(temConcesionHidroelectricasDistribucionDto.getDblMaximaDem()) != null) {
				criteria.andDblMaximaDemEqualTo(temConcesionHidroelectricasDistribucionDto.getDblMaximaDem());
			}
			if(CadenaUtil.getDoubNull(temConcesionHidroelectricasDistribucionDto.getDblHorasServ()) != null) {
				criteria.andDblHorasServEqualTo(temConcesionHidroelectricasDistribucionDto.getDblHorasServ());
			}
			if(CadenaUtil.getLongNull(temConcesionHidroelectricasDistribucionDto.getLngNumeroUsu()) != null) {
				criteria.andLngNumeroUsuEqualTo(temConcesionHidroelectricasDistribucionDto.getLngNumeroUsu());
			}
			if(temConcesionHidroelectricasDistribucionDto.getDteFechaPres() != null) {
				criteria.andDteFechaPresEqualTo(temConcesionHidroelectricasDistribucionDto.getDteFechaPres());
			}
			if(temConcesionHidroelectricasDistribucionDto.getDteFechaReso() != null) {
				criteria.andDteFechaResoEqualTo(temConcesionHidroelectricasDistribucionDto.getDteFechaReso());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasDistribucionDto.getStrActivo()) != null) {
				criteria.andStrActivoEqualTo(temConcesionHidroelectricasDistribucionDto.getStrActivo());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasDistribucionDto.getStrCodigoCon()) != null) {
				criteria.andStrCodigoConEqualTo(temConcesionHidroelectricasDistribucionDto.getStrCodigoCon());
			}
			if(CadenaUtil.getDoubNull(temConcesionHidroelectricasDistribucionDto.getDblShapeArea()) != null) {
				criteria.andDblShapeAreaEqualTo(temConcesionHidroelectricasDistribucionDto.getDblShapeArea());
			}
			if(CadenaUtil.getDoubNull(temConcesionHidroelectricasDistribucionDto.getDblShapeLen()) != null) {
				criteria.andDblShapeLenEqualTo(temConcesionHidroelectricasDistribucionDto.getDblShapeLen());
			}
		}
		
		temConcesionHidroelectricasDistribucionParamDef.setOrderByClause("de_concesion,de_sistema_el");
		List<TemConcesionHidroelectricasDistribucion>	 list	= temConcesionHidroelectricasDistribucionMapper.selectByDefaultParameter(temConcesionHidroelectricasDistribucionParamDef);
		return list;
	}
	
	public List<TemConcesionHidroelectricasDistribucion> buscarGeometry(TemConcesionHidroelectricasDistribucionDto temConcesionHidroelectricasDistribucionDto) throws Exception {
		TemConcesionHidroelectricasDistribucionParamDef temConcesionHidroelectricasDistribucionParamDef		= new TemConcesionHidroelectricasDistribucionParamDef();
		
		Criteria criteria		= temConcesionHidroelectricasDistribucionParamDef.createCriteria();
		if(temConcesionHidroelectricasDistribucionDto != null) {
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasDistribucionDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temConcesionHidroelectricasDistribucionDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasDistribucionDto.getStrIdGrafico()) != null) {
				criteria.andStrIdGraficoEqualTo(temConcesionHidroelectricasDistribucionDto.getStrIdGrafico());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasDistribucionDto.getStrExpediente()) != null) {
				criteria.andStrExpedienteEqualTo(temConcesionHidroelectricasDistribucionDto.getStrExpediente());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasDistribucionDto.getStrConcesion()) != null) {
				criteria.andStrConcesionEqualTo(temConcesionHidroelectricasDistribucionDto.getStrConcesion());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasDistribucionDto.getStrNombreZon()) != null) {
				criteria.andStrNombreZonEqualTo(temConcesionHidroelectricasDistribucionDto.getStrNombreZon());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasDistribucionDto.getStrTipoConce()) != null) {
				criteria.andStrTipoConceEqualTo(temConcesionHidroelectricasDistribucionDto.getStrTipoConce());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasDistribucionDto.getStrEmpresa()) != null) {
				criteria.andStrEmpresaEqualTo(temConcesionHidroelectricasDistribucionDto.getStrEmpresa());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasDistribucionDto.getStrSistemaEl()) != null) {
				criteria.andStrSistemaElEqualTo(temConcesionHidroelectricasDistribucionDto.getStrSistemaEl());
			}
			if(CadenaUtil.getLongNull(temConcesionHidroelectricasDistribucionDto.getLngAreaInflu()) != null) {
				criteria.andLngAreaInfluEqualTo(temConcesionHidroelectricasDistribucionDto.getLngAreaInflu());
			}
			if(CadenaUtil.getDoubNull(temConcesionHidroelectricasDistribucionDto.getDblMaximaDem()) != null) {
				criteria.andDblMaximaDemEqualTo(temConcesionHidroelectricasDistribucionDto.getDblMaximaDem());
			}
			if(CadenaUtil.getDoubNull(temConcesionHidroelectricasDistribucionDto.getDblHorasServ()) != null) {
				criteria.andDblHorasServEqualTo(temConcesionHidroelectricasDistribucionDto.getDblHorasServ());
			}
			if(CadenaUtil.getLongNull(temConcesionHidroelectricasDistribucionDto.getLngNumeroUsu()) != null) {
				criteria.andLngNumeroUsuEqualTo(temConcesionHidroelectricasDistribucionDto.getLngNumeroUsu());
			}
			if(temConcesionHidroelectricasDistribucionDto.getDteFechaPres() != null) {
				criteria.andDteFechaPresEqualTo(temConcesionHidroelectricasDistribucionDto.getDteFechaPres());
			}
			if(temConcesionHidroelectricasDistribucionDto.getDteFechaReso() != null) {
				criteria.andDteFechaResoEqualTo(temConcesionHidroelectricasDistribucionDto.getDteFechaReso());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasDistribucionDto.getStrActivo()) != null) {
				criteria.andStrActivoEqualTo(temConcesionHidroelectricasDistribucionDto.getStrActivo());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasDistribucionDto.getStrCodigoCon()) != null) {
				criteria.andStrCodigoConEqualTo(temConcesionHidroelectricasDistribucionDto.getStrCodigoCon());
			}
			if(CadenaUtil.getDoubNull(temConcesionHidroelectricasDistribucionDto.getDblShapeArea()) != null) {
				criteria.andDblShapeAreaEqualTo(temConcesionHidroelectricasDistribucionDto.getDblShapeArea());
			}
			if(CadenaUtil.getDoubNull(temConcesionHidroelectricasDistribucionDto.getDblShapeLen()) != null) {
				criteria.andDblShapeLenEqualTo(temConcesionHidroelectricasDistribucionDto.getDblShapeLen());
			}
		}
		
		temConcesionHidroelectricasDistribucionParamDef.setOrderByClause("de_concesion,de_sistema_el");
		List<TemConcesionHidroelectricasDistribucion>	 list	= temConcesionHidroelectricasDistribucionMapper.selectByDefaultParameterGeometry(temConcesionHidroelectricasDistribucionParamDef);
		return list;
	}
	
	public List<TemConcesionHidroelectricasDistribucion> buscarCombo(TemConcesionHidroelectricasDistribucionDto temConcesionHidroelectricasDistribucionDto) throws Exception {
		TemConcesionHidroelectricasDistribucionParamDef temConcesionHidroelectricasDistribucionParamDef		= new TemConcesionHidroelectricasDistribucionParamDef();
		
		Criteria criteria		= temConcesionHidroelectricasDistribucionParamDef.createCriteria();
		if(temConcesionHidroelectricasDistribucionDto != null) {
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasDistribucionDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temConcesionHidroelectricasDistribucionDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasDistribucionDto.getStrIdGrafico()) != null) {
				criteria.andStrIdGraficoEqualTo(temConcesionHidroelectricasDistribucionDto.getStrIdGrafico());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasDistribucionDto.getStrExpediente()) != null) {
				criteria.andStrExpedienteEqualTo(temConcesionHidroelectricasDistribucionDto.getStrExpediente());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasDistribucionDto.getStrConcesion()) != null) {
				criteria.andStrConcesionEqualTo(temConcesionHidroelectricasDistribucionDto.getStrConcesion());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasDistribucionDto.getStrNombreZon()) != null) {
				criteria.andStrNombreZonEqualTo(temConcesionHidroelectricasDistribucionDto.getStrNombreZon());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasDistribucionDto.getStrTipoConce()) != null) {
				criteria.andStrTipoConceEqualTo(temConcesionHidroelectricasDistribucionDto.getStrTipoConce());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasDistribucionDto.getStrEmpresa()) != null) {
				criteria.andStrEmpresaEqualTo(temConcesionHidroelectricasDistribucionDto.getStrEmpresa());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasDistribucionDto.getStrSistemaEl()) != null) {
				criteria.andStrSistemaElEqualTo(temConcesionHidroelectricasDistribucionDto.getStrSistemaEl());
			}
			if(CadenaUtil.getLongNull(temConcesionHidroelectricasDistribucionDto.getLngAreaInflu()) != null) {
				criteria.andLngAreaInfluEqualTo(temConcesionHidroelectricasDistribucionDto.getLngAreaInflu());
			}
			if(CadenaUtil.getDoubNull(temConcesionHidroelectricasDistribucionDto.getDblMaximaDem()) != null) {
				criteria.andDblMaximaDemEqualTo(temConcesionHidroelectricasDistribucionDto.getDblMaximaDem());
			}
			if(CadenaUtil.getDoubNull(temConcesionHidroelectricasDistribucionDto.getDblHorasServ()) != null) {
				criteria.andDblHorasServEqualTo(temConcesionHidroelectricasDistribucionDto.getDblHorasServ());
			}
			if(CadenaUtil.getLongNull(temConcesionHidroelectricasDistribucionDto.getLngNumeroUsu()) != null) {
				criteria.andLngNumeroUsuEqualTo(temConcesionHidroelectricasDistribucionDto.getLngNumeroUsu());
			}
			if(temConcesionHidroelectricasDistribucionDto.getDteFechaPres() != null) {
				criteria.andDteFechaPresEqualTo(temConcesionHidroelectricasDistribucionDto.getDteFechaPres());
			}
			if(temConcesionHidroelectricasDistribucionDto.getDteFechaReso() != null) {
				criteria.andDteFechaResoEqualTo(temConcesionHidroelectricasDistribucionDto.getDteFechaReso());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasDistribucionDto.getStrActivo()) != null) {
				criteria.andStrActivoEqualTo(temConcesionHidroelectricasDistribucionDto.getStrActivo());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasDistribucionDto.getStrCodigoCon()) != null) {
				criteria.andStrCodigoConEqualTo(temConcesionHidroelectricasDistribucionDto.getStrCodigoCon());
			}
			if(CadenaUtil.getDoubNull(temConcesionHidroelectricasDistribucionDto.getDblShapeArea()) != null) {
				criteria.andDblShapeAreaEqualTo(temConcesionHidroelectricasDistribucionDto.getDblShapeArea());
			}
			if(CadenaUtil.getDoubNull(temConcesionHidroelectricasDistribucionDto.getDblShapeLen()) != null) {
				criteria.andDblShapeLenEqualTo(temConcesionHidroelectricasDistribucionDto.getDblShapeLen());
			}
		}
		
		temConcesionHidroelectricasDistribucionParamDef.setOrderByClause("de_concesion,de_sistema_el");
		List<TemConcesionHidroelectricasDistribucion>	 list	= temConcesionHidroelectricasDistribucionMapper.selectByDefaultParameterCombo(temConcesionHidroelectricasDistribucionParamDef);
		return list;
	}
	
	public TemConcesionHidroelectricasDistribucion buscarById(TemConcesionHidroelectricasDistribucionDto temConcesionHidroelectricasDistribucionDto) throws Exception {
		TemConcesionHidroelectricasDistribucion temConcesionHidroelectricasDistribucion		= new TemConcesionHidroelectricasDistribucion();
		BeanUtils.copyProperties(temConcesionHidroelectricasDistribucionDto, temConcesionHidroelectricasDistribucion);
		return temConcesionHidroelectricasDistribucionMapper.selectByPrimaryKey(temConcesionHidroelectricasDistribucion);
	}
	
	public TemConcesionHidroelectricasDistribucion buscarGeometryById(TemConcesionHidroelectricasDistribucionDto temConcesionHidroelectricasDistribucionDto) throws Exception {
		TemConcesionHidroelectricasDistribucion temConcesionHidroelectricasDistribucion		= new TemConcesionHidroelectricasDistribucion();
		BeanUtils.copyProperties(temConcesionHidroelectricasDistribucionDto, temConcesionHidroelectricasDistribucion);
		return temConcesionHidroelectricasDistribucionMapper.selectByPrimaryKeyGeometry(temConcesionHidroelectricasDistribucion);
	}
	
	@Transactional
	public Integer guardar(TemConcesionHidroelectricasDistribucionDto temConcesionHidroelectricasDistribucionDto) throws Exception {
		TemConcesionHidroelectricasDistribucion temConcesionHidroelectricasDistribucion		= new TemConcesionHidroelectricasDistribucion();
		BeanUtils.copyProperties(temConcesionHidroelectricasDistribucionDto, temConcesionHidroelectricasDistribucion);
		int rs	= 0;
		TemConcesionHidroelectricasDistribucion exiteTemConcesionHidroelectricasDistribucion		= temConcesionHidroelectricasDistribucionMapper.selectByPrimaryKey(temConcesionHidroelectricasDistribucion);
		if(exiteTemConcesionHidroelectricasDistribucion != null) {
			rs	= temConcesionHidroelectricasDistribucionMapper.updateByPrimaryKeySelective(temConcesionHidroelectricasDistribucion);
		} else {
			rs	= temConcesionHidroelectricasDistribucionMapper.insertSelective(temConcesionHidroelectricasDistribucion);
			
			Integer srlGid	= temConcesionHidroelectricasDistribucionMapper.lastSequence();
			temConcesionHidroelectricasDistribucionDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemConcesionHidroelectricasDistribucionDto temConcesionHidroelectricasDistribucionDto) throws Exception {
		TemConcesionHidroelectricasDistribucion temConcesionHidroelectricasDistribucion		= new TemConcesionHidroelectricasDistribucion();
		BeanUtils.copyProperties(temConcesionHidroelectricasDistribucionDto, temConcesionHidroelectricasDistribucion);
		Integer rs	= temConcesionHidroelectricasDistribucionMapper.deleteByPrimaryKey(temConcesionHidroelectricasDistribucion);
		return rs;
	}
	
}
