<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"
%><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"
%><%@ taglib prefix="s" uri="/struts-tags"
%><%response.setHeader("Content-type", "application/vnd.ms-excel; name='excel'");
response.setHeader("Content-Disposition", "filename=TemIndiceImportanciaBiologica.csv");
response.setHeader("Pragma", "no-cache");
response.setHeader("Expires", "0");
%>Promedio,Umbral
<s:iterator value="#session.reporte.listTemIndiceImportanciaBiologica" var="reporte">${reporte.dblImpGlob4Decimales},${reporte.strDescUmbral}
</s:iterator>