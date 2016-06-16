<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
<%-- 		<td><strong>Count</strong></td> --%>
<%-- 		<td><strong>First Idpr</strong></td> --%>
<%-- 		<td><strong>Nombprov</strong></td> --%>
<%-- 		<td><strong>First Nomb</strong></td> --%>
<%-- 		<td><strong>Last Dcto</strong></td> --%>
<%-- 		<td><strong>Last Ley</strong></td> --%>
<%-- 		<td><strong>First Fech</strong></td> --%>
<%-- 		<td><strong>Last Fecha</strong></td> --%>
<%-- 		<td><strong>Min Shape</strong></td> --%>
<%-- 		<td><strong>Area</strong></td> --%>
<%-- 		<td><strong>Perimeter</strong></td> --%>
<%-- 		<td><strong>Titicacg</strong></td> --%>
<%-- 		<td><strong>Titicacg I</strong></td> --%>
<%-- 		<td><strong>Dxf Layer</strong></td> --%>
<%-- 		<td><strong>Dxf Text</strong></td> --%>
	</tr>
<s:iterator value="#session.reporte.listBasHidroRiosLagunas" var="reporte">
	<tr>
<%-- 		<td>${reporte.lngCount}</td> --%>
<%-- 		<td>${reporte.strFirstIdpr}</td> --%>
<%-- 		<td>${reporte.strNombprov}</td> --%>
<%-- 		<td>${reporte.strFirstNomb}</td> --%>
<%-- 		<td>${reporte.strLastDcto}</td> --%>
<%-- 		<td>${reporte.strLastLey}</td> --%>
<%-- 		<td>${reporte.strFirstFech}</td> --%>
<%-- 		<td>${reporte.strLastFecha}</td> --%>
<%-- 		<td>${reporte.dblMinShape}</td> --%>
<%-- 		<td>${reporte.dblArea}</td> --%>
<%-- 		<td>${reporte.dblPerimeter}</td> --%>
<%-- 		<td>${reporte.lngTiticacg}</td> --%>
<%-- 		<td>${reporte.lngTiticacgI}</td> --%>
<%-- 		<td>${reporte.strDxfLayer}</td> --%>
<%-- 		<td>${reporte.strDxfText}</td> --%>
	</tr>
</s:iterator>
</table>
