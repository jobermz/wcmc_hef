<%@page import="java.util.List"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<nav class="navbar navbar-fixed-top " role="navigation" style="height: 20px; background-color: #FFFFFF">
	<div class="navbar-top">
		<div class="panel ">
		<div class="row">
			<div class="col-lg-3 ">
				<div class="row">
					<div class="col-sm-12 text-left">
						<img alt="" src="image/logo.png" style="height: 44px;display: inline-table;margin-left: 5px;"/>
					</div>
				</div>
			</div>
			<div class="col-sm-9">
						<img alt="" src="image/Logo_Programa_Bosques.png" style="height: 44px;display: inline-table;margin-left: 630px;"/>
						<img alt="" src="image/Logo_MINAM.png" style="height: 44px;display: inline-table;margin-left: 0px;"/>
				<s:if test="%{#session.USUARIO_ACTUAL != null}">
					<div class="pull-right">
						<ul class="orange nav navbar-nav ">
							<li class="dropdown user-dropdown text-right">
								<a href="#" class="dropdown-toggle orange clsLoginBlue" data-toggle="dropdown">
									<i class="fa fa-user"></i>
									${sessionScope.USUARIO_ACTUAL.strNombres}
									<b class="caret"></b>
								</a>
								<ul class="dropdown-menu pull-right">
									<li><a href="home.action"><i class="fa fa-gear"></i> Principal</a></li>
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
	</div>
</nav>
