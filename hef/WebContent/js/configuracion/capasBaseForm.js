$(document).ready(function() {
	iniciarEventosDialogEditar_capas_base();
});

	



function iniciarEventosDialogEditar_capas_base(esEditar) {



	$("#idBtnGuardarCapasBase").each(function() {
		$(this).unbind("click");
	});
	$("#idBtnVolverCapasBase").each(function() {
		$(this).unbind("click");
	});
	$('.datepicker').each(function() {
		$(this).unbind("datepicker");
	});
	

	
	$('#idBtnGuardarCapasBase').click(guardar_capas_base);
	$('#idBtnVolverCapasBase').click(volver_capas_base);
	
	$('.datepicker').each(function() {
		$(this).datepicker({
			dateFormat: 'dd/mm/yy',
			buttonImageOnly: true,
			changeMonth: true,
			changeYear: true,
			currentText: 'Hoy',
			monthNames: ['Enero','Febrero','Marzo','Abril','Mayo','Junio',
			'Julio','Agosto','Septiembre','Octubre','Noviembre','Diciembre'],
			monthNamesShort: ['Ene','Feb','Mar','Abr','May','Jun',
			'Jul','Ago','Sep','Oct','Nov','Dic'],
			dayNames: ['Domingo','Lunes','Martes','Mi&eacute;rcoles','Jueves','Viernes','S&aacute;bado'],
			dayNamesShort: ['Dom','Lun','Mar','Mi&eacute;','Juv','Vie','S&aacute;b'],
			dayNamesMin: ['Do','Lu','Ma','Mi','Ju','Vi','S&aacute;']
		});
	});

}
function volver_capas_base() {
	deshabilitaBotones_capas_base(true);
	var frm		= document.formEditarCapasBase;
	frm.action	= "capasBase.action";
	frm.method	= "POST";
	frm.submit();
	
	return false;
}

function guardar_capas_base() {
	deshabilitaBotones_capas_base(true);
	var frm		= $("#idFormEditarCapasBase");
	$.post('guardarCapasBase.action', frm.serialize(), function(datos) {
		sessionFinalizoJson(datos);
		if(datos.actionErrors.length > 0) {
			mostrarMensajesErrorStruts(datos.actionErrors);
			deshabilitaBotones_capas_base(false);
		} else {
			mostrarMensajesStruts(datos.actionMessages);
			volver_capas_base();
		}
	},'json');
	return false;
}

function deshabilitaBotones_capas_base(deshabilitarBoton) {
	$('#idBtnGuardarCapasBase').prop('disabled', deshabilitarBoton);
	$("#idBtnVolverCapasBase").prop('disabled', deshabilitarBoton);
}
