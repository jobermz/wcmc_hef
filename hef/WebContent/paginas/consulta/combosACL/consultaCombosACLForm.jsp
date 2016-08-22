<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
<s:if test="%{#session.comboACL.listBasLimProvincia.size()>0}">
	<tr>
		<td><strong>Provincias</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listBasLimProvincia" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNombdep+' - '+strNombprov}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listBasLimDepartamento.size()>0}">
	<tr><td><strong>Departamentos</strong></td></tr>
	<tr>
		<td>
			<s:select multiple="true" list="#session.comboACL.listBasLimDepartamento" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNombdep}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listBasLimDistritos.size()>0}">
	<tr>
		<td><strong>Distritos</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listBasLimDistritos" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNombdep+' - '+strNombprov+' - '+strNombdist}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemCuencasHidrograficas.size()>0}">
	<tr>
		<td><strong>Cuencas Hidrográficas</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listTemCuencasHidrograficas" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNombre}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listBasViasRedVialVecinal.size()>0}">
	<tr>
		<td><strong>Red Vial Vecinal</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listBasViasRedVialVecinal" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strRuta}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listBasViasRedVialNacional.size()>0}">
	<tr>
		<td><strong>Red Vial Nacional</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listBasViasRedVialNacional" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strRutaD044}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listBasViasRedVialDepartamental.size()>0}">
	<tr>
		<td><strong>Red Vial Departamental</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listBasViasRedVialDepartamental" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strRutaD044}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemSoeconComunidadesCampesinas.size()>0}">
	<tr>
		<td><strong>Comunidades Campesinas</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listTemSoeconComunidadesCampesinas" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNombre}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemComunidadesNativas.size()>0}">
	<tr>
		<td><strong>Comunidades Nativas</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listTemComunidadesNativas" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNombre+' - '+strEtnia1}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemReservasTerritorialesIndigenas.size()>0}">
	<tr>
		<td><strong>Reservas Territoriales Indigenas</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listTemReservasTerritorialesIndigenas" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNombre+' - '+strEtnia}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemSoeconSolicitudCreacionReservasTerritoriales.size()>0}">
	<tr>
		<td><strong>Solicitud de Creación de Reservas Indigenas</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listTemSoeconSolicitudCreacionReservasTerritoriales" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNomret}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemConcesionesEcoturismo.size()>0}">
	<tr>
		<td><strong>Concesiones Ecoturismo</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listTemConcesionesEcoturismo" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strTitular+' - '+strContrato}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemConcesionesForestalesCastania.size()>0}">
	<tr>
		<td><strong>Concesiones de Castaña</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listTemConcesionesForestalesCastania" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strTitular+' - '+strContrato}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemConcesionesForestalesConservacion.size()>0}">
	<tr>
		<td><strong>Concesiones para la Conservación</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listTemConcesionesForestalesConservacion" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strTitular+' - '+strContrato}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemConcesionesForestalesMaderableAdecuadas.size()>0}">
	<tr>
		<td><strong>Concesiones Forestales Maderables</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listTemConcesionesForestalesMaderableAdecuadas" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strTitular+' - '+strContrato}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemConcesionesForestalesMaderableConcurso.size()>0}">
	<tr>
		<td><strong>Concesiones Forestales Maderable Concurso</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listTemConcesionesForestalesMaderableConcurso" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strTitular+' - '+strConcurso}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemConcesionesForestalesManejoFaunaSilvestre.size()>0}">
	<tr>
		<td><strong>Concesiones de Manejo de Fauna Silvestre</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listTemConcesionesForestalesManejoFaunaSilvestre" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strTitular+' - '+strContrato}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemConcesionesForestalesReforestacion.size()>0}">
	<tr>
		<td><strong>Concesiones con Fines de Forestación y Reforestación</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listTemConcesionesForestalesReforestacion" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strTitular+' - '+strContrato}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemZonificPotencialBosqueProduccionPermanente.size()>0}">
	<tr>
		<td><strong>Bosques de Producción Permanente</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listTemZonificPotencialBosqueProduccionPermanente" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strTipo+' - '+strDocLegal}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemConcesionHidroelectricasGeneracion.size()>0}">
	<tr>
		<td><strong>Concesión de generación de energía eléctrica</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listTemConcesionHidroelectricasGeneracion" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strConcesion+' - '+strFuente}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemConcesionHidroelectricasDistribucion.size()>0}">
	<tr>
		<td><strong>Concesiones de Distribución de Energía Eléctrica</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listTemConcesionHidroelectricasDistribucion" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strConcesion+' - '+strSistemaEl}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemConcesionesMineras.size()>0}">
	<tr>
		<td><strong>Concesiones Mineras</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listTemConcesionesMineras" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strConcesion}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemAnpNacional.size()>0}">
	<tr>
		<td><strong>Áreas Naturales Protegidas</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listTemAnpNacional" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strAnpCate+' - '+strAnpNomb}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemAnpRegional.size()>0}">
	<tr>
		<td><strong>Áreas de conservación Regionales</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listTemAnpRegional" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strAnpcNomb}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemAnpPrivada.size()>0}">
	<tr>
		<td><strong>Áreas protegidas Privadas</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listTemAnpPrivada" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strAnpcNomb}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemSinanpeAmortiguamiento.size()>0}">
	<tr>
		<td><strong>Zonas de Amortiguamiento de las Áreas Naturales Protegidas</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listTemSinanpeAmortiguamiento" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strZaNomb}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemClaveBiodiversidad.size()>0}">
	<tr>
		<td><strong>Áreas Claves para la Biodiversidad</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listTemClaveBiodiversidad" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNatname}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemHumedalesRamsar.size()>0}">
	<tr>
		<td><strong>Zonas Ramsar</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listTemHumedalesRamsar" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNombre}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemCoverturaVegetal2015.size()>0}">
	<tr>
		<td><strong>Cobertura Vegetal</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listTemCoverturaVegetal2015" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strCobveg2013}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemCarbonoEcozonas.size()>0}">
	<tr>
		<td><strong>Densidad de Carbono Ecozonas</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listTemCarbonoEcozonas" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strEcozona+' - '+strTcHa}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemIndiceImportanciaBiologica.size()>0}">
	<tr>
		<td><strong>Índice de Importancia Biológica</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listTemIndiceImportanciaBiologica" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{dblImpGlob}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemCentrosPoblados.size()>0}">
	<tr>
		<td><strong>Centros Poblados</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listTemCentrosPoblados" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNomccpp+' - '+strNomcat+' - '+intPob07}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemProyeccionDensidadPob2015.size()>0}">
	<tr>
		<td><strong>Densidad de Población</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listTemProyeccionDensidadPob2015" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{dblPopDens}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemCostoOportunidadDeforestacion.size()>0}">
	<tr>
		<td><strong>Costos de Oportunidad para Reducir Emisiones por Deforestación</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listTemCostoOportunidadDeforestacion" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{dblCopTco2H}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemProyectosPuntos.size()>0}">
	<%--
	<tr>
		<td><strong>Proyectos de Conservación por Puntos</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listTemProyectosPuntos" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strIniciativa}" data-live-search="true"></s:select>
		</td>
	</tr>
	--%>
	<tr>
		<td><strong>Departamento</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listMapDepartamentos" name="combo_area_ACL_depa" cssClass="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="de_nombdep" listValue="%{de_nombdep}" data-live-search="true"></s:select>
		</td>
	</tr>
	<%--
	<tr>
		<td><strong>Administrador</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listMapAdministra" name="combo_area_ACL_admi" cssClass="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="de_administra" listValue="%{de_administra}" data-live-search="true"></s:select>
		</td>
	</tr>
	<tr>
		<td><strong>Cooperante</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listMapCoperante" name="combo_area_ACL_coop" cssClass="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="de_cooperante" listValue="%{de_cooperante}" data-live-search="true"></s:select>
		</td>
	</tr>
	--%>
	<tr>
		<td><strong>Año inicio</strong></td>
		<td>
			<s:select list="#session.comboACL.listMapAnioDesde" name="combo_area_ACL_anio_desde" cssClass="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="anio" listValue="%{anio}" ></s:select>
		</td>
	</tr>
	<tr>
		<td><strong>Año termino</strong></td>
		<td>
			<s:select list="#session.comboACL.listMapAnioHasta" name="combo_area_ACL_anio_hasta" cssClass="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="anio" listValue="%{anio}"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemProyectosPoligonos.size()>0}">
	<%--
	<tr>
		<td><strong>Áreas de Proyectos de Conservación</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listTemProyectosPoligonos" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strInicProg}" data-live-search="true"></s:select>
		</td>
	</tr>
	--%>
	<tr>
		<td><strong>Departamento</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listMapDepartamentos" name="combo_area_ACL_depa" cssClass="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="de_nombdep" listValue="%{de_nombdep}" data-live-search="true"></s:select>
		</td>
	</tr>
	<%--
	<tr>
		<td><strong>Administrador</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listMapAdministra" name="combo_area_ACL_admi" cssClass="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="de_administra" listValue="%{de_administra}" data-live-search="true"></s:select>
		</td>
	</tr>
	<tr>
		<td><strong>Cooperante</strong></td>
		<td>
			<s:select multiple="true" list="#session.comboACL.listMapCoperante" name="combo_area_ACL_coop" cssClass="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="de_cooperante" listValue="%{de_cooperante}" data-live-search="true"></s:select>
		</td>
	</tr>
	--%>
	<tr>
		<td><strong>Año inicio</strong></td>
		<td>
			<s:select list="#session.comboACL.listMapAnioDesde" name="combo_area_ACL_anio_desde" cssClass="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="anio" listValue="%{anio}" ></s:select>
		</td>
	</tr>
	<tr>
		<td><strong>Año termino</strong></td>
		<td>
			<s:select list="#session.comboACL.listMapAnioHasta" name="combo_area_ACL_anio_hasta" cssClass="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="anio" listValue="%{anio}" ></s:select>
		</td>
	</tr>
</s:if>
</table>
