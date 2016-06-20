<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"
%><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"
%><%@ taglib prefix="s" uri="/struts-tags"
%><%response.setHeader("Content-type", "application/vnd.ms-excel; name='excel'");
response.setHeader("Content-Disposition", "filename=TemCarbonoEcozonas.csv");
response.setHeader("Pragma", "no-cache");
response.setHeader("Expires", "0");
%>Nombre Ecozona,Densidad de Carbono media estimada
<s:iterator value="#session.reporte.listTemCarbonoEcozonas" var="reporte">${reporte.strEcozona},${reporte.strTcHa}
</s:iterator>