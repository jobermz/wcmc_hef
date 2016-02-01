<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib 	uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib	prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c"	uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta http-equiv="content-type" content="text/html;charset=UTF-8">
	<meta http-equiv="pragma" content="no-cache">
	<meta name="viewport" content="width=600, initial-scale=0.5, maximum-scale=0.5">
	<meta name="description" content="">
	<meta name="author" content="">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
<%-- 	<link rel="shortcut icon" href="<%=request.getContextPath()%>/assets/img/favicon.png"> --%>
	<!--
	<script src="<%=request.getContextPath()%>/herramientas/jquery-ui-1.10.4.custom_start/jquery-1.11.2.js"></script>
	<link href="<%=request.getContextPath()%>/herramientas/jquery-ui-1.11.4.custom_cupertino/jquery-ui.css" rel="stylesheet">
	<script src="<%=request.getContextPath()%>/herramientas/jquery-ui-1.11.4.custom_cupertino/jquery-ui.js"></script>
	
	<link rel="stylesheet" href="<%=request.getContextPath()%>/herramientas/bootstrap-3.3.5-dist/css/bootstrap.css">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/herramientas/css/bootstrap_bootswatch_theme.css">
	
	<script src="<%=request.getContextPath()%>/herramientas/bootstrap-3.3.5-dist/js/bootstrap.js"></script>
	
	<link href="<%=request.getContextPath()%>/herramientas/font-awesome-4.3.0/css/font-awesome.min.css" rel="stylesheet" >
	
	<link href="<%=request.getContextPath()%>/herramientas/css/hoja_estilos.css" rel="stylesheet" >
	<link href="<%=request.getContextPath()%>/css/comun.css" rel="stylesheet" type="text/css" />
	
	<link href='http://fonts.googleapis.com/css?family=Droid+Sans' rel='stylesheet' type='text/css'>
	<link href='http://fonts.googleapis.com/css?family=Cabin' rel='stylesheet' type='text/css'>
	-->
	
	
	<script src="<%=request.getContextPath()%>/herramientas/jquery-ui-1.10.4.custom_start/jquery-1.11.2.js"></script>
	
	<link type="text/css" href="<%=request.getContextPath()%>/css/jquery-ui-1.10.4.css" rel="stylesheet" />
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-ui-1.10.4.js"></script>

	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.form.js"></script>

	<link type="text/css" media="all" href="<%=request.getContextPath()%>/css/generales.css" rel="stylesheet" />
	
	<link rel="stylesheet" href="<%=request.getContextPath()%>/herramientas/bootstrap-3.3.5-dist/css/bootstrap.css">
	
	<link href="<%=request.getContextPath()%>/assets/plugins/datatables/css/datatables.bootstrap.css" rel="stylesheet" type="text/css">
	
	<script src="<%=request.getContextPath()%>/herramientas/bootstrap-3.3.5-dist/js/bootstrap.js"></script>
	
	<link href="<%=request.getContextPath()%>/herramientas/font-awesome-4.3.0/css/font-awesome.min.css" rel="stylesheet" >
	
	<link href="<%=request.getContextPath()%>/herramientas/css/hoja_estilos.css" rel="stylesheet" >
	<link href="<%=request.getContextPath()%>/css/comun.css" rel="stylesheet" type="text/css" />
	
	
	<script	src="<%=request.getContextPath()%>/assets/plugins/datatables/js/jquery.datatables.1.10.0.js" type="text/javascript"></script>
	<script	src="<%=request.getContextPath()%>/assets/plugins/datatables/js/datatables.bootstrap.js" type="text/javascript"></script>
	
	<link href='https://fonts.googleapis.com/css?family=Titillium+Web' rel='stylesheet' type='text/css'>
	<link href='https://fonts.googleapis.com/css?family=Abel' rel='stylesheet' type='text/css'>
	<link href='https://fonts.googleapis.com/css?family=Fauna+One' rel='stylesheet' type='text/css'>
	
	<script type="text/javascript" src="<%=request.getContextPath()%>/assets/js/core/sernanp.js"></script>
	
	<link href="<%=request.getContextPath()%>/herramientas/colpick/css/colpick.css" type="text/css" rel="stylesheet"/>
	<script src="<%=request.getContextPath()%>/herramientas/colpick/js/colpick.js" type="text/javascript"></script>
	
	<script src="<%=request.getContextPath()%>/js/comunVideos.js" type="text/javascript"></script>
	
	<!-- LISTA JAVSCR -->
	<tiles:useAttribute id="js_list" name="javscr"
		classname="java.util.List" />
	<c:forEach var="item" items="${js_list}">
		<script src="${item}" type="text/javascript"></script>
	</c:forEach>
	
	<tiles:useAttribute id="css" name="styles" classname="java.util.List" />
	<c:forEach var="item" items="${css}">
		<link rel="stylesheet" href="${item}" type="text/css" />
	</c:forEach>

	<title>.:: Videos interactivos ::.</title>
</head>
<body>
	<div style="margin-top: 110px;">
	<tiles:insertAttribute name="content" />
	</div>
	<div id="divModalmsg"></div>
</body>
</html>
