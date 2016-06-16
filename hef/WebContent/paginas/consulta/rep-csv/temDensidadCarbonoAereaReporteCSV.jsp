<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"
%><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"
%><%@ taglib prefix="s" uri="/struts-tags"
%><%response.setHeader("Content-type", "application/vnd.ms-excel; name='excel'");
response.setHeader("Content-Disposition", "filename=TemDensidadCarbonoAerea.csv");
response.setHeader("Pragma", "no-cache");
response.setHeader("Expires", "0");
%>Valor total (Toneladas/hectárea);Valor promedio (Toneladas/hect&aacute;rea);Valor mínimo (Toneladas/hectárea);Valor máxinimo (Toneladas/hectárea)
${sessionScope.reporte.beanTemDensidadCarbonoAerea.strValueSumaTotal2Decimales};${sessionScope.reporte.beanTemDensidadCarbonoAerea.strValuePromedio2Decimales};${sessionScope.reporte.beanTemDensidadCarbonoAerea.strValueMin2Decimales};${sessionScope.reporte.beanTemDensidadCarbonoAerea.strValueMax2Decimales}
