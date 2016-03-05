<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Objectid</strong></td>
		<td><strong>Anp Cate</strong></td>
		<td><strong>Anp Nomb</strong></td>
		<td><strong>Anp Codi</strong></td>
		<td><strong>Anp Ubpo</strong></td>
		<td><strong>Anp Arle</strong></td>
		<td><strong>Anp Balecr</strong></td>
		<td><strong>Anp Fecrea</strong></td>
		<td><strong>Anp Balemo</strong></td>
		<td><strong>Anp Femodi</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemAnpNacional" var="reporte">
	<tr>
		<td>${reporte.lngObjectid}</td>
		<td>${reporte.strAnpCate}</td>
		<td>${reporte.strAnpNomb}</td>
		<td>${reporte.strAnpCodi}</td>
		<td>${reporte.strAnpUbpo}</td>
		<td>${reporte.dblAnpArle}</td>
		<td>${reporte.strAnpBalecr}</td>
		<td>${reporte.strAnpFecrea}</td>
		<td>${reporte.strAnpBalemo}</td>
		<td>${reporte.strAnpFemodi}</td>
	</tr>
</s:iterator>
</table>
