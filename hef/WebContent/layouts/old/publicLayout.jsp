<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib 	uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib	prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c"	uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta http-equiv="content-type" content="text/html;charset=UTF-8">
	
	<meta http-Equiv="Cache-Control" Content="no-cache" />
    <meta http-Equiv="Pragma" Content="no-cache" />
    <meta http-Equiv="Expires" Content="0" />
    
	<meta name="viewport" content="width=600, initial-scale=0.5, maximum-scale=0.5">
	<meta name="description" content="">
	<meta name="author" content="">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
		
	<!-- Jquery -->
	<script src="herramientas/jquery-ui-1.10.4.custom_start/jquery-1.11.2.js"></script>
	
	<link type="text/css" href="css/jquery-ui-1.10.4.css" rel="stylesheet" />
	<script type="text/javascript" src="js/jquery-ui-1.10.4.js"></script>

	<script type="text/javascript" src="js/jquery.form.js"></script>

	<link type="text/css" media="all" href="css/generales.css" rel="stylesheet" />
	
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="herramientas/bootstrap-3.3.5-dist/css/bootstrap.css">
	
	<!-- DATATABLE -->
	<link href="assets/plugins/datatables/css/datatables.bootstrap.css" rel="stylesheet" type="text/css">

	<!-- Latest compiled and minified JavaScript -->
	<script src="herramientas/bootstrap-3.3.5-dist/js/bootstrap.js"></script>
	
	<link href="herramientas/font-awesome-4.3.0/css/font-awesome.min.css" rel="stylesheet" >
	
	<link href="herramientas/css/hoja_estilos.css" rel="stylesheet" >
	<link href="css/comun.css" rel="stylesheet" type="text/css" />
	
	
	<!-- DATATABLES -->
	<script	src="assets/plugins/datatables/js/jquery.datatables.1.10.0.js" type="text/javascript"></script>
	<script	src="assets/plugins/datatables/js/datatables.bootstrap.js" type="text/javascript"></script>
	
	<link href='http://fonts.googleapis.com/css?family=Droid+Sans' rel='stylesheet' type='text/css'>
	<link href='http://fonts.googleapis.com/css?family=Cabin' rel='stylesheet' type='text/css'>
	
	<script type="text/javascript" src="assets/js/core/sernanp.js"></script>
	
	<link href="herramientas/colpick/css/colpick.css" type="text/css" rel="stylesheet"/>
	<script src="herramientas/colpick/js/colpick.js" type="text/javascript"></script>
	
	<link href="herramientas/fluidvids/css/fluidvids.css" type="text/css" rel="stylesheet"/>
	<script src="herramientas/fluidvids/js/fluidvids.js" type="text/javascript"></script>
	
	<script src="js/comunVideos.js" type="text/javascript"></script>
	
	<!-- LISTA JAVSCR -->
	<tiles:useAttribute id="js_list" name="javscr" classname="java.util.List" />
	<c:forEach var="item" items="${js_list}">
		<script src="${item}" type="text/javascript"></script>
	</c:forEach>
	
	<tiles:useAttribute id="css" name="styles" classname="java.util.List" />
	<c:forEach var="item" items="${css}">
		<link rel="stylesheet" href="${item}" type="text/css" />
	</c:forEach>
	<script type="text/javascript">
	var strServerHost		= "";
	</script>
	<title>.:: Videos interactivos ::.</title>
</head>
<body>
	<tiles:insertAttribute name="content" />
	<div id="divModalmsg"></div>
</body>
</html>
