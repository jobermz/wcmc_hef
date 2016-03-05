<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Objectid</strong></td>
		<td><strong>Ecozona</strong></td>
		<td><strong>Tc Ha</strong></td>
		<td><strong>Linf Tc Ha</strong></td>
		<td><strong>Lsup Tc Ha</strong></td>
		<td><strong>Porc Incer</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemCarbonoEcozonas" var="reporte">
	<tr>
		<td>${reporte.intObjectid}</td>
		<td>${reporte.strEcozona}</td>
		<td>${reporte.strTcHa}</td>
		<td>${reporte.dblLinfTcHa}</td>
		<td>${reporte.dblLsupTcHa}</td>
		<td>${reporte.dblPorcIncer}</td>
	</tr>
</s:iterator>
</table>
