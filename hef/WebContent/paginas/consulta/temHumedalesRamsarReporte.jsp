<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Categorías</strong></td>
		<td><strong>Nombre</strong></td>
		<td><strong>Base Legal</strong></td>
		<td><strong>Ubica Poli</strong></td>
		<td><strong>Area Legal</strong></td>
		<td><strong>Id</strong></td>
		<td><strong>Observa</strong></td>
		<td><strong>Shape Area</strong></td>
		<td><strong>Shape Len</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemHumedalesRamsar" var="reporte">
	<tr>
		<td>${reporte.strCategorías}</td>
		<td>${reporte.strNombre}</td>
		<td>${reporte.strBaseLegal}</td>
		<td>${reporte.strUbicaPoli}</td>
		<td>${reporte.dblAreaLegal}</td>
		<td>${reporte.intId}</td>
		<td>${reporte.strObserva}</td>
		<td>${reporte.dblShapeArea}</td>
		<td>${reporte.dblShapeLen}</td>
	</tr>
</s:iterator>
</table>
