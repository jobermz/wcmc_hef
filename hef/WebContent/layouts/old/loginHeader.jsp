<%@page import="java.util.List"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<nav class="navbar navbar-fixed-top" role="navigation">
	<div class="navbar-top">
		<div class="panel ">
			<div class="row">
				<div class="col-sm-10 ">
					<div class="pull-left ">
						<a href=""> <img
							src="<%=request.getContextPath() %>/img/logo/fuxion_logo.png"
							class="logo" alt=""
							data-src="<%=request.getContextPath() %>/img/logo/fuxion_logo.png"
							data-src-retina="<%=request.getContextPath() %>/img/logo/fuxion_logo.png"
							height="46">
						</a>
					</div>
				</div>
				<div class="col-sm-2">
					<div class="pull-right">
					  <a class="btn btn-link" href="inicioAutenticarNuevaCuentaUsuario">
					    <i class="fa fa-user"></i> Registrar </span>
					  </a>
					</div>
				</div>
			</div>
		</div>
	</div>
</nav>
