<%@page import="wcmc.hef.general.util.ConfiguracionProperties"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<input type="hidden" name="CAPAS_BASE_DEPARTAMENTO" value="<%=ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.CAPAS_BASE_DEPARTAMENTO)%>"/>
<input type="hidden" name="CAPAS_BASE_PROVINCIA" value="<%=ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.CAPAS_BASE_PROVINCIA)%>"/>
<input type="hidden" name="CAPAS_BASE_DISTRITO" value="<%=ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.CAPAS_BASE_DISTRITO)%>"/>

<input type="hidden" name="TIPO_CAPA_VECTORIAL" value="<%=ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.TIPO_CAPA_VECTORIAL)%>"/>
<input type="hidden" name="TIPO_CAPA_UMBRAL" value="<%=ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.TIPO_CAPA_UMBRAL)%>"/>

<input type="hidden" name="CAPAS_VISUALIZACION_DEFAULT" value="<%=ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.CAPAS_VISUALIZACION_DEFAULT)%>"/>
<%
request.setAttribute("CAPAS_BASE_DEPARTAMENTO", ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.CAPAS_BASE_DEPARTAMENTO));
request.setAttribute("CAPAS_BASE_PROVINCIA", ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.CAPAS_BASE_PROVINCIA));
request.setAttribute("CAPAS_BASE_DISTRITO", ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.CAPAS_BASE_DISTRITO));

request.setAttribute("TIPO_CAPA_VECTORIAL", ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.TIPO_CAPA_VECTORIAL));
request.setAttribute("TIPO_CAPA_UMBRAL", ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.TIPO_CAPA_UMBRAL));

request.setAttribute("CAPA_GRUPO_USUARIO", ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.CAPA_GRUPO_USUARIO));

%>
<s:set value="#request.CAPAS_BASE_DEPARTAMENTO" var="CAPAS_BASE_DEPARTAMENTO"></s:set>
<s:set value="#request.CAPAS_BASE_PROVINCIA" var="CAPAS_BASE_PROVINCIA"></s:set>
<s:set value="#request.CAPAS_BASE_DISTRITO" var="CAPAS_BASE_DISTRITO"></s:set>

<s:set value="#request.TIPO_CAPA_VECTORIAL" var="TIPO_CAPA_VECTORIAL"></s:set>
<s:set value="#request.TIPO_CAPA_UMBRAL" var="TIPO_CAPA_UMBRAL"></s:set>

<s:set value="#request.CAPA_GRUPO_USUARIO" var="CAPA_GRUPO_USUARIO"></s:set>

<div id="map" class="map" style="position: absolute; top: 0; right: 0; bottom: 0; left: 0;">
	<div id="gmap" class="fill"></div>
	<div id="olmap" class="fill" ></div>
</div>

<div class="modal fade left seleccionar-capas-modal " tabindex="-1" role="dialog">
	<div class="modal-dialog modal-md pull-left">
		<div class="modal-content" id="idDivSeleccionarCapas" >
		
		<s:include value="visorInicioFormVisualizar.jsp"></s:include>
		
		</div>
	</div>
</div>

<div class="modal fade left identificar-area-criterio-logico-modal" tabindex="-1" role="dialog">
	<div class="modal-dialog modal-md pull-left">
		<div class="modal-content">
			
		<s:include value="visorInicioFormIdentificarAreaCriterioLogicos.jsp"></s:include>
			
		</div>
	</div>
</div>

<div class="modal fade left analizar-por-area-modal" tabindex="-1" role="dialog">
	<div class="modal-dialog modal-md pull-left">
		<div class="modal-content">
			<s:include value="visorInicioFormAnalizarPorArea.jsp"></s:include>
		</div>
	</div>
</div>

<div class="modal fade left reporte-capas-modal" tabindex="-1" role="dialog">
	<div class="modal-dialog modal-lg pull-left">
		<div class="modal-content" id="idDivReporte">
		
		</div>
	</div>
</div>






<div class="modal fade left upload-capas-modal" tabindex="-1" role="dialog">
	<div class="modal-dialog modal-md pull-left">
		<div class="modal-content">
			
			<s:include value="visorInicioFormUploadCapas.jsp"></s:include>
			
		</div>
	</div>
</div>

<div class="modal fade left info-capas-modal" tabindex="-1" role="dialog">
	<div class="modal-dialog modal-md">
		<div class="modal-content" style="background-color: white;">
			
			<s:include value="visorInicioFormInformacion.jsp"></s:include>
			
		</div>
	</div>
