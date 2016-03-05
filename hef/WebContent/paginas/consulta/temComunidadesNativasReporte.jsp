<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="0" style="width: 100%;">
	<tr>
		<td><strong>Objectid 1</strong></td>
		<td><strong>Gml Id</strong></td>
		<td><strong>Objectid</strong></td>
		<td><strong>Codigo</strong></td>
		<td><strong>Cod Bib</strong></td>
		<td><strong>Georefer</strong></td>
		<td><strong>Situacion</strong></td>
		<td><strong>Sector</strong></td>
		<td><strong>Zona</strong></td>
		<td><strong>Subzona</strong></td>
		<td><strong>Nombre</strong></td>
		<td><strong>Federacion</strong></td>
		<td><strong>Fam Lingui</strong></td>
		<td><strong>Etnia1</strong></td>
		<td><strong>Etnia2</strong></td>
		<td><strong>Poblacion</strong></td>
		<td><strong>Familias</strong></td>
		<td><strong>Escolares</strong></td>
		<td><strong>Rio</strong></td>
		<td><strong>Pueb Cerc</strong></td>
		<td><strong>Dpto</strong></td>
		<td><strong>Provincia</strong></td>
		<td><strong>Distrito</strong></td>
		<td><strong>Longitud</strong></td>
		<td><strong>Latitud</strong></td>
		<td><strong>Resol In</strong></td>
		<td><strong>Anoinscrip</strong></td>
		<td><strong>Titulo</strong></td>
		<td><strong>Resol Tit</strong></td>
		<td><strong>Anotitulo</strong></td>
		<td><strong>Area Total</strong></td>
		<td><strong>Area Titul</strong></td>
		<td><strong>Area Uso</strong></td>
		<td><strong>Area Fisc</strong></td>
		<td><strong>Area Prote</strong></td>
		<td><strong>Area Reser</strong></td>
		<td><strong>Area Demar</strong></td>
		<td><strong>Area Sig</strong></td>
		<td><strong>Perim Titu</strong></td>
		<td><strong>Resol Am1</strong></td>
		<td><strong>Titulo Am1</strong></td>
		<td><strong>Ar Tot Am1</strong></td>
		<td><strong>Ar Sig Am1</strong></td>
		<td><strong>Perim Am1</strong></td>
		<td><strong>Resol Am2</strong></td>
		<td><strong>Titulo Am2</strong></td>
		<td><strong>Ar Tot Am2</strong></td>
		<td><strong>Ar Sig Am2</strong></td>
		<td><strong>Perim Am2</strong></td>
		<td><strong>Primaria</strong></td>
		<td><strong>Bilingue</strong></td>
		<td><strong>Secundaria</strong></td>
		<td><strong>Pues Salud</strong></td>
		<td><strong>Cent Salud</strong></td>
		<td><strong>Prod Vent1</strong></td>
		<td><strong>Prod Vent2</strong></td>
		<td><strong>Prod Vent3</strong></td>
		<td><strong>Fuente</strong></td>
		<td><strong>Fecha</strong></td>
		<td><strong>Notas</strong></td>
		<td><strong>Shape Star</strong></td>
		<td><strong>Shape Stle</strong></td>
	</tr>
<s:iterator value="#session.reporte.listTemComunidadesNativas" var="reporte">
	<tr>
		<td>${reporte.intObjectid1}</td>
		<td>${reporte.strGmlId}</td>
		<td>${reporte.intObjectid}</td>
		<td>${reporte.strCodigo}</td>
		<td>${reporte.strCodBib}</td>
		<td>${reporte.strGeorefer}</td>
		<td>${reporte.strSituacion}</td>
		<td>${reporte.strSector}</td>
		<td>${reporte.strZona}</td>
		<td>${reporte.strSubzona}</td>
		<td>${reporte.strNombre}</td>
		<td>${reporte.strFederacion}</td>
		<td>${reporte.strFamLingui}</td>
		<td>${reporte.strEtnia1}</td>
		<td>${reporte.strEtnia2}</td>
		<td>${reporte.dblPoblacion}</td>
		<td>${reporte.dblFamilias}</td>
		<td>${reporte.dblEscolares}</td>
		<td>${reporte.strRio}</td>
		<td>${reporte.strPuebCerc}</td>
		<td>${reporte.strDpto}</td>
		<td>${reporte.strProvincia}</td>
		<td>${reporte.strDistrito}</td>
		<td>${reporte.strLongitud}</td>
		<td>${reporte.strLatitud}</td>
		<td>${reporte.strResolIn}</td>
		<td>${reporte.strAnoinscrip}</td>
		<td>${reporte.strTitulo}</td>
		<td>${reporte.strResolTit}</td>
		<td>${reporte.strAnotitulo}</td>
		<td>${reporte.dblAreaTotal}</td>
		<td>${reporte.dblAreaTitul}</td>
		<td>${reporte.dblAreaUso}</td>
		<td>${reporte.dblAreaFisc}</td>
		<td>${reporte.dblAreaProte}</td>
		<td>${reporte.dblAreaReser}</td>
		<td>${reporte.dblAreaDemar}</td>
		<td>${reporte.dblAreaSig}</td>
		<td>${reporte.dblPerimTitu}</td>
		<td>${reporte.strResolAm1}</td>
		<td>${reporte.strTituloAm1}</td>
		<td>${reporte.dblArTotAm1}</td>
		<td>${reporte.dblArSigAm1}</td>
		<td>${reporte.dblPerimAm1}</td>
		<td>${reporte.strResolAm2}</td>
		<td>${reporte.strTituloAm2}</td>
		<td>${reporte.dblArTotAm2}</td>
		<td>${reporte.dblArSigAm2}</td>
		<td>${reporte.dblPerimAm2}</td>
		<td>${reporte.strPrimaria}</td>
		<td>${reporte.strBilingue}</td>
		<td>${reporte.strSecundaria}</td>
		<td>${reporte.strPuesSalud}</td>
		<td>${reporte.strCentSalud}</td>
		<td>${reporte.strProdVent1}</td>
		<td>${reporte.strProdVent2}</td>
		<td>${reporte.strProdVent3}</td>
		<td>${reporte.strFuente}</td>
		<td>${reporte.strFecha}</td>
		<td>${reporte.strNotas}</td>
		<td>${reporte.dblShapeStar}</td>
		<td>${reporte.dblShapeStle}</td>
	</tr>
</s:iterator>
</table>
