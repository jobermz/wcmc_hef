<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="row">
	<div class="col-lg-5" >
		<img src="download.action?strImagenReporte=${sessionScope.NombreImagenGMapReporteTemp}" style="max-height: 270px;max-width: 270px;"/>
	</div>
	<div class="col-lg-7" >
		<img src="download.action?strImagenReporte=${sessionScope.NombreImagenReporteTemp}" style="max-height: 270px;max-width: 270px;"/>
	</div>
</div>
