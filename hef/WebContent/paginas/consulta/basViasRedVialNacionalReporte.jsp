<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Dpto</strong></td>
		<td><strong>Ruta D044</strong></td>
		<td><strong>Red 044</strong></td>
		<td><strong>Longkm D44</strong></td>
		<td><strong>Super Rod</strong></td>
	</tr>
<s:iterator value="#session.reporte.listBasViasRedVialNacional" var="reporte">
	<tr>
		<td>${reporte.strDpto}</td>
		<td>${reporte.strRutaD044}</td>
		<td>${reporte.strRed044}</td>
		<td>${reporte.dblLongkmD44}</td>
		<td>${reporte.strSuperRod}</td>
	</tr>
</s:iterator>
</table>
