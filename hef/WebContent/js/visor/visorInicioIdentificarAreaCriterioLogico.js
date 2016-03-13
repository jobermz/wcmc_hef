function iniciarIdentificarAreaPorCriteriosLogicos() {
	$('.identificar-area-criterio-logico').click(identificarAreaCriterioLogico);
	
	$('.btnProcesarIdentAreaCriteriosLogicos').click(procesarCriterioLogico);
	$('.btnSeleccionarTodasCapasACL').click(seleccionarTodosACL);
	$(".btnAplicarACLFiltrar").click(aplicarFiltroACL);
	$("#idCriterioFiltroUmbral").change(actualizarFiltroUmbralACL);
	$(".btnAplicarACLUmbral").click(aplicarFiltroUmbralACL);
	
	$("#idMenuLimiparACL").click(limpiarCapasSeleccionadasACL);
	
}
/////////////////////////////////////////////////////////////////////////////////////////
function identificarAreaCriterioLogico() {
	$('.identificar-area-criterio-logico-modal').off('shown.bs.modal');
	$('.identificar-area-criterio-logico-modal').off('hidden.bs.modal');
	$('.identificar-area-criterio-logico-modal').on('shown.bs.modal', function (e) {
		inicializarSeleccionadasActivasACL();
	});
	$('.identificar-area-criterio-logico-modal').on('hidden.bs.modal', function (e) {
	});
	$('.identificar-area-criterio-logico-modal').modal('show');
}
function inicializarSeleccionadasActivasACL() {
	if(listado_idCapaIdentACL!=null && listado_idCapaIdentACL.length > 0) {
		$(".capasBaseACL").each(function(index) {
			$(this).prop("checked", false);
		});
		for(var i = 0;i < listado_idCapaIdentACL.length;i++) {
			$("#idCapaIdentACL"+listado_idCapaIdentACL[i]).prop("checked", true);
		}
	} else {
		$(".capasBaseACL").each(function(index) {
			$(this).prop("checked", false);
		});
		$(".capasBase").each(function(index) {
			if($(this).is(':checked')) {
				var srlIdCapa	= $(this).attr("value");
				$("#idCapaIdentACL"+srlIdCapa).prop("checked", true);
			}
		});
	}
	guardarCapasSeleccionadasACL();
}
var listado_idCapaIdentACL		= null;
function guardarCapasSeleccionadasACL() {
	listado_idCapaIdentACL			= new Array();
	$(".capasBaseACL").each(function(index) {
		if($(this).is(':checked')) {
			var srlIdCapa		= $(this).attr("id-capa");
			listado_idCapaIdentACL[listado_idCapaIdentACL.length]	= srlIdCapa;
		}
	});
	$('.badgeCustomACL').html(listado_idCapaIdentACL.length);
	$('.badgeCustomACL').css("display","");
	
	$(".clsPanelGrupoCapasACL").each(function(index) {
		var contador	= 0;
		$(this).find(".capasBaseACL").each(function(index) {
			if($(this).is(':checked')) {
				contador++;
			}
		});
		if(contador > 0) {
			$(this).find(".badgeCustomPanelGrupoCapaACL").html(contador);
			$(this).find(".badgeCustomPanelGrupoCapaACL").css("display", "");
		} else {
			$(this).find(".badgeCustomPanelGrupoCapaACL").html("");
			$(this).find(".badgeCustomPanelGrupoCapaACL").css("display", "none");
		}
	});
	$(".clsPanelGrupoCapasMainACL").each(function(index) {
		var contador	= 0;
		$(this).find(".capasBaseACL").each(function(index) {
			if($(this).is(':checked')) {
				contador++;
			}
		});
		if(contador > 0) {
			$(this).find(".badgeCustomPanelGrupoCapaMainACL").html(contador);
			$(this).find(".badgeCustomPanelGrupoCapaMainACL").css("display", "");
		} else {
			$(this).find(".badgeCustomPanelGrupoCapaMainACL").html("");
			$(this).find(".badgeCustomPanelGrupoCapaMainACL").css("display", "none");
		}
	});

}
function limpiarCapasSeleccionadasACL() {
	listado_idCapaIdentACL	= null;
	$('.badgeCustomACL').css("display","none");
}
///////////////////////////////////////////////////////////////////////////////////////// FILTRO SHP
function filtrarACL(srlIdCapa) {
	$('.identificar-area-criterio-logico-filtrar-modal').off('shown.bs.modal');
	$('.identificar-area-criterio-logico-filtrar-modal').off('hidden.bs.modal');
	$('.identificar-area-criterio-logico-filtrar-modal').on('shown.bs.modal', function (e) {
		var param	= {
				listSrlIdCapaConsulta:srlIdCapa
		};
		$.post("consultaCombosACL.action", param, function(datos) {
			$(".clsDivACL").find("select[name=combo_area_ACL]").each(function(index) {
				$(this).unbind("selectpicker");
			});
			$(".clsDivACL").html(datos);
			$(".clsDivACL").find("select[name=combo_area_ACL]").selectpicker({
				liveSearch: true,
				maxOptions: 1
			});
			$(".clsDivACL").attr("srlIdCapa", srlIdCapa);
		});
	});
	$('.identificar-area-criterio-logico-filtrar-modal').on('hidden.bs.modal', function (e) {
	});
	$(".identificar-area-criterio-logico-modal").modal('hide');
	$('.identificar-area-criterio-logico-filtrar-modal').modal('show');
}
function aplicarFiltroACL() {
	var valSelect		= $(".clsDivACL").find("select").val();
	var valSelectTxt	= $(".clsDivACL").find("select option:selected").text();
	var srlIdCapa		= $(".clsDivACL").attr("srlIdCapa");
	$(".identificar-area-criterio-logico-modal").find("#idDivDetFiltroACL"+srlIdCapa).html(valSelectTxt);
	$(".identificar-area-criterio-logico-modal").find("#idDivDetFiltroACL"+srlIdCapa).attr("valSelect", valSelect);
	$(".identificar-area-criterio-logico-modal").find("#idDivDetFiltroACL"+srlIdCapa).attr("srlIdCapa", srlIdCapa);
	$('.identificar-area-criterio-logico-filtrar-modal').modal('hide');
	$(".identificar-area-criterio-logico-modal").modal('show');
}
/////////////////////////////////////////////////////////////////////////////////////////
function filtrarUmbralACL(srlIdCapa) {
	$('.identificar-area-criterio-logico-umbral-modal').attr('srlIdCapa', srlIdCapa);
	$('.identificar-area-criterio-logico-umbral-modal').off('shown.bs.modal');
	$('.identificar-area-criterio-logico-umbral-modal').off('hidden.bs.modal');
	$('.identificar-area-criterio-logico-umbral-modal').on('shown.bs.modal', function (e) {
		actualizarFiltroUmbralACL();
	});
	$('.identificar-area-criterio-logico-umbral-modal').on('hidden.bs.modal', function (e) {
	});
	$(".identificar-area-criterio-logico-modal").modal('hide');
	$('.identificar-area-criterio-logico-umbral-modal').modal('show');
}
function actualizarFiltroUmbralACL() {
	$(".clsDivCriterioUmbralInputs").each(function(){
		$(this).css("display", "none");
	});
	$("#idValorFiltroUmbralPre").val("");
	$("#idValorFiltroUmbral").val("");
	$("#idValorFiltroUmbralDesde").val("");
	$("#idValorFiltroUmbralHasta").val("");
	$("#idDivComboUmbrales").html("");
	
	var filtroUmbral	= $("#idCriterioFiltroUmbral").val();
	if(filtroUmbral == "preestablecido") {//Umbrales preestablecidos
		$("#idDivPreestablecidos").css("display", "");
	} else if(filtroUmbral == "mayor") {//Mayor a
		$("#idDivValor").css("display", "");
	} else if(filtroUmbral == "menor") {//Menor a
		$("#idDivValor").css("display", "");
	} else if(filtroUmbral == "igual") {//Igual a
		$("#idDivValor").css("display", "");
	} else if(filtroUmbral == "rango") {//Por rango
		$("#idDivRango").css("display", "");
	}
	var srlIdCapa	= $('.identificar-area-criterio-logico-umbral-modal').attr('srlIdCapa');
	var param	= {
			srlIdCapa: srlIdCapa
	};
	$.post("consultaUmbralesCombosACL.action", param, function(datos) {//TODO pendiente
		console.log("consultaUmbralesCombosACL=" + datos);
		$("#idDivComboUmbrales").html(datos);
	});
	$.post("consultaUmbralesMinMaxACL.action", param, function(datos) {//TODO pendiente
		console.log("consultaUmbralesMinMaxACL: min=" + datos.minimo + " max=" + datos.maximo);
		$("#idDivRangoUmbranlMinimo").html(datos.minimo);
		$("#idDivRangoUmbranlMaximo").html(datos.maximo);
	}, "json");
}
function aplicarFiltroUmbralACL() {
//	var criterioFiltroUmbralTXT	= $("#idCriterioFiltroUmbral option:selected").text();
	var valorFiltroUmbralPre	= $("#idValorFiltroUmbralPre").val();
	var valorFiltroUmbralPreTXT	= $("#idValorFiltroUmbralPre option:selected").text();
	var valorFiltroUmbral		= $("#idValorFiltroUmbral").val();
	var valorFiltroUmbralDesde	= $("#idValorFiltroUmbralDesde").val();
	var valorFiltroUmbralHasta	= $("#idValorFiltroUmbralHasta").val();
	var srlIdCapa				= $('.identificar-area-criterio-logico-umbral-modal').attr('srlIdCapa');
	
	var filtroUmbral	= $("#idCriterioFiltroUmbral").val();
	$(".identificar-area-criterio-logico-modal").find("#idDivDetFiltroACL"+srlIdCapa).attr("valCriterio",filtroUmbral);
	$(".identificar-area-criterio-logico-modal").find("#idDivDetFiltroACL"+srlIdCapa).attr("srlIdCapa", srlIdCapa);
	if(filtroUmbral == "preestablecido") {//Umbrales preestablecidos
		$(".identificar-area-criterio-logico-modal").find("#idDivDetFiltroACL"+srlIdCapa).html("Umbral: "+valorFiltroUmbralPreTXT);
		$(".identificar-area-criterio-logico-modal").find("#idDivDetFiltroACL"+srlIdCapa).attr("valSelect",valorFiltroUmbralPre);
	} else if(filtroUmbral == "mayor") {//Mayor a
		$(".identificar-area-criterio-logico-modal").find("#idDivDetFiltroACL"+srlIdCapa).html("Valor > "+valorFiltroUmbral);
		$(".identificar-area-criterio-logico-modal").find("#idDivDetFiltroACL"+srlIdCapa).attr("valSelect",valorFiltroUmbral);
	} else if(filtroUmbral == "menor") {//Menor a
		$(".identificar-area-criterio-logico-modal").find("#idDivDetFiltroACL"+srlIdCapa).html("Valor < "+valorFiltroUmbral);
		$(".identificar-area-criterio-logico-modal").find("#idDivDetFiltroACL"+srlIdCapa).attr("valSelect",valorFiltroUmbral);
	} else if(filtroUmbral == "igual") {//Igual a
		$(".identificar-area-criterio-logico-modal").find("#idDivDetFiltroACL"+srlIdCapa).html("Valor = "+valorFiltroUmbral);
		$(".identificar-area-criterio-logico-modal").find("#idDivDetFiltroACL"+srlIdCapa).attr("valSelect",valorFiltroUmbral);
	} else if(filtroUmbral == "rango") {//Por rango
		$(".identificar-area-criterio-logico-modal").find("#idDivDetFiltroACL"+srlIdCapa).html("Valores desde:"+valorFiltroUmbralDesde+" hasta:"+valorFiltroUmbralHasta);
		$(".identificar-area-criterio-logico-modal").find("#idDivDetFiltroACL"+srlIdCapa).attr("valSelectDesde",valorFiltroUmbralDesde);
		$(".identificar-area-criterio-logico-modal").find("#idDivDetFiltroACL"+srlIdCapa).attr("valSelectHasta",valorFiltroUmbralHasta);
	}
	$('.identificar-area-criterio-logico-umbral-modal').modal('hide');
	$(".identificar-area-criterio-logico-modal").modal('show');
}
/////////////////////////////////////////////////////////////////////////////////////////

