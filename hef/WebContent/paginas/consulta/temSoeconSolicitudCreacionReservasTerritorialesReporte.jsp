<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Objectid 1</strong></td>
		<td><strong>Nomret</strong></td>
		<td><strong>Catego</strong></td>
		<td><strong>Ubipol</strong></td>
		<td><strong>Areleg</strong></td>
		<td><strong>Estado</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemSoeconSolicitudCreacionReservasTerritoriales" var="reporte">
	<tr>
		<td>${reporte.intObjectid1}</td>
		<td>${reporte.strNomret}</td>
		<td>${reporte.strCatego}</td>
		<td>${reporte.strUbipol}</td>
		<td>${reporte.dblAreleg}</td>
		<td>${reporte.strEstado}</td>
	</tr>
</s:iterator>
</table>
