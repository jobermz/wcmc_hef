<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"
%><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"
%><%@ taglib prefix="s" uri="/struts-tags"
%><s:if test="%{#session.reporte.listBasHidroRios100000.size()>0}">
	<s:iterator value="#session.reporte.listBasHidroRios100000" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Rios</strong></td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listBasHidroRiosLagunas.size()>0}">
	<s:iterator value="#session.reporte.listBasHidroRiosLagunas" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Rios y lagunas</strong></td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listBasLimAmazonia.size()>0}">
	<s:iterator value="#session.reporte.listBasLimAmazonia" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Limites de la amazonia</strong></td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listBasLimDepartamento.size()>0}">
	<s:iterator value="#session.reporte.listBasLimDepartamento" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Departamento</strong></td>
				<td>${reporte.strNombdep}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listBasLimDistritos.size()>0}">
	<s:iterator value="#session.reporte.listBasLimDistritos" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Distrito</strong></td>
				<td>${reporte.strNombdist}</td>
			</tr>
			<tr>
				<td><strong>Capital</strong></td>
				<td>${reporte.strNomCap}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listBasLimProvincia.size()>0}">
	<s:iterator value="#session.reporte.listBasLimProvincia" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Provincia</strong></td>
				<td>${reporte.strNombprov}</td>
			</tr>
			<tr>
				<td><strong>Capital</strong></td>
				<td>${reporte.strCapital}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listBasViasRedVialDepartamental.size()>0}">
	<s:iterator value="#session.reporte.listBasViasRedVialDepartamental" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>RutaD044</strong></td>
				<td>${reporte.strRutaD044}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listBasViasRedVialNacional.size()>0}">
	<s:iterator value="#session.reporte.listBasViasRedVialNacional" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>RutaD044</strong></td>
				<td>${reporte.strRutaD044}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listBasViasRedVialVecinal.size()>0}">
	<s:iterator value="#session.reporte.listBasViasRedVialVecinal" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Ruta</strong></td>
				<td>${reporte.strRuta}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemAnpNacional.size()>0}">
	<s:iterator value="#session.reporte.listTemAnpNacional" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Categor&iacute;a</strong></td>
				<td>${reporte.strAnpCate}</td>
			</tr>
			<tr>
				<td><strong>ANP</strong></td>
				<td>${reporte.strAnpNomb}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemAnpPrivada.size()>0}">
	<s:iterator value="#session.reporte.listTemAnpPrivada" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>ANP</strong></td>
				<td>${reporte.strAnpcNomb}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemAnpRegional.size()>0}">
	<s:iterator value="#session.reporte.listTemAnpRegional" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>ANP</strong></td>
				<td>${reporte.strAnpcNomb}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemCarbonoEcozonas.size()>0}">
	<s:iterator value="#session.reporte.listTemCarbonoEcozonas" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Ecozona</strong></td>
				<td>${reporte.strEcozona}</td>
			</tr>
			<tr>
				<td><strong>Tc Ha</strong></td>
				<td>${reporte.strTcHa}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemCentrosPoblados.size()>0}">
	<s:iterator value="#session.reporte.listTemCentrosPoblados" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Nombre ccpp</strong></td>
				<td>${reporte.strNomccpp}</td>
			</tr>
			<tr>
				<td><strong>Nombre categor&iacute;a</strong></td>
				<td>${reporte.strNomcat}</td>
			</tr>
			<tr>
				<td><strong>Pob 07</strong></td>
				<td>${reporte.intPob07}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemClaveBiodiversidad.size()>0}">
	<s:iterator value="#session.reporte.listTemClaveBiodiversidad" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Natname</strong></td>
				<td>${reporte.strNatname}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemComunidadesNativas.size()>0}">
	<s:iterator value="#session.reporte.listTemComunidadesNativas" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Nombre</strong></td>
				<td>${reporte.strNombre}</td>
			</tr>
			<tr>
				<td><strong>Etnia1</strong></td>
				<td>${reporte.strEtnia1}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemConcesionesEcoturismo.size()>0}">
	<s:iterator value="#session.reporte.listTemConcesionesEcoturismo" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Titular</strong></td>
				<td>${reporte.strTitular}</td>
			</tr>
			<tr>
				<td><strong>Contrato</strong></td>
				<td>${reporte.strContrato}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemConcesionesForestalesCastania.size()>0}">
	<s:iterator value="#session.reporte.listTemConcesionesForestalesCastania" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Modalidad</strong></td>
				<td>${reporte.strModalidad}</td>
			</tr>
			<tr>
				<td><strong>Titular</strong></td>
				<td>${reporte.strTitular}</td>
			</tr>
			<tr>
				<td><strong>Contrato</strong></td>
				<td>${reporte.strContrato}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemConcesionesForestalesConservacion.size()>0}">
	<s:iterator value="#session.reporte.listTemConcesionesForestalesConservacion" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Titular</strong></td>
				<td>${reporte.strTitular}</td>
			</tr>
			<tr>
				<td><strong>Contrato</strong></td>
				<td>${reporte.strContrato}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemConcesionesForestalesMaderableAdecuadas.size()>0}">
	<s:iterator value="#session.reporte.listTemConcesionesForestalesMaderableAdecuadas" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Titular</strong></td>
				<td>${reporte.strTitular}</td>
			</tr>
			<tr>
				<td><strong>Contrato</strong></td>
				<td>${reporte.strContrato}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemConcesionesForestalesMaderableConcurso.size()>0}">
	<s:iterator value="#session.reporte.listTemConcesionesForestalesMaderableConcurso" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Titular</strong></td>
				<td>${reporte.strTitular}</td>
			</tr>
			<tr>
				<td><strong>Contrato</strong></td>
				<td>${reporte.strContrato}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemConcesionesForestalesManejoFaunaSilvestre.size()>0}">
	<s:iterator value="#session.reporte.listTemConcesionesForestalesManejoFaunaSilvestre" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Titular</strong></td>
				<td>${reporte.strTitular}</td>
			</tr>
			<tr>
				<td><strong>Contrato</strong></td>
				<td>${reporte.strContrato}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemConcesionesForestalesReforestacion.size()>0}">
	<s:iterator value="#session.reporte.listTemConcesionesForestalesReforestacion" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Titular</strong></td>
				<td>${reporte.strTitular}</td>
			</tr>
			<tr>
				<td><strong>Contrato</strong></td>
				<td>${reporte.strContrato}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemConcesionesMineras.size()>0}">
	<s:iterator value="#session.reporte.listTemConcesionesMineras" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Tit Concesi&oacute;n</strong></td>
				<td>${reporte.strTitConces}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemConcesionHidroelectricasDistribucion.size()>0}">
	<s:iterator value="#session.reporte.listTemConcesionHidroelectricasDistribucion" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Concesi&oacute;n</strong></td>
				<td>${reporte.strConcesion}</td>
			</tr>
			<tr>
				<td><strong>Sistema electr</strong></td>
				<td>${reporte.strSistemaEl}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemConcesionHidroelectricasGeneracion.size()>0}">
	<s:iterator value="#session.reporte.listTemConcesionHidroelectricasGeneracion" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Concesi&oacute;n</strong></td>
				<td>${reporte.strConcesion}</td>
			</tr>
			<tr>
				<td><strong>Fuente</strong></td>
				<td>${reporte.strFuente}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemCostoOportunidadDeforestacion.size()>0}">
	<s:iterator value="#session.reporte.listTemCostoOportunidadDeforestacion" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>CopTco2H</strong></td>
				<td>${reporte.dblCopTco2H}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemCoverturaVegetal2015.size()>0}">
	<s:iterator value="#session.reporte.listTemCoverturaVegetal2015" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Cobveg2013</strong></td>
				<td>${reporte.strCobveg2013}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemCuencasHidrograficas.size()>0}">
	<s:iterator value="#session.reporte.listTemCuencasHidrograficas" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Cuenca</strong></td>
				<td>${reporte.strNombre}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemHumedalesRamsar.size()>0}">
	<s:iterator value="#session.reporte.listTemHumedalesRamsar" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Nombre</strong></td>
				<td>${reporte.strNombre}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemIndiceImportanciaBiologica.size()>0}">
	<s:iterator value="#session.reporte.listTemIndiceImportanciaBiologica" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
		
			<tr>
				<td><strong>Nombre</strong></td>
				<td>${reporte.dblImpGlob4Decimales}</td>
			</tr>
		</table>
	</s:iterator>
	
