<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Id</strong></td>
		<td><strong>Año</strong></td>
		<td><strong>Modalidad</strong></td>
		<td><strong>Titular</strong></td>
		<td><strong>Contrato</strong></td>
		<td><strong>Area Sig</strong></td>
		<td><strong>Area Aprob</strong></td>
		<td><strong>Region</strong></td>
		<td><strong>Docum</strong></td>
		<td><strong>Situacion</strong></td>
		<td><strong>Perimeter</strong></td>
		<td><strong>Hectares</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemConcesionesEcoturismo" var="reporte">
	<tr>
		<td>${reporte.intId}</td>
		<td>${reporte.strAño}</td>
		<td>${reporte.strModalidad}</td>
		<td>${reporte.strTitular}</td>
		<td>${reporte.strContrato}</td>
		<td>${reporte.dblAreaSig}</td>
		<td>${reporte.dblAreaAprob}</td>
		<td>${reporte.strRegion}</td>
		<td>${reporte.strDocum}</td>
		<td>${reporte.strSituacion}</td>
		<td>${reporte.dblPerimeter}</td>
		<td>${reporte.dblHectares}</td>
	</tr>
</s:iterator>
</table>
