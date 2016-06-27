package wcmc.hef.web.capa.action;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import wcmc.hef.business.core.configuracion.dto.CapaDto;
import wcmc.hef.business.core.configuracion.service.CampoMetadataService;
import wcmc.hef.business.core.configuracion.service.CapaService;
import wcmc.hef.business.core.configuracion.service.GeometriaUsuarioService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import wcmc.hef.business.core.capa.service.BasHidroRios100000Service;
import wcmc.hef.business.core.capa.service.BasHidroRiosLagunasService;
import wcmc.hef.business.core.capa.service.BasLimAmazoniaService;
import wcmc.hef.business.core.capa.service.BasLimDepartamentoService;
import wcmc.hef.business.core.capa.service.BasLimDistritosService;
import wcmc.hef.business.core.capa.service.BasLimProvinciaService;
import wcmc.hef.business.core.capa.service.BasViasRedVialDepartamentalService;
import wcmc.hef.business.core.capa.service.BasViasRedVialNacionalService;
import wcmc.hef.business.core.capa.service.BasViasRedVialVecinalService;
import wcmc.hef.business.core.capa.service.ConsultaACLFuxionService;
import wcmc.hef.business.core.capa.service.TemAnpNacionalService;
import wcmc.hef.business.core.capa.service.TemAnpPrivadaService;
import wcmc.hef.business.core.capa.service.TemAnpRegionalService;
import wcmc.hef.business.core.capa.service.TemBiodiversidadEspeciesPeligroExtincionService;
import wcmc.hef.business.core.capa.service.TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaService;
import wcmc.hef.business.core.capa.service.TemCarbonoEcozonasService;
import wcmc.hef.business.core.capa.service.TemCentrosPobladosService;
import wcmc.hef.business.core.capa.service.TemClaveBiodiversidadService;
import wcmc.hef.business.core.capa.service.TemComunidadesNativasService;
import wcmc.hef.business.core.capa.service.TemConcesionesEcoturismoService;
import wcmc.hef.business.core.capa.service.TemConcesionesForestalesCastaniaService;
import wcmc.hef.business.core.capa.service.TemConcesionesForestalesConservacionService;
import wcmc.hef.business.core.capa.service.TemConcesionesForestalesMaderableAdecuadasService;
import wcmc.hef.business.core.capa.service.TemConcesionesForestalesMaderableConcursoService;
import wcmc.hef.business.core.capa.service.TemConcesionesForestalesManejoFaunaSilvestreService;
import wcmc.hef.business.core.capa.service.TemConcesionesForestalesReforestacionService;
import wcmc.hef.business.core.capa.service.TemConcesionesMinerasService;
import wcmc.hef.business.core.capa.service.TemConcesionHidroelectricasDistribucionService;
import wcmc.hef.business.core.capa.service.TemConcesionHidroelectricasGeneracionService;
import wcmc.hef.business.core.capa.service.TemCostoOportunidadDeforestacionService;
import wcmc.hef.business.core.capa.service.TemCoverturaVegetal2015Service;
import wcmc.hef.business.core.capa.service.TemDensidadCarbonoAereaService;
import wcmc.hef.business.core.capa.service.TemHumedalesRamsarService;
import wcmc.hef.business.core.capa.service.TemPrediosRuralesService;
import wcmc.hef.business.core.capa.service.TemProyeccionDensidadPob2015Service;
import wcmc.hef.business.core.capa.service.TemProyectosPoligonosService;
import wcmc.hef.business.core.capa.service.TemProyectosPuntosService;
import wcmc.hef.business.core.capa.service.TemReservasTerritorialesIndigenasService;
import wcmc.hef.business.core.capa.service.TemRiesgoErosionHidricaService;
import wcmc.hef.business.core.capa.service.TemPerdidaBosque20012014Service;
import wcmc.hef.business.core.capa.service.TemCoberturaBoscosa2014Service;
import wcmc.hef.business.core.capa.service.TemSinanpeAmortiguamientoService;
import wcmc.hef.business.core.capa.service.TemSoeconComunidadesCampesinasService;
import wcmc.hef.business.core.capa.service.TemSoeconSolicitudCreacionReservasTerritorialesService;
import wcmc.hef.business.core.capa.service.TemViaFerreaService;
import wcmc.hef.business.core.capa.service.TemViasTrochasService;
import wcmc.hef.business.core.capa.service.TemZonificPotencialBosqueProduccionPermanenteService;
import wcmc.hef.business.core.capa.dto.BeanRasterDto;
import wcmc.hef.business.core.capa.dto.TemConcesionHidroelectricasDistribucionDto;
import wcmc.hef.dao.capa.domain.BaseBeanVectorial;
import wcmc.hef.dao.capa.domain.BaseBeanVectorialImpl;
import wcmc.hef.dao.capa.domain.BeanRaster;
import wcmc.hef.dao.capa.domain.ConsultaACLFuxion;
import wcmc.hef.dao.capa.domain.TemConcesionHidroelectricasDistribucion;
import wcmc.hef.business.core.capa.dto.BasLimAmazoniaDto;
import wcmc.hef.dao.capa.domain.BasLimAmazonia;
import wcmc.hef.business.core.capa.dto.BasLimDepartamentoDto;
import wcmc.hef.dao.capa.domain.BasLimDepartamento;
import wcmc.hef.business.core.capa.dto.BasLimDistritosDto;
import wcmc.hef.dao.capa.domain.BasLimDistritos;
import wcmc.hef.business.core.capa.dto.BasLimProvinciaDto;
import wcmc.hef.dao.capa.domain.BasLimProvincia;
import wcmc.hef.business.core.capa.dto.BasViasRedVialDepartamentalDto;
import wcmc.hef.dao.capa.domain.BasViasRedVialDepartamental;
import wcmc.hef.business.core.capa.dto.BasViasRedVialNacionalDto;
import wcmc.hef.dao.capa.domain.BasViasRedVialNacional;
import wcmc.hef.business.core.capa.dto.BasViasRedVialVecinalDto;
import wcmc.hef.dao.capa.domain.BasViasRedVialVecinal;
import wcmc.hef.business.core.capa.dto.TemAnpNacionalDto;
import wcmc.hef.dao.capa.domain.TemAnpNacional;
import wcmc.hef.business.core.capa.dto.TemAnpPrivadaDto;
import wcmc.hef.dao.capa.domain.TemAnpPrivada;
import wcmc.hef.business.core.capa.dto.TemAnpRegionalDto;
import wcmc.hef.dao.capa.domain.TemAnpRegional;
import wcmc.hef.business.core.capa.dto.TemCarbonoEcozonasDto;
import wcmc.hef.dao.capa.domain.TemCarbonoEcozonas;
import wcmc.hef.business.core.capa.dto.TemCentrosPobladosDto;
import wcmc.hef.dao.capa.domain.TemCentrosPoblados;
import wcmc.hef.business.core.capa.dto.TemClaveBiodiversidadDto;
import wcmc.hef.dao.capa.domain.TemClaveBiodiversidad;
import wcmc.hef.business.core.capa.dto.TemComunidadesNativasDto;
import wcmc.hef.dao.capa.domain.TemComunidadesNativas;
import wcmc.hef.business.core.capa.dto.TemConcesionesEcoturismoDto;
import wcmc.hef.dao.capa.domain.TemConcesionesEcoturismo;
import wcmc.hef.business.core.capa.dto.TemConcesionesForestalesCastaniaDto;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesCastania;
import wcmc.hef.business.core.capa.dto.TemConcesionesForestalesConservacionDto;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesConservacion;
import wcmc.hef.business.core.capa.dto.TemConcesionesForestalesMaderableAdecuadasDto;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesMaderableAdecuadas;
import wcmc.hef.business.core.capa.dto.TemConcesionesForestalesMaderableConcursoDto;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesMaderableConcurso;
import wcmc.hef.business.core.capa.dto.TemConcesionesForestalesManejoFaunaSilvestreDto;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesManejoFaunaSilvestre;
import wcmc.hef.business.core.capa.dto.TemConcesionesForestalesReforestacionDto;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesReforestacion;
import wcmc.hef.business.core.capa.dto.TemConcesionesMinerasDto;
import wcmc.hef.dao.capa.domain.TemConcesionesMineras;
import wcmc.hef.business.core.capa.dto.TemConcesionHidroelectricasGeneracionDto;
import wcmc.hef.dao.capa.domain.TemConcesionHidroelectricasGeneracion;
import wcmc.hef.business.core.capa.dto.TemCostoOportunidadDeforestacionDto;
import wcmc.hef.dao.capa.domain.TemCostoOportunidadDeforestacion;
import wcmc.hef.business.core.capa.dto.TemCoverturaVegetal2015Dto;
import wcmc.hef.dao.capa.domain.TemCoverturaVegetal2015;
import wcmc.hef.business.core.capa.dto.TemHumedalesRamsarDto;
import wcmc.hef.dao.capa.domain.TemHumedalesRamsar;
import wcmc.hef.business.core.capa.dto.TemIndiceImportanciaBiologicaDto;
import wcmc.hef.dao.capa.domain.TemIndiceImportanciaBiologica;
import wcmc.hef.business.core.capa.dto.TemPrediosRuralesDto;
import wcmc.hef.dao.capa.domain.TemPrediosRurales;
import wcmc.hef.business.core.capa.dto.TemProyeccionDensidadPob2015Dto;
import wcmc.hef.dao.capa.domain.TemProyeccionDensidadPob2015;
import wcmc.hef.business.core.capa.dto.TemProyectosPoligonosDto;
import wcmc.hef.dao.capa.domain.TemProyectosPoligonos;
import wcmc.hef.business.core.capa.dto.TemProyectosPuntosDto;
import wcmc.hef.dao.capa.domain.TemProyectosPuntos;
import wcmc.hef.business.core.capa.dto.TemReservasTerritorialesIndigenasDto;
import wcmc.hef.dao.capa.domain.TemReservasTerritorialesIndigenas;
import wcmc.hef.business.core.capa.dto.TemSinanpeAmortiguamientoDto;
import wcmc.hef.dao.capa.domain.TemSinanpeAmortiguamiento;
import wcmc.hef.business.core.capa.dto.TemSoeconComunidadesCampesinasDto;
import wcmc.hef.dao.capa.domain.TemSoeconComunidadesCampesinas;
import wcmc.hef.business.core.capa.dto.TemSoeconSolicitudCreacionReservasTerritorialesDto;
import wcmc.hef.dao.capa.domain.TemSoeconSolicitudCreacionReservasTerritoriales;
import wcmc.hef.business.core.capa.dto.TemViaFerreaDto;
import wcmc.hef.dao.capa.domain.TemViaFerrea;
import wcmc.hef.business.core.capa.dto.TemViasTrochasDto;
import wcmc.hef.dao.capa.domain.TemViasTrochas;
import wcmc.hef.business.core.capa.dto.TemZonificPotencialBosqueProduccionPermanenteDto;
import wcmc.hef.dao.capa.domain.TemZonificPotencialBosqueProduccionPermanente;
import wcmc.hef.dao.configuracion.domain.Capa;
import wcmc.hef.general.util.CadenaUtil;
import wcmc.hef.general.util.ConfiguracionProperties;
import wcmc.hef.general.util.Geotools;
import wcmc.hef.general.util.GeotoolsImagen;
import wcmc.hef.general.util.ImagenUtil;
import wcmc.hef.general.util.RedUtil;
import wcmc.hef.general.util.ServiciosProperties;
import wcmc.hef.business.core.capa.service.TemIndiceImportanciaBiologicaService;

