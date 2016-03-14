<%@page import="java.util.List"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<nav class="navbar navbar-fixed-top" role="navigation" style="margin-left:50px;">
	<div class="navbar-top">
		<div id="container">
			<div class="row">
				<div class="col-lg-3 ">
					<center>
<!-- 						<div style="height: 70px;min-width:50px;display: inline-block;">&nbsp;</div> -->
						<img alt="" src="image/logos/minam_bosques.png" style="height: 70px;display: inline-table;margin-right: 5px;"/>
						<img alt="" src="image/logos/red_mas.png" style="height: 70px;display: inline-table;margin-left: 5px;"/>
					</center>
				</div>
				<div class="col-sm-6 ">
					<div class="row">
						<div class="col-sm-12 text-center" style="color: #E8E8E8;"> 
							<h4>Herramienta espacial flexible para la planificación de acciones REDD+</h4>
						</div>
					</div>
					<div class="row">
						<div class="col-sm-12 text-center clsTituloCapaActiva">&nbsp;</div>
					</div>
				</div>
				<div class="col-sm-3">
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
