<%@page import="java.util.List"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<%-- <s:if test="%{#session.USUARIO_ACTUAL.esPerfilAdministrador}"> --%>
<%-- </s:if> --%>
<%-- <s:if test="%{#session.USUARIO_ACTUAL.esPerfilSernanp}"> --%>
<%-- </s:if> --%>
<%-- <s:if test="%{#session.USUARIO_ACTUAL.esPerfilUnesco}"> --%>
<%-- </s:if> --%>
<%-- <s:if test="%{#session.USUARIO_ACTUAL.esPerfilSoloLectura}"> --%>
<%-- </s:if> --%>
<div class="page-content">
	<div class="row">
		<div class="col-sm-12">
			<ul class="list-group">
			<!-- 	<li class="list-group-item active"><a href="#"> <i class="fa fa-bars"></i></a></li> -->
				<li class="list-group-item">
					<a href="capa.action"><i class="glyphicon glyphicon-list-alt"></i> Capas base</a>
				</li>
				<li class="list-group-item">
					<a href="grupoCapas.action"><i class="glyphicon glyphicon-list-alt"></i> Grupo de capas</a>
				</li>
				<li class="list-group-item">
					<a href="cuentaUsuario.action"><i class="glyphicon glyphicon-list-alt"></i> Cuenta de usuario</a>
				</li>
			</ul>
		</div>
	</div>
</div>