<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<s:if test="%{#session.reporte.beanTemDensidadCarbonoAerea!=null}">
	<tr>
		<td><strong>Valor promedio</strong></td>
		<td>${sessionScope.reporte.beanTemDensidadCarbonoAerea.strValuePromedio}</td>
	</tr>
	<tr>
		<td><strong>Valor m&iacute;nimo</strong></td>
		<td>${sessionScope.reporte.beanTemDensidadCarbonoAerea.strValueMin}</td>
	</tr>
	<tr>
		<td><strong>Valor m&aacute;ximo</strong></td>
		<td>${sessionScope.reporte.beanTemDensidadCarbonoAerea.strValueMax}</td>
	</tr>
	<tr>
		<td><strong>Contador</strong></td>
		<td>${sessionScope.reporte.beanTemDensidadCarbonoAerea.strValueCount}</td>
	</tr>
	</s:if>
</table>
</br>
