<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong></strong></td>
		<td><strong></strong></td>
	</tr>
	<s:iterator value="#session.reporte.listTemZonificPotencialBosqueProduccionPermanente" var="reporte">
		<tr>
			<td>${reporte.srlIdGrupoCapas}</td>
			<td>${reporte.srlIdGrupoCapas}</td>
		</tr>
	</s:iterator>
</table>
