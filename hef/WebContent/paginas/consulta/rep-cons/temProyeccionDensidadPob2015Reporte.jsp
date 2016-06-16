<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Densidad de población (número de personas/km2)</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemProyeccionDensidadPob2015" var="reporte">
	<tr>
		<td>${reporte.dblPopDens}</td>
	</tr>
</s:iterator>
</table>
