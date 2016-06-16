<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"
%><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"
%><%@ taglib prefix="s" uri="/struts-tags"
%><%response.setHeader("Content-type", "application/vnd.ms-excel; name='excel'");
response.setHeader("Content-Disposition", "filename=TemPerdidaBosque20012014.csv");
response.setHeader("Pragma", "no-cache");
response.setHeader("Expires", "0");
%>Valor mínimo;Valor máxinimo
${sessionScope.reporte.beanTemPerdidaBosque20012014.strValueMin};${sessionScope.reporte.beanTemPerdidaBosque20012014.strValueMax}
