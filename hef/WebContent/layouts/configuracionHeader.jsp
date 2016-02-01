<%@page import="java.util.List"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<nav class="navbar navbar-fixed-top " role="navigation">
	<div class="navbar-top box-shadow">
		<div class="panel ">
		<div class="row">
			<div class="col-sm-6 ">
				<div class="pull-left " style="margin-top: 15px;margin-left: 15px;">
					<h4>Herramienta espacial flexible</h4>
				</div>
			</div>
			<div class="col-sm-6">
				<div class="pull-right">
					<ul class="orange nav navbar-nav ">
						<li class="dropdown user-dropdown"><a href="#"
							class="dropdown-toggle orange" data-toggle="dropdown"><i
								class="fa fa-user"></i> jober.mena@gmail.com <b
								class="caret"></b></a>
							<ul class="dropdown-menu ">
								<!-- 							<li><a href="#"><i class="fa fa-user"></i> Perfil</a></li> -->
								<li><a href="home.action"><i class="fa fa-gear"></i> Home</a></li>
								<li class="divider"></li>
								<li><a href="salir.action"><i class="fa fa-power-off"></i>
										Cerrar Sesión</a></li>
							</ul>
						</li>
					</ul>

				
<!-- 				<div class="dropdown user-dropdown"> -->
<!-- 				  <button class="btn btn-link dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true"> -->
<!-- 				    <i class="fa fa-user"></i> jober.mena@gmail.com -->
<%-- 				    <span class="caret"></span> --%>
<!-- 				  </button> -->
<!-- 				  <ul class="dropdown-menu dropdown-menu-right" aria-labelledby="dropdownMenu1"> -->
<%-- 					<s:if test="%{#session.USUARIO_ACTUAL.strEsAdminBoolean}"> --%>
<!-- 						<li><a href="#" onclick="accionGeneralLink('cuentaUsuario.action');return false;"> Ajustes</a></li> -->
<%-- 					</s:if> --%>
					
<%-- 				    <li><a href="#" onclick="accionGeneralLink('homeCuentaUsuarioEditar.action?buscar_seleccion_id=${sessionScope.USUARIO_ACTUAL.srlId}');return false;"> Mi cuenta</a></li> --%>
				    
<!-- 					<li class="divider"></li> -->
<!-- 				    <li><a href="#" onclick="accionGeneralLink('#');return false;"> Ayuda</a></li> -->
<!-- 				    <li><a href="#" onclick="accionGeneralLink('salir.action');return false;"> Cerrar Sesión</a></li> -->
<!-- 				  </ul> -->
<!-- 				</div> -->
				</div>
			</div>
		</div>
		
		</div>
	</div>
</nav>