</s:if><s:if test="%{#session.reporte.listTemPrediosRurales.size()>0}">
	<s:iterator value="#session.reporte.listTemPrediosRurales" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Predio rural</strong></td>
				<%--<td>${reporte.strNombdep}</td>--%>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemProyeccionDensidadPob2015.size()>0}">
	<s:iterator value="#session.reporte.listTemProyeccionDensidadPob2015" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Pop. densidad</strong></td>
				<td>${reporte.dblPopDens}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemProyectosPoligonos.size()>0}">
	<s:iterator value="#session.reporte.listTemProyectosPoligonos" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Inic Prog</strong></td>
				<td>${reporte.strInicProg}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemProyectosPuntos.size()>0}">
	<s:iterator value="#session.reporte.listTemProyectosPuntos" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Iniciativa</strong></td>
				<td>${reporte.strIniciativa}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemReservasTerritorialesIndigenas.size()>0}">
	<s:iterator value="#session.reporte.listTemReservasTerritorialesIndigenas" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Nombre</strong></td>
				<td>${reporte.strNombre}</td>
			</tr>
			<tr>
				<td><strong>Etnia</strong></td>
				<td>${reporte.strEtnia}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemSinanpeAmortiguamiento.size()>0}">
	<s:iterator value="#session.reporte.listTemSinanpeAmortiguamiento" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Nombre ZA</strong></td>
				<td>${reporte.strZaNomb}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemSoeconComunidadesCampesinas.size()>0}">
	<s:iterator value="#session.reporte.listTemSoeconComunidadesCampesinas" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Nombre</strong></td>
				<td>${reporte.strNombre}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemSoeconSolicitudCreacionReservasTerritoriales.size()>0}">
	<s:iterator value="#session.reporte.listTemSoeconSolicitudCreacionReservasTerritoriales" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Nombre</strong></td>
				<td>${reporte.strNomret}</td>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemViaFerrea.size()>0}">
	<s:iterator value="#session.reporte.listTemViaFerrea" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Nombre</strong></td>
				<%--<td>${reporte.strNombdep}</td>--%>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemViasTrochas.size()>0}">
	<s:iterator value="#session.reporte.listTemViasTrochas" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Nombre</strong></td>
				<%--<td>${reporte.strNombdep}</td>--%>
			</tr>
		</table>
	</s:iterator>
