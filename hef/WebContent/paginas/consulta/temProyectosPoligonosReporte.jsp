<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Sh Codigo</strong></td>
		<td><strong>Fc Comun</strong></td>
		<td><strong>Proyecto</strong></td>
		<td><strong>Inic Prog</strong></td>
		<td><strong>Referencia</strong></td>
		<td><strong>Detalle De</strong></td>
		<td><strong>Otros</strong></td>
		<td><strong>Meta</strong></td>
		<td><strong>Objetivos</strong></td>
		<td><strong>Fecha Inic</strong></td>
		<td><strong>Fecha Term</strong></td>
		<td><strong>Tipo De Da</strong></td>
		<td><strong>Cooperante</strong></td>
		<td><strong>Administra</strong></td>
		<td><strong>Usd</strong></td>
		<td><strong>Institucio</strong></td>
		<td><strong>Persona Co</strong></td>
		<td><strong>Cargo</strong></td>
		<td><strong>Contacto</strong></td>
		<td><strong>Direccion</strong></td>
		<td><strong>Instituc 1</strong></td>
		<td><strong>Obs</strong></td>
		<td><strong>Link</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemProyectosPoligonos" var="reporte">
	<tr>
		<td>${reporte.dblShCodigo}</td>
		<td>${reporte.strFcComun}</td>
		<td>${reporte.strProyecto}</td>
		<td>${reporte.strInicProg}</td>
		<td>${reporte.strReferencia}</td>
		<td>${reporte.strDetalleDe}</td>
		<td>${reporte.strOtros}</td>
		<td>${reporte.strMeta}</td>
		<td>${reporte.strObjetivos}</td>
		<td>${reporte.strFechaInic}</td>
		<td>${reporte.strFechaTerm}</td>
		<td>${reporte.strTipoDeDa}</td>
		<td>${reporte.strCooperante}</td>
		<td>${reporte.strAdministra}</td>
		<td>${reporte.dblUsd}</td>
		<td>${reporte.strInstitucio}</td>
		<td>${reporte.strPersonaCo}</td>
		<td>${reporte.strCargo}</td>
		<td>${reporte.strContacto}</td>
		<td>${reporte.strDireccion}</td>
		<td>${reporte.strInstituc1}</td>
		<td>${reporte.strObs}</td>
		<td>${reporte.strLink}</td>
	</tr>
</s:iterator>
</table>
