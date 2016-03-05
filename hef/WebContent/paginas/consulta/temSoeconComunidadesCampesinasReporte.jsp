<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Objectid</strong></td>
		<td><strong>Nombre</strong></td>
		<td><strong>Estado</strong></td>
		<td><strong>Resolucion</strong></td>
		<td><strong>Area Ha</strong></td>
		<td><strong>Nomdpto</strong></td>
		<td><strong>Nomprov</strong></td>
		<td><strong>Distrito</strong></td>
		<td><strong>Fecha Reso</strong></td>
		<td><strong>N Titulo</strong></td>
		<td><strong>Shape Leng</strong></td>
		<td><strong>Shape Area</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemSoeconComunidadesCampesinas" var="reporte">
	<tr>
		<td>${reporte.intObjectid}</td>
		<td>${reporte.strNombre}</td>
		<td>${reporte.strEstado}</td>
		<td>${reporte.strResolucion}</td>
		<td>${reporte.dblAreaHa}</td>
		<td>${reporte.strNomdpto}</td>
		<td>${reporte.strNomprov}</td>
		<td>${reporte.strDistrito}</td>
		<td>${reporte.strFechaReso}</td>
		<td>${reporte.strNTitulo}</td>
		<td>${reporte.dblShapeLeng}</td>
		<td>${reporte.dblShapeArea}</td>
	</tr>
</s:iterator>
</table>
