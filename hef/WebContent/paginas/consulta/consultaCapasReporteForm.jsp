<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
<%@page import="wcmc.hef.general.util.ConfiguracionProperties"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="row">
	<div class="col-sm-12">
		<button type="button" class="close" onclick="ocutarReporte();">
			<span aria-hidden="true">&times; </span>
			<span style="font-size:12px;vertical-align:middle;">&nbsp;<strong>Cerrar</strong></span>
		</button>
		<h5>Reporte</h5>	
	</div>
</div>
	
<div class="row">
	<div class="col-lg-12 clsDivPanelLateralIzqPad" >
	<div class="clsDivPanelLateralIzqRep" style="overflow-y: scroll;">
	
		<div class="panel-group" id="accordion" role="tablist" aria-multiselectable="false">
			<div class="panel panel-default clsPanelGrupoCapasMainCB">
			
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep1" onclick="mostrarAcordionReporte(1);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Previsualizaci&oacute;n de imagen <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
					<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep1" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep1">
					<div class="panel-body">
						<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo" >
						</div>
						</div>
					</div>
				</div>
			
	<%--
			<s:if test="%{#session.reporte.listBasHidroRios100000.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('basHidroRios100000Reporte','idDivDetaRepo', this);" class="list-group-item "> Rios Principales<span class="badge"><s:property value="%{#session.reporte.listBasHidroRios100000.size()}" /></span></a>
			</s:if>

			<s:if test="%{#session.reporte.listBasHidroRiosLagunas.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('basHidroRiosLagunasReporte','idDivDetaRepo', this);" class="list-group-item "> Lagos y Lagunas  <span class="badge"><s:property value="%{#session.reporte.listBasHidroRiosLagunas.size()}" /></span></a>
			</s:if>
			<s:if test="%{#session.reporte.listBasLimAmazonia.size()>0}">
				<a href="#" onclick="mostrarDetaRepo('basLimAmazoniaReporte','idDivDetaRepo', this);" class="list-group-item "> Bas lim amazonia  <span class="badge"><s:property value="%{#session.reporte.listBasLimAmazonia.size()}" /></span></a>
			</s:if>
			--%>
			
			<s:if test="%{#session.reporte.listBasLimDepartamento.size()>0}">
