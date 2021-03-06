<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
<s:if test="%{#session.comboCentrar.listBasLimProvincia.size()>0}">
	<tr>
		<td><strong>Provincias</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listBasLimProvincia" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNombdep+' - '+strNombprov}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listBasLimDepartamento.size()>0}">
	<tr>
		<td><strong>Departamentos</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listBasLimDepartamento" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNombdep}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listBasLimDistritos.size()>0}">
	<tr>
		<td><strong>Distritos</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listBasLimDistritos" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNombdep+' - '+strNombprov+' - '+strNombdist}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listTemCuencasHidrograficas.size()>0}">
	<tr>
		<td><strong>Cuencas Hidrograficas</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listTemCuencasHidrograficas" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNombre}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listBasViasRedVialVecinal.size()>0}">
	<tr>
		<td><strong>Red Vial Vecinal</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listBasViasRedVialVecinal" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strRuta}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listBasViasRedVialNacional.size()>0}">
	<tr>
		<td><strong>Red Vial Nacional</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listBasViasRedVialNacional" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strRutaD044}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listBasViasRedVialDepartamental.size()>0}">
	<tr>
		<td><strong>Red Vial Departamental</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listBasViasRedVialDepartamental" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strRutaD044}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listTemSoeconComunidadesCampesinas.size()>0}">
	<tr>
		<td><strong>Comunidades Campesinas</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listTemSoeconComunidadesCampesinas" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNombre}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listTemComunidadesNativas.size()>0}">
	<tr>
		<td><strong>Comunidades Nativas</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listTemComunidadesNativas" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNombre+' - '+strEtnia1}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listTemReservasTerritorialesIndigenas.size()>0}">
	<tr>
		<td><strong>Reservas Territoriales Indigenas</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listTemReservasTerritorialesIndigenas" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNombre+' - '+strEtnia}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listTemSoeconSolicitudCreacionReservasTerritoriales.size()>0}">
	<tr>
		<td><strong>Solicitud de Creacion de Reservas Indigenas</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listTemSoeconSolicitudCreacionReservasTerritoriales" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNomret}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listTemConcesionesEcoturismo.size()>0}">
	<tr>
		<td><strong>Concesiones de Ecoturismo</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listTemConcesionesEcoturismo" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strTitular+' - '+strContrato}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listTemConcesionesForestalesCastania.size()>0}">
	<tr>
		<td><strong>Concesiones de Castaña</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listTemConcesionesForestalesCastania" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strTitular+' - '+strContrato}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listTemConcesionesForestalesConservacion.size()>0}">
	<tr>
		<td><strong>Concesiones para la Conservación</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listTemConcesionesForestalesConservacion" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strTitular+' - '+strContrato}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listTemConcesionesForestalesMaderableAdecuadas.size()>0}">
	<tr>
		<td><strong>Concesiones Forestales Maderables</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listTemConcesionesForestalesMaderableAdecuadas" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strTitular+' - '+strContrato}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listTemConcesionesForestalesMaderableConcurso.size()>0}">
	<tr>
		<td><strong>Concesiones Forestales Maderables en Concurso</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listTemConcesionesForestalesMaderableConcurso" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strTitular+' - '+strConcurso}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listTemConcesionesForestalesManejoFaunaSilvestre.size()>0}">
	<tr>
		<td><strong>Concesiones de Manejo de Fauna Silvestre</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listTemConcesionesForestalesManejoFaunaSilvestre" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strTitular+' - '+strContrato}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listTemConcesionesForestalesReforestacion.size()>0}">
	<tr>
		<td><strong>Concesiones con fines Forestación y Reforestación</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listTemConcesionesForestalesReforestacion" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strTitular+' - '+strContrato}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listTemZonificPotencialBosqueProduccionPermanente.size()>0}">
	<tr>
		<td><strong>Bosques de Producción Permanente</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listTemZonificPotencialBosqueProduccionPermanente" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strTipo+' - '+strDocLegal}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listTemConcesionHidroelectricasGeneracion.size()>0}">
	<tr>
		<td><strong>Concesiones de Generación de Energía eléctrica</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listTemConcesionHidroelectricasGeneracion" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strConcesion+' - '+strFuente}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listTemConcesionHidroelectricasDistribucion.size()>0}">
	<tr>
		<td><strong>Concesiones de distribución de energía eléctrica</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listTemConcesionHidroelectricasDistribucion" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strConcesion+' - '+strSistemaEl}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listTemConcesionesMineras.size()>0}">
	<tr>
		<td><strong>Concesiones Mineras</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listTemConcesionesMineras" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strConcesion}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listTemAnpNacional.size()>0}">
	<tr>
		<td><strong>Áreas Naturales Protegidas</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listTemAnpNacional" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strAnpCate+' - '+strAnpNomb}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listTemAnpRegional.size()>0}">
	<tr>
		<td><strong>Áreas de conservación regionales</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listTemAnpRegional" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strAnpcNomb}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listTemAnpPrivada.size()>0}">
	<tr>
		<td><strong>Áreas protegidas privadas</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listTemAnpPrivada" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strAnpcNomb}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listTemSinanpeAmortiguamiento.size()>0}">
	<tr>
		<td><strong>Zonas de amortiguamiento de las áreas naturales protegidas</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listTemSinanpeAmortiguamiento" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strZaNomb}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listTemClaveBiodiversidad.size()>0}">
	<tr>
		<td><strong>Áreas Clave para la Biodiversidad</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listTemClaveBiodiversidad" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNatname}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listTemHumedalesRamsar.size()>0}">
	<tr>
		<td><strong>Zonas Ramsar</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listTemHumedalesRamsar" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNombre}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listTemCoverturaVegetal2015.size()>0}">
	<tr>
		<td><strong>Covertura Vegetal</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listTemCoverturaVegetal2015" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strCobveg2013}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listTemCarbonoEcozonas.size()>0}">
	<tr>
		<td><strong>Densidad de Carbono por Ecozonas</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listTemCarbonoEcozonas" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strEcozona+' - '+strTcHa}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listTemIndiceImportanciaBiologica.size()>0}">
	<tr>
		<td><strong>Indice de Importancia Biologica</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listTemIndiceImportanciaBiologica" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{dblImpGlob}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listTemCentrosPoblados.size()>0}">
	<tr>
		<td><strong>Centros Poblados</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listTemCentrosPoblados" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNomccpp+' - '+strNomcat+' - '+intPob07}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listTemProyeccionDensidadPob2015.size()>0}">
	<tr>
		<td><strong>Densidad de Población</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listTemProyeccionDensidadPob2015" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{dblPopDens}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listTemCostoOportunidadDeforestacion.size()>0}">
	<tr>
		<td><strong>Costos de oportunidad para reducir emisiones por Deforestación</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listTemCostoOportunidadDeforestacion" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{dblCopTco2H}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listTemProyectosPuntos.size()>0}">
	<tr>
		<td><strong>Proyectos de conservación (Por puntos)</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listTemProyectosPuntos" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strIniciativa}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboCentrar.listTemProyectosPoligonos.size()>0}">
	<tr>
		<td><strong>Áreas de proyectos de conservación</strong></td>
		<td>
			<s:select list="#session.comboCentrar.listTemProyectosPoligonos" name="combo_centrar_visor" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strInicProg}" data-live-search="true" onchange="centrar_mapa_desde_combo(this);"></s:select>
		</td>
	</tr>
</s:if>
</table>
