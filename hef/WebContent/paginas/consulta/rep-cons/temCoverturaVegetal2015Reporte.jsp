<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Cobertura vegetal</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemCoverturaVegetal2015" var="reporte">
	<tr>
		<td>${reporte.strCobveg2013}</td>
	</tr>
</s:iterator>
</table>
