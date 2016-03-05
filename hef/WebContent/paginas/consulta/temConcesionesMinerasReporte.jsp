<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Objectid 1</strong></td>
		<td><strong>Gml Id</strong></td>
		<td><strong>Objectid</strong></td>
		<td><strong>Codigou</strong></td>
		<td><strong>Zona</strong></td>
		<td><strong>Concesion</strong></td>
		<td><strong>Estado</strong></td>
		<td><strong>Tit Conces</strong></td>
		<td><strong>Naturaleza</strong></td>
		<td><strong>Fec Denu</strong></td>
		<td><strong>Hectarea</strong></td>
		<td><strong>Carta</strong></td>
		<td><strong>Nm Dist</strong></td>
		<td><strong>Nm Prov</strong></td>
		<td><strong>Nm Depa</strong></td>
		<td><strong>Shape Star</strong></td>
		<td><strong>Shape Stle</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemConcesionesMineras" var="reporte">
	<tr>
		<td>${reporte.intObjectid1}</td>
		<td>${reporte.strGmlId}</td>
		<td>${reporte.intObjectid}</td>
		<td>${reporte.strCodigou}</td>
		<td>${reporte.strZona}</td>
		<td>${reporte.strConcesion}</td>
		<td>${reporte.strEstado}</td>
		<td>${reporte.strTitConces}</td>
		<td>${reporte.strNaturaleza}</td>
		<td>${reporte.strFecDenu}</td>
		<td>${reporte.dblHectarea}</td>
		<td>${reporte.strCarta}</td>
		<td>${reporte.strNmDist}</td>
		<td>${reporte.strNmProv}</td>
		<td>${reporte.strNmDepa}</td>
		<td>${reporte.dblShapeStar}</td>
		<td>${reporte.dblShapeStle}</td>
	</tr>
</s:iterator>
</table>