function procesarCriterioLogico() {
	var listSrlIdCapaCons			= "";
	var listIdDataCapaCons			= "";
	var listIdDataCapaCriCons		= "";
	var listSrlIdCapaConsRASTER		= "";
	var listIdDataCapaConsRASTER	= "";
	var listIdDataCapaCriConsRASTER	= "";
	guardarCapasSeleccionadasACL();
	$(".clsDivDetFiltroACL").each(function(index) {
		var valSelect		= $(this).attr("valSelect");
		var valSelectDesde	= $(this).attr("valSelectDesde");
		var valSelectHasta	= $(this).attr("valSelectHasta");
		var valCriterio		= $(this).attr("valCriterio");
		var srlIdCapa		= $(this).attr("srlIdCapa");
		if(valCriterio && valCriterio != "") {
			if(listSrlIdCapaCons.length > 0) {
				listSrlIdCapaConsRASTER			+= ",";
				listIdDataCapaConsRASTER		+= ",";
				listIdDataCapaCriConsRASTER		+= ",";
			}
			if(valCriterio == "preestablecido") {//Umbrales preestablecidos
				listIdDataCapaConsRASTER		+= valSelect;
			} else if(valCriterio == "mayor") {//Mayor a
				listIdDataCapaConsRASTER		+= valSelect;
			} else if(valCriterio == "menor") {//Menor a
				listIdDataCapaConsRASTER		+= valSelect;
			} else if(valCriterio == "igual") {//Igual a
				listIdDataCapaConsRASTER		+= valSelect;
			} else if(valCriterio == "rango") {//Por rango
				listIdDataCapaConsRASTER		+= valSelectDesde+"-"+valSelectHasta;
			}
			listSrlIdCapaConsRASTER		+= srlIdCapa;
			listIdDataCapaCriConsRASTER	+= valCriterio;
		} else if(valSelect && valSelect != "") {
			if(listSrlIdCapaCons.length > 0) {
				listSrlIdCapaCons		+= ",";
				listIdDataCapaCons		+= ",";
				listIdDataCapaCriCons	+= ",";
			}
			listSrlIdCapaCons		+= srlIdCapa;
			listIdDataCapaCons		+= valSelect;
			listIdDataCapaCriCons	+= valCriterio;
		}
	});
	{
		if(listSrlIdCapaCons.length > 0 && listSrlIdCapaConsRASTER.length > 0) {
			listSrlIdCapaCons		+= ",";
			listIdDataCapaCons		+= ",";
			listIdDataCapaCriCons	+= ",";
		}
		listSrlIdCapaCons		+= listSrlIdCapaConsRASTER;
		listIdDataCapaCons		+= listIdDataCapaConsRASTER;
		listIdDataCapaCriCons	+= listIdDataCapaCriConsRASTER;
	}
	var param	= {
			listSrlIdCapaConsulta: listSrlIdCapaCons,
			listIdDataCapaConsulta: listIdDataCapaCons,
			listIdDataCapaCriConsulta: listIdDataCapaCriCons,
	};
	$.post("consultaCombosACLFuxion.action", param, function(datos) {
		console.log(datos.strGeometriaRespuesta);
		procesarReporteACL(datos.strGeometriaRespuesta);
		$(".identificar-area-criterio-logico-modal").modal('hide');
	},"json");
}

