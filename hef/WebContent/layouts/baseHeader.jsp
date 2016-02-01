<%@page import="java.util.List"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<nav class="navbar navbar-fixed-top" role="navigation">
	<div style="position: absolute;float: right;top: 150px;right:30px;z-index: 20;color:white;"><i class="fa fa-globe fa-2x cursorPointer seleccionar-capas"></i></div>
	<div style="position: absolute;float: right;top: 185px;right:30px;z-index: 20;color:white;"><i class="fa fa-search fa-2x cursorPointer consulta-analitica"></i></div>
	<div style="position: absolute;float: right;top: 220px;right:30px;z-index: 20;color:white;"><i class="fa fa-upload fa-2x cursorPointer upload-capas"></i></div>
</nav>
<nav class="navbar navbar-fixed-top" role="navigation">
	<div class="navbar-top">
		<div id="container">
			<div class="row">
				<div class="col-sm-6 col-xs-6 ">
<!-- 					<div class="pull-left "> -->
<!-- 						<a href=""> <img -->
<!-- 							src="/congresobiosfera/assets/img/logo.png" -->
<!-- 							class="logo" alt="" -->
<!-- 							data-src="/congresobiosfera/assets/img/logo_sernanp.jpg" -->
<!-- 							data-src-retina="/congresobiosfera/assets/img/logo_sernanp.jpg" -->
<!-- 							width="374" height="46"> -->
<!-- 						</a> -->
<!-- 					</div> -->
				</div>
				<div class="col-sm-6 col-xs-6">
					<div class="pull-right">
						<ul class="orange nav navbar-nav ">
							<li class="dropdown user-dropdown"><a href="#"
								class="dropdown-toggle orange" data-toggle="dropdown"><i
									class="fa fa-user"></i> jober.mena@gmail.com <b
									class="caret"></b></a>
								<ul class="dropdown-menu ">
									<!-- 							<li><a href="#"><i class="fa fa-user"></i> Perfil</a></li> -->
									<li><a href="capasBase.action"><i class="fa fa-gear"></i> Configuración</a></li>
																<li class="divider"></li>
									<li><a href="salir.action"><i class="fa fa-power-off"></i>
											Cerrar Sesión</a></li>
								</ul>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
</nav>
