package wcmc.hef.web.capa.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import wcmc.hef.business.core.configuracion.service.CapaService;
import com.opensymphony.xwork2.ActionContext;
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
import wcmc.hef.business.core.capa.service.TemHumedalesRamsarService;
import wcmc.hef.business.core.capa.service.TemIndiceImportanciaBiologicaService;
import wcmc.hef.business.core.capa.service.TemPrediosRuralesService;
import wcmc.hef.business.core.capa.service.TemProyeccionDensidadPob2015Service;
import wcmc.hef.business.core.capa.service.TemProyectosPoligonosService;
import wcmc.hef.business.core.capa.service.TemProyectosPuntosService;
import wcmc.hef.business.core.capa.service.TemReservasTerritorialesIndigenasService;
import wcmc.hef.business.core.capa.service.TemSinanpeAmortiguamientoService;
import wcmc.hef.business.core.capa.service.TemSoeconComunidadesCampesinasTotalesService;
import wcmc.hef.business.core.capa.service.TemSoeconSolicitudCreacionReservasTerritorialesService;
import wcmc.hef.business.core.capa.service.TemViaFerreaService;
import wcmc.hef.business.core.capa.service.TemViasTrochasService;
import wcmc.hef.business.core.capa.service.TemZonificPotencialBosqueProduccionPermanenteService;

import wcmc.hef.business.core.capa.dto.BasHidroRios100000Dto;
import wcmc.hef.dao.capa.domain.BasHidroRios100000;
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
import wcmc.hef.business.core.capa.dto.TemConcesionHidroelectricasDistribucionDto;
import wcmc.hef.dao.capa.domain.TemConcesionHidroelectricasDistribucion;
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
import wcmc.hef.business.core.capa.dto.TemSoeconComunidadesCampesinasTotalesDto;
import wcmc.hef.dao.capa.domain.TemSoeconComunidadesCampesinasTotales;
import wcmc.hef.business.core.capa.dto.TemSoeconSolicitudCreacionReservasTerritorialesDto;
import wcmc.hef.dao.capa.domain.TemSoeconSolicitudCreacionReservasTerritoriales;
import wcmc.hef.business.core.capa.dto.TemViaFerreaDto;
import wcmc.hef.dao.capa.domain.TemViaFerrea;
import wcmc.hef.business.core.capa.dto.TemViasTrochasDto;
import wcmc.hef.dao.capa.domain.TemViasTrochas;
import wcmc.hef.business.core.capa.dto.TemZonificPotencialBosqueProduccionPermanenteDto;
import wcmc.hef.dao.capa.domain.TemZonificPotencialBosqueProduccionPermanente;

import wcmc.hef.general.util.CadenaUtil;
import wcmc.hef.general.util.ServiciosProperties;

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
	private TemSoeconComunidadesCampesinasTotalesService temSoeconComunidadesCampesinasTotalesService;

	@Autowired
	private TemSoeconSolicitudCreacionReservasTerritorialesService temSoeconSolicitudCreacionReservasTerritorialesService;

	@Autowired
	private TemViaFerreaService temViaFerreaService;

	@Autowired
	private TemViasTrochasService temViasTrochasService;

	@Autowired
	private TemZonificPotencialBosqueProduccionPermanenteService temZonificPotencialBosqueProduccionPermanenteService;

	@Autowired
	private CapaService capaService;
	
	private String strPoligonoConsulta;
	private String listSrlIdCapaConsulta;
	public ConsultaAction() {
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////
	public String consultar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			final Map<String, Object> mapReporte		= new HashMap<String, Object>();
			String[] arrCons	= listSrlIdCapaConsulta.split(",");
			List<String> listConsulta	= Arrays.asList(arrCons);
			Map<String, String> mapServ	= ServiciosProperties.getServiciosByIdList();
			List<Thread> listThread	= new ArrayList<Thread>();
			final List<String> listReporteOk	= new ArrayList<String>();
			for(String strSrlIdCapa:listConsulta) {
				switch(mapServ.get(CadenaUtil.getStr(strSrlIdCapa))) {
				case "BasHidroRios100000Service":
				{
					Thread t= new Thread(new Runnable() {
						public void run() {
							try {
								BasHidroRios100000Dto basHidroRios100000Dto		= new BasHidroRios100000Dto();
								basHidroRios100000Dto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
								List<BasHidroRios100000> listBasHidroRios100000		= basHidroRios100000Service.buscar(basHidroRios100000Dto);
								if(listBasHidroRios100000.size() > 0) {
									mapReporte.put("listBasHidroRios100000", listBasHidroRios100000);
								}
							} catch (Exception ex) {
								ex.printStackTrace();
							} finally {
								listReporteOk.add("BasHidroRios100000Service");
							}
						}
					});
					listThread.add(t);
					break;
				}
				case "BasHidroRiosLagunasService":
				{
					Thread t= new Thread(new Runnable() {
						public void run() {
							try {
								BasHidroRiosLagunasDto basHidroRiosLagunasDto		= new BasHidroRiosLagunasDto();
								basHidroRiosLagunasDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
								List<BasHidroRiosLagunas> listBasHidroRiosLagunas		= basHidroRiosLagunasService.buscar(basHidroRiosLagunasDto);
								if(listBasHidroRiosLagunas.size() > 0) {
									mapReporte.put("listBasHidroRiosLagunas", listBasHidroRiosLagunas);
								}
							} catch (Exception ex) {
								ex.printStackTrace();
							} finally {
								listReporteOk.add("BasHidroRiosLagunasService");
							}
						}
					});
					listThread.add(t);
					break;
				}
				case "BasLimAmazoniaService":
				{
					Thread t= new Thread(new Runnable() {
						public void run() {
							try {
								BasLimAmazoniaDto basLimAmazoniaDto		= new BasLimAmazoniaDto();
								basLimAmazoniaDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
								List<BasLimAmazonia> listBasLimAmazonia		= basLimAmazoniaService.buscar(basLimAmazoniaDto);
								if(listBasLimAmazonia.size() > 0) {
									mapReporte.put("listBasLimAmazonia", listBasLimAmazonia);
								}
							} catch (Exception ex) {
								ex.printStackTrace();
							} finally {
								listReporteOk.add("BasLimAmazoniaService");
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
								List<BasLimDepartamento> listBasLimDepartamento		= basLimDepartamentoService.buscar(basLimDepartamentoDto);
								if(listBasLimDepartamento.size() > 0) {
									mapReporte.put("listBasLimDepartamento", listBasLimDepartamento);
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
								List<BasLimDistritos> listBasLimDistritos		= basLimDistritosService.buscar(basLimDistritosDto);
								if(listBasLimDistritos.size() > 0) {
									mapReporte.put("listBasLimDistritos", listBasLimDistritos);
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
				case "BasLimProvinciaService":
				{
					Thread t= new Thread(new Runnable() {
						public void run() {
							try {
								BasLimProvinciaDto basLimProvinciaDto		= new BasLimProvinciaDto();
								basLimProvinciaDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
								List<BasLimProvincia> listBasLimProvincia		= basLimProvinciaService.buscar(basLimProvinciaDto);
								if(listBasLimProvincia.size() > 0) {
									mapReporte.put("listBasLimProvincia", listBasLimProvincia);
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
				case "BasViasRedVialDepartamentalService":
				{
					Thread t= new Thread(new Runnable() {
						public void run() {
							try {
								BasViasRedVialDepartamentalDto basViasRedVialDepartamentalDto		= new BasViasRedVialDepartamentalDto();
								basViasRedVialDepartamentalDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
								List<BasViasRedVialDepartamental> listBasViasRedVialDepartamental		= basViasRedVialDepartamentalService.buscar(basViasRedVialDepartamentalDto);
								if(listBasViasRedVialDepartamental.size() > 0) {
									mapReporte.put("listBasViasRedVialDepartamental", listBasViasRedVialDepartamental);
								}
							} catch (Exception ex) {
								ex.printStackTrace();
							} finally {
								listReporteOk.add("BasViasRedVialDepartamentalService");
							}
						}
					});
					listThread.add(t);
					break;
				}
				case "BasViasRedVialNacionalService":
				{
					Thread t= new Thread(new Runnable() {
						public void run() {
							try {
								BasViasRedVialNacionalDto basViasRedVialNacionalDto		= new BasViasRedVialNacionalDto();
								basViasRedVialNacionalDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
								List<BasViasRedVialNacional> listBasViasRedVialNacional		= basViasRedVialNacionalService.buscar(basViasRedVialNacionalDto);
								if(listBasViasRedVialNacional.size() > 0) {
									mapReporte.put("listBasViasRedVialNacional", listBasViasRedVialNacional);
								}
							} catch (Exception ex) {
								ex.printStackTrace();
							} finally {
								listReporteOk.add("BasViasRedVialNacionalService");
							}
						}
					});
					listThread.add(t);
					break;
				}
				case "BasViasRedVialVecinalService":
				{
					Thread t= new Thread(new Runnable() {
						public void run() {
							try {
								BasViasRedVialVecinalDto basViasRedVialVecinalDto		= new BasViasRedVialVecinalDto();
								basViasRedVialVecinalDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
								List<BasViasRedVialVecinal> listBasViasRedVialVecinal		= basViasRedVialVecinalService.buscar(basViasRedVialVecinalDto);
								if(listBasViasRedVialVecinal.size() > 0) {
									mapReporte.put("listBasViasRedVialVecinal", listBasViasRedVialVecinal);
								}
							} catch (Exception ex) {
								ex.printStackTrace();
							} finally {
								listReporteOk.add("BasViasRedVialVecinalService");
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
								List<TemAnpNacional> listTemAnpNacional		= temAnpNacionalService.buscar(temAnpNacionalDto);
								if(listTemAnpNacional.size() > 0) {
									mapReporte.put("listTemAnpNacional", listTemAnpNacional);
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
				case "TemAnpPrivadaService":
				{
					Thread t= new Thread(new Runnable() {
						public void run() {
							try {
								TemAnpPrivadaDto temAnpPrivadaDto		= new TemAnpPrivadaDto();
								temAnpPrivadaDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
								List<TemAnpPrivada> listTemAnpPrivada		= temAnpPrivadaService.buscar(temAnpPrivadaDto);
								if(listTemAnpPrivada.size() > 0) {
									mapReporte.put("listTemAnpPrivada", listTemAnpPrivada);
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
				case "TemAnpRegionalService":
				{
					Thread t= new Thread(new Runnable() {
						public void run() {
							try {
								TemAnpRegionalDto temAnpRegionalDto		= new TemAnpRegionalDto();
								temAnpRegionalDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
								List<TemAnpRegional> listTemAnpRegional		= temAnpRegionalService.buscar(temAnpRegionalDto);
								if(listTemAnpRegional.size() > 0) {
									mapReporte.put("listTemAnpRegional", listTemAnpRegional);
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
				case "TemCarbonoEcozonasService":
				{
					Thread t= new Thread(new Runnable() {
						public void run() {
							try {
								TemCarbonoEcozonasDto temCarbonoEcozonasDto		= new TemCarbonoEcozonasDto();
								temCarbonoEcozonasDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
								List<TemCarbonoEcozonas> listTemCarbonoEcozonas		= temCarbonoEcozonasService.buscar(temCarbonoEcozonasDto);
								if(listTemCarbonoEcozonas.size() > 0) {
									mapReporte.put("listTemCarbonoEcozonas", listTemCarbonoEcozonas);
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
				case "TemCentrosPobladosService":
				{
					Thread t= new Thread(new Runnable() {
						public void run() {
							try {
								TemCentrosPobladosDto temCentrosPobladosDto		= new TemCentrosPobladosDto();
								temCentrosPobladosDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
								List<TemCentrosPoblados> listTemCentrosPoblados		= temCentrosPobladosService.buscar(temCentrosPobladosDto);
								if(listTemCentrosPoblados.size() > 0) {
									mapReporte.put("listTemCentrosPoblados", listTemCentrosPoblados);
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
				case "TemClaveBiodiversidadService":
				{
					Thread t= new Thread(new Runnable() {
						public void run() {
							try {
								TemClaveBiodiversidadDto temClaveBiodiversidadDto		= new TemClaveBiodiversidadDto();
								temClaveBiodiversidadDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
								List<TemClaveBiodiversidad> listTemClaveBiodiversidad		= temClaveBiodiversidadService.buscar(temClaveBiodiversidadDto);
								if(listTemClaveBiodiversidad.size() > 0) {
									mapReporte.put("listTemClaveBiodiversidad", listTemClaveBiodiversidad);
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
				case "TemComunidadesNativasService":
				{
					Thread t= new Thread(new Runnable() {
						public void run() {
							try {
								TemComunidadesNativasDto temComunidadesNativasDto		= new TemComunidadesNativasDto();
								temComunidadesNativasDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
								List<TemComunidadesNativas> listTemComunidadesNativas		= temComunidadesNativasService.buscar(temComunidadesNativasDto);
								if(listTemComunidadesNativas.size() > 0) {
									mapReporte.put("listTemComunidadesNativas", listTemComunidadesNativas);
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
				case "TemConcesionesEcoturismoService":
				{
					Thread t= new Thread(new Runnable() {
						public void run() {
							try {
								TemConcesionesEcoturismoDto temConcesionesEcoturismoDto		= new TemConcesionesEcoturismoDto();
								temConcesionesEcoturismoDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
								List<TemConcesionesEcoturismo> listTemConcesionesEcoturismo		= temConcesionesEcoturismoService.buscar(temConcesionesEcoturismoDto);
								if(listTemConcesionesEcoturismo.size() > 0) {
									mapReporte.put("listTemConcesionesEcoturismo", listTemConcesionesEcoturismo);
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
								List<TemConcesionesForestalesCastania> listTemConcesionesForestalesCastania		= temConcesionesForestalesCastaniaService.buscar(temConcesionesForestalesCastaniaDto);
								if(listTemConcesionesForestalesCastania.size() > 0) {
									mapReporte.put("listTemConcesionesForestalesCastania", listTemConcesionesForestalesCastania);
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
								List<TemConcesionesForestalesConservacion> listTemConcesionesForestalesConservacion		= temConcesionesForestalesConservacionService.buscar(temConcesionesForestalesConservacionDto);
								if(listTemConcesionesForestalesConservacion.size() > 0) {
									mapReporte.put("listTemConcesionesForestalesConservacion", listTemConcesionesForestalesConservacion);
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
								List<TemConcesionesForestalesMaderableAdecuadas> listTemConcesionesForestalesMaderableAdecuadas		= temConcesionesForestalesMaderableAdecuadasService.buscar(temConcesionesForestalesMaderableAdecuadasDto);
								if(listTemConcesionesForestalesMaderableAdecuadas.size() > 0) {
									mapReporte.put("listTemConcesionesForestalesMaderableAdecuadas", listTemConcesionesForestalesMaderableAdecuadas);
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
								List<TemConcesionesForestalesMaderableConcurso> listTemConcesionesForestalesMaderableConcurso		= temConcesionesForestalesMaderableConcursoService.buscar(temConcesionesForestalesMaderableConcursoDto);
								if(listTemConcesionesForestalesMaderableConcurso.size() > 0) {
									mapReporte.put("listTemConcesionesForestalesMaderableConcurso", listTemConcesionesForestalesMaderableConcurso);
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
								List<TemConcesionesForestalesManejoFaunaSilvestre> listTemConcesionesForestalesManejoFaunaSilvestre		= temConcesionesForestalesManejoFaunaSilvestreService.buscar(temConcesionesForestalesManejoFaunaSilvestreDto);
								if(listTemConcesionesForestalesManejoFaunaSilvestre.size() > 0) {
									mapReporte.put("listTemConcesionesForestalesManejoFaunaSilvestre", listTemConcesionesForestalesManejoFaunaSilvestre);
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
								List<TemConcesionesForestalesReforestacion> listTemConcesionesForestalesReforestacion		= temConcesionesForestalesReforestacionService.buscar(temConcesionesForestalesReforestacionDto);
								if(listTemConcesionesForestalesReforestacion.size() > 0) {
									mapReporte.put("listTemConcesionesForestalesReforestacion", listTemConcesionesForestalesReforestacion);
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
				case "TemConcesionesMinerasService":
				{
					Thread t= new Thread(new Runnable() {
						public void run() {
							try {
								TemConcesionesMinerasDto temConcesionesMinerasDto		= new TemConcesionesMinerasDto();
								temConcesionesMinerasDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
								List<TemConcesionesMineras> listTemConcesionesMineras		= temConcesionesMinerasService.buscar(temConcesionesMinerasDto);
								if(listTemConcesionesMineras.size() > 0) {
									mapReporte.put("listTemConcesionesMineras", listTemConcesionesMineras);
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
//				case "TemConcesionHidroelectricasDistribucionService":
//				{
//					Thread t= new Thread(new Runnable() {
//						public void run() {
//							try {
//								TemConcesionHidroelectricasDistribucionDto temConcesionHidroelectricasDistribucionDto		= new TemConcesionHidroelectricasDistribucionDto();
//								temConcesionHidroelectricasDistribucionDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
//								List<TemConcesionHidroelectricasDistribucion> listTemConcesionHidroelectricasDistribucion		= temConcesionHidroelectricasDistribucionService.buscar(temConcesionHidroelectricasDistribucionDto);
//								if(listTemConcesionHidroelectricasDistribucion.size() > 0) {
//									mapReporte.put("listTemConcesionHidroelectricasDistribucion", listTemConcesionHidroelectricasDistribucion);
//								}
//							} catch (Exception ex) {
//								ex.printStackTrace();
//							} finally {
//								listReporteOk.add("TemConcesionHidroelectricasDistribucionService");
//							}
//						}
//					});
//					listThread.add(t);
//					break;
//				}
				case "TemConcesionHidroelectricasGeneracionService":
				{
					Thread t= new Thread(new Runnable() {
						public void run() {
							try {
								TemConcesionHidroelectricasGeneracionDto temConcesionHidroelectricasGeneracionDto		= new TemConcesionHidroelectricasGeneracionDto();
								temConcesionHidroelectricasGeneracionDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
								List<TemConcesionHidroelectricasGeneracion> listTemConcesionHidroelectricasGeneracion		= temConcesionHidroelectricasGeneracionService.buscar(temConcesionHidroelectricasGeneracionDto);
								if(listTemConcesionHidroelectricasGeneracion.size() > 0) {
									mapReporte.put("listTemConcesionHidroelectricasGeneracion", listTemConcesionHidroelectricasGeneracion);
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
				case "TemCostoOportunidadDeforestacionService":
				{
					Thread t= new Thread(new Runnable() {
						public void run() {
							try {
								TemCostoOportunidadDeforestacionDto temCostoOportunidadDeforestacionDto		= new TemCostoOportunidadDeforestacionDto();
								temCostoOportunidadDeforestacionDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
								List<TemCostoOportunidadDeforestacion> listTemCostoOportunidadDeforestacion		= temCostoOportunidadDeforestacionService.buscar(temCostoOportunidadDeforestacionDto);
								if(listTemCostoOportunidadDeforestacion.size() > 0) {
									mapReporte.put("listTemCostoOportunidadDeforestacion", listTemCostoOportunidadDeforestacion);
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
				case "TemCoverturaVegetal2015Service":
				{
					Thread t= new Thread(new Runnable() {
						public void run() {
							try {
								TemCoverturaVegetal2015Dto temCoverturaVegetal2015Dto		= new TemCoverturaVegetal2015Dto();
								temCoverturaVegetal2015Dto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
								List<TemCoverturaVegetal2015> listTemCoverturaVegetal2015		= temCoverturaVegetal2015Service.buscar(temCoverturaVegetal2015Dto);
								if(listTemCoverturaVegetal2015.size() > 0) {
									mapReporte.put("listTemCoverturaVegetal2015", listTemCoverturaVegetal2015);
								}
							} catch (Exception ex) {
								ex.printStackTrace();
							} finally {
								listReporteOk.add("TemCoverturaVegetal2015Service");
							}
						}
					});
					listThread.add(t);
					break;
				}
				case "TemCuencasHidrograficasService":
				{
					Thread t= new Thread(new Runnable() {
						public void run() {
							try {
								TemCuencasHidrograficasDto temCuencasHidrograficasDto		= new TemCuencasHidrograficasDto();
								temCuencasHidrograficasDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
								List<TemCuencasHidrograficas> listTemCuencasHidrograficas		= temCuencasHidrograficasService.buscar(temCuencasHidrograficasDto);
								if(listTemCuencasHidrograficas.size() > 0) {
									mapReporte.put("listTemCuencasHidrograficas", listTemCuencasHidrograficas);
								}
							} catch (Exception ex) {
								ex.printStackTrace();
							} finally {
								listReporteOk.add("TemCuencasHidrograficasService");
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
								List<TemHumedalesRamsar> listTemHumedalesRamsar		= temHumedalesRamsarService.buscar(temHumedalesRamsarDto);
								if(listTemHumedalesRamsar.size() > 0) {
									mapReporte.put("listTemHumedalesRamsar", listTemHumedalesRamsar);
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
				case "TemIndiceImportanciaBiologicaService":
				{
					Thread t= new Thread(new Runnable() {
						public void run() {
							try {
								TemIndiceImportanciaBiologicaDto temIndiceImportanciaBiologicaDto		= new TemIndiceImportanciaBiologicaDto();
								temIndiceImportanciaBiologicaDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
								List<TemIndiceImportanciaBiologica> listTemIndiceImportanciaBiologica		= temIndiceImportanciaBiologicaService.buscar(temIndiceImportanciaBiologicaDto);
								if(listTemIndiceImportanciaBiologica.size() > 0) {
									mapReporte.put("listTemIndiceImportanciaBiologica", listTemIndiceImportanciaBiologica);
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
				case "TemPrediosRuralesService":
				{
					Thread t= new Thread(new Runnable() {
						public void run() {
							try {
								TemPrediosRuralesDto temPrediosRuralesDto		= new TemPrediosRuralesDto();
								temPrediosRuralesDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
								List<TemPrediosRurales> listTemPrediosRurales		= temPrediosRuralesService.buscar(temPrediosRuralesDto);
								if(listTemPrediosRurales.size() > 0) {
									mapReporte.put("listTemPrediosRurales", listTemPrediosRurales);
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
				case "TemProyeccionDensidadPob2015Service":
				{
					Thread t= new Thread(new Runnable() {
						public void run() {
							try {
								TemProyeccionDensidadPob2015Dto temProyeccionDensidadPob2015Dto		= new TemProyeccionDensidadPob2015Dto();
								temProyeccionDensidadPob2015Dto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
								List<TemProyeccionDensidadPob2015> listTemProyeccionDensidadPob2015		= temProyeccionDensidadPob2015Service.buscar(temProyeccionDensidadPob2015Dto);
								if(listTemProyeccionDensidadPob2015.size() > 0) {
									mapReporte.put("listTemProyeccionDensidadPob2015", listTemProyeccionDensidadPob2015);
								}
							} catch (Exception ex) {
								ex.printStackTrace();
							} finally {
								listReporteOk.add("TemProyeccionDensidadPob2015Service");
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
								List<TemProyectosPoligonos> listTemProyectosPoligonos		= temProyectosPoligonosService.buscar(temProyectosPoligonosDto);
								if(listTemProyectosPoligonos.size() > 0) {
									mapReporte.put("listTemProyectosPoligonos", listTemProyectosPoligonos);
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
				case "TemProyectosPuntosService":
				{
					Thread t= new Thread(new Runnable() {
						public void run() {
							try {
								TemProyectosPuntosDto temProyectosPuntosDto		= new TemProyectosPuntosDto();
								temProyectosPuntosDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
								List<TemProyectosPuntos> listTemProyectosPuntos		= temProyectosPuntosService.buscar(temProyectosPuntosDto);
								if(listTemProyectosPuntos.size() > 0) {
									mapReporte.put("listTemProyectosPuntos", listTemProyectosPuntos);
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
				case "TemReservasTerritorialesIndigenasService":
				{
					Thread t= new Thread(new Runnable() {
						public void run() {
							try {
								TemReservasTerritorialesIndigenasDto temReservasTerritorialesIndigenasDto		= new TemReservasTerritorialesIndigenasDto();
								temReservasTerritorialesIndigenasDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
								List<TemReservasTerritorialesIndigenas> listTemReservasTerritorialesIndigenas		= temReservasTerritorialesIndigenasService.buscar(temReservasTerritorialesIndigenasDto);
								if(listTemReservasTerritorialesIndigenas.size() > 0) {
									mapReporte.put("listTemReservasTerritorialesIndigenas", listTemReservasTerritorialesIndigenas);
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
				case "TemSinanpeAmortiguamientoService":
				{
					Thread t= new Thread(new Runnable() {
						public void run() {
							try {
								TemSinanpeAmortiguamientoDto temSinanpeAmortiguamientoDto		= new TemSinanpeAmortiguamientoDto();
								temSinanpeAmortiguamientoDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
								List<TemSinanpeAmortiguamiento> listTemSinanpeAmortiguamiento		= temSinanpeAmortiguamientoService.buscar(temSinanpeAmortiguamientoDto);
								if(listTemSinanpeAmortiguamiento.size() > 0) {
									mapReporte.put("listTemSinanpeAmortiguamiento", listTemSinanpeAmortiguamiento);
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
				case "TemSoeconComunidadesCampesinasTotalesService":
				{
					Thread t= new Thread(new Runnable() {
						public void run() {
							try {
								TemSoeconComunidadesCampesinasTotalesDto temSoeconComunidadesCampesinasTotalesDto		= new TemSoeconComunidadesCampesinasTotalesDto();
								temSoeconComunidadesCampesinasTotalesDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
								List<TemSoeconComunidadesCampesinasTotales> listTemSoeconComunidadesCampesinasTotales		= temSoeconComunidadesCampesinasTotalesService.buscar(temSoeconComunidadesCampesinasTotalesDto);
								if(listTemSoeconComunidadesCampesinasTotales.size() > 0) {
									mapReporte.put("listTemSoeconComunidadesCampesinasTotales", listTemSoeconComunidadesCampesinasTotales);
								}
							} catch (Exception ex) {
								ex.printStackTrace();
							} finally {
								listReporteOk.add("TemSoeconComunidadesCampesinasTotalesService");
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
								List<TemSoeconSolicitudCreacionReservasTerritoriales> listTemSoeconSolicitudCreacionReservasTerritoriales		= temSoeconSolicitudCreacionReservasTerritorialesService.buscar(temSoeconSolicitudCreacionReservasTerritorialesDto);
								if(listTemSoeconSolicitudCreacionReservasTerritoriales.size() > 0) {
									mapReporte.put("listTemSoeconSolicitudCreacionReservasTerritoriales", listTemSoeconSolicitudCreacionReservasTerritoriales);
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
				case "TemViaFerreaService":
				{
					Thread t= new Thread(new Runnable() {
						public void run() {
							try {
								TemViaFerreaDto temViaFerreaDto		= new TemViaFerreaDto();
								temViaFerreaDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
								List<TemViaFerrea> listTemViaFerrea		= temViaFerreaService.buscar(temViaFerreaDto);
								if(listTemViaFerrea.size() > 0) {
									mapReporte.put("listTemViaFerrea", listTemViaFerrea);
								}
							} catch (Exception ex) {
								ex.printStackTrace();
							} finally {
								listReporteOk.add("TemViaFerreaService");
							}
						}
					});
					listThread.add(t);
					break;
				}
				case "TemViasTrochasService":
				{
					Thread t= new Thread(new Runnable() {
						public void run() {
							try {
								TemViasTrochasDto temViasTrochasDto		= new TemViasTrochasDto();
								temViasTrochasDto.setStrTheGeom(CadenaUtil.getStr(strPoligonoConsulta));
								List<TemViasTrochas> listTemViasTrochas		= temViasTrochasService.buscar(temViasTrochasDto);
								if(listTemViasTrochas.size() > 0) {
									mapReporte.put("listTemViasTrochas", listTemViasTrochas);
								}
							} catch (Exception ex) {
								ex.printStackTrace();
							} finally {
								listReporteOk.add("TemViasTrochasService");
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
								List<TemZonificPotencialBosqueProduccionPermanente> listTemZonificPotencialBosqueProduccionPermanente		= temZonificPotencialBosqueProduccionPermanenteService.buscar(temZonificPotencialBosqueProduccionPermanenteDto);
								if(listTemZonificPotencialBosqueProduccionPermanente.size() > 0) {
									mapReporte.put("listTemZonificPotencialBosqueProduccionPermanente", listTemZonificPotencialBosqueProduccionPermanente);
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
				}
			}
			
			for(Thread t:listThread) {
				t.start();
			}
			
			while(true) {
				synchronized(this) {
					wait(500L);
				}
				if(listReporteOk.size() == listThread.size()) {
					break;
				}
			}
			session.put("reporte", mapReporte);
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
	
}
