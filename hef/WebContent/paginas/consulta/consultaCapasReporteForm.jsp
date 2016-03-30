<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
<%@page import="wcmc.hef.general.util.ConfiguracionProperties"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="modal-header">
	<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
	<h4 class="modal-title">Reporte de analitico de capas</h4>
</div>
<div class="modal-body">
	<div class="row">
		<div class="col-lg-4" style="overflow: auto;height: 450px;">
			Reporte de capas encontradas
			<div class="list-group">
			<s:if test="%{#session.reporte.listBasHidroRios100000.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('basHidroRios100000Reporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Bas hidro rios100000  <span class="badge"><s:property value="%{#session.reporte.listBasHidroRios100000.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listBasHidroRiosLagunas.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('basHidroRiosLagunasReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Bas hidro rios lagunas  <span class="badge"><s:property value="%{#session.reporte.listBasHidroRiosLagunas.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listBasLimAmazonia.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('basLimAmazoniaReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Bas lim amazonia  <span class="badge"><s:property value="%{#session.reporte.listBasLimAmazonia.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listBasLimDepartamento.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('basLimDepartamentoReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Bas lim departamento  <span class="badge"><s:property value="%{#session.reporte.listBasLimDepartamento.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listBasLimDistritos.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('basLimDistritosReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Bas lim distritos  <span class="badge"><s:property value="%{#session.reporte.listBasLimDistritos.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listBasLimProvincia.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('basLimProvinciaReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Bas lim provincia  <span class="badge"><s:property value="%{#session.reporte.listBasLimProvincia.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listBasViasRedVialDepartamental.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('basViasRedVialDepartamentalReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Bas vias red vial departamental  <span class="badge"><s:property value="%{#session.reporte.listBasViasRedVialDepartamental.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listBasViasRedVialNacional.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('basViasRedVialNacionalReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Bas vias red vial nacional  <span class="badge"><s:property value="%{#session.reporte.listBasViasRedVialNacional.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listBasViasRedVialVecinal.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('basViasRedVialVecinalReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Bas vias red vial vecinal  <span class="badge"><s:property value="%{#session.reporte.listBasViasRedVialVecinal.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemAnpNacional.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temAnpNacionalReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem anp nacional  <span class="badge"><s:property value="%{#session.reporte.listTemAnpNacional.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemAnpPrivada.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temAnpPrivadaReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem anp privada  <span class="badge"><s:property value="%{#session.reporte.listTemAnpPrivada.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemAnpRegional.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temAnpRegionalReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem anp regional  <span class="badge"><s:property value="%{#session.reporte.listTemAnpRegional.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemCarbonoEcozonas.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temCarbonoEcozonasReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem carbono ecozonas  <span class="badge"><s:property value="%{#session.reporte.listTemCarbonoEcozonas.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemCentrosPoblados.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temCentrosPobladosReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem centros poblados  <span class="badge"><s:property value="%{#session.reporte.listTemCentrosPoblados.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemClaveBiodiversidad.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temClaveBiodiversidadReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem clave biodiversidad  <span class="badge"><s:property value="%{#session.reporte.listTemClaveBiodiversidad.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemComunidadesNativas.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temComunidadesNativasReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem comunidades nativas  <span class="badge"><s:property value="%{#session.reporte.listTemComunidadesNativas.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemConcesionesEcoturismo.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temConcesionesEcoturismoReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem concesiones ecoturismo  <span class="badge"><s:property value="%{#session.reporte.listTemConcesionesEcoturismo.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemConcesionesForestalesCastania.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temConcesionesForestalesCastaniaReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem concesiones forestales castania/shiringa  <span class="badge"><s:property value="%{#session.reporte.listTemConcesionesForestalesCastania.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemConcesionesForestalesConservacion.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temConcesionesForestalesConservacionReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem concesiones forestales conservacion  <span class="badge"><s:property value="%{#session.reporte.listTemConcesionesForestalesConservacion.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemConcesionesForestalesMaderableAdecuadas.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temConcesionesForestalesMaderableAdecuadasReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem concesiones forestales maderable adecuadas  <span class="badge"><s:property value="%{#session.reporte.listTemConcesionesForestalesMaderableAdecuadas.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemConcesionesForestalesMaderableConcurso.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temConcesionesForestalesMaderableConcursoReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem concesiones forestales maderable concurso  <span class="badge"><s:property value="%{#session.reporte.listTemConcesionesForestalesMaderableConcurso.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemConcesionesForestalesManejoFaunaSilvestre.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temConcesionesForestalesManejoFaunaSilvestreReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem concesiones forestales manejo fauna silvestre  <span class="badge"><s:property value="%{#session.reporte.listTemConcesionesForestalesManejoFaunaSilvestre.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemConcesionesForestalesReforestacion.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temConcesionesForestalesReforestacionReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem concesiones forestales reforestacion  <span class="badge"><s:property value="%{#session.reporte.listTemConcesionesForestalesReforestacion.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemConcesionesMineras.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temConcesionesMinerasReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem concesiones mineras  <span class="badge"><s:property value="%{#session.reporte.listTemConcesionesMineras.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemConcesionHidroelectricasDistribucion.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temConcesionHidroelectricasDistribucionReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem concesion hidroelectricas distribucion  <span class="badge"><s:property value="%{#session.reporte.listTemConcesionHidroelectricasDistribucion.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemConcesionHidroelectricasGeneracion.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temConcesionHidroelectricasGeneracionReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem concesion hidroelectricas generacion  <span class="badge"><s:property value="%{#session.reporte.listTemConcesionHidroelectricasGeneracion.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemCostoOportunidadDeforestacion.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temCostoOportunidadDeforestacionReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem costo oportunidad deforestacion  <span class="badge"><s:property value="%{#session.reporte.listTemCostoOportunidadDeforestacion.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemCoverturaVegetal2015.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temCoverturaVegetal2015Reporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem covertura vegetal2015  <span class="badge"><s:property value="%{#session.reporte.listTemCoverturaVegetal2015.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemCuencasHidrograficas.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temCuencasHidrograficasReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem cuencas hidrograficas  <span class="badge"><s:property value="%{#session.reporte.listTemCuencasHidrograficas.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemHumedalesRamsar.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temHumedalesRamsarReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem humedales ramsar  <span class="badge"><s:property value="%{#session.reporte.listTemHumedalesRamsar.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemIndiceImportanciaBiologica.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temIndiceImportanciaBiologicaReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem indice importancia biologica  <span class="badge"><s:property value="%{#session.reporte.listTemIndiceImportanciaBiologica.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemPrediosRurales.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temPrediosRuralesReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem predios rurales  <span class="badge"><s:property value="%{#session.reporte.listTemPrediosRurales.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemProyeccionDensidadPob2015.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temProyeccionDensidadPob2015Reporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem proyeccion densidad pob2015  <span class="badge"><s:property value="%{#session.reporte.listTemProyeccionDensidadPob2015.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemProyectosPoligonos.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temProyectosPoligonosReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem proyectos poligonos  <span class="badge"><s:property value="%{#session.reporte.listTemProyectosPoligonos.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemProyectosPuntos.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temProyectosPuntosReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem proyectos puntos  <span class="badge"><s:property value="%{#session.reporte.listTemProyectosPuntos.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemReservasTerritorialesIndigenas.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temReservasTerritorialesIndigenasReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem reservas territoriales indigenas  <span class="badge"><s:property value="%{#session.reporte.listTemReservasTerritorialesIndigenas.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemSinanpeAmortiguamiento.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temSinanpeAmortiguamientoReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem sinanpe amortiguamiento  <span class="badge"><s:property value="%{#session.reporte.listTemSinanpeAmortiguamiento.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemSoeconComunidadesCampesinasTotales.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temSoeconComunidadesCampesinasReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem soecon comunidades campesinas totales  <span class="badge"><s:property value="%{#session.reporte.listTemSoeconComunidadesCampesinasTotales.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemSoeconSolicitudCreacionReservasTerritoriales.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temSoeconSolicitudCreacionReservasTerritorialesReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem soecon solicitud creacion reservas territoriales  <span class="badge"><s:property value="%{#session.reporte.listTemSoeconSolicitudCreacionReservasTerritoriales.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemViaFerrea.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temViaFerreaReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem via ferrea  <span class="badge"><s:property value="%{#session.reporte.listTemViaFerrea.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemViasTrochas.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temViasTrochasReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem vias trochas  <span class="badge"><s:property value="%{#session.reporte.listTemViasTrochas.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listTemZonificPotencialBosqueProduccionPermanente.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('temZonificPotencialBosqueProduccionPermanenteReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem zonific potencial bosque produccion permanente  <span class="badge"><s:property value="%{#session.reporte.listTemZonificPotencialBosqueProduccionPermanente.size()}" /></span></a>
			</s:if>
			
			<!-- Capas de tipo raster -->
			
			<s:if test="%{#session.reporte.beanTemBiodiversidadEspeciesPeligroExtincion!=null}">
				<a href="#" onclick="mostrarDetaRepo('temBiodiversidadEspeciesPeligroExtincionReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem biodiversidad especies peligro extincion  <span class="badge">1</span></a>
			</s:if>
			<s:if test="%{#session.reporte.beanTemBiodiversidadRiquezaPotencialEspeciesFaunaEndemica!=null}">
				<a href="#" onclick="mostrarDetaRepo('temBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem biodiversidad riqueza potencial especies fauna endemica  <span class="badge">1</span></a>
			</s:if>
			<s:if test="%{#session.reporte.beanTemDensidadCarbonoAerea!=null}">
				<a href="#" onclick="mostrarDetaRepo('temDensidadCarbonoAereaReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem densidad carbono aerea  <span class="badge">1</span></a>
			</s:if>
			<s:if test="%{#session.reporte.beanTemRiesgoErosionHidrica!=null}">
				<a href="#" onclick="mostrarDetaRepo('temRiesgoErosionHidricaReporte.jsp','idDivDetaRepo', this);" class="list-group-item "> Tem riesgo erosion hidrica  <span class="badge">1</span></a>
			</s:if>
			
			<!-- Capas de usuario -->
			
			<s:if test="%{#session.reporte.listGeometriaUsuario.size()>0}">
				<s:iterator value="#session.reporte.listGeometriaUsuario" var="mapGeometriaUsuario">
					<a href="#" onclick="mostrarDetaRepo('capaUsuarioReporte.jsp?srlIdCapa=${mapGeometriaUsuario.srlIdCapa}','idDivDetaRepo', this);" class="list-group-item "> ${mapGeometriaUsuario.strNombre} <span class="badge"><s:property value="%{#mapGeometriaUsuario.list.size()}" /></span></a>
				</s:iterator>
			</s:if>
			
			</div>
		</div>
		<div class="col-lg-8" id="idDivDetaRepo" style="overflow: auto;height: 450px;">
		</div>
	</div>

</div>

<div class="modal-footer">

	<button type="button" class="btn btn-default " onclick="return reportePDF();">Reporte PDF</button>
<!-- 	<button type="button" class="btn btn-default " onclick="return exportarPNG();">Exportar PNG</button> -->
	<button type="button" class="btn btn-default " data-dismiss="modal">Cerrar</button>
<!-- 	<a id="export-png" class="btn" download="map.png"><i class="icon-download"></i> Export PNG</a> -->
</div>