<%-- 			<a href="#" onclick="mostrarDetaRepo('basLimDepartamentoReporte','idDivDetaRepo2', this);" class="list-group-item "> Departamentos <span class="badge"><s:property value="%{#session.reporte.listBasLimDepartamento.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep2" onclick="mostrarAcordionReporte(2); mostrarDetaRepo('basLimDepartamentoReporte','idDivDetaRepo2', this);">					
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Departamentos <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep2" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep2">
					<div class="panel-body">
						<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo2" >
						</div>
						</div>
					</div>
				</div>
			</s:if>			
			
			
			<s:if test="%{#session.reporte.listBasLimDistritos.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('basLimDistritosReporte','idDivDetaRepo', this);" class="list-group-item "> Distritos <span class="badge"><s:property value="%{#session.reporte.listBasLimDistritos.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep3" onclick="mostrarAcordionReporte(3); mostrarDetaRepo('basLimDistritosReporte','idDivDetaRepo3', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Distritos <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep3" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep3">
					<div class="panel-body">
						<div class="container-fluid">
						<div class="col-lg-7 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo3" >
						</div>
						</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.listBasLimProvincia.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('basLimProvinciaReporte','idDivDetaRepo', this);" class="list-group-item "> Provincias <span class="badge"><s:property value="%{#session.reporte.listBasLimProvincia.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep4" onclick="mostrarAcordionReporte(4); mostrarDetaRepo('basLimProvinciaReporte','idDivDetaRepo4', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Provincias <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep4" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep4">
					<div class="panel-body">
						<div class="container-fluid">
						<div class="col-lg-7 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo4"  >
						</div>
						</div>
					</div>
				</div>				
			</s:if>
			
			<s:if test="%{#session.reporte.listBasViasRedVialDepartamental.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('basViasRedVialDepartamentalReporte','idDivDetaRepo', this);" class="list-group-item "> Red vial departamental  <span class="badge"><s:property value="%{#session.reporte.listBasViasRedVialDepartamental.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep5" onclick="mostrarAcordionReporte(5); mostrarDetaRepo('basViasRedVialDepartamentalReporte','idDivDetaRepo5', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Red vial departamental <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep5" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep5">
					<div class="panel-body">
					<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo5"  >
						</div>
					</div>
					</div>
				</div>	
			</s:if>

			<s:if test="%{#session.reporte.listBasViasRedVialNacional.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('basViasRedVialNacionalReporte','idDivDetaRepo', this);" class="list-group-item "> Red vial nacional  <span class="badge"><s:property value="%{#session.reporte.listBasViasRedVialNacional.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep6" onclick="mostrarAcordionReporte(6); mostrarDetaRepo('basViasRedVialNacionalReporte','idDivDetaRepo6', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Red vial nacional <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep6" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep6">
					<div class="panel-body">
						<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo6"  >
						</div>
						</div>
					</div>
				</div>
			</s:if>
	
			<s:if test="%{#session.reporte.listBasViasRedVialVecinal.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('basViasRedVialVecinalReporte','idDivDetaRepo', this);" class="list-group-item "> Red vial vecinal  <span class="badge"><s:property value="%{#session.reporte.listBasViasRedVialVecinal.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep7" onclick="mostrarAcordionReporte(7); mostrarDetaRepo('basViasRedVialVecinalReporte','idDivDetaRepo7', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Red vial vecinal <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep7" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep7">
					<div class="panel-body">
					<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo7"  >
						</div>
					</div>
					</div>
				</div>
			</s:if>
	
			<s:if test="%{#session.reporte.listTemAnpNacional.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temAnpNacionalReporte','idDivDetaRepo', this);" class="list-group-item "> Áreas Nacionales Protegidas <span class="badge"><s:property value="%{#session.reporte.listTemAnpNacional.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep8" onclick="mostrarAcordionReporte(8); mostrarDetaRepo('temAnpNacionalReporte','idDivDetaRepo8', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Áreas Nacionales Protegidas <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep8" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep8">
					<div class="panel-body">
					<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo8"  >
						</div>
					</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.listTemAnpPrivada.size()>0}">
