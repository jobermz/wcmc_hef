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
		
	<!-- Jquery -->
	<script src="<%=request.getContextPath()%>/herramientas/jquery-ui-1.10.4.custom_start/jquery-1.11.2.js"></script>
	
	<link type="text/css" href="<%=request.getContextPath()%>/css/jquery-ui-1.10.4.css" rel="stylesheet" />
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-ui-1.10.4.js"></script>

	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.form.js"></script>

	<link type="text/css" media="all" href="<%=request.getContextPath()%>/css/generales.css" rel="stylesheet" />
	
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="<%=request.getContextPath()%>/herramientas/bootstrap-3.3.5-dist/css/bootstrap.css">
	
	<!-- DATATABLE -->
	<link href="<%=request.getContextPath()%>/assets/plugins/datatables/css/datatables.bootstrap.css" rel="stylesheet" type="text/css">
<%-- 	<link href="<%=request.getContextPath()%>/assets/plugins/datatables/css/datatables-responsive.css" rel="stylesheet" type="text/css"> --%>

	<!-- Latest compiled and minified JavaScript -->
	<script src="<%=request.getContextPath()%>/herramientas/bootstrap-3.3.5-dist/js/bootstrap.js"></script>
	
	<link href="<%=request.getContextPath()%>/herramientas/font-awesome-4.3.0/css/font-awesome.min.css" rel="stylesheet" >
	
	<link href="<%=request.getContextPath()%>/herramientas/css/hoja_estilos.css" rel="stylesheet" >
	<link href="<%=request.getContextPath()%>/css/comun.css" rel="stylesheet" type="text/css" />
	
	<!-- DATATABLES -->
	<script	src="<%=request.getContextPath()%>/assets/plugins/datatables/js/jquery.datatables.1.10.0.js" type="text/javascript"></script>
	<script	src="<%=request.getContextPath()%>/assets/plugins/datatables/js/datatables.bootstrap.js" type="text/javascript"></script>
<%-- 	<script src="<%=request.getContextPath()%>/assets/plugins/datatables/js/datatables-responsive.js" type="text/javascript"></script> --%>
	
<!-- 	<link href='http://fonts.googleapis.com/css?family=Droid+Sans' rel='stylesheet' type='text/css'> -->
<!-- 	<link href='http://fonts.googleapis.com/css?family=Cabin' rel='stylesheet' type='text/css'> -->
	
	<link href='https://fonts.googleapis.com/css?family=Titillium+Web' rel='stylesheet' type='text/css'>
	<link href='https://fonts.googleapis.com/css?family=Abel' rel='stylesheet' type='text/css'>
	
	<script type="text/javascript" src="<%=request.getContextPath()%>/assets/js/core/sernanp.js"></script>
	
<%-- 	<script type="text/javascript" src="<%=request.getContextPath()%>/js/bootstrap-timepicker.js"></script> --%>
<%-- 	<link href="<%=request.getContextPath()%>/css/bootstrap-timepicker.css" rel="stylesheet" type="text/css" /> --%>
	
	<link href="<%=request.getContextPath()%>/herramientas/colpick/css/colpick.css" type="text/css" rel="stylesheet"/>
	<script src="<%=request.getContextPath()%>/herramientas/colpick/js/colpick.js" type="text/javascript"></script>
	
	<link href="<%=request.getContextPath()%>/herramientas/fluidvids/css/fluidvids.css" type="text/css" rel="stylesheet"/>
	<script src="<%=request.getContextPath()%>/herramientas/fluidvids/js/fluidvids.js" type="text/javascript"></script>
	
	<link href="<%=request.getContextPath()%>/herramientas/iframe-resp/css/resp-ifr.css" type="text/css" rel="stylesheet"/>
	
	<script src="<%=request.getContextPath()%>/js/comunVideos.js" type="text/javascript"></script>
	
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
	var strServerHost		= "<%="http://"+request.getServerName() + ":" + request.getServerPort() + request.getContextPath()%>/";
	</script>

	<title>.:: Videos interactivos ::.</title>
</head>
<body style="background-color: #F5F6F8;">
	<tiles:insertAttribute name="header" />
	<div style="background-color: #384756;max-width: 250px; position: fixed;bottom:0px;left: 0px;height: 100%;vertical-align: bottom;">
		<div class="container-fluid" style="color: white;height: 100%;font-size: 18px;margin-top: 105px;">
			<center>

<%-- 				    ${USUARIO_ACTUAL.strNombres} <img src="descargarAdjunto.action?strIdAdjunto=${USUARIO_ACTUAL.strAdjuntoFoto}" class="img-circle" style="max-height: 70px;max-width: 71px;"/><span class="caret"></span> --%>

				<p class="imgHand">
					<div style="border-radius:50%;border: 2px solid #5EC5F4; height: 110px;width: 110px;">
						<img alt="" src="descargarAdjunto.action?strIdAdjunto=${USUARIO_ACTUAL.strAdjuntoFoto}" class="img-circle" style="position:relative;top:8px;left:0px; height: 89px;width: 89px;"/>
					</div>
				</p>
<!-- 				<p class="imgHand"><img alt="" src="img-face/personaje_inferior.png"/></p> -->
				<p class="imgHand">${USUARIO_ACTUAL.strNombreCompleto}</p>
				<p><img alt="" src="img-face/barra_color.png" style="max-width: 180px;"/></p>
				<p class="imgHand" onclick="document.location.href='home.action';"><img alt="" src="img-face/inicio.png"/></p>
				<p class="imgHand" onclick="document.location.href='home.action';">Inicio</p>
				<p class="imgHand" onclick="document.location.href='homeCuentaUsuarioEditar.action?buscar_seleccion_id=${sessionScope.USUARIO_ACTUAL.srlId}';"><img alt="" src="img-face/mi_cuenta.png"/></p>
				<p class="imgHand" onclick="document.location.href='homeCuentaUsuarioEditar.action?buscar_seleccion_id=${sessionScope.USUARIO_ACTUAL.srlId}';">Mi cuenta</p>
				<p class="imgHand"><img alt="" src="img-face/reproducir.png" onclick="nuevo_video();return false;"/></p>
				<p class="imgHand" onclick="nuevo_video();return false;">Agregar video</p>
				<p><img alt="" src="img-face/barra_color.png" style="max-width: 180px;"/></p>
			</center>
		</div>
	</div>
	<div style="margin-top: 85px;">
		<div class="container-fluid" style="padding-left:0px; background-color: #F5F6F8;">
			<div class="row">
				<div class="col-md-3">
				</div>
				<div class="col-md-9" role="main" style="max-width: 930px;">
					<tiles:insertAttribute name="content" />
				</div>
			</div>
		</div>
	
	</div>
	<div id="divModalmsg"></div>
</body>
</html>
