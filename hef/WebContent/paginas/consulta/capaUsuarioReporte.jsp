<%@page import="wcmc.hef.general.util.CadenaUtil"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:iterator value="#session.reporte.listGeometriaUsuario" var="mapGeometriaUsuario">
	<s:if test="%{#parameters.srlIdCapa[0]==#mapGeometriaUsuario.srlIdCapa}">
		<table border="0" style="width: 100%;">
			<tr>
				<s:iterator value="#mapGeometriaUsuario.listCampoMetadata" var="campoMetadata">
				<td><strong>${campoMetadata.strNombre}</strong></td>
				</s:iterator>
			</tr>
			<s:iterator value="#mapGeometriaUsuario.list" var="mapCapaUsuario">
			<tr>
				<s:iterator value="#mapCapaUsuario.strDataAsList" var="str">
				<td>${str}</td>
				</s:iterator>
			</tr>
			</s:iterator>
		</table>
	</s:if>
</s:iterator>
