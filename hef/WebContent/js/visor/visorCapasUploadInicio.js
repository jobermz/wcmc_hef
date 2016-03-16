function iniciarCapasUpload() {
	$('.upload-capas').click(uploadCapas);
	$('.btnEnviarShapefileUsuario').click(cargarPoligonoDesdeShapefileUsuario);

}

function uploadCapas() {
	$('.upload-capas-modal').off('shown.bs.modal');
	$('.upload-capas-modal').off('hidden.bs.modal');
	$('.upload-capas-modal').on('shown.bs.modal', function (e) {
	});
	$('.upload-capas-modal').on('hidden.bs.modal', function (e) {
	});
	$('.upload-capas-modal').modal('show');
}

var listAreaShapeSeleccionar	= null;
function cargarPoligonoDesdeShapefileUsuario() {
	blockui();
	$('#idFrmSelShapefileUsuario').unbind("submit");
	$('#idFrmSelShapefileUsuario').submit(function() {
		$(this).ajaxSubmit({
			url:	   "agregarShapeUsuario.action",
			type:	  "POST",
			dataType:  "json",
			success:	   function(datos) {
				sessionFinalizoJson(datos);
				
				if(datos.actionErrors.length > 0) {
					mostrarMensajesErrorStruts(datos.actionErrors);
					mostrarMensajesStruts([]);
					unblockui();
				} else {
					mostrarMensajesErrorStruts([]);
					mostrarMensajesStruts(datos.actionMessages);
					unblockui();
				}
				
			}
		});
		return false;
	});
	$('#idFrmSelShapefileUsuario').submit();
	return false;
}

