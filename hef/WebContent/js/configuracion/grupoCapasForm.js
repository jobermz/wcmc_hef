$(document).ready(function() {
	iniciarEventosDialogEditar_grupo_capas();
});

	



function iniciarEventosDialogEditar_grupo_capas(esEditar) {



	$("#idBtnGuardarGrupoCapas").each(function() {
		$(this).unbind("click");
	});
	$("#idBtnVolverGrupoCapas").each(function() {
		$(this).unbind("click");
	});
	

	
	$('#idBtnGuardarGrupoCapas').click(guardar_grupo_capas);
	$('#idBtnVolverGrupoCapas').click(volver_grupo_capas);
	

}
function volver_grupo_capas() {
	deshabilitaBotones_grupo_capas(true);
	var frm		= document.formEditarGrupoCapas;
	frm.action	= "grupoCapas.action";
	frm.method	= "POST";
	frm.submit();
	
	return false;
}

function guardar_grupo_capas() {
	deshabilitaBotones_grupo_capas(true);
	var frm		= $("#idFormEditarGrupoCapas");
	$.post('guardarGrupoCapas.action', frm.serialize(), function(datos) {
		sessionFinalizoJson(datos);
		if(datos.actionErrors.length > 0) {
			mostrarMensajesErrorStruts(datos.actionErrors);
			deshabilitaBotones_grupo_capas(false);
		} else {
			mostrarMensajesStruts(datos.actionMessages);
			volver_grupo_capas();
		}
	},'json');
	return false;
}

function deshabilitaBotones_grupo_capas(deshabilitarBoton) {
	$('#idBtnGuardarGrupoCapas').prop('disabled', deshabilitarBoton);
	$("#idBtnVolverGrupoCapas").prop('disabled', deshabilitarBoton);
}
