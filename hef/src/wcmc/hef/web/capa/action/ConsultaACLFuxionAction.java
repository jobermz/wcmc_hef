package wcmc.hef.web.capa.action;

import java.io.File;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import wcmc.hef.business.core.configuracion.dto.CapaDto;
import wcmc.hef.business.core.configuracion.dto.CapaUmbralDto;
import wcmc.hef.business.core.configuracion.service.CapaService;
import wcmc.hef.business.core.configuracion.service.CapaUmbralService;

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
import wcmc.hef.business.core.capa.service.TemIndiceImportanciaBiologicaService;
import wcmc.hef.business.core.capa.service.TemProyeccionDensidadPob2015Service;
import wcmc.hef.business.core.capa.service.TemProyectosPoligonosService;
import wcmc.hef.business.core.capa.service.TemProyectosPuntosService;
import wcmc.hef.business.core.capa.service.TemReservasTerritorialesIndigenasService;
import wcmc.hef.business.core.capa.service.TemRiesgoErosionHidricaService;
import wcmc.hef.business.core.capa.service.TemSinanpeAmortiguamientoService;
import wcmc.hef.business.core.capa.service.TemSoeconComunidadesCampesinasService;
import wcmc.hef.business.core.capa.service.TemSoeconSolicitudCreacionReservasTerritorialesService;
import wcmc.hef.business.core.capa.service.TemViaFerreaService;
import wcmc.hef.business.core.capa.service.TemViasTrochasService;
import wcmc.hef.business.core.capa.service.TemZonificPotencialBosqueProduccionPermanenteService;
import wcmc.hef.business.core.capa.service.TemCoberturaBoscosa2014Service;
import wcmc.hef.business.core.capa.service.TemPerdidaBosque20012014Service;
import wcmc.hef.business.core.capa.dto.BasHidroRios100000Dto;
import wcmc.hef.business.core.capa.dto.BeanRasterDto;
import wcmc.hef.business.core.capa.dto.TemConcesionHidroelectricasDistribucionDto;
import wcmc.hef.dao.capa.domain.BasHidroRios100000;
import wcmc.hef.dao.capa.domain.BaseBeanVectorial;
import wcmc.hef.dao.capa.domain.BeanRaster;
import wcmc.hef.dao.capa.domain.ConsultaACLFuxion;
import wcmc.hef.dao.capa.domain.TemConcesionHidroelectricasDistribucion;
import wcmc.hef.business.core.capa.dto.BasHidroRiosLagunasDto;
import wcmc.hef.dao.capa.domain.BasHidroRiosLagunas;
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
import wcmc.hef.business.core.capa.dto.TemCuencasHidrograficasDto;
import wcmc.hef.dao.capa.domain.TemCuencasHidrograficas;
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
import wcmc.hef.dao.configuracion.domain.CapaUmbral;
import wcmc.hef.general.util.CadenaUtil;
import wcmc.hef.general.util.ConfiguracionProperties;
import wcmc.hef.general.util.ImagenUtil;
import wcmc.hef.general.util.RedUtil;
import wcmc.hef.general.util.ServiciosProperties;

public class ConsultaACLFuxionAction extends ActionSupport {
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
	private TemIndiceImportanciaBiologicaService temIndiceImportanciaBiologicaService;

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
	private TemCoberturaBoscosa2014Service temCoberturaBoscosa2014Service;

	@Autowired
	private TemPerdidaBosque20012014Service temPerdidaBosque20012014Service;

	@Autowired
	private TemBiodiversidadEspeciesPeligroExtincionService temBiodiversidadEspeciesPeligroExtincionService;

	@Autowired
	private TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaService temBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaService;

	@Autowired
	private TemDensidadCarbonoAereaService temDensidadCarbonoAereaService;

	@Autowired
	private TemRiesgoErosionHidricaService temRiesgoErosionHidricaService;

	@Autowired
	private CapaService capaService;
	
	@Autowired
	CapaUmbralService capaUmbralService;
	
	@Autowired
	ConsultaACLFuxionService consultaACLFuxionService;
	
	private String strGeometriaRespuesta;
	private String strGeometriaRespuestaBoundary;
	private String listSrlIdCapaConsulta;
	private String listIdDataCapaConsulta;
	private String listIdDataCapaCriConsulta;
	
	private String strIdCapaConsulta;
	private String strPoligonoConsulta;
	
