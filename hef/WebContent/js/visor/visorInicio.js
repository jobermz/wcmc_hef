$(document).ready(function() {
	goog.require('ol.Map');
	goog.require('ol.View');
	goog.require('ol.layer.Tile');
	goog.require('ol.source.MapQuest');
	goog.require('ol.source.TileArcGISRest');
	goog.require('ol.proj');
	
	$('.seleccionar-capas').click(seleccionarCapas);
	$('.identificar-area-criterio-logico').click(identificarAreaCriterioLogico);
	$('.analizar-por-area').click(analizarPorArea);
	$('.upload-capas').click(uploadCapas);
	
	/*
	$(document).bind('contextmenu', function(e) {
		$('#idDivRightClick').css("display", "none");
		return true;
	});
	*/
	$(document).bind('click', function(e) {
		$('#idDivRightClick').css("display", "none");
		if(!activarSeleccionarAreaDesdeMapa) {
//			$(".clsTituloCapaActiva").css("display","none");
		}
		return true;
	});
	
	iniciarMapa();
	iniciarCapasBase();
//	$('.collapse').collapse();
	iniciarMarcarCapas();
	marcarCapas();
	iniciarIdentificarAreaPorCriteriosLogicos();
	iniciarAnalizarPorArea();
});
var map			= null;
var sourceDraw	= null;
var draw		= null; // global so we can remove it later
function iniciarMapa() {
	var gmap = null;
	if(google) {
		gmap	= new google.maps.Map(document.getElementById('gmap'), {
			disableDefaultUI: true,
			keyboardShortcuts: false,
			draggable: false,
			disableDoubleClickZoom: true,
			scrollwheel: false,
			streetViewControl: false,
			mapTypeId: google.maps.MapTypeId.SATELLITE
		});
	}
	var view = new ol.View({
	  // make sure the view doesn't go beyond the 22 zoom levels of Google Maps
	  maxZoom: 21,
	  minZoom: 5,
	  extent: [-9199616.97582139,-2126814.61366579,-7603789.69645505,-767.505336264896]
	});
	view.on('change:center', function() {
		var center = ol.proj.transform(view.getCenter(), 'EPSG:3857', 'EPSG:4326');
		if(gmap) {
			gmap.setCenter(new google.maps.LatLng(center[1], center[0]));
		}
	});
	view.on('change:resolution', function() {
		if(gmap) {
			gmap.setZoom(view.getZoom());
		}
	});
	
	sourceDraw = new ol.source.Vector({wrapX: false});
	var vector = new ol.layer.Vector({
		source: sourceDraw,
		style: new ol.style.Style({
			fill: new ol.style.Fill({
				color: 'rgba(255, 255, 255, 0.2)'
			}),
			stroke: new ol.style.Stroke({
				color: '#ffcc33',
				width: 2
			}),
			image: new ol.style.Circle({
				radius: 7,
				fill: new ol.style.Fill({
					color: '#ffcc33'
				})
			})
		})
	});
	
	var layers = [vector];
	var olMapDiv = document.getElementById('olmap');
	map = new ol.Map({
		layers: layers,
		interactions: ol.interaction.defaults({
			altShiftDragRotate: false,
			dragPan: false,
			rotate: false
		}).extend([new ol.interaction.DragPan({kinetic: null})]),
		target: olMapDiv,
		view:view
	});
	view.setCenter([-8524257, -1011047]);
	view.setZoom(5);
	
	olMapDiv.parentNode.removeChild(olMapDiv);
	if(gmap) {
		gmap.controls[google.maps.ControlPosition.TOP_LEFT].push(olMapDiv);
	}
	
	map.getViewport().addEventListener('contextmenu', function (e) { // or $(map.getViewport()).on('contextmenu', function(e) with jQuery
		var pix		= map.getEventPixel(e);
		eventoMenuContextualSeleccionarAreaDesdeMapa(pix, e);
	    e.preventDefault();
	    return false;
		/*
		var coord	= map.getCoordinateFromPixel(pix);
		console.log("coord="+coord);
		var point	= new ol.geom.Point(coord);
		var feature = new ol.Feature({geometry: point});
		var format	= new ol.format.WKT();
	    var wkt		= format.writeFeature(feature, {
	      dataProjection: 'EPSG:4326',
	      featureProjection: 'EPSG:3857'
	    });
	    console.log("WKT="+wkt);
	    */
	});
}
function addInteraction(value) {
	/* Polygon, Box*/
	if (map && value != '' && value !== 'None') {
		var geometryFunction, maxPoints;
		if (value === 'Box') {
			value = 'LineString';
			maxPoints = 2;
			geometryFunction = function(coordinates, geometry) {
				if (!geometry) {
					geometry = new ol.geom.Polygon(null);
				}
				var start = coordinates[0];
				var end = coordinates[1];
				geometry.setCoordinates([
					[start, [start[0], end[1]], end, [end[0], start[1]], start]
				]);
				return geometry;
			};
		}
		draw = new ol.interaction.Draw({
			source: sourceDraw,
			type: /** @type {ol.geom.GeometryType} */ (value),
			geometryFunction: geometryFunction,
			maxPoints: maxPoints
		});
		draw.on('drawend', drawEnd);
		map.addInteraction(draw);
	}
}
function drawEnd(event) {
    console.log("Fin del dibujo");
    var format = new ol.format.WKT();
    var wkt = format.writeFeature(event.feature, {
      dataProjection: 'EPSG:4326',
      featureProjection: 'EPSG:3857'
    });
    console.log("WKT="+wkt);
    terminarInteraction();
    procesarAnalizarPorArea(wkt);
}
function dibujarRectangulo() {
	$('.analizar-por-area-modal').modal('hide');
	addInteraction("Box");
}
function dibujarPoligono() {
	$('.analizar-por-area-modal').modal('hide');
	addInteraction("Polygon");
}
function terminarInteraction() {
	if(map && draw) {
		map.removeInteraction(draw);
	}
}

