<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
<%-- 		<td><strong>Objectid 1</strong></td> --%>
<%-- 		<td><strong>Gml Id</strong></td> --%>
<%-- 		<td><strong>Objectid</strong></td> --%>
<%-- 		<td><strong>Jer Hidro</strong></td> --%>
<%-- 		<td><strong>Dpd99</strong></td> --%>
<%-- 		<td><strong>Pp99</strong></td> --%>
<%-- 		<td><strong>Dd</strong></td> --%>
<%-- 		<td><strong>Din99</strong></td> --%>
<%-- 		<td><strong>Pn99</strong></td> --%>
<%-- 		<td><strong>Dn99</strong></td> --%>
<%-- 		<td><strong>Shape Stle</strong></td> --%>
	</tr>
<s:iterator value="#session.reporte.listBasHidroRios100000" var="reporte">
	<tr>
<%-- 		<td>${reporte.intObjectid1}</td> --%>
<%-- 		<td>${reporte.strGmlId}</td> --%>
<%-- 		<td>${reporte.intObjectid}</td> --%>
<%-- 		<td>${reporte.strJerHidro}</td> --%>
<%-- 		<td>${reporte.strDpd99}</td> --%>
<%-- 		<td>${reporte.strPp99}</td> --%>
<%-- 		<td>${reporte.strDd}</td> --%>
<%-- 		<td>${reporte.strDin99}</td> --%>
<%-- 		<td>${reporte.strPn99}</td> --%>
<%-- 		<td>${reporte.strDn99}</td> --%>
<%-- 		<td>${reporte.dblShapeStle}</td> --%>
	</tr>
</s:iterator>
</table>
