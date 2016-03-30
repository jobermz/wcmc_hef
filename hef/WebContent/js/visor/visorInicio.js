$(document).ready(function() {
	goog.require('ol.Map');
	goog.require('ol.View');
	goog.require('ol.layer.Tile');
	goog.require('ol.source.MapQuest');
	goog.require('ol.source.TileArcGISRest');
	goog.require('ol.proj');
	
	goog.require('ol.control');
	goog.require('ol.layer.Vector');
//	goog.require('ol.source.GeoJSON');
	goog.require('ol.source.OSM');
	
	$(".identificar-area-criterio-logico").bind('contextmenu', function(e) {
		$('#idDivRightClick').css("display", "none");
		$('#idDivRightClickClean').css("display", "none");
		$('#idDivRightClickAPAClean').css("display","none");
		
		$('#idDivRightClickClean').css("display", "table-row");
		$('#idDivRightClickClean').css("right", $("#idDivBotonFlotanteACL").css("right").pxToInt()+15);
		$('#idDivRightClickClean').css("top", $("#idDivBotonFlotanteACL").css("top").pxToInt()+25);
		return false;
	});
	
	$(".analizar-por-area").bind('contextmenu', function(e) {
		$('#idDivRightClick').css("display", "none");
		$('#idDivRightClickClean').css("display", "none");
		$('#idDivRightClickAPAClean').css("display","none");
		
		$('#idDivRightClickAPAClean').css("display", "table-row");
		$('#idDivRightClickAPAClean').css("right", $("#idDivBotonFlotanteAPA").css("right").pxToInt()+15);
		$('#idDivRightClickAPAClean').css("top", $("#idDivBotonFlotanteAPA").css("top").pxToInt()+25);
		return false;
	});
	
	$(document).bind('click', function(e) {
		$('#idDivRightClick').css("display", "none");
		$('#idDivRightClickClean').css("display", "none");
		$('#idDivRightClickAPAClean').css("display","none");
		if(!activarSeleccionarAreaDesdeMapa) {
		}
		return true;
	});
	
	iniciarMapa();
		
	iniciarCapasBase();
	iniciarIdentificarAreaPorCriteriosLogicos();
	iniciarAnalizarPorArea();
	iniciarCapasUpload();
	
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
	
	var vectorWkt	= drawWkt();
	var layers = [vectorWkt];
//	var layers = [];
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
function drawWkt() {
	var currVector	= null;
	$.ajax({
		url: "wkt/test.wkt",
		type: "GET",
//		dataType:tipoDatoRetorno,
//		data:parametros,
		async:false,
		success:function(datos) {
			var wkt	= datos;
//			var wkt = 'POLYGON((10.689 -25.092, 34.595 ' +
//			'-20.170, 38.814 -35.639, 13.502 ' +
//			'-39.155, 10.689 -25.092))';

			var format = new ol.format.WKT();
			var feature = format.readFeature(wkt, {
				dataProjection: 'EPSG:4326',
				featureProjection: 'EPSG:3857'
			});
			currVector = new ol.layer.Vector({
				source: new ol.source.Vector({
					features: [feature]
				})
			});
		}
	});
	return currVector;
}
var vectorDraw = null;
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
		
		sourceDraw = new ol.source.Vector({wrapX: false});
		vectorDraw = new ol.layer.Vector({
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
		map.addLayer(vectorDraw);

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

function terminarInteraction() {
	if(map && draw) {
		
//		sourceDraw.clear(true);
//		var coll	= sourceDraw.getFeaturesCollection();
//		var array	= coll.getArray();
//		for(var i=0;i<array.length;i++) {
//			sourceDraw.removeFeature(array[i]);
//		}
		if(vectorDraw) {
			map.removeLayer(vectorDraw);
			vectorDraw	= null;
		}
		map.removeInteraction(draw);
	}
}

function reportePDF() {
	var frm		= document.form;
	frm.action	= "reporteCapas.action";
	frm.target	= "_blank";
	frm.submit();
	return false;
}
function exportarPNG() {
	/*
	var exportPNGElement = document.getElementById('export-png');
	map.once('postcompose', function(event) {
		var canvas = event.context.canvas;
		exportPNGElement.href = canvas.toDataURL('image/png');
//		ventanaNuevaURL(canvas.toDataURL('image/png'));
	});
	map.renderSync();
	*/
	

//	var exportPNGElement = $('#export-png');
	//if ('download' in exportPNGElement) {
//		exportPNGElement.click(function(e) {
			map.once('postcompose', function(event) {
				var canvas = event.context.canvas;
				alert(canvas.toDataURL('image/png'));
//				exportPNGElement.href = canvas.toDataURL('image/png');
			});
			map.renderSync();
//		}, false);
}
function ventanaNuevaURL(url) {
	var frm		= document.form;
	frm.action	= url;
	frm.target	= "_blank";
	frm.submit();
	return false;
}

//var exportPNGElement = document.getElementById('export-png');
/*
var exportPNGElement = $('#export-png');
//if ('download' in exportPNGElement) {
	exportPNGElement.click(function(e) {
		map.once('postcompose', function(event) {
			var canvas = event.context.canvas;
			exportPNGElement.href = canvas.toDataURL('image/png');
		});
		map.renderSync();
	}, false);
	*/
//} else {
//	alert("Mensaje de error");
//	var info = document.getElementById('no-download');
	/**
   * display error message
   */
//  info.style.display = '';
//}