<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Departamen</strong></td>
		<td><strong>Datum</strong></td>
		<td><strong>Codproy</strong></td>
		<td><strong>Cnt Codpro</strong></td>
		<td><strong>Orig Fid</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemPrediosRurales" var="reporte">
	<tr>
		<td>${reporte.strDepartamen}</td>
		<td>${reporte.strDatum}</td>
		<td>${reporte.strCodproy}</td>
		<td>${reporte.intCntCodpro}</td>
		<td>${reporte.intOrigFid}</td>
	</tr>
</s:iterator>
</table>
