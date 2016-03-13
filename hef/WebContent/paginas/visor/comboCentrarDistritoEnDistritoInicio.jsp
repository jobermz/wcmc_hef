<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:select list="#session.listBasLimDistritos" name="centrar_dist_distrito" headerKey="" headerValue="-Seleccionar-" listKey="strIddist" listValue="strNombdist" onchange="centrar_dist_upd_dist();"></s:select>
