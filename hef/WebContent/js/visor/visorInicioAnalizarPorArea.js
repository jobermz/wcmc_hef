function iniciarAnalizarPorArea() {
	$('.analizar-por-area').click(analizarPorArea);
	
	$('.btnProcesarAnalizarPorArea').click(procesarAnalizarPorArea);
	$('.btnSeleccionarTodasCapasAPA').click(seleccionarTodosAPA);
	$('.btnEnviarShapefile').click(cargarPoligonoDesdeShapefile);
	$('.clsGenerarReporteAnalitico').click(menucontextualProcesarReporteAnalitico);
	
	$("#idMenuLimiparAPA").click(limpiarCapasSeleccionadasAPA);
	
}
//////////////////////////////////////////////////////////////////

function analizarPorArea() {
	$('.analizar-por-area-modal').off('shown.bs.modal');
	$('.analizar-por-area-modal').off('hidden.bs.modal');
	$('.analizar-por-area-modal').on('shown.bs.modal', function (e) {
		inicializarSeleccionadasActivasAPA();
	});
	$('.analizar-por-area-modal').on('hidden.bs.modal', function (e) {
	});
	$('.analizar-por-area-modal').modal('show');
}
function inicializarSeleccionadasActivasAPA() {
	if(listado_idCapaIdentAPA!=null && listado_idCapaIdentAPA.length > 0) {
		$(".capasBaseAPA").each(function(index) {
			$(this).prop("checked", false);
		});
		for(var i = 0;i < listado_idCapaIdentAPA.length;i++) {
			$("#idCapaAnalisPorArea"+listado_idCapaIdentAPA[i]).prop("checked", true);
		}
	} else if(listado_idCapaIdentACL!=null && listado_idCapaIdentACL.length > 0) {
		$(".capasBaseAPA").each(function(index) {
			$(this).prop("checked", false);
		});
		for(var i = 0;i < listado_idCapaIdentACL.length;i++) {
			$("#idCapaAnalisPorArea"+listado_idCapaIdentACL[i]).prop("checked", true);
		}
	} else {
		$(".capasBaseAPA").each(function(index) {
			$(this).prop("checked", false);
		});
		$(".capasBase").each(function(index) {
			if($(this).is(':checked')) {
				var srlIdCapa	= $(this).attr("value");
				$("#idCapaAnalisPorArea"+srlIdCapa).prop("checked", true);
			}
		});
	}
	guardarCapasSeleccionadasAPA();
}
var listado_idCapaIdentAPA		= null;
function guardarCapasSeleccionadasAPA() {
	listado_idCapaIdentAPA			= new Array();
	$(".capasBaseAPA").each(function(index) {
		if($(this).is(':checked')) {
			var srlIdCapa		= $(this).attr("id-capa");
			listado_idCapaIdentAPA[listado_idCapaIdentAPA.length]	= srlIdCapa;
		}
	});
	$('.badgeCustomAPA').html(listado_idCapaIdentAPA.length);
	$('.badgeCustomAPA').css("display","");
	$(".clsPanelGrupoCapasAPA").each(function(index) {
		var contador	= 0;
		$(this).find(".capasBaseAPA").each(function(index) {
			if($(this).is(':checked')) {
				contador++;
			}
		});
		if(contador > 0) {
			$(this).find(".badgeCustomPanelGrupoCapaAPA").html(contador);
			$(this).find(".badgeCustomPanelGrupoCapaAPA").css("display", "");
		} else {
			$(this).find(".badgeCustomPanelGrupoCapaAPA").html("");
			$(this).find(".badgeCustomPanelGrupoCapaAPA").css("display", "none");
		}
	});
	$(".clsPanelGrupoCapasMainAPA").each(function(index) {
		var contador	= 0;
		$(this).find(".capasBaseAPA").each(function(index) {
			if($(this).is(':checked')) {
				contador++;
			}
		});
		if(contador > 0) {
			$(this).find(".badgeCustomPanelGrupoCapaMainAPA").html(contador);
			$(this).find(".badgeCustomPanelGrupoCapaMainAPA").css("display", "");
		} else {
			$(this).find(".badgeCustomPanelGrupoCapaMainAPA").html("");
			$(this).find(".badgeCustomPanelGrupoCapaMainAPA").css("display", "none");
		}
	});
}
function limpiarCapasSeleccionadasAPA() {
	listado_idCapaIdentAPA	= null;
	$('.badgeCustomAPA').css("display","none");
}
//////////////////////////////////////////////////////////////////
function seleccionarTodosAPA() {
	var checkedTodos	= true;
	$("input[name=capaAnalisPorArea]").each(function(index) {
		checkedTodos	&= $(this).is(':checked');
	});
	$("input[name=capaAnalisPorArea]").each(function(index) {
		$(this).prop('checked', !checkedTodos);
	});
	guardarCapasSeleccionadasAPA();
}
function procesarAnalizarPorArea(wkt, idCapa) {
	blockui();
	var srlIdCapas="";
	$("input[name=capaAnalisPorArea]").each(function(index) {
		var input	= $(this);
		console.log("+ input="+input.val()+" isChecked="+input.is(':checked'));
		if(input.is(':checked')) {
			if(srlIdCapas.length>0) {
				srlIdCapas+=",";
			}
			srlIdCapas+=input.val();
		}
	});
	var param	= null;
	if(wkt) {
		param	= {
				listSrlIdCapaConsulta: srlIdCapas,
				strPoligonoConsulta: wkt
			};
	} else if(idCapa) {
		param	= {
				listSrlIdCapaConsulta: srlIdCapas,
				strIdCapaConsulta: idCapa
			};
	}
	$.post('consultaCapas.action', param, function(datos) {
		$('.reporte-capas-modal').off('shown.bs.modal');
		$('.reporte-capas-modal').off('hidden.bs.modal');
		$('.reporte-capas-modal').on('shown.bs.modal', function (e) {
		});
		$('.reporte-capas-modal').on('hidden.bs.modal', function (e) {
		});
		$("#idDivReporte").html(datos);
		$('.reporte-capas-modal').modal('show');
		unblockui();
	});
}
function mostrarDetaRepo(strPagRepo, idDivDest, _this) {
	$(".list-group-item").each(function(index) {
		$(this).removeClass("active");
	});
	$(_this).addClass("active");
	$.post("paginas/consulta/"+strPagRepo, null, function(datos) {
		$("#"+idDivDest).html(datos);
	});
}
function seleccionarAreaDesdeShapefile() {
	$('.cargar-shapefile-modal').off('shown.bs.modal');
	$('.cargar-shapefile-modal').off('hidden.bs.modal');
	$('.cargar-shapefile-modal').on('shown.bs.modal', function (e) {
	});
	$('.cargar-shapefile-modal').on('hidden.bs.modal', function (e) {
	});
	$('.analizar-por-area-modal').modal('hide');
	$('.cargar-shapefile-modal').modal('show');
}
var listAreaShapeSeleccionar	= null;
function cargarPoligonoDesdeShapefile() {
	blockui();
	$('#idFrmSelAreaShapefile').unbind("submit");
	$('#idFrmSelAreaShapefile').submit(function() {
		$(this).ajaxSubmit({
			url:	   "agregarShapeAPA.action",
			type:	  "POST",
			dataType:  "json",
			success:	   function(datos) {
				sessionFinalizoJson(datos);
				
				if(datos.actionErrors.length > 0) {
					mostrarMensajesErrorStruts(datos.actionErrors);
					mostrarMensajesStruts([]);
					unblockui();
				} else {
					mostrarMensajesErrorStruts([]);
					mostrarMensajesStruts(datos.actionMessages);
					
					if(datos.listAreaShapeSeleccionar && datos.listAreaShapeSeleccionar.length > 1) {
						listAreaShapeSeleccionar	= datos.listAreaShapeSeleccionar;
						var htmlDialog	= "";
						htmlDialog	+= "<div style=\"height:81px;overflow-y: scroll;\">";
						for(var i = 0;i < listAreaShapeSeleccionar.length;i++) {
							//listAreaShapeSeleccionar[i].geometry
							//listAreaShapeSeleccionar[i].image
							htmlDialog	+= "<a href='#'>\n";
							htmlDialog	+= " <img height=\"80px\" src='"+listAreaShapeSeleccionar[i].image+"' onclick=\"seleccionarShapeimage('"+i+"');\" style=\"cursor: pointer;\" />\n";
							htmlDialog	+= "</a>\n";
						}
						htmlDialog	+= "</div>";
						
						$("#idDivSeleccionarShapeHtml").html(htmlDialog);
						
						//Debe elegir entre una de las geometrias encontradas
						$("input[name=shapefile]").val("");
						unblockui();
					} else if(datos.listAreaShapeSeleccionar && datos.listAreaShapeSeleccionar.length == 1) {
						//TODO Seleccionar y procesar la consulta
						var labelJsonStrGisArea	= listAreaShapeSeleccionar[0].geometry;
//						alert("Procesar la consulta listAreaShapeSeleccionar[i].geometry:"+labelJsonStrGisArea);
						console.log("Fin cargar shapefile");
						console.log("WKT="+labelJsonStrGisArea);
						$('.cargar-shapefile-modal').modal('hide');
						unblockui();
						procesarAnalizarPorArea(labelJsonStrGisArea);
						$("input[name=shapefile]").val("");
					} else {
						/*
						var labelJsonStrGisArea	= datos.edicion_incidenciasVO.strGisArea;
						actualizarMapaGisAreaWKT(labelJsonStrGisArea);
						actualizarFormDesdeGisArea();
						*/
						$('.cargar-shapefile-modal').modal('hide');
						mostrarMensajesErrorStruts(["No se encontraron datos para mostrar"]);
						$("input[name=shapefile]").val("");
						unblockui();
					}
				}
				
			}
		});
		return false;
	});
	$('#idFrmSelAreaShapefile').submit();
	return false;
}
function seleccionarShapeimage(i) {
	var labelJsonStrGisArea	= listAreaShapeSeleccionar[i].geometry;
//	alert("listAreaShapeSeleccionar[i].geometry:"+labelJsonStrGisArea);
	console.log("Fin seleccionar shapefile");
	console.log("WKT="+labelJsonStrGisArea);
	$('.cargar-shapefile-modal').modal('hide');
	procesarAnalizarPorArea(labelJsonStrGisArea);
}

