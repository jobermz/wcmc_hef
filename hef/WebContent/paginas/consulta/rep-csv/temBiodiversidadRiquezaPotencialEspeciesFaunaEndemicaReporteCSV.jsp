<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"
%><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"
%><%@ taglib prefix="s" uri="/struts-tags"
%><%response.setHeader("Content-type", "application/vnd.ms-excel; name='excel'");
response.setHeader("Content-Disposition", "filename=TemBiodiversidadRiquezaPotencialEspeciesFaunaEndemica.csv");
response.setHeader("Pragma", "no-cache");
response.setHeader("Expires", "0");
%>Valor promedio (Número de Espécies),Valor mínimo (Número de Espécies),Valor máximo (Número de Espécies)
${sessionScope.reporte.beanTemBiodiversidadRiquezaPotencialEspeciesFaunaEndemica.strValuePromedioSinDecimales},${sessionScope.reporte.beanTemBiodiversidadRiquezaPotencialEspeciesFaunaEndemica.strValueMinSinDecimales},${sessionScope.reporte.beanTemBiodiversidadRiquezaPotencialEspeciesFaunaEndemica.strValueMaxSinDecimales}
