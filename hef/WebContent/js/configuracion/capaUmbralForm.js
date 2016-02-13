/*
$(document).ready(function() {
	iniciarEventosDialogEditar_capa_umbral();
});
*/
	



function iniciarEventosDialogEditar_capa_umbral(esEditar) {

//	$('.ui-dialog-content').each(function() {//Base
//		if($(this).attr("id") == "idDivEditarCapaUmbral") {
//			$(this).dialog("destroy");
//		}
//	});


	$("#idBtnGuardarCapaUmbral").each(function() {
		$(this).unbind("click");
	});
	$("#idBtnVolverCapaUmbral").each(function() {
		$(this).unbind("click");
	});
	

//	$("#idDivEditarCapaUmbral").dialog({
//		autoOpen: false,
//		width: 1024,
//		title: 'Umbral',
//		modal: true,
//		closeOnEscape: false,
//		close: function(event, ui) {
//		}
//	});
	
	$('#idBtnGuardarCapaUmbral').click(guardar_capa_umbral);
	$('#idBtnVolverCapaUmbral').click(volver_capa_umbral);
	

}
function volver_capa_umbral() {
	$('.editar-umbral-modal').modal('hide');
//	deshabilitaBotones_capa_umbral(true);
//	var frm		= document.formEditarCapaUmbral;
//	frm.action	= "capaUmbral.action";
//	frm.method	= "POST";
//	frm.submit();
	return false;
}

function guardar_capa_umbral() {
	deshabilitaBotones_capa_umbral(true);
	var frm		= $("#idFormEditarCapaUmbral");
	$.post('guardarCapaUmbral.action', frm.serialize(), function(datos) {
		sessionFinalizoJson(datos);
		if(datos.actionErrors.length > 0) {
			mostrarMensajesErrorStruts(datos.actionErrors);
			deshabilitaBotones_capa_umbral(false);
		} else {
			mostrarMensajesStruts(datos.actionMessages);
			volver_capa_umbral();
		}
	},'json');
	return false;
}

function deshabilitaBotones_capa_umbral(deshabilitarBoton) {
	$('#idBtnGuardarCapaUmbral').prop('disabled', deshabilitarBoton);
	$("#idBtnVolverCapaUmbral").prop('disabled', deshabilitarBoton);
}