function procesarReporteACL(wkt, idCapa) {
	blockui();
	var srlIdCapas="";
	$("input[name=capaIdentACL]").each(function(index) {
		var input	= $(this);
		console.log("+ input="+input.val()+" isChecked="+input.is(':checked'));
		if(input.is(':checked')) {
			if(srlIdCapas.length>0) {
				srlIdCapas+=",";
			}
			srlIdCapas+=input.val();
		}
	});
	var param	= null;
	if(wkt) {
		param	= {
				listSrlIdCapaConsulta: srlIdCapas,
				strPoligonoConsulta: wkt
			};
	} else if(idCapa) {
		param	= {
				listSrlIdCapaConsulta: srlIdCapas,
				strIdCapaConsulta: idCapa
			};
	}
	$.post('consultaCapas.action', param, function(datos) {
		$('.reporte-capas-modal').off('shown.bs.modal');
		$('.reporte-capas-modal').off('hidden.bs.modal');
		$('.reporte-capas-modal').on('shown.bs.modal', function (e) {
		});
		$('.reporte-capas-modal').on('hidden.bs.modal', function (e) {
		});
		$("#idDivReporte").html(datos);
		$('.reporte-capas-modal').modal('show');
		unblockui();
	});
}
function seleccionarTodosACL() {
	var checkedTodos	= true;
	$("input[name=capaIdentACL]").each(function(index) {
		checkedTodos	&= $(this).is(':checked');
	});
	$("input[name=capaIdentACL]").each(function(index) {
		$(this).prop('checked', !checkedTodos);
	});
	guardarCapasSeleccionadasACL();
}
