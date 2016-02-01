var oTableDefaultGrupoCapas			= null;
var responsiveHelperGrupoCapas		= undefined;
var breakpointDefinitionGrupoCapas	= {
	tablet: 1024,
	phone : 480
};
$(document).ready(function() {
	$('#idBtnSalirGrupoCapas').click(salir_grupo_capas);
	$('#idBtnConsultarGrupoCapas').click(buscar_basico_grupo_capas);
	$('#idBtnMostrarTodosGrupoCapas').click(mostrarTodos_grupo_capas);
	$('#idBtnNuevoGrupoCapas').click(nuevo_grupo_capas);
	instanciardt_basico_grupo_capas();

});




function mostrarTodos_grupo_capas() {
	deshabilitaBotones_grupo_capas(true);
	$("input[name=buscar_strNombre]").val("");
	buscar_basico_grupo_capas('');
}
function instanciardt_basico_grupo_capas(ejecutaBuscar) {
	oTableDefaultGrupoCapas = null;
	oTableDefaultGrupoCapas = $('#tableDefaultGrupoCapas').dataTable({
		autoWidth      : false,
	    preDrawCallback: function () {
	        if (!responsiveHelperGrupoCapas) {
	            responsiveHelperGrupoCapas = new ResponsiveDatatablesHelper(oTableDefaultGrupoCapas, breakpointDefinitionGrupoCapas);
	        }
	    },
	    rowCallback    : function (nRow) {
	        responsiveHelperGrupoCapas.createExpandIcon(nRow);
	    },
	    drawCallback   : function (oSettings) {
	        responsiveHelperGrupoCapas.respond();
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
		"sAjaxDataProp": "listGrupoCapas",
		"sAjaxSource": null,
		"aoColumns": [
				{"mData" : "strNombre"},
				{"mData" : "intOrden"},
				{"mData" : null}
		],
		"aoColumnDefs": [
		                 {
		                	 "aTargets": [2],
		                	 "mData": null,
		                	 "mRender": function (data, type, row) {
		                		 return '<div style="width:100px;"><button title="Editar" class="btn btn-primary btn_buscar_control_grupo_capas" onclick="editar_grupo_capas(\'' + row.srlIdGrupoCapas + '\');return false;"><i class="fa fa-edit"></i></button>&nbsp;&nbsp;&nbsp;'
		                		 +'<button title="Eliminar" class="btn btn-danger btn_buscar_control_grupo_capas" onclick="eliminar_grupo_capas(\'' + row.srlIdGrupoCapas + '\');return false;"><i class="fa fa-trash-o"></i></button>'+'</div>';
		                	 }
		                 }
		],
		"fnInitComplete": function(oSettings, json) {
				buscar_basico_grupo_capas();
	    }
	});
}
function buscar_basico_grupo_capas() {
	deshabilitaBotones_grupo_capas(true);
	$('#loadAjax').modal('toggle');
	var request = ajaxRequest(ctx+"/buscarGrupoCapas.action", "POST", "json", $("#idFormBuscarGrupoCapas").serialize());
	request.done(function(json) {
		oTableDefaultGrupoCapas.fnClearTable();
		var oSettings = oTableDefaultGrupoCapas.fnSettings();
		oTableDefaultGrupoCapas.fnClearTable(this);
		for (var i=0; i<json.listGrupoCapas.length; i++) {
			oTableDefaultGrupoCapas.oApi._fnAddData(oSettings, json.listGrupoCapas[i]);
		}
		oSettings.aiDisplay = oSettings.aiDisplayMaster.slice();
		oTableDefaultGrupoCapas.fnDraw();
		$('#loadAjax').modal('toggle');
		deshabilitaBotones_grupo_capas(false);
	});
}
function nuevo_grupo_capas() {
	deshabilitaBotones_grupo_capas(true);
	var frm		= document.form;
	frm.action	= "nuevoGrupoCapas.action";
	frm.method	= "POST";
	frm.target	= "_self";
	frm.submit();
	return false;
}

function editar_grupo_capas(srlIdGrupoCapas) {
	deshabilitaBotones_grupo_capas(true);
	var frm		= document.form;
	frm.action	= "editarGrupoCapas.action";
	frm.method	= "POST";
	frm.target	= "_self";
	$('#buscar_seleccion_id').val(srlIdGrupoCapas);
	frm.submit();
	
	return false;
}
function salir_grupo_capas() {
	document.location.href = "home.action";
	return false;
}

function eliminar_grupo_capas(srlIdGrupoCapas) {
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
	        	$('#buscar_seleccion_id').val(srlIdGrupoCapas);
	        	$.post('eliminarGrupoCapas.action', frm.serialize(), function(datos) {
		    		if(datos.actionErrors.length > 0) {
		    			mostrarMensajesErrorStruts(datos.actionErrors);
		    		} else {
		    			mostrarMensajesStruts(datos.actionMessages);
		    		}
	    			buscar_basico_grupo_capas();
	        		$('#dialog-info-eliminar').dialog("close");
	        	}, "json");
	        }
		}
	});
	
}


function deshabilitaBotones_grupo_capas(deshabilitarBoton) {
	$('#idBtnSalirGrupoCapas').prop('disabled', deshabilitarBoton);
	$('#idBtnConsultarGrupoCapas').prop('disabled', deshabilitarBoton);
	$('#idBtnMostrarTodosGrupoCapas').prop('disabled', deshabilitarBoton);
	$('#idBtnNuevoGrupoCapas').prop('disabled', deshabilitarBoton);
	$(".btn_buscar_control_grupo_capas").each(function() {
		$(this).prop('disabled', deshabilitarBoton);
	});

}

