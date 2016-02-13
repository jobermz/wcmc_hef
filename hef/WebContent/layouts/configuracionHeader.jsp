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
				<s:if test="%{#session.USUARIO_ACTUAL != null}">
					<div class="pull-right">
						<ul class="orange nav navbar-nav ">
							<li class="dropdown user-dropdown text-right" style="min-width:150px; ">
								<a href="#" class="dropdown-toggle orange clsLoginBlue" data-toggle="dropdown">
									<i class="fa fa-user"></i>
									${sessionScope.USUARIO_ACTUAL.strNombres}
									<b class="caret"></b>
								</a>
								<ul class="dropdown-menu ">
									<li><a href="home.action"><i class="fa fa-gear"></i> Principal</a></li>
									<li class="divider"></li>
									<li><a href="salir.action"><i class="fa fa-sign-out"></i> Cerrar Sesi�n</a></li>
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
	</div>
</nav>
