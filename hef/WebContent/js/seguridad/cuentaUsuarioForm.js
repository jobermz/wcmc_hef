$(document).ready(function() {
	iniciarEventosDialogEditar_cuenta_usuario();
});

	



function iniciarEventosDialogEditar_cuenta_usuario(esEditar) {



	$("#idBtnGuardarCuentaUsuario").each(function() {
		$(this).unbind("click");
	});
	$("#idBtnVolverCuentaUsuario").each(function() {
		$(this).unbind("click");
	});
	

	
	$('#idBtnGuardarCuentaUsuario').click(guardar_cuenta_usuario);
	$('#idBtnVolverCuentaUsuario').click(volver_cuenta_usuario);
	

}
function volver_cuenta_usuario() {
	deshabilitaBotones_cuenta_usuario(true);
	var frm		= document.formEditarCuentaUsuario;
	frm.action	= "cuentaUsuario.action";
	frm.method	= "POST";
	frm.submit();
	
	return false;
}

function guardar_cuenta_usuario() {
	deshabilitaBotones_cuenta_usuario(true);
	var frm		= $("#idFormEditarCuentaUsuario");
	$.post('guardarCuentaUsuario.action', frm.serialize(), function(datos) {
		sessionFinalizoJson(datos);
		if(datos.actionErrors.length > 0) {
			mostrarMensajesErrorStruts(datos.actionErrors);
			deshabilitaBotones_cuenta_usuario(false);
		} else {
			mostrarMensajesStruts(datos.actionMessages);
			volver_cuenta_usuario();
		}
	},'json');
	return false;
}

function deshabilitaBotones_cuenta_usuario(deshabilitarBoton) {
	$('#idBtnGuardarCuentaUsuario').prop('disabled', deshabilitarBoton);
	$("#idBtnVolverCuentaUsuario").prop('disabled', deshabilitarBoton);
}
