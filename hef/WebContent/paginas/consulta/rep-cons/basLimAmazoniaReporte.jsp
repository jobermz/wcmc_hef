<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Objectid 1</strong></td>
		<td><strong>Simb Cobve</strong></td>
		<td><strong>Desc Cobve</strong></td>
		<td><strong>Simb Defor</strong></td>
		<td><strong>Desc Defor</strong></td>
		<td><strong>Superf M2</strong></td>
		<td><strong>Superf Ha</strong></td>
		<td><strong>Sim Cv Def</strong></td>
		<td><strong>Superf Km2</strong></td>
	</tr>
<s:iterator value="#session.reporte.listBasLimAmazonia" var="reporte">
	<tr>
		<td>${reporte.intObjectid1}</td>
		<td>${reporte.strSimbCobve}</td>
		<td>${reporte.strDescCobve}</td>
		<td>${reporte.strSimbDefor}</td>
		<td>${reporte.strDescDefor}</td>
		<td>${reporte.dblSuperfM2}</td>
		<td>${reporte.dblSuperfHa}</td>
		<td>${reporte.strSimCvDef}</td>
		<td>${reporte.dblSuperfKm2}</td>
	</tr>
</s:iterator>
</table>
