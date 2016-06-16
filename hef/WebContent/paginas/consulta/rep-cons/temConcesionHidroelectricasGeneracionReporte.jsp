<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Nombre</strong></td>
		<td><strong>Tipo</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemConcesionHidroelectricasGeneracion" var="reporte">
	<tr>
		<td>${reporte.strConcesion}</td>
		<td>${reporte.strFuente}</td>
	</tr>
</s:iterator>
</table>
