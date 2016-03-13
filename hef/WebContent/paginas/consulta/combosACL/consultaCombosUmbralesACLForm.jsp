<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:select id="idValorFiltroUmbralPre" name="valorFiltroUmbralPre" list="#session.listCapaUmbral" headerKey="" headerValue="-Seleccionar-" listKey="srlIdCapaUmbral" listValue="%{strNombre+' ['+strValorMinimo+' - '+strValorMaximo+']'}">
</s:select>
