<%@page import="java.util.List"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<nav class="navbar navbar-fixed-top" role="navigation" style="margin-left:50px;">
	<div style="position: absolute;float: right;top: 150px;right:30px;z-index: 20;color:white;"><i title="Visualziar capas" class="fa fa-globe fa-2x cursorPointer seleccionar-capas"></i></div>
	<div style="position: absolute;float: right;top: 185px;right:30px;z-index: 20;color:white;"><i title="Identificar areas por criterios logicos" class="fa fa-search fa-2x cursorPointer identificar-area-criterio-logico"></i></div>
	<div style="position: absolute;float: right;top: 220px;right:30px;z-index: 20;color:white;"><i title="Analizar por &aacute;rea" class="fa fa-bars fa-2x cursorPointer analizar-por-area"></i></div>
	<div style="position: absolute;float: right;top: 255px;right:30px;z-index: 20;color:white;"><i title="Cargar capas" class="fa fa-upload fa-2x cursorPointer upload-capas"></i></div>
</nav>
<nav class="navbar navbar-fixed-top" role="navigation" style="margin-left:50px;">
	<div class="navbar-top">
		<div id="container">
			<div class="row">
				<div class="col-sm-6 col-xs-6 ">
					<div class="text-center clsTituloCapaActiva" style="display: none;">&nbsp;</div>
				</div>
				<div class="col-sm-6 col-xs-6">
				<s:if test="%{#session.USUARIO_ACTUAL != null}">
					<div class="pull-right">
						<ul class="orange nav navbar-nav ">
							<li class="dropdown user-dropdown text-right" style="min-width:150px; ">
								<a href="#" class="dropdown-toggle orange clsLogin" data-toggle="dropdown">
									<i class="fa fa-user"></i>
									${sessionScope.USUARIO_ACTUAL.strNombres}
									<b class="caret"></b>
								</a>
								<ul class="dropdown-menu ">
									<li><a href="capa.action"><i class="fa fa-gear"></i> Configuración</a></li>
									<li class="divider"></li>
									<li><a href="salir.action"><i class="fa fa-sign-out"></i> Cerrar Sesión</a></li>
								</ul>
							</li>
						</ul>
					</div>
				</s:if>
				<s:else>
					<div class="pull-right " style="margin-top: 15px;margin-right: 15px;">
						<a href="login.action" class="clsLogin"><i class="fa fa-lg fa-sign-in"></i> Login</a>
					</div>
				</s:else>
			</div>
		</div>
	</div>
</nav>
