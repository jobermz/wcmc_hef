<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Objectid 1</strong></td>
		<td><strong>Gml Id</strong></td>
		<td><strong>Objectid</strong></td>
		<td><strong>Viaferr</strong></td>
		<td><strong>Shape Stle</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemViaFerrea" var="reporte">
	<tr>
		<td>${reporte.intObjectid1}</td>
		<td>${reporte.strGmlId}</td>
		<td>${reporte.intObjectid}</td>
		<td>${reporte.dblViaferr}</td>
		<td>${reporte.dblShapeStle}</td>
	</tr>
</s:iterator>
</table>
