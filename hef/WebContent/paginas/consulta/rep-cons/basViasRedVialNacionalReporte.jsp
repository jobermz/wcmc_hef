<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Código</strong></td>
		<td><strong>Superficie</strong></td>
	</tr>
<s:iterator value="#session.reporte.listBasViasRedVialNacional" var="reporte">
	<tr>
		<td>${reporte.strRutaD044}</td>
		<td>${reporte.strSuperRod}</td>
	</tr>
</s:iterator>
</table>