<%-- 			<a href="#" onclick="mostrarDetaRepo('temAnpPrivadaReporte','idDivDetaRepo', this);" class="list-group-item "> Áreas Protegidas Privadas  <span class="badge"><s:property value="%{#session.reporte.listTemAnpPrivada.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep9" onclick="mostrarAcordionReporte(9); mostrarDetaRepo('temAnpPrivadaReporte','idDivDetaRepo9', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Áreas Protegidas Privadas <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep9" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep9">
					<div class="panel-body">
						<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo9"  >
						</div>
						</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.listTemAnpRegional.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temAnpRegionalReporte','idDivDetaRepo', this);" class="list-group-item "> Áreas de Conservación Regionales <span class="badge"><s:property value="%{#session.reporte.listTemAnpRegional.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep10" onclick="mostrarAcordionReporte(10); mostrarDetaRepo('temAnpRegionalReporte','idDivDetaRepo10', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Áreas Protegidas Privadas <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep10" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep10">
					<div class="panel-body">
						<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo10"  >
						</div>
						</div>
					</div>
				</div>				
			</s:if>
			
			<s:if test="%{#session.reporte.listTemCarbonoEcozonas.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temCarbonoEcozonasReporte','idDivDetaRepo', this);" class="list-group-item "> Densidad de Carbono por Ecozonas <span class="badge"><s:property value="%{#session.reporte.listTemCarbonoEcozonas.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep11" onclick="mostrarAcordionReporte(11); mostrarDetaRepo('temCarbonoEcozonasReporte','idDivDetaRepo11', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Densidad de Carbono por Ecozonas <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep11" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep11">
					<div class="panel-body">
						<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo11"  >
						</div>
						</div>
					</div>
				</div>				
			</s:if>

			<s:if test="%{#session.reporte.listTemCentrosPoblados.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temCentrosPobladosReporte','idDivDetaRepo', this);" class="list-group-item "> Centros Poblados  <span class="badge"><s:property value="%{#session.reporte.listTemCentrosPoblados.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep12" onclick="mostrarAcordionReporte(12); mostrarDetaRepo('temCentrosPobladosReporte','idDivDetaRepo12', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Centros Poblados <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep12" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep12">
					<div class="panel-body">
						<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo12"  >
						</div>
						</div>
					</div>
				</div>	
			</s:if>
			
			<s:if test="%{#session.reporte.listTemClaveBiodiversidad.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temClaveBiodiversidadReporte','idDivDetaRepo', this);" class="list-group-item "> Áreas Clave para la Biodiversidad  <span class="badge"><s:property value="%{#session.reporte.listTemClaveBiodiversidad.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep13" onclick="mostrarAcordionReporte(13); mostrarDetaRepo('temClaveBiodiversidadReporte','idDivDetaRepo13', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Áreas Clave para la Biodiversidad <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep13" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep13">
					<div class="panel-body">
						<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo13"  >
						</div>
						</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.listTemComunidadesNativas.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temComunidadesNativasReporte','idDivDetaRepo', this);" class="list-group-item "> Comunidades Nativas  <span class="badge"><s:property value="%{#session.reporte.listTemComunidadesNativas.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep14" onclick="mostrarAcordionReporte(14); mostrarDetaRepo('temComunidadesNativasReporte','idDivDetaRepo14', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Comunidades Nativas <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep14" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep14">
					<div class="panel-body">
						<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo14"  >
						</div>
						</div>
					</div>
				</div>	
			</s:if>
			
			<s:if test="%{#session.reporte.listTemConcesionesEcoturismo.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temConcesionesEcoturismoReporte','idDivDetaRepo', this);" class="list-group-item "> Concesiones Ecoturismo  <span class="badge"><s:property value="%{#session.reporte.listTemConcesionesEcoturismo.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep15" onclick="mostrarAcordionReporte(15); mostrarDetaRepo('temConcesionesEcoturismoReporte','idDivDetaRepo15', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Concesiones Ecoturismo <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep15" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep15">
					<div class="panel-body">
						<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo15"  >
						</div>
						</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.listTemConcesionesForestalesCastania.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temConcesionesForestalesCastaniaReporte','idDivDetaRepo', this);" class="list-group-item "> Concesiones de Castaña<span class="badge"><s:property value="%{#session.reporte.listTemConcesionesForestalesCastania.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep16" onclick="mostrarAcordionReporte(16); mostrarDetaRepo('temConcesionesForestalesCastaniaReporte','idDivDetaRepo16', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Concesiones de Castaña <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep16" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep16">
					<div class="panel-body">
						<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo16"  >
						</div>
						</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.listTemConcesionesForestalesConservacion.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temConcesionesForestalesConservacionReporte','idDivDetaRepo', this);" class="list-group-item "> Concesiones para la Conservación  <span class="badge"><s:property value="%{#session.reporte.listTemConcesionesForestalesConservacion.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep17" onclick="mostrarAcordionReporte(17); mostrarDetaRepo('temConcesionesForestalesConservacionReporte','idDivDetaRepo17', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Concesiones para la Conservación <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep17" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep17">
					<div class="panel-body">
						<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo17"  >
						</div>
						</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.listTemConcesionesForestalesMaderableAdecuadas.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temConcesionesForestalesMaderableAdecuadasReporte','idDivDetaRepo', this);" class="list-group-item "> Concesiones Forestales Maderables <span class="badge"><s:property value="%{#session.reporte.listTemConcesionesForestalesMaderableAdecuadas.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep18" onclick="mostrarAcordionReporte(18); mostrarDetaRepo('temConcesionesForestalesMaderableAdecuadasReporte','idDivDetaRepo18', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Concesiones Forestales Maderables <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep18" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep18">
					<div class="panel-body">
						<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo18"  >
						</div>
						</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.listTemConcesionesForestalesMaderableConcurso.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temConcesionesForestalesMaderableConcursoReporte','idDivDetaRepo', this);" class="list-group-item "> Concesiones Forestales Maderable Concurso  <span class="badge"><s:property value="%{#session.reporte.listTemConcesionesForestalesMaderableConcurso.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep19" onclick="mostrarAcordionReporte(19); mostrarDetaRepo('temConcesionesForestalesMaderableConcursoReporte','idDivDetaRepo19', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Concesiones Forestales Maderables Concurso<span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep19" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep19">
					<div class="panel-body">
						<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo19"  >
						</div>
						</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.listTemConcesionesForestalesManejoFaunaSilvestre.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temConcesionesForestalesManejoFaunaSilvestreReporte','idDivDetaRepo', this);" class="list-group-item "> Concesiones de Manejo Fauna Silvestre  <span class="badge"><s:property value="%{#session.reporte.listTemConcesionesForestalesManejoFaunaSilvestre.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep20" onclick="mostrarAcordionReporte(20); mostrarDetaRepo('temConcesionesForestalesManejoFaunaSilvestreReporte','idDivDetaRepo20', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Concesiones de Manejo Fauna Silvestre <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep20" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep20">
					<div class="panel-body">
						<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo20"  >
						</div>
						</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.listTemConcesionesForestalesReforestacion.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temConcesionesForestalesReforestacionReporte','idDivDetaRepo', this);" class="list-group-item "> Concesiones con fines de Forestación y Reforestación <span class="badge"><s:property value="%{#session.reporte.listTemConcesionesForestalesReforestacion.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep21" onclick="mostrarAcordionReporte(21); mostrarDetaRepo('temConcesionesForestalesReforestacionReporte','idDivDetaRepo21', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Concesiones con fines de Forestación y Reforestación  <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep21" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep21">
					<div class="panel-body">
						<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo21"  >
						</div>
						</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.listTemConcesionesMineras.size()>0}">
