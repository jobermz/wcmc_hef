<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<s:if test="%{#session.reporte.beanTemBiodiversidadEspeciesPeligroExtincion!=null}">
	<%--
	<tr>
		<td><strong>Valor total (Número de Espécies)</strong></td>
		<td>${sessionScope.reporte.beanTemBiodiversidadEspeciesPeligroExtincion.strValueSumaTotal}</td>
	</tr>
	--%>
	<tr>
		<td><strong>Valor promedio (N&uacute;mero de Especies)</strong></td>
		<td>${sessionScope.reporte.beanTemBiodiversidadEspeciesPeligroExtincion.strValuePromedioSinDecimales}</td>
	</tr>
	<tr>
		<td><strong>Valor m&iacute;nimo (N&uacute;mero de Especies)</strong></td>
		<td>${sessionScope.reporte.beanTemBiodiversidadEspeciesPeligroExtincion.strValueMinSinDecimales}</td>
	</tr>
	<tr>
		<td><strong>Valor m&aacute;ximo (N&uacute;mero de Especies)</strong></td>
		<td>${sessionScope.reporte.beanTemBiodiversidadEspeciesPeligroExtincion.strValueMaxSinDecimales}</td>
	</tr>
	<%--
	<tr>
		<td><strong>Contador</strong></td>
		<td>${sessionScope.reporte.beanTemBiodiversidadEspeciesPeligroExtincion.strValueCount}</td>
	</tr>
	<tr>
		<td><strong>Desviaci&oacute;n estandar</strong></td>
		<td>${sessionScope.reporte.beanTemBiodiversidadEspeciesPeligroExtincion.strStddev}</td>
	</tr>
	--%>
	</s:if>
</table>
</br>
