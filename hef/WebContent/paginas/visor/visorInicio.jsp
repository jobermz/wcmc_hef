<%@page import="wcmc.hef.general.util.ConfiguracionProperties"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<input type="hidden" name="CAPAS_BASE_DEPARTAMENTO" value="<%=ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.CAPAS_BASE_DEPARTAMENTO)%>"/>
<input type="hidden" name="CAPAS_BASE_PROVINCIA" value="<%=ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.CAPAS_BASE_PROVINCIA)%>"/>
<input type="hidden" name="CAPAS_BASE_DISTRITO" value="<%=ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.CAPAS_BASE_DISTRITO)%>"/>
<%
request.setAttribute("CAPAS_BASE_DEPARTAMENTO", ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.CAPAS_BASE_DEPARTAMENTO));
request.setAttribute("CAPAS_BASE_PROVINCIA", ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.CAPAS_BASE_PROVINCIA));
request.setAttribute("CAPAS_BASE_DISTRITO", ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.CAPAS_BASE_DISTRITO));
%>
<s:set value="#request.CAPAS_BASE_DEPARTAMENTO" var="CAPAS_BASE_DEPARTAMENTO"></s:set>
<s:set value="#request.CAPAS_BASE_PROVINCIA" var="CAPAS_BASE_PROVINCIA"></s:set>
<s:set value="#request.CAPAS_BASE_DISTRITO" var="CAPAS_BASE_DISTRITO"></s:set>

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

<div class="modal fade upload-capas-modal" tabindex="-1" role="dialog">
	<div class="modal-dialog modal-sm">
		<div class="modal-content">
			
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				<h4 class="modal-title">Cargar archivos shape</h4>
			</div>
			
<!-- 			<div class="modal-body"> -->
<!-- 				<p>Are you sure about this ?</p> -->
<!-- 			</div> -->
			
			<div class="modal-footer">
				<button type="button" class="btn btn-default btnVideosInteractivos" data-dismiss="modal">Cancelar</button>
				<button type="button" class="btn btn-danger btnVideosInteractivos" id="idBtnEliminar">Aceptar</button>
			</div>
			
		</div>
	</div>
</div>

<div class="modal fade info-capas-modal" tabindex="-1" role="dialog">
	<div class="modal-dialog modal-sm">
		<div class="modal-content">
			
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				<h4 class="modal-title">Informaci&oacute;n de la capa</h4>
			</div>
			
			<div class="modal-body">
				<div class="row">
					<div class="col-lg-4">
						Nombre
					</div>
					<div class="col-lg-8" id="idDivInfoNombre">
					</div>
				</div>
				<div class="row">
					<div class="col-lg-4">
						Descripci&oacute;n
					</div>
					<div class="col-lg-8" id="idDivInfoComentario">
					</div>
				</div>
				<div class="row">
					<div class="col-lg-4">
						Fuentes/Autores
					</div>
					<div class="col-lg-8" id="idDivInfoAutores">
					</div>
				</div>
				<div class="row">
					<div class="col-lg-4">
						Fecha de creaci&oacute;n
					</div>
					<div class="col-lg-8" id="idDivInfoFecha">
					</div>
				</div>
				<div class="row">
					<div class="col-lg-4">
						URL
					</div>
					<div class="col-lg-8" id="idDivInfoUrl">
					</div>
				</div>
			</div>
			
			<div class="modal-footer">
				<button type="button" class="btn btn-default btnVideosInteractivos" data-dismiss="modal">Cerrar</button>
			</div>
			
		</div>
	</div>
</div>
<%--
<div class="modal fade centrar-mapa-modal" tabindex="-1" role="dialog">
	<div class="modal-dialog modal-sm">
		<div class="modal-content" id="idDivCentrarCapas">
			
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				<h4 class="modal-title">Centrar mapa</h4>
			</div>
			
			<div class="modal-body">
				<div id="idDivCentrarDepartamento" style="display: none;">
					<s:select list="#session.listCapaDepartamento" name="centrar_departamento" headerKey="" headerValue="-Seleccionar-" listKey="strIdDepartamento" listValue="strNombre" onchange="centrar_depa_upd_dpto();"></s:select>
				</div>
				<div id="idDivCentrarProvincia" style="display: none;">
					<div class="row">
						<div class="col-lg-5">Departamento:</div>
						<div class="col-lg-7"><s:select list="#session.listCapaDepartamento" name="centrar_prov_departamento" headerKey="" headerValue="-Seleccionar-" listKey="strIdDepartamento" listValue="strNombre" onchange="centrar_prov_upd_dpto();"></s:select></div>
					</div>
					<div class="row">
						<div class="col-lg-5">Provincia:</div>
						<div class="col-lg-7" id="idDivComboProvinciaEnProvincia"><s:select list="{}" name="centrar_prov_provincia" headerKey="" headerValue="-Seleccionar-" listKey="strIdProvincia" listValue="strNombreProvincia" onchange="centrar_prov_upd_prov();"></s:select></div>
					</div>
				</div>
				<div id="idDivCentrarDistrito" style="display: none;">
					<div class="row">
						<div class="col-lg-5">Departamento:</div>
						<div class="col-lg-7"><s:select list="#session.listCapaDepartamento" name="centrar_dist_departamento" headerKey="" headerValue="-Seleccionar-" listKey="strIdDepartamento" listValue="strNombre" onchange="centrar_dist_upd_dpto();"></s:select></div>
					</div>
					<div class="row">
						<div class="col-lg-5">Provincia:</div>
						<div class="col-lg-7" id="idDivComboDistritoEnProvincia"><s:select list="{}" name="centrar_dist_provincia" listKey="strIdProvincia" headerKey="" headerValue="-Seleccionar-" listValue="strNombreProvincia" onchange="centrar_dist_upd_prov();"></s:select></div>
					</div>
					<div class="row">
						<div class="col-lg-5">Distrito:</div>
						<div class="col-lg-7" id="idDivComboDistritoEnDistrito"><s:select list="{}" name="centrar_dist_distrito" listKey="strIdDistrito" headerKey="" headerValue="-Seleccionar-" listValue="strNombreDistrito" onchange="centrar_dist_upd_dist();"></s:select></div>
					</div>
				</div>
			</div>
			
			<div class="modal-footer">
				<button type="button" class="btn btn-default btnVideosInteractivos" data-dismiss="modal">Cerrar</button>
			</div>
			
		</div>
	</div>
</div>
 --%>
<div class="modal fade cargar-shapefile-modal" tabindex="-1" role="dialog">
	<div class="modal-dialog modal-md">
		<div class="modal-content" id="idDivCargarShapefile">
			
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				<h4 class="modal-title">Seleccionar area desde un shapefile</h4>
			</div>
			
			<div class="modal-body">
				<s:form method="post" name="frmSelAreaShapefile" id="idFrmSelAreaShapefile" enctype="multipart/form-data">
				<div class="row">
					<div class="col-lg-2">Cargar:</div>
					<div class="col-lg-8"><s:file name="shapefile" ></s:file></div>
					<div class="col-lg-2">
						<button type="button" class="btn btn-default btnEnviarShapefile">Enviar</button>
					</div>
				</div>
				<div class="row">
					<div class="col-lg-12" id="idDivSeleccionarShapeHtml"></div>
				</div>
				</s:form>
			</div>
			
			<div class="modal-footer">
				<button type="button" class="btn btn-default btnVideosInteractivos" data-dismiss="modal">Cerrar</button>
			</div>
			
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

<form id="form" name="form" action=""></form>