var capasBaseArr	= new Array();
function iniciarCapasBase() {
	$('.seleccionar-capas').click(seleccionarCapas);
	
	$.post('cargarCapasBaseJson.action', null, function(datos) {
		capasBaseArr	= datos.listCapasBase;
	}, "json");
	/*
	$("select[name=centrar_departamento]").change(centrar_depa_upd_dpto);
	$("select[name=centrar_prov_departamento]").change(centrar_prov_upd_dpto);
	$("select[name=centrar_dist_departamento]").change(centrar_dist_upd_dpto);
	*/
	iniciarMarcarCapas();
	
	var idCapasDef	= $("input[name=CAPAS_VISUALIZACION_DEFAULT]").val();
	var arrCapasDef	= idCapasDef.split(",");
	for(var i = 0;i < arrCapasDef.length;i++) {
		$("#idCapaBaseVisualizacion"+arrCapasDef[i]).prop("checked", true);
	}
	
	marcarCapasVisualizacion();
	
	guardarCapasSeleccionadasCapasBase();
}

function iniciarMarcarCapas() {
	$(".capasBase").each(function(index) {
		$(this).prop("checked", false);
	});
}

function seleccionarCapas() {
	$('.seleccionar-capas-modal').off('shown.bs.modal');
	$('.seleccionar-capas-modal').off('hidden.bs.modal');
	$('.seleccionar-capas-modal').on('shown.bs.modal', function (e) {
		iniciarComponentes();
	});
	$('.seleccionar-capas-modal').on('hidden.bs.modal', function (e) {
	});
	$('.seleccionar-capas-modal').modal('show');
}

function iniciarComponentes() {
	$(".clsSlider").each(function(index) {
		$(this).unbind("slider");
		var currSlider	= $(this);
		$(this).slider({
			range: "min",
			min: 0,
			max: 100,
			value: 100,
			slide: function(event, ui) {
				var currCapa = buscarCapasBaseById(currSlider.attr("idcapa"));
				if(currCapa && currCapa.currLayer) {
					currCapa.currLayer.setOpacity(ui.value/100);
				}
			}
		});
	});
	$(".seleccionarParaCapaActiva").each(function(index) {
		$(this).unbind("click");
	});
	$(".seleccionarParaCapaActiva").each(function(index) {
		$(this).click(function() {
			intIdCapaActiva	= $(this).attr("id-capa");
			$(".clsTituloCapaActiva").html("Capa activa: "+$(this).attr("nombre-capa"));
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
	if(capaBase && (capaBase.currLayer == undefined || capaBase.currLayer == null) && capaBase.strWmsCapas && capaBase.strWmsCapas != "") {
		var url		= capaBase.strWmsUrl;
		var layers	= "show:" + capaBase.strWmsCapas;
		paramRaster = "";
		if(min && max) {
			paramRaster = "{"+
		    "\"rasterFunction\" : \"Remap\","+
		    "\"rasterFunctionArguments\" : {"+
		    "\"InputRanges\" : ["+min+", "+max+"],"+
		    "\"OutputValues\": ["+min+"],"+
		    "\"AllowUnmatched\": \"false\""+
		    "}}";
		}
		capaBase.currLayer	= new ol.layer.Tile({
			source: new ol.source.TileArcGISRest({
				url: url,
				params: {
					LAYERS:layers,
					renderingRule:paramRaster
				}
			})
		});
		map.addLayer(capaBase.currLayer);
	}
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
	$('.centrar-mapa-modal').off('shown.bs.modal');
	$('.centrar-mapa-modal').off('hidden.bs.modal');
	$('.centrar-mapa-modal').on('shown.bs.modal', function (e) {
		/*
		if($("input[name=CAPAS_BASE_DEPARTAMENTO]").val() == srlIdCapa) {
			$("#idDivCentrarDepartamento").css("display","");
			$("#idDivCentrarProvincia").css("display","none");
			$("#idDivCentrarDistrito").css("display","none");
		} else if($("input[name=CAPAS_BASE_PROVINCIA]").val() == srlIdCapa) {
			$("#idDivCentrarDepartamento").css("display","none");
			$("#idDivCentrarProvincia").css("display","");
			$("#idDivCentrarDistrito").css("display","none");
		} else if($("input[name=CAPAS_BASE_DISTRITO]").val() == srlIdCapa) {
			$("#idDivCentrarDepartamento").css("display","none");
			$("#idDivCentrarProvincia").css("display","none");
			$("#idDivCentrarDistrito").css("display","");
		}
		*/
		$("#idDivCombosCentrar").html("");
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
		$('.seleccionar-capas-modal').modal('show');
	});
	$('.seleccionar-capas-modal').modal('hide');
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
function descargarMapa(srlIdCapa) {
	var capaBase	= buscarCapasBaseById(srlIdCapa);
	if(capaBase) {
//		document.location.href=capaBase.strWfsUrl;
		var frm	= document.form;
		frm.action=capaBase.strWfsUrl;
		frm.target="_blank";
		frm.submit();
	}
}
function mostrarInfo(srlIdCapa) {
	$('.info-capas-modal').off('shown.bs.modal');
	$('.info-capas-modal').off('hidden.bs.modal');
	$('.info-capas-modal').on('shown.bs.modal', function (e) {
//		$('.seleccionar-capas-modal').modal('hide');
		var capaBase	= buscarCapasBaseById(srlIdCapa);
		if(capaBase) {
			$("#idDivInfoNombre").html(capaBase.strNombre);
			$("#idDivInfoComentario").html(capaBase.strComentarios);
			$("#idDivInfoUrl").html(capaBase.strUrl);
			$("#idDivInfoFecha").html(capaBase.timFechaRegistroFechaHora);
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
	$('.analizar-por-area-modal').modal('hide');
	addInteraction("Box");
}
function dibujarPoligono() {
	$('.analizar-por-area-modal').modal('hide');
	addInteraction("Polygon");
}


function marcarCapasVisualizacion() {
	$(".capasBase").each(function(index) {
		if($(this).prop("checked")) {
			mostrarCapaById($(this).val());
		} else {
			ocultarCapaById($(this).val());
		}
	});
}

function filtrar_umbral(currSelect) {
	var rangoValores = eval(""+$(currSelect).val());
	ocultarCapaById(rangoValores[0]);
	mostrarCapaById(rangoValores[0], rangoValores[1], rangoValores[2]);//0 IdCapa  1 min  2 max
}
