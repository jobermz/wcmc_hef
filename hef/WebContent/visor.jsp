<!DOCTYPE html>
<html lang="es">
  <head>
	<meta http-equiv="content-type" content="text/html;charset=UTF-8">
	<meta name="viewport" content="width=600, initial-scale=0.5, maximum-scale=0.5">
	<link rel="shortcut icon" href="/favicon.png">
	
	<meta http-equiv="X-UA-Compatible" content="IE=Edge">
	
	<link rel="stylesheet" href="tools/bootstrap-3.3.2-dist/css/bootstrap.css" type="text/css">
	<link rel="stylesheet" href="tools/ol.v3.13/ol.css" type="text/css">
	<link rel="stylesheet" href="tools/font-awesome-4.5.0/css/font-awesome.min.css">
	<link rel="stylesheet" href="css/comun.css">
	<link rel="stylesheet" href="tools/jquery-ui-1.10.4.custom_cupertino/css/cupertino/jquery-ui-1.10.4.custom.css">
	
	<script src="tools/jquery-ui-1.10.4.custom_cupertino/js/jquery-1.10.2.js"></script>
	<script src="tools/jquery-ui-1.10.4.custom_cupertino/js/jquery-ui-1.10.4.custom.js"></script>
	<script src="tools/ol.v3.13/ol.js"></script>
	<script src="tools/bootstrap-3.3.2-dist/js/bootstrap.js"></script>
	<script src="js/visor/visorInicio.js"></script>
	<script src="js/visor/visorCapasBaseInicio.js"></script>
	
	<!-- DATATABLES -->
<!-- 	<script	src="tools/bootstrap-datatables/js/jquery.datatables.1.10.0.js" type="text/javascript"></script> -->
<!-- 	<script	src="tools/bootstrap-datatables/js/datatables.bootstrap.js" type="text/javascript"></script> -->
<!-- 	<script src="tools/bootstrap-datatables/js/datatables-responsive.js" type="text/javascript"></script> -->
	
	<title>.::Hef::.</title>
  </head>
  <body>
  
	<nav class="navbar navbar-fixed-top" role="navigation">
		<div style="position: absolute;float: right;top: 150px;right:30px;z-index: 20;color:white;"><i class="fa fa-globe fa-2x cursorPointer seleccionar-capas"></i></div>
		<div style="position: absolute;float: right;top: 185px;right:30px;z-index: 20;color:white;"><i class="fa fa-search fa-2x cursorPointer consulta-analitica"></i></div>
		<div style="position: absolute;float: right;top: 220px;right:30px;z-index: 20;color:white;"><i class="fa fa-upload fa-2x cursorPointer upload-capas"></i></div>
		
	</nav>
	<nav class="navbar navbar-fixed-top" role="navigation">
		<div class="navbar-top">
		
			<div id="container">
		
			<div class="row">
				<div class="col-sm-6 col-xs-6 ">
					<div class="pull-left ">
						<a href=""> <img
							src="/congresobiosfera/assets/img/logo.png"
							class="logo" alt=""
							data-src="/congresobiosfera/assets/img/logo_sernanp.jpg"
							data-src-retina="/congresobiosfera/assets/img/logo_sernanp.jpg"
							width="374" height="46">
						</a>
					</div>
				</div>
				<div class="col-sm-6 col-xs-6">
					<div class="pull-right">
						<ul class="orange nav navbar-nav ">
							<li class="dropdown user-dropdown"><a href="#"
								class="dropdown-toggle orange" data-toggle="dropdown"><i
									class="fa fa-user"></i> knowledge.system@gmail.com <b
									class="caret"></b></a>
								<ul class="dropdown-menu ">
									<!-- 							<li><a href="#"><i class="fa fa-user"></i> Perfil</a></li> -->
									<!-- 							<li><a href="#"><i class="fa fa-gear"></i> Configuración</a></li> -->
									<!-- 							<li class="divider"></li> -->
									<li><a href="salir.action"><i class="fa fa-power-off"></i>
											Cerrar Sesión</a></li>
								</ul></li>
						</ul>
					</div>
				</div>
<!-- 				<div style="position: absolute;top: 300px;right 50px;background-color: red;width: 50px;height: 20px;">HOLA DIV FLOTANTE</div> -->
			</div>
			</div>
			
		</div>
		
	</nav>

  
  
  
	<div class="container-fluid">
	  
      <div class="row-fluid">
        <div class="span12">
          <div id="map" class="map"></div>
        </div>
      </div>
	  
    </div>
	
	
<div class="modal fade seleccionar-capas-modal" tabindex="-1" role="dialog">
	<div class="modal-dialog modal-sm">
		<div class="modal-content" id="idDivEliminarVideo" >
			
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				<h4 class="modal-title">Seleccionar capas a visualizar</h4>
			</div>
			
			<div class="modal-body">
				<label for="idCapaDpto">Capa departamento</label>
				<input type="checkbox" id="idCapaDpto" name="capasBase" value="CapaDepartamento" onclick="marcarCapas();" class="capasBase">
				<div id="sliderCapaDepartamento" capa="CapaDepartamento" class="clsSlider"></div>
				<br/>
				<label for="idCapaProv">Capa provincia</label>
				<input type="checkbox" id="idCapaProv" name="capasBase" value="CapaProvincia" onclick="marcarCapas();" class="capasBase">
				<div id="sliderCapaProvincia" capa="CapaProvincia" class="clsSlider"></div>
				<br/>
				<label for="idCapaDist">Capa distrito</label>
				<input type="checkbox" id="idCapaDist" name="capasBase" value="CapaDistrito" onclick="marcarCapas();" class="capasBase">
				<div id="sliderCapaDistrito" capa="CapaDistrito" class="clsSlider"></div>
			</div>
			
			<div class="modal-footer">
				<button type="button" class="btn btn-default btnVideosInteractivos" data-dismiss="modal">Cancelar</button>
				<button type="button" class="btn btn-danger btnVideosInteractivos" id="idBtnEliminar">Aceptar</button>
			</div>
			
		</div>
	</div>
</div>
<div class="modal fade consulta-analitica-modal" tabindex="-1" role="dialog">
	<div class="modal-dialog modal-sm">
		<div class="modal-content" id="idDivEliminarVideo" >
			
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				<h4 class="modal-title">Consulta analitica</h4>
			</div>
			
<!-- 			<div class="modal-body"> -->
<!-- 				<p>Are you sure about this ?</p> -->
<!-- 			</div> -->
			
			<div class="modal-footer">
				<button type="button" class="btn btn-default btnVideosInteractivos" data-dismiss="modal">Cancelar</button>
				<button type="button" class="btn btn-danger btnVideosInteractivos" id="idBtnEliminar">Aceptar</button>
			</div>
			
		</div>
	</div>
</div>
<div class="modal fade upload-capas-modal" tabindex="-1" role="dialog">
	<div class="modal-dialog modal-sm">
		<div class="modal-content" id="idDivEliminarVideo" >
			
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				<h4 class="modal-title">Cargar archivos shape</h4>
			</div>
			
<!-- 			<div class="modal-body"> -->
<!-- 				<p>Are you sure about this ?</p> -->
<!-- 			</div> -->
			
			<div class="modal-footer">
				<button type="button" class="btn btn-default btnVideosInteractivos" data-dismiss="modal">Cancelar</button>
				<button type="button" class="btn btn-danger btnVideosInteractivos" id="idBtnEliminar">Aceptar</button>
			</div>
			
		</div>
	</div>
</div>

  </body>
</html>
