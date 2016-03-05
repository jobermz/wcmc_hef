<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Objectid</strong></td>
		<td><strong>Za Nomb</strong></td>
		<td><strong>Za Bale</strong></td>
		<td><strong>Za Fecr</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemSinanpeAmortiguamiento" var="reporte">
	<tr>
		<td>${reporte.lngObjectid}</td>
		<td>${reporte.strZaNomb}</td>
		<td>${reporte.strZaBale}</td>
		<td>${reporte.dteZaFecr}</td>
	</tr>
</s:iterator>
</table>
