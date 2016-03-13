package wcmc.hef.web.capa.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

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
import wcmc.hef.business.core.capa.service.TemCuencasHidrograficasService;
import wcmc.hef.business.core.capa.service.TemDensidadCarbonoAereaService;
import wcmc.hef.business.core.capa.service.TemHumedalesRamsarService;
import wcmc.hef.business.core.capa.service.TemIndiceImportanciaBiologicaService;
import wcmc.hef.business.core.capa.service.TemPrediosRuralesService;
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
import wcmc.hef.business.core.capa.dto.BasHidroRios100000Dto;
import wcmc.hef.business.core.capa.dto.BaseBeanVectorialDto;
import wcmc.hef.business.core.capa.dto.BeanRasterDto;
import wcmc.hef.dao.capa.domain.BasHidroRios100000;
import wcmc.hef.dao.capa.domain.BaseBeanVectorial;
import wcmc.hef.dao.capa.domain.BeanRaster;
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
import wcmc.hef.dao.configuracion.domain.CapaUmbral;
import wcmc.hef.general.util.CadenaUtil;
import wcmc.hef.general.util.ConfiguracionProperties;
import wcmc.hef.general.util.ServiciosProperties;

public class ConsultaRightClickAction extends ActionSupport {
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
	private TemCuencasHidrograficasService temCuencasHidrograficasService;

	@Autowired
	private TemHumedalesRamsarService temHumedalesRamsarService;

	@Autowired
	private TemIndiceImportanciaBiologicaService temIndiceImportanciaBiologicaService;

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
	private TemRiesgoErosionHidricaService temRiesgoErosionHidricaService;

	@Autowired
	private CapaService capaService;
	
	@Autowired
	CapaUmbralService capaUmbralService;
	
	private String strPoligonoConsulta;
	private String strIdCapaConsulta;
	private String listSrlIdCapaConsulta;
	public ConsultaRightClickAction() {
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////
	public String consultar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			BaseBeanVectorial baseBeanVectorial	= null;
			Map<String, Object> mapReporte		= new HashMap<String, Object>();
			String[] arrCons	= listSrlIdCapaConsulta.split(",");
			List<String> listConsulta	= Arrays.asList(arrCons);
			Map<String, String> mapServ	= ServiciosProperties.getServiciosByIdList();
			final List<String> listReporteOk	= new ArrayList<String>();
			String strLastServicioConsultado	= "";
			for(String strSrlIdCapa:listConsulta) {
				if(mapServ.get(CadenaUtil.getStr(strSrlIdCapa)) != null) {
					strLastServicioConsultado	= mapServ.get(CadenaUtil.getStr(strSrlIdCapa));
					switch(mapServ.get(CadenaUtil.getStr(strSrlIdCapa))) {
					case "BasHidroRios100000Service":
					{
						try {
							BasHidroRios100000Dto basHidroRios100000Dto		= new BasHidroRios100000Dto();
							basHidroRios100000Dto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<BasHidroRios100000> listBasHidroRios100000		= basHidroRios100000Service.buscarGeometry(basHidroRios100000Dto);
							if(listBasHidroRios100000.size() > 0) {
								baseBeanVectorial	= listBasHidroRios100000.get(0);
								mapReporte.put("listBasHidroRios100000", listBasHidroRios100000);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("BasHidroRios100000Service");
						}
						break;
					}
					case "BasHidroRiosLagunasService":
					{
						try {
							BasHidroRiosLagunasDto basHidroRiosLagunasDto		= new BasHidroRiosLagunasDto();
							basHidroRiosLagunasDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<BasHidroRiosLagunas> listBasHidroRiosLagunas		= basHidroRiosLagunasService.buscarGeometry(basHidroRiosLagunasDto);
							if(listBasHidroRiosLagunas.size() > 0) {
								baseBeanVectorial	= listBasHidroRiosLagunas.get(0);
								mapReporte.put("listBasHidroRiosLagunas", listBasHidroRiosLagunas);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("BasHidroRiosLagunasService");
						}
						break;
					}
					case "BasLimAmazoniaService":
					{
						try {
							BasLimAmazoniaDto basLimAmazoniaDto		= new BasLimAmazoniaDto();
							basLimAmazoniaDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<BasLimAmazonia> listBasLimAmazonia		= basLimAmazoniaService.buscarGeometry(basLimAmazoniaDto);
							if(listBasLimAmazonia.size() > 0) {
								baseBeanVectorial	= listBasLimAmazonia.get(0);
								mapReporte.put("listBasLimAmazonia", listBasLimAmazonia);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("BasLimAmazoniaService");
						}
						break;
					}
					case "BasLimDepartamentoService":
					{
						try {
							BasLimDepartamentoDto basLimDepartamentoDto		= new BasLimDepartamentoDto();
							basLimDepartamentoDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<BasLimDepartamento> listBasLimDepartamento		= basLimDepartamentoService.buscarGeometry(basLimDepartamentoDto);
							if(listBasLimDepartamento.size() > 0) {
								baseBeanVectorial	= listBasLimDepartamento.get(0);
								mapReporte.put("listBasLimDepartamento", listBasLimDepartamento);
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
							basLimDistritosDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<BasLimDistritos> listBasLimDistritos		= basLimDistritosService.buscarGeometry(basLimDistritosDto);
							if(listBasLimDistritos.size() > 0) {
								baseBeanVectorial	= listBasLimDistritos.get(0);
								mapReporte.put("listBasLimDistritos", listBasLimDistritos);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("BasLimDistritosService");
						}
						break;
					}
					case "BasLimProvinciaService":
					{
						try {
							BasLimProvinciaDto basLimProvinciaDto		= new BasLimProvinciaDto();
							basLimProvinciaDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<BasLimProvincia> listBasLimProvincia		= basLimProvinciaService.buscarGeometry(basLimProvinciaDto);
							if(listBasLimProvincia.size() > 0) {
								baseBeanVectorial	= listBasLimProvincia.get(0);
								mapReporte.put("listBasLimProvincia", listBasLimProvincia);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("BasLimProvinciaService");
						}
						break;
					}
					case "BasViasRedVialDepartamentalService":
					{
						try {
							BasViasRedVialDepartamentalDto basViasRedVialDepartamentalDto		= new BasViasRedVialDepartamentalDto();
							basViasRedVialDepartamentalDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<BasViasRedVialDepartamental> listBasViasRedVialDepartamental		= basViasRedVialDepartamentalService.buscarGeometry(basViasRedVialDepartamentalDto);
							if(listBasViasRedVialDepartamental.size() > 0) {
								baseBeanVectorial	= listBasViasRedVialDepartamental.get(0);
								mapReporte.put("listBasViasRedVialDepartamental", listBasViasRedVialDepartamental);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("BasViasRedVialDepartamentalService");
						}
						break;
					}
					case "BasViasRedVialNacionalService":
					{
						try {
							BasViasRedVialNacionalDto basViasRedVialNacionalDto		= new BasViasRedVialNacionalDto();
							basViasRedVialNacionalDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<BasViasRedVialNacional> listBasViasRedVialNacional		= basViasRedVialNacionalService.buscarGeometry(basViasRedVialNacionalDto);
							if(listBasViasRedVialNacional.size() > 0) {
								baseBeanVectorial	= listBasViasRedVialNacional.get(0);
								mapReporte.put("listBasViasRedVialNacional", listBasViasRedVialNacional);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("BasViasRedVialNacionalService");
						}
						break;
					}
					case "BasViasRedVialVecinalService":
					{
						try {
							BasViasRedVialVecinalDto basViasRedVialVecinalDto		= new BasViasRedVialVecinalDto();
							basViasRedVialVecinalDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<BasViasRedVialVecinal> listBasViasRedVialVecinal		= basViasRedVialVecinalService.buscarGeometry(basViasRedVialVecinalDto);
							if(listBasViasRedVialVecinal.size() > 0) {
								baseBeanVectorial	= listBasViasRedVialVecinal.get(0);
								mapReporte.put("listBasViasRedVialVecinal", listBasViasRedVialVecinal);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("BasViasRedVialVecinalService");
						}
						break;
					}
					case "TemAnpNacionalService":
					{
						try {
							TemAnpNacionalDto temAnpNacionalDto		= new TemAnpNacionalDto();
							temAnpNacionalDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemAnpNacional> listTemAnpNacional		= temAnpNacionalService.buscarGeometry(temAnpNacionalDto);
							if(listTemAnpNacional.size() > 0) {
								baseBeanVectorial	= listTemAnpNacional.get(0);
								mapReporte.put("listTemAnpNacional", listTemAnpNacional);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemAnpNacionalService");
						}
						break;
					}
					case "TemAnpPrivadaService":
					{
						try {
							TemAnpPrivadaDto temAnpPrivadaDto		= new TemAnpPrivadaDto();
							temAnpPrivadaDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemAnpPrivada> listTemAnpPrivada		= temAnpPrivadaService.buscarGeometry(temAnpPrivadaDto);
							if(listTemAnpPrivada.size() > 0) {
								baseBeanVectorial	= listTemAnpPrivada.get(0);
								mapReporte.put("listTemAnpPrivada", listTemAnpPrivada);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemAnpPrivadaService");
						}
						break;
					}
					case "TemAnpRegionalService":
					{
						try {
							TemAnpRegionalDto temAnpRegionalDto		= new TemAnpRegionalDto();
							temAnpRegionalDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemAnpRegional> listTemAnpRegional		= temAnpRegionalService.buscarGeometry(temAnpRegionalDto);
							if(listTemAnpRegional.size() > 0) {
								baseBeanVectorial	= listTemAnpRegional.get(0);
								mapReporte.put("listTemAnpRegional", listTemAnpRegional);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemAnpRegionalService");
						}
						break;
					}
					case "TemCarbonoEcozonasService":
					{
						try {
							TemCarbonoEcozonasDto temCarbonoEcozonasDto		= new TemCarbonoEcozonasDto();
							temCarbonoEcozonasDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemCarbonoEcozonas> listTemCarbonoEcozonas		= temCarbonoEcozonasService.buscarGeometry(temCarbonoEcozonasDto);
							if(listTemCarbonoEcozonas.size() > 0) {
								baseBeanVectorial	= listTemCarbonoEcozonas.get(0);
								mapReporte.put("listTemCarbonoEcozonas", listTemCarbonoEcozonas);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemCarbonoEcozonasService");
						}
						break;
					}
					case "TemCentrosPobladosService":
					{
						try {
							TemCentrosPobladosDto temCentrosPobladosDto		= new TemCentrosPobladosDto();
							temCentrosPobladosDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemCentrosPoblados> listTemCentrosPoblados		= temCentrosPobladosService.buscarGeometry(temCentrosPobladosDto);
							if(listTemCentrosPoblados.size() > 0) {
								baseBeanVectorial	= listTemCentrosPoblados.get(0);
								mapReporte.put("listTemCentrosPoblados", listTemCentrosPoblados);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemCentrosPobladosService");
						}
						break;
					}
					case "TemClaveBiodiversidadService":
					{
						try {
							TemClaveBiodiversidadDto temClaveBiodiversidadDto		= new TemClaveBiodiversidadDto();
							temClaveBiodiversidadDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemClaveBiodiversidad> listTemClaveBiodiversidad		= temClaveBiodiversidadService.buscarGeometry(temClaveBiodiversidadDto);
							if(listTemClaveBiodiversidad.size() > 0) {
								baseBeanVectorial	= listTemClaveBiodiversidad.get(0);
								mapReporte.put("listTemClaveBiodiversidad", listTemClaveBiodiversidad);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemClaveBiodiversidadService");
						}
						break;
					}
					case "TemComunidadesNativasService":
					{
						try {
							TemComunidadesNativasDto temComunidadesNativasDto		= new TemComunidadesNativasDto();
							temComunidadesNativasDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemComunidadesNativas> listTemComunidadesNativas		= temComunidadesNativasService.buscarGeometry(temComunidadesNativasDto);
							if(listTemComunidadesNativas.size() > 0) {
								baseBeanVectorial	= listTemComunidadesNativas.get(0);
								mapReporte.put("listTemComunidadesNativas", listTemComunidadesNativas);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemComunidadesNativasService");
						}
						break;
					}
					case "TemConcesionesEcoturismoService":
					{
						try {
							TemConcesionesEcoturismoDto temConcesionesEcoturismoDto		= new TemConcesionesEcoturismoDto();
							temConcesionesEcoturismoDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemConcesionesEcoturismo> listTemConcesionesEcoturismo		= temConcesionesEcoturismoService.buscarGeometry(temConcesionesEcoturismoDto);
							if(listTemConcesionesEcoturismo.size() > 0) {
								baseBeanVectorial	= listTemConcesionesEcoturismo.get(0);
								mapReporte.put("listTemConcesionesEcoturismo", listTemConcesionesEcoturismo);
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
							temConcesionesForestalesCastaniaDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemConcesionesForestalesCastania> listTemConcesionesForestalesCastania		= temConcesionesForestalesCastaniaService.buscarGeometry(temConcesionesForestalesCastaniaDto);
							if(listTemConcesionesForestalesCastania.size() > 0) {
								baseBeanVectorial	= listTemConcesionesForestalesCastania.get(0);
								mapReporte.put("listTemConcesionesForestalesCastania", listTemConcesionesForestalesCastania);
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
							temConcesionesForestalesConservacionDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemConcesionesForestalesConservacion> listTemConcesionesForestalesConservacion		= temConcesionesForestalesConservacionService.buscarGeometry(temConcesionesForestalesConservacionDto);
							if(listTemConcesionesForestalesConservacion.size() > 0) {
								baseBeanVectorial	= listTemConcesionesForestalesConservacion.get(0);
								mapReporte.put("listTemConcesionesForestalesConservacion", listTemConcesionesForestalesConservacion);
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
							temConcesionesForestalesMaderableAdecuadasDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemConcesionesForestalesMaderableAdecuadas> listTemConcesionesForestalesMaderableAdecuadas		= temConcesionesForestalesMaderableAdecuadasService.buscarGeometry(temConcesionesForestalesMaderableAdecuadasDto);
							if(listTemConcesionesForestalesMaderableAdecuadas.size() > 0) {
								baseBeanVectorial	= listTemConcesionesForestalesMaderableAdecuadas.get(0);
								mapReporte.put("listTemConcesionesForestalesMaderableAdecuadas", listTemConcesionesForestalesMaderableAdecuadas);
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
							temConcesionesForestalesMaderableConcursoDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemConcesionesForestalesMaderableConcurso> listTemConcesionesForestalesMaderableConcurso		= temConcesionesForestalesMaderableConcursoService.buscarGeometry(temConcesionesForestalesMaderableConcursoDto);
							if(listTemConcesionesForestalesMaderableConcurso.size() > 0) {
								baseBeanVectorial	= listTemConcesionesForestalesMaderableConcurso.get(0);
								mapReporte.put("listTemConcesionesForestalesMaderableConcurso", listTemConcesionesForestalesMaderableConcurso);
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
							temConcesionesForestalesManejoFaunaSilvestreDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemConcesionesForestalesManejoFaunaSilvestre> listTemConcesionesForestalesManejoFaunaSilvestre		= temConcesionesForestalesManejoFaunaSilvestreService.buscarGeometry(temConcesionesForestalesManejoFaunaSilvestreDto);
							if(listTemConcesionesForestalesManejoFaunaSilvestre.size() > 0) {
								baseBeanVectorial	= listTemConcesionesForestalesManejoFaunaSilvestre.get(0);
								mapReporte.put("listTemConcesionesForestalesManejoFaunaSilvestre", listTemConcesionesForestalesManejoFaunaSilvestre);
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
							temConcesionesForestalesReforestacionDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemConcesionesForestalesReforestacion> listTemConcesionesForestalesReforestacion		= temConcesionesForestalesReforestacionService.buscarGeometry(temConcesionesForestalesReforestacionDto);
							if(listTemConcesionesForestalesReforestacion.size() > 0) {
								baseBeanVectorial	= listTemConcesionesForestalesReforestacion.get(0);
								mapReporte.put("listTemConcesionesForestalesReforestacion", listTemConcesionesForestalesReforestacion);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemConcesionesForestalesReforestacionService");
						}
						break;
					}
					case "TemConcesionesMinerasService":
					{
						try {
							TemConcesionesMinerasDto temConcesionesMinerasDto		= new TemConcesionesMinerasDto();
							temConcesionesMinerasDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemConcesionesMineras> listTemConcesionesMineras		= temConcesionesMinerasService.buscarGeometry(temConcesionesMinerasDto);
							if(listTemConcesionesMineras.size() > 0) {
								baseBeanVectorial	= listTemConcesionesMineras.get(0);
								mapReporte.put("listTemConcesionesMineras", listTemConcesionesMineras);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemConcesionesMinerasService");
						}
						break;
					}
					case "TemConcesionHidroelectricasGeneracionService":
					{
						try {
							TemConcesionHidroelectricasGeneracionDto temConcesionHidroelectricasGeneracionDto		= new TemConcesionHidroelectricasGeneracionDto();
							temConcesionHidroelectricasGeneracionDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemConcesionHidroelectricasGeneracion> listTemConcesionHidroelectricasGeneracion		= temConcesionHidroelectricasGeneracionService.buscarGeometry(temConcesionHidroelectricasGeneracionDto);
							if(listTemConcesionHidroelectricasGeneracion.size() > 0) {
								baseBeanVectorial	= listTemConcesionHidroelectricasGeneracion.get(0);
								mapReporte.put("listTemConcesionHidroelectricasGeneracion", listTemConcesionHidroelectricasGeneracion);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemConcesionHidroelectricasGeneracionService");
						}
						break;
					}
					case "TemCostoOportunidadDeforestacionService":
					{
						try {
							TemCostoOportunidadDeforestacionDto temCostoOportunidadDeforestacionDto		= new TemCostoOportunidadDeforestacionDto();
							temCostoOportunidadDeforestacionDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemCostoOportunidadDeforestacion> listTemCostoOportunidadDeforestacion		= temCostoOportunidadDeforestacionService.buscarGeometry(temCostoOportunidadDeforestacionDto);
							if(listTemCostoOportunidadDeforestacion.size() > 0) {
								baseBeanVectorial	= listTemCostoOportunidadDeforestacion.get(0);
								mapReporte.put("listTemCostoOportunidadDeforestacion", listTemCostoOportunidadDeforestacion);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemCostoOportunidadDeforestacionService");
						}
						break;
					}
					case "TemCoverturaVegetal2015Service":
					{
						try {
							TemCoverturaVegetal2015Dto temCoverturaVegetal2015Dto		= new TemCoverturaVegetal2015Dto();
							temCoverturaVegetal2015Dto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemCoverturaVegetal2015> listTemCoverturaVegetal2015		= temCoverturaVegetal2015Service.buscarGeometry(temCoverturaVegetal2015Dto);
							if(listTemCoverturaVegetal2015.size() > 0) {
								baseBeanVectorial	= listTemCoverturaVegetal2015.get(0);
								mapReporte.put("listTemCoverturaVegetal2015", listTemCoverturaVegetal2015);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemCoverturaVegetal2015Service");
						}
						break;
					}
					case "TemCuencasHidrograficasService":
					{
						try {
							TemCuencasHidrograficasDto temCuencasHidrograficasDto		= new TemCuencasHidrograficasDto();
							temCuencasHidrograficasDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemCuencasHidrograficas> listTemCuencasHidrograficas		= temCuencasHidrograficasService.buscarGeometry(temCuencasHidrograficasDto);
							if(listTemCuencasHidrograficas.size() > 0) {
								baseBeanVectorial	= listTemCuencasHidrograficas.get(0);
								mapReporte.put("listTemCuencasHidrograficas", listTemCuencasHidrograficas);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemCuencasHidrograficasService");
						}
						break;
					}
					case "TemHumedalesRamsarService":
					{
						try {
							TemHumedalesRamsarDto temHumedalesRamsarDto		= new TemHumedalesRamsarDto();
							temHumedalesRamsarDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemHumedalesRamsar> listTemHumedalesRamsar		= temHumedalesRamsarService.buscarGeometry(temHumedalesRamsarDto);
							if(listTemHumedalesRamsar.size() > 0) {
								baseBeanVectorial	= listTemHumedalesRamsar.get(0);
								mapReporte.put("listTemHumedalesRamsar", listTemHumedalesRamsar);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemHumedalesRamsarService");
						}
						break;
					}
					case "TemIndiceImportanciaBiologicaService":
					{
						try {
							TemIndiceImportanciaBiologicaDto temIndiceImportanciaBiologicaDto		= new TemIndiceImportanciaBiologicaDto();
							temIndiceImportanciaBiologicaDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemIndiceImportanciaBiologica> listTemIndiceImportanciaBiologica		= temIndiceImportanciaBiologicaService.buscarGeometry(temIndiceImportanciaBiologicaDto);
							if(listTemIndiceImportanciaBiologica.size() > 0) {
								baseBeanVectorial	= listTemIndiceImportanciaBiologica.get(0);
								mapReporte.put("listTemIndiceImportanciaBiologica", listTemIndiceImportanciaBiologica);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemIndiceImportanciaBiologicaService");
						}
						break;
					}
					case "TemPrediosRuralesService":
					{
						try {
							TemPrediosRuralesDto temPrediosRuralesDto		= new TemPrediosRuralesDto();
							temPrediosRuralesDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemPrediosRurales> listTemPrediosRurales		= temPrediosRuralesService.buscarGeometry(temPrediosRuralesDto);
							if(listTemPrediosRurales.size() > 0) {
								baseBeanVectorial	= listTemPrediosRurales.get(0);
								mapReporte.put("listTemPrediosRurales", listTemPrediosRurales);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemPrediosRuralesService");
						}
						break;
					}
					case "TemProyeccionDensidadPob2015Service":
					{
						try {
							TemProyeccionDensidadPob2015Dto temProyeccionDensidadPob2015Dto		= new TemProyeccionDensidadPob2015Dto();
							temProyeccionDensidadPob2015Dto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemProyeccionDensidadPob2015> listTemProyeccionDensidadPob2015		= temProyeccionDensidadPob2015Service.buscarGeometry(temProyeccionDensidadPob2015Dto);
							if(listTemProyeccionDensidadPob2015.size() > 0) {
								baseBeanVectorial	= listTemProyeccionDensidadPob2015.get(0);
								mapReporte.put("listTemProyeccionDensidadPob2015", listTemProyeccionDensidadPob2015);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemProyeccionDensidadPob2015Service");
						}
						break;
					}
					case "TemProyectosPoligonosService":
					{
						try {
							TemProyectosPoligonosDto temProyectosPoligonosDto		= new TemProyectosPoligonosDto();
							temProyectosPoligonosDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemProyectosPoligonos> listTemProyectosPoligonos		= temProyectosPoligonosService.buscarGeometry(temProyectosPoligonosDto);
							if(listTemProyectosPoligonos.size() > 0) {
								baseBeanVectorial	= listTemProyectosPoligonos.get(0);
								mapReporte.put("listTemProyectosPoligonos", listTemProyectosPoligonos);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemProyectosPoligonosService");
						}
						break;
					}
					case "TemProyectosPuntosService":
					{
						try {
							TemProyectosPuntosDto temProyectosPuntosDto		= new TemProyectosPuntosDto();
							temProyectosPuntosDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemProyectosPuntos> listTemProyectosPuntos		= temProyectosPuntosService.buscarGeometry(temProyectosPuntosDto);
							if(listTemProyectosPuntos.size() > 0) {
								baseBeanVectorial	= listTemProyectosPuntos.get(0);
								mapReporte.put("listTemProyectosPuntos", listTemProyectosPuntos);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemProyectosPuntosService");
						}
						break;
					}
					case "TemReservasTerritorialesIndigenasService":
					{
						try {
							TemReservasTerritorialesIndigenasDto temReservasTerritorialesIndigenasDto		= new TemReservasTerritorialesIndigenasDto();
							temReservasTerritorialesIndigenasDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemReservasTerritorialesIndigenas> listTemReservasTerritorialesIndigenas		= temReservasTerritorialesIndigenasService.buscarGeometry(temReservasTerritorialesIndigenasDto);
							if(listTemReservasTerritorialesIndigenas.size() > 0) {
								baseBeanVectorial	= listTemReservasTerritorialesIndigenas.get(0);
								mapReporte.put("listTemReservasTerritorialesIndigenas", listTemReservasTerritorialesIndigenas);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemReservasTerritorialesIndigenasService");
						}
						break;
					}
					case "TemSinanpeAmortiguamientoService":
					{
						try {
							TemSinanpeAmortiguamientoDto temSinanpeAmortiguamientoDto		= new TemSinanpeAmortiguamientoDto();
							temSinanpeAmortiguamientoDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemSinanpeAmortiguamiento> listTemSinanpeAmortiguamiento		= temSinanpeAmortiguamientoService.buscarGeometry(temSinanpeAmortiguamientoDto);
							if(listTemSinanpeAmortiguamiento.size() > 0) {
								baseBeanVectorial	= listTemSinanpeAmortiguamiento.get(0);
								mapReporte.put("listTemSinanpeAmortiguamiento", listTemSinanpeAmortiguamiento);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemSinanpeAmortiguamientoService");
						}
						break;
					}
					case "TemSoeconComunidadesCampesinasService":
					{
						try {
							TemSoeconComunidadesCampesinasDto temSoeconComunidadesCampesinasDto		= new TemSoeconComunidadesCampesinasDto();
							temSoeconComunidadesCampesinasDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemSoeconComunidadesCampesinas> listTemSoeconComunidadesCampesinas		= temSoeconComunidadesCampesinasService.buscarGeometry(temSoeconComunidadesCampesinasDto);
							if(listTemSoeconComunidadesCampesinas.size() > 0) {
								baseBeanVectorial	= listTemSoeconComunidadesCampesinas.get(0);
								mapReporte.put("listTemSoeconComunidadesCampesinas", listTemSoeconComunidadesCampesinas);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemSoeconComunidadesCampesinasService");
						}
						break;
					}
					case "TemSoeconSolicitudCreacionReservasTerritorialesService":
					{
						try {
							TemSoeconSolicitudCreacionReservasTerritorialesDto temSoeconSolicitudCreacionReservasTerritorialesDto		= new TemSoeconSolicitudCreacionReservasTerritorialesDto();
							temSoeconSolicitudCreacionReservasTerritorialesDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemSoeconSolicitudCreacionReservasTerritoriales> listTemSoeconSolicitudCreacionReservasTerritoriales		= temSoeconSolicitudCreacionReservasTerritorialesService.buscarGeometry(temSoeconSolicitudCreacionReservasTerritorialesDto);
							if(listTemSoeconSolicitudCreacionReservasTerritoriales.size() > 0) {
								baseBeanVectorial	= listTemSoeconSolicitudCreacionReservasTerritoriales.get(0);
								mapReporte.put("listTemSoeconSolicitudCreacionReservasTerritoriales", listTemSoeconSolicitudCreacionReservasTerritoriales);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemSoeconSolicitudCreacionReservasTerritorialesService");
						}
						break;
					}
					case "TemViaFerreaService":
					{
						try {
							TemViaFerreaDto temViaFerreaDto		= new TemViaFerreaDto();
							temViaFerreaDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemViaFerrea> listTemViaFerrea		= temViaFerreaService.buscarGeometry(temViaFerreaDto);
							if(listTemViaFerrea.size() > 0) {
								baseBeanVectorial	= listTemViaFerrea.get(0);
								mapReporte.put("listTemViaFerrea", listTemViaFerrea);
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
							temViasTrochasDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemViasTrochas> listTemViasTrochas		= temViasTrochasService.buscarGeometry(temViasTrochasDto);
							if(listTemViasTrochas.size() > 0) {
								baseBeanVectorial	= listTemViasTrochas.get(0);
								mapReporte.put("listTemViasTrochas", listTemViasTrochas);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemViasTrochasService");
						}
						break;
					}
					case "TemZonificPotencialBosqueProduccionPermanenteService":
					{
						try {
							TemZonificPotencialBosqueProduccionPermanenteDto temZonificPotencialBosqueProduccionPermanenteDto		= new TemZonificPotencialBosqueProduccionPermanenteDto();
							temZonificPotencialBosqueProduccionPermanenteDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
							List<TemZonificPotencialBosqueProduccionPermanente> listTemZonificPotencialBosqueProduccionPermanente		= temZonificPotencialBosqueProduccionPermanenteService.buscarGeometry(temZonificPotencialBosqueProduccionPermanenteDto);
							if(listTemZonificPotencialBosqueProduccionPermanente.size() > 0) {
								baseBeanVectorial	= listTemZonificPotencialBosqueProduccionPermanente.get(0);
								mapReporte.put("listTemZonificPotencialBosqueProduccionPermanente", listTemZonificPotencialBosqueProduccionPermanente);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemZonificPotencialBosqueProduccionPermanenteService");
						}
						break;
					}
					///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
					case "TemBiodiversidadEspeciesPeligroExtincionService":
					{
						try {
							BeanRasterDto beanRasterDto		= new BeanRasterDto();
							beanRasterDto.setStrPoligonoConsulta(CadenaUtil.getStr(strPoligonoConsulta));
							BeanRaster beanRaster		= temBiodiversidadEspeciesPeligroExtincionService.selectByGeometry(beanRasterDto);
							if(beanRaster != null) {
								mapReporte.put("beanTemBiodiversidadEspeciesPeligroExtincion", beanRaster);
								
								double dblValue		= CadenaUtil.getDoub(beanRaster.getStrValuePromedio());
								CapaUmbralDto capaUmbralDto = new CapaUmbralDto();
								capaUmbralDto.setIntIdCapa(CadenaUtil.getInte(strSrlIdCapa));
								List<CapaUmbral> listUmbrales	= capaUmbralService.buscar(capaUmbralDto);
								for(CapaUmbral cu:listUmbrales) {
									if(dblValue >= cu.getDblValorMinimo().doubleValue() && dblValue < cu.getDblValorMaximo().doubleValue()) {
										beanRaster.setStrCategoria(cu.getStrNombre());
										break;
									}
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemBiodiversidadEspeciesPeligroExtincionService");
						}
						break;
					}
					case "TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaService":
					{
						try {
							BeanRasterDto beanRasterDto		= new BeanRasterDto();
							beanRasterDto.setStrPoligonoConsulta(CadenaUtil.getStr(strPoligonoConsulta));
							BeanRaster beanRaster		= temBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaService.selectByGeometry(beanRasterDto);
							if(beanRaster != null) {
								mapReporte.put("beanTemBiodiversidadRiquezaPotencialEspeciesFaunaEndemica", beanRaster);
								
								double dblValue		= CadenaUtil.getDoub(beanRaster.getStrValuePromedio());
								CapaUmbralDto capaUmbralDto = new CapaUmbralDto();
								capaUmbralDto.setIntIdCapa(CadenaUtil.getInte(strSrlIdCapa));
								List<CapaUmbral> listUmbrales	= capaUmbralService.buscar(capaUmbralDto);
								for(CapaUmbral cu:listUmbrales) {
									if(dblValue >= cu.getDblValorMinimo().doubleValue() && dblValue < cu.getDblValorMaximo().doubleValue()) {
										beanRaster.setStrCategoria(cu.getStrNombre());
										break;
									}
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaService");
						}
						break;
					}
					case "TemDensidadCarbonoAereaService":
					{
						try {
							BeanRasterDto beanRasterDto		= new BeanRasterDto();
							beanRasterDto.setStrPoligonoConsulta(CadenaUtil.getStr(strPoligonoConsulta));
							BeanRaster beanRaster		= temDensidadCarbonoAereaService.selectByGeometry(beanRasterDto);
							if(beanRaster != null) {
								mapReporte.put("beanTemDensidadCarbonoAerea", beanRaster);
								
								double dblValue		= CadenaUtil.getDoub(beanRaster.getStrValuePromedio());
								CapaUmbralDto capaUmbralDto = new CapaUmbralDto();
								capaUmbralDto.setIntIdCapa(CadenaUtil.getInte(strSrlIdCapa));
								List<CapaUmbral> listUmbrales	= capaUmbralService.buscar(capaUmbralDto);
								for(CapaUmbral cu:listUmbrales) {
									if(dblValue >= cu.getDblValorMinimo().doubleValue() && dblValue < cu.getDblValorMaximo().doubleValue()) {
										beanRaster.setStrCategoria(cu.getStrNombre());
										break;
									}
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemDensidadCarbonoAereaService");
						}
						break;
					}
					case "TemRiesgoErosionHidricaService":
					{
						try {
							BeanRasterDto beanRasterDto		= new BeanRasterDto();
							beanRasterDto.setStrPoligonoConsulta(CadenaUtil.getStr(strPoligonoConsulta));
							BeanRaster beanRaster		= temRiesgoErosionHidricaService.selectByGeometry(beanRasterDto);
							if(beanRaster != null) {
								mapReporte.put("beanTemRiesgoErosionHidrica", beanRaster);
								
								double dblValue		= CadenaUtil.getDoub(beanRaster.getStrValuePromedio());
								CapaUmbralDto capaUmbralDto = new CapaUmbralDto();
								capaUmbralDto.setIntIdCapa(CadenaUtil.getInte(strSrlIdCapa));
								List<CapaUmbral> listUmbrales	= capaUmbralService.buscar(capaUmbralDto);
								for(CapaUmbral cu:listUmbrales) {
									if(dblValue >= cu.getDblValorMinimo().doubleValue() && dblValue < cu.getDblValorMaximo().doubleValue()) {
										beanRaster.setStrCategoria(cu.getStrNombre());
										break;
									}
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemRiesgoErosionHidricaService");
						}
						break;
					}

					}
				}
			}
			session.put("reporte", mapReporte);
			if(baseBeanVectorial != null) {
				session.put("beanConsultaCapasRightClick", baseBeanVectorial);
			} else {
				session.remove("beanConsultaCapasRightClick");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return SUCCESS;
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
	
}
