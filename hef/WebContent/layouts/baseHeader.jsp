<%@page import="java.util.List"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!-- <nav class="navbar navbar-fixed-top" role="navigation" style="height: 20px;"> -->
	<%--
	<div style="position: absolute;float: right;top: 150px;right:30px;z-index: 20;color:white;">
		<i title="Visualizar capas" class="fa fa-globe fa-3x cursorPointer seleccionar-capas"></i>
	</div>
	<div id="idDivBotonFlotanteACL" style="position: absolute;float: right;top: 200px;right:30px;z-index: 20;color:white;">
		<i title="Identificar areas por criterios l&oacute;gicos" class="fa fa-map fa-3x cursorPointer identificar-area-criterio-logico">
			<span class="badge badgeCustomACL" style="display:none;"></span>
		</i>
	</div>
	<div id="idDivBotonFlotanteAPA" style="position: absolute;float: right;top: 250px;right:30px;z-index: 20;color:white;">
		<i title="Analizar por &aacute;rea" class="fa fa-bars fa-3x cursorPointer analizar-por-area">
			<span class="badge badgeCustomAPA" style="display:none;"></span>
		</i>
	</div>
	--%>
<%-- 	<s:if test="%{#session.USUARIO_ACTUAL != null && #session.USUARIO_ACTUAL.intPerfil.toString()!='1'}"> --%>
<!-- 	<div style="position: absolute;float: right;top: 300px;right:30px;z-index: 20;color:white;"> -->
<!-- 		<i title="Cargar capas" class="fa fa-upload fa-3x cursorPointer upload-capas"></i> -->
<!-- 	</div> -->
<%-- 	</s:if> --%>
<!-- </nav> -->

<nav class="navbar navbar-fixed-top" role="navigation" style="height: 60px; background-color: #FFFFFF">
	<div class="navbar-top">
		<div id="container" style="margin-top: 5px;margin-bottom: 5ps;">
			<div class="row" >
				<div class="col-sm-6">
					<div class="row">
						<div class="col-sm-12 text-left">
							<ul class="media-list">
							  <li class="media">
							    <div class="media-left media-middle">
									<img alt="" src="image/Logo_Geodecision.png" style="display: inline-table;margin-left: 5px;"/>
									
							    </div>
							    <div class="media-body clsNombreSistema">
							    	<table style="margin: 0px 0px 0px 0px;padding: 0px 0px 0px 0px;width: 100%;height: 100%;">
							    		<tr>
								    		<td style="width: 3%;">
												<div style="display: inline-flex;
													width:3px;height:30px;margin-top:10px;margin-bottom:10px; 
													padding-left:2px;margin-right:2px; 
													border-right:1px solid #666666; "></div>
								    		</td>
								    		<td>
												<span class="clsNombreSistema">Una herramienta espacial flexible para <br/>orientar la toma de decisiones ambientales</span>
								    		</td>
							    		</tr>
							    	</table>
							    </div>
							  </li>
							</ul>
						</div>
<!-- 						<div class="row"> -->
<%-- 							<small><div class="col-sm-12 text-center clsTituloCapaActiva">&nbsp;</div></small> --%>
<!-- 						</div> -->
					</div>

				</div>
				<div class="col-sm-6">
					<div class="pull-right">
						<img alt="" src="image/Logo_Programa_Bosques.png" style="height: 44px;display: inline-table;"/>
						<img alt="" src="image/Logo_MINAM.png" style="height: 44px;display: inline-table;margin-left: 0px;"/>
						&nbsp;&nbsp;
						<a href="download/Geodecision_Guia_de_Usuario.pdf" title="Geodecision guía de usuario" target="_blank" style="margin-top: 13px;display: inline-table;"><i class="fa fa-lg fa-book"></i> </a>
						&nbsp;&nbsp;
						<s:if test="%{#session.USUARIO_ACTUAL != null}">
							<div class="pull-right" style="display: inline-table;">
								<ul class="orange nav navbar-nav ">
									<li class="dropdown user-dropdown text-right" >
										<a href="#" class="dropdown-toggle orange clsLogin" data-toggle="dropdown">
											<i class="fa fa-user"></i>
											${sessionScope.USUARIO_ACTUAL.strNombres}
											<b class="caret"></b>
										</a>
										<ul class="dropdown-menu pull-right">
											<li><a href="capa.action"><i class="fa fa-gear"></i> Configuración</a></li>
											<li class="divider"></li>
											<li><a href="salir.action"><i class="fa fa-sign-out"></i> Cerrar Sesión</a></li>
										</ul>
									</li>
								</ul>
							</div>
						</s:if>
						<s:else>
							<div class="pull-right " style="margin-top: 13px;margin-right: 15px;display: inline-table;">
								<a href="login.action" class="clsLogin"><i class="fa fa-lg fa-sign-in"></i> Login</a>
							</div>
						</s:else>
					</div>
				</div>
			</div>
		</div>
	</div>
