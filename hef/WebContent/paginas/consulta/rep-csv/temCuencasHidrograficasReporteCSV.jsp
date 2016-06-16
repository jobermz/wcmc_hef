<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"
%><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"
%><%@ taglib prefix="s" uri="/struts-tags"
%><%response.setHeader("Content-type", "application/vnd.ms-excel; name='excel'");
response.setHeader("Content-Disposition", "filename=TemCuencasHidrograficas.csv");
response.setHeader("Pragma", "no-cache");
response.setHeader("Expires", "0");
%>Cuenca
<s:iterator value="#session.reporte.listTemCuencasHidrograficas" var="reporte">${reporte.strNombre}
</s:iterator>