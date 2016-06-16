<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Código</strong></td>
		<td><strong>Provincia</strong></td>
<%-- 		<td><strong>Centrar</strong></td> --%>
	</tr>
<s:iterator value="#session.reporte.listBasLimProvincia" var="reporte">
	<tr>
		<td>${reporte.strIdprov}</td>
		<td>${reporte.strNombprov}</td>
<%-- 		<td><a href="#" onclick="centrarZoomMapaFromBox('${reporte.strTheGeom}')" title="${reporte.strTheGeom}">Centrar en mapa</a></td> --%>
	</tr>
</s:iterator>
</table>