<%-- 			<a href="#" onclick="mostrarDetaRepo('temConcesionesMinerasReporte','idDivDetaRepo', this);" class="list-group-item "> Concesiones Mineras  <span class="badge"><s:property value="%{#session.reporte.listTemConcesionesMineras.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep22" onclick="mostrarAcordionReporte(22); mostrarDetaRepo('temConcesionesMinerasReporte','idDivDetaRepo22', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Concesiones Mineras <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep22" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep22">
					<div class="panel-body">
						<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo22"  >
						</div>
						</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.listTemConcesionHidroelectricasDistribucion.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temConcesionHidroelectricasDistribucionReporte','idDivDetaRepo', this);" class="list-group-item "> Concesiones de Distribución de Energía Eléctrica <span class="badge"><s:property value="%{#session.reporte.listTemConcesionHidroelectricasDistribucion.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep23" onclick="mostrarAcordionReporte(23); mostrarDetaRepo('temConcesionHidroelectricasDistribucionReporte','idDivDetaRepo23', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Concesiones de Distribución de Energía Eléctrica <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep23" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep23">
					<div class="panel-body">
						<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo23"  >
						</div>
						</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.listTemConcesionHidroelectricasGeneracion.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temConcesionHidroelectricasGeneracionReporte','idDivDetaRepo', this);" class="list-group-item "> Concesiones de Generación de Energía Eléctrica <span class="badge"><s:property value="%{#session.reporte.listTemConcesionHidroelectricasGeneracion.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep24" onclick="mostrarAcordionReporte(24); mostrarDetaRepo('temConcesionHidroelectricasGeneracionReporte','idDivDetaRepo24', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Concesiones de Generación de Energía Eléctrica <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep24" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep24">
					<div class="panel-body">
					<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo24"  >
						</div>
					</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.listTemCostoOportunidadDeforestacion.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temCostoOportunidadDeforestacionReporte','idDivDetaRepo', this);" class="list-group-item "> Costos de Oportunidad para Reducir Emisiones por Deforestación  <span class="badge"><s:property value="%{#session.reporte.listTemCostoOportunidadDeforestacion.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep25" onclick="mostrarAcordionReporte(25); mostrarDetaRepo('temCostoOportunidadDeforestacionReporte','idDivDetaRepo25', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Costos de Oportunidad para Reducir Emisiones por Deforestación <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep25" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep25">
					<div class="panel-body">
					<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo25"  >
						</div>
					</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.listTemCoverturaVegetal2015.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temCoverturaVegetal2015Reporte','idDivDetaRepo', this);" class="list-group-item "> Covertura Vegetal <span class="badge"><s:property value="%{#session.reporte.listTemCoverturaVegetal2015.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep26" onclick="mostrarAcordionReporte(26); mostrarDetaRepo('temCoverturaVegetal2015Reporte','idDivDetaRepo26', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Covertura Vegetal <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep26" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep26">
					<div class="panel-body">
					<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo26"  >
						</div>
					</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.listTemCuencasHidrograficas.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temCuencasHidrograficasReporte','idDivDetaRepo', this);" class="list-group-item "> Cuencas Hidrograficas  <span class="badge"><s:property value="%{#session.reporte.listTemCuencasHidrograficas.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep27" onclick="mostrarAcordionReporte(27); mostrarDetaRepo('temCuencasHidrograficasReporte','idDivDetaRepo27', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Cuencas Hidrograficas <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep27" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep27">
					<div class="panel-body">
					<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo27"  >
						</div>
					</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.listTemHumedalesRamsar.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temHumedalesRamsarReporte','idDivDetaRepo', this);" class="list-group-item "> Zonas Ramsar  <span class="badge"><s:property value="%{#session.reporte.listTemHumedalesRamsar.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep28" onclick="mostrarAcordionReporte(28); mostrarDetaRepo('temHumedalesRamsarReporte','idDivDetaRepo28', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Zonas Ramsar <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep28" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep28">
					<div class="panel-body">
						<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo28"  >
						</div>
						</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.listTemIndiceImportanciaBiologica.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temIndiceImportanciaBiologicaReporte','idDivDetaRepo', this);" class="list-group-item "> Indice de Importancia Biologica  <span class="badge"><s:property value="%{#session.reporte.listTemIndiceImportanciaBiologica.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep29" onclick="mostrarAcordionReporte(29); mostrarDetaRepo('temIndiceImportanciaBiologicaReporte','idDivDetaRepo29', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Indice de Importancia Biologica <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep29" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep29">
					<div class="panel-body">
					<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo29"  >
						</div>
					</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.listTemPrediosRurales.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temPrediosRuralesReporte','idDivDetaRepo', this);" class="list-group-item "> Predios Rurales <span class="badge"><s:property value="%{#session.reporte.listTemPrediosRurales.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep30" onclick="mostrarAcordionReporte(30); mostrarDetaRepo('temPrediosRuralesReporte','idDivDetaRepo30', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Predios Rurales <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep30" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep30">
					<div class="panel-body">
					<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo30"  >
						</div>
					</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.listTemProyeccionDensidadPob2015.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temProyeccionDensidadPob2015Reporte','idDivDetaRepo', this);" class="list-group-item "> Densidad de Población <span class="badge"><s:property value="%{#session.reporte.listTemProyeccionDensidadPob2015.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep31" onclick="mostrarAcordionReporte(31); mostrarDetaRepo('temProyeccionDensidadPob2015Reporte','idDivDetaRepo31', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Densidad de Población <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep31" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep31">
					<div class="panel-body">
					<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo31"  >
						</div>
					</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.listTemProyectosPoligonos.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temProyectosPoligonosReporte','idDivDetaRepo', this);" class="list-group-item "> Áreas de Proyectos de Conservación <span class="badge"><s:property value="%{#session.reporte.listTemProyectosPoligonos.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep32" onclick="mostrarAcordionReporte(32); mostrarDetaRepo('temProyectosPoligonosReporte','idDivDetaRepo32', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Áreas de Proyectos de Conservación <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep32" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep32">
					<div class="panel-body">
					<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo32"  >
						</div>
					</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.listTemProyectosPuntos.size()>0}">
