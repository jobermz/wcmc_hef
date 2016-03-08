<%@page import="wcmc.hef.general.util.CadenaUtil"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib 	uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib	prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c"	uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="es">
<%String strFecha	= CadenaUtil.getStrDateHoraMinutos(new Date());
String strTimeDay	= CadenaUtil.getDateHoraMinutosFromStr(strFecha).getTime() + "";
request.setAttribute("CURR_DAY", strTimeDay);
%>
<head>
	<meta http-equiv="content-type" content="text/html;charset=UTF-8">
	<meta name="viewport" content="width=600, initial-scale=0.5, maximum-scale=0.5">
	<link rel="shortcut icon" href="/favicon.png">
	
	<meta http-equiv="X-UA-Compatible" content="IE=Edge">
	
	<link rel="stylesheet" href="tools/bootstrap-3.3.2-dist/css/bootstrap.css" type="text/css">
	<link rel="stylesheet" href="tools/ol.v3.13/ol.css" type="text/css">
	<link rel="stylesheet" href="tools/font-awesome-4.5.0/css/font-awesome.min.css">
	<link rel="stylesheet" href="css/comun.css?day=${CURR_DAY}">
	<link rel="stylesheet" href="tools/jquery-ui-1.10.4.custom_cupertino/css/cupertino/jquery-ui-1.10.4.custom.css">
	
	<link href="tools/bootstrap-datatables/css/datatables.bootstrap.css" rel="stylesheet" type="text/css">
	<link href="tools/bootstrap-datatables/css/datatables-responsive.css" rel="stylesheet" type="text/css">
	<link href="css/configuracion/configuracionLayout.css?day=${CURR_DAY}" rel="stylesheet" type="text/css">
	
	
	<script src="tools/jquery-ui-1.10.4.custom_cupertino/js/jquery-1.10.2.js"></script>
	<script src="tools/jquery-ui-1.10.4.custom_cupertino/js/jquery-ui-1.10.4.custom.js"></script>
	<script src="tools/ol.v3.13/ol.js"></script>
	<script src="tools/bootstrap-3.3.2-dist/js/bootstrap.js"></script>
	<script src="tools/jquer-utils/jquery.form.js"></script>
	
	<!-- DATATABLES -->
	<script	src="tools/bootstrap-datatables/js/jquery.datatables.1.10.0.js" type="text/javascript"></script>
	<script	src="tools/bootstrap-datatables/js/datatables.bootstrap.js" type="text/javascript"></script>
	<script src="tools/bootstrap-datatables/js/datatables-responsive.js" type="text/javascript"></script>
	
	<tiles:useAttribute id="css" name="styles" classname="java.util.List" />
	<c:forEach var="item" items="${css}">
		<link rel="stylesheet" href="${item}?day=${CURR_DAY}" type="text/css" />
	</c:forEach>
	
	<!-- LISTA JAVSCR -->
	<tiles:useAttribute id="js_list" name="javscr"
		classname="java.util.List" />
	<c:forEach var="item" items="${js_list}">
		<script src="${item}?day=${CURR_DAY}" type="text/javascript"></script>
	</c:forEach>

	<title>.::Hef::.</title>
</head>
<body>
	<div class="bgXX"></div>
	<div class="jumbotronXX">
		
	<tiles:insertAttribute name="header" />
	
		<div style="margin-top: 85px;">
			<div class="container">
			<div class="row">
				<div class="col-sm-3">
					<tiles:insertAttribute name="menu" />
				</div>
				<div class="col-sm-9">
					<tiles:insertAttribute name="content" />
				</div>
			</div>
			</div>
		</div>

	</div>
	<br/><br/><br/><br/>
	<div id="divModalmsg"></div>
</body>
</html>
