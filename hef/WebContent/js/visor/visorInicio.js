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
	
	$(document).bind('contextmenu', function(e) {
		return false;
	});
	$(document).bind('click', function(event) {
		$('#idDivRightClick').css("display", "none");
		$('#idDivRightClickClean').css("display", "none");
		$('#idDivRightClickAPAClean').css("display","none");
		//cerrarTodosPopover();
		if(!activarSeleccionarAreaDesdeMapa) {
		}
		//console.log("class="+$(event.target).attr("class"));
		if(!($(event.target).hasClass("clsPopoverMenuOpcion") || 
				$(event.target).hasClass("clsPopoverMenuAnalizarArea") || 
				$(event.target).hasClass("clsPopoverMenuCapasBase"))) {
			cerrarTodosPopover();
		}
		return true;
	});
	
	iniciarMapa();
	
	iniciarCapasBase();//Ok
	iniciarIdentificarAreaPorCriteriosLogicos();
	iniciarAnalizarPorArea();
	iniciarCapasUpload();
	iniciarMenuLateral();
	iniciarEfectosMouse();
	
	$(window).resize(function(_this, args) {
		actualizarTamanioGrafica();
	});
	//actualizarTamanioGrafica();
});
var actualizarTamanioGraficaTimeout	= null;
function actualizarTamanioGrafica() {
	if(actualizarTamanioGraficaTimeout) {
		clearTimeout(actualizarTamanioGraficaTimeout);
	}
	actualizarTamanioGraficaTimeout	= setTimeout(function(){
		actualizarTamanioGraficaTimeout	= null;
		actualizarTamanioGraficaExecute();
	}, 100);
}
function actualizarTamanioGraficaExecute() {
	if(view) {
		var center = ol.proj.transform(view.getCenter(), 'EPSG:3857', 'EPSG:4326');
		if(gmap) {
			gmap.setCenter(new google.maps.LatLng(center[1], center[0]));
		}
	}
	if(map) {
		map.updateSize();
	}	
	var doc_height		= $(document).height();
	//console.log("RESIZE...doc_height="+doc_height);
	$(".clsDivPanelLateralIzq").each(function(index){
		$(this).css("height", (doc_height-200)+"px");
	});
	$(".clsDivPanelLateralIzqRep").each(function(index){
		$(this).css("height", (doc_height-200)+"px");
	});
	
	//$("#idDivPanelLateralIzq").css("height", (doc_width-190)+"px");
	//console.log("PANEL-LAT: "+(doc_width-190)+"px");
}
var map			= null;
var sourceDraw	= null;
var draw		= null; // global so we can remove it later
function cambiarGoogle(_this, mapTypeId) {
	/*
	$(".clsGoogle").each(function(index) {
		$(this).removeClass("fa-check");
		$(this).addClass("fa-circle-o");
	});
	$(_this).find(".clsGoogle").removeClass("fa-circle-o");
	$(_this).find(".clsGoogle").addClass("fa-check");
	*/
	if(mapTypeId == google.maps.MapTypeId.ROADMAP) {
		$("#idPopoverMenuCapasBase").html("<span class=\"glyphicon glyphicon-globe\"></span> Cartogr&aacute;fica");
		$("#idPopoverMenuCapasBase").attr("curr-vista", "ROADMAP");
		cerrarPopoverCapasBase();
	} else if(mapTypeId == google.maps.MapTypeId.SATELLITE) {
		$("#idPopoverMenuCapasBase").html("<span class=\"glyphicon glyphicon-globe\"></span> Satelital");
		$("#idPopoverMenuCapasBase").attr("curr-vista", "SATELLITE");
		cerrarPopoverCapasBase();
	} else if(mapTypeId == google.maps.MapTypeId.HYBRID) {
		$("#idPopoverMenuCapasBase").html("<span class=\"glyphicon glyphicon-globe\"></span> Cartografica y Satelital");
		$("#idPopoverMenuCapasBase").attr("curr-vista", "HYBRID");
		cerrarPopoverCapasBase();
	} else if(mapTypeId == google.maps.MapTypeId.TERRAIN) {
		$("#idPopoverMenuCapasBase").html("<span class=\"glyphicon glyphicon-globe\"></span> Topografica");
		$("#idPopoverMenuCapasBase").attr("curr-vista", "TERRAIN");
		cerrarPopoverCapasBase();
	}
	gmap.setMapTypeId(mapTypeId);
}
var gmap = null;
var view = null;
var postrenderok = false;
function iniciarMapa() {
	if(google) {
		gmap	= new google.maps.Map(document.getElementById('gmap'), {
			disableDefaultUI: true,
			keyboardShortcuts: false,
			draggable: false,
			disableDoubleClickZoom: true,
			scrollwheel: false,
			streetViewControl: false,
			mapTypeId: google.maps.MapTypeId.ROADMAP
			//mapTypeId: google.maps.MapTypeId.SATELLITE
			//mapTypeId: google.maps.MapTypeId.HYBRID
			//mapTypeId: google.maps.MapTypeId.TERRAIN
		});
		$("#idPopoverMenuCapasBase").attr("curr-vista", "ROADMAP");
		gmap.addListener("idle", function() {
			//console.log("google idle...OK");
			setTimeout(function(){actualizarTamanioGrafica();}, 2000);
		});
	}
	view = new ol.View({
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
	
//	var vectorWkt	= drawWkt();
//	var layers = [vectorWkt];
	var layers = [];
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
	/*
	map.getViewport().addEventListener("click", function(e) {
	    map.forEachFeatureAtPixel(map.getEventPixel(e), function (feature, layer) {
	        //do something
	    }
	};
	*/
	
	map.once('postcompose', function(event) {
		setTimeout(function(){actualizarTamanioGrafica();}, 2000);
	});
	/*
	map.renderSync();
	map.on("postrender", function() {
		console.log("postrender...UHF");
		if(!postrenderok) {
			console.log("postrender...OK");
			actualizarTamanioGrafica();
			postrenderok = true;
		} else {
			console.log("postrender...UHF");
			if(map) {
				map.updateSize();
			}
		}
		return true;
	});
	*/
	map.getViewport().addEventListener('contextmenu', function (e) { // or $(map.getViewport()).on('contextmenu', function(e) with jQuery
//	map.getViewport().addEventListener('click', function (e) { // or $(map.getViewport()).on('contextmenu', function(e) with jQuery
		var pix		= map.getEventPixel(e);
		eventoMenuContextualSeleccionarAreaDesdeMapa(pix, e);
		
//		WKT=POINT(-74.454345703125 -6.659151487659315) visorInicioAnalizarPorArea.js:287:3
//		WKT2=POINT(-8288219.851018231 -742967.9149319133)
		var coord	= map.getCoordinateFromPixel(pix);
		var point	= new ol.geom.Point(coord);
		var feature = new ol.Feature({geometry: point});
		var format	= new ol.format.WKT();
		var wkt		= format.writeFeature(feature, {
			dataProjection: 'EPSG:4326',
			featureProjection: 'EPSG:3857'
		});
		
		var featureRS = format.readFeature(wkt, {
			dataProjection: 'EPSG:4326'
		});
		var arrCoord	= featureRS.getGeometry().getCoordinates();
		var chicago		= new google.maps.LatLng(arrCoord[1], arrCoord[0]);
		//var chicago = new google.maps.LatLng(-9.253936156814447, -74.454345703125);
		
	    //e.preventDefault();
	    return false;
	});
	
}

var TILE_SIZE = 256;

function createInfoWindowContent(latLng, zoom) {
	var scale = 1 << zoom;

	var worldCoordinate = project(latLng);

	var pixelCoordinate = new google.maps.Point(Math.floor(worldCoordinate.x * scale), Math.floor(worldCoordinate.y * scale));
	
	var xTileCoord	= Math.floor(worldCoordinate.x * scale / TILE_SIZE);
	var yTileCoord	= Math.floor(worldCoordinate.y * scale / TILE_SIZE);
	var tileCoordinate = new google.maps.Point((xTileCoord), (yTileCoord));

	var xTileCoordDif	= (worldCoordinate.x * scale / TILE_SIZE) - xTileCoord;
	var yTileCoordDif	= (worldCoordinate.y * scale / TILE_SIZE) - yTileCoord;
	var tileRevCoordinate = new google.maps.Point((xTileCoordDif/scale*TILE_SIZE), (yTileCoordDif/scale*TILE_SIZE));

	return [
	        'zoom:'+zoom,
	        'scale:'+scale,
		    'LatLng:' + latLng.lng() + ',' + latLng.lat(),
		    'Zoom:' + zoom,
		    'World:' + worldCoordinate,
		    'Pixel:' + pixelCoordinate,
		    'Tile:' + tileCoordinate,
		    'TileRev:' + tileRevCoordinate
		  ].join('  ');
}

// The mapping between latitude, longitude and pixels is defined by the web
// mercator projection.
function project(latLng) {
	var siny = Math.sin(latLng.lat() * Math.PI / 180);

	// Truncating to 0.9999 effectively limits latitude to 89.189. This is
	// about a third of a tile past the edge of the world tile.
	siny = Math.min(Math.max(siny, -0.9999), 0.9999);

	return new google.maps.Point(
	      TILE_SIZE * (0.5 + latLng.lng() / 360),
	      TILE_SIZE * (0.5 - Math.log((1 + siny) / (1 - siny)) / (4 * Math.PI)));
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
    var format = new ol.format.WKT();
    var wkt = format.writeFeature(event.feature, {
      dataProjection: 'EPSG:4326',
      featureProjection: 'EPSG:3857'
    });
    //console.log("WKT="+wkt);
    terminarInteraction();
    procesarAnalizarPorArea(wkt);//Dibujar rectangulo y poligono en pantalla
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
	cerrarTodosPopover();
	var frm				= document.form;
	frm.action			= "reporteCapas.action";
	frm.target			= "_blank";
	frm.submit();
	return false;
}

function reportePNG(keyImagen) {
	cerrarTodosPopover();
	var url	= "download.action?strImagenReporte="+keyImagen;
	window.open(url);
	return false;
}

function reporteCSV() {
	cerrarTodosPopover();
	if(ultimoReporteVisor) {
		var frm				= document.form;
		frm.action			= "paginas/consulta/rep-csv/" + ultimoReporteVisor + "CSV.jsp";
		frm.target			= "_blank";
		frm.submit();
	} else {
		alert("Debe seleccionar una capa de las encontradas en el reporte");
	}
	return false;
}

/*
function exportarPNG() {
	map.once('postcompose', function(event) {
		var canvas = event.context.canvas;
		alert(canvas.toDataURL('image/png'));
	});
	map.renderSync();
}
*/
function ventanaNuevaURL(url) {
	var frm		= document.form;
	frm.action	= url;
	frm.target	= "_blank";
	frm.submit();
	return false;
}
function iniciarMenuLateral() {
	var strHandles	= "e";
	$("#idDivMenuLateral").resizable({
		handles: strHandles, 
		minWidth: 1,
		start: function(event, ui) {
			console.log("startResize()");
		},
		stop: function(event, ui) {
			console.log("stopResize()");
		}
	});
}
function iniciarEfectosMouse() {
//	$(".clsSliderColXs2").each(function() {
//		$(this).find(".clsSlider").css("height", $(this).parent().css("height"));
//		$(this).mouseover(function (event) {
//			$(this).css("background-color","#F7F7F7");
//		});
//		$(this).mouseout(function (event) {
//			$(this).css("background-color","#FFFFFF");
//		});
//	});
}
