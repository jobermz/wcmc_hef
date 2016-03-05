<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Nombre</strong></td>
		<td><strong>Iniciativa</strong></td>
		<td><strong>Referencia</strong></td>
		<td><strong>Region Geo</strong></td>
		<td><strong>Detalle De</strong></td>
		<td><strong>Otros</strong></td>
		<td><strong>Fecha Inic</strong></td>
		<td><strong>Fecha Term</strong></td>
		<td><strong>Resultados</strong></td>
		<td><strong>Cooperante</strong></td>
		<td><strong>Administra</strong></td>
		<td><strong>Usd</strong></td>
		<td><strong>Institucio</strong></td>
		<td><strong>Persona Co</strong></td>
		<td><strong>Cargo</strong></td>
		<td><strong>Contacto</strong></td>
		<td><strong>Direccion</strong></td>
		<td><strong>Instituc 1</strong></td>
		<td><strong>Link</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemProyectosPuntos" var="reporte">
	<tr>
		<td>${reporte.strNombre}</td>
		<td>${reporte.strIniciativa}</td>
		<td>${reporte.strReferencia}</td>
		<td>${reporte.strRegionGeo}</td>
		<td>${reporte.strDetalleDe}</td>
		<td>${reporte.strOtros}</td>
		<td>${reporte.strFechaInic}</td>
		<td>${reporte.strFechaTerm}</td>
		<td>${reporte.strResultados}</td>
		<td>${reporte.strCooperante}</td>
		<td>${reporte.strAdministra}</td>
		<td>${reporte.dblUsd}</td>
		<td>${reporte.strInstitucio}</td>
		<td>${reporte.strPersonaCo}</td>
		<td>${reporte.strCargo}</td>
		<td>${reporte.strContacto}</td>
		<td>${reporte.strDireccion}</td>
		<td>${reporte.strInstituc1}</td>
		<td>${reporte.strLink}</td>
	</tr>
</s:iterator>
</table>