</div>

<div class="modal fade left centrar-mapa-modal" tabindex="-1" role="dialog">
	<div class="modal-dialog modal-md pull-left">
		<div class="modal-content" id="idDivCentrarCapas">
			
			<s:include value="visorInicioFormCentrarMapa.jsp"></s:include>
			
		</div>
	</div>
</div>

<div class="modal fade left cargar-shapefile-modal" tabindex="-1" role="dialog">
	<div class="modal-dialog modal-md pull-left">
		<div class="modal-content" id="idDivCargarShapefile">
			
			<s:include value="visorInicioFormCargarShapefile.jsp"></s:include>
			
		</div>
	</div>
</div>






<div class="modal fade left identificar-area-criterio-logico-filtrar-modal" tabindex="-1" role="dialog">
	<div class="modal-dialog modal-md pull-left">
		<div class="modal-content" id="idDivIACFiltrar" style="background-color: white;">
			
			<s:include value="visorInicioFormIdentificarAreaCriterioLogicosFiltrar.jsp"></s:include>
			
		</div>
	</div>
</div>

<div class="modal fade left identificar-area-criterio-logico-umbral-modal" tabindex="-1" role="dialog">
	<div class="modal-dialog modal-lg pull-left">
		<div class="modal-content" id="idDivIACUmbral" style="background-color: white;">
			
			<s:include value="visorInicioFormIdentificarAreaCriterioLogicosUmbral.jsp"></s:include>
			
		</div>
	</div>
</div>






<div id="idDivRightClick" style="position:absolute;display:none;z-index:100;">
	<UL id="myMenu" class="contextMenu">
		<LI id="idMenuCabecera" class="clsCabeceraMenuContextual">&nbsp;&nbsp;Metadata&nbsp;&nbsp;</LI>
		<LI id="idMenuCabecera" class="clsMetadataMenuContextual"><table class="clsTableMetadataMenucontextual"><tr><td>Campo1</td><td>Valor1</td></tr><tr><td>Campo2</td><td>Valor2</td></tr></table></LI>
		<LI id="idMenuCabecera" class="clsCabeceraMenuContextual">&nbsp;&nbsp;Acciones de la capa&nbsp;&nbsp;</LI>
		<LI id="idMenuGenRepAnalitico" class="clsGenerarReporteAnalitico">&nbsp;<i class="fa fa-search"></i>&nbsp;Generar reporte analitico&nbsp;&nbsp;</LI>
	</UL>
</div>

<div id="idDivRightClickClean" style="position:absolute;display:none;z-index:15000;">
	<UL id="myMenuACL" class="contextMenu">
		<LI id="idMenuLimiparACL" class="clsLimpiarACL">&nbsp;<i class="fa fa-trash"></i>&nbsp;Limpiar&nbsp;&nbsp;</LI>
	</UL>
</div>

<div id="idDivRightClickAPAClean" style="position:absolute;display:none;z-index:15000;">
	<UL id="myMenuACL" class="contextMenu">
		<LI id="idMenuLimiparAPA" class="clsLimpiarAPA">&nbsp;<i class="fa fa-trash"></i>&nbsp;Limpiar&nbsp;&nbsp;</LI>
	</UL>
</div>

<div class="modal fade dialog-info-eliminar-modal" tabindex="-1" role="dialog">
	<div class="modal-dialog modal-sm ">
		<div class="modal-content" id="idDivIACUmbral" style="background-color: white;">
			
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				<h4 class="modal-title">Filtrar Umbral</h4>
			</div>
			<div class="modal-body">
				<p> <strong>&iquest;Est&aacute; seguro de eliminar la capa&#63;</strong></p>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default btnConfirmEliminarSi" >Si</button>
				<button type="button" class="btn btn-default " data-dismiss="modal">No</button>
			</div>
			
		</div>
	</div>
</div>

<!-- <div id="dialog-info-eliminar" hidden="true" style="z-index: 20001;"> -->
<%--     <br>  <p> <strong>&iquest;EST&Aacute; SEGURO QUE DESEA ELIMINAR EL REGISTRO&#63;</strong></p> --%>
<!-- </div> -->

<form id="form" name="form" action="">
<input type="hidden" name="buscar_seleccion_id" id="buscar_seleccion_id"/>
</form>