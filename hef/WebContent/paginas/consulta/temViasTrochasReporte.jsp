<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Objectid</strong></td>
		<td><strong>Estado</strong></td>
		<td><strong>Descrip</strong></td>
		<td><strong>Shape Leng</strong></td>
		<td><strong>St Length</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemViasTrochas" var="reporte">
	<tr>
		<td>${reporte.lngObjectid}</td>
		<td>${reporte.strEstado}</td>
		<td>${reporte.strDescrip}</td>
		<td>${reporte.dblShapeLeng}</td>
		<td>${reporte.dblStLength}</td>
	</tr>
</s:iterator>
</table>
