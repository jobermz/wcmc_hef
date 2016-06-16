<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<s:if test="%{#session.reporte.beanTemDensidadCarbonoAerea!=null}">
	<tr>
		<td><strong>Valor total (Toneladas)</strong></td>
		<td>${sessionScope.reporte.beanTemDensidadCarbonoAerea.strValueSumaTotal2Decimales}</td>
	</tr>
	<tr>
		<td><strong>Valor promedio (Toneladas/hect&aacute;rea)</strong></td>
		<td>${sessionScope.reporte.beanTemDensidadCarbonoAerea.strValuePromedio2Decimales}</td>
	</tr>
	<tr>
		<td><strong>Valor m&iacute;nimo (Toneladas/hect&aacute;rea)</strong></td>
		<td>${sessionScope.reporte.beanTemDensidadCarbonoAerea.strValueMin2Decimales}</td>
	</tr>
	<tr>
		<td><strong>Valor m&aacute;ximo (Toneladas/hect&aacute;rea)</strong></td>
		<td>${sessionScope.reporte.beanTemDensidadCarbonoAerea.strValueMax2Decimales}</td>
	</tr>
	<%--
	<tr>
		<td><strong>Contador</strong></td>
		<td>${sessionScope.reporte.beanTemDensidadCarbonoAerea.strValueCount}</td>
	</tr>
	<tr>
		<td><strong>Desviaci&oacute;n estandar</strong></td>
		<td>${sessionScope.reporte.beanTemDensidadCarbonoAerea.strStddev}</td>
	</tr>
	--%>
	</s:if>
</table>
</br>
