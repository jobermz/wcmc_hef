<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Promedio</strong></td>
		<td><strong>Umbral</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemIndiceImportanciaBiologica" var="reporte">
	<tr>
		<td>${reporte.dblImpGlob4Decimales}</td>
		<td>${reporte.strDescUmbral}</td>
	</tr>
</s:iterator>
</table>
