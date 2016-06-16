<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Categoria</strong></td>
		<td><strong>Nombre</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemAnpNacional" var="reporte">
	<tr>
		<td>${reporte.strAnpCate}</td>
		<td>${reporte.strAnpNomb}</td>
	</tr>
</s:iterator>
</table>
