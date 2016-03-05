<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Objectid</strong></td>
		<td><strong>Gml Id</strong></td>
		<td><strong>Id</strong></td>
		<td><strong>Codigo</strong></td>
		<td><strong>Nombre</strong></td>
		<td><strong>Geometria</strong></td>
		<td><strong>Esri Oid</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemCuencasHidrograficas" var="reporte">
	<tr>
		<td>${reporte.intObjectid}</td>
		<td>${reporte.strGmlId}</td>
		<td>${reporte.strId}</td>
		<td>${reporte.strCodigo}</td>
		<td>${reporte.strNombre}</td>
		<td>${reporte.strGeometria}</td>
		<td>${reporte.intEsriOid}</td>
	</tr>
</s:iterator>
</table>
