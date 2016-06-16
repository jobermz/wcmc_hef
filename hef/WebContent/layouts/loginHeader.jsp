<%@page import="java.util.List"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<nav class="navbar navbar-fixed-top" role="navigation" style="margin-left:0px;">
	<div style="position: absolute;float: right;top: 150px;right:30px;z-index: 20;color:white;">
		<i title="Visualizar capas" class="fa fa-globe fa-3x cursorPointer seleccionar-capas"></i>
	</div>
	
	<div id="idDivBotonFlotanteACL" style="position: absolute;float: right;top: 200px;right:30px;z-index: 20;color:white;">
		<i title="Identificar &aacute;reas por criterios l&oacute;gicos" class="fa fa-map fa-3x cursorPointer identificar-area-criterio-logico">
			<span class="badge badgeCustomACL" style="display:none;"></span>
		</i>
	</div>
	
	<div id="idDivBotonFlotanteAPA" style="position: absolute;float: right;top: 250px;right:30px;z-index: 20;color:white;">
		<i title="Analizar por &aacute;rea" class="fa fa-bars fa-3x cursorPointer analizar-por-area">
			<span class="badge badgeCustomAPA" style="display:none;"></span>
		</i>
	</div>
	
	<div style="position: absolute;float: right;top: 300px;right:30px;z-index: 20;color:white;">
		<i title="Cargar capas" class="fa fa-upload fa-3x cursorPointer upload-capas"></i>
	</div>
</nav>