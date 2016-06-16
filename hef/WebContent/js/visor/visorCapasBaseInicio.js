var capasBaseArr	= new Array();
function iniciarCapasBase() {
	
	iniciarMarcarCapas();
	
	iniciarCapasSeleccionadasDefault();
}
function iniciarCapasSeleccionadasDefault() {
	$.post('cargarCapasBaseJson.action', null, function(datos) {
		capasBaseArr		= datos.listCapasBase;
		
		var idCapasDef		= $("input[name=CAPAS_VISUALIZACION_DEFAULT]").val();
		var arrCapasDef		= idCapasDef.split(",");
		var ultCapaActiva	= "";
		for(var i = 0;i < arrCapasDef.length;i++) {
			$("#idCapaBaseVisualizacion"+arrCapasDef[i]).prop("checked", true);
			ultCapaActiva	= arrCapasDef[i];
		}
		intIdCapaActiva	= ultCapaActiva;
		var capaBase	= buscarCapasBaseById(intIdCapaActiva);
		$(".clsTituloCapaActiva").html("Capa activa: "+capaBase.strNombre);
		refrescarCapaActiva();
		
		marcarCapasVisualizacion();
		
		for(var i = 0;i < arrCapasDef.length;i++) {
			setTransparenciaLayer(arrCapasDef[i], 40);
		}
		
		guardarCapasSeleccionadasCapasBase();
		iniciarComponentes();
	}, "json");
}

function iniciarMarcarCapas() {
	$(".capasBase").each(function(index) {
		$(this).prop("checked", false);
	});
}
function ocultarTodasCapas() {
	$(".capasBase").each(function(index) {
		ocultarCapaById($(this).val());
		$(this).prop("checked", false);
	});
}

function setTransparenciaLayer(srlIdCapa, transparencia) {
	var currCapa = buscarCapasBaseById(srlIdCapa);
	if(currCapa && currCapa.currLayer) {
		currCapa.currLayer.setOpacity((100 - transparencia)/100);
	}

}
function iniciarComponentes() {
	$(".clsSlider").each(function(index) {
		$(this).unbind("slider");
		var currSlider	= $(this);
		var currCapa	= buscarCapasBaseById(currSlider.attr("idcapa"));
		var currTransp	= 0;
		if(currCapa && currCapa.currLayer && currCapa.currLayer.getOpacity()) {
			currTransp	= (1-currCapa.currLayer.getOpacity())*100;
		}
		$(this).slider({
			range: "min",
			min: 0,
			max: 100,
			value: currTransp,
			slide: function(event, ui) {
				if(currCapa && currCapa.currLayer) {
					currCapa.currLayer.setOpacity((100 - ui.value)/100);
				}
			}
		});
	});
	$(".seleccionarParaCapaActiva").each(function(index) {
		$(this).unbind("click");
	});
	
	$(".clsSeleccionCapasEspaciales").each(function() {
		$(this).mouseover(function (event) {
			$(this).css("background-color","#F7F7F7");
			$(this).find(".clsPopoverMenuOpcion").css("color","#5F3815");
		});
		$(this).mouseout(function (event) {
			$(this).css("background-color","#FFFFFF");
			$(this).find(".clsPopoverMenuOpcion").css("color","#FFF");
		});
		$(this).click(function (event) {
			if($(event.target).hasClass("clsPopoverMenuOpcion")) {
				return;
			}
			var currLayer	= $(this).find(".seleccionarParaCapaActiva");
			intIdCapaActiva	= currLayer.attr("id-capa");
			$(".clsTituloCapaActiva").html("Capa activa: "+currLayer.attr("nombre-capa"));
			refrescarCapaActiva();
			
		});
	});
}
function refrescarCapaActiva() {
	$(".seleccionarParaCapaActiva").each(function(index) {
		if($(this).hasClass("clsCapaActiva")) {
			$(this).removeClass("clsCapaActiva");
		}
	});
	$(".seleccionarParaCapaActiva").each(function(index) {
		if($(this).attr("id-capa") == intIdCapaActiva) {
			$(this).addClass("clsCapaActiva");
		}
	});
}
function buscarCapasBaseById(srlIdCapa) {
	for(var i = 0;i < capasBaseArr.length;i++) {
		if(capasBaseArr[i].srlIdCapa == srlIdCapa) {
			return capasBaseArr[i];
		}
	}
	return null;
}
function mostrarCapaById(srlIdCapa, min, max) {
	var capaBase	= buscarCapasBaseById(srlIdCapa);
	if(capaBase && 
			(capaBase.currLayer == undefined || capaBase.currLayer == null) && 
			capaBase.strWmsUrl && 
			capaBase.strWmsUrl != "") {
		var url		= capaBase.strWmsUrl+"";
		var layers	= "show:" + capaBase.strWmsCapas;
		paramRaster = "";
		
		//console.log("capaBase.intTipoCapa="+capaBase.intTipoCapa);
		if(capaBase.intTipoCapa==2){//Raster
			var valSelect		= $(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa).attr("valSelect");//Solo Umbrales siempre
			//var layersTemp			= evaluarConfiguracionFiltroUmbralACL(srlIdCapa,valSelect);
			if(valSelect) {
				var layersTemp	= "show:" + valSelect;
				//console.log("layersTemp="+layersTemp);
				layers	= layersTemp;
			}
			
		}
		var paramDefs			= "";
		var paramDefTemp		= $(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa).attr("paramDefs");
		if(paramDefTemp) {
			//console.log("paramDefTemp="+paramDefTemp);
			paramDefs		= paramDefTemp;
		} else {
			paramDefs		= "";
		}
		
		capaBase.currLayer	= new ol.layer.Tile({
			source: new ol.source.TileArcGISRest({
				url: url,
				params: {
					LAYERS:layers,
					//FORMAT: "PNG24",
					renderingRule:paramRaster,
					layerDefs:paramDefs
					//where:"FID%3D4"
				}
			})
		});
		capaBase.currLayer["srlIdCapa"]	= srlIdCapa;
		map.addLayer(capaBase.currLayer);
	} else 	if(capaBase && 
			(capaBase.currLayer == undefined || capaBase.currLayer == null) && 
			capaBase.strShp && 
			capaBase.strShp != "") {
		capaBase.currLayer	= declararCapaUsuario(capaBase.strShpExtent, capaBase.srlIdCapa);
		map.addLayer(capaBase.currLayer);
	}
}

function declararCapaUsuario(varExtent, strId) {
//	var extent = [-81.14955661499994, -17.748342599999944, -68.71229543199993, -0.07651294299995648];
	var extent = eval(""+varExtent);
	//[minx, miny, maxx, maxy]
	var projection = new ol.proj.Projection({
		code: 'xkcd-image',
		units: 'pixels',
		extent: extent,
		code: 'EPSG:4326'
	});
	var imageLayer	= new ol.layer.Image({
		source: new ol.source.ImageStatic({
			attributions: [
				new ol.Attribution({
					html: '&copy; User'
			    })
			],
//			url: 'image/image_demo.jpg',
			url: ('download.action?strId='+strId),//strIdCapaUsuario
			projection: projection,
			imageExtent: extent
		})
	});
	imageLayer["srlIdCapa"]	= ""+strId;
	return imageLayer;
}

function ocultarCapaById(srlIdCapa) {
	var capaBase	= buscarCapasBaseById(srlIdCapa);
	if(capaBase && capaBase.currLayer) {
		map.removeLayer(capaBase.currLayer);
		capaBase.currLayer	= null;
	}
}
///////////////////////////////////////////////////////////////
function centrarMapa(srlIdCapa) {
	cerrarTodosPopover();
	$("#idDivCombosCentrar").html("<center><div style='background-color:#FFFFFF;height:28px;vertical-align: middle;'><img src='image/busy.gif'/> Espere por favor</div></center>");
	$('.centrar-mapa-modal').off('shown.bs.modal');
	$('.centrar-mapa-modal').off('hidden.bs.modal');
	$('.centrar-mapa-modal').on('shown.bs.modal', function (e) {
		
		$("#idDivCombosCentrar").attr("srlIdCapa", srlIdCapa);
		
		var param	= {
				listSrlIdCapaConsulta:srlIdCapa
		};
		$.post("consultaCombosCentrar.action", param, function(datos) {
			$("#idDivCombosCentrar").find("select[name=combo_centrar_visor]").each(function(index) {
				$(this).unbind("selectpicker");
			});
			$("#idDivCombosCentrar").html(datos);
			$("#idDivCombosCentrar").find("select[name=combo_centrar_visor]").selectpicker({
				liveSearch: true,
				maxOptions: 1
			});
			$("#idDivCombosCentrar").attr("srlIdCapa", srlIdCapa);

			
		});
	});
	$('.centrar-mapa-modal').on('hidden.bs.modal', function (e) {
//		finalizarAllEventListenerIframe();
		//$('.seleccionar-capas-modal').modal('show');
	});
	//$('.seleccionar-capas-modal').modal('hide');
	$('.centrar-mapa-modal').modal('show');
}
function centrar_mapa_desde_combo(this_combo) {
	var srlIdCapa		= $("#idDivCombosCentrar").attr("srlIdCapa");
	var idValueSelect	= $(this_combo).val();
	var param	= {
			listSrlIdCapaConsulta:srlIdCapa,
			listIdDataCapaConsulta:idValueSelect
	};
	$.post('consultaCombosCentrarMapa.action', param, function(datos) {
		centrarZoomMapaFromBox(datos.strGeometriaRespuesta);
	}, "json");
}
function centrarZoomMapaFromBox(txtBox) {
	var formatWkt		= new ol.format.WKT();
	var newVectorGeom	= formatWkt.readGeometry(txtBox);
	var geomTransform	= newVectorGeom.transform('EPSG:4326', 'EPSG:3857');

	map.getView().fit(geomTransform, map.getSize(),{});
}
var vectorDrawCustom		= null;
var vectorDrawCustomGraf	= null;
function dibujarEnMapa(wkt, wktGraf) {
    var format	= new ol.format.WKT();
    var feature	= format.readFeature(wkt, {
      dataProjection: 'EPSG:4326',
      featureProjection: 'EPSG:3857'
    });
    vectorDrawCustom	= new ol.layer.Vector({
      source: new ol.source.Vector({
        features: [feature]
      })
    });
	map.addLayer(vectorDrawCustom);
	
	if(wktGraf) {
		var featureGraf	= format.readFeature(wktGraf, {
	      dataProjection: 'EPSG:4326',
	      featureProjection: 'EPSG:3857'
	    });
	    vectorDrawCustomGraf	= new ol.layer.Vector({
	      source: new ol.source.Vector({
	        features: [featureGraf]
	      })
	    });
		map.addLayer(vectorDrawCustomGraf);
	} else {
		vectorDrawCustomGraf	= null;
	}
}
function dibujarEnMapaOcultar() {
	if(vectorDrawCustom) {
		map.removeLayer(vectorDrawCustom);
	}
	if(vectorDrawCustomGraf) {
		map.removeLayer(vectorDrawCustomGraf);
	}
}
function dibujarEnMapaMostrar() {
	if(vectorDrawCustom) {
		map.addLayer(vectorDrawCustom);
	}
	if(vectorDrawCustomGraf) {
		map.addLayer(vectorDrawCustomGraf);
	}
}

