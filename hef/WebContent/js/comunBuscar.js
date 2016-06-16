/*
 * Mensaje informativo sobre la libreria de de validaciones generales
 * nuevos cambios
 * 
*/
function seleccionarTodos(frm) {
	var seleccion	= frm.buscar_seleccion_id;
	if(seleccion && seleccion.length) {
		for(var i = 0;i < seleccion.length;i++) {
			seleccion[i].checked = !seleccion[i].checked;
		}
	} else {
		if(seleccion && (seleccion.checked || !seleccion.checked)) {
			seleccion.checked = !seleccion.checked;
		}
	}
}
function validarEnvio(f) {
	var contar		= 0;
	var frm			= f;
	var seleccion	= frm.buscar_seleccion_id;
	if(seleccion && seleccion.length) {
		for(var i = 0;i < seleccion.length;i++) {
			if(seleccion[i].checked) {
				contar++;
			}
		}
	} else {
		if(seleccion && seleccion.checked) {
			contar++;
		}
	}
	return contar;
}
function validarEnvioSeleccionado(f) {
	var contar		= 0;
	var frm			= f;
	var seleccion	= frm.buscar_seleccion_id;
	if(seleccion && seleccion.length) {
		for(var i = 0;i < seleccion.length;i++) {
			if(seleccion[i].checked) {
				return seleccion[i].value;
			}
		}
	} else {
		if(seleccion && seleccion.checked) {
			return seleccion.value;
		}
	}
	return contar;
}
//function mostrarMensajesStruts(arrayMsgs, idObjMsg) {
//	var actionMsg	= "<ul type = disk>";
//	var sinerror	= true;
//	if(arrayMsgs) {
//		for(var i = 0;i < arrayMsgs.length;i++) {
//			actionMsg	+= "<li>";
//			actionMsg	+= arrayMsgs[i];
//			actionMsg	+= "</li>";
//			sinerror	= false;
//		}
//	}
//	actionMsg		+= "</ul>";
//	idObjMsg.html(actionMsg);
//	return sinerror;
//}
function activarDesactivar(elemento) {
	var items = elemento.parentNode.childNodes;
	var item = null;
	for (var i = 0; i < items.length; i++) {
		if (items[i].id == "idDivTip") {
			item	= items[i];
			if(item.style.display == 'none') {
				item.style.display = 'table-row';
			} else {
				item.style.display = 'none';
			}
		}
	}
}