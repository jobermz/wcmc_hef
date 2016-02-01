<%@page import="java.util.List"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!-- <div class="container"> -->
<!-- <div class="row"> -->
<!-- 	<div class="col-sm-12 "> -->
<!-- 		<div class="panel"> -->
		
	<nav class="navbar navbar-fixed-top" role="navigation">
		<div class="navbar-top">
			<div class="panel ">
<!-- 			<div class="panel-body"> -->

			<div class="row">
				<div class="col-sm-6 ">
					<div class="pull-left ">
						<a href="">
<%-- 						descargarAdjunto.action?strIdAdjunto=${EMPRESA_ACTUAL.strAdjuntoLogo} --%>
<!-- 						<img -->
<%-- 							src="<%=request.getContextPath() %>/img/logo/fuxion_logo.png" --%>
<%-- 							class="logo" alt="" data-src="<%=request.getContextPath() %>/img/logo/fuxion_logo.png" --%>
<%-- 							data-src-retina="<%=request.getContextPath() %>/img/logo/fuxion_logo.png" height="46"> --%>
						<img
							src="descargarAdjunto.action?strIdAdjunto=${EMPRESA_ACTUAL.strAdjuntoLogo}"
							class="logo" alt="" data-src="descargarAdjunto.action?strIdAdjunto=${EMPRESA_ACTUAL.strAdjuntoLogo}"
							data-src-retina="descargarAdjunto.action?strIdAdjunto=${EMPRESA_ACTUAL.strAdjuntoLogo}" height="46">
						</a>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="pull-right">
					<div class="dropdown user-dropdown">
					  <button class="btn btn-link dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
					    <i class="fa fa-user"></i> ${USUARIO_ACTUAL.strCorreo} <span class="caret"></span>
					  </button>
					  <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
					    <li><a href="cuentaUsuario.action"><i class="fa fa-edit"></i> Configuración</a></li>
						<li class="divider"></li>
					    <li><a href="salir.action"><i class="fa fa-power-off"></i> Cerrar Sesión</a></li>
					  </ul>
					</div>
					<!-- 
					<ul class="orange nav navbar-nav ">
						<li class="dropdown user-dropdown">
							<a href="#"lass="dropdown-toggle orange" data-toggle="dropdown">
								<i class="fa fa-user"></i> jober.mena@gmail.com ${USUARIO_ACTUAL.strCorreo} <b class="caret"></b>
							</a>
							<ul class="dropdown-menu ">
								<li>
									<a href="cuentaUsuario	.action"><i class="fa fa-edit"></i> Configuración</a>
								</li>
								<li>
									<a href="salir.action"><i class="fa fa-power-off"></i> Cerrar Sesión</a>
								</li>
							</ul></li>
					</ul>
					-->
					</div>
				</div>
			</div>
			
			</div>
<!-- 			</div> -->
		</div>
	</nav>
			
			
			
<!-- 		</div> -->
<!-- 	</div> -->
<!-- </div> -->
<!-- </div> -->
