<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Objectid 1</strong></td>
		<td><strong>Objectid</strong></td>
		<td><strong>Sitrecid</strong></td>
		<td><strong>Region</strong></td>
		<td><strong>Country</strong></td>
		<td><strong>Iso3</strong></td>
		<td><strong>Natname</strong></td>
		<td><strong>Intname</strong></td>
		<td><strong>Fincode</strong></td>
		<td><strong>Sitlat</strong></td>
		<td><strong>Sitlong</strong></td>
		<td><strong>Sitarea</strong></td>
		<td><strong>Protect</strong></td>
		<td><strong>Num Pas</strong></td>
		<td><strong>Ibastatus</strong></td>
		<td><strong>Kbastatus</strong></td>
		<td><strong>Azestatus</strong></td>
		<td><strong>Createdby</strong></td>
		<td><strong>Addedby</strong></td>
		<td><strong>Addeddate</strong></td>
		<td><strong>Changeby</strong></td>
		<td><strong>Changedate</strong></td>
		<td><strong>Source</strong></td>
		<td><strong>Deltxt</strong></td>
		<td><strong>Delgeom</strong></td>
		<td><strong>Marineiba</strong></td>
		<td><strong>Shape Leng</strong></td>
		<td><strong>Shape Le 1</strong></td>
		<td><strong>Shape Area</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemClaveBiodiversidad" var="reporte">
	<tr>
		<td>${reporte.intObjectid1}</td>
		<td>${reporte.intObjectid}</td>
		<td>${reporte.intSitrecid}</td>
		<td>${reporte.strRegion}</td>
		<td>${reporte.strCountry}</td>
		<td>${reporte.strIso3}</td>
		<td>${reporte.strNatname}</td>
		<td>${reporte.strIntname}</td>
		<td>${reporte.strFincode}</td>
		<td>${reporte.dblSitlat}</td>
		<td>${reporte.dblSitlong}</td>
		<td>${reporte.intSitarea}</td>
		<td>${reporte.strProtect}</td>
		<td>${reporte.intNumPas}</td>
		<td>${reporte.strIbastatus}</td>
		<td>${reporte.strKbastatus}</td>
		<td>${reporte.strAzestatus}</td>
		<td>${reporte.strCreatedby}</td>
		<td>${reporte.strAddedby}</td>
		<td>${reporte.dteAddeddate}</td>
		<td>${reporte.strChangeby}</td>
		<td>${reporte.dteChangedate}</td>
		<td>${reporte.strSource}</td>
		<td>${reporte.strDeltxt}</td>
		<td>${reporte.strDelgeom}</td>
		<td>${reporte.strMarineiba}</td>
		<td>${reporte.dblShapeLeng}</td>
		<td>${reporte.dblShapeLe1}</td>
		<td>${reporte.dblShapeArea}</td>
	</tr>
</s:iterator>
</table>
