<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Iddpto</strong></td>
		<td><strong>Nombdep</strong></td>
	</tr>
<s:iterator value="#session.reporte.listBasLimDepartamento" var="reporte">
	<tr>
		<td>${reporte.strIddpto}</td>
		<td>${reporte.strNombdep}</td>
	</tr>
</s:iterator>
</table>
