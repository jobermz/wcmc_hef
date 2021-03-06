package wcmc.hef.web.capa.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import wcmc.hef.business.core.configuracion.service.CapaService;
import wcmc.hef.business.core.configuracion.service.CapaUmbralService;
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
import wcmc.hef.business.core.capa.service.TemSinanpeAmortiguamientoService;
import wcmc.hef.business.core.capa.service.TemSoeconComunidadesCampesinasService;
import wcmc.hef.business.core.capa.service.TemSoeconSolicitudCreacionReservasTerritorialesService;
import wcmc.hef.business.core.capa.service.TemViaFerreaService;
import wcmc.hef.business.core.capa.service.TemViasTrochasService;
import wcmc.hef.business.core.capa.service.TemZonificPotencialBosqueProduccionPermanenteService;
import wcmc.hef.business.core.capa.dto.BasHidroRios100000Dto;
import wcmc.hef.business.core.capa.dto.TemConcesionHidroelectricasDistribucionDto;
import wcmc.hef.dao.capa.domain.BasHidroRios100000;
import wcmc.hef.dao.capa.domain.BaseBeanVectorial;
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
import wcmc.hef.general.util.CadenaUtil;
import wcmc.hef.general.util.ServiciosProperties;
import wcmc.hef.business.core.capa.service.TemIndiceImportanciaBiologicaService;

public class ConsultaCombosCentrarMapaAction extends ActionSupport {
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
	private TemIndiceImportanciaBiologicaService temIndiceImportanciaBiologicaService;

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
	
	@Autowired
	ConsultaACLFuxionService consultaACLFuxionService;
	
	private String strGeometriaRespuesta;
	private String listSrlIdCapaConsulta;
	private String listIdDataCapaConsulta;
	
