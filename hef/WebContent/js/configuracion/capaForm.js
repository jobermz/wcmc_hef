$(document).ready(function() {
	iniciarEventosDialogEditar_capa(true);
});

	



function iniciarEventosDialogEditar_capa(esEditar) {

	$('.ui-dialog-content').each(function() {
		if($(this).attr("id") == "idDivEditarCapaUmbral") {
			$(this).dialog("destroy");
		}
	});


	if(esEditar) {
		$("#idBtnNuevoCapaUmbral").each(function() {
			$(this).unbind("click");
		});
	}

	$("#idBtnGuardarCapa").each(function() {
		$(this).unbind("click");
	});
	$("#idBtnVolverCapa").each(function() {
		$(this).unbind("click");
	});
	$('.datepicker').each(function() {
		$(this).unbind("datepicker");
	});
	

	if(esEditar) {
		$('#idBtnNuevoCapaUmbral').click(nuevo_capa_umbral);
		instanciardt_basico_capa_umbral(true);
	}
	
	$('#idBtnGuardarCapa').click(guardar_capa);
	$('#idBtnVolverCapa').click(volver_capa);
	
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
function volver_capa() {
	deshabilitaBotones_capa(true);
	var frm		= document.formEditarCapa;
	frm.action	= "capa.action";
	frm.method	= "POST";
	frm.submit();
	
	return false;
}

function guardar_capa() {
	deshabilitaBotones_capa(true);
	var frm		= $("#idFormEditarCapa");
	$.post('guardarCapa.action', frm.serialize(), function(datos) {
		sessionFinalizoJson(datos);
		if(datos.actionErrors.length > 0) {
			mostrarMensajesErrorStruts(datos.actionErrors);
			deshabilitaBotones_capa(false);
		} else {
			mostrarMensajesStruts(datos.actionMessages);
			volver_capa();
		}
	},'json');
	return false;
}

function deshabilitaBotones_capa(deshabilitarBoton) {
	$('#idBtnGuardarCapa').prop('disabled', deshabilitarBoton);
	$("#idBtnVolverCapa").prop('disabled', deshabilitarBoton);
}