public class ConsultaAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private BasHidroRios100000Service basHidroRios100000Service;

	@Autowired
	private BasHidroRiosLagunasService basHidroRiosLagunasService;

	@Autowired
	private BasLimAmazoniaService basLimAmazoniaService;

	@Autowired
	private BasLimDepartamentoService basLimDepartamentoService;

	@Autowired
	private BasLimDistritosService basLimDistritosService;

	@Autowired
	private BasLimProvinciaService basLimProvinciaService;

	@Autowired
	private BasViasRedVialDepartamentalService basViasRedVialDepartamentalService;

	@Autowired
	private BasViasRedVialNacionalService basViasRedVialNacionalService;

	@Autowired
	private BasViasRedVialVecinalService basViasRedVialVecinalService;

	@Autowired
	private TemAnpNacionalService temAnpNacionalService;

	@Autowired
	private TemAnpPrivadaService temAnpPrivadaService;

	@Autowired
	private TemAnpRegionalService temAnpRegionalService;

	@Autowired
	private TemCarbonoEcozonasService temCarbonoEcozonasService;

	@Autowired
	private TemCentrosPobladosService temCentrosPobladosService;

	@Autowired
	private TemClaveBiodiversidadService temClaveBiodiversidadService;

	@Autowired
	private TemComunidadesNativasService temComunidadesNativasService;

	@Autowired
	private TemConcesionesEcoturismoService temConcesionesEcoturismoService;

	@Autowired
	private TemConcesionesForestalesCastaniaService temConcesionesForestalesCastaniaService;

	@Autowired
	private TemConcesionesForestalesConservacionService temConcesionesForestalesConservacionService;

	@Autowired
	private TemConcesionesForestalesMaderableAdecuadasService temConcesionesForestalesMaderableAdecuadasService;

	@Autowired
	private TemConcesionesForestalesMaderableConcursoService temConcesionesForestalesMaderableConcursoService;

	@Autowired
	private TemConcesionesForestalesManejoFaunaSilvestreService temConcesionesForestalesManejoFaunaSilvestreService;

	@Autowired
	private TemConcesionesForestalesReforestacionService temConcesionesForestalesReforestacionService;

	@Autowired
	private TemConcesionesMinerasService temConcesionesMinerasService;

	@Autowired
	private TemConcesionHidroelectricasDistribucionService temConcesionHidroelectricasDistribucionService;

	@Autowired
	private TemConcesionHidroelectricasGeneracionService temConcesionHidroelectricasGeneracionService;

	@Autowired
	private TemCostoOportunidadDeforestacionService temCostoOportunidadDeforestacionService;

	@Autowired
	private TemCoverturaVegetal2015Service temCoverturaVegetal2015Service;

	@Autowired
	private TemHumedalesRamsarService temHumedalesRamsarService;

	@Autowired
	private TemPrediosRuralesService temPrediosRuralesService;

	@Autowired
	private TemProyeccionDensidadPob2015Service temProyeccionDensidadPob2015Service;

	@Autowired
	private TemProyectosPoligonosService temProyectosPoligonosService;

	@Autowired
	private TemProyectosPuntosService temProyectosPuntosService;

	@Autowired
	private TemReservasTerritorialesIndigenasService temReservasTerritorialesIndigenasService;

	@Autowired
	private TemSinanpeAmortiguamientoService temSinanpeAmortiguamientoService;

	@Autowired
	private TemSoeconComunidadesCampesinasService temSoeconComunidadesCampesinasService;

	@Autowired
	private TemSoeconSolicitudCreacionReservasTerritorialesService temSoeconSolicitudCreacionReservasTerritorialesService;

	@Autowired
	private TemViaFerreaService temViaFerreaService;

	@Autowired
	private TemViasTrochasService temViasTrochasService;

	@Autowired
	private TemZonificPotencialBosqueProduccionPermanenteService temZonificPotencialBosqueProduccionPermanenteService;

	
	@Autowired
	private TemBiodiversidadEspeciesPeligroExtincionService temBiodiversidadEspeciesPeligroExtincionService;

	@Autowired
	private TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaService temBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaService;

	@Autowired
	private TemDensidadCarbonoAereaService temDensidadCarbonoAereaService;

	@Autowired
	private TemIndiceImportanciaBiologicaService temIndiceImportanciaBiologicaService;

	@Autowired
	private TemRiesgoErosionHidricaService temRiesgoErosionHidricaService;

	@Autowired
	private TemCoberturaBoscosa2014Service temCoberturaBoscosa2014Service;

	@Autowired
	private TemPerdidaBosque20012014Service temPerdidaBosque20012014Service;

	@Autowired
	private CapaService capaService;
	
	@Autowired
	private GeometriaUsuarioService geometriaUsuarioService;
	
	@Autowired
	private CampoMetadataService campoMetadataService;

	@Autowired
	private ConsultaACLFuxionService consultaACLFuxionService;
	
	private String strPoligonoConsulta;
	private String strPoligonoConsultaBoundary;
	private String strIdCapaConsulta;
	private String listSrlIdCapaConsulta;
	private String zoomLevel;
	public ConsultaAction() {
	}
	public String consultarBoundary() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			ActionContext ctx					= ActionContext.getContext();
			ActionInvocation actionInvocation	= ctx.getActionInvocation();
			String actionName					= CadenaUtil.getStr(actionInvocation.getProxy().getActionName());
			if(!CadenaUtil.getStr(strIdCapaConsulta).equals("")) {
				BaseBeanVectorial baseBeanVectorial		= (BaseBeanVectorial)session.get("beanConsultaCapasRightClick");
				if(baseBeanVectorial != null) {
					strPoligonoConsulta	= baseBeanVectorial.getStrTheGeom();//Proviene de APA
				}
			}
			
			String strHashConsultaCurr	= "";
			if(CadenaUtil.getStrNull(session.get("strHashConsultaACL")) != null) {
				strHashConsultaCurr	= (String)session.get("strHashConsultaACL");
			}
			String strHashConsultaCurrTemp		= strHashConsultaCurr;
			
			if(CadenaUtil.getStrNull(strPoligonoConsulta) == null) {//TODO No compatible para la herencia de criterios hacia Analizar por area
				strPoligonoConsulta		= CadenaUtil.getStr(session.get("geometria_"+strHashConsultaCurrTemp));//Proviene de fuxion ACL
			} else if(session.get("geometria_"+strHashConsultaCurrTemp) != null) {
				List<BaseBeanVectorial> listReporte	= new ArrayList<BaseBeanVectorial>();
				listReporte.add(new BaseBeanVectorialImpl(CadenaUtil.getStr(session.get("geometria_"+strHashConsultaCurrTemp))));
				listReporte.add(new BaseBeanVectorialImpl(strPoligonoConsulta));
				strPoligonoConsulta	 = evaluarGeometrias(listReporte);
			}
			if(!CadenaUtil.getStr(strPoligonoConsulta).equals("")) {
				strPoligonoConsultaBoundary	= consultaACLFuxionService.selectBoundary(strPoligonoConsulta);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return SUCCESS;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////
	public String consultar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			if(CadenaUtil.getStr(request.getParameter("esRaster")).equals("false")) {
				session.remove("usar_consulta_acl");
			}
			ActionContext ctx					= ActionContext.getContext();
			ActionInvocation actionInvocation	= ctx.getActionInvocation();
			String actionName					= CadenaUtil.getStr(actionInvocation.getProxy().getActionName());
			if(!CadenaUtil.getStr(strIdCapaConsulta).equals("")) {
				BaseBeanVectorial baseBeanVectorial		= (BaseBeanVectorial)session.get("beanConsultaCapasRightClick");
				if(baseBeanVectorial != null) {
					strPoligonoConsulta	= baseBeanVectorial.getStrTheGeom();//Proviene de APA
				}
			}
			
			String strHashConsultaCurr	= "";
			if(CadenaUtil.getStrNull(session.get("strHashConsultaACL")) != null) {
				strHashConsultaCurr	= (String)session.get("strHashConsultaACL");
				session.remove("strHashConsultaACL");
			}
			String strHashConsultaCurrTemp		= strHashConsultaCurr;
			if(!CadenaUtil.getStr(session.get("usar_consulta_acl")).equals("true")) {
				strHashConsultaCurr			= "";
			}
			final String strHashConsulta	= strHashConsultaCurr;
			
			if(CadenaUtil.getStrNull(strPoligonoConsulta) == null) {//TODO No compatible para la herencia de criterios hacia Analizar por area
				strPoligonoConsulta		= CadenaUtil.getStr(session.get("geometria_"+strHashConsultaCurrTemp));//Proviene de fuxion ACL
				session.remove("geometria_"+strHashConsultaCurrTemp);
			} else if(session.get("geometria_"+strHashConsultaCurrTemp) != null) {
				List<BaseBeanVectorial> listReporte	= new ArrayList<BaseBeanVectorial>();
				listReporte.add(new BaseBeanVectorialImpl(CadenaUtil.getStr(session.get("geometria_"+strHashConsultaCurrTemp))));
				listReporte.add(new BaseBeanVectorialImpl(strPoligonoConsulta));
				strPoligonoConsulta	 = evaluarGeometrias(listReporte);
				session.remove("geometria_"+strHashConsultaCurrTemp);
			}
			if(!CadenaUtil.getStr(strPoligonoConsulta).equals("")) {
				strPoligonoConsultaBoundary	= consultaACLFuxionService.selectBoundary(strPoligonoConsulta);
			}
			final Map<String, Object> mapReporte			= new HashMap<String, Object>();
			final Map<String, String> mapReporteNombres		= new HashMap<String, String>();
			
			String[] arrCons	= listSrlIdCapaConsulta.split(",");
			List<String> listConsulta	= Arrays.asList(arrCons);
			Map<String, String> mapServ	= ServiciosProperties.getServiciosByIdList();
			List<Thread> listThread	= new ArrayList<Thread>();
			final List<String> listReporteOk	= new Vector<String>();
			CapaDto capaDto		= null;
			for(String strSrlIdCapa:listConsulta) {
				capaDto		= new CapaDto();
				capaDto.setSrlIdCapa(CadenaUtil.getInte(strSrlIdCapa));
				final Capa capa		= capaService.buscarById(capaDto);
				if(!mapServ.containsKey(CadenaUtil.getStr(strSrlIdCapa))) {
					//TODO Consultar por capas de usuario
					/*
					CapaDto capaDto		= new CapaDto();
					capaDto.setSrlIdCapa(CadenaUtil.getInte(strSrlIdCapa));
					final Capa capa		= capaService.buscarById(capaDto);
					if(capa != null) {
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									GeometriaUsuarioDto geometriaUsuarioDto	= new GeometriaUsuarioDto();
									geometriaUsuarioDto.setIntIdCapa(capa.getSrlIdCapa());
									geometriaUsuarioDto.setStrGeometry(CadenaUtil.getStr(strPoligonoConsulta));
									geometriaUsuarioDto.setStrHashConsulta(strHashConsulta);
									List<GeometriaUsuario> listGeometriaUsu		= geometriaUsuarioService.buscar(geometriaUsuarioDto);
//									List<Integer> listGid	= new ArrayList<Integer>();
//									for(GeometriaUsuario geo:listGeometriaUsu) {
//										listGid.add(geo.getIntGid());
//									}
//									String strRutaRepTemp	= ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.RUTA_BASE_CAPAS_USUARIO);
//									String strRutaShp		= strRutaRepTemp+File.separator+capa.getStrShp()+File.separator+capa.getStrShp()+".shp";
//									List<Map<String, Object>> list	= new GeotoolsData().filtrarOcurrenciasListGid(strRutaShp, listGid);
									if(listGeometriaUsu.size() > 0) {
										Map map = new HashMap<String, Object>();
										map.put("list", listGeometriaUsu);
										map.put("srlIdCapa", capa.getSrlIdCapa().toString());
										map.put("strNombre", capa.getStrNombre());
										
										CampoMetadataDto campoMetadataDto	= new CampoMetadataDto();
										campoMetadataDto.setIntIdCapa(capa.getSrlIdCapa());
										List<CampoMetadata> listCampoMetadata	= campoMetadataService.buscar(campoMetadataDto);
										map.put("listCampoMetadata", listCampoMetadata);
										
										List<Map> listGeometriaUsuario	= (List)mapReporte.get("listGeometriaUsuario");
										if(listGeometriaUsuario == null) {
											listGeometriaUsuario	= new ArrayList<Map>();
											mapReporte.put("listGeometriaUsuario", listGeometriaUsuario);
										}
										listGeometriaUsuario.add(map);
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("GeometriaUsuarioService_"+capa.getSrlIdCapa());
								}
							}
						});
						listThread.add(t);
					}
					*/
				} else {
					switch(mapServ.get(CadenaUtil.getStr(strSrlIdCapa))) {
					case "BasLimNacionalService":
					{
						break;
					}
					case "BasLimProvinciaService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									BasLimProvinciaDto basLimProvinciaDto		= new BasLimProvinciaDto();
									basLimProvinciaDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									basLimProvinciaDto.setStrHashConsulta(strHashConsulta);
									List<BasLimProvincia> listBasLimProvincia		= basLimProvinciaService.buscar(basLimProvinciaDto);
									if(listBasLimProvincia.size() > 0) {
										mapReporte.put("listBasLimProvincia", listBasLimProvincia);
										mapReporteNombres.put("listBasLimProvincia", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("BasLimProvinciaService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "BasLimDepartamentoService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									BasLimDepartamentoDto basLimDepartamentoDto		= new BasLimDepartamentoDto();
									basLimDepartamentoDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									basLimDepartamentoDto.setStrHashConsulta(strHashConsulta);
									List<BasLimDepartamento> listBasLimDepartamento		= basLimDepartamentoService.buscar(basLimDepartamentoDto);
									if(listBasLimDepartamento.size() > 0) {
										mapReporte.put("listBasLimDepartamento", listBasLimDepartamento);
										mapReporteNombres.put("listBasLimDepartamento", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("BasLimDepartamentoService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "BasLimDistritosService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									BasLimDistritosDto basLimDistritosDto		= new BasLimDistritosDto();
									basLimDistritosDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									basLimDistritosDto.setStrHashConsulta(strHashConsulta);;
									List<BasLimDistritos> listBasLimDistritos		= basLimDistritosService.buscar(basLimDistritosDto);
									if(listBasLimDistritos.size() > 0) {
										mapReporte.put("listBasLimDistritos", listBasLimDistritos);
										mapReporteNombres.put("listBasLimDistritos", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("BasLimDistritosService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "BasLimAmazoniaService":
					{
						/*
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									BasLimAmazoniaDto basLimAmazoniaDto		= new BasLimAmazoniaDto();
									basLimAmazoniaDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									basLimAmazoniaDto.setStrHashConsulta(strHashConsulta);
									List<BasLimAmazonia> listBasLimAmazonia		= basLimAmazoniaService.buscar(basLimAmazoniaDto);
									if(listBasLimAmazonia.size() > 0) {
										mapReporte.put("listBasLimAmazonia", listBasLimAmazonia);
										mapReporteNombres.put("listBasLimAmazonia", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("BasLimAmazoniaService");
								}
							}
						});
						listThread.add(t);
						*/
						break;
					}
					case "BasHidroRiosLagunasService":
					{
						/*
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									BasHidroRiosLagunasDto basHidroRiosLagunasDto		= new BasHidroRiosLagunasDto();
									basHidroRiosLagunasDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									basHidroRiosLagunasDto.setStrHashConsulta(strHashConsulta);
									List<BasHidroRiosLagunas> listBasHidroRiosLagunas		= basHidroRiosLagunasService.buscar(basHidroRiosLagunasDto);
									if(listBasHidroRiosLagunas.size() > 0) {
										mapReporte.put("listBasHidroRiosLagunas", listBasHidroRiosLagunas);
										mapReporteNombres.put("listBasHidroRiosLagunas", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("BasHidroRiosLagunasService");
								}
							}
						});
						listThread.add(t);
						*/
						break;
					}
					case "BasHidroRios100000Service":
					{
						/*
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									BasHidroRios100000Dto basHidroRios100000Dto		= new BasHidroRios100000Dto();
									basHidroRios100000Dto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									basHidroRios100000Dto.setStrHashConsulta(strHashConsulta);
									List<BasHidroRios100000> listBasHidroRios100000		= basHidroRios100000Service.buscar(basHidroRios100000Dto);
									if(listBasHidroRios100000.size() > 0) {
										mapReporte.put("listBasHidroRios100000", listBasHidroRios100000);
										mapReporteNombres.put("listBasHidroRios100000", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("BasHidroRios100000Service");
								}
							}
						});
						listThread.add(t);
						*/
						break;
					}
					case "BasViasRedVialVecinalService":
					{
						/*
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									BasViasRedVialVecinalDto basViasRedVialVecinalDto		= new BasViasRedVialVecinalDto();
									basViasRedVialVecinalDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									basViasRedVialVecinalDto.setStrHashConsulta(strHashConsulta);
									List<BasViasRedVialVecinal> listBasViasRedVialVecinal		= basViasRedVialVecinalService.buscar(basViasRedVialVecinalDto);
									if(listBasViasRedVialVecinal.size() > 0) {
										mapReporte.put("listBasViasRedVialVecinal", listBasViasRedVialVecinal);
										mapReporteNombres.put("listBasViasRedVialVecinal", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("BasViasRedVialVecinalService");
								}
							}
						});
						listThread.add(t);
						*/
						break;
					}
					case "BasViasRedVialNacionalService":
					{
						/*
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									BasViasRedVialNacionalDto basViasRedVialNacionalDto		= new BasViasRedVialNacionalDto();
									basViasRedVialNacionalDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									basViasRedVialNacionalDto.setStrHashConsulta(strHashConsulta);
									List<BasViasRedVialNacional> listBasViasRedVialNacional		= basViasRedVialNacionalService.buscar(basViasRedVialNacionalDto);
									if(listBasViasRedVialNacional.size() > 0) {
										mapReporte.put("listBasViasRedVialNacional", listBasViasRedVialNacional);
										mapReporteNombres.put("listBasViasRedVialNacional", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("BasViasRedVialNacionalService");
								}
							}
						});
						listThread.add(t);
						*/
						break;
					}
					case "BasViasRedVialDepartamentalService":
					{
						/*
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									BasViasRedVialDepartamentalDto basViasRedVialDepartamentalDto		= new BasViasRedVialDepartamentalDto();
									basViasRedVialDepartamentalDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									basViasRedVialDepartamentalDto.setStrHashConsulta(strHashConsulta);
									List<BasViasRedVialDepartamental> listBasViasRedVialDepartamental		= basViasRedVialDepartamentalService.buscar(basViasRedVialDepartamentalDto);
									if(listBasViasRedVialDepartamental.size() > 0) {
										mapReporte.put("listBasViasRedVialDepartamental", listBasViasRedVialDepartamental);
										mapReporteNombres.put("listBasViasRedVialDepartamental", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("BasViasRedVialDepartamentalService");
								}
							}
						});
						listThread.add(t);
						*/
						break;
					}
					case "TemViaFerreaService":
					{
						/*
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemViaFerreaDto temViaFerreaDto		= new TemViaFerreaDto();
									temViaFerreaDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temViaFerreaDto.setStrHashConsulta(strHashConsulta);
									List<TemViaFerrea> listTemViaFerrea		= temViaFerreaService.buscar(temViaFerreaDto);
									if(listTemViaFerrea.size() > 0) {
										mapReporte.put("listTemViaFerrea", listTemViaFerrea);
										mapReporteNombres.put("listTemViaFerrea", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemViaFerreaService");
								}
							}
						});
						listThread.add(t);
						*/
						break;
					}
					case "TemViasTrochasService":
					{
						/*
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemViasTrochasDto temViasTrochasDto		= new TemViasTrochasDto();
									temViasTrochasDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temViasTrochasDto.setStrHashConsulta(strHashConsulta);
									List<TemViasTrochas> listTemViasTrochas		= temViasTrochasService.buscar(temViasTrochasDto);
									if(listTemViasTrochas.size() > 0) {
										mapReporte.put("listTemViasTrochas", listTemViasTrochas);
										mapReporteNombres.put("listTemViasTrochas", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemViasTrochasService");
								}
							}
						});
						listThread.add(t);
						*/
						break;
					}
					case "TemSoeconComunidadesCampesinasTotalesService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemSoeconComunidadesCampesinasDto temSoeconComunidadesCampesinasDto		= new TemSoeconComunidadesCampesinasDto();
									temSoeconComunidadesCampesinasDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temSoeconComunidadesCampesinasDto.setStrHashConsulta(strHashConsulta);
									List<TemSoeconComunidadesCampesinas> listTemSoeconComunidadesCampesinas		= temSoeconComunidadesCampesinasService.buscar(temSoeconComunidadesCampesinasDto);
									if(listTemSoeconComunidadesCampesinas.size() > 0) {
										mapReporte.put("listTemSoeconComunidadesCampesinas", listTemSoeconComunidadesCampesinas);
										mapReporteNombres.put("listTemSoeconComunidadesCampesinas", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemSoeconComunidadesCampesinasService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemComunidadesNativasService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemComunidadesNativasDto temComunidadesNativasDto		= new TemComunidadesNativasDto();
									temComunidadesNativasDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temComunidadesNativasDto.setStrHashConsulta(strHashConsulta);
									List<TemComunidadesNativas> listTemComunidadesNativas		= temComunidadesNativasService.buscar(temComunidadesNativasDto);
									if(listTemComunidadesNativas.size() > 0) {
										mapReporte.put("listTemComunidadesNativas", listTemComunidadesNativas);
										mapReporteNombres.put("listTemComunidadesNativas", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemComunidadesNativasService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemReservasTerritorialesIndigenasService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemReservasTerritorialesIndigenasDto temReservasTerritorialesIndigenasDto		= new TemReservasTerritorialesIndigenasDto();
									temReservasTerritorialesIndigenasDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temReservasTerritorialesIndigenasDto.setStrHashConsulta(strHashConsulta);
									List<TemReservasTerritorialesIndigenas> listTemReservasTerritorialesIndigenas		= temReservasTerritorialesIndigenasService.buscar(temReservasTerritorialesIndigenasDto);
									if(listTemReservasTerritorialesIndigenas.size() > 0) {
										mapReporte.put("listTemReservasTerritorialesIndigenas", listTemReservasTerritorialesIndigenas);
										mapReporteNombres.put("listTemReservasTerritorialesIndigenas", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemReservasTerritorialesIndigenasService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemSoeconSolicitudCreacionReservasTerritorialesService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemSoeconSolicitudCreacionReservasTerritorialesDto temSoeconSolicitudCreacionReservasTerritorialesDto		= new TemSoeconSolicitudCreacionReservasTerritorialesDto();
									temSoeconSolicitudCreacionReservasTerritorialesDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temSoeconSolicitudCreacionReservasTerritorialesDto.setStrHashConsulta(strHashConsulta);
									List<TemSoeconSolicitudCreacionReservasTerritoriales> listTemSoeconSolicitudCreacionReservasTerritoriales		= temSoeconSolicitudCreacionReservasTerritorialesService.buscar(temSoeconSolicitudCreacionReservasTerritorialesDto);
									if(listTemSoeconSolicitudCreacionReservasTerritoriales.size() > 0) {
										mapReporte.put("listTemSoeconSolicitudCreacionReservasTerritoriales", listTemSoeconSolicitudCreacionReservasTerritoriales);
										mapReporteNombres.put("listTemSoeconSolicitudCreacionReservasTerritoriales", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemSoeconSolicitudCreacionReservasTerritorialesService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemConcesionesEcoturismoService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemConcesionesEcoturismoDto temConcesionesEcoturismoDto		= new TemConcesionesEcoturismoDto();
									temConcesionesEcoturismoDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temConcesionesEcoturismoDto.setStrHashConsulta(strHashConsulta);
									List<TemConcesionesEcoturismo> listTemConcesionesEcoturismo		= temConcesionesEcoturismoService.buscar(temConcesionesEcoturismoDto);
									if(listTemConcesionesEcoturismo.size() > 0) {
										mapReporte.put("listTemConcesionesEcoturismo", listTemConcesionesEcoturismo);
										mapReporteNombres.put("listTemConcesionesEcoturismo", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemConcesionesEcoturismoService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemConcesionesForestalesCastaniaService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemConcesionesForestalesCastaniaDto temConcesionesForestalesCastaniaDto		= new TemConcesionesForestalesCastaniaDto();
									temConcesionesForestalesCastaniaDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temConcesionesForestalesCastaniaDto.setStrHashConsulta(strHashConsulta);
									List<TemConcesionesForestalesCastania> listTemConcesionesForestalesCastania		= temConcesionesForestalesCastaniaService.buscar(temConcesionesForestalesCastaniaDto);
									if(listTemConcesionesForestalesCastania.size() > 0) {
										mapReporte.put("listTemConcesionesForestalesCastania", listTemConcesionesForestalesCastania);
										mapReporteNombres.put("listTemConcesionesForestalesCastania", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemConcesionesForestalesCastaniaService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemConcesionesForestalesConservacionService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemConcesionesForestalesConservacionDto temConcesionesForestalesConservacionDto		= new TemConcesionesForestalesConservacionDto();
									temConcesionesForestalesConservacionDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temConcesionesForestalesConservacionDto.setStrHashConsulta(strHashConsulta);
									List<TemConcesionesForestalesConservacion> listTemConcesionesForestalesConservacion		= temConcesionesForestalesConservacionService.buscar(temConcesionesForestalesConservacionDto);
									if(listTemConcesionesForestalesConservacion.size() > 0) {
										mapReporte.put("listTemConcesionesForestalesConservacion", listTemConcesionesForestalesConservacion);
										mapReporteNombres.put("listTemConcesionesForestalesConservacion", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemConcesionesForestalesConservacionService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemConcesionesForestalesMaderableAdecuadasService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemConcesionesForestalesMaderableAdecuadasDto temConcesionesForestalesMaderableAdecuadasDto		= new TemConcesionesForestalesMaderableAdecuadasDto();
									temConcesionesForestalesMaderableAdecuadasDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temConcesionesForestalesMaderableAdecuadasDto.setStrHashConsulta(strHashConsulta);
									List<TemConcesionesForestalesMaderableAdecuadas> listTemConcesionesForestalesMaderableAdecuadas		= temConcesionesForestalesMaderableAdecuadasService.buscar(temConcesionesForestalesMaderableAdecuadasDto);
									if(listTemConcesionesForestalesMaderableAdecuadas.size() > 0) {
										mapReporte.put("listTemConcesionesForestalesMaderableAdecuadas", listTemConcesionesForestalesMaderableAdecuadas);
										mapReporteNombres.put("listTemConcesionesForestalesMaderableAdecuadas", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemConcesionesForestalesMaderableAdecuadasService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemConcesionesForestalesMaderableConcursoService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemConcesionesForestalesMaderableConcursoDto temConcesionesForestalesMaderableConcursoDto		= new TemConcesionesForestalesMaderableConcursoDto();
									temConcesionesForestalesMaderableConcursoDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temConcesionesForestalesMaderableConcursoDto.setStrHashConsulta(strHashConsulta);
									List<TemConcesionesForestalesMaderableConcurso> listTemConcesionesForestalesMaderableConcurso		= temConcesionesForestalesMaderableConcursoService.buscar(temConcesionesForestalesMaderableConcursoDto);
									if(listTemConcesionesForestalesMaderableConcurso.size() > 0) {
										mapReporte.put("listTemConcesionesForestalesMaderableConcurso", listTemConcesionesForestalesMaderableConcurso);
										mapReporteNombres.put("listTemConcesionesForestalesMaderableConcurso", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemConcesionesForestalesMaderableConcursoService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemConcesionesForestalesManejoFaunaSilvestreService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemConcesionesForestalesManejoFaunaSilvestreDto temConcesionesForestalesManejoFaunaSilvestreDto		= new TemConcesionesForestalesManejoFaunaSilvestreDto();
									temConcesionesForestalesManejoFaunaSilvestreDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temConcesionesForestalesManejoFaunaSilvestreDto.setStrHashConsulta(strHashConsulta);
									List<TemConcesionesForestalesManejoFaunaSilvestre> listTemConcesionesForestalesManejoFaunaSilvestre		= temConcesionesForestalesManejoFaunaSilvestreService.buscar(temConcesionesForestalesManejoFaunaSilvestreDto);
									if(listTemConcesionesForestalesManejoFaunaSilvestre.size() > 0) {
										mapReporte.put("listTemConcesionesForestalesManejoFaunaSilvestre", listTemConcesionesForestalesManejoFaunaSilvestre);
										mapReporteNombres.put("listTemConcesionesForestalesManejoFaunaSilvestre", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemConcesionesForestalesManejoFaunaSilvestreService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemConcesionesForestalesReforestacionService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemConcesionesForestalesReforestacionDto temConcesionesForestalesReforestacionDto		= new TemConcesionesForestalesReforestacionDto();
									temConcesionesForestalesReforestacionDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temConcesionesForestalesReforestacionDto.setStrHashConsulta(strHashConsulta);
									List<TemConcesionesForestalesReforestacion> listTemConcesionesForestalesReforestacion		= temConcesionesForestalesReforestacionService.buscar(temConcesionesForestalesReforestacionDto);
									if(listTemConcesionesForestalesReforestacion.size() > 0) {
										mapReporte.put("listTemConcesionesForestalesReforestacion", listTemConcesionesForestalesReforestacion);
										mapReporteNombres.put("listTemConcesionesForestalesReforestacion", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemConcesionesForestalesReforestacionService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemPrediosRuralesService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemPrediosRuralesDto temPrediosRuralesDto		= new TemPrediosRuralesDto();
									temPrediosRuralesDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temPrediosRuralesDto.setStrHashConsulta(strHashConsulta);
									List<TemPrediosRurales> listTemPrediosRurales		= temPrediosRuralesService.buscar(temPrediosRuralesDto);
									if(listTemPrediosRurales.size() > 0) {
										mapReporte.put("listTemPrediosRurales", listTemPrediosRurales);
										mapReporteNombres.put("listTemPrediosRurales", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemPrediosRuralesService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemZonificPotencialBosqueProduccionPermanenteService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemZonificPotencialBosqueProduccionPermanenteDto temZonificPotencialBosqueProduccionPermanenteDto		= new TemZonificPotencialBosqueProduccionPermanenteDto();
									temZonificPotencialBosqueProduccionPermanenteDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temZonificPotencialBosqueProduccionPermanenteDto.setStrHashConsulta(strHashConsulta);
									List<TemZonificPotencialBosqueProduccionPermanente> listTemZonificPotencialBosqueProduccionPermanente		= temZonificPotencialBosqueProduccionPermanenteService.buscar(temZonificPotencialBosqueProduccionPermanenteDto);
									if(listTemZonificPotencialBosqueProduccionPermanente.size() > 0) {
										mapReporte.put("listTemZonificPotencialBosqueProduccionPermanente", listTemZonificPotencialBosqueProduccionPermanente);
										mapReporteNombres.put("listTemZonificPotencialBosqueProduccionPermanente", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemZonificPotencialBosqueProduccionPermanenteService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemConcesionHidroelectricasGeneracionService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemConcesionHidroelectricasGeneracionDto temConcesionHidroelectricasGeneracionDto		= new TemConcesionHidroelectricasGeneracionDto();
									temConcesionHidroelectricasGeneracionDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temConcesionHidroelectricasGeneracionDto.setStrHashConsulta(strHashConsulta);
									List<TemConcesionHidroelectricasGeneracion> listTemConcesionHidroelectricasGeneracion		= temConcesionHidroelectricasGeneracionService.buscar(temConcesionHidroelectricasGeneracionDto);
									if(listTemConcesionHidroelectricasGeneracion.size() > 0) {
										mapReporte.put("listTemConcesionHidroelectricasGeneracion", listTemConcesionHidroelectricasGeneracion);
										mapReporteNombres.put("listTemConcesionHidroelectricasGeneracion", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemConcesionHidroelectricasGeneracionService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemConcesionHidroelectricasDistribucionService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemConcesionHidroelectricasDistribucionDto temConcesionHidroelectricasDistribucionDto		= new TemConcesionHidroelectricasDistribucionDto();
									temConcesionHidroelectricasDistribucionDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temConcesionHidroelectricasDistribucionDto.setStrHashConsulta(strHashConsulta);
									List<TemConcesionHidroelectricasDistribucion> listTemConcesionHidroelectricasDistribucion		= temConcesionHidroelectricasDistribucionService.buscar(temConcesionHidroelectricasDistribucionDto);
									if(listTemConcesionHidroelectricasDistribucion.size() > 0) {
										mapReporte.put("listTemConcesionHidroelectricasDistribucion", listTemConcesionHidroelectricasDistribucion);
										mapReporteNombres.put("listTemConcesionHidroelectricasDistribucion", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemConcesionHidroelectricasDistribucionService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemConcesionesMinerasService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemConcesionesMinerasDto temConcesionesMinerasDto		= new TemConcesionesMinerasDto();
									temConcesionesMinerasDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temConcesionesMinerasDto.setStrHashConsulta(strHashConsulta);
									List<TemConcesionesMineras> listTemConcesionesMineras		= temConcesionesMinerasService.buscar(temConcesionesMinerasDto);
									if(listTemConcesionesMineras.size() > 0) {
										mapReporte.put("listTemConcesionesMineras", listTemConcesionesMineras);
										mapReporteNombres.put("listTemConcesionesMineras", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemConcesionesMinerasService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemAnpNacionalService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemAnpNacionalDto temAnpNacionalDto		= new TemAnpNacionalDto();
									temAnpNacionalDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temAnpNacionalDto.setStrHashConsulta(strHashConsulta);
									List<TemAnpNacional> listTemAnpNacional		= temAnpNacionalService.buscar(temAnpNacionalDto);
									if(listTemAnpNacional.size() > 0) {
										mapReporte.put("listTemAnpNacional", listTemAnpNacional);
										mapReporteNombres.put("listTemAnpNacional", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemAnpNacionalService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemAnpRegionalService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemAnpRegionalDto temAnpRegionalDto		= new TemAnpRegionalDto();
									temAnpRegionalDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temAnpRegionalDto.setStrHashConsulta(strHashConsulta);
									List<TemAnpRegional> listTemAnpRegional		= temAnpRegionalService.buscar(temAnpRegionalDto);
									if(listTemAnpRegional.size() > 0) {
										mapReporte.put("listTemAnpRegional", listTemAnpRegional);
										mapReporteNombres.put("listTemAnpRegional", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemAnpRegionalService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemAnpPrivadaService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemAnpPrivadaDto temAnpPrivadaDto		= new TemAnpPrivadaDto();
									temAnpPrivadaDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temAnpPrivadaDto.setStrHashConsulta(strHashConsulta);
									List<TemAnpPrivada> listTemAnpPrivada		= temAnpPrivadaService.buscar(temAnpPrivadaDto);
									if(listTemAnpPrivada.size() > 0) {
										mapReporte.put("listTemAnpPrivada", listTemAnpPrivada);
										mapReporteNombres.put("listTemAnpPrivada", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemAnpPrivadaService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemSinanpeAmortiguamientoService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemSinanpeAmortiguamientoDto temSinanpeAmortiguamientoDto		= new TemSinanpeAmortiguamientoDto();
									temSinanpeAmortiguamientoDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temSinanpeAmortiguamientoDto.setStrHashConsulta(strHashConsulta);
									List<TemSinanpeAmortiguamiento> listTemSinanpeAmortiguamiento		= temSinanpeAmortiguamientoService.buscar(temSinanpeAmortiguamientoDto);
									if(listTemSinanpeAmortiguamiento.size() > 0) {
										mapReporte.put("listTemSinanpeAmortiguamiento", listTemSinanpeAmortiguamiento);
										mapReporteNombres.put("listTemSinanpeAmortiguamiento", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemSinanpeAmortiguamientoService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemClaveBiodiversidadService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemClaveBiodiversidadDto temClaveBiodiversidadDto		= new TemClaveBiodiversidadDto();
									temClaveBiodiversidadDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temClaveBiodiversidadDto.setStrHashConsulta(strHashConsulta);
									List<TemClaveBiodiversidad> listTemClaveBiodiversidad		= temClaveBiodiversidadService.buscar(temClaveBiodiversidadDto);
									if(listTemClaveBiodiversidad.size() > 0) {
										mapReporte.put("listTemClaveBiodiversidad", listTemClaveBiodiversidad);
										mapReporteNombres.put("listTemClaveBiodiversidad", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemClaveBiodiversidadService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemHumedalesRamsarService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemHumedalesRamsarDto temHumedalesRamsarDto		= new TemHumedalesRamsarDto();
									temHumedalesRamsarDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temHumedalesRamsarDto.setStrHashConsulta(strHashConsulta);
									List<TemHumedalesRamsar> listTemHumedalesRamsar		= temHumedalesRamsarService.buscar(temHumedalesRamsarDto);
									if(listTemHumedalesRamsar.size() > 0) {
										mapReporte.put("listTemHumedalesRamsar", listTemHumedalesRamsar);
										mapReporteNombres.put("listTemHumedalesRamsar", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemHumedalesRamsarService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemCoverturaVegetal2015Service":
					{
						/*
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemCoverturaVegetal2015Dto temCoverturaVegetal2015Dto		= new TemCoverturaVegetal2015Dto();
									temCoverturaVegetal2015Dto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temCoverturaVegetal2015Dto.setStrHashConsulta(strHashConsulta);
									List<TemCoverturaVegetal2015> listTemCoverturaVegetal2015		= temCoverturaVegetal2015Service.buscar(temCoverturaVegetal2015Dto);
									if(listTemCoverturaVegetal2015.size() > 0) {
										mapReporte.put("listTemCoverturaVegetal2015", listTemCoverturaVegetal2015);
										mapReporteNombres.put("listTemCoverturaVegetal2015", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemCoverturaVegetal2015Service");
								}
							}
						});
						listThread.add(t);
						*/
						break;
					}
					case "TemCarbonoEcozonasService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemCarbonoEcozonasDto temCarbonoEcozonasDto		= new TemCarbonoEcozonasDto();
									temCarbonoEcozonasDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temCarbonoEcozonasDto.setStrHashConsulta(strHashConsulta);
									List<TemCarbonoEcozonas> listTemCarbonoEcozonas		= temCarbonoEcozonasService.buscar(temCarbonoEcozonasDto);
									if(listTemCarbonoEcozonas.size() > 0) {
										mapReporte.put("listTemCarbonoEcozonas", listTemCarbonoEcozonas);
										mapReporteNombres.put("listTemCarbonoEcozonas", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemCarbonoEcozonasService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemIndiceImportanciaBiologicaService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemIndiceImportanciaBiologicaDto temIndiceImportanciaBiologicaDto		= new TemIndiceImportanciaBiologicaDto();
									temIndiceImportanciaBiologicaDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temIndiceImportanciaBiologicaDto.setStrHashConsulta(strHashConsulta);
									List<TemIndiceImportanciaBiologica> listTemIndiceImportanciaBiologica		= temIndiceImportanciaBiologicaService.buscar(temIndiceImportanciaBiologicaDto);
									if(listTemIndiceImportanciaBiologica.size() > 0) {
										mapReporte.put("listTemIndiceImportanciaBiologica", listTemIndiceImportanciaBiologica);
										mapReporteNombres.put("listTemIndiceImportanciaBiologica", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemIndiceImportanciaBiologicaService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemCentrosPobladosService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemCentrosPobladosDto temCentrosPobladosDto		= new TemCentrosPobladosDto();
									temCentrosPobladosDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temCentrosPobladosDto.setStrHashConsulta(strHashConsulta);
									List<TemCentrosPoblados> listTemCentrosPoblados		= temCentrosPobladosService.buscar(temCentrosPobladosDto);
									if(listTemCentrosPoblados.size() > 0) {
										mapReporte.put("listTemCentrosPoblados", listTemCentrosPoblados);
										mapReporteNombres.put("listTemCentrosPoblados", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemCentrosPobladosService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemProyeccionDensidadPob2015Service":
					{
						/*
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemProyeccionDensidadPob2015Dto temProyeccionDensidadPob2015Dto		= new TemProyeccionDensidadPob2015Dto();
									temProyeccionDensidadPob2015Dto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temProyeccionDensidadPob2015Dto.setStrHashConsulta(strHashConsulta);
									List<TemProyeccionDensidadPob2015> listTemProyeccionDensidadPob2015		= temProyeccionDensidadPob2015Service.buscar(temProyeccionDensidadPob2015Dto);
									if(listTemProyeccionDensidadPob2015.size() > 0) {
										mapReporte.put("listTemProyeccionDensidadPob2015", listTemProyeccionDensidadPob2015);
										mapReporteNombres.put("listTemProyeccionDensidadPob2015", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemProyeccionDensidadPob2015Service");
								}
							}
						});
						listThread.add(t);
						*/
						break;
					}
					case "TemCostoOportunidadDeforestacionService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemCostoOportunidadDeforestacionDto temCostoOportunidadDeforestacionDto		= new TemCostoOportunidadDeforestacionDto();
									temCostoOportunidadDeforestacionDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temCostoOportunidadDeforestacionDto.setStrHashConsulta(strHashConsulta);
									List<TemCostoOportunidadDeforestacion> listTemCostoOportunidadDeforestacion		= temCostoOportunidadDeforestacionService.buscar(temCostoOportunidadDeforestacionDto);
									if(listTemCostoOportunidadDeforestacion.size() > 0) {
										mapReporte.put("listTemCostoOportunidadDeforestacion", listTemCostoOportunidadDeforestacion);
										mapReporteNombres.put("listTemCostoOportunidadDeforestacion", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemCostoOportunidadDeforestacionService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemProyectosPuntosService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemProyectosPuntosDto temProyectosPuntosDto		= new TemProyectosPuntosDto();
									temProyectosPuntosDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temProyectosPuntosDto.setStrHashConsulta(strHashConsulta);
									List<TemProyectosPuntos> listTemProyectosPuntos		= temProyectosPuntosService.buscar(temProyectosPuntosDto);
									if(listTemProyectosPuntos.size() > 0) {
										mapReporte.put("listTemProyectosPuntos", listTemProyectosPuntos);
										mapReporteNombres.put("listTemProyectosPuntos", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemProyectosPuntosService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemProyectosPoligonosService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									TemProyectosPoligonosDto temProyectosPoligonosDto		= new TemProyectosPoligonosDto();
									temProyectosPoligonosDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
									temProyectosPoligonosDto.setStrHashConsulta(strHashConsulta);
									List<TemProyectosPoligonos> listTemProyectosPoligonos		= temProyectosPoligonosService.buscar(temProyectosPoligonosDto);
									if(listTemProyectosPoligonos.size() > 0) {
										mapReporte.put("listTemProyectosPoligonos", listTemProyectosPoligonos);
										mapReporteNombres.put("listTemProyectosPoligonos", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemProyectosPoligonosService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					
					///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
					case "TemBiodiversidadEspeciesPeligroExtincionService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									BeanRasterDto beanRasterDto		= new BeanRasterDto();
									beanRasterDto.setStrPoligonoConsulta(CadenaUtil.getStr(strPoligonoConsulta));
									BeanRaster beanRaster		= temBiodiversidadEspeciesPeligroExtincionService.selectByGeometry(beanRasterDto);
									if(beanRaster != null) {
										mapReporte.put("beanTemBiodiversidadEspeciesPeligroExtincion", beanRaster);
										mapReporteNombres.put("beanTemBiodiversidadEspeciesPeligroExtincion", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemBiodiversidadEspeciesPeligroExtincionService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									BeanRasterDto beanRasterDto		= new BeanRasterDto();
									beanRasterDto.setStrPoligonoConsulta(CadenaUtil.getStr(strPoligonoConsulta));
									BeanRaster beanRaster		= temBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaService.selectByGeometry(beanRasterDto);
									if(beanRaster != null) {
										mapReporte.put("beanTemBiodiversidadRiquezaPotencialEspeciesFaunaEndemica", beanRaster);
										mapReporteNombres.put("beanTemBiodiversidadRiquezaPotencialEspeciesFaunaEndemica", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemDensidadCarbonoAereaService":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									BeanRasterDto beanRasterDto		= new BeanRasterDto();
									beanRasterDto.setStrPoligonoConsulta(CadenaUtil.getStr(strPoligonoConsulta));
									BeanRaster beanRaster		= temDensidadCarbonoAereaService.selectByGeometry(beanRasterDto);
									if(beanRaster != null) {
										mapReporte.put("beanTemDensidadCarbonoAerea", beanRaster);
										mapReporteNombres.put("beanTemDensidadCarbonoAerea", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemDensidadCarbonoAereaService");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemRiesgoErosionHidricaService":
					{
						/*
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									BeanRasterDto beanRasterDto		= new BeanRasterDto();
									beanRasterDto.setStrPoligonoConsulta(CadenaUtil.getStr(strPoligonoConsulta));
									BeanRaster beanRaster		= temRiesgoErosionHidricaService.selectByGeometry(beanRasterDto);
									if(beanRaster != null) {
										mapReporte.put("beanTemRiesgoErosionHidrica", beanRaster);
										mapReporteNombres.put("beanTemRiesgoErosionHidrica", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemRiesgoErosionHidricaService");
								}
							}
						});
						listThread.add(t);
						*/
						break;
					}
					case "TemCoberturaBoscosa2014Service":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									BeanRasterDto beanRasterDto		= new BeanRasterDto();
									beanRasterDto.setStrPoligonoConsulta(CadenaUtil.getStr(strPoligonoConsulta));
									BeanRaster beanRaster		= temCoberturaBoscosa2014Service.selectByGeometry(beanRasterDto);
									if(beanRaster != null) {
										mapReporte.put("beanTemCoberturaBoscosa2014", beanRaster);
										mapReporteNombres.put("beanTemCoberturaBoscosa2014", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemCoberturaBoscosa2014Service");
								}
							}
						});
						listThread.add(t);
						break;
					}
					case "TemPerdidaBosque20012014Service":
					{
						Thread t= new Thread(new Runnable() {
							public void run() {
								try {
									BeanRasterDto beanRasterDto		= new BeanRasterDto();
									beanRasterDto.setStrPoligonoConsulta(CadenaUtil.getStr(strPoligonoConsulta));
									BeanRaster beanRaster		= temPerdidaBosque20012014Service.selectByGeometry(beanRasterDto);
									if(beanRaster != null) {
										mapReporte.put("beanTemPerdidaBosque20012014", beanRaster);
										mapReporteNombres.put("beanTemPerdidaBosque20012014", capa.getStrNombre());
									}
								} catch (Exception ex) {
									ex.printStackTrace();
								} finally {
									listReporteOk.add("TemPerdidaBosque20012014Service");
								}
							}
						});
						listThread.add(t);
						break;
					}
					}
				}
			}
			
			for(Thread t:listThread) {
				t.start();
			}
			
			prepararCapasReporte(listConsulta, mapServ);
			prepararCapasReporteGMaps();
			
			while(true) {
				synchronized(this) {
					wait(500L);
				}
				if(listReporteOk.size() == listThread.size()) {
					break;
				}
			}
			
			session.put("reporte", mapReporte);
			session.put("mapReporteNombres", mapReporteNombres);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return SUCCESS;
	}
	
	public String evaluarGeometrias(List<BaseBeanVectorial> listReporte) {
		ConsultaACLFuxion consultaACLFuxion		= new ConsultaACLFuxion();
		String strGeomRS	= "";
		String strGeom01	= "";
		BaseBeanVectorial baseBeanVectorial		= null;
		if(listReporte.size() > 1) {
			strGeom01	= listReporte.get(0).getStrTheGeom();
			for(int i = 1;i < listReporte.size();i++) {
				baseBeanVectorial	= listReporte.get(i);
				consultaACLFuxion.setStrGeom01(strGeom01);
				consultaACLFuxion.setStrGeom02(baseBeanVectorial.getStrTheGeom());
				strGeomRS	= consultaACLFuxionService.selectFuxion(consultaACLFuxion);
				strGeom01	= strGeomRS;
			}
		} else if(listReporte.size() == 1) {
			strGeomRS	= listReporte.get(0).getStrTheGeom();
		}
		return strGeomRS;
	}
	
	public void prepararCapasReporte(List<String> listConsulta, Map<String, String> mapServ) throws Exception {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		//System.out.println("strPoligonoConsulta="+strPoligonoConsulta);
		String strBbox					= consultaACLFuxionService.selectBBOX(strPoligonoConsulta);
		final String strBbox4326		= consultaACLFuxionService.selectBBOX4326(strPoligonoConsulta);
		zoomLevel			= ""+(CadenaUtil.getInte(zoomLevel)+1);
		int zoom			= CadenaUtil.getInte(zoomLevel);
		CapaDto capaDto		= new CapaDto();
		Capa capa			= null;
		String[] arrBbox	= strBbox4326.split(",");//<xmin>, <ymin>, <xmax>, <ymax>
		double xmin		= CadenaUtil.getDoub(arrBbox[0]);
		double ymin		= CadenaUtil.getDoub(arrBbox[1]);
		double xmax		= CadenaUtil.getDoub(arrBbox[2]);
		double ymax		= CadenaUtil.getDoub(arrBbox[3]);
		
		double[] arrPixMin	= convertirWorlCoordinateEnPixeles(xmin, ymin, zoom);
		double[] arrPixMax	= convertirWorlCoordinateEnPixeles(xmax, ymax, zoom);
		
		double ylong	= arrPixMax[1] - arrPixMin[1];
		double xlong	= arrPixMax[0] - arrPixMin[0];
		
		int altoOri		= (int)Math.abs(ylong);
		int anchoOri	= (int)Math.abs(xlong);
//		int alto		= altoOri;
//		int ancho		= anchoOri;
		final int[] newDim	= new int[] {-1,-1};
		List<byte[]> listArrByteImage					= null;
		List<byte[]> listArrByteImageGmap				= new ArrayList<byte[]>();
		List<byte[]> listArrByteImageLayer				= new ArrayList<byte[]>();
		List<Float> listArrTransImageLayer				= new ArrayList<Float>();
		
		List<Thread> listThreadLayer					= new ArrayList<Thread>();
		final Map<Integer, byte[]> mapArrByteImageLayer	= new HashMap<Integer, byte[]>();
		final List<String> listThreadRSLayer			= new Vector<String>();

		String gmaps	= request.getParameter("gmaps");
		listArrByteImageGmap.add(cargarGoogleMaps(strBbox4326, gmaps, anchoOri, altoOri, anchoOri, altoOri, CadenaUtil.getInte(zoomLevel)));
		
		listArrByteImage					= new ArrayList<byte[]>();
		listArrByteImage.addAll(listArrByteImageGmap);
		listArrByteImage.addAll(listArrByteImageLayer);
		
		byte[] bytImageSeleccion	= new GeotoolsImagen().convertirShapeToImagen(strPoligonoConsulta, anchoOri, altoOri);
		listArrByteImage.add(bytImageSeleccion);

		byte[] bytImageTemp				= ImagenUtil.fuxionarImagenPNG(listArrByteImage, anchoOri, altoOri);

		byte[] bytImage				= ImagenUtil.comprimirImagenJPG(bytImageTemp, anchoOri, altoOri);
		FileOutputStream fos	= null;
		try {
			String strFileTempName	= ""+new Date().getTime();
			String strRutaRepTemp	= ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.REPOSITORIO_DOCS_TEMPORAL);
			File file	= new File(strRutaRepTemp+File.separator+strFileTempName+".jpg");
			if(ActionContext.getContext() != null) {
				Map<String, Object> session		= ActionContext.getContext().getSession();
				session.put("NombreImagenReporteTemp", strFileTempName);
			}
			fos	= new FileOutputStream(file);
			fos.write(bytImage);
			fos.flush();
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			try {fos.close();}catch (Exception ex){}
		}
	}
	public static void main(String args[]){
		try{
			ConsultaAction c	= new ConsultaAction();
			c.setStrPoligonoConsulta("POLYGON((-77.3876953125 -10.390571576337706,-77.3876953125 -13.165073873513023,-75.03662109375 -13.165073873513023,-75.03662109375 -10.390571576337706,-77.3876953125 -10.390571576337706))");
			c.prepararCapasReporteGMaps();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	public void prepararCapasReporteGMaps() throws Exception {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		String strBoxMapaPeru			= "LINESTRING(-81.9580078125 -18.7503098131406,-81.9580078125 0.461420793530621,-68.115234375 0.461420793530621,-68.115234375 -18.7503098131406,-81.9580078125 -18.7503098131406)";
		final String strBbox4326		= consultaACLFuxionService.selectBBOX4326(strBoxMapaPeru);
		int zoom			= CadenaUtil.getInte(5);
		String[] arrBbox	= strBbox4326.split(",");//<xmin>, <ymin>, <xmax>, <ymax>
		//System.out.println("strPoligonoConsulta="+strPoligonoConsulta);
		
		double xmin		= CadenaUtil.getDoub(arrBbox[0]);
		double ymin		= CadenaUtil.getDoub(arrBbox[1]);
		double xmax		= CadenaUtil.getDoub(arrBbox[2]);
		double ymax		= CadenaUtil.getDoub(arrBbox[3]);
		
		double[] arrPixMin	= convertirWorlCoordinateEnPixeles(xmin, ymin, zoom);
		double[] arrPixMax	= convertirWorlCoordinateEnPixeles(xmax, ymax, zoom);
		
		double ylong	= arrPixMax[1] - arrPixMin[1];
		double xlong	= arrPixMax[0] - arrPixMin[0];
		
		int altoOri		= (int)Math.abs(ylong);
		int anchoOri	= (int)Math.abs(xlong);
		
		List<byte[]> listArrByteImage					= null;
		List<byte[]> listArrByteImageGmap				= new ArrayList<byte[]>();
		
		String gmaps	= request.getParameter("gmaps");
//		String gmaps	= "ROADMAP";
		listArrByteImageGmap.add(cargarGoogleMaps(strBbox4326, gmaps, anchoOri, altoOri, anchoOri, altoOri, zoom));
		
		listArrByteImage					= new ArrayList<byte[]>();
		listArrByteImage.addAll(listArrByteImageGmap);
		
		byte[] bytImageSeleccion	= new GeotoolsImagen().convertirShapeToImagen(strBoxMapaPeru, strPoligonoConsulta, anchoOri, altoOri, "#0000FF", 5);
		listArrByteImage.add(bytImageSeleccion);

		byte[] bytImageTemp				= ImagenUtil.fuxionarImagenPNG(listArrByteImage, anchoOri, altoOri);

		byte[] bytImage				= ImagenUtil.comprimirImagenJPG(bytImageTemp, anchoOri, altoOri);
		FileOutputStream fos	= null;
		try {
			String strFileTempName	= ""+new Date().getTime();
			String strRutaRepTemp	= ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.REPOSITORIO_DOCS_TEMPORAL);
			File file	= new File(strRutaRepTemp+File.separator+strFileTempName+".jpg");
			if(ActionContext.getContext() != null) {
				Map<String, Object> session		= ActionContext.getContext().getSession();
				session.put("NombreImagenGMapReporteTemp", strFileTempName);
			}
			fos	= new FileOutputStream(file);
			fos.write(bytImage);
			fos.flush();
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			try {fos.close();}catch (Exception ex){}
		}
	}
	
	public byte[] cargarGoogleApis(int anchoLoad, int altoLoad) throws Exception {
		final String str_Y_X_4326		= consultaACLFuxionService.selectCenter_Y_X_4326(strPoligonoConsulta);
		
		StringBuffer sbUrl			= new StringBuffer();
		double dblAnchoDef			= (double)anchoLoad;
		double dblAltoDef			= (double)altoLoad;
		double dblAnchoLoad			= (double)anchoLoad/1d;
		double dblAltoLoad			= (double)altoLoad/1d;
		double dblFactorReductor	= 1d;
		double dblFactorAumenta		= 1d;
		double maxDim	= Math.max(dblAnchoLoad, dblAltoLoad);
		if(maxDim > 640) {
			dblFactorReductor	= 640d / maxDim;
			dblFactorAumenta	= maxDim / 640d;
		}
		
		sbUrl.append("https://maps.googleapis.com/maps/api/staticmap?");
		sbUrl.append("center="+str_Y_X_4326+"&");
		sbUrl.append("zoom="+(CadenaUtil.getInte(zoomLevel)-1)+"&");
		sbUrl.append("size="+((int)(dblAnchoLoad*dblFactorReductor))+"x"+((int)(dblAltoLoad*dblFactorReductor))+"&");
		sbUrl.append("scale=1&");
		sbUrl.append("maptype=roadmap");
		//System.out.println("sbUrl=("+sbUrl+")");
		
		byte[] arrData	= RedUtil.consultarInternet(sbUrl.toString());
		
		byte[] bytImageLastRS	= null;
		bytImageLastRS	= ImagenUtil.tamanioImagenPNG(arrData, ((int)(dblAnchoDef)), ((int)(dblAltoDef)));
		return bytImageLastRS;
	}
	
	public byte[] cargarGoogleMaps(String strBbox, String gmaps, int anchoOri, int altoOri, int anchoLoad, int altoLoad, int currZoomLevel) throws Exception {
		
		String[] arrBbox	= strBbox.split(",");//<xmin>, <ymin>, <xmax>, <ymax>
		double xmin			= CadenaUtil.getDoub(arrBbox[0]);
		double ymin			= CadenaUtil.getDoub(arrBbox[1]);
		double xmax			= CadenaUtil.getDoub(arrBbox[2]);
		double ymax			= CadenaUtil.getDoub(arrBbox[3]);
		
		double ylong	= ymax - ymin;
		double xlong	= xmax - xmin;
		double factor	= xlong / ylong;
		
		int alto		= altoOri;
		int ancho		= anchoOri;

		final int zoom			= currZoomLevel;
		//System.out.println("zoom="+currZoomLevel);

		final StringBuffer sbUrl	= new StringBuffer();
		
		if(CadenaUtil.getStr(gmaps).equals("ROADMAP")) {
			sbUrl.append("http://mts1.google.com/vt/");//CARTOGRAFICA
		} else if(CadenaUtil.getStr(gmaps).equals("SATELLITE")) {
			sbUrl.append("http://mt1.google.com/vt/lyrs=s&");//satellite 
		} else if(CadenaUtil.getStr(gmaps).equals("HYBRID")) {
			sbUrl.append("http://mt1.google.com/vt/lyrs=y&");//HYBRID
		} else if(CadenaUtil.getStr(gmaps).equals("TERRAIN")) {
			sbUrl.append("http://mt1.google.com/vt/lyrs=p&");//TERRAIN
		} else {
			sbUrl.append("http://mts1.google.com/vt/");//CARTOGRAFICA default
		}
		
		double lng			= 0;
		double lat			= 0;
		double[] tileCoordDifPixMin;
		double[] tileCoordDifPixMax;
		double[] tileCoordDifPixDif;
		
		lng					= xmin;
		lat					= ymax;
		tileCoordDifPixMin	=  convertirTileCoordinate(lng, lat, zoom);

		lng					= xmax;
		lat					= ymin;
		tileCoordDifPixMax	=  convertirTileCoordinate(lng, lat, zoom);

		lng					= xmin;
		lat					= ymax;
		tileCoordDifPixDif	=  convertirWorlCoordinate(lng, lat, zoom);
		
		byte[] bytImage		= null;
		byte[] bytImageLast	= null;
		int intXLast		= 0;
		int intYLast		= 0;
		int intXPrev		= 0;
		int intYPrev		= 0;
		boolean primeraImagen	= true;
		
		List<Thread> listThread						= new ArrayList<Thread>();
		final Map<String, byte[]> mapArrByteImage	= new HashMap<String, byte[]>();
		final List<String> listThreadRS				= new Vector<String>();
		
		for(int x = (int)tileCoordDifPixMin[0];x <= tileCoordDifPixMax[0];x++) {
			for(int y = (int)tileCoordDifPixMin[1];y <= tileCoordDifPixMax[1];y++) {
				final int xPos	= x;
				final int yPos	= y;
				listThread.add(new Thread() {
					public void run() {
						try {
							mapArrByteImage.put(xPos+","+yPos, RedUtil.consultarInternet(sbUrl.toString()+"x="+xPos+"&y="+yPos+"&z="+zoom));
						} catch(Throwable ex) {
							ex.printStackTrace();
						} finally {
							listThreadRS.add("Return_"+xPos+","+yPos);
						}
					}
				});
			}
		}
		for(Thread t:listThread) {
			t.start();
		}
		while(true) {
			synchronized(this) {
				wait(500L);
			}
			if(listThreadRS.size() == listThread.size()) {
				break;
			}
		}
		
		for(int x = (int)tileCoordDifPixMin[0];x <= tileCoordDifPixMax[0];x++) {
			intYLast	= -(int)tileCoordDifPixDif[1];
			intYPrev	= (int)tileCoordDifPixMin[1];
			for(int y = (int)tileCoordDifPixMin[1];y <= tileCoordDifPixMax[1];y++) {
				bytImage	= (byte[])mapArrByteImage.get(x+","+y);
				if(primeraImagen) {
					intXLast	= -(int)tileCoordDifPixDif[0];
					intYLast	= -(int)tileCoordDifPixDif[1];
					bytImageLast	= ImagenUtil.fuxionarImagenPNG(bytImage, intXLast, intYLast, null, 0, 0, ancho, alto);
				} else {
					if(intXPrev != x) {
						intXLast	+= 256;
					}
					if(intYPrev != y) {
						intYLast	+= 256;
					}
					bytImageLast	= ImagenUtil.fuxionarImagenPNG(bytImageLast, 0, 0, bytImage, intXLast, intYLast, ancho, alto);
				}
				primeraImagen	= false;
				intXPrev	= x;
				intYPrev	= y;
			}
		}
		byte[] bytImageLastRS	= null;
		bytImageLastRS	= ImagenUtil.tamanioImagenPNG(bytImageLast, anchoLoad, altoLoad);
		return bytImageLastRS;
	}
	
	public void saveFilePng(byte[] bytImageLast) throws Exception {
		FileOutputStream fos	= null;
		String strFileTempName	= ""+new Date().getTime();
		String strRutaRepTemp	= ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.REPOSITORIO_DOCS_TEMPORAL);
		File file	= new File(strRutaRepTemp+File.separator+"newImagen_"+strFileTempName+".png");
		fos	= new FileOutputStream(file);
		fos.write(bytImageLast);
		fos.flush();
		fos.close();
	}
	public double[] convertirTileCoordinate(double lng, double lat, int zoom) {
		double scale				= 1 << zoom;
		double[] arrWorldCoordinate	= Geotools.project(lng, lat);
		double[] arrPixelCoordinate = new double[]{Math.floor(arrWorldCoordinate[0]/*x*/ * scale), Math.floor(arrWorldCoordinate[1]/*y*/ * scale)};
		double xTileCoord			= Math.floor(arrWorldCoordinate[0]/*x*/ * scale / Geotools.TILE_SIZE);
		double yTileCoord			= Math.floor(arrWorldCoordinate[1]/*y*/ * scale / Geotools.TILE_SIZE);
		return new double[]{xTileCoord, yTileCoord};
	}
	
	public double[] convertirWorlCoordinate(double lng, double lat, int zoom) {
		double scale				= 1 << zoom;
		double[] arrWorldCoordinate	= Geotools.project(lng, lat);
		double[] arrPixelCoordinate = new double[]{Math.floor(arrWorldCoordinate[0]/*x*/ * scale), Math.floor(arrWorldCoordinate[1]/*y*/ * scale)};
		double xTileCoord			= Math.floor(arrWorldCoordinate[0]/*x*/ * scale / Geotools.TILE_SIZE);
		double yTileCoord			= Math.floor(arrWorldCoordinate[1]/*y*/ * scale / Geotools.TILE_SIZE);
		double xTileCoordDif		= (arrWorldCoordinate[0]/*x*/ * scale / Geotools.TILE_SIZE) - xTileCoord;
		double yTileCoordDif		= (arrWorldCoordinate[1]/*y*/ * scale / Geotools.TILE_SIZE) - yTileCoord;

		double xTileCoordDifPix		= xTileCoordDif * Geotools.TILE_SIZE;
		double yTileCoordDifPix		= yTileCoordDif * Geotools.TILE_SIZE;
		return new double[]{xTileCoordDifPix, yTileCoordDifPix};
	}
	
	public static double[] convertirWorlCoordinateEnPixeles(double lng, double lat, int zoom) {
		double scale				= 1 << zoom;
		double[] arrWorldCoordinate	= Geotools.project(lng, lat);
		double[] arrPixelCoordinate = new double[]{Math.floor(arrWorldCoordinate[0]/*x*/ * scale), Math.floor(arrWorldCoordinate[1]/*y*/ * scale)};
		return new double[]{arrPixelCoordinate[0], arrPixelCoordinate[1]};
	}

	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////

 	public String getStrPoligonoConsulta() {
		return strPoligonoConsulta;
	}

	public void setStrPoligonoConsulta(String strPoligonoConsulta) {
		this.strPoligonoConsulta = strPoligonoConsulta;
	}

	public String getListSrlIdCapaConsulta() {
		return listSrlIdCapaConsulta;
	}

	public void setListSrlIdCapaConsulta(String listSrlIdCapaConsulta) {
		this.listSrlIdCapaConsulta = listSrlIdCapaConsulta;
	}

	public String getStrIdCapaConsulta() {
		return strIdCapaConsulta;
	}

	public void setStrIdCapaConsulta(String strIdCapaConsulta) {
		this.strIdCapaConsulta = strIdCapaConsulta;
	}

	public String getZoomLevel() {
		return zoomLevel;
	}

	public void setZoomLevel(String zoomLevel) {
		this.zoomLevel = zoomLevel;
	}

	public String getStrPoligonoConsultaBoundary() {
		return strPoligonoConsultaBoundary;
	}

	public void setStrPoligonoConsultaBoundary(String strPoligonoConsultaBoundary) {
		this.strPoligonoConsultaBoundary = strPoligonoConsultaBoundary;
	}
	
}
