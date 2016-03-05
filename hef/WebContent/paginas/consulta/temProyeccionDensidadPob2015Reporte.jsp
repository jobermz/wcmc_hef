<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Iddpto</strong></td>
		<td><strong>Nombdep</strong></td>
		<td><strong>Idprov</strong></td>
		<td><strong>Nombprov</strong></td>
		<td><strong>Iddist</strong></td>
		<td><strong>Nombdist</strong></td>
		<td><strong>Dcto</strong></td>
		<td><strong>Ley</strong></td>
		<td><strong>Fecha</strong></td>
		<td><strong>Nom Cap</strong></td>
		<td><strong>Sup Contin</strong></td>
		<td><strong>Sup Insula</strong></td>
		<td><strong>Sup Lacust</strong></td>
		<td><strong>Sup Ins D</strong></td>
		<td><strong>Ubigeo</strong></td>
		<td><strong>Ubigeo 1</strong></td>
		<td><strong>Distrito</strong></td>
		<td><strong>Total 2015</strong></td>
		<td><strong>Area</strong></td>
		<td><strong>Pop Dens</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemProyeccionDensidadPob2015" var="reporte">
	<tr>
		<td>${reporte.strIddpto}</td>
		<td>${reporte.strNombdep}</td>
		<td>${reporte.strIdprov}</td>
		<td>${reporte.strNombprov}</td>
		<td>${reporte.strIddist}</td>
		<td>${reporte.strNombdist}</td>
		<td>${reporte.strDcto}</td>
		<td>${reporte.strLey}</td>
		<td>${reporte.strFecha}</td>
		<td>${reporte.strNomCap}</td>
		<td>${reporte.dblSupContin}</td>
		<td>${reporte.dblSupInsula}</td>
		<td>${reporte.dblSupLacust}</td>
		<td>${reporte.dblSupInsD}</td>
		<td>${reporte.strUbigeo}</td>
		<td>${reporte.strUbigeo1}</td>
		<td>${reporte.strDistrito}</td>
		<td>${reporte.strTotal2015}</td>
		<td>${reporte.dblArea}</td>
		<td>${reporte.dblPopDens}</td>
	</tr>
</s:iterator>
</table>
