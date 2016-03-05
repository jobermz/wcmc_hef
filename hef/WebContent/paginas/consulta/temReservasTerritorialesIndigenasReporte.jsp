<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Objectid 1</strong></td>
		<td><strong>Gml Id</strong></td>
		<td><strong>Objectid</strong></td>
		<td><strong>Id</strong></td>
		<td><strong>Sde Dbo Te</strong></td>
		<td><strong>Perimeter</strong></td>
		<td><strong>Nombre</strong></td>
		<td><strong>Base Legal</strong></td>
		<td><strong>N Ha Ibc</strong></td>
		<td><strong>N Ubic Anp</strong></td>
		<td><strong>N Map A0</strong></td>
		<td><strong>Categoria</strong></td>
		<td><strong>Etnia</strong></td>
		<td><strong>Ubica Poli</strong></td>
		<td><strong>Area Legal</strong></td>
		<td><strong>Shape Star</strong></td>
		<td><strong>Shape Stle</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemReservasTerritorialesIndigenas" var="reporte">
	<tr>
		<td>${reporte.intObjectid1}</td>
		<td>${reporte.strGmlId}</td>
		<td>${reporte.intObjectid}</td>
		<td>${reporte.intId}</td>
		<td>${reporte.dblSdeDboTe}</td>
		<td>${reporte.dblPerimeter}</td>
		<td>${reporte.strNombre}</td>
		<td>${reporte.strBaseLegal}</td>
		<td>${reporte.dblNHaIbc}</td>
		<td>${reporte.strNUbicAnp}</td>
		<td>${reporte.strNMapA0}</td>
		<td>${reporte.strCategoria}</td>
		<td>${reporte.strEtnia}</td>
		<td>${reporte.strUbicaPoli}</td>
		<td>${reporte.strAreaLegal}</td>
		<td>${reporte.dblShapeStar}</td>
		<td>${reporte.dblShapeStle}</td>
	</tr>
</s:iterator>
</table>