var activarSeleccionarAreaDesdeMapa	= false;
function seleccionarAreaDesdeMapa() {
	$('.analizar-por-area-modal').modal('hide');
//	alert("Pendiente activar la vista grafica para seleccionar poligono");
	activarSeleccionarAreaDesdeMapa	= true;
//	$(".clsTituloCapaActiva").css("display","");
}
var arrIntIdCapaSeleAreaDesdeMapa = ["9","1","3","2","12","18","19","20","21","22","23","47","41","40","39","38","37","34","35","36","24","25","26","27","28","29","30","31","33"];
function contains(a, obj) {
    for (var i = 0; i < a.length; i++) {
        if (a[i] === obj) {
            return true;
        }
    }
    return false;
}
function eventoMenuContextualSeleccionarAreaDesdeMapa(pixel, event) {
	//$('.analizar-por-area-modal').modal('hide');
//	alert("Pendiente activar la vista grafica para seleccionar poligono");
	{
		if(!intIdCapaActiva || intIdCapaActiva == "") {
			mostrarMensajesErrorStruts(["Debe seleccionar por lo menos una capa como activa"]);
			return;
		}
		//<input type="checkbox" id="idCapaAnalisPorArea${capasBase.srlIdCapa}" name="capaAnalisPorArea" value="${capasBase.srlIdCapa}" class="capasBaseAPA" es-selec-mapa-acl="${capasBase.strEsSelecApaBoolean}
		if(activarSeleccionarAreaDesdeMapa) {
			var esSelecMapaAcl	= $("#idCapaAnalisPorArea"+intIdCapaActiva).attr("es-selec-mapa-acl");
			//if(!contains(arrIntIdCapaSeleAreaDesdeMapa, intIdCapaActiva)) {
			if(esSelecMapaAcl == "true") {
				$(".clsGenerarReporteAnalitico").css("display", "");
			} else {
				$(".clsGenerarReporteAnalitico").css("display", "none");
			}
		} else {
			$(".clsGenerarReporteAnalitico").css("display", "none");
		}
		
		var coord	= map.getCoordinateFromPixel(pixel);
		var point	= new ol.geom.Point(coord);
		var feature = new ol.Feature({geometry: point});
		var format	= new ol.format.WKT();
		var wkt		= format.writeFeature(feature, {
			dataProjection: 'EPSG:4326',
			featureProjection: 'EPSG:3857'
		});
		console.log("WKT="+wkt);
		
		var param	= null;
		param		= {
				strPoligonoConsulta: wkt,
				listSrlIdCapaConsulta: intIdCapaActiva
		};
		$.post("consultaCapasRightClick.action", param, function(datos) {
			$(".clsTableMetadataMenucontextual").html(datos);
		});
		$(".clsTableMetadataMenucontextual").html("<table class=\"clsTableMetadataMenucontextual\"><tr><td><img src=\"image/busy.gif\"/></td></tr></table>");
		$('#idDivRightClick').css("display", "table-row");
		$('#idDivRightClick').css("left", event.pageX);
		$('#idDivRightClick').css("top", event.pageY);
	}
}
function menucontextualProcesarReporteAnalitico() {
	activarSeleccionarAreaDesdeMapa	= false;
	procesarAnalizarPorArea(null, intIdCapaActiva);
//	$(".clsTituloCapaActiva").css("display","none");
}