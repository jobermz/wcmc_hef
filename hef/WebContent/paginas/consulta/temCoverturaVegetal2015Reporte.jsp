<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Cobveg2013</strong></td>
		<td><strong>Simbolo</strong></td>
		<td><strong>Fisiogr</strong></td>
		<td><strong>Shape Leng</strong></td>
		<td><strong>Shape Area</strong></td>
		<td><strong>Cv Label</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemCoverturaVegetal2015" var="reporte">
	<tr>
		<td>${reporte.strCobveg2013}</td>
		<td>${reporte.strSimbolo}</td>
		<td>${reporte.strFisiogr}</td>
		<td>${reporte.dblShapeLeng}</td>
		<td>${reporte.dblShapeArea}</td>
		<td>${reporte.strCvLabel}</td>
	</tr>
</s:iterator>
</table>