</nav>      


<div class="dropup pull-right" style="position: absolute;float: right;bottom: 63px;right:5px;z-index: 20;">
	<%--
	<button class="btn btn-default dropdown-toggle" type="button" id="idDropdownMenuGoogleMap" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
	<span class="glyphicon glyphicon-globe"></span>
	Satelital
	</button>
	<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">	
		<li><a href="#" onclick="cambiarGoogle(this,google.maps.MapTypeId.ROADMAP)"><i class="clsGoogle fa fa-check"></i> Cartogr&aacute;fica</a></li>
		<li><a href="#" onclick="cambiarGoogle(this,google.maps.MapTypeId.SATELLITE)"><i class="clsGoogle fa fa-circle-o"></i> Satelital</a></li>
		<li><a href="#" onclick="cambiarGoogle(this,google.maps.MapTypeId.HYBRID)"><i class="clsGoogle fa fa-circle-o"></i> Cartografica y Satelital</a></li>
		<li><a href="#" onclick="cambiarGoogle(this,google.maps.MapTypeId.TERRAIN)"><i class="clsGoogle fa fa-circle-o"></i> Topografica</a></li>
	</ul>
	--%>
   	<button class="btn btn-default clsPopoverMenuCapasBase" type="button" id="idPopoverMenuCapasBase" 
   		onclick="mostrarPopoverCapasBase();" 
		data-toggle="popover" 
		data-html="true" 
		data-placement="top"
		data-trigger="manual" 
		data-delay="{show:0,hide:0}"
		data-content='
		<div class="row">
		<div class="col-xs-8">
			<div class="pull-left">Capas base</div>
		</div>
		<div class="col-xs-4">
			<div class="pull-right">
				<button type="button" class="close" onclick="cerrarPopoverCapasBase()"><span aria-hidden="true">&times;</span></button>
			</div>
		</div>
		</div>
		<div class="row">
		<div class="col-xs-12">
		<div class="btn-group-vertical" role="group" >
			<button type="button" class="btn btn-linkpopover" onclick="cambiarGoogle(this,google.maps.MapTypeId.ROADMAP)"> Cartogr&aacute;fica</button>
			<button type="button" class="btn btn-linkpopover" onclick="cambiarGoogle(this,google.maps.MapTypeId.SATELLITE)"> Satelital</button>
			<button type="button" class="btn btn-linkpopover" onclick="cambiarGoogle(this,google.maps.MapTypeId.HYBRID)"> Cartografica y Satelital</button>
			<button type="button" class="btn btn-linkpopover" onclick="cambiarGoogle(this,google.maps.MapTypeId.TERRAIN)"> Topografica</button>
		</div>
		</div>
		</div>
		' >
		<span class="glyphicon glyphicon-globe"></span> Cartogr&aacute;fica
	</button>
</div>

<!--
<div class="" style="position: absolute;float: right;top: 585px;right:5px;z-index: 20;color:#fff;">
	<div class="pull-left ">
		<img
			src="image/Logo_onu_red.png"
			class="logo" alt=""
			data-src="image/Logo_onu_red.png"
			data-src-retina="image/Logo_onu_red.png"
			width="370" height="40">
	</div>
</div>
-->