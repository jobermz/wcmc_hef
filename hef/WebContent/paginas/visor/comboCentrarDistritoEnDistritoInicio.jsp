<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:select list="#session.listCapaDistrito" name="centrar_dist_distrito" headerKey="" headerValue="-Seleccionar-" listKey="strIdDistrito" listValue="strNombreDistrito" onchange="centrar_dist_upd_dist();"></s:select>
