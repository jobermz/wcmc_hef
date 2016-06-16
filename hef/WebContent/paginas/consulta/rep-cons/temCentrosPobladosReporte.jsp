<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Código</strong></td>
		<td><strong>Nombre</strong></td>
		<td><strong>Población</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemCentrosPoblados" var="reporte">
	<tr>
		<td>${reporte.strCodccpp}</td>
		<td>${reporte.strNomccpp}</td>
		<td>${reporte.intPob07}</td>
	</tr>
</s:iterator>
</table>
