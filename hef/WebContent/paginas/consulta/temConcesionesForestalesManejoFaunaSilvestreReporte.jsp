<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Objectid</strong></td>
		<td><strong>Beneficiar</strong></td>
		<td><strong>Modalidad</strong></td>
		<td><strong>Titular</strong></td>
		<td><strong>Contrato</strong></td>
		<td><strong>Area Aprob</strong></td>
		<td><strong>Region</strong></td>
		<td><strong>Docum</strong></td>
		<td><strong>Situacion</strong></td>
		<td><strong>Area Sig</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemConcesionesForestalesManejoFaunaSilvestre" var="reporte">
	<tr>
		<td>${reporte.intObjectid}</td>
		<td>${reporte.strBeneficiar}</td>
		<td>${reporte.strModalidad}</td>
		<td>${reporte.strTitular}</td>
		<td>${reporte.strContrato}</td>
		<td>${reporte.dblAreaAprob}</td>
		<td>${reporte.strRegion}</td>
		<td>${reporte.strDocum}</td>
		<td>${reporte.strSituacion}</td>
		<td>${reporte.dblAreaSig}</td>
	</tr>
</s:iterator>
</table>
