<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:select list="#session.listBasLimProvincia" name="centrar_dist_provincia" headerKey="" headerValue="-Seleccionar-" listKey="strIdprov" listValue="strNombprov" onchange="centrar_dist_upd_prov();"></s:select>
