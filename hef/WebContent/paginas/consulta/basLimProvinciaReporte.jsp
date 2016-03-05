<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Iddpto</strong></td>
		<td><strong>Nombdep</strong></td>
		<td><strong>Idprov</strong></td>
		<td><strong>Nombprov</strong></td>
		<td><strong>Capital</strong></td>
	</tr>
<s:iterator value="#session.reporte.listBasLimProvincia" var="reporte">
	<tr>
		<td>${reporte.strIddpto}</td>
		<td>${reporte.strNombdep}</td>
		<td>${reporte.strIdprov}</td>
		<td>${reporte.strNombprov}</td>
		<td>${reporte.strCapital}</td>
	</tr>
</s:iterator>
</table>