function descargarMapa(srlIdCapa) {
	cerrarTodosPopover();
	var capaBase	= buscarCapasBaseById(srlIdCapa);
	if(capaBase) {
//		document.location.href=capaBase.strWfsUrl;
		var frm	= document.form;
		frm.action="download/"+capaBase.strWfsUrl;
		frm.target="_blank";
		frm.submit();
	}
}
function descargarMapaUsuario(srlIdCapa) {
	cerrarTodosPopover();
	var capaBase	= buscarCapasBaseById(srlIdCapa);
	if(capaBase) {
		var frm	= document.form;
		frm.action="download.action";
		frm.strIdCapaUsuario.value=srlIdCapa;
		frm.target="_blank";
		frm.submit();
	}
}
function mostrarInfo(srlIdCapa) {
	cerrarTodosPopover();
	$('.info-capas-modal').off('shown.bs.modal');
	$('.info-capas-modal').off('hidden.bs.modal');
	$('.info-capas-modal').on('shown.bs.modal', function (e) {
//		$('.seleccionar-capas-modal').modal('hide');
		var capaBase	= buscarCapasBaseById(srlIdCapa);
		if(capaBase) {
			$("#idDivInfoNombre").html(capaBase.strNombre);
			$("#idDivInfoComentario").html(capaBase.strComentarios);
			$("#idDivInfoUrl").html(capaBase.strUrl);
			//$("#idDivInfoFecha").html(capaBase.timFechaRegistroFechaHora);
			$("#idDivInfoFecha").html(capaBase.timFechaRegistroFechaHoraSoloAnio);
			$("#idDivInfoAutores").html(capaBase.strAutor);
		}
	});
	$('.info-capas-modal').on('hidden.bs.modal', function (e) {
//		finalizarAllEventListenerIframe();
	});
	$('.info-capas-modal').modal('show');
}
/*
//////////////////////////////////////////////////////////////////
function centrar_depa_upd_dpto() {
	var centrar_departamento	= $("select[name=centrar_departamento]").val();
	$.post('centrarDepartamentoJson.action', {"centrar_departamento":centrar_departamento}, function(datos) {
		centrarZoomMapaFromBox(datos.strCentroDepartamento);
	}, "json");
}
//////////////////////////////////////////////////////////////////
function centrar_prov_upd_dpto() {
	var centrar_prov_departamento	= $("select[name=centrar_prov_departamento]").val();
	$.post('centrarProvinciaEnDepartamentoJson.action', {"centrar_prov_departamento":centrar_prov_departamento}, function(datos) {
		centrarZoomMapaFromBox(datos.strCentroDepartamento);
	}, "json");
	cargarCombo_prov_en_provincia();
}
function centrar_prov_upd_prov() {
	//$("select[name=centrar_prov_departamento]").
	//$("select[name=centrar_prov_provincia]").
	var centrar_prov_provincia	= $("select[name=centrar_prov_provincia]").val();
	$.post('centrarProvinciaEnProvinciaJson.action', {"centrar_prov_provincia":centrar_prov_provincia}, function(datos) {
		centrarZoomMapaFromBox(datos.strCentroProvincia);
	}, "json");
}
//////////////////////////////////////////////////////////////////
function centrar_dist_upd_dpto() {
	var centrar_dist_departamento	= $("select[name=centrar_dist_departamento]").val();
	$.post('centrarDistritoEnDepartamentoJson.action', {"centrar_dist_departamento":centrar_dist_departamento}, function(datos) {
		centrarZoomMapaFromBox(datos.strCentroDepartamento);
	}, "json");
	cargarCombo_dist_en_provincia();
}
function centrar_dist_upd_prov() {
	var centrar_dist_provincia	= $("select[name=centrar_dist_provincia]").val();
	$.post('centrarDistritoEnProvinciaJson.action', {"centrar_dist_provincia":centrar_dist_provincia}, function(datos) {
		centrarZoomMapaFromBox(datos.strCentroProvincia);
	}, "json");
	cargarCombo_dist_en_distrito();
}
function centrar_dist_upd_dist() {
	//$("select[name=centrar_dist_departamento]").
	//$("select[name=centrar_dist_provincia]").
	//$("select[name=centrar_dist_distrito]").
	var centrar_dist_distrito	= $("select[name=centrar_dist_distrito]").val();
	$.post('centrarDistritoEnDistritoJson.action', {"centrar_dist_distrito":centrar_dist_distrito}, function(datos) {
		centrarZoomMapaFromBox(datos.strCentroDistrito);
	}, "json");
}

//////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////
function centrarZoomMapaFromBox(txtBox) {
	var formatWkt		= new ol.format.WKT();
	var newVectorGeom	= formatWkt.readGeometry(txtBox);
	var geomTransform	= newVectorGeom.transform('EPSG:4326', 'EPSG:3857');

	map.getView().fit(geomTransform, map.getSize(),{});
}
//////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////

function cargarCombo_prov_en_provincia() {
	var centrar_prov_departamento	= $("select[name=centrar_prov_departamento]").val();
	$.post('comboCentrarProvinciaEnProvincia.action', {"centrar_prov_departamento":centrar_prov_departamento}, function(datos) {
		$("#idDivComboProvinciaEnProvincia").html(datos);
	});
}

function cargarCombo_dist_en_provincia() {
	var centrar_dist_departamento	= $("select[name=centrar_dist_departamento]").val();
	$.post('comboCentrarDistritoEnProvincia.action', {"centrar_dist_departamento":centrar_dist_departamento}, function(datos) {
		$("#idDivComboDistritoEnProvincia").html(datos);
	});
}
function cargarCombo_dist_en_distrito() {
	var centrar_dist_provincia	= $("select[name=centrar_dist_provincia]").val();
	$.post('comboCentrarDistritoEnDistrito.action', {"centrar_dist_provincia":centrar_dist_provincia}, function(datos) {
		$("#idDivComboDistritoEnDistrito").html(datos);
	});
}
*/
//////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////
function guardarCapasSeleccionadasCapasBase() {
	$(".clsPanelGrupoCapasCB").each(function(index) {
		var contador	= 0;
		$(this).find(".capasBase").each(function(index) {
			if($(this).is(':checked')) {
				contador++;
			}
		});
		if(contador > 0) {
			$(this).find(".badgeCustomPanelGrupoCapaCB").html(contador);
			$(this).find(".badgeCustomPanelGrupoCapaCB").css("display", "");
		} else {
			$(this).find(".badgeCustomPanelGrupoCapaCB").html("");
			$(this).find(".badgeCustomPanelGrupoCapaCB").css("display", "none");
		}
	});
	$(".clsPanelGrupoCapasMainCB").each(function(index) {
		var contador	= 0;
		$(this).find(".capasBase").each(function(index) {
			if($(this).is(':checked')) {
				contador++;
			}
		});
		if(contador > 0) {
			$(this).find(".badgeCustomPanelGrupoCapaMainCB").html(contador);
			$(this).find(".badgeCustomPanelGrupoCapaMainCB").css("display", "");
		} else {
			$(this).find(".badgeCustomPanelGrupoCapaMainCB").html("");
			$(this).find(".badgeCustomPanelGrupoCapaMainCB").css("display", "none");
		}
	});
}
function dibujarRectangulo() {
	cerrarTodosPopover();
	$('.analizar-por-area-modal').modal('hide');
	addInteraction("Box");
}
function dibujarPoligono() {
	cerrarTodosPopover();
	$('.analizar-por-area-modal').modal('hide');
	addInteraction("Polygon");
}


