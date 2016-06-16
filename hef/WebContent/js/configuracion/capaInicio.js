var oTableDefaultCapa			= null;
var responsiveHelperCapa		= undefined;
var breakpointDefinitionCapa	= {
	tablet: 1024,
	phone : 480
};

$(document).ready(function() {
	$('#idBtnSalirCapa').click(salir_capa);
	$('#idBtnConsultarCapa').click(buscar_basico_capa);
	$('#idBtnMostrarTodosCapa').click(mostrarTodos_capa);
	$('#idBtnNuevoCapa').click(nuevo_capa);
	$('select[name=buscar_intGrupoCapas]').change(buscar_basico_capa);
	instanciardt_basico_capa();

});

function mostrarTodos_capa() {
	deshabilitaBotones_capa(true);
	$("input[name=buscar_strNombre]").val("");
	$("input[name=buscar_strComentarios]").val("");
	buscar_basico_capa('');
}

function instanciardt_basico_capa(ejecutaBuscar) {
	oTableDefaultCapa = null;
	oTableDefaultCapa = $('#tableDefaultCapa').dataTable({
		autoWidth      : false,
		"pagingType"   : "simple",
		"searching"    : false,
        "info"         : false,
	    preDrawCallback: function () {
	        if (!responsiveHelperCapa) {
	            responsiveHelperCapa = new ResponsiveDatatablesHelper(oTableDefaultCapa, breakpointDefinitionCapa);
	        }
	    },
	    rowCallback    : function (nRow) {
	        responsiveHelperCapa.createExpandIcon(nRow);
	    },
	    drawCallback   : function (oSettings) {
	        responsiveHelperCapa.respond();
	    },
		"sDom": "<'row'<'col-md-12'f>> <'row' <'col-md-6'l><'col-md-6'p>>  t <'row'<'col-md-12'p i> >",
		"aaSorting": [],
		"oLanguage": {
			"sUrl": "tools/bootstrap-datatables/lang/spanish.json"
		},
		"aLengthMenu": [
		                [5, 25, 100, 200, -1],
		                [5, 25, 100, 200, "Todos"]
		],
		"sAjaxDataProp": "listCapa",
		"sAjaxSource": null,
		"aoColumns": [
				{"mData" : "intGrupoCapasDesc"},
				{"mData" : "intTipoCapaDesc"},
				{"mData" : "strNombre"},
				{"mData" : null}
		],
		"aoColumnDefs": [
		                 {
		                	 "aTargets": [3],
		                	 "mData": null,
		                	 "mRender": function (data, type, row) {
		                		 return '<div style="width:100px;"><button title="Editar" class="btn btn-primary btn_buscar_control_capa" onclick="editar_capa(\'' + row.srlIdCapa + '\');return false;"><i class="fa fa-edit"></i></button>&nbsp;&nbsp;&nbsp;';
//		                		 +'<button title="Eliminar" class="btn btn-danger btn_buscar_control_capa" onclick="eliminar_capa(\'' + row.srlIdCapa + '\');return false;"><i class="fa fa-trash-o"></i></button>'+'</div>';
		                	 }
		                 }
		],
		"fnInitComplete": function(oSettings, json) {
				buscar_basico_capa();
	    }
	});
}

function buscar_basico_capa() {
	deshabilitaBotones_capa(true);
	$('#loadAjax').modal('toggle');
	var request = ajaxRequest(ctx+"/buscarCapa.action", "POST", "json", $("#idFormBuscarCapa").serialize());
	request.done(function(json) {
		oTableDefaultCapa.fnClearTable();
		var oSettings = oTableDefaultCapa.fnSettings();
		oTableDefaultCapa.fnClearTable(this);
		for (var i=0; i<json.listCapa.length; i++) {
			oTableDefaultCapa.oApi._fnAddData(oSettings, json.listCapa[i]);
		}
		oSettings.aiDisplay = oSettings.aiDisplayMaster.slice();
		oTableDefaultCapa.fnDraw();
		$('#loadAjax').modal('toggle');
		deshabilitaBotones_capa(false);
	});
}

function nuevo_capa() {
	deshabilitaBotones_capa(true);
	var frm		= document.form;
	frm.action	= "nuevoCapa.action";
	frm.method	= "POST";
	frm.target	= "_self";
	frm.submit();
	return false;
}

function editar_capa(srlIdCapa) {
	deshabilitaBotones_capa(true);
	var frm		= document.form;
	frm.action	= "editarCapa.action";
	frm.method	= "POST";
	frm.target	= "_self";
	$('#buscar_seleccion_id').val(srlIdCapa);
	frm.submit();
	return false;
}

function salir_capa() {
	document.location.href = "home.action";
	return false;
}

function eliminar_capa(srlIdCapa) {
	$('#dialog-info-eliminar').dialog({
		width: 'auto',
		title: 'Eliminar registro:',
		modal: true,
		closeOnEscape: false,
	    buttons: {
	        'No': function() {
	        	$('#dialog-info-eliminar').dialog("close");
	        	return;
	        },
	        'Si': function() {
	        	var frm		= $("#form");
	        	$('#buscar_seleccion_id').val(srlIdCapa);
	        	$.post('eliminarCapa.action', frm.serialize(), function(datos) {
		    		if(datos.actionErrors.length > 0) {
		    			mostrarMensajesErrorStruts(datos.actionErrors);
		    		} else {
		    			mostrarMensajesStruts(datos.actionMessages);
		    		}
	    			buscar_basico_capa();
	        		$('#dialog-info-eliminar').dialog("close");
	        	}, "json");
	        }
		}
	});
}

function deshabilitaBotones_capa(deshabilitarBoton) {
	$('#idBtnSalirCapa').prop('disabled', deshabilitarBoton);
	$('#idBtnConsultarCapa').prop('disabled', deshabilitarBoton);
	$('#idBtnMostrarTodosCapa').prop('disabled', deshabilitarBoton);
	$('#idBtnNuevoCapa').prop('disabled', deshabilitarBoton);
	$(".btn_buscar_control_capa").each(function() {
		$(this).prop('disabled', deshabilitarBoton);
	});
}