</s:if><s:if test="%{#session.reporte.listTemZonificPotencialBosqueProduccionPermanente.size()>0}">
	<s:iterator value="#session.reporte.listTemZonificPotencialBosqueProduccionPermanente" var="reporte" begin="0" end="0">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Tipo</strong></td>
				<td>${reporte.strTipo}</td>
			</tr>
			<tr>
				<td><strong>Documento legal</strong></td>
				<td>${reporte.strDocLegal}</td>
			</tr>
		</table>
	</s:iterator>
</s:if>

<!-- Capas de tipo raster -->
<s:if test="%{#session.reporte.beanTemBiodiversidadEspeciesPeligroExtincion!=null}">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Valor</strong></td>
				<td>${sessionScope.reporte.beanTemBiodiversidadEspeciesPeligroExtincion.strValuePromedio}</td>
			</tr>
			<tr>
				<td><strong>Categor&iacute;a</strong></td>
				<td>${sessionScope.reporte.beanTemBiodiversidadEspeciesPeligroExtincion.strCategoria}</td>
			</tr>
		</table>
</s:if>
<s:if test="%{#session.reporte.beanTemBiodiversidadRiquezaPotencialEspeciesFaunaEndemica!=null}">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Valor</strong></td>
				<td>${sessionScope.reporte.beanTemBiodiversidadRiquezaPotencialEspeciesFaunaEndemica.strValuePromedio}</td>
			</tr>
			<tr>
				<td><strong>Categor&iacute;a</strong></td>
				<td>${sessionScope.reporte.beanTemBiodiversidadRiquezaPotencialEspeciesFaunaEndemica.strCategoria}</td>
			</tr>
		</table>
</s:if>
<s:if test="%{#session.reporte.beanTemDensidadCarbonoAerea!=null}">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Valor</strong></td>
				<td>${sessionScope.reporte.beanTemDensidadCarbonoAerea.strValuePromedio}</td>
			</tr>
			<tr>
				<td><strong>Categor&iacute;a</strong></td>
				<td>${sessionScope.reporte.beanTemDensidadCarbonoAerea.strCategoria}</td>
			</tr>
		</table>
</s:if>
<s:if test="%{#session.reporte.beanTemRiesgoErosionHidrica!=null}">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Valor</strong></td>
				<td>${sessionScope.reporte.beanTemRiesgoErosionHidrica.strValuePromedio}</td>
			</tr>
			<tr>
				<td><strong>Categor&iacute;a</strong></td>
				<td>${sessionScope.reporte.beanTemRiesgoErosionHidrica.strCategoria}</td>
			</tr>
		</table>
</s:if>
<s:if test="%{#session.reporte.beanTemCoberturaBoscosa2014!=null}">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Valor</strong></td>
				<td>${sessionScope.reporte.beanTemCoberturaBoscosa2014.strValuePromedio}</td>
			</tr>
			<tr>
				<td><strong>Categor&iacute;a</strong></td>
				<td>${sessionScope.reporte.beanTemCoberturaBoscosa2014.strCategoria}</td>
			</tr>
		</table>
</s:if>
<s:if test="%{#session.reporte.beanTemPerdidaBosque20012014!=null}">
		<table class="clsTableMetadataMenucontextual">
			<tr>
				<td><strong>Valor</strong></td>
				<td>${sessionScope.reporte.beanTemPerdidaBosque20012014.strValuePromedio}</td>
			</tr>
			<tr>
				<td><strong>Categor&iacute;a</strong></td>
				<td>${sessionScope.reporte.beanTemPerdidaBosque20012014.strCategoria}</td>
			</tr>
		</table>
</s:if>
