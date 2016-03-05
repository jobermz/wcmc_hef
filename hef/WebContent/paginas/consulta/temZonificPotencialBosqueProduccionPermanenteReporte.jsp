<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Id</strong></td>
		<td><strong>Zona</strong></td>
		<td><strong>Tipo</strong></td>
		<td><strong>Denomin</strong></td>
		<td><strong>Area Sig</strong></td>
		<td><strong>Area Aprob</strong></td>
		<td><strong>Region</strong></td>
		<td><strong>Fuente</strong></td>
		<td><strong>Doc Legal</strong></td>
		<td><strong>Theid</strong></td>
		<td><strong>Perimeter</strong></td>
		<td><strong>Hectares</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemZonificPotencialBosqueProduccionPermanente" var="reporte">
	<tr>
		<td>${reporte.lngId}</td>
		<td>${reporte.strZona}</td>
		<td>${reporte.strTipo}</td>
		<td>${reporte.strDenomin}</td>
		<td>${reporte.dblAreaSig}</td>
		<td>${reporte.dblAreaAprob}</td>
		<td>${reporte.strRegion}</td>
		<td>${reporte.strFuente}</td>
		<td>${reporte.strDocLegal}</td>
		<td>${reporte.intTheid}</td>
		<td>${reporte.dblPerimeter}</td>
		<td>${reporte.dblHectares}</td>
	</tr>
</s:iterator>
</table>
