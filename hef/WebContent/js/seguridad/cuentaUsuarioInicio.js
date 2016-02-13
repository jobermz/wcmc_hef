var oTableDefaultCuentaUsuario			= null;
var responsiveHelperCuentaUsuario		= undefined;
var breakpointDefinitionCuentaUsuario	= {
	tablet: 1024,
	phone : 480
};
$(document).ready(function() {
	$('#idBtnSalirCuentaUsuario').click(salir_cuenta_usuario);
	$('#idBtnConsultarCuentaUsuario').click(buscar_basico_cuenta_usuario);
	$('#idBtnMostrarTodosCuentaUsuario').click(mostrarTodos_cuenta_usuario);
	$('#idBtnNuevoCuentaUsuario').click(nuevo_cuenta_usuario);
	instanciardt_basico_cuenta_usuario();

});




function mostrarTodos_cuenta_usuario() {
	deshabilitaBotones_cuenta_usuario(true);
	$("input[name=buscar_strNombres]").val("");
	$("input[name=buscar_strUsuario]").val("");
	$("input[name=buscar_strEsActivo]").val("");
	buscar_basico_cuenta_usuario('');
}
function instanciardt_basico_cuenta_usuario(ejecutaBuscar) {
	oTableDefaultCuentaUsuario = null;
	oTableDefaultCuentaUsuario = $('#tableDefaultCuentaUsuario').dataTable({
		autoWidth      : false,
		"pagingType"   : "simple",
		"searching"    : false,
        "info"         : false,
	    preDrawCallback: function () {
	        if (!responsiveHelperCuentaUsuario) {
	            responsiveHelperCuentaUsuario = new ResponsiveDatatablesHelper(oTableDefaultCuentaUsuario, breakpointDefinitionCuentaUsuario);
	        }
	    },
	    rowCallback    : function (nRow) {
	        responsiveHelperCuentaUsuario.createExpandIcon(nRow);
	    },
	    drawCallback   : function (oSettings) {
	        responsiveHelperCuentaUsuario.respond();
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
		"sAjaxDataProp": "listCuentaUsuario",
		"sAjaxSource": null,
		"aoColumns": [
				{"mData" : "intPerfilDesc"},
				{"mData" : "strNombres"},
				{"mData" : "strApellidos"},
				{"mData" : "strUsuario"},
				{"mData" : null}
		],
		"aoColumnDefs": [
		                 {
		                	 "aTargets": [4],
		                	 "mData": null,
		                	 "mRender": function (data, type, row) {
		                		 return '<div style="width:100px;"><button title="Editar" class="btn btn-primary btn_buscar_control_cuenta_usuario" onclick="editar_cuenta_usuario(\'' + row.srlId + '\');return false;"><i class="fa fa-edit"></i></button>&nbsp;&nbsp;&nbsp;'
		                		 +'<button title="Eliminar" class="btn btn-danger btn_buscar_control_cuenta_usuario" onclick="eliminar_cuenta_usuario(\'' + row.srlId + '\');return false;"><i class="fa fa-trash-o"></i></button>'+'</div>';
		                	 }
		                 }
		],
		"fnInitComplete": function(oSettings, json) {
				buscar_basico_cuenta_usuario();
	    }
	});
}
function buscar_basico_cuenta_usuario() {
	deshabilitaBotones_cuenta_usuario(true);
	$('#loadAjax').modal('toggle');
	var request = ajaxRequest(ctx+"/buscarCuentaUsuario.action", "POST", "json", $("#idFormBuscarCuentaUsuario").serialize());
	request.done(function(json) {
		oTableDefaultCuentaUsuario.fnClearTable();
		var oSettings = oTableDefaultCuentaUsuario.fnSettings();
		oTableDefaultCuentaUsuario.fnClearTable(this);
		for (var i=0; i<json.listCuentaUsuario.length; i++) {
			oTableDefaultCuentaUsuario.oApi._fnAddData(oSettings, json.listCuentaUsuario[i]);
		}
		oSettings.aiDisplay = oSettings.aiDisplayMaster.slice();
		oTableDefaultCuentaUsuario.fnDraw();
		$('#loadAjax').modal('toggle');
		deshabilitaBotones_cuenta_usuario(false);
	});
}
function nuevo_cuenta_usuario() {
	deshabilitaBotones_cuenta_usuario(true);
	var frm		= document.form;
	frm.action	= "nuevoCuentaUsuario.action";
	frm.method	= "POST";
	frm.target	= "_self";
	frm.submit();
	return false;
}

function editar_cuenta_usuario(srlId) {
	deshabilitaBotones_cuenta_usuario(true);
	var frm		= document.form;
	frm.action	= "editarCuentaUsuario.action";
	frm.method	= "POST";
	frm.target	= "_self";
	$('#buscar_seleccion_id').val(srlId);
	frm.submit();
	
	return false;
}
function salir_cuenta_usuario() {
	document.location.href = "home.action";
	return false;
}

function eliminar_cuenta_usuario(srlId) {
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
	        	$('#buscar_seleccion_id').val(srlId);
	        	$.post('eliminarCuentaUsuario.action', frm.serialize(), function(datos) {
		    		if(datos.actionErrors.length > 0) {
		    			mostrarMensajesErrorStruts(datos.actionErrors);
		    		} else {
		    			mostrarMensajesStruts(datos.actionMessages);
		    		}
	    			buscar_basico_cuenta_usuario();
	        		$('#dialog-info-eliminar').dialog("close");
	        	}, "json");
	        }
		}
	});
	
}


function deshabilitaBotones_cuenta_usuario(deshabilitarBoton) {
	$('#idBtnSalirCuentaUsuario').prop('disabled', deshabilitarBoton);
	$('#idBtnConsultarCuentaUsuario').prop('disabled', deshabilitarBoton);
	$('#idBtnMostrarTodosCuentaUsuario').prop('disabled', deshabilitarBoton);
	$('#idBtnNuevoCuentaUsuario').prop('disabled', deshabilitarBoton);
	$(".btn_buscar_control_cuenta_usuario").each(function() {
		$(this).prop('disabled', deshabilitarBoton);
	});

}

