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

<!-- <div class="container"> -->
<!-- 	<div class="row"> -->
<!-- 		<div class="span12"> -->
<!-- 			<div id="map" class="map" style=" position: absolute; top: 0; right: 0; bottom: 0; left: 0;"></div> -->
			
          <div id="map" class="map" style="position: absolute; top: 0; right: 0; bottom: 0; left: 0;">
<!--           <div id="map" class="map"> -->
            <div id="gmap" class="fill"></div>
            <div id="olmap" class="fill" ></div>
          </div>
<!-- 		</div> -->
<!-- 	</div> -->
<!-- </div> -->

<div class="modal fade seleccionar-capas-modal" tabindex="-1" role="dialog">
	<div class="modal-dialog modal-lg">
		<div class="modal-content" id="idDivSeleccionarCapas" >
			
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				<h4 class="modal-title">Seleccionar capas a visualizar</h4>
			</div>
			
			<div class="modal-body">
					<div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
				<s:iterator value="#session.listGrupoCapas" var="grupoCapas">
					  <div class="panel panel-default">
					    <div class="panel-heading" role="tab" id="headingOne${grupoCapas.srlIdGrupoCapas}">
					      <h4 class="panel-title">
					        <a role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseOne${grupoCapas.srlIdGrupoCapas}" aria-expanded="false" aria-controls="collapseOne${grupoCapas.srlIdGrupoCapas}">
					          ${grupoCapas.strNombre}
					        </a>
					      </h4>
					    </div>
					    <div id="collapseOne${grupoCapas.srlIdGrupoCapas}" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingOne${grupoCapas.srlIdGrupoCapas}">
					      <div class="panel-body">
					      	<div class="row text-center" style="font-weight: bold;">
						      	<div class="col-xs-6 text-left">
						      		Nombre de capa
						      	</div>
						      	<div class="col-xs-2">
						      		Transparencia
						      	</div>
						      	<div class="col-xs-1">
						      		Umbral
						      	</div>
						      	<div class="col-xs-1">
						      		Centrar
						      	</div>
						      	<div class="col-xs-1">
						      		Descargar
						      	</div>
						      	<div class="col-xs-1">
						      		Info
						      	</div>
					      	</div>
					      	<s:iterator value="#session.listCapasBase" var="capasBase">
					      	<s:if test="%{#capasBase.intGrupoCapas.toString()==#grupoCapas.srlIdGrupoCapas.toString()}">
					      	<div class="row">
						      	<div class="col-xs-6">
						      		<input type="checkbox" id="idCapaDpto" name="capasBase" value="${capasBase.srlIdCapasBase}" onclick="marcarCapas();" class="capasBase">
									${capasBase.strNombre}
						      	</div>
						      	<div class="col-xs-2">
						      		<div idcapa="${capasBase.srlIdCapasBase}" class="clsSlider"></div>
						      	</div>
						      	<div class="col-xs-1 text-center">
						      		
						      	</div>
						      	<div class="col-xs-1 text-center">
						      		<s:if test="%{#capasBase.srlIdCapasBase.toString()==#CAPAS_BASE_DEPARTAMENTO||#capasBase.srlIdCapasBase.toString()==#CAPAS_BASE_PROVINCIA||#capasBase.srlIdCapasBase.toString()==#CAPAS_BASE_DISTRITO}">
						      			<i class="fa fa-lg fa-bullseye cursorPointer" onclick="centrarMapa(${capasBase.srlIdCapasBase});"></i>
						      		</s:if>
						      	</div>
						      	<div class="col-xs-1 text-center">
						      		<s:if test="%{#capasBase.strWfsUrl!=null&&#capasBase.strWfsUrl!=''}">
						      			<i class="fa fa-lg fa-download cursorPointer" onclick="descargarMapa(${capasBase.srlIdCapasBase});"></i>
						      		</s:if>
						      	</div>
						      	<div class="col-xs-1 text-center">
						      		<i class="fa fa-lg fa-info-circle cursorPointer" onclick="mostrarInfo(${capasBase.srlIdCapasBase});"></i>
						      	</div>
					      	</div>
					      	</s:if>
					      	</s:iterator>
					      </div>
					    </div>
					  </div>
				</s:iterator>
					</div>
			</div>
			
			<div class="modal-footer">
				<button type="button" class="btn btn-default btnVideosInteractivos" data-dismiss="modal">Cerrar</button>
			</div>
			
		</div>
	</div>
</div>
<div class="modal fade consulta-analitica-modal" tabindex="-1" role="dialog">
	<div class="modal-dialog modal-sm">
		<div class="modal-content">
			
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				<h4 class="modal-title">Consulta analitica</h4>
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
						Comentarios
					</div>
					<div class="col-lg-8" id="idDivInfoComentario">
						
					</div>
				</div>
				<div class="row">
					<div class="col-lg-4">
						Url
					</div>
					<div class="col-lg-8" id="idDivInfoUrl">
						
					</div>
				</div>
				<div class="row">
					<div class="col-lg-4">
						Fecha
					</div>
					<div class="col-lg-8" id="idDivInfoFecha">
						
					</div>
				</div>
			</div>
			
			<div class="modal-footer">
				<button type="button" class="btn btn-default btnVideosInteractivos" data-dismiss="modal">Cerrar</button>
			</div>
			
		</div>
	</div>
</div>

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
<form id="form" name="form" action=""></form>