$(document).ready(function() {
	$('#idBtnIngresar').click(autenticacion);
	$('#idBtnSalirCapa').click(salir_capa);
});
function autenticacion() {
	deshabilitaBotones_autenticacion(true);
	var frm		= document.formAutenticacion;
	frm.action	= "autenticarUsuario.action";
	frm.method	= "POST";
	frm.submit();
	return false;
}
function deshabilitaBotones_autenticacion(deshabilitarBoton) {
	$('#idBtnIngresar').prop('disabled', deshabilitarBoton);
}

function salir_capa() {
	document.location.href = "home.action";
	return false;
}