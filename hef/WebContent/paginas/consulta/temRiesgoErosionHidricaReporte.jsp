<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Valor promedio</strong></td>
		<s:iterator value="#session.reporte.listTemRiesgoErosionHidrica" var="reporte" begin="0" end="0">
		<td><strong>${reporte.strValuePromedio}</strong></td>
		</s:iterator>
	</tr>
</table>
</br>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Value</strong></td>
	</tr>
	<s:iterator value="#session.reporte.listTemRiesgoErosionHidrica" var="reporte">
	<tr>
		<td>${reporte.strValue}</td>
	</tr>
	</s:iterator>
</table>
