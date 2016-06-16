function iniciarAnalizarPorArea() {
	//$('.analizar-por-area').click(analizarPorArea);
	
	//$('.btnProcesarAnalizarPorArea').click(procesarAnalizarPorArea);
	//$('.btnSeleccionarTodasCapasAPA').click(seleccionarTodosAPA);
	$('.btnEnviarShapefile').click(cargarPoligonoDesdeShapefile);
	$('.clsGenerarReporteAnalitico').click(menucontextualProcesarReporteAnalitico);
	
	//$("#idMenuLimiparAPA").click(limpiarCapasSeleccionadasAPA);
	
}
//////////////////////////////////////////////////////////////////

function procesarAnalizarPorArea(wkt, idCapa) {
	cerrarTodosPopover();
	/*
	if(wkt != null || idCapa != null) {
		procesarCriterioLogicoExecute(true, wkt, idCapa);//TODO Pendiente configurar los datos para la ejecuci�n de consulta
	}
	*/
	blockui();
	var srlIdCapas="";
	$("input[name=capasBase]").each(function(index) {
		var input	= $(this);
		
		//console.log("+ input="+input.val()+" isChecked="+input.is(':checked'));
		if(input.is(':checked')) {
			if(srlIdCapas.length>0) {
				srlIdCapas+=",";
			}
			srlIdCapas+=input.val();
		}
	});
	var arrOrdenCapas			= ordenCapas();
	var arrTransparenciaCapas	= transparenciaCapas();
	var param	= null;
	if(wkt) {//Para los casos, dib rect y pol, cargar polig desde zip
		param	= {
				listSrlIdCapaConsulta: srlIdCapas,
				strPoligonoConsulta: wkt,
				zoomLevel: map.getView().getZoom(),
				esRaster:true
			};
	} else if(idCapa) {//Solo para el caso de click derecho
		param	= {
				listSrlIdCapaConsulta: srlIdCapas,
				strIdCapaConsulta: idCapa,
				zoomLevel: map.getView().getZoom(),
				esRaster:true
			};
	} else {
		param	= {
				listSrlIdCapaConsulta: srlIdCapas,
				zoomLevel: map.getView().getZoom(),
				esRaster:true
			};
	}
	for(key in arrOrdenCapas) {
		param["ordenCapa_"+arrOrdenCapas[key]]	= String(key);
		param["transCapa_"+arrOrdenCapas[key]]	= arrTransparenciaCapas[arrOrdenCapas[key]];
	}
	$("input[name=capasBase]").each(function(index) {
		var input	= $(this);
		//console.log("+ input="+input.val()+" isChecked="+input.is(':checked'));
		if(input.is(':checked')) {
			var currCapaBase	= buscarCapasBaseById(input.val());
			if(currCapaBase.intTipoCapa==1 || currCapaBase.intTipoCapa==3){//Vectorial y vectorial-numerico
				//var paramDefs			= "";
				var paramDefTemp		= $(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+input.val()).attr("paramDefs");
				if(paramDefTemp) {
					//console.log("paramDefTemp="+paramDefTemp);
					//paramDefs		= paramDefTemp;
					param["paramDefs_"+input.val()] = (paramDefTemp);
				}
			} else if(currCapaBase.intTipoCapa==2){//Raster
				var valSelect		= $(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+input.val()).attr("valSelect");//Solo Umbrales siempre
				//var layersTemp			= evaluarConfiguracionFiltroUmbralACL(srlIdCapa,valSelect);
				if(valSelect) {
					var layersTemp	= "show:" + valSelect;
					//console.log("layersTemp="+layersTemp);
					//layers	= layersTemp;
					param["layers_"+input.val()] = (layersTemp);
				}
			}
		}
	});
	/*
	$(".clsDivDetFiltroACL").each(function(index) {
		if($(this).attr("rangoUmbralVis") && $(this).attr("rangoUmbralVis") != "") {
			var rangoUmbralVis	= eval($(this).attr("rangoUmbralVis"));//, "["+arrUmbralRaster[0]+","+arrUmbralRaster[1]+","+arrUmbralRaster[2]+"]"
			param["rangou_"+rangoUmbralVis[0]] = ($(this).attr("rangoUmbralVis"));
		}
	});
	*/
	$.ajax({
		data:param,
		url:'consultaCapasBoundary.action',
		type:'post',
		async:false,
		dataType:"json",
		beforeSend:function(){},
		success:function(datos){
			var strPoligonoConsulta				= datos.strPoligonoConsulta;//$("#idDivStrPoligonoConsulta").html();
			var strPoligonoConsultaBoundary		= datos.strPoligonoConsultaBoundary;//$("#idDivStrPoligonoConsultaBoundary").html();
			
			centrarZoomMapaFromBox(strPoligonoConsultaBoundary);
			dibujarEnMapa(strPoligonoConsultaBoundary, strPoligonoConsulta);
		}
	});
	
	
	
	
	
	//TODO Se vuelven a generar los parametros luego de haber calculado el nuevo ZOOM
	if(wkt) {//Para los casos, dib rect y pol, cargar polig desde zip
		param	= {
				listSrlIdCapaConsulta: srlIdCapas,
				strPoligonoConsulta: wkt,
				zoomLevel: map.getView().getZoom(),
				esRaster:true
			};
	} else if(idCapa) {//Solo para el caso de click derecho
		param	= {
				listSrlIdCapaConsulta: srlIdCapas,
				strIdCapaConsulta: idCapa,
				zoomLevel: map.getView().getZoom(),
				esRaster:true
			};
	} else {
		param	= {
				listSrlIdCapaConsulta: srlIdCapas,
				zoomLevel: map.getView().getZoom(),
				esRaster:true
			};
	}
	for(key in arrOrdenCapas) {
		param["ordenCapa_"+arrOrdenCapas[key]]	= String(key);
		param["transCapa_"+arrOrdenCapas[key]]	= arrTransparenciaCapas[arrOrdenCapas[key]];
	}
	$("input[name=capasBase]").each(function(index) {
		var input	= $(this);
		//console.log("+ input="+input.val()+" isChecked="+input.is(':checked'));
		if(input.is(':checked')) {
			var currCapaBase	= buscarCapasBaseById(input.val());
			if(currCapaBase.intTipoCapa==1 || currCapaBase.intTipoCapa==3){//Vectorial y vectorial-numerico
				//var paramDefs			= "";
				var paramDefTemp		= $(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+input.val()).attr("paramDefs");
				if(paramDefTemp) {
					//console.log("paramDefTemp="+paramDefTemp);
					//paramDefs		= paramDefTemp;
					param["paramDefs_"+input.val()] = (paramDefTemp);
				}
			} else if(currCapaBase.intTipoCapa==2){//Raster
				var valSelect		= $(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+input.val()).attr("valSelect");//Solo Umbrales siempre
				//var layersTemp			= evaluarConfiguracionFiltroUmbralACL(srlIdCapa,valSelect);
				if(valSelect) {
					var layersTemp	= "show:" + valSelect;
					//console.log("layersTemp="+layersTemp);
					//layers	= layersTemp;
					param["layers_"+input.val()] = (layersTemp);
				}
			}
		}
	});
	/*
	$(".clsDivDetFiltroACL").each(function(index) {
		if($(this).attr("rangoUmbralVis") && $(this).attr("rangoUmbralVis") != "") {
			var rangoUmbralVis	= eval($(this).attr("rangoUmbralVis"));//, "["+arrUmbralRaster[0]+","+arrUmbralRaster[1]+","+arrUmbralRaster[2]+"]"
			param["rangou_"+rangoUmbralVis[0]] = ($(this).attr("rangoUmbralVis"));
		}
	});
	*/
	param["gmaps"]=$("#idPopoverMenuCapasBase").attr("curr-vista");
	$.ajax({
		data:param,
		url:'consultaCapas.action',
		type:'post',
		//async:false,
		//dataType:"json",
		beforeSend:function(){},
		success:function(datosCons){
			$("#idDivReporte").html("");
			$('.seleccionar-capas-modal').css("display", "none");
			$('.reporte-capas-modal').css("display", "");
			
			$("#idDivReporte").html(datosCons);
			
			//$("#idButtonLastRep").css("display", "");
			mostrarDetaRepo('imagenReporte.jsp','idDivDetaRepo', this, true);
			mostrarAcordionReporte(1);
			actualizarTamanioGrafica();
			
			unblockui();
		}
	});
	
	
	/*
	$.post('consultaCapasBoundary.action', param, function(datos) {
		var strPoligonoConsulta				= datos.strPoligonoConsulta;//$("#idDivStrPoligonoConsulta").html();
		var strPoligonoConsultaBoundary		= datos.strPoligonoConsultaBoundary;//$("#idDivStrPoligonoConsultaBoundary").html();
		
		centrarZoomMapaFromBox(strPoligonoConsultaBoundary);
		dibujarEnMapa(strPoligonoConsultaBoundary, strPoligonoConsulta);
		if(wkt) {//Para los casos, dib rect y pol, cargar polig desde zip
			param	= {
					listSrlIdCapaConsulta: srlIdCapas,
					strPoligonoConsulta: wkt,
					zoomLevel: map.getView().getZoom(),
					esRaster:false
				};
		} else if(idCapa) {//Solo para el caso de click derecho
			param	= {
					listSrlIdCapaConsulta: srlIdCapas,
					strIdCapaConsulta: idCapa,
					zoomLevel: map.getView().getZoom(),
					esRaster:false
				};
		} else {
			param	= {
					listSrlIdCapaConsulta: srlIdCapas,
					zoomLevel: map.getView().getZoom()
				};
		}
		$(".clsDivDetFiltroACL").each(function(index) {
			if($(this).attr("rangoUmbralVis") && $(this).attr("rangoUmbralVis") != "") {
				var rangoUmbralVis	= eval($(this).attr("rangoUmbralVis"));//, "["+arrUmbralRaster[0]+","+arrUmbralRaster[1]+","+arrUmbralRaster[2]+"]"
				param["rangou_"+rangoUmbralVis[0]] = ($(this).attr("rangoUmbralVis"));
			}
		});
		$.post('consultaCapas.action', param, function(datosCons) {
			$("#idDivReporte").html("");
			$('.seleccionar-capas-modal').css("display", "none");
			$('.reporte-capas-modal').css("display", "");
			
			$("#idDivReporte").html(datosCons);
			
			//$("#idButtonLastRep").css("display", "");
			mostrarDetaRepo('imagenReporte.jsp','idDivDetaRepo', this, true);
			actualizarTamanioGrafica();
			
			unblockui();
		});

	},"json");
	*/
}
var ultimoReporteVisor	= "";
function mostrarDetaRepo(strPagRepo, idDivDest, _this, esCompleto) {
//	$(".list-group-item").each(function(index) {
//		$(this).removeClass("active");
//	});
//	$(_this).addClass("active");
	var url	 = "";
	if(!esCompleto) {
		url	 = "paginas/consulta/rep-cons/"+strPagRepo+".jsp";
		ultimoReporteVisor	= strPagRepo;
	} else {
		url	 = "paginas/consulta/rep-cons/"+strPagRepo;
	}
	$.post(url, null, function(datos) {
		$("#"+idDivDest).html(datos);
	});
}
function seleccionarAreaDesdeShapefile() {
	cerrarTodosPopover();
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
	cerrarTodosPopover();
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
						var labelJsonStrGisArea	= datos.listAreaShapeSeleccionar[0].geometry;
//						alert("Procesar la consulta listAreaShapeSeleccionar[i].geometry:"+labelJsonStrGisArea);
						console.log("Fin cargar shapefile");
						console.log("WKT="+labelJsonStrGisArea);
						$('.cargar-shapefile-modal').modal('hide');
						unblockui();
						procesarAnalizarPorArea(labelJsonStrGisArea);//Cargar poligono desde shape
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
	//console.log("WKT="+labelJsonStrGisArea);
	$('.cargar-shapefile-modal').modal('hide');
	procesarAnalizarPorArea(labelJsonStrGisArea);//Seleccionar poligono desde shape multiples shapes
}

var activarSeleccionarAreaDesdeMapa	= false;
function seleccionarAreaDesdeMapa() {
	cerrarTodosPopover();
	//$('.analizar-por-area-modal').modal('hide');
//	alert("Pendiente activar la vista grafica para seleccionar poligono");
	activarSeleccionarAreaDesdeMapa	= true;
//	$(".clsTituloCapaActiva").css("display","");
}
function contains(a, obj) {
    for (var i = 0; i < a.length; i++) {
        if (a[i] === obj) {
            return true;
        }
    }
    return false;
}
function eventoMenuContextualSeleccionarAreaDesdeMapa(pixel, eve) {
	//$('.analizar-por-area-modal').modal('hide');
//	alert("Pendiente activar la vista grafica para seleccionar poligono");
	{
		if(!intIdCapaActiva || intIdCapaActiva == "") {
			mostrarMensajesErrorStruts(["Debe seleccionar por lo menos una capa como activa"]);
			return;
		}
		if(activarSeleccionarAreaDesdeMapa) {
			//var esSelecMapaAcl	= $("#idCapaAnalisPorArea"+intIdCapaActiva).attr("es-selec-mapa-acl");
			var esSelecMapaAcl	= $("#idCapaBaseVisualizacion"+intIdCapaActiva).attr("es-selec-mapa-acl");
			if(esSelecMapaAcl == "true") {
				$(".clsGenerarReporteAnalitico").css("display", "");
				cerrarTodosPopover();
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
		
		var wkt2 = format.writeFeature(feature, {
			dataProjection: 'EPSG:3857',
			featureProjection: 'EPSG:3857'
		});
//	    console.log("WKT2="+wkt2);

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
		$('#idDivRightClick').css("left", eve.pageX);
		$('#idDivRightClick').css("top", eve.pageY);
	}
}
function menucontextualProcesarReporteAnalitico() {
	activarSeleccionarAreaDesdeMapa	= false;
	procesarAnalizarPorArea(null, intIdCapaActiva);//Seleccionar poligono desde pantalla
//	$(".clsTituloCapaActiva").css("display","none");
}
