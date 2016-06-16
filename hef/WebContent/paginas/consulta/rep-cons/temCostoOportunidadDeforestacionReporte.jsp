<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Nombre distrito</strong></td>
		<td><strong>Costos de oportunidad</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemCostoOportunidadDeforestacion" var="reporte">
	<tr>
		<td>${reporte.strNombdist}</td>
		<td>${reporte.dblCopTco2H}</td>
	</tr>
</s:iterator>
</table>
