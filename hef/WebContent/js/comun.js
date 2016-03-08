$(function() {

$("#divModalmsg").dialog({
	autoOpen: false,
    height: 'auto',
    width: 'auto',
    title: 'Mensaje: ',
    modal: true,
    buttons: {
      Aceptar: function() {
        $( this ).dialog( "close" );
      },
    }
});

});
function mostrarMensajesErrorStruts(arrayMsgs, idObjMsg) {
	var actionMsg	= '<div id="msgIsertsuccess"><ul id="msgIsertsuccess" class="errormsg" style="display: block;">';
	actionMsg	+= "<ul type = disk>";
	var sinerror	= true;
	if(arrayMsgs) {
		for(var i = 0;i < arrayMsgs.length;i++) {
			actionMsg	+= "<li>";
			actionMsg	+= arrayMsgs[i];
			actionMsg	+= "</li>";
			sinerror	= false;
		}
	}
	actionMsg	+= '</ul></div>';		    				
	if(idObjMsg) {
		idObjMsg.html(actionMsg);
	} else {
		$("#divModalmsg").html(actionMsg);
		$("#divModalmsg").dialog("open");
		setTimeout(function() {
			$("#divModalmsg").dialog("close");
		}, 5000);
	}
	return sinerror;
}
function mostrarMensajesStruts(arrayMsgs, idObjMsg) {
	var actionMsg	= '<div id="msgIsertsuccess"><ul id="msgIsertsuccess" class="exitomsg" style="display: block;">';
	actionMsg	+= "<ul type = disk>";
	var sinerror	= true;
	if(arrayMsgs) {
		for(var i = 0;i < arrayMsgs.length;i++) {
			actionMsg	+= "<li>";
			actionMsg	+= arrayMsgs[i];
			actionMsg	+= "</li>";
			sinerror	= false;
		}
	}
	actionMsg	+= '</ul></div>';		    				
	if(idObjMsg) {
		idObjMsg.html(actionMsg);
	} else {
		$("#divModalmsg").html(actionMsg);
		$("#divModalmsg").dialog("open");
		setTimeout(function() {
			$("#divModalmsg").dialog("close");
		}, 1000);
	}
	return sinerror;
}
function seleccionarTodosCheckbox() {
	var nodoList	= getNodosList();
	var total		= getTotal();
	var nodos		= nodoList.split(',');
	var blnTodos	= true;
	for(var i = 0;i < nodos.length;i++) {
		blnTodos	= blnTodos & document.getElementById("id_editar_carpeta_"+nodos[i]).checked;
	}
	for(var i = 0;i < nodos.length;i++) {
		document.getElementById("id_editar_carpeta_"+nodos[i]).checked = !blnTodos;
	}
}
function deseleccionarTodosCheckbox() {
	var nodoList	= getNodosList();
	var total		= getTotal();
	var nodos		= nodoList.split(',');
	for(var i = 0;i < nodos.length;i++) {
		document.getElementById("id_editar_carpeta_"+nodos[i]).checked = false;
	}
	return false;
}
function seleccionarCheckbox(idExpeSele) {
	var nodoList	= getNodosList();
	var total		= getTotal();
	var td			= "idTd" + idExpeSele;
	if(idExpeSele != null && idExpeSele != '' && idExpeSele != 'null') {
		var tdExp		= document.getElementById(td);
		if(tdExp.title != null && tdExp.title != 'null') {
			expandir(tdExp.title);
		}
		document.getElementById("id_editar_carpeta_"+idExpeSele).checked = true;
	}
}
function expandirContraer(idExpediente) {
	//alert('E');
	var tr		= "idTr" + idExpediente;
	var img		= "idImg" + idExpediente;
	if(document.getElementById(tr).style.display == 'table-row') {
		document.getElementById(tr).style.display = 'none';
		document.getElementById(img).src = "img/folder-close.jpg";
	} else {
		document.getElementById(tr).style.display	= 'table-row';
		document.getElementById(img).src			= "img/folder-open.jpg";
	}
}
function obtenerIdPadre(idExpediente) {
	var tdExp	= document.getElementById("idTd" + idExpediente); 
	if(tdExp != null && tdExp.title != null && tdExp.title != "" && tdExp.title != "null") {
		return tdExp.title;
	} else {
		return null;
	}
}
function expandir(idExpediente) {
	var tr		= "idTr" + idExpediente;
	var img		= "idImg" + idExpediente;
	if(idExpediente != null && idExpediente != '' && idExpediente != 'null') {
		if(document.getElementById(tr) != null) {
			document.getElementById(tr).style.display	= 'table-row';
			document.getElementById(img).src			= "img/folder-open.jpg";
			var tdExp	= document.getElementById("idTd" + idExpediente); 
			if(tdExp.title != null && tdExp.title != "" && tdExp.title != "null") {
				expandir(tdExp.title);
			}
		} else {
			var tdExp	= document.getElementById("idTd" + idExpediente); 
			if(tdExp != null && tdExp.title != null && tdExp.title != "" && tdExp.title != "null") {
				expandir(tdExp.title);
			}
		}
	}
}
function contraerTodosNodos() {
	var nodoPad		= getIdPadre();
	var nodoList	= getNodosList();
	var total		= getTotal();
	var nodos		= nodoList.split(',');
	for(var i = 0;i < nodos.length;i++) {
		//if(nodoPad != nodos[i]) {
		var tr		= "idTr" + nodos[i];
		var img		= "idImg" + nodos[i];
		if(document.getElementById(tr)) {
			document.getElementById(tr).style.display = 'none';
			document.getElementById(img).src = "img/folder-close.jpg";
		}
		//}
	}
	return false;
}
function expandirTodosNodos() {
	var nodoList	= getNodosList();
	var total		= getTotal();
	var nodos		= nodoList.split(',');
	for(var i = 0;i < nodos.length;i++) {
		var tr		= "idTr" + nodos[i];
		var img		= "idImg" + nodos[i];
		if(document.getElementById(tr)) {
			document.getElementById(tr).style.display	= 'table-row';
			document.getElementById(img).src			= "img/folder-open.jpg";
		}
	}
	return false;
}
var idExpe = "";
function getIdExpe() {
	return idExpe;
}
function setIdExpe(idEx) {
	idExpe = idEx;
}
function getRuta(idExpeSele) {
	var td		= "idTd" + idExpeSele;
	var tdExp	= document.getElementById(td); 
	if(tdExp.title != null && tdExp.title != 'null') {
		var newRuta = getRuta(tdExp.title);
		if(newRuta != null && newRuta != '') {
			return tdExp.title + "," + newRuta;
		} else {
			return tdExp.title;
		}
	} else {
		return "";
	}
}
function elegirExpedientePerm(idExpediente, perCrea, perElim) {
	 $("#idBtnNuevoDoc").css("display","none");
	 $("#idBtnNuevoExp").css("display","none");
	 $("#idBtnEliminar").css("display","none");
	 $("#idBtnEditarDoc").css("display","none");
	 $("#idBtnEditarExp").css("display","none");
	if(perCrea == '1' && perElim == '1') {
		 $("#idBtnNuevoDoc").css("display","block");
		 $("#idBtnNuevoExp").css("display","block");
		 $("#idBtnEliminar").css("display","block");
		 $("#idBtnEditarExp").css("display","block");
	} else if(perCrea == '1') {
		 $("#idBtnNuevoDoc").css("display","block");
		 $("#idBtnNuevoExp").css("display","block");
		 $("#idBtnEditarExp").css("display","block");
	} else if(perElim == '1') {
		 $("#idBtnEliminar").css("display","block");
	}
	elegirExpediente(idExpediente);
}
function elegirExpediente(idExpediente) {
	mostrarMensajesStruts([], $("#idMspError"));
	mostrarMensajesStruts([], $("#idMspInfo"));
	elegirTdDina(idExpediente, getNodosList(), getTotal(), 'true');
}
function elegirExpedienteSinDocumentos(idExpediente) {
	elegirTdDina(idExpediente, getNodosList(), getTotal(), 'false');
}
function liberarExpediente(idExpediente) {
	liberarTdDina(idExpediente, getNodosList(), getTotal());
}
function liberarTdDina() {
	var nodoList =getNodosList();
	var nodos	= nodoList.split(',');
	for(var i = 0;i < nodos.length;i++) {
		document.getElementById('idTd'+nodos[i]).style.color = '';
		document.getElementById('idTd'+nodos[i]).style.fontWeight = '';
	}
	liberarDocumento();
}
function elegirTdDina(idExpeSele, nodoList, total, documentos) {
	var nodos	= nodoList.split(',');
	for(var i = 0;i < nodos.length;i++) {
		$("#idTd"+nodos[i]).removeAttr("style");
		document.getElementById('idTd'+nodos[i]).style.fontWeight = '';
	}
	var td		= "idTd" + idExpeSele;
	$("#"+td).css({"background-color": "#AAAAFF"});
	var tdExp	= document.getElementById(td); 
//	tdExp.style.color		= '#1100FF';
	tdExp.style.fontWeight	= 'bold';
	if(tdExp.title != null && tdExp.title != 'null') {
		expandir(tdExp.title);
	}
	idExpe					= idExpeSele;
	setIdDocumento("");
	var ruta = getRuta(idExpeSele);
	//alert("ruta="+ruta);
	if(documentos == 'true') {
		elegirDocumento(idExpeSele, ruta);
	}
}
//////////////////////////////////////////////////////////////////////////////
///////////////////////////////ZONA EXPLORACION///////////////////////////////
//////////////////////////////////////////////////////////////////////////////
var idDocumento		= "";
function getIdDocumento() {
	return idDocumento;
}
function setIdDocumento(idDo) {
	idDocumento = idDo;
}
function seleccinarDocExp(id) {
	idDocumento		= id;
//	var eleme		= getElementosList();
//	var elementos	= eleme.split(',');
	var eleSegu		= getElementosSeguridadList();
	//alert("eleSegu="+eleSegu);
	 $("#idBtnNuevoDoc").css("display","none");
	 $("#idBtnNuevoExp").css("display","none");
	 $("#idBtnEliminar").css("display","none");
	 $("#idBtnEditarDoc").css("display","none");
	 $("#idBtnEditarExp").css("display","none");
	for(var i = 0;i < eleSegu.length;i++) {
		$("#idDivDraggable_"+eleSegu[i][0]).css({"background-color": ""});
		if(eleSegu[i][0] == id && eleSegu[i][2] == 'Carpeta') {
			if(eleSegu[i][1] == 'creaelim') {
				 $("#idBtnNuevoDoc").css("display","block");
				 $("#idBtnNuevoExp").css("display","block");
				 $("#idBtnEliminar").css("display","block");
				 $("#idBtnEditarExp").css("display","block");
			} else if(eleSegu[i][1] == 'crea') {
				 $("#idBtnNuevoDoc").css("display","block");
				 $("#idBtnNuevoExp").css("display","block");
				 $("#idBtnEditarExp").css("display","block");
			} else if(eleSegu[i][1] == 'elim') {
				 $("#idBtnEliminar").css("display","block");
			} else if(eleSegu[i][1] == 'comun') {
			}
		} else if(eleSegu[i][0] == id && eleSegu[i][2] == 'Documento') {
			if(eleSegu[i][1] == 'creaelim') {
				$("#idBtnEditarDoc").css("display","block");
				 $("#idBtnEliminar").css("display","block");
			} else if(eleSegu[i][1] == 'crea') {
				$("#idBtnEditarDoc").css("display","block");
			} else if(eleSegu[i][1] == 'elim') {
				 $("#idBtnEliminar").css("display","block");
			} else if(eleSegu[i][1] == 'comun') {
			}
		}
	}
	$("#idDivDraggable_"+id).css({"background-color": "#AAAAFF"});
	$('#idMspError').html("#idDivDraggable_"+id);
	
}
function sessionFinalizoJson(datos) {
	//alert("datos="+datos.sessionTimeOut);
	if(datos && datos.sessionTimeOut && datos.sessionTimeOut == 'sessionTimeOut') {
		document.location.href = "salir.action";
		return false;
	}
	return true;
}
function sessionFinalizo(datos) {
	//alert("datos="+datos);
	if(datos.indexOf('sessionTimeOut') != -1) {
		document.location.href = "salir.action";
		return false;
	}
	return true;
}

var ctx = "${pageContext.request.contextPath}";

function ajaxRequest(path,tipoPeticion,tipoDatoRetorno,parametros){
	
	var request = $.ajax({
				        url: path,
				        type: tipoPeticion,
				        dataType:tipoDatoRetorno,
				        data:parametros,
				        async:true
				 });
	
	return request;
}

function ajaxRequest(path,tipoPeticion,tipoDatoRetorno,parametros,tipoContenido){
	
	var request = $.ajax({
				        url: path,
				        type: tipoPeticion,
				        dataType:tipoDatoRetorno,
				        data:parametros,
				        contentType:tipoContenido,
				        async:true
				 });
	
	return request;
}
function blockui() {
	$.blockUI({ message: '<h3><img src="image/busy.gif" /> Espere un momento...</h3>' });
}

function unblockui() {
	$.unblockUI();
}