<%-- 			<a href="#" onclick="mostrarDetaRepo('temProyectosPuntosReporte','idDivDetaRepo', this);" class="list-group-item "> Proyectos de Conservación (Por puntos) <span class="badge"><s:property value="%{#session.reporte.listTemProyectosPuntos.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep33" onclick="mostrarAcordionReporte(33); mostrarDetaRepo('temProyectosPuntosReporte','idDivDetaRepo33', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Proyectos de Conservación (Por puntos) <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep33" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep33">
					<div class="panel-body">
					<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo33"  >
						</div>
					</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.listTemReservasTerritorialesIndigenas.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temReservasTerritorialesIndigenasReporte','idDivDetaRepo', this);" class="list-group-item "> Reservas Territoriales Indigenas  <span class="badge"><s:property value="%{#session.reporte.listTemReservasTerritorialesIndigenas.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep34" onclick="mostrarAcordionReporte(34); mostrarDetaRepo('temReservasTerritorialesIndigenasReporte','idDivDetaRepo34', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Reservas Territoriales Indigenas <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep34" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep34">
					<div class="panel-body">
					<div class="container-fluid">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo34"  >
						</div>
						</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.listTemSinanpeAmortiguamiento.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temSinanpeAmortiguamientoReporte','idDivDetaRepo', this);" class="list-group-item "> Zonas de Amortiguamiento de las Áreas Naturales Protegidas <span class="badge"><s:property value="%{#session.reporte.listTemSinanpeAmortiguamiento.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep35" onclick="mostrarAcordionReporte(35); mostrarDetaRepo('temSinanpeAmortiguamientoReporte','idDivDetaRepo35', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Zonas de Amortiguamiento de las Áreas Naturales Protegidas <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep35" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep35">
					<div class="panel-body">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo35"  >
						</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.listTemSoeconComunidadesCampesinas.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temSoeconComunidadesCampesinasReporte','idDivDetaRepo', this);" class="list-group-item "> Comunidades Campesinas <span class="badge"><s:property value="%{#session.reporte.listTemSoeconComunidadesCampesinasTotales.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep36" onclick="mostrarAcordionReporte(36); mostrarDetaRepo('temSoeconComunidadesCampesinasReporte','idDivDetaRepo36', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep">Comunidades Campesinas <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep36" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep36">
					<div class="panel-body">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo36"  >
						</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.listTemSoeconSolicitudCreacionReservasTerritoriales.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temSoeconSolicitudCreacionReservasTerritorialesReporte','idDivDetaRepo', this);" class="list-group-item "> Solicitud de Creación de Reservas Indigenas <span class="badge"><s:property value="%{#session.reporte.listTemSoeconSolicitudCreacionReservasTerritoriales.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep37" onclick="mostrarAcordionReporte(37); mostrarDetaRepo('temSoeconSolicitudCreacionReservasTerritorialesReporte','idDivDetaRepo37', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep"> Solicitud de Creación de Reservas Indigenas  <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep37" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep37">
					<div class="panel-body">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo37"  >
						</div>
					</div>
				</div>
			</s:if>

			<s:if test="%{#session.reporte.listTemViaFerrea.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temViaFerreaReporte','idDivDetaRepo', this);" class="list-group-item "> Vias Ferreas  <span class="badge"><s:property value="%{#session.reporte.listTemViaFerrea.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep38" onclick="mostrarAcordionReporte(38); mostrarDetaRepo('temViaFerreaReporte','idDivDetaRepo38', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep"> Vias Ferreas <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep38" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep38">
					<div class="panel-body">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo38"  >
						</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.listTemViasTrochas.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temViasTrochasReporte','idDivDetaRepo', this);" class="list-group-item "> Vias Trochas  <span class="badge"><s:property value="%{#session.reporte.listTemViasTrochas.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep39" onclick="mostrarAcordionReporte(39); mostrarDetaRepo('temViasTrochasReporte','idDivDetaRepo39', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep"> Vias Trochas <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep39" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep39">
					<div class="panel-body">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo39"  >
						</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.listTemZonificPotencialBosqueProduccionPermanente.size()>0}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temZonificPotencialBosqueProduccionPermanenteReporte','idDivDetaRepo', this);" class="list-group-item "> Bosques de Producción Permanente  <span class="badge"><s:property value="%{#session.reporte.listTemZonificPotencialBosqueProduccionPermanente.size()}" /></span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep40" onclick="mostrarAcordionReporte(40); mostrarDetaRepo('temZonificPotencialBosqueProduccionPermanenteReporte','idDivDetaRepo40', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep"> Bosques de Producción Permanente <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep40" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep40">
					<div class="panel-body">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo40"  >
						</div>
					</div>
				</div>
			</s:if>
			
			<!-- Capas de tipo raster -->
			
			<s:if test="%{#session.reporte.beanTemBiodiversidadEspeciesPeligroExtincion!=null}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temBiodiversidadEspeciesPeligroExtincionReporte','idDivDetaRepo', this);" class="list-group-item "> Riqueza Potencial de Especies en Peligro Extinción  <span class="badge">1</span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep41" onclick="mostrarAcordionReporte(41); mostrarDetaRepo('temBiodiversidadEspeciesPeligroExtincionReporte','idDivDetaRepo41', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep"> Riqueza Potencial de Especies en Peligro Extinción <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep41" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep41">
					<div class="panel-body">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo41"  >
						</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.beanTemBiodiversidadRiquezaPotencialEspeciesFaunaEndemica!=null}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaReporte','idDivDetaRepo', this);" class="list-group-item "> Riqueza Potencial de Especies de Fauna Endémica  <span class="badge">1</span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep42" onclick="mostrarAcordionReporte(42); mostrarDetaRepo('temBiodiversidadRiquezaPotencialEspeciesFaunaEndemicaReporte','idDivDetaRepo42', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep"> Riqueza Potencial de Especies de Fauna Endémica  <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep42" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep42">
					<div class="panel-body">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo42"  >
						</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.beanTemDensidadCarbonoAerea!=null}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temDensidadCarbonoAereaReporte','idDivDetaRepo', this);" class="list-group-item "> Densidad Carbono <span class="badge">1</span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep43" onclick="mostrarAcordionReporte(43); mostrarDetaRepo('temDensidadCarbonoAereaReporte','idDivDetaRepo43', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep"> Densidad Carbono  <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep43" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep43">
					<div class="panel-body">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo43"  >
						</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.beanTemRiesgoErosionHidrica!=null}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temRiesgoErosionHidricaReporte','idDivDetaRepo', this);" class="list-group-item "> Importancia de los Bosques para el control de Erosión Hidrica  <span class="badge">1</span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep44" onclick="mostrarAcordionReporte(44); mostrarDetaRepo('temRiesgoErosionHidricaReporte','idDivDetaRepo44', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep"> Importancia de los Bosques para el control de Erosión Hidrica    <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep44" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep44">
					<div class="panel-body">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo44"  >
						</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.beanTemCoberturaBoscosa2014!=null}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temCoberturaBoscosa2014Reporte','idDivDetaRepo', this);" class="list-group-item "> Cobertura boscosa 2014  <span class="badge">1</span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep45" onclick="mostrarAcordionReporte(45); mostrarDetaRepo('temCoberturaBoscosa2014Reporte','idDivDetaRepo45', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep"> Cobertura boscosa 2014 <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep45" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep45">
					<div class="panel-body">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo45"  >
						</div>
					</div>
				</div>
			</s:if>
			
			<s:if test="%{#session.reporte.beanTemPerdidaBosque20012014!=null}">