	public ConsultaCombosCentrarMapaAction() {
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////
	public String consultar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			List<BaseBeanVectorial> listReporte		= new ArrayList<BaseBeanVectorial>();
			
			String[] arrCons			= listSrlIdCapaConsulta.split(",");
			List<String> listConsulta	= Arrays.asList(arrCons);

			String[] arrIdData			= listIdDataCapaConsulta.split(",");
			List<String> listIdData		= Arrays.asList(arrIdData);

			String strSrlIdCapa	= "";
			String strIdData	= "";
			Map<String, String> mapServ	= ServiciosProperties.getServiciosByIdList();
			final List<String> listReporteOk	= new ArrayList<String>();
			String strLastServicioConsultado	= "";
			strGeometriaRespuesta				= "";
			for(int i = 0;i< listConsulta.size();i++) {
				strSrlIdCapa	= listConsulta.get(i);
				strIdData		= listIdData.get(i);
				if(mapServ.get(CadenaUtil.getStr(strSrlIdCapa)) != null) {
					strLastServicioConsultado	= mapServ.get(CadenaUtil.getStr(strSrlIdCapa));
					switch(strLastServicioConsultado) {
					case "BasLimProvinciaService":
					{
						try {
							BasLimProvinciaDto basLimProvinciaDto		= new BasLimProvinciaDto();
							basLimProvinciaDto.setSrlGid(CadenaUtil.getInte(strIdData));
							BasLimProvincia basLimProvincia		= basLimProvinciaService.buscarById(basLimProvinciaDto);
							if(basLimProvincia != null) {
								listReporte.add(basLimProvincia);
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
							basLimDepartamentoDto.setSrlGid(CadenaUtil.getInte(strIdData));
							BasLimDepartamento basLimDepartamento		= basLimDepartamentoService.buscarById(basLimDepartamentoDto);
							if(basLimDepartamento != null) {
								listReporte.add(basLimDepartamento);
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
							basLimDistritosDto.setSrlGid(CadenaUtil.getInte(strIdData));
							BasLimDistritos basLimDistritos		= basLimDistritosService.buscarById(basLimDistritosDto);
							if(basLimDistritos != null) {
								listReporte.add(basLimDistritos);
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
							basLimAmazoniaDto.setSrlGid(CadenaUtil.getInte(strIdData));
							BasLimAmazonia basLimAmazonia		= basLimAmazoniaService.buscarById(basLimAmazoniaDto);
							if(basLimAmazonia != null) {
								listReporte.add(basLimAmazonia);
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
							basHidroRiosLagunasDto.setSrlGid(CadenaUtil.getInte(strIdData));
							BasHidroRiosLagunas basHidroRiosLagunas		= basHidroRiosLagunasService.buscarById(basHidroRiosLagunasDto);
							if(basHidroRiosLagunas != null) {
								listReporte.add(basHidroRiosLagunas);
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
							basHidroRios100000Dto.setSrlGid(CadenaUtil.getInte(strIdData));
							BasHidroRios100000 basHidroRios100000		= basHidroRios100000Service.buscarById(basHidroRios100000Dto);
							if(basHidroRios100000 != null) {
								listReporte.add(basHidroRios100000);
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
							basViasRedVialVecinalDto.setSrlGid(CadenaUtil.getInte(strIdData));
							BasViasRedVialVecinal basViasRedVialVecinal		= basViasRedVialVecinalService.buscarById(basViasRedVialVecinalDto);
							if(basViasRedVialVecinal != null) {
								listReporte.add(basViasRedVialVecinal);
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
							basViasRedVialNacionalDto.setSrlGid(CadenaUtil.getInte(strIdData));
							BasViasRedVialNacional basViasRedVialNacional		= basViasRedVialNacionalService.buscarById(basViasRedVialNacionalDto);
							if(basViasRedVialNacional != null) {
								listReporte.add(basViasRedVialNacional);
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
							basViasRedVialDepartamentalDto.setSrlGid(CadenaUtil.getInte(strIdData));
							BasViasRedVialDepartamental basViasRedVialDepartamental		= basViasRedVialDepartamentalService.buscarById(basViasRedVialDepartamentalDto);
							if(basViasRedVialDepartamental != null) {
								listReporte.add(basViasRedVialDepartamental);
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
							temViaFerreaDto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemViaFerrea temViaFerrea		= temViaFerreaService.buscarById(temViaFerreaDto);
							if(temViaFerrea != null) {
								listReporte.add(temViaFerrea);
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
							temViasTrochasDto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemViasTrochas temViasTrochas		= temViasTrochasService.buscarById(temViasTrochasDto);
							if(temViasTrochas != null) {
								listReporte.add(temViasTrochas);
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
							temSoeconComunidadesCampesinasDto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemSoeconComunidadesCampesinas temSoeconComunidadesCampesinas		= temSoeconComunidadesCampesinasService.buscarById(temSoeconComunidadesCampesinasDto);
							if(temSoeconComunidadesCampesinas != null) {
								listReporte.add(temSoeconComunidadesCampesinas);
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
							temComunidadesNativasDto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemComunidadesNativas temComunidadesNativas		= temComunidadesNativasService.buscarById(temComunidadesNativasDto);
							if(temComunidadesNativas != null) {
								listReporte.add(temComunidadesNativas);
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
							temReservasTerritorialesIndigenasDto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemReservasTerritorialesIndigenas temReservasTerritorialesIndigenas		= temReservasTerritorialesIndigenasService.buscarById(temReservasTerritorialesIndigenasDto);
							if(temReservasTerritorialesIndigenas != null) {
								listReporte.add(temReservasTerritorialesIndigenas);
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
							temSoeconSolicitudCreacionReservasTerritorialesDto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemSoeconSolicitudCreacionReservasTerritoriales temSoeconSolicitudCreacionReservasTerritoriales		= temSoeconSolicitudCreacionReservasTerritorialesService.buscarById(temSoeconSolicitudCreacionReservasTerritorialesDto);
							if(temSoeconSolicitudCreacionReservasTerritoriales != null) {
								listReporte.add(temSoeconSolicitudCreacionReservasTerritoriales);
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
							temConcesionesEcoturismoDto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemConcesionesEcoturismo temConcesionesEcoturismo		= temConcesionesEcoturismoService.buscarById(temConcesionesEcoturismoDto);
							if(temConcesionesEcoturismo != null) {
								listReporte.add(temConcesionesEcoturismo);
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
							temConcesionesForestalesCastaniaDto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemConcesionesForestalesCastania temConcesionesForestalesCastania		= temConcesionesForestalesCastaniaService.buscarById(temConcesionesForestalesCastaniaDto);
							if(temConcesionesForestalesCastania != null) {
								listReporte.add(temConcesionesForestalesCastania);
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
							temConcesionesForestalesConservacionDto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemConcesionesForestalesConservacion temConcesionesForestalesConservacion		= temConcesionesForestalesConservacionService.buscarById(temConcesionesForestalesConservacionDto);
							if(temConcesionesForestalesConservacion != null) {
								listReporte.add(temConcesionesForestalesConservacion);
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
							temConcesionesForestalesMaderableAdecuadasDto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemConcesionesForestalesMaderableAdecuadas temConcesionesForestalesMaderableAdecuadas		= temConcesionesForestalesMaderableAdecuadasService.buscarById(temConcesionesForestalesMaderableAdecuadasDto);
							if(temConcesionesForestalesMaderableAdecuadas != null) {
								listReporte.add(temConcesionesForestalesMaderableAdecuadas);
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
							temConcesionesForestalesMaderableConcursoDto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemConcesionesForestalesMaderableConcurso temConcesionesForestalesMaderableConcurso		= temConcesionesForestalesMaderableConcursoService.buscarById(temConcesionesForestalesMaderableConcursoDto);
							if(temConcesionesForestalesMaderableConcurso != null) {
								listReporte.add(temConcesionesForestalesMaderableConcurso);
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
							temConcesionesForestalesManejoFaunaSilvestreDto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemConcesionesForestalesManejoFaunaSilvestre temConcesionesForestalesManejoFaunaSilvestre		= temConcesionesForestalesManejoFaunaSilvestreService.buscarById(temConcesionesForestalesManejoFaunaSilvestreDto);
							if(temConcesionesForestalesManejoFaunaSilvestre != null) {
								listReporte.add(temConcesionesForestalesManejoFaunaSilvestre);
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
							temConcesionesForestalesReforestacionDto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemConcesionesForestalesReforestacion temConcesionesForestalesReforestacion		= temConcesionesForestalesReforestacionService.buscarById(temConcesionesForestalesReforestacionDto);
							if(temConcesionesForestalesReforestacion != null) {
								listReporte.add(temConcesionesForestalesReforestacion);
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
							temPrediosRuralesDto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemPrediosRurales temPrediosRurales		= temPrediosRuralesService.buscarById(temPrediosRuralesDto);
							if(temPrediosRurales != null) {
								listReporte.add(temPrediosRurales);
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
							temZonificPotencialBosqueProduccionPermanenteDto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemZonificPotencialBosqueProduccionPermanente temZonificPotencialBosqueProduccionPermanente		= temZonificPotencialBosqueProduccionPermanenteService.buscarById(temZonificPotencialBosqueProduccionPermanenteDto);
							if(temZonificPotencialBosqueProduccionPermanente != null) {
								listReporte.add(temZonificPotencialBosqueProduccionPermanente);
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
							temConcesionHidroelectricasGeneracionDto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemConcesionHidroelectricasGeneracion temConcesionHidroelectricasGeneracion		= temConcesionHidroelectricasGeneracionService.buscarById(temConcesionHidroelectricasGeneracionDto);
							if(temConcesionHidroelectricasGeneracion != null) {
								listReporte.add(temConcesionHidroelectricasGeneracion);
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
							temConcesionHidroelectricasDistribucionDto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemConcesionHidroelectricasDistribucion temConcesionHidroelectricasDistribucion		= temConcesionHidroelectricasDistribucionService.buscarById(temConcesionHidroelectricasDistribucionDto);
							if(temConcesionHidroelectricasDistribucion != null) {
								listReporte.add(temConcesionHidroelectricasDistribucion);
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
							temConcesionesMinerasDto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemConcesionesMineras temConcesionesMineras		= temConcesionesMinerasService.buscarById(temConcesionesMinerasDto);
							if(temConcesionesMineras != null) {
								listReporte.add(temConcesionesMineras);
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
							temAnpNacionalDto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemAnpNacional temAnpNacional		= temAnpNacionalService.buscarById(temAnpNacionalDto);
							if(temAnpNacional != null) {
								listReporte.add(temAnpNacional);
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
							temAnpRegionalDto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemAnpRegional temAnpRegional		= temAnpRegionalService.buscarById(temAnpRegionalDto);
							if(temAnpRegional != null) {
								listReporte.add(temAnpRegional);
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
							temAnpPrivadaDto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemAnpPrivada temAnpPrivada		= temAnpPrivadaService.buscarById(temAnpPrivadaDto);
							if(temAnpPrivada != null) {
								listReporte.add(temAnpPrivada);
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
							temSinanpeAmortiguamientoDto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemSinanpeAmortiguamiento temSinanpeAmortiguamiento		= temSinanpeAmortiguamientoService.buscarById(temSinanpeAmortiguamientoDto);
							if(temSinanpeAmortiguamiento != null) {
								listReporte.add(temSinanpeAmortiguamiento);
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
							temClaveBiodiversidadDto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemClaveBiodiversidad temClaveBiodiversidad		= temClaveBiodiversidadService.buscarById(temClaveBiodiversidadDto);
							if(temClaveBiodiversidad != null) {
								listReporte.add(temClaveBiodiversidad);
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
							temHumedalesRamsarDto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemHumedalesRamsar temHumedalesRamsar		= temHumedalesRamsarService.buscarById(temHumedalesRamsarDto);
							if(temHumedalesRamsar != null) {
								listReporte.add(temHumedalesRamsar);
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
							temCoverturaVegetal2015Dto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemCoverturaVegetal2015 temCoverturaVegetal2015		= temCoverturaVegetal2015Service.buscarById(temCoverturaVegetal2015Dto);
							if(temCoverturaVegetal2015 != null) {
								listReporte.add(temCoverturaVegetal2015);
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
							temCarbonoEcozonasDto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemCarbonoEcozonas temCarbonoEcozonas		= temCarbonoEcozonasService.buscarById(temCarbonoEcozonasDto);
							if(temCarbonoEcozonas != null) {
								listReporte.add(temCarbonoEcozonas);
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
							temIndiceImportanciaBiologicaDto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemIndiceImportanciaBiologica temIndiceImportanciaBiologica		= temIndiceImportanciaBiologicaService.buscarById(temIndiceImportanciaBiologicaDto);
							if(temIndiceImportanciaBiologica != null) {
								listReporte.add(temIndiceImportanciaBiologica);
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
							temCentrosPobladosDto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemCentrosPoblados temCentrosPoblados		= temCentrosPobladosService.buscarById(temCentrosPobladosDto);
							if(temCentrosPoblados != null) {
								listReporte.add(temCentrosPoblados);
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
							temProyeccionDensidadPob2015Dto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemProyeccionDensidadPob2015 temProyeccionDensidadPob2015		= temProyeccionDensidadPob2015Service.buscarById(temProyeccionDensidadPob2015Dto);
							if(temProyeccionDensidadPob2015 != null) {
								listReporte.add(temProyeccionDensidadPob2015);
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
							temCostoOportunidadDeforestacionDto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemCostoOportunidadDeforestacion temCostoOportunidadDeforestacion		= temCostoOportunidadDeforestacionService.buscarById(temCostoOportunidadDeforestacionDto);
							if(temCostoOportunidadDeforestacion != null) {
								listReporte.add(temCostoOportunidadDeforestacion);
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
							temProyectosPuntosDto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemProyectosPuntos temProyectosPuntos		= temProyectosPuntosService.buscarById(temProyectosPuntosDto);
							if(temProyectosPuntos != null) {
								listReporte.add(temProyectosPuntos);
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
							temProyectosPoligonosDto.setSrlGid(CadenaUtil.getInte(strIdData));
							TemProyectosPoligonos temProyectosPoligonos		= temProyectosPoligonosService.buscarById(temProyectosPoligonosDto);
							if(temProyectosPoligonos != null) {
								listReporte.add(temProyectosPoligonos);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						} finally {
							listReporteOk.add("TemProyectosPoligonosService");
						}
						break;
					}
					///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
					}
				}
				strGeometriaRespuesta	= evaluarGeometrias(listReporte);
			}
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
	
}
