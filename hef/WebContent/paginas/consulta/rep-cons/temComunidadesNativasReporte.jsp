<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Nombre</strong></td>
		<td><strong>Federación</strong></td>
		<td><strong>Etnia</strong></td>
		<td><strong>Población</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemComunidadesNativas" var="reporte">
	<tr>
		<td>${reporte.strNombre}</td>
		<td>${reporte.strFederacion}</td>
		<td>${reporte.strEtnia1}</td>
		<td>${reporte.dblPoblacion}</td>
	</tr>
</s:iterator>
</table>
