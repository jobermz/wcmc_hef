<%@page import="java.util.List"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<nav class="navbar navbar-fixed-top " role="navigation">
	<div class="navbar-top box-shadow">
		<div class="panel ">
		<div class="row">
			<div class="col-sm-6 ">
				<div class="pull-left " style="margin-top: 15px;margin-left: 15px;">
					
					<img src="descargarAdjunto.action?strIdAdjunto=${EMPRESA_ACTUAL.strAdjuntoLogo}"
						class="logo" alt="" 
						data-src="descargarAdjunto.action?strIdAdjunto=${EMPRESA_ACTUAL.strAdjuntoLogo}"
						data-src-retina="descargarAdjunto.action?strIdAdjunto=${EMPRESA_ACTUAL.strAdjuntoLogo}" height="46">
						&nbsp;&nbsp;&nbsp;&nbsp;
<!-- 						<i class="glyphicon glyphicon-menu-hamburger"></i> -->
<!-- 						&nbsp;&nbsp; -->
<!-- 						<img src="img-face/con_logo.png" /> -->
						<a href="#" onclick="accionGeneralLink('#');return false;"><img src="img-face/botones/menu.png" /></a>
						<a href="#" onclick="accionGeneralLink('#');return false;"><img src="img-face/botones/mensajes.png" /></a>
						<a href="#" onclick="accionGeneralLink('home.action');return false;"><img src="img-face/botones/home.png" /></a>
						
					
				</div>
			</div>
			<div class="col-sm-6">
				<div class="pull-right">
				<div class="dropdown user-dropdown">
				  <button class="btn btn-link dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
<%-- 				    ${USUARIO_ACTUAL.strNombreCompleto} <img src="img-face/personaje_superior.png" class="img-circle"/><span class="caret"></span> --%>
<%-- 				    ${USUARIO_ACTUAL.strNombres} <img src="img-face/personaje_superior.png" class="img-circle"/><span class="caret"></span> --%>
				    ${USUARIO_ACTUAL.strNombreCompleto} 
				    <img src="descargarAdjunto.action?strIdAdjunto=${USUARIO_ACTUAL.strAdjuntoFoto}" class="img-circle" style="height: 70px;width: 71px;"/>
				    <span class="caret"></span>
				    
				  </button>
				  <ul class="dropdown-menu dropdown-menu-right" aria-labelledby="dropdownMenu1">
					<s:if test="%{#session.USUARIO_ACTUAL.strEsAdminBoolean}">
						<li><a href="#" onclick="accionGeneralLink('cuentaUsuario.action');return false;"> Ajustes</a></li>
					</s:if>
					
				    <li><a href="#" onclick="accionGeneralLink('homeCuentaUsuarioEditar.action?buscar_seleccion_id=${sessionScope.USUARIO_ACTUAL.srlId}');return false;"> Mi cuenta</a></li>
				    
					<li class="divider"></li>
				    <li><a href="#" onclick="accionGeneralLink('#');return false;"> Ayuda</a></li>
				    <li><a href="#" onclick="accionGeneralLink('salir.action');return false;"> Cerrar Sesión</a></li>
				  </ul>
				</div>
				</div>
			</div>
		</div>
		
		</div>
	</div>
</nav>