<%-- 				<a href="#" onclick="mostrarDetaRepo('temPerdidaBosque20012014Reporte','idDivDetaRepo', this);" class="list-group-item "> Perdida de bosque 2001 - 2014  <span class="badge">1</span></a> --%>
				<div class="panel-heading cursorPointer" role="tab" id="headingOneRep46" onclick="mostrarAcordionReporte(46); mostrarDetaRepo('temPerdidaBosque20012014Reporte','idDivDetaRepo46', this);">
					<h4 class="panel-title clsNombreGrupoCapaSelectorRep clsNombreGrupoCapaRep"> Perdida de bosque 2001 - 2014  <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
						<div class="pull-right clsDivNombreGrupoCapaIconoRep"><i class="glyphicon glyphicon-plus-sign"></i></div>
					</h4>
				</div>
				<div id="collapseOneRep46" class="panel-collapse collapse clsCollapseOneRep" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneRep46">
					<div class="panel-body">
						<div class="col-lg-12 clsDivPanelLateralIzqRepItem" id="idDivDetaRepo46"  >
						</div>
					</div>
				</div>
			</s:if>
			
			<!-- Capas de usuario -->
			
			<s:if test="%{#session.reporte.listGeometriaUsuario.size()>0}">
				<s:iterator value="#session.reporte.listGeometriaUsuario" var="mapGeometriaUsuario">
					<a href="#" onclick="mostrarDetaRepo('capaUsuarioReporte.jsp?srlIdCapa=${mapGeometriaUsuario.srlIdCapa}','idDivDetaRepo', this, true);" class="list-group-item "> ${mapGeometriaUsuario.strNombre} <span class="badge"><s:property value="%{#mapGeometriaUsuario.list.size()}" /></span></a>
				</s:iterator>
			</s:if>
			
		
		</div>
	</div>
	</div>
	</div>
