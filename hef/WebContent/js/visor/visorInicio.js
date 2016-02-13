$(document).ready(function() {
	goog.require('ol.Map');
	goog.require('ol.View');
	goog.require('ol.layer.Tile');
	goog.require('ol.source.MapQuest');
	goog.require('ol.source.TileArcGISRest');
	goog.require('ol.proj');
	
	$('.seleccionar-capas').click(seleccionarCapas);
	$('.consulta-analitica').click(consultaAnalitica);
	$('.upload-capas').click(uploadCapas);
	iniciarMapa();
	iniciarCapasBase();
	$('.collapse').collapse();
	iniciarMarcarCapas();
	marcarCapas();
});
var map = null;
function iniciarMapa() {
	
	var gmap = new google.maps.Map(document.getElementById('gmap'), {
		  disableDefaultUI: true,
		  keyboardShortcuts: false,
		  draggable: false,
		  disableDoubleClickZoom: true,
		  scrollwheel: false,
		  streetViewControl: false,
		  mapTypeId: google.maps.MapTypeId.SATELLITE
		});
//	MapTypeId.ROADMAP displays the default road map view. This is the default map type.
//	MapTypeId.SATELLITE displays Google Earth satellite images
//	MapTypeId.HYBRID displays a mixture of normal and satellite views
//	MapTypeId.TERRAIN displays a physical map based on terrain information.
		var view = new ol.View({
		  // make sure the view doesn't go beyond the 22 zoom levels of Google Maps
		  maxZoom: 21,
		  minZoom: 5,
		  extent: [-9199616.97582139,-2126814.61366579,-7603789.69645505,-767.505336264896]
		  //extent: ol.proj.transform([-307327.143633909,7908231.77821119,1206672.85636609,9999231.77821119],'EPSG:32718', 'EPSG:3857')
		/*
minx=-9199616.97582139
miny=-768.948333529314
maxx=-7603789.69645505
maxy=-2126814.61366579

minx=-9199616.97582139
miny=-2126814.61366579
maxx=-7603789.69645505
maxy=-767.505336264896
		*/
//		  center: [-8524257, -1311047],
//	      zoom: 5
//		  projection: 'EPSG:3857',
//		  projection: 'EPSG:4326'
		});
		view.on('change:center', function() {
			var center = ol.proj.transform(view.getCenter(), 'EPSG:3857', 'EPSG:4326');
//			var center = view.getCenter();
			gmap.setCenter(new google.maps.LatLng(center[1], center[0]));
		});
		view.on('change:resolution', function() {
		  gmap.setZoom(view.getZoom());
		});

	  var layers = [
//		new ol.layer.Vector({
//		  source: new ol.source.Vector({
//			  url: 'tools/ol.v3.13/countries.geojson',
//			  format: new ol.format.GeoJSON()
//		  }),
//		  style: new ol.style.Style({
//		    fill: new ol.style.Fill({
//		      color: 'rgba(255, 255, 255, 0.6)'
//		    }),
//		    stroke: new ol.style.Stroke({
//		      color: '#319FD3',
//		      width: 1
//		    })
//		  })
//		})
//	    new ol.layer.Tile({
//	      source: new ol.source.MapQuest({layer: 'sat'})
//	    })
	  ];
	  
	  
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
//	  center: [-8524257, -1311047],
//	  view.setCenter([-74, -9]);
	  view.setCenter([-8524257, -1011047]);
	  view.setZoom(5);

	  olMapDiv.parentNode.removeChild(olMapDiv);
	  gmap.controls[google.maps.ControlPosition.TOP_LEFT].push(olMapDiv);

}
var fn_iniciarComponentes	= null;
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
//		var edicion_videoDto_srlId						= $("input[name='edicion_videoDto.srlId']").val();
//		var frm		= $("#form");
//		$('#buscar_seleccion_id').val(edicion_videoDto_srlId);
//		$.post('previsualizarVideoHome.action', frm.serialize(), function(datos) {
//			$("#idDivPrevisualizarVideo").html(datos);
//		});
		if(!fn_iniciarComponentes) {
			iniciarComponentes();
			fn_iniciarComponentes = iniciarComponentes;
		}
	});
	$('.seleccionar-capas-modal').on('hidden.bs.modal', function (e) {
//		finalizarAllEventListenerIframe();
//		if($('.seleccionar-capas-modal').length > 0) {
//			var iframes = $('.seleccionar-capas-modal')[0].getElementsByTagName('iframe');
//			for (var i = 0; i < iframes.length; i++) {
//			    iframes[i].parentNode.removeChild(iframes[i]);
//			}
//		}
//		$("#idDivPrevisualizarVideo").html("");
//		deshabilitaBotones_videosInteractivos(false);
	});
	$('.seleccionar-capas-modal').modal('show');
	
}

function consultaAnalitica() {
	$('.consulta-analitica-modal').off('shown.bs.modal');
	$('.consulta-analitica-modal').off('hidden.bs.modal');
	$('.consulta-analitica-modal').on('shown.bs.modal', function (e) {
//		$.post('previsualizarVideoHome.action', frm.serialize(), function(datos) {
	});
	$('.consulta-analitica-modal').on('hidden.bs.modal', function (e) {
//		finalizarAllEventListenerIframe();
	});
	$('.consulta-analitica-modal').modal('show');

}

function uploadCapas() {
	$('.upload-capas-modal').off('shown.bs.modal');
	$('.upload-capas-modal').off('hidden.bs.modal');
	$('.upload-capas-modal').on('shown.bs.modal', function (e) {
//		$.post('previsualizarVideoHome.action', frm.serialize(), function(datos) {
	});
	$('.upload-capas-modal').on('hidden.bs.modal', function (e) {
//		finalizarAllEventListenerIframe();
	});
	$('.upload-capas-modal').modal('show');

}
