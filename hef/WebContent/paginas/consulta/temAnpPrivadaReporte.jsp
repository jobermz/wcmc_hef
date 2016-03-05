<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Objectid</strong></td>
		<td><strong>Anpc Cat</strong></td>
		<td><strong>Anpc Codi</strong></td>
		<td><strong>Anpc Nomb</strong></td>
		<td><strong>Anpc Area</strong></td>
		<td><strong>Anpc Balec</strong></td>
		<td><strong>Anpc Felec</strong></td>
		<td><strong>Anpc Balem</strong></td>
		<td><strong>Anpc Felem</strong></td>
		<td><strong>Anpc Depa</strong></td>
		<td><strong>Anpc Tipop</strong></td>
		<td><strong>Anpc Titu</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemAnpPrivada" var="reporte">
	<tr>
		<td>${reporte.lngObjectid}</td>
		<td>${reporte.strAnpcCat}</td>
		<td>${reporte.strAnpcCodi}</td>
		<td>${reporte.strAnpcNomb}</td>
		<td>${reporte.dblAnpcArea}</td>
		<td>${reporte.strAnpcBalec}</td>
		<td>${reporte.strAnpcFelec}</td>
		<td>${reporte.strAnpcBalem}</td>
		<td>${reporte.strAnpcFelem}</td>
		<td>${reporte.strAnpcDepa}</td>
		<td>${reporte.strAnpcTipop}</td>
		<td>${reporte.strAnpcTitu}</td>
	</tr>
</s:iterator>
</table>
