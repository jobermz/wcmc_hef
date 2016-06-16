<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<s:if test="%{#session.reporte.beanTemRiesgoErosionHidrica!=null}">
	<%--
	<tr>
		<td><strong>Valor total</strong></td>
		<td>${sessionScope.reporte.beanTemRiesgoErosionHidrica.strValueSumaTotal}</td>
	</tr>
	<tr>
		<td><strong>Valor promedio</strong></td>
		<td>${sessionScope.reporte.beanTemRiesgoErosionHidrica.strValuePromedio}</td>
	</tr>
	--%>
	<tr>
		<td><strong>Valor m&iacute;nimo</strong></td>
		<td>${sessionScope.reporte.beanTemRiesgoErosionHidrica.strValueMinSinDecimales}</td>
	</tr>
	<tr>
		<td><strong>Valor m&aacute;ximo</strong></td>
		<td>${sessionScope.reporte.beanTemRiesgoErosionHidrica.strValueMaxSinDecimales}</td>
	</tr>
	<%--
	<tr>
		<td><strong>Contador</strong></td>
		<td>${sessionScope.reporte.beanTemRiesgoErosionHidrica.strValueCount}</td>
	</tr>
	<tr>
		<td><strong>Desviaci&oacute;n estandar</strong></td>
		<td>${sessionScope.reporte.beanTemRiesgoErosionHidrica.strStddev}</td>
	</tr>
	--%>
	</s:if>
</table>
</br>