	public ConsultaACLFuxionAction() {
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////
	public String consultar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			strPoligonoConsulta			= CadenaUtil.getStr(strPoligonoConsulta);
			if(!CadenaUtil.getStr(strIdCapaConsulta).equals("")) {
				BaseBeanVectorial baseBeanVectorial		= (BaseBeanVectorial)session.get("beanConsultaCapasRightClick");
				if(baseBeanVectorial != null) {
					strPoligonoConsulta	= baseBeanVectorial.getStrTheGeom();//Proviene de APA
				}
			}
			
			String strHashConsulta	= null;
			if(CadenaUtil.getStrNull(session.get("strHashConsultaACL")) != null) {
				strHashConsulta	= (String)session.get("strHashConsultaACL");
				BeanRasterDto beanRasterDto		= new BeanRasterDto();
				beanRasterDto.setStrHashConsulta(strHashConsulta);
				temDensidadCarbonoAereaService.deleteQueryByUsuario(beanRasterDto);
			}
			
			strHashConsulta			= CadenaUtil.getStr(new Date().getTime());
			session.put("strHashConsultaACL", strHashConsulta);
			List<BaseBeanVectorial> listReporte		= new ArrayList<BaseBeanVectorial>();
			
			String[] arrCons			= listSrlIdCapaConsulta.split(",");
			List<String> listConsulta	= Arrays.asList(arrCons);

			String[] arrIdData			= listIdDataCapaConsulta.split(",");
			List<String> listIdData		= Arrays.asList(arrIdData);

			String[] arrIdDataCri			= listIdDataCapaCriConsulta.split(",");
			List<String> listIdDataCri		= Arrays.asList(arrIdDataCri);
			
			String strSrlIdCapa	= "";
			String strIdData	= "";
			String strIdDataCri	= "";
			Map<String, String> mapServ	= ServiciosProperties.getServiciosByIdList();
			final List<String> listReporteOk		= new ArrayList<String>();
			String strLastServicioConsultado		= "";
			strGeometriaRespuesta					= strPoligonoConsulta;
			List<Runnable> listThreadRids			= new ArrayList<Runnable>();
			final List<String> listThreadRidsRS		= new ArrayList<String>();
			boolean esRaster				= false;
			boolean esPorlomenosUnRaster	= false;
			for(int i = 0;i< listConsulta.size();i++) {
				esRaster		= false;
				strSrlIdCapa	= listConsulta.get(i);
				strIdData		= listIdData.get(i);
				strIdDataCri	= "";
				if(mapServ.get(CadenaUtil.getStr(strSrlIdCapa)) != null) {
					strLastServicioConsultado	= mapServ.get(CadenaUtil.getStr(strSrlIdCapa));
					switch(strLastServicioConsultado) {
					
					case "BasLimProvinciaService":
					{
						try {
							BasLimProvinciaDto basLimProvinciaDto		= new BasLimProvinciaDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								basLimProvinciaDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								BasLimProvincia basLimProvincia		= basLimProvinciaService.buscarGeometryById(basLimProvinciaDto);
								if(basLimProvincia != null) {
									listReporte.add(basLimProvincia);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("BasLimProvinciaService");
						}
						break;
					}
					case "BasLimDepartamentoService":
					{
						try {
							BasLimDepartamentoDto basLimDepartamentoDto		= new BasLimDepartamentoDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								basLimDepartamentoDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								BasLimDepartamento basLimDepartamento		= basLimDepartamentoService.buscarGeometryById(basLimDepartamentoDto);
								if(basLimDepartamento != null) {
									listReporte.add(basLimDepartamento);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("BasLimDepartamentoService");
						}
						break;
					}
					case "BasLimDistritosService":
					{
						try {
							BasLimDistritosDto basLimDistritosDto		= new BasLimDistritosDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								basLimDistritosDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								BasLimDistritos basLimDistritos		= basLimDistritosService.buscarGeometryById(basLimDistritosDto);
								if(basLimDistritos != null) {
									listReporte.add(basLimDistritos);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("BasLimDistritosService");
						}
						break;
					}
					case "BasLimAmazoniaService":
					{
						try {
							BasLimAmazoniaDto basLimAmazoniaDto		= new BasLimAmazoniaDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								basLimAmazoniaDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								BasLimAmazonia basLimAmazonia		= basLimAmazoniaService.buscarGeometryById(basLimAmazoniaDto);
								if(basLimAmazonia != null) {
									listReporte.add(basLimAmazonia);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("BasLimAmazoniaService");
						}
						break;
					}
					case "BasHidroRiosLagunasService":
					{
						try {
							BasHidroRiosLagunasDto basHidroRiosLagunasDto		= new BasHidroRiosLagunasDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								basHidroRiosLagunasDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								BasHidroRiosLagunas basHidroRiosLagunas		= basHidroRiosLagunasService.buscarGeometryById(basHidroRiosLagunasDto);
								if(basHidroRiosLagunas != null) {
									listReporte.add(basHidroRiosLagunas);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("BasHidroRiosLagunasService");
						}
						break;
					}
					case "BasHidroRios100000Service":
					{
						try {
							BasHidroRios100000Dto basHidroRios100000Dto		= new BasHidroRios100000Dto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								basHidroRios100000Dto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								BasHidroRios100000 basHidroRios100000		= basHidroRios100000Service.buscarGeometryById(basHidroRios100000Dto);
								if(basHidroRios100000 != null) {
									listReporte.add(basHidroRios100000);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("BasHidroRios100000Service");
						}
						break;
					}
					case "BasViasRedVialVecinalService":
					{
						try {
							BasViasRedVialVecinalDto basViasRedVialVecinalDto		= new BasViasRedVialVecinalDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								basViasRedVialVecinalDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								BasViasRedVialVecinal basViasRedVialVecinal		= basViasRedVialVecinalService.buscarGeometryById(basViasRedVialVecinalDto);
								if(basViasRedVialVecinal != null) {
									listReporte.add(basViasRedVialVecinal);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("BasViasRedVialVecinalService");
						}
						break;
					}
					case "BasViasRedVialNacionalService":
					{
						try {
							BasViasRedVialNacionalDto basViasRedVialNacionalDto		= new BasViasRedVialNacionalDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								basViasRedVialNacionalDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								BasViasRedVialNacional basViasRedVialNacional		= basViasRedVialNacionalService.buscarGeometryById(basViasRedVialNacionalDto);
								if(basViasRedVialNacional != null) {
									listReporte.add(basViasRedVialNacional);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("BasViasRedVialNacionalService");
						}
						break;
					}
					case "BasViasRedVialDepartamentalService":
					{
						try {
							BasViasRedVialDepartamentalDto basViasRedVialDepartamentalDto		= new BasViasRedVialDepartamentalDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								basViasRedVialDepartamentalDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								BasViasRedVialDepartamental basViasRedVialDepartamental		= basViasRedVialDepartamentalService.buscarGeometryById(basViasRedVialDepartamentalDto);
								if(basViasRedVialDepartamental != null) {
									listReporte.add(basViasRedVialDepartamental);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("BasViasRedVialDepartamentalService");
						}
						break;
					}
					case "TemViaFerreaService":
					{
						try {
							TemViaFerreaDto temViaFerreaDto		= new TemViaFerreaDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temViaFerreaDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemViaFerrea temViaFerrea		= temViaFerreaService.buscarGeometryById(temViaFerreaDto);
								if(temViaFerrea != null) {
									listReporte.add(temViaFerrea);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemViaFerreaService");
						}
						break;
					}
					case "TemViasTrochasService":
					{
						try {
							TemViasTrochasDto temViasTrochasDto		= new TemViasTrochasDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temViasTrochasDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemViasTrochas temViasTrochas		= temViasTrochasService.buscarGeometryById(temViasTrochasDto);
								if(temViasTrochas != null) {
									listReporte.add(temViasTrochas);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemViasTrochasService");
						}
						break;
					}
					case "TemSoeconComunidadesCampesinasTotalesService":
					{
						try {
							TemSoeconComunidadesCampesinasDto temSoeconComunidadesCampesinasDto		= new TemSoeconComunidadesCampesinasDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temSoeconComunidadesCampesinasDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemSoeconComunidadesCampesinas temSoeconComunidadesCampesinas		= temSoeconComunidadesCampesinasService.buscarGeometryById(temSoeconComunidadesCampesinasDto);
								if(temSoeconComunidadesCampesinas != null) {
									listReporte.add(temSoeconComunidadesCampesinas);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemSoeconComunidadesCampesinasService");
						}
						break;
					}
					case "TemComunidadesNativasService":
					{
						try {
							TemComunidadesNativasDto temComunidadesNativasDto		= new TemComunidadesNativasDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temComunidadesNativasDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemComunidadesNativas temComunidadesNativas		= temComunidadesNativasService.buscarGeometryById(temComunidadesNativasDto);
								if(temComunidadesNativas != null) {
									listReporte.add(temComunidadesNativas);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemComunidadesNativasService");
						}
						break;
					}
					case "TemReservasTerritorialesIndigenasService":
					{
						try {
							TemReservasTerritorialesIndigenasDto temReservasTerritorialesIndigenasDto		= new TemReservasTerritorialesIndigenasDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temReservasTerritorialesIndigenasDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemReservasTerritorialesIndigenas temReservasTerritorialesIndigenas		= temReservasTerritorialesIndigenasService.buscarGeometryById(temReservasTerritorialesIndigenasDto);
								if(temReservasTerritorialesIndigenas != null) {
									listReporte.add(temReservasTerritorialesIndigenas);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemReservasTerritorialesIndigenasService");
						}
						break;
					}
					case "TemSoeconSolicitudCreacionReservasTerritorialesService":
					{
						try {
							TemSoeconSolicitudCreacionReservasTerritorialesDto temSoeconSolicitudCreacionReservasTerritorialesDto		= new TemSoeconSolicitudCreacionReservasTerritorialesDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temSoeconSolicitudCreacionReservasTerritorialesDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemSoeconSolicitudCreacionReservasTerritoriales temSoeconSolicitudCreacionReservasTerritoriales		= temSoeconSolicitudCreacionReservasTerritorialesService.buscarGeometryById(temSoeconSolicitudCreacionReservasTerritorialesDto);
								if(temSoeconSolicitudCreacionReservasTerritoriales != null) {
									listReporte.add(temSoeconSolicitudCreacionReservasTerritoriales);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemSoeconSolicitudCreacionReservasTerritorialesService");
						}
						break;
					}
					case "TemConcesionesEcoturismoService":
					{
						try {
							TemConcesionesEcoturismoDto temConcesionesEcoturismoDto		= new TemConcesionesEcoturismoDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temConcesionesEcoturismoDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemConcesionesEcoturismo temConcesionesEcoturismo		= temConcesionesEcoturismoService.buscarGeometryById(temConcesionesEcoturismoDto);
								if(temConcesionesEcoturismo != null) {
									listReporte.add(temConcesionesEcoturismo);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemConcesionesEcoturismoService");
						}
						break;
					}
					case "TemConcesionesForestalesCastaniaService":
					{
						try {
							TemConcesionesForestalesCastaniaDto temConcesionesForestalesCastaniaDto		= new TemConcesionesForestalesCastaniaDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temConcesionesForestalesCastaniaDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemConcesionesForestalesCastania temConcesionesForestalesCastania		= temConcesionesForestalesCastaniaService.buscarGeometryById(temConcesionesForestalesCastaniaDto);
								if(temConcesionesForestalesCastania != null) {
									listReporte.add(temConcesionesForestalesCastania);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemConcesionesForestalesCastaniaService");
						}
						break;
					}
					case "TemConcesionesForestalesConservacionService":
					{
						try {
							TemConcesionesForestalesConservacionDto temConcesionesForestalesConservacionDto		= new TemConcesionesForestalesConservacionDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temConcesionesForestalesConservacionDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemConcesionesForestalesConservacion temConcesionesForestalesConservacion		= temConcesionesForestalesConservacionService.buscarGeometryById(temConcesionesForestalesConservacionDto);
								if(temConcesionesForestalesConservacion != null) {
									listReporte.add(temConcesionesForestalesConservacion);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemConcesionesForestalesConservacionService");
						}
						break;
					}
					case "TemConcesionesForestalesMaderableAdecuadasService":
					{
						try {
							TemConcesionesForestalesMaderableAdecuadasDto temConcesionesForestalesMaderableAdecuadasDto		= new TemConcesionesForestalesMaderableAdecuadasDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temConcesionesForestalesMaderableAdecuadasDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemConcesionesForestalesMaderableAdecuadas temConcesionesForestalesMaderableAdecuadas		= temConcesionesForestalesMaderableAdecuadasService.buscarGeometryById(temConcesionesForestalesMaderableAdecuadasDto);
								if(temConcesionesForestalesMaderableAdecuadas != null) {
									listReporte.add(temConcesionesForestalesMaderableAdecuadas);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemConcesionesForestalesMaderableAdecuadasService");
						}
						break;
					}
					case "TemConcesionesForestalesMaderableConcursoService":
					{
						try {
							TemConcesionesForestalesMaderableConcursoDto temConcesionesForestalesMaderableConcursoDto		= new TemConcesionesForestalesMaderableConcursoDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temConcesionesForestalesMaderableConcursoDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemConcesionesForestalesMaderableConcurso temConcesionesForestalesMaderableConcurso		= temConcesionesForestalesMaderableConcursoService.buscarGeometryById(temConcesionesForestalesMaderableConcursoDto);
								if(temConcesionesForestalesMaderableConcurso != null) {
									listReporte.add(temConcesionesForestalesMaderableConcurso);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemConcesionesForestalesMaderableConcursoService");
						}
						break;
					}
					case "TemConcesionesForestalesManejoFaunaSilvestreService":
					{
						try {
							TemConcesionesForestalesManejoFaunaSilvestreDto temConcesionesForestalesManejoFaunaSilvestreDto		= new TemConcesionesForestalesManejoFaunaSilvestreDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temConcesionesForestalesManejoFaunaSilvestreDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemConcesionesForestalesManejoFaunaSilvestre temConcesionesForestalesManejoFaunaSilvestre		= temConcesionesForestalesManejoFaunaSilvestreService.buscarGeometryById(temConcesionesForestalesManejoFaunaSilvestreDto);
								if(temConcesionesForestalesManejoFaunaSilvestre != null) {
									listReporte.add(temConcesionesForestalesManejoFaunaSilvestre);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemConcesionesForestalesManejoFaunaSilvestreService");
						}
						break;
					}
					case "TemConcesionesForestalesReforestacionService":
					{
						try {
							TemConcesionesForestalesReforestacionDto temConcesionesForestalesReforestacionDto		= new TemConcesionesForestalesReforestacionDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temConcesionesForestalesReforestacionDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemConcesionesForestalesReforestacion temConcesionesForestalesReforestacion		= temConcesionesForestalesReforestacionService.buscarGeometryById(temConcesionesForestalesReforestacionDto);
								if(temConcesionesForestalesReforestacion != null) {
									listReporte.add(temConcesionesForestalesReforestacion);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemConcesionesForestalesReforestacionService");
						}
						break;
					}
					case "TemPrediosRuralesService":
					{
						try {
							TemPrediosRuralesDto temPrediosRuralesDto		= new TemPrediosRuralesDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temPrediosRuralesDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemPrediosRurales temPrediosRurales		= temPrediosRuralesService.buscarGeometryById(temPrediosRuralesDto);
								if(temPrediosRurales != null) {
									listReporte.add(temPrediosRurales);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemPrediosRuralesService");
						}
						break;
					}
					case "TemZonificPotencialBosqueProduccionPermanenteService":
					{
						try {
							TemZonificPotencialBosqueProduccionPermanenteDto temZonificPotencialBosqueProduccionPermanenteDto		= new TemZonificPotencialBosqueProduccionPermanenteDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temZonificPotencialBosqueProduccionPermanenteDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemZonificPotencialBosqueProduccionPermanente temZonificPotencialBosqueProduccionPermanente		= temZonificPotencialBosqueProduccionPermanenteService.buscarGeometryById(temZonificPotencialBosqueProduccionPermanenteDto);
								if(temZonificPotencialBosqueProduccionPermanente != null) {
									listReporte.add(temZonificPotencialBosqueProduccionPermanente);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemZonificPotencialBosqueProduccionPermanenteService");
						}
						break;
					}
					case "TemConcesionHidroelectricasGeneracionService":
					{
						try {
							TemConcesionHidroelectricasGeneracionDto temConcesionHidroelectricasGeneracionDto		= new TemConcesionHidroelectricasGeneracionDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temConcesionHidroelectricasGeneracionDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemConcesionHidroelectricasGeneracion temConcesionHidroelectricasGeneracion		= temConcesionHidroelectricasGeneracionService.buscarGeometryById(temConcesionHidroelectricasGeneracionDto);
								if(temConcesionHidroelectricasGeneracion != null) {
									listReporte.add(temConcesionHidroelectricasGeneracion);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemConcesionHidroelectricasGeneracionService");
						}
						break;
					}
					case "TemConcesionHidroelectricasDistribucionService":
					{
						try {
							TemConcesionHidroelectricasDistribucionDto temConcesionHidroelectricasDistribucionDto		= new TemConcesionHidroelectricasDistribucionDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temConcesionHidroelectricasDistribucionDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemConcesionHidroelectricasDistribucion temConcesionHidroelectricasDistribucion		= temConcesionHidroelectricasDistribucionService.buscarGeometryById(temConcesionHidroelectricasDistribucionDto);
								if(temConcesionHidroelectricasDistribucion != null) {
									listReporte.add(temConcesionHidroelectricasDistribucion);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemConcesionHidroelectricasDistribucionService");
						}
						break;
					}
					case "TemConcesionesMinerasService":
					{
						try {
							TemConcesionesMinerasDto temConcesionesMinerasDto		= new TemConcesionesMinerasDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temConcesionesMinerasDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemConcesionesMineras temConcesionesMineras		= temConcesionesMinerasService.buscarGeometryById(temConcesionesMinerasDto);
								if(temConcesionesMineras != null) {
									listReporte.add(temConcesionesMineras);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemConcesionesMinerasService");
						}
						break;
					}
					case "TemAnpNacionalService":
					{
						try {
							TemAnpNacionalDto temAnpNacionalDto		= new TemAnpNacionalDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temAnpNacionalDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemAnpNacional temAnpNacional		= temAnpNacionalService.buscarGeometryById(temAnpNacionalDto);
								if(temAnpNacional != null) {
									listReporte.add(temAnpNacional);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemAnpNacionalService");
						}
						break;
					}
					case "TemAnpRegionalService":
					{
						try {
							TemAnpRegionalDto temAnpRegionalDto		= new TemAnpRegionalDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temAnpRegionalDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemAnpRegional temAnpRegional		= temAnpRegionalService.buscarGeometryById(temAnpRegionalDto);
								if(temAnpRegional != null) {
									listReporte.add(temAnpRegional);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemAnpRegionalService");
						}
						break;
					}
					case "TemAnpPrivadaService":
					{
						try {
							TemAnpPrivadaDto temAnpPrivadaDto		= new TemAnpPrivadaDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temAnpPrivadaDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemAnpPrivada temAnpPrivada		= temAnpPrivadaService.buscarGeometryById(temAnpPrivadaDto);
								if(temAnpPrivada != null) {
									listReporte.add(temAnpPrivada);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemAnpPrivadaService");
						}
						break;
					}
					case "TemSinanpeAmortiguamientoService":
					{
						try {
							TemSinanpeAmortiguamientoDto temSinanpeAmortiguamientoDto		= new TemSinanpeAmortiguamientoDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temSinanpeAmortiguamientoDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemSinanpeAmortiguamiento temSinanpeAmortiguamiento		= temSinanpeAmortiguamientoService.buscarGeometryById(temSinanpeAmortiguamientoDto);
								if(temSinanpeAmortiguamiento != null) {
									listReporte.add(temSinanpeAmortiguamiento);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemSinanpeAmortiguamientoService");
						}
						break;
					}
					case "TemClaveBiodiversidadService":
					{
						try {
							TemClaveBiodiversidadDto temClaveBiodiversidadDto		= new TemClaveBiodiversidadDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temClaveBiodiversidadDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemClaveBiodiversidad temClaveBiodiversidad		= temClaveBiodiversidadService.buscarGeometryById(temClaveBiodiversidadDto);
								if(temClaveBiodiversidad != null) {
									listReporte.add(temClaveBiodiversidad);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemClaveBiodiversidadService");
						}
						break;
					}
					case "TemHumedalesRamsarService":
					{
						try {
							TemHumedalesRamsarDto temHumedalesRamsarDto		= new TemHumedalesRamsarDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temHumedalesRamsarDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemHumedalesRamsar temHumedalesRamsar		= temHumedalesRamsarService.buscarGeometryById(temHumedalesRamsarDto);
								if(temHumedalesRamsar != null) {
									listReporte.add(temHumedalesRamsar);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemHumedalesRamsarService");
						}
						break;
					}
					case "TemCoverturaVegetal2015Service":
					{
						try {
							TemCoverturaVegetal2015Dto temCoverturaVegetal2015Dto		= new TemCoverturaVegetal2015Dto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temCoverturaVegetal2015Dto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemCoverturaVegetal2015 temCoverturaVegetal2015		= temCoverturaVegetal2015Service.buscarGeometryById(temCoverturaVegetal2015Dto);
								if(temCoverturaVegetal2015 != null) {
									listReporte.add(temCoverturaVegetal2015);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemCoverturaVegetal2015Service");
						}
						break;
					}
					case "TemCarbonoEcozonasService":
					{
						try {
							TemCarbonoEcozonasDto temCarbonoEcozonasDto		= new TemCarbonoEcozonasDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temCarbonoEcozonasDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemCarbonoEcozonas temCarbonoEcozonas		= temCarbonoEcozonasService.buscarGeometryById(temCarbonoEcozonasDto);
								if(temCarbonoEcozonas != null) {
									listReporte.add(temCarbonoEcozonas);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemCarbonoEcozonasService");
						}
						break;
					}
					case "TemIndiceImportanciaBiologicaService":
					{
						try {
							TemIndiceImportanciaBiologicaDto temIndiceImportanciaBiologicaDto		= new TemIndiceImportanciaBiologicaDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temIndiceImportanciaBiologicaDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemIndiceImportanciaBiologica temIndiceImportanciaBiologica		= temIndiceImportanciaBiologicaService.buscarGeometryById(temIndiceImportanciaBiologicaDto);
								if(temIndiceImportanciaBiologica != null) {
									listReporte.add(temIndiceImportanciaBiologica);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemIndiceImportanciaBiologicaService");
						}
						break;
					}
					case "TemCentrosPobladosService":
					{
						try {
							TemCentrosPobladosDto temCentrosPobladosDto		= new TemCentrosPobladosDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temCentrosPobladosDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemCentrosPoblados temCentrosPoblados		= temCentrosPobladosService.buscarGeometryById(temCentrosPobladosDto);
								if(temCentrosPoblados != null) {
									listReporte.add(temCentrosPoblados);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemCentrosPobladosService");
						}
						break;
					}
					case "TemProyeccionDensidadPob2015Service":
					{
						try {
							TemProyeccionDensidadPob2015Dto temProyeccionDensidadPob2015Dto		= new TemProyeccionDensidadPob2015Dto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temProyeccionDensidadPob2015Dto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemProyeccionDensidadPob2015 temProyeccionDensidadPob2015		= temProyeccionDensidadPob2015Service.buscarGeometryById(temProyeccionDensidadPob2015Dto);
								if(temProyeccionDensidadPob2015 != null) {
									listReporte.add(temProyeccionDensidadPob2015);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemProyeccionDensidadPob2015Service");
						}
						break;
					}
					case "TemCostoOportunidadDeforestacionService":
					{
						try {
							TemCostoOportunidadDeforestacionDto temCostoOportunidadDeforestacionDto		= new TemCostoOportunidadDeforestacionDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temCostoOportunidadDeforestacionDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemCostoOportunidadDeforestacion temCostoOportunidadDeforestacion		= temCostoOportunidadDeforestacionService.buscarGeometryById(temCostoOportunidadDeforestacionDto);
								if(temCostoOportunidadDeforestacion != null) {
									listReporte.add(temCostoOportunidadDeforestacion);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemCostoOportunidadDeforestacionService");
						}
						break;
					}
					case "TemProyectosPuntosService":
					{
						try {
							TemProyectosPuntosDto temProyectosPuntosDto		= new TemProyectosPuntosDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temProyectosPuntosDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemProyectosPuntos temProyectosPuntos		= temProyectosPuntosService.buscarGeometryById(temProyectosPuntosDto);
								if(temProyectosPuntos != null) {
									listReporte.add(temProyectosPuntos);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemProyectosPuntosService");
						}
						break;
					}
					case "TemProyectosPoligonosService":
					{
						try {
							TemProyectosPoligonosDto temProyectosPoligonosDto		= new TemProyectosPoligonosDto();
							String[] arrStrIdData			= strIdData.replace('|', '-').split("-");
							for(String strIdDataCurr:arrStrIdData) {
								temProyectosPoligonosDto.setSrlGid(CadenaUtil.getInte(strIdDataCurr));
								TemProyectosPoligonos temProyectosPoligonos		= temProyectosPoligonosService.buscarGeometryById(temProyectosPoligonosDto);
								if(temProyectosPoligonos != null) {
									listReporte.add(temProyectosPoligonos);
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemProyectosPoligonosService");
						}
						break;
					}
					
					///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
					case "TemBiodiversidadEspeciesPeligroExtincionService":
					{
						esRaster	= true;
						try {
							double dblCapaUmbralMin	= 0d;
							double dblCapaUmbralMax	= 0d;
							
							strSrlIdCapa	= listConsulta.get(i);
							strIdData		= listIdData.get(i);
							strIdDataCri	= listIdDataCri.get(i);
							
							Map<String, Double> map		= capaUmbralService.selectCapaUmbralMinMax(CadenaUtil.getInte(strSrlIdCapa));
							if(map.size() > 0) {
								dblCapaUmbralMin		= (Double)map.get("min");
								dblCapaUmbralMax		= (Double)map.get("max");
							}
							
							BeanRasterDto beanRasterDto		= new BeanRasterDto();
							beanRasterDto.setStrHashConsulta(strHashConsulta);
							if(strIdDataCri.equals("preestablecido")) {//Umbrales preestablecidos
								String[] arrStridData	= strIdData.split("-");
								beanRasterDto.setStrRangoConsulta("[rast] >= "+arrStridData[0]+" and [rast] <= "+arrStridData[1]+"");
							} else if(strIdDataCri.equals("mayor")) {//Mayor a
								beanRasterDto.setStrRangoConsulta("[rast] >= "+strIdData+" and [rast] <= "+dblCapaUmbralMax+"");
							} else if(strIdDataCri.equals("menor")) {//Menor a
								beanRasterDto.setStrRangoConsulta("[rast] >= "+dblCapaUmbralMin+" and [rast] <= "+strIdData+"");
							} else if(strIdDataCri.equals("igual")) {//Igual a
								beanRasterDto.setStrRangoConsulta("[rast] = "+strIdData+"");
							} else if(strIdDataCri.equals("rango")) {//Por rango
								String[] arrStridData	= strIdData.split("-");
								beanRasterDto.setStrRangoConsulta("[rast] >= "+arrStridData[0]+" and [rast] <= "+arrStridData[1]+"");
							}
							if(!strGeometriaRespuesta.equals("")) {
								beanRasterDto.setStrPoligonoConsulta(CadenaUtil.getStr(strGeometriaRespuesta));
							} else {
								BasLimAmazoniaDto basLimAmazoniaDto		= new BasLimAmazoniaDto();
								List<BasLimAmazonia> listBasLimAmazonia		= basLimAmazoniaService.buscarGeometry(basLimAmazoniaDto);
								if(listBasLimAmazonia.size() > 0) {
									beanRasterDto.setStrPoligonoConsulta(CadenaUtil.getStr(listBasLimAmazonia.get(0).getStrTheGeom()));
									strGeometriaRespuesta		= listBasLimAmazonia.get(0).getStrTheGeom();
								}
							}
							List<Integer> listRids			= temBiodiversidadEspeciesPeligroExtincionService.selectRidAfectadosByGeometry(beanRasterDto);
							List<Integer> listRidsDiv		= new ArrayList<Integer>();
							int countRids	= 0;
							int startRids	= 0;
							int endRids		= 0;
							for(int m = 0;m < listRids.size();m++) {
								if(countRids >= 20 || (m+1 == listRids.size())) {
									if(m+1 == listRids.size()) {
										listRidsDiv.add(listRids.get(m));
									}
									endRids	= m;
									final int startRidsFinal	= startRids;
									final int endRidsFinal		= endRids;
									final BeanRasterDto currBeanRasterDto	= beanRasterDto.clone();
									currBeanRasterDto.setStrInRids(listRidsDiv.toString());
									listThreadRids.add(new Runnable() {
										public void run() {
											try {
												temBiodiversidadEspeciesPeligroExtincionService.insertGeometryByRangoAndGeometry(currBeanRasterDto);
											} catch(Exception ex) {
												ex.printStackTrace();
											} finally {
												listThreadRidsRS.add("TemBiodiversidadEspeciesPeligroExtincionService ["+startRidsFinal+"-"+endRidsFinal+"]");
											}
										}
									});
									countRids	= 0;
									listRidsDiv	= new ArrayList<Integer>();
									startRids	= m;
								} else {
									listRidsDiv.add(listRids.get(m));
									countRids++;
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							System.out.println("ADD TemBiodiversidadEspeciesPeligroExtincionService");
							listReporteOk.add("TemBiodiversidadEspeciesPeligroExtincionService");
						}
						break;
					}
					case "TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaService":
					{
						esRaster	= true;
						try {
							double dblCapaUmbralMin	= 0d;
							double dblCapaUmbralMax	= 0d;
							
							strSrlIdCapa	= listConsulta.get(i);
							strIdData		= listIdData.get(i);
							strIdDataCri	= listIdDataCri.get(i);
							
							Map<String, Double> map		= capaUmbralService.selectCapaUmbralMinMax(CadenaUtil.getInte(strSrlIdCapa));
							if(map.size() > 0) {
								dblCapaUmbralMin		= (Double)map.get("min");
								dblCapaUmbralMax		= (Double)map.get("max");
							}
							
							BeanRasterDto beanRasterDto		= new BeanRasterDto();
							beanRasterDto.setStrHashConsulta(strHashConsulta);
							if(strIdDataCri.equals("preestablecido")) {//Umbrales preestablecidos
								String[] arrStridData	= strIdData.split("-");
								beanRasterDto.setStrRangoConsulta("[rast] >= "+arrStridData[0]+" and [rast] <= "+arrStridData[1]+"");
							} else if(strIdDataCri.equals("mayor")) {//Mayor a
								beanRasterDto.setStrRangoConsulta("[rast] >= "+strIdData+" and [rast] <= "+dblCapaUmbralMax+"");
							} else if(strIdDataCri.equals("menor")) {//Menor a
								beanRasterDto.setStrRangoConsulta("[rast] >= "+dblCapaUmbralMin+" and [rast] <= "+strIdData+"");
							} else if(strIdDataCri.equals("igual")) {//Igual a
								beanRasterDto.setStrRangoConsulta("[rast] = "+strIdData+"");
							} else if(strIdDataCri.equals("rango")) {//Por rango
								String[] arrStridData	= strIdData.split("-");
								beanRasterDto.setStrRangoConsulta("[rast] >= "+arrStridData[0]+" and [rast] <= "+arrStridData[1]+"");
							}
							if(!strGeometriaRespuesta.equals("")) {
								beanRasterDto.setStrPoligonoConsulta(CadenaUtil.getStr(strGeometriaRespuesta));
							} else {
								BasLimAmazoniaDto basLimAmazoniaDto		= new BasLimAmazoniaDto();
								List<BasLimAmazonia> listBasLimAmazonia		= basLimAmazoniaService.buscarGeometry(basLimAmazoniaDto);
								if(listBasLimAmazonia.size() > 0) {
									beanRasterDto.setStrPoligonoConsulta(CadenaUtil.getStr(listBasLimAmazonia.get(0).getStrTheGeom()));
									strGeometriaRespuesta		= listBasLimAmazonia.get(0).getStrTheGeom();
								}
							}
							List<Integer> listRids			= temBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaService.selectRidAfectadosByGeometry(beanRasterDto);
							List<Integer> listRidsDiv		= new ArrayList<Integer>();
							int countRids	= 0;
							int startRids	= 0;
							int endRids		= 0;
							for(int m = 0;m < listRids.size();m++) {
								if(countRids >= 20 || (m+1 == listRids.size())) {
									if(m+1 == listRids.size()) {
										listRidsDiv.add(listRids.get(m));
									}
									endRids	= m;
									final int startRidsFinal	= startRids;
									final int endRidsFinal		= endRids;
									final BeanRasterDto currBeanRasterDto	= beanRasterDto.clone();
									currBeanRasterDto.setStrInRids(listRidsDiv.toString());
									listThreadRids.add(new Runnable() {
										public void run() {
											try {
												temBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaService.insertGeometryByRangoAndGeometry(currBeanRasterDto);
											} catch(Exception ex) {
												ex.printStackTrace();
											} finally {
												listThreadRidsRS.add("TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaService ["+startRidsFinal+"-"+endRidsFinal+"]");
											}
										}
									});
									countRids	= 0;
									listRidsDiv	= new ArrayList<Integer>();
									startRids	= m;
								} else {
									listRidsDiv.add(listRids.get(m));
									countRids++;
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							System.out.println("ADD TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaService");
							listReporteOk.add("TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaService");
						}
						break;
					}
					case "TemDensidadCarbonoAereaService":
					{
						esRaster	= true;
						try {
							double dblCapaUmbralMin	= 0d;
							double dblCapaUmbralMax	= 0d;
							
							strSrlIdCapa	= listConsulta.get(i);
							strIdData		= listIdData.get(i);
							strIdDataCri	= listIdDataCri.get(i);
							
							Map<String, Double> map		= capaUmbralService.selectCapaUmbralMinMax(CadenaUtil.getInte(strSrlIdCapa));
							if(map.size() > 0) {
								dblCapaUmbralMin		= (Double)map.get("min");
								dblCapaUmbralMax		= (Double)map.get("max");
							}
							
							BeanRasterDto beanRasterDto		= new BeanRasterDto();
							beanRasterDto.setStrHashConsulta(strHashConsulta);
							if(strIdDataCri.equals("preestablecido")) {//Umbrales preestablecidos
								String[] arrStridData	= strIdData.split("-");
								beanRasterDto.setStrRangoConsulta("[rast] >= "+arrStridData[0]+" and [rast] <= "+arrStridData[1]+"");
							} else if(strIdDataCri.equals("mayor")) {//Mayor a
								beanRasterDto.setStrRangoConsulta("[rast] >= "+strIdData+" and [rast] <= "+dblCapaUmbralMax+"");
							} else if(strIdDataCri.equals("menor")) {//Menor a
								beanRasterDto.setStrRangoConsulta("[rast] >= "+dblCapaUmbralMin+" and [rast] <= "+strIdData+"");
							} else if(strIdDataCri.equals("igual")) {//Igual a
								beanRasterDto.setStrRangoConsulta("[rast] = "+strIdData+"");
							} else if(strIdDataCri.equals("rango")) {//Por rango
								String[] arrStridData	= strIdData.split("-");
								beanRasterDto.setStrRangoConsulta("[rast] >= "+arrStridData[0]+" and [rast] <= "+arrStridData[1]+"");
							}
							if(!strGeometriaRespuesta.equals("")) {
								beanRasterDto.setStrPoligonoConsulta(CadenaUtil.getStr(strGeometriaRespuesta));
							} else {
								BasLimAmazoniaDto basLimAmazoniaDto		= new BasLimAmazoniaDto();
								List<BasLimAmazonia> listBasLimAmazonia		= basLimAmazoniaService.buscarGeometry(basLimAmazoniaDto);
								if(listBasLimAmazonia.size() > 0) {
									beanRasterDto.setStrPoligonoConsulta(CadenaUtil.getStr(listBasLimAmazonia.get(0).getStrTheGeom()));
									strGeometriaRespuesta		= listBasLimAmazonia.get(0).getStrTheGeom();
								}
							}
							List<Integer> listRids			= temDensidadCarbonoAereaService.selectRidAfectadosByGeometry(beanRasterDto);
							List<Integer> listRidsDiv		= new ArrayList<Integer>();
							int countRids	= 0;
							int startRids	= 0;
							int endRids		= 0;
							for(int m = 0;m < listRids.size();m++) {
								if(countRids >= 30 || (m+1 == listRids.size())) {
									if(m+1 == listRids.size()) {
										listRidsDiv.add(listRids.get(m));
									}
									endRids	= m;
									final int startRidsFinal	= startRids;
									final int endRidsFinal		= endRids;
									final BeanRasterDto currBeanRasterDto	= beanRasterDto.clone();
									currBeanRasterDto.setStrInRids(listRidsDiv.toString());
									listThreadRids.add(new Runnable() {
										public void run() {
											try {
												temDensidadCarbonoAereaService.insertGeometryByRangoAndGeometry(currBeanRasterDto);
											} catch(Exception ex) {
												ex.printStackTrace();
											} finally {
												listThreadRidsRS.add("TemDensidadCarbonoAereaService ["+startRidsFinal+"-"+endRidsFinal+"]");
											}
										}
									});
									countRids	= 0;
									listRidsDiv	= new ArrayList<Integer>();
									startRids	= m;
								} else {
									listRidsDiv.add(listRids.get(m));
									countRids++;
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							System.out.println("ADD TemDensidadCarbonoAereaService");
							listReporteOk.add("TemDensidadCarbonoAereaService");
						}
						break;
					}
					case "TemRiesgoErosionHidricaService":
					{
						esRaster	= true;
						try {
							double dblCapaUmbralMin	= 0d;
							double dblCapaUmbralMax	= 0d;
							
							strSrlIdCapa	= listConsulta.get(i);
							strIdData		= listIdData.get(i);
							strIdDataCri	= listIdDataCri.get(i);
							
							Map<String, Double> map		= capaUmbralService.selectCapaUmbralMinMax(CadenaUtil.getInte(strSrlIdCapa));
							if(map.size() > 0) {
								dblCapaUmbralMin		= (Double)map.get("min");
								dblCapaUmbralMax		= (Double)map.get("max");
							}
							
							BeanRasterDto beanRasterDto		= new BeanRasterDto();
							beanRasterDto.setStrHashConsulta(strHashConsulta);
							if(strIdDataCri.equals("preestablecido")) {//Umbrales preestablecidos
								String[] arrStridData	= strIdData.split("-");
								beanRasterDto.setStrRangoConsulta("[rast] >= "+arrStridData[0]+" and [rast] <= "+arrStridData[1]+"");
							} else if(strIdDataCri.equals("mayor")) {//Mayor a
								beanRasterDto.setStrRangoConsulta("[rast] >= "+strIdData+" and [rast] <= "+dblCapaUmbralMax+"");
							} else if(strIdDataCri.equals("menor")) {//Menor a
								beanRasterDto.setStrRangoConsulta("[rast] >= "+dblCapaUmbralMin+" and [rast] <= "+strIdData+"");
							} else if(strIdDataCri.equals("igual")) {//Igual a
								beanRasterDto.setStrRangoConsulta("[rast] = "+strIdData+"");
							} else if(strIdDataCri.equals("rango")) {//Por rango
								String[] arrStridData	= strIdData.split("-");
								beanRasterDto.setStrRangoConsulta("[rast] >= "+arrStridData[0]+" and [rast] <= "+arrStridData[1]+"");
							}
							if(!strGeometriaRespuesta.equals("")) {
								beanRasterDto.setStrPoligonoConsulta(CadenaUtil.getStr(strGeometriaRespuesta));
							} else {
								BasLimAmazoniaDto basLimAmazoniaDto		= new BasLimAmazoniaDto();
								List<BasLimAmazonia> listBasLimAmazonia		= basLimAmazoniaService.buscarGeometry(basLimAmazoniaDto);
								if(listBasLimAmazonia.size() > 0) {
									beanRasterDto.setStrPoligonoConsulta(CadenaUtil.getStr(listBasLimAmazonia.get(0).getStrTheGeom()));
									strGeometriaRespuesta		= listBasLimAmazonia.get(0).getStrTheGeom();
								}
							}
							List<Integer> listRids			= temRiesgoErosionHidricaService.selectRidAfectadosByGeometry(beanRasterDto);
							List<Integer> listRidsDiv		= new ArrayList<Integer>();
							int countRids	= 0;
							int startRids	= 0;
							int endRids		= 0;
							for(int m = 0;m < listRids.size();m++) {
								if(countRids >= 20 || (m+1 == listRids.size())) {
									if(m+1 == listRids.size()) {
										listRidsDiv.add(listRids.get(m));
									}
									endRids	= m;
									final int startRidsFinal	= startRids;
									final int endRidsFinal		= endRids;
									final BeanRasterDto currBeanRasterDto	= beanRasterDto.clone();
									currBeanRasterDto.setStrInRids(listRidsDiv.toString());
									listThreadRids.add(new Runnable() {
										public void run() {
											try {
												temRiesgoErosionHidricaService.insertGeometryByRangoAndGeometry(currBeanRasterDto);
											} catch(Exception ex) {
												ex.printStackTrace();
											} finally {
												listThreadRidsRS.add("TemRiesgoErosionHidricaService ["+startRidsFinal+"-"+endRidsFinal+"]");
											}
										}
									});
									countRids	= 0;
									listRidsDiv	= new ArrayList<Integer>();
									startRids	= m;
								} else {
									listRidsDiv.add(listRids.get(m));
									countRids++;
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							System.out.println("ADD TemRiesgoErosionHidricaService");
							listReporteOk.add("TemRiesgoErosionHidricaService");
						}
						break;
					}
					case "TemCoberturaBoscosa2014Service":
					{
						esRaster	= true;
						try {
							double dblCapaUmbralMin	= 0d;
							double dblCapaUmbralMax	= 0d;
							
							strSrlIdCapa	= listConsulta.get(i);
							strIdData		= listIdData.get(i);
							strIdDataCri	= listIdDataCri.get(i);
							
							Map<String, Double> map		= capaUmbralService.selectCapaUmbralMinMax(CadenaUtil.getInte(strSrlIdCapa));
							if(map.size() > 0) {
								dblCapaUmbralMin		= (Double)map.get("min");
								dblCapaUmbralMax		= (Double)map.get("max");
							}
							
							BeanRasterDto beanRasterDto		= new BeanRasterDto();
							beanRasterDto.setStrHashConsulta(strHashConsulta);
							if(strIdDataCri.equals("preestablecido")) {//Umbrales preestablecidos
								String[] arrStridData	= strIdData.split("-");
								beanRasterDto.setStrRangoConsulta("[rast] >= "+arrStridData[0]+" and [rast] <= "+arrStridData[1]+"");
							} else if(strIdDataCri.equals("mayor")) {//Mayor a
								beanRasterDto.setStrRangoConsulta("[rast] >= "+strIdData+" and [rast] <= "+dblCapaUmbralMax+"");
							} else if(strIdDataCri.equals("menor")) {//Menor a
								beanRasterDto.setStrRangoConsulta("[rast] >= "+dblCapaUmbralMin+" and [rast] <= "+strIdData+"");
							} else if(strIdDataCri.equals("igual")) {//Igual a
								beanRasterDto.setStrRangoConsulta("[rast] = "+strIdData+"");
							} else if(strIdDataCri.equals("rango")) {//Por rango
								String[] arrStridData	= strIdData.split("-");
								beanRasterDto.setStrRangoConsulta("[rast] >= "+arrStridData[0]+" and [rast] <= "+arrStridData[1]+"");
							}
							if(!strGeometriaRespuesta.equals("")) {
								beanRasterDto.setStrPoligonoConsulta(CadenaUtil.getStr(strGeometriaRespuesta));
							} else {
								BasLimAmazoniaDto basLimAmazoniaDto		= new BasLimAmazoniaDto();
								List<BasLimAmazonia> listBasLimAmazonia		= basLimAmazoniaService.buscarGeometry(basLimAmazoniaDto);
								if(listBasLimAmazonia.size() > 0) {
									beanRasterDto.setStrPoligonoConsulta(CadenaUtil.getStr(listBasLimAmazonia.get(0).getStrTheGeom()));
									strGeometriaRespuesta		= listBasLimAmazonia.get(0).getStrTheGeom();
								}
							}
							List<Integer> listRids			= temCoberturaBoscosa2014Service.selectRidAfectadosByGeometry(beanRasterDto);
							List<Integer> listRidsDiv		= new ArrayList<Integer>();
							int countRids	= 0;
							int startRids	= 0;
							int endRids		= 0;
							for(int m = 0;m < listRids.size();m++) {
								if(countRids >= 10 || (m+1 == listRids.size())) {
									if(m+1 == listRids.size()) {
										listRidsDiv.add(listRids.get(m));
									}
									endRids	= m;
									final int startRidsFinal	= startRids;
									final int endRidsFinal		= endRids;
									final BeanRasterDto currBeanRasterDto	= beanRasterDto.clone();
									currBeanRasterDto.setStrInRids(listRidsDiv.toString());
									listThreadRids.add(new Runnable() {
										public void run() {
											try {
												temCoberturaBoscosa2014Service.insertGeometryByRangoAndGeometry(currBeanRasterDto);
											} catch(Exception ex) {
												ex.printStackTrace();
											} finally {
												listThreadRidsRS.add("TemCoberturaBoscosa2014Service ["+startRidsFinal+"-"+endRidsFinal+"]");
											}
										}
									});
									countRids	= 0;
									listRidsDiv	= new ArrayList<Integer>();
									startRids	= m;
								} else {
									listRidsDiv.add(listRids.get(m));
									countRids++;
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							System.out.println("ADD TemCoberturaBoscosa2014Service");
							listReporteOk.add("TemCoberturaBoscosa2014Service");
						}
						break;
					}
					case "TemPerdidaBosque20012014":
					{
						esRaster	= true;
						try {
							double dblCapaUmbralMin	= 0d;
							double dblCapaUmbralMax	= 0d;
							
							strSrlIdCapa	= listConsulta.get(i);
							strIdData		= listIdData.get(i);
							strIdDataCri	= listIdDataCri.get(i);
							
							Map<String, Double> map		= capaUmbralService.selectCapaUmbralMinMax(CadenaUtil.getInte(strSrlIdCapa));
							if(map.size() > 0) {
								dblCapaUmbralMin		= (Double)map.get("min");
								dblCapaUmbralMax		= (Double)map.get("max");
							}
							
							BeanRasterDto beanRasterDto		= new BeanRasterDto();
							beanRasterDto.setStrHashConsulta(strHashConsulta);
							if(strIdDataCri.equals("preestablecido")) {//Umbrales preestablecidos
								String[] arrStridData	= strIdData.split("-");
								beanRasterDto.setStrRangoConsulta("[rast] >= "+arrStridData[0]+" and [rast] <= "+arrStridData[1]+"");
							} else if(strIdDataCri.equals("mayor")) {//Mayor a
								beanRasterDto.setStrRangoConsulta("[rast] >= "+strIdData+" and [rast] <= "+dblCapaUmbralMax+"");
							} else if(strIdDataCri.equals("menor")) {//Menor a
								beanRasterDto.setStrRangoConsulta("[rast] >= "+dblCapaUmbralMin+" and [rast] <= "+strIdData+"");
							} else if(strIdDataCri.equals("igual")) {//Igual a
								beanRasterDto.setStrRangoConsulta("[rast] = "+strIdData+"");
							} else if(strIdDataCri.equals("rango")) {//Por rango
								String[] arrStridData	= strIdData.split("-");
								beanRasterDto.setStrRangoConsulta("[rast] >= "+arrStridData[0]+" and [rast] <= "+arrStridData[1]+"");
							}
							if(!strGeometriaRespuesta.equals("")) {
								beanRasterDto.setStrPoligonoConsulta(CadenaUtil.getStr(strGeometriaRespuesta));
							} else {
								BasLimAmazoniaDto basLimAmazoniaDto		= new BasLimAmazoniaDto();
								List<BasLimAmazonia> listBasLimAmazonia		= basLimAmazoniaService.buscarGeometry(basLimAmazoniaDto);
								if(listBasLimAmazonia.size() > 0) {
									beanRasterDto.setStrPoligonoConsulta(CadenaUtil.getStr(listBasLimAmazonia.get(0).getStrTheGeom()));
									strGeometriaRespuesta		= listBasLimAmazonia.get(0).getStrTheGeom();
								}
							}
							List<Integer> listRids			= temPerdidaBosque20012014Service.selectRidAfectadosByGeometry(beanRasterDto);
							List<Integer> listRidsDiv		= new ArrayList<Integer>();
							int countRids	= 0;
							int startRids	= 0;
							int endRids		= 0;
							for(int m = 0;m < listRids.size();m++) {
								if(countRids >= 10 || (m+1 == listRids.size())) {
									if(m+1 == listRids.size()) {
										listRidsDiv.add(listRids.get(m));
									}
									endRids	= m;
									final int startRidsFinal	= startRids;
									final int endRidsFinal		= endRids;
									final BeanRasterDto currBeanRasterDto	= beanRasterDto.clone();
									currBeanRasterDto.setStrInRids(listRidsDiv.toString());
									listThreadRids.add(new Runnable() {
										public void run() {
											try {
												temPerdidaBosque20012014Service.insertGeometryByRangoAndGeometry(currBeanRasterDto);
											} catch(Exception ex) {
												ex.printStackTrace();
											} finally {
												listThreadRidsRS.add("TemPerdidaBosque20012014Service ["+startRidsFinal+"-"+endRidsFinal+"]");
											}
										}
									});
									countRids	= 0;
									listRidsDiv	= new ArrayList<Integer>();
									startRids	= m;
								} else {
									listRidsDiv.add(listRids.get(m));
									countRids++;
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							System.out.println("ADD TemPerdidaBosque20012014Service");
							listReporteOk.add("TemPerdidaBosque20012014Service");
						}
						break;
					}
					}
				}
				if(!esRaster) {
					strGeometriaRespuesta	= evaluarGeometrias(listReporte, strPoligonoConsulta);
					session.put("geometria_"+strHashConsulta, strGeometriaRespuesta);
				} else {
					esPorlomenosUnRaster = true;
				}
			}
			if(esPorlomenosUnRaster) {
				session.put("usar_consulta_acl", "true");
			} else {
				session.put("usar_consulta_acl", "false");
			}
			for(int m = 0;m < listThreadRids.size();m++) {
				new Thread(listThreadRids.get(m)).start();
			}
			while(true) {
				synchronized(this) {
					wait(500L);
				}
				System.out.println("ConsultaACLFuxionAction.consultar(RI:"+listThreadRidsRS.size() +" == TH:"+ listThreadRids.size()+")"); 
				if(listThreadRidsRS.size() == listThreadRids.size()) {
					break;
				}
			}
			if(!CadenaUtil.getStr(strGeometriaRespuesta).equals("")) {
				strGeometriaRespuestaBoundary	= consultaACLFuxionService.selectBoundary(strGeometriaRespuesta);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return SUCCESS;
	}
	
	public String evaluarGeometrias(List<BaseBeanVectorial> listReporte, String strPoligonoConsulta) {
		ConsultaACLFuxion consultaACLFuxion		= new ConsultaACLFuxion();
		String strGeomRS	= "";
		String strGeom01	= "";
		BaseBeanVectorial baseBeanVectorial		= null;
		String strBaseBeanVectorial		= null;
		List<String> listReporteStr	= new ArrayList<String>();
		if(CadenaUtil.getStrNull(strPoligonoConsulta) != null) {
			listReporteStr.add(strPoligonoConsulta);
		}
		for(int i = 0;i < listReporte.size();i++) {
			baseBeanVectorial	= listReporte.get(i);
			listReporteStr.add(baseBeanVectorial.getStrTheGeom());
		}
		if(listReporteStr.size() > 1) {
			strGeom01	= listReporteStr.get(0);
			for(int i = 1;i < listReporteStr.size();i++) {
				strBaseBeanVectorial	= listReporteStr.get(i);
				consultaACLFuxion.setStrGeom01(strGeom01);
				consultaACLFuxion.setStrGeom02(strBaseBeanVectorial);
				strGeomRS	= consultaACLFuxionService.selectFuxion(consultaACLFuxion);
				strGeom01	= strGeomRS;
			}
		} else if(listReporteStr.size() == 1) {
			strGeomRS	= listReporteStr.get(0);
		}
		return strGeomRS;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////

	public String getListSrlIdCapaConsulta() {
		return listSrlIdCapaConsulta;
	}

	public void setListSrlIdCapaConsulta(String listSrlIdCapaConsulta) {
		this.listSrlIdCapaConsulta = listSrlIdCapaConsulta;
	}

	public String getListIdDataCapaConsulta() {
		return listIdDataCapaConsulta;
	}

	public void setListIdDataCapaConsulta(String listIdDataCapaConsulta) {
		this.listIdDataCapaConsulta = listIdDataCapaConsulta;
	}

	public String getStrGeometriaRespuesta() {
		return strGeometriaRespuesta;
	}

	public void setStrGeometriaRespuesta(String strGeometriaRespuesta) {
		this.strGeometriaRespuesta = strGeometriaRespuesta;
	}

	public String getListIdDataCapaCriConsulta() {
		return listIdDataCapaCriConsulta;
	}

	public void setListIdDataCapaCriConsulta(String listIdDataCapaCriConsulta) {
		this.listIdDataCapaCriConsulta = listIdDataCapaCriConsulta;
	}

	
	public String getStrGeometriaRespuestaBoundary() {
		return strGeometriaRespuestaBoundary;
	}
	

	public void setStrGeometriaRespuestaBoundary(
			String strGeometriaRespuestaBoundary) {
		this.strGeometriaRespuestaBoundary = strGeometriaRespuestaBoundary;
	}

	public String getStrIdCapaConsulta() {
		return strIdCapaConsulta;
	}

	public void setStrIdCapaConsulta(String strIdCapaConsulta) {
		this.strIdCapaConsulta = strIdCapaConsulta;
	}

	public String getStrPoligonoConsulta() {
		return strPoligonoConsulta;
	}

	public void setStrPoligonoConsulta(String strPoligonoConsulta) {
		this.strPoligonoConsulta = strPoligonoConsulta;
	}

	
}
