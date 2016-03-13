<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
<s:if test="%{#session.comboACL.listBasLimProvincia.size()>0}">
	<tr>
		<td><strong>Bas Lim Provincia</strong></td>
		<td>
			<s:select list="#session.comboACL.listBasLimProvincia" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNombdep+' - '+strNombprov}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listBasLimDepartamento.size()>0}">
	<tr>
		<td><strong>Bas Lim Departamento</strong></td>
		<td>
			<s:select list="#session.comboACL.listBasLimDepartamento" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNombdep}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listBasLimDistritos.size()>0}">
	<tr>
		<td><strong>Bas Lim Distritos</strong></td>
		<td>
			<s:select list="#session.comboACL.listBasLimDistritos" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNombdep+' - '+strNombprov+' - '+strNombdist}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemCuencasHidrograficas.size()>0}">
	<tr>
		<td><strong>Tem Cuencas Hidrograficas</strong></td>
		<td>
			<s:select list="#session.comboACL.listTemCuencasHidrograficas" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNombre}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listBasViasRedVialVecinal.size()>0}">
	<tr>
		<td><strong>Bas Vias Red Vial Vecinal</strong></td>
		<td>
			<s:select list="#session.comboACL.listBasViasRedVialVecinal" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strRuta}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listBasViasRedVialNacional.size()>0}">
	<tr>
		<td><strong>Bas Vias Red Vial Nacional</strong></td>
		<td>
			<s:select list="#session.comboACL.listBasViasRedVialNacional" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strRutaD044}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listBasViasRedVialDepartamental.size()>0}">
	<tr>
		<td><strong>Bas Vias Red Vial Departamental</strong></td>
		<td>
			<s:select list="#session.comboACL.listBasViasRedVialDepartamental" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strRutaD044}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemSoeconComunidadesCampesinas.size()>0}">
	<tr>
		<td><strong>Tem Soecon Comunidades Campesinas</strong></td>
		<td>
			<s:select list="#session.comboACL.listTemSoeconComunidadesCampesinas" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNombre}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemComunidadesNativas.size()>0}">
	<tr>
		<td><strong>Tem Comunidades Nativas</strong></td>
		<td>
			<s:select list="#session.comboACL.listTemComunidadesNativas" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNombre+' - '+strEtnia1}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemReservasTerritorialesIndigenas.size()>0}">
	<tr>
		<td><strong>Tem Reservas Territoriales Indigenas</strong></td>
		<td>
			<s:select list="#session.comboACL.listTemReservasTerritorialesIndigenas" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNombre+' - '+strEtnia}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemSoeconSolicitudCreacionReservasTerritoriales.size()>0}">
	<tr>
		<td><strong>Tem Soecon Solicitud Creacion Reservas Territoriales</strong></td>
		<td>
			<s:select list="#session.comboACL.listTemSoeconSolicitudCreacionReservasTerritoriales" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNomret}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemConcesionesEcoturismo.size()>0}">
	<tr>
		<td><strong>Tem Concesiones Ecoturismo</strong></td>
		<td>
			<s:select list="#session.comboACL.listTemConcesionesEcoturismo" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strTitular+' - '+strContrato}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemConcesionesForestalesCastania.size()>0}">
	<tr>
		<td><strong>Tem Concesiones Forestales Castania</strong></td>
		<td>
			<s:select list="#session.comboACL.listTemConcesionesForestalesCastania" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strTitular+' - '+strContrato}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemConcesionesForestalesConservacion.size()>0}">
	<tr>
		<td><strong>Tem Concesiones Forestales Conservacion</strong></td>
		<td>
			<s:select list="#session.comboACL.listTemConcesionesForestalesConservacion" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strTitular+' - '+strContrato}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemConcesionesForestalesMaderableAdecuadas.size()>0}">
	<tr>
		<td><strong>Tem Concesiones Forestales Maderable Adecuadas</strong></td>
		<td>
			<s:select list="#session.comboACL.listTemConcesionesForestalesMaderableAdecuadas" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strTitular+' - '+strContrato}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemConcesionesForestalesMaderableConcurso.size()>0}">
	<tr>
		<td><strong>Tem Concesiones Forestales Maderable Concurso</strong></td>
		<td>
			<s:select list="#session.comboACL.listTemConcesionesForestalesMaderableConcurso" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strTitular+' - '+strConcurso}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemConcesionesForestalesManejoFaunaSilvestre.size()>0}">
	<tr>
		<td><strong>Tem Concesiones Forestales Manejo Fauna Silvestre</strong></td>
		<td>
			<s:select list="#session.comboACL.listTemConcesionesForestalesManejoFaunaSilvestre" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strTitular+' - '+strContrato}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemConcesionesForestalesReforestacion.size()>0}">
	<tr>
		<td><strong>Tem Concesiones Forestales Reforestacion</strong></td>
		<td>
			<s:select list="#session.comboACL.listTemConcesionesForestalesReforestacion" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strTitular+' - '+strContrato}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemZonificPotencialBosqueProduccionPermanente.size()>0}">
	<tr>
		<td><strong>Tem Zonific Potencial Bosque Produccion Permanente</strong></td>
		<td>
			<s:select list="#session.comboACL.listTemZonificPotencialBosqueProduccionPermanente" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strTipo+' - '+strDocLegal}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemConcesionHidroelectricasGeneracion.size()>0}">
	<tr>
		<td><strong>Tem Concesion Hidroelectricas Generacion</strong></td>
		<td>
			<s:select list="#session.comboACL.listTemConcesionHidroelectricasGeneracion" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strConcesion+' - '+strFuente}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemConcesionHidroelectricasDistribucion.size()>0}">
	<tr>
		<td><strong>Tem Concesion Hidroelectricas Distribucion</strong></td>
		<td>
			<s:select list="#session.comboACL.listTemConcesionHidroelectricasDistribucion" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strConcesion+' - '+strSistemaEl}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemConcesionesMineras.size()>0}">
	<tr>
		<td><strong>Tem Concesiones Mineras</strong></td>
		<td>
			<s:select list="#session.comboACL.listTemConcesionesMineras" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strTitConces}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemAnpNacional.size()>0}">
	<tr>
		<td><strong>Tem Anp Nacional</strong></td>
		<td>
			<s:select list="#session.comboACL.listTemAnpNacional" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strAnpCate+' - '+strAnpNomb}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemAnpRegional.size()>0}">
	<tr>
		<td><strong>Tem Anp Regional</strong></td>
		<td>
			<s:select list="#session.comboACL.listTemAnpRegional" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strAnpcNomb}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemAnpPrivada.size()>0}">
	<tr>
		<td><strong>Tem Anp Privada</strong></td>
		<td>
			<s:select list="#session.comboACL.listTemAnpPrivada" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strAnpcNomb}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemSinanpeAmortiguamiento.size()>0}">
	<tr>
		<td><strong>Tem Sinanpe Amortiguamiento</strong></td>
		<td>
			<s:select list="#session.comboACL.listTemSinanpeAmortiguamiento" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strZaNomb}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemClaveBiodiversidad.size()>0}">
	<tr>
		<td><strong>Tem Clave Biodiversidad</strong></td>
		<td>
			<s:select list="#session.comboACL.listTemClaveBiodiversidad" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNatname}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemHumedalesRamsar.size()>0}">
	<tr>
		<td><strong>Tem Humedales Ramsar</strong></td>
		<td>
			<s:select list="#session.comboACL.listTemHumedalesRamsar" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNombre}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemCoverturaVegetal2015.size()>0}">
	<tr>
		<td><strong>Tem Covertura Vegetal 2015</strong></td>
		<td>
			<s:select list="#session.comboACL.listTemCoverturaVegetal2015" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strCobveg2013}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemCarbonoEcozonas.size()>0}">
	<tr>
		<td><strong>Tem Carbono Ecozonas</strong></td>
		<td>
			<s:select list="#session.comboACL.listTemCarbonoEcozonas" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strEcozona+' - '+strTcHa}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemIndiceImportanciaBiologica.size()>0}">
	<tr>
		<td><strong>Tem Indice Importancia Biologica</strong></td>
		<td>
			<s:select list="#session.comboACL.listTemIndiceImportanciaBiologica" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{dblImpGlob}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemCentrosPoblados.size()>0}">
	<tr>
		<td><strong>Tem Centros Poblados</strong></td>
		<td>
			<s:select list="#session.comboACL.listTemCentrosPoblados" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strNomccpp+' - '+strNomcat+' - '+intPob07}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemProyeccionDensidadPob2015.size()>0}">
	<tr>
		<td><strong>Tem Proyeccion Densidad Pob 2015</strong></td>
		<td>
			<s:select list="#session.comboACL.listTemProyeccionDensidadPob2015" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{dblPopDens}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemCostoOportunidadDeforestacion.size()>0}">
	<tr>
		<td><strong>Tem Costo Oportunidad Deforestacion</strong></td>
		<td>
			<s:select list="#session.comboACL.listTemCostoOportunidadDeforestacion" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{dblCopTco2H}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemProyectosPuntos.size()>0}">
	<tr>
		<td><strong>Tem Proyectos Puntos</strong></td>
		<td>
			<s:select list="#session.comboACL.listTemProyectosPuntos" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strIniciativa}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
<s:if test="%{#session.comboACL.listTemProyectosPoligonos.size()>0}">
	<tr>
		<td><strong>Tem Proyectos Poligonos</strong></td>
		<td>
			<s:select list="#session.comboACL.listTemProyectosPoligonos" name="combo_area_ACL" headerKey="" headerValue="-Seleccionar-" listKey="srlGid" listValue="%{strInicProg}" data-live-search="true"></s:select>
		</td>
	</tr>
</s:if>
</table>
