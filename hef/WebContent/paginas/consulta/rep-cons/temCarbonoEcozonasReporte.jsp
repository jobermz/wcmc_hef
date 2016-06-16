<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Nombre Ecozona</strong></td>
		<td><strong>Densidad de Carbono media estimada</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemCarbonoEcozonas" var="reporte">
	<tr>
		<td>${reporte.strEcozona}</td>
		<td>${reporte.strTcHa}</td>
	</tr>
</s:iterator>
</table>
