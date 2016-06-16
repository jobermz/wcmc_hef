<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<s:if test="%{#session.reporte.beanTemCoberturaBoscosa2014!=null}">
	<tr>
		<td><strong>Valor total (hect&aacute;rea)</strong></td>
		<td>${sessionScope.reporte.beanTemCoberturaBoscosa2014.strValueSumaTotal2DecimalesCobBos}</td>
	</tr>
	<%--
	<tr>
		<td><strong>Valor promedio</strong></td>
		<td>${sessionScope.reporte.beanTemCoberturaBoscosa2014.strValuePromedio}</td>
	</tr>
	--%>
	<%--
	<tr>
		<td><strong>Valor m&iacute;nimo</strong></td>
		<td>${sessionScope.reporte.beanTemCoberturaBoscosa2014.strValueMin}</td>
	</tr>
	<tr>
		<td><strong>Valor m&aacute;ximo</strong></td>
		<td>${sessionScope.reporte.beanTemCoberturaBoscosa2014.strValueMax}</td>
	</tr>
	--%>
	<%--
	<tr>
		<td><strong>Contador</strong></td>
		<td>${sessionScope.reporte.beanTemCoberturaBoscosa2014.strValueCount}</td>
	</tr>
	<tr>
		<td><strong>Desviaci&oacute;n estandar</strong></td>
		<td>${sessionScope.reporte.beanTemCoberturaBoscosa2014.strStddev}</td>
	</tr>
	--%>
	</s:if>
</table>
</br>