var fn_iniciarComponentes	= null;
var intIdCapaActiva			= null;
function iniciarComponentes() {
	$(".clsSlider").each(function(index) {
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
function iniciarMarcarCapas() {
	$(".capasBase").each(function(index) {
		$(this).prop("checked", false);
	});
}

function marcarCapas() {
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

function seleccionarCapas() {
	$('.seleccionar-capas-modal').off('shown.bs.modal');
	$('.seleccionar-capas-modal').off('hidden.bs.modal');
	$('.seleccionar-capas-modal').on('shown.bs.modal', function (e) {
		if(!fn_iniciarComponentes) {
			iniciarComponentes();
			fn_iniciarComponentes = iniciarComponentes;
		}
	});
	$('.seleccionar-capas-modal').on('hidden.bs.modal', function (e) {
	});
	$('.seleccionar-capas-modal').modal('show');
}

function identificarAreaCriterioLogico() {
	$('.identificar-area-criterio-logico-modal').off('shown.bs.modal');
	$('.identificar-area-criterio-logico-modal').off('hidden.bs.modal');
	$('.identificar-area-criterio-logico-modal').on('shown.bs.modal', function (e) {
	});
	$('.identificar-area-criterio-logico-modal').on('hidden.bs.modal', function (e) {
	});
	$('.identificar-area-criterio-logico-modal').modal('show');
}

function analizarPorArea() {
	$('.analizar-por-area-modal').off('shown.bs.modal');
	$('.analizar-por-area-modal').off('hidden.bs.modal');
	$('.analizar-por-area-modal').on('shown.bs.modal', function (e) {
	});
	$('.analizar-por-area-modal').on('hidden.bs.modal', function (e) {
	});
	$('.analizar-por-area-modal').modal('show');
}

function uploadCapas() {
	$('.upload-capas-modal').off('shown.bs.modal');
	$('.upload-capas-modal').off('hidden.bs.modal');
	$('.upload-capas-modal').on('shown.bs.modal', function (e) {
	});
	$('.upload-capas-modal').on('hidden.bs.modal', function (e) {
	});
	$('.upload-capas-modal').modal('show');
}