</div>

<div class="row">
	<div class="col-lg-12">
		<div class="pull-right">
<!-- 		<div class="dropup pull-right"> -->
			<button class="btn btn-default clsPopoverMenuOpcion" type="button" id="idPopoverMenuReporte" 
		  		onclick="mostrarPopoverReporte();" 
				data-toggle="popover" 
				data-html="true" 
				data-placement="top"
				data-trigger="manual" 
				data-delay="{show:0,hide:0}"
				data-content='
				<div class="container-fluid" style="width:190px;">
				<div class="row">
				<div class="col-xs-9">
					<div class="pull-left">Descargar Reporte</div>
				</div>
				<div class="col-xs-3">
					<div class="pull-right">
						<button type="button" class="close" onclick="cerrarPopoverReporte()"><span aria-hidden="true">&times;</span></button>
					</div>
				</div>
				</div>
				<div class="row">
				<div class="col-xs-12">
				<div class="btn-group-vertical" role="group" >
					<button type="button" class="btn btn-linkpopover " onclick="reportePNG(${sessionScope.NombreImagenReporteTemp});">Descargar imagen</button>
					<button type="button" class="btn btn-linkpopover " onclick="reporteCSV();">Descargar CSV</button>
					<button type="button" class="btn btn-linkpopover " onclick="reportePDF();">Descargar PDF</button>
				</div>
				</div>
				</div>
				</div>
				' >
				<span class="glyphicon glyphicon-save"></span> Descargar Reporte
			</button>
			</div>			
	</div>
</div>

<div id="idDivStrPoligonoConsulta" style="display: none;">${strPoligonoConsulta}</div>
<div id="idDivStrPoligonoConsultaBoundary" style="display: none;">${strPoligonoConsultaBoundary}</div>