function marcarCapasVisualizacion() {
	$(".capasBase").each(function(index) {
		if($(this).is(':checked')) {
			mostrarCapaById($(this).val());
		} else {
			ocultarCapaById($(this).val());
			limpiarCapasEspACL($(this));
		}
	});
}
/*
function filtrar_umbral(rangoValores) {
	//var rangoValores = eval(""+$(currSelect).val());
	if($("#idCapaBaseVisualizacion"+rangoValores[0]).is(':checked')) {
		ocultarCapaById(rangoValores[0]);
		mostrarCapaById(rangoValores[0], rangoValores[1], rangoValores[2]);//0 IdCapa  1 min  2 max
	}
}
*/
function refrescarVisualizarCapa(srlIdCapa) {
	if($("#idCapaBaseVisualizacion"+srlIdCapa).is(':checked')) {
		ocultarCapaById(srlIdCapa);
		mostrarCapaById(srlIdCapa);//0 IdCapa  1 min  2 max
	}
}

function eliminar_capa_usuario(srlIdCapa) {
//	
	$('.dialog-info-eliminar-modal').off('shown.bs.modal');
	$('.dialog-info-eliminar-modal').off('hidden.bs.modal');
	$('.dialog-info-eliminar-modal').on('shown.bs.modal', function (e) {
		$(".btnConfirmEliminarSi").click(function() {
			var frm		= $("#form");
        	$('#buscar_seleccion_id').val(srlIdCapa);
        	$.post('eliminarCapa.action', frm.serialize(), function(datos) {
	    		if(datos.actionErrors.length > 0) {
	    			mostrarMensajesErrorStruts(datos.actionErrors);
	    		} else {
	    			mostrarMensajesStruts(datos.actionMessages);
	    		}
        		$('#dialog-info-eliminar').dialog("close");
        		var frm		= document.form;
				frm.action	= "/hef/home.action";
				frm.submit();
        	}, "json");
		});
	});
	$('.dialog-info-eliminar-modal').on('hidden.bs.modal', function (e) {
	});
	$('.dialog-info-eliminar-modal').modal('show');
	
}
function cerrarPopover(idCapa) {
	$("#idPopoverMenuOpcion"+idCapa).popover('hide');
}
function mostrarPopover(idCapa) {
	$(".clsPopoverMenuOpcion").each(function(index) {
		if($(this).attr("id") != ("idPopoverMenuOpcion"+idCapa)) {
			$(this).popover('hide');
		}
	});
	$("#idPopoverMenuOpcion"+idCapa).popover('show');
}
function mostrarPopoverCapasBase() {
	$("#idPopoverMenuCapasBase").popover('show');
}
function cerrarPopoverCapasBase() {
	$("#idPopoverMenuCapasBase").popover('hide');
}
function mostrarPopoverAnalizarArea() {
	$("#idPopoverMenuAnalizarArea").popover('show');
}
function cerrarPopoverAnalizarArea() {
	$("#idPopoverMenuAnalizarArea").popover('hide');
}
function cerrarTodosPopover() {
	$(".clsPopoverMenuOpcion").each(function(index) {
		$(this).popover('hide');
	});
	$(".clsPopoverMenuAnalizarArea").each(function(index) {
		$(this).popover('hide');
	});
	$(".clsPopoverMenuCapasBase").each(function(index) {
		$(this).popover('hide');
	});
}
function mostrarPopoverReporte() {
	$("#idPopoverMenuReporte").popover('show');
}
function cerrarPopoverReporte() {
	$("#idPopoverMenuReporte").popover('hide');
}
function mostrarAcordion(element) {
	$(".clsCollapseOne").each(function(index) {
		if($(this).attr("aria-expanded") == "true" && $(this).attr("id") != ("collapseOne"+element)) {
			$(this).collapse('hide');
		}
	});
	$(".clsNombreGrupoCapaSelector").each(function(index) {
		$(this).removeClass("clsNombreGrupoCapa-Sel");
		$(this).addClass("clsNombreGrupoCapa");
		$(this).find(".clsDivNombreGrupoCapaIcono").html("<i class=\"glyphicon glyphicon-plus-sign\"></i></div>");
	});
	
	var currLink	= $("#collapseOne"+element);
	if(currLink.attr("aria-expanded") == "false") {//Mostrar
		//currLink.collapse('show');
		currLink.collapse('show');
		var currTitle	= $("#headingOne"+element);
		currTitle.find("h4").removeClass("clsNombreGrupoCapa");
		currTitle.find("h4").addClass("clsNombreGrupoCapa-Sel");
		currTitle.find(".clsDivNombreGrupoCapaIcono").html("<i class=\"glyphicon glyphicon-minus-sign\"></i></div>");
	} else {
		//currLink.collapse('hide');
		currLink.collapse('hide');
		//var currTitle	= $("#headingOne"+element);
		//currTitle.find("h4").addClass("clsNombreGrupoCapa");
		//currTitle.find("h4").removeClass("clsNombreGrupoCapa-Sel");
	}
	ajustarTamanioSlider();
}
function ajustarTamanioSlider() {
	$(".clsSliderColXs2").each(function() {
		$(this).css("height", $(this).parent().css("height"));
		var clsSliderHeight	= $(this).find(".clsSlider").css("height").pxToInt(); 
		$(this).find(".clsSlider").css("top", (($(this).parent().css("height").pxToInt()/2)-(clsSliderHeight/2)));
	});
	$(".clsOpcionesColXs3").each(function() {
		$(this).css("height", $(this).parent().css("height"));
		
		var clsPopoverMenuOpcionHeight	= $(this).find(".clsPopoverMenuOpcion").css("height").pxToInt(); 
		$(this).find(".clsPopoverMenuOpcion").css("top", (($(this).parent().css("height").pxToInt()/2)-(clsPopoverMenuOpcionHeight/2)));
		
		var clsDivDetFiltroACLTitleHeight	= $(this).find(".clsDivDetFiltroACLTitle").css("height").pxToInt(); 
		$(this).find(".clsDivDetFiltroACLTitle").css("top", (($(this).parent().css("height").pxToInt()/2)-(clsDivDetFiltroACLTitleHeight/2)));
	});
}

