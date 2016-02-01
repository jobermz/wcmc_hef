var oTableDefaultCapasBase			= null;
var responsiveHelperCapasBase		= undefined;
var breakpointDefinitionCapasBase	= {
	tablet: 1024,
	phone : 480
};
$(document).ready(function() {
	$('#idBtnSalirCapasBase').click(salir_capas_base);
	$('#idBtnConsultarCapasBase').click(buscar_basico_capas_base);
	$('#idBtnMostrarTodosCapasBase').click(mostrarTodos_capas_base);
	$('#idBtnNuevoCapasBase').click(nuevo_capas_base);
	instanciardt_basico_capas_base();

});




function mostrarTodos_capas_base() {
	deshabilitaBotones_capas_base(true);
	$("input[name=buscar_strNombre]").val("");
	$("input[name=buscar_strComentarios]").val("");
	buscar_basico_capas_base('');
}
function instanciardt_basico_capas_base(ejecutaBuscar) {
	oTableDefaultCapasBase = null;
	oTableDefaultCapasBase = $('#tableDefaultCapasBase').dataTable({
		autoWidth      : false,
	    preDrawCallback: function () {
	        if (!responsiveHelperCapasBase) {
	            responsiveHelperCapasBase = new ResponsiveDatatablesHelper(oTableDefaultCapasBase, breakpointDefinitionCapasBase);
	        }
	    },
	    rowCallback    : function (nRow) {
	        responsiveHelperCapasBase.createExpandIcon(nRow);
	    },
	    drawCallback   : function (oSettings) {
	        responsiveHelperCapasBase.respond();
	    },
		"sDom": "<'row'<'col-md-12'f>> <'row' <'col-md-6'l><'col-md-6'p>>  t <'row'<'col-md-12'p i> >",
		"aaSorting": [],
		"oLanguage": {
			"sUrl": "tools/bootstrap-datatables/lang/spanish.json"
		},
		"aLengthMenu": [
		                [25, 50, 100, 200, -1],
		                [25, 50, 100, 200, "Todos"]
		],
		"sAjaxDataProp": "listCapasBase",
		"sAjaxSource": null,
		"aoColumns": [
				{"mData" : "strNombre"},
				{"mData" : "timFechaRegistroFechaHora"},
				{"mData" : "intGrupoCapasDesc"},
				{"mData" : null}
		],
		"aoColumnDefs": [
		                 {
		                	 "aTargets": [3],
		                	 "mData": null,
		                	 "mRender": function (data, type, row) {
		                		 return '<div style="width:100px;"><button title="Editar" class="btn btn-primary btn_buscar_control_capas_base" onclick="editar_capas_base(\'' + row.srlIdCapasBase + '\');return false;"><i class="fa fa-edit"></i></button>&nbsp;&nbsp;&nbsp;'
		                		 +'<button title="Eliminar" class="btn btn-danger btn_buscar_control_capas_base" onclick="eliminar_capas_base(\'' + row.srlIdCapasBase + '\');return false;"><i class="fa fa-trash-o"></i></button>'+'</div>';
		                	 }
		                 }
		],
		"fnInitComplete": function(oSettings, json) {
				buscar_basico_capas_base();
	    }
	});
}
function buscar_basico_capas_base() {
	deshabilitaBotones_capas_base(true);
	$('#loadAjax').modal('toggle');
	var request = ajaxRequest(ctx+"/buscarCapasBase.action", "POST", "json", $("#idFormBuscarCapasBase").serialize());
	request.done(function(json) {
		oTableDefaultCapasBase.fnClearTable();
		var oSettings = oTableDefaultCapasBase.fnSettings();
		oTableDefaultCapasBase.fnClearTable(this);
		for (var i=0; i<json.listCapasBase.length; i++) {
			oTableDefaultCapasBase.oApi._fnAddData(oSettings, json.listCapasBase[i]);
		}
		oSettings.aiDisplay = oSettings.aiDisplayMaster.slice();
		oTableDefaultCapasBase.fnDraw();
		$('#loadAjax').modal('toggle');
		deshabilitaBotones_capas_base(false);
	});
}
function nuevo_capas_base() {
	deshabilitaBotones_capas_base(true);
	var frm		= document.form;
	frm.action	= "nuevoCapasBase.action";
	frm.method	= "POST";
	frm.target	= "_self";
	frm.submit();
	return false;
}

function editar_capas_base(srlIdCapasBase) {
	deshabilitaBotones_capas_base(true);
	var frm		= document.form;
	frm.action	= "editarCapasBase.action";
	frm.method	= "POST";
	frm.target	= "_self";
	$('#buscar_seleccion_id').val(srlIdCapasBase);
	frm.submit();
	
	return false;
}
function salir_capas_base() {
	document.location.href = "home.action";
	return false;
}

function eliminar_capas_base(srlIdCapasBase) {
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
	        	$('#buscar_seleccion_id').val(srlIdCapasBase);
	        	$.post('eliminarCapasBase.action', frm.serialize(), function(datos) {
		    		if(datos.actionErrors.length > 0) {
		    			mostrarMensajesErrorStruts(datos.actionErrors);
		    		} else {
		    			mostrarMensajesStruts(datos.actionMessages);
		    		}
	    			buscar_basico_capas_base();
	        		$('#dialog-info-eliminar').dialog("close");
	        	}, "json");
	        }
		}
	});
	
}


function deshabilitaBotones_capas_base(deshabilitarBoton) {
	$('#idBtnSalirCapasBase').prop('disabled', deshabilitarBoton);
	$('#idBtnConsultarCapasBase').prop('disabled', deshabilitarBoton);
	$('#idBtnMostrarTodosCapasBase').prop('disabled', deshabilitarBoton);
	$('#idBtnNuevoCapasBase').prop('disabled', deshabilitarBoton);
	$(".btn_buscar_control_capas_base").each(function() {
		$(this).prop('disabled', deshabilitarBoton);
	});

}

