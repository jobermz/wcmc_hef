<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Objectid</strong></td>
		<td><strong>Idccpp10</strong></td>
		<td><strong>Area</strong></td>
		<td><strong>Codccpp</strong></td>
		<td><strong>Nomccpp</strong></td>
		<td><strong>Ubigeo</strong></td>
		<td><strong>Ccdi</strong></td>
		<td><strong>Ccpp</strong></td>
		<td><strong>Ccdd</strong></td>
		<td><strong>Catccpp</strong></td>
		<td><strong>Nomcat</strong></td>
		<td><strong>Altitud</strong></td>
		<td><strong>Longitudx</strong></td>
		<td><strong>Latitudy</strong></td>
		<td><strong>Viv07</strong></td>
		<td><strong>Pob07</strong></td>
		<td><strong>Region</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemCentrosPoblados" var="reporte">
	<tr>
		<td>${reporte.intObjectid}</td>
		<td>${reporte.strIdccpp10}</td>
		<td>${reporte.strArea}</td>
		<td>${reporte.strCodccpp}</td>
		<td>${reporte.strNomccpp}</td>
		<td>${reporte.strUbigeo}</td>
		<td>${reporte.strCcdi}</td>
		<td>${reporte.strCcpp}</td>
		<td>${reporte.strCcdd}</td>
		<td>${reporte.strCatccpp}</td>
		<td>${reporte.strNomcat}</td>
		<td>${reporte.intAltitud}</td>
		<td>${reporte.strLongitudx}</td>
		<td>${reporte.strLatitudy}</td>
		<td>${reporte.intViv07}</td>
		<td>${reporte.intPob07}</td>
		<td>${reporte.intRegion}</td>
	</tr>
</s:iterator>
</table>