function mostrarAcordionReporte(element) {
	$(".clsCollapseOneRep").each(function(index) {
		if($(this).attr("aria-expanded") == "true" && $(this).attr("id") != ("collapseOneRep"+element)) {
			$(this).collapse('hide');
		}
	});
	$(".clsNombreGrupoCapaSelectorRep").each(function(index) {//Ocultar todos
		$(this).removeClass("clsNombreGrupoCapaRep-Sel");
		$(this).addClass("clsNombreGrupoCapaRep");
		$(this).find(".clsDivNombreGrupoCapaIconoRep").html("<i class=\"glyphicon glyphicon-plus-sign\"></i></div>");
	});
	
	var currLink	= $("#collapseOneRep"+element);
	if(currLink.attr("aria-expanded") == "false") {//Mostrar
		currLink.collapse('show');
		var currTitle	= $("#headingOneRep"+element);
		currTitle.find("h4").removeClass("clsNombreGrupoCapaRep");
		currTitle.find("h4").addClass("clsNombreGrupoCapaRep-Sel");
		currTitle.find(".clsDivNombreGrupoCapaIconoRep").html("<i class=\"glyphicon glyphicon-minus-sign\"></i></div>");
	} else {
		currLink.collapse('hide');
	}
	
}
function ordenCapas() {
	var arrOrdenCapas	= new Array();
	if(map) {
		var arrayLayers	= map.getLayers().getArray();
		for(key in arrayLayers) {
			arrOrdenCapas[arrOrdenCapas.length] = ""+arrayLayers[key].srlIdCapa;
		}
	}
	/*
	for(key in arrOrdenCapas) {
		console.log("ordenCapas: srlIdCapa="+arrOrdenCapas[key]);
	}
	*/
	return arrOrdenCapas;
}
function transparenciaCapas() {
	var arrTranspCapas	= new Array();
	if(map) {
		var arrayLayers	= map.getLayers().getArray();
		for(key in arrayLayers) {
			arrTranspCapas[""+arrayLayers[key].srlIdCapa] = ""+arrayLayers[key].getOpacity();
		}
	}
	for(key in arrTranspCapas) {
		console.log("ordenCapas: srlIdCapa="+arrTranspCapas[key]);
	}
	return arrTranspCapas;
}
