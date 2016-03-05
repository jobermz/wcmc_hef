<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Id Grafico</strong></td>
		<td><strong>Expediente</strong></td>
		<td><strong>Seccion</strong></td>
		<td><strong>Concesion</strong></td>
		<td><strong>Empresa</strong></td>
		<td><strong>Ruc</strong></td>
		<td><strong>Fuente</strong></td>
		<td><strong>Situacion</strong></td>
		<td><strong>Tipo Conce</strong></td>
		<td><strong>Fecha Pres</strong></td>
		<td><strong>Fecha Reso</strong></td>
		<td><strong>Activo</strong></td>
		<td><strong>Area Grafi</strong></td>
		<td><strong>Codigo Con</strong></td>
		<td><strong>Shape Area</strong></td>
		<td><strong>Shape Len</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemConcesionHidroelectricasGeneracion" var="reporte">
	<tr>
		<td>${reporte.strIdGrafico}</td>
		<td>${reporte.strExpediente}</td>
		<td>${reporte.intSeccion}</td>
		<td>${reporte.strConcesion}</td>
		<td>${reporte.strEmpresa}</td>
		<td>${reporte.strRuc}</td>
		<td>${reporte.strFuente}</td>
		<td>${reporte.strSituacion}</td>
		<td>${reporte.strTipoConce}</td>
		<td>${reporte.dteFechaPres}</td>
		<td>${reporte.dteFechaReso}</td>
		<td>${reporte.strActivo}</td>
		<td>${reporte.dblAreaGrafi}</td>
		<td>${reporte.strCodigoCon}</td>
		<td>${reporte.dblShapeArea}</td>
		<td>${reporte.dblShapeLen}</td>
	</tr>
</s:iterator>
</table>
