<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>A¥o</strong></td>
		<td><strong>Modalidad</strong></td>
		<td><strong>Contrato</strong></td>
		<td><strong>Region</strong></td>
		<td><strong>Fuente</strong></td>
		<td><strong>Situacion</strong></td>
		<td><strong>Titular</strong></td>
		<td><strong>Area Sig</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemConcesionesForestalesReforestacion" var="reporte">
	<tr>
		<td>${reporte.strA¥o}</td>
		<td>${reporte.strModalidad}</td>
		<td>${reporte.strContrato}</td>
		<td>${reporte.strRegion}</td>
		<td>${reporte.strFuente}</td>
		<td>${reporte.strSituacion}</td>
		<td>${reporte.strTitular}</td>
		<td>${reporte.dblAreaSig}</td>
	</tr>
</s:iterator>
</table>
