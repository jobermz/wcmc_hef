var oTableDefaultCapaUmbral			= null;
var responsiveHelperCapaUmbral		= undefined;
var breakpointDefinitionCapaUmbral	= {
	tablet: 1024,
	phone : 480
};
$(document).ready(function() {

});




function mostrarTodos_capa_umbral() {
	deshabilitaBotones_capa_umbral(true);
	$("input[name=buscar_strNombre]").val("");
	buscar_basico_capa_umbral('');
}
function instanciardt_basico_capa_umbral(ejecutaBuscar) {
	oTableDefaultCapaUmbral = null;
	oTableDefaultCapaUmbral = $('#tableDefaultCapaUmbral').dataTable({
		autoWidth      : false,
		"pagingType"   : "simple",
		"paging"       : false,
		"searching"    : false,
        "info"         : false,
	    preDrawCallback: function () {
	        if (!responsiveHelperCapaUmbral) {
	            responsiveHelperCapaUmbral = new ResponsiveDatatablesHelper(oTableDefaultCapaUmbral, breakpointDefinitionCapaUmbral);
	        }
	    },
	    rowCallback    : function (nRow) {
	        responsiveHelperCapaUmbral.createExpandIcon(nRow);
	    },
	    drawCallback   : function (oSettings) {
	        responsiveHelperCapaUmbral.respond();
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
		"sAjaxDataProp": "listCapaUmbral",
		"sAjaxSource": null,
		"aoColumns": [
//				{"mData" : "intIdCapa"},
				{"mData" : "strNombre"},
				{"mData" : "dblValorMinimo"},
				{"mData" : "dblValorMaximo"},
				{"mData" : "strNroLayer"},
				{"mData" : null}
		],
		"aoColumnDefs": [
		                 {
		                	 "aTargets": [4],
		                	 "mData": null,
		                	 "mRender": function (data, type, row) {
		                		 return '<div style="width:100px;"><button title="Editar" class="btn btn-primary btn_buscar_control_capa_umbral" onclick="editar_capa_umbral(\'' + row.srlIdCapaUmbral + '\');return false;"><i class="fa fa-edit"></i></button>&nbsp;&nbsp;&nbsp;'
		                		 +'<button title="Eliminar" class="btn btn-danger btn_buscar_control_capa_umbral" onclick="eliminar_capa_umbral(\'' + row.srlIdCapaUmbral + '\');return false;"><i class="fa fa-trash-o"></i></button>'+'</div>';
		                	 }
		                 }
		],
		"fnInitComplete": function(oSettings, json) {
			if(ejecutaBuscar) {
				buscar_basico_capa_umbral();
			}
	    }
	});
}
function buscar_basico_capa_umbral() {
	if(!oTableDefaultCapaUmbral) {
		instanciardt_basico_capa_umbral();
	}
	var request = ajaxRequest(ctx+"/buscarCapaUmbral.action", "POST", "json", $("#idFormBuscarCapaUmbral").serialize());
	request.done(function(json) {
		oTableDefaultCapaUmbral.fnClearTable();
		var oSettings = oTableDefaultCapaUmbral.fnSettings();
		oTableDefaultCapaUmbral.fnClearTable(this);
		for (var i=0; i<json.listCapaUmbral.length; i++) {
			oTableDefaultCapaUmbral.oApi._fnAddData(oSettings, json.listCapaUmbral[i]);
		}
		oSettings.aiDisplay = oSettings.aiDisplayMaster.slice();
		oTableDefaultCapaUmbral.fnDraw();
		deshabilitaBotones_capa_umbral(false);
	});
}
function nuevo_capa_umbral() {
	$('.editar-umbral-modal').off('shown.bs.modal');
	$('.editar-umbral-modal').off('hidden.bs.modal');
	$('.editar-umbral-modal').on('shown.bs.modal', function (e) {
		$.post('nuevoCapaUmbral.action', null, function(datos) {
			$("#idDivEditarCapaUmbral").html(datos);
			iniciarEventosDialogEditar_capa_umbral(false);
			deshabilitaBotones_capa_umbral(false);
		});
	});
	$('.editar-umbral-modal').on('hidden.bs.modal', function (e) {
//		finalizarAllEventListenerIframe();
		buscar_basico_capa_umbral();
	});
	$('.editar-umbral-modal').modal('show');


//	deshabilitaBotones_capa_umbral(true);
//	var frm		= document.form;
//	frm.action	= "nuevoCapaUmbral.action";
//	frm.method	= "POST";
//	frm.target	= "_self";
//	frm.submit();
	return false;
}

function editar_capa_umbral(srlIdCapaUmbral) {
	deshabilitaBotones_capa_umbral(true);
	$('.editar-umbral-modal').off('shown.bs.modal');
	$('.editar-umbral-modal').off('hidden.bs.modal');
	$('.editar-umbral-modal').on('shown.bs.modal', function (e) {
		$.post('editarCapaUmbral.action', {"buscar_seleccion_id":srlIdCapaUmbral}, function(datos) {
			$("#idDivEditarCapaUmbral").html(datos);
			iniciarEventosDialogEditar_capa_umbral(true);
			deshabilitaBotones_capa_umbral(false);
		});
	});
	$('.editar-umbral-modal').on('hidden.bs.modal', function (e) {
//		finalizarAllEventListenerIframe();
		buscar_basico_capa_umbral();
	});
	$('.editar-umbral-modal').modal('show');

//	deshabilitaBotones_capa_umbral(true);
//	var frm		= document.form;
//	frm.action	= "editarCapaUmbral.action";
//	frm.method	= "POST";
//	frm.target	= "_self";
//	$('#buscar_seleccion_id').val(srlIdCapaUmbral);
//	frm.submit();
	
	return false;
}
function salir_capa_umbral() {
	document.location.href = "home.action";
	return false;
}

function eliminar_capa_umbral(srlIdCapaUmbral) {
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
	        	$('#buscar_seleccion_id').val(srlIdCapaUmbral);
	        	$.post('eliminarCapaUmbral.action', frm.serialize(), function(datos) {
		    		if(datos.actionErrors.length > 0) {
		    			mostrarMensajesErrorStruts(datos.actionErrors);
		    		} else {
		    			mostrarMensajesStruts(datos.actionMessages);
		    		}
	    			buscar_basico_capa_umbral();
	        		$('#dialog-info-eliminar').dialog("close");
	        	}, "json");
	        }
		}
	});
	
}


function deshabilitaBotones_capa_umbral(deshabilitarBoton) {

}

