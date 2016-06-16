<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Código</strong></td>
		<td><strong>Superficie</strong></td>
	</tr>
<s:iterator value="#session.reporte.listBasViasRedVialVecinal" var="reporte">
	<tr>
		<td>${reporte.strRuta}</td>
		<td>${reporte.strSuperficie}</td>
	</tr>
</s:iterator>
</table>
