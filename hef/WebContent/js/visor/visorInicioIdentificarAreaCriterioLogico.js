function iniciarIdentificarAreaPorCriteriosLogicos() {
	//$('.identificar-area-criterio-logico').click(identificarAreaCriterioLogico);
	
	$('.btnProcesarIdentAreaCriteriosLogicos').click(procesarCriterioLogico);
	//$('.btnSeleccionarTodasCapasACL').click(seleccionarTodosACL);
	$(".btnAplicarACLFiltrar").click(aplicarFiltroACL);
	
	//$("#idCriterioFiltroUmbral").change(actualizarFiltroUmbralACLEvent);
	$(".btnAplicarACLUmbral").click(aplicarFiltroUmbralACL);
	
	$("#idCriterioFiltroNumerico").change(actualizarFiltrajeNumericoACLEvent);
	$(".btnAplicarACLFiltraje").click(aplicarFiltrajeNumericoACL);
	
	$(".clsLimpiarACL").click(limpiarCapasSeleccionadasACL);
	
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
function filtrarACL(srlIdCapa) {
	srlIdCapa	= ""+srlIdCapa;
	cerrarTodosPopover();
	$(".clsDivACL").html("<center><div style='background-color:#FFFFFF;height:28px;vertical-align: middle;'><img src='image/busy.gif'/> Espere por favor</div></center>");
	$('.identificar-area-criterio-logico-filtrar-modal').off('shown.bs.modal');
	$('.identificar-area-criterio-logico-filtrar-modal').off('hidden.bs.modal');
	$('.identificar-area-criterio-logico-filtrar-modal').on('shown.bs.modal', function (e) {
		var param	= {
				listSrlIdCapaConsulta:srlIdCapa
		};
		$.post("consultaCombosACL.action", param, function(datos) {
			$(".clsDivACL").find(".combo_area_ACL").each(function(index) {
				$(this).unbind("selectpicker");
			});
			$(".clsDivACL").html(datos);
			$(".clsDivACL").find(".combo_area_ACL").selectpicker({
				liveSearch: true
				//maxOptions: 5
			});
			var valSelect	= dataComboFiltroACL[srlIdCapa];
			if(valSelect) {
				$(".clsDivACL").find("select[name=combo_area_ACL]").val(valSelect);
				$(".clsDivACL").find(".combo_area_ACL").selectpicker('refresh');
			}

			$(".clsDivACL").attr("srlIdCapa", srlIdCapa);
		});
	});
	$('.identificar-area-criterio-logico-filtrar-modal').on('hidden.bs.modal', function (e) {
		//$(".identificar-area-criterio-logico-modal").modal('show');
	});
	//$(".identificar-area-criterio-logico-modal").modal('hide');
	$('.identificar-area-criterio-logico-filtrar-modal').modal('show');
}
var dataComboFiltroACL	= new Array();
function aplicarFiltroACL() {
	
	var srlIdCapa		= $(".clsDivACL").attr("srlIdCapa");
	var valSelect		= "";
	var valSelectTxt	= "";
	var paramDefs		= "";
	if(srlIdCapa == "47" ) {
		var rs			= evaluarConfiguracionFiltroACL_ProyPoli(srlIdCapa);
		paramDefs		= rs.paramDefs;
		valSelectTxt	= rs.title;//"Varios criterios para poligonos";
	} else if(srlIdCapa == "46") {
		var rs			= evaluarConfiguracionFiltroACL_ProyPunt(srlIdCapa);
		paramDefs		= rs.paramDefs;
		valSelectTxt	= rs.title;//"Varios criterios para puntos";
	} else {
		valSelect			= $(".clsDivACL").find("select").val();
		valSelectTxt		= $(".clsDivACL").find("button[data-id=combo_area_ACL]").attr("title");
		if(valSelect) {
			dataComboFiltroACL[srlIdCapa] = valSelect;
			valSelect			= valSelect.join('|');
		}
		paramDefs		= evaluarConfiguracionFiltroACL(srlIdCapa, valSelect);
	}
	$(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa).attr("title", valSelectTxt);
	$(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa).css("display", "");
	$(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa).attr("title", valSelectTxt);
	if(valSelect) {
		$(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa).attr("valSelect", valSelect);
	}
	$(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa).attr("paramDefs", paramDefs);
	$(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa).attr("srlIdCapa", srlIdCapa);
	$('.identificar-area-criterio-logico-filtrar-modal').modal('hide');
	refrescarVisualizarCapa(srlIdCapa);
	//$(".identificar-area-criterio-logico-modal").modal('show');
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
function filtrarUmbralACL(srlIdCapa) {
	cerrarTodosPopover();
	$('.identificar-area-criterio-logico-umbral-modal').attr('srlIdCapa', srlIdCapa);
	$('.identificar-area-criterio-logico-umbral-modal').off('shown.bs.modal');
	$('.identificar-area-criterio-logico-umbral-modal').off('hidden.bs.modal');
	$('.identificar-area-criterio-logico-umbral-modal').on('shown.bs.modal', function (e) {
		var srlIdCapa	= $('.identificar-area-criterio-logico-umbral-modal').attr('srlIdCapa');
		var param	= {
				srlIdCapa: srlIdCapa
		};
		var urlAction	= "";
		if(srlIdCapa == "48" || srlIdCapa == "49" || srlIdCapa == "51") {
			urlAction	= "consultaCombosCapaUmbralSinDec.action";
		} else if(srlIdCapa == "50") {
			urlAction	= "consultaCombosCapaUmbral2Dec.action";
		} else {
			urlAction	= "consultaCombosCapaUmbral.action";
		}
		$.post(urlAction, param, function(datos) {
			var objDefFiltro	= $(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa);
			$("#idDivComboUmbrales").find("select[name=filtrar_umbral]").each(function(index) {
				$(this).unbind("selectpicker");
			});
			$("#idDivComboUmbrales").html(datos);
			$("#idDivComboUmbrales").find("select[name=filtrar_umbral]").selectpicker({
				//liveSearch: true
				//maxOptions: 1
			});
			$("#idDivComboUmbrales").attr("srlIdCapa", srlIdCapa);

			//actualizarFiltroUmbralACL(srlIdCapa);
			var valSelect		= objDefFiltro.attr("valSelect");//Ambos
			if(valSelect && valSelect.indexOf(",") != -1) {
				valSelect	= eval("[" + valSelect + "]");
				$("#idValorFiltroUmbralPre").val(valSelect);
			}
			
			$("#idDivComboUmbrales").find("select[name=filtrar_umbral]").selectpicker('refresh');
		});
		$.post("consultaUmbralesMinMaxACL.action", param, function(datos) {
			console.log("consultaUmbralesMinMaxACL: min=" + datos.strCapaUmbralMin + " max=" + datos.strCapaUmbralMax+" nombre="+datos.strCapaUmbralNombreCapa);
			$("#idDivRangoUmbranlMinimo").html(datos.strCapaUmbralMin);
			$("#idDivRangoUmbranlMaximo").html(datos.strCapaUmbralMax);
			$("#idDivCapaUmbralNombreCapa").html(datos.strCapaUmbralNombreCapa);
		}, "json");
	});
	$('.identificar-area-criterio-logico-umbral-modal').on('hidden.bs.modal', function (e) {
		//$(".identificar-area-criterio-logico-modal").modal('show');
	});
	//$(".identificar-area-criterio-logico-modal").modal('hide');
	$('.identificar-area-criterio-logico-umbral-modal').modal('show');
}

function aplicarFiltroUmbralACL() {
	var valorFiltroUmbralPreTXT	= $("#idValorFiltroUmbralPre").parent().find("button").find(".filter-option").html();
	var valorFiltroUmbralPre	= $("#idValorFiltroUmbralPre").val();
	var srlIdCapa				= $('.identificar-area-criterio-logico-umbral-modal').attr('srlIdCapa');
	var objDefFiltro	= $(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa);
	
	objDefFiltro.attr("srlIdCapa", srlIdCapa);
	objDefFiltro.css("display", "");
	objDefFiltro.attr("title", "Umbral: "+valorFiltroUmbralPreTXT);
	objDefFiltro.attr("valSelect",valorFiltroUmbralPre);
	refrescarVisualizarCapa(srlIdCapa);
	$('.identificar-area-criterio-logico-umbral-modal').modal('hide');
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
function filtrajeNumericoACL(srlIdCapa) {
	cerrarTodosPopover();
	$('.identificar-area-criterio-logico-filtraje-numerico-modal').attr('srlIdCapa', srlIdCapa);
	$('.identificar-area-criterio-logico-filtraje-numerico-modal').off('shown.bs.modal');
	$('.identificar-area-criterio-logico-filtraje-numerico-modal').off('hidden.bs.modal');
	$('.identificar-area-criterio-logico-filtraje-numerico-modal').on('shown.bs.modal', function (e) {
//		var srlIdCapa	= $('.identificar-area-criterio-logico-filtraje-numerico-modal').attr('srlIdCapa');
		$("#idDivFiltrajeCriterio").css("display","");
		$("#idDivFiltrajeEcozonas").css("display","none");
		$("#idDivFiltrajeRangos").css("display","");
		
		$("#idCriterioFiltroNumerico").val("mayor");
		$("#idValorFiltraje").val("");
		$("#idValorFiltrajeDesde").val("");
		$("#idValorFiltrajeHasta").val("");
		
		actualizarFiltrajeNumericoACLEvent();
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		var srlIdCapa	= $('.identificar-area-criterio-logico-filtraje-numerico-modal').attr('srlIdCapa');
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		{
			$("#idDivFiltrajeCriterio").css("display","none");
			$("#idDivFiltrajeEcozonas").css("display","none");
			$("#idDivFiltrajeRangos").css("display","none");
			$("#idDivRowComboFiltrajeNumerico").css("display","");
			var param	= {
					srlIdCapa: srlIdCapa
			};
			$.post("consultaUmbralesMinMaxACL.action", param, function(datos) {
				//console.log("consultaUmbralesMinMaxACL: min=" + datos.strCapaUmbralMin + " max=" + datos.strCapaUmbralMax+" nombre="+datos.strCapaUmbralNombreCapa);
				$("#idDivRangoFiltrajeMinimo").html(datos.strCapaUmbralMin);
				$("#idDivRangoFiltrajeMaximo").html(datos.strCapaUmbralMax);
				$("#idDivCapaFiltrajeNombreCapa").html(datos.strCapaUmbralNombreCapa);
			}, "json");
			var urlAction	= "";
			if(srlIdCapa == "43") {//Centros poblados
				urlAction	= "consultaCombosCapaFiltrajeNumSinDec.action";
			} else {
				urlAction	= "consultaCombosCapaFiltrajeNum.action";
			}
			$.post(urlAction, param, function(datos) {
				//var objDefFiltro	= $(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa);
				//idValorFiltroRangoNum" name="filtrar_rango_numerico
				$("#idDivComboFiltrajeNumerico").find("select[name=filtrar_rango_numerico]").each(function(index) {
					$(this).unbind("selectpicker");
				});
				$("#idDivComboFiltrajeNumerico").html(datos);
				$("#idDivComboFiltrajeNumerico").find("select[name=filtrar_rango_numerico]").selectpicker({
					//liveSearch: true
					//maxOptions: 1
				});
				$("#idDivComboFiltrajeNumerico").attr("srlIdCapa", srlIdCapa);
				var valSelect	= dataComboFiltrajeNumericoACL[srlIdCapa];
				if(valSelect) {
					$("#idDivComboFiltrajeNumerico").find("select[name=filtrar_rango_numerico]").val(valSelect);
				}
				
				/*
				var valSelect		= objDefFiltro.attr("valSelect");//Ambos
				if(valSelect.indexOf(",") != -1) {
					valSelect	= eval("[" + valSelect + "]");
				}
				$("#idValorFiltroUmbralPre").val(valSelect);
				*/
				$("#idDivComboFiltrajeNumerico").find("select[name=filtrar_rango_numerico]").selectpicker('refresh');
			});
		}
	});
	$('.identificar-area-criterio-logico-filtraje-numerico-modal').on('hidden.bs.modal', function (e) {});
	$('.identificar-area-criterio-logico-filtraje-numerico-modal').modal('show');
}
var dataComboFiltrajeNumericoACL	= new Array();
function aplicarFiltrajeNumericoACL() {
	//alert("aplicarFiltrajeNumericoACL();");
	var srlIdCapa	= $('.identificar-area-criterio-logico-filtraje-numerico-modal').attr('srlIdCapa');
	var paramDefs	= "";
	{
		var valSelect	= $("#idDivComboFiltrajeNumerico").find("select").val();
		dataComboFiltrajeNumericoACL[srlIdCapa] = valSelect;
		//valSelect			= valSelect.join('|');
		if(srlIdCapa == "41") {//tem_carbono_ecozonas
			var mostrar	= "";
			var criterios	= "";
			for(var i = 0;i<valSelect.length;i++) {
				var arrDatos	= eval(valSelect[i]);
				if(criterios != "") {
					criterios	+= ",";
					mostrar		+= ", ";
				}
				criterios	+= "'"+arrDatos[3]+"'";
				mostrar		+= ""+arrDatos[3]+"";
			}
			criterios	= "tC_ha in ("+criterios+")";
			paramDefs	= "{\"0\":\""+criterios+"\"}";
			$(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa).attr("title", "Valores en: "+mostrar);
		} else if(srlIdCapa == "42") {//tem_indice_importancia_biologica
			var criterios	= "";
			var mostrar	= "";
			for(var i = 0;i<valSelect.length;i++) {
				var arrDatos	= eval(valSelect[i]);
				if(criterios != "") {
					criterios	+= " OR ";
					mostrar		+= ", ";
				}
				criterios	+= "(imp_glob > "+arrDatos[1]+" and imp_glob <= "+arrDatos[2]+")";
				mostrar		+= "["+arrDatos[1]+" < val <= "+arrDatos[2]+"]";
			}
			paramDefs	= "{\"0\":\""+criterios+"\"}";
			//paramDefs	= "{\"0\":\"imp_glob > "+idValorFiltraje+"\"}";
			$(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa).attr("title", "Rangos: "+mostrar);
		} else if(srlIdCapa == "43") {//tem_centros_poblados
			var criterios	= "";
			var mostrar	= "";
			for(var i = 0;i<valSelect.length;i++) {
				var arrDatos	= eval(valSelect[i]);
				if(criterios != "") {
					criterios	+= " OR ";
					mostrar		+= ", ";
				}
				criterios	+= "(POB07 > "+arrDatos[1]+" and POB07 <= "+arrDatos[2]+")";
				mostrar		+= "["+arrDatos[1]+" < val <= "+arrDatos[2]+"]";
			}
			paramDefs	= "{\"0\":\""+criterios+"\"}";
			//paramDefs	= "{\"0\":\"POB07 > "+idValorFiltraje+"\"}";
			$(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa).attr("title", "Rangos: "+mostrar);
		} else if(srlIdCapa == "44") {//tem_proyeccion_densidad_pob_2015
			var criterios	= "";
			var mostrar	= "";
			for(var i = 0;i<valSelect.length;i++) {
				var arrDatos	= eval(valSelect[i]);
				if(criterios != "") {
					criterios	+= " OR ";
					mostrar		+= ", ";
				}
				criterios	+= "(pop_dens > "+arrDatos[1]+" and pop_dens <= "+arrDatos[2]+")";
				mostrar		+= "["+arrDatos[1]+" < val <= "+arrDatos[2]+"]";
			}
			paramDefs	= "{\"1\":\""+criterios+"\"}";
			//paramDefs	= "{\"1\":\"pop_dens > "+idValorFiltraje+"\"}";
			$(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa).attr("title", "Rangos: "+mostrar);
		} else if(srlIdCapa == "45") {//tem_costo_oportunidad_deforestacion
			var criterios	= "";
			var mostrar	= "";
			for(var i = 0;i<valSelect.length;i++) {
				var arrDatos	= eval(valSelect[i]);
				if(criterios != "") {
					criterios	+= " OR ";
					mostrar		+= ", ";
				}
				criterios	+= "(COP_tCo2_h > "+arrDatos[1]+" and COP_tCo2_h <= "+arrDatos[2]+")";
				mostrar		+= "["+arrDatos[1]+" < val <= "+arrDatos[2]+"]";
			}
			paramDefs	= "{\"0\":\""+criterios+"\"}";
			//paramDefs	= "{\"0\":\"COP_tCo2_h > "+idValorFiltraje+"\"}";
			$(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa).attr("title", "Rangos: "+mostrar);
		}
	}
		
	/*
	} else if(srlIdCapa == "42") {//tem_indice_importancia_biologica
		var idCriterioFiltroNumerico	= $("#idCriterioFiltroNumerico").val();
		if(idCriterioFiltroNumerico == "mayor") {
			var idValorFiltraje	= $("#idValorFiltraje").val();
			paramDefs	= "{\"0\":\"imp_glob > "+idValorFiltraje+"\"}";
			$(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa).attr("title", "> "+idValorFiltraje);
		} else if(idCriterioFiltroNumerico == "menor") {
			var idValorFiltraje	= $("#idValorFiltraje").val();
			paramDefs	= "{\"0\":\"imp_glob < "+idValorFiltraje+"\"}";
			$(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa).attr("title", "< "+idValorFiltraje);
		} else if(idCriterioFiltroNumerico == "rango") {
			var idValorFiltrajeDesde	= $("#idValorFiltrajeDesde").val();
			var idValorFiltrajeHasta	= $("#idValorFiltrajeHasta").val();
			paramDefs	= "{\"0\":\"imp_glob > "+idValorFiltrajeDesde+" and imp_glob < "+idValorFiltrajeHasta+"\"}";
			$(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa).attr("title", "["+idValorFiltrajeDesde+"-"+idValorFiltrajeHasta+"]");
		}
	} else if(srlIdCapa == "43") {//tem_centros_poblados
		var idCriterioFiltroNumerico	= $("#idCriterioFiltroNumerico").val();
		if(idCriterioFiltroNumerico == "mayor") {
			var idValorFiltraje	= $("#idValorFiltraje").val();
			paramDefs	= "{\"0\":\"POB07 > "+idValorFiltraje+"\"}";
			$(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa).attr("title", "> "+idValorFiltraje);
		} else if(idCriterioFiltroNumerico == "menor") {
			var idValorFiltraje	= $("#idValorFiltraje").val();
			paramDefs	= "{\"0\":\"POB07 < "+idValorFiltraje+"\"}";
			$(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa).attr("title", "< "+idValorFiltraje);
		} else if(idCriterioFiltroNumerico == "rango") {
			var idValorFiltrajeDesde	= $("#idValorFiltrajeDesde").val();
			var idValorFiltrajeHasta	= $("#idValorFiltrajeHasta").val();
			paramDefs	= "{\"0\":\"POB07 > "+idValorFiltrajeDesde+" and POB07 < "+idValorFiltrajeHasta+"\"}";
			$(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa).attr("title", "["+idValorFiltrajeDesde+"-"+idValorFiltrajeHasta+"]");
		}
	} else if(srlIdCapa == "44") {//tem_proyeccion_densidad_pob_2015
		var idCriterioFiltroNumerico	= $("#idCriterioFiltroNumerico").val();
		if(idCriterioFiltroNumerico == "mayor") {
			var idValorFiltraje	= $("#idValorFiltraje").val();
			paramDefs	= "{\"1\":\"pop_dens > "+idValorFiltraje+"\"}";
			$(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa).attr("title", "> "+idValorFiltraje);
		} else if(idCriterioFiltroNumerico == "menor") {
			var idValorFiltraje	= $("#idValorFiltraje").val();
			paramDefs	= "{\"1\":\"pop_dens < "+idValorFiltraje+"\"}";
			$(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa).attr("title", "< "+idValorFiltraje);
		} else if(idCriterioFiltroNumerico == "rango") {
			var idValorFiltrajeDesde	= $("#idValorFiltrajeDesde").val();
			var idValorFiltrajeHasta	= $("#idValorFiltrajeHasta").val();
			paramDefs	= "{\"1\":\"pop_dens > "+idValorFiltrajeDesde+" and pop_dens < "+idValorFiltrajeHasta+"\"}";
			$(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa).attr("title", "["+idValorFiltrajeDesde+"-"+idValorFiltrajeHasta+"]");
		}
	} else if(srlIdCapa == "45") {//tem_costo_oportunidad_deforestacion
		var idCriterioFiltroNumerico	= $("#idCriterioFiltroNumerico").val();
		if(idCriterioFiltroNumerico == "mayor") {
			var idValorFiltraje	= $("#idValorFiltraje").val();
			paramDefs	= "{\"0\":\"COP_tCo2_h > "+idValorFiltraje+"\"}";
			$(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa).attr("title", "> "+idValorFiltraje);
		} else if(idCriterioFiltroNumerico == "menor") {
			var idValorFiltraje	= $("#idValorFiltraje").val();
			paramDefs	= "{\"0\":\"COP_tCo2_h < "+idValorFiltraje+"\"}";
			$(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa).attr("title", "< "+idValorFiltraje);
		} else if(idCriterioFiltroNumerico == "rango") {
			var idValorFiltrajeDesde	= $("#idValorFiltrajeDesde").val();
			var idValorFiltrajeHasta	= $("#idValorFiltrajeHasta").val();
			paramDefs	= "{\"0\":\"COP_tCo2_h > "+idValorFiltrajeDesde+" and COP_tCo2_h < "+idValorFiltrajeHasta+"\"}";
			$(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa).attr("title", "["+idValorFiltrajeDesde+"-"+idValorFiltrajeHasta+"]");
		}
	}
	*/
	$(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa).css("display", "");
	$(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa).attr("paramDefs", paramDefs);
	$(".seleccionar-capas-modal").find("#idDivDetFiltroACLTitle"+srlIdCapa).attr("srlIdCapa", srlIdCapa);
	
	refrescarVisualizarCapa(srlIdCapa);
//	var valSelect		= $(".clsDivACL").find("select").val();
//	valSelect			= valSelect.join('|');
//	var valSelectTxt	= $(".clsDivACL").find("button[data-id=combo_area_ACL]").attr("title");
//	var paramDefs		= evaluarConfiguracionFiltroACL(srlIdCapa, valSelect);
	
	$('.identificar-area-criterio-logico-filtraje-numerico-modal').modal('hide');
}
function actualizarFiltrajeNumericoACLEvent() {
	var idCriterioFiltroNumerico	= $("#idCriterioFiltroNumerico").val();
	if(idCriterioFiltroNumerico == "mayor") {
		$("#idDivFiltrajeNumericoValor").css("display","");
		$("#idDivFiltrajeNumericoRango").css("display","none");
		$("#idValorFiltrajeDesde").val("");
		$("#idValorFiltrajeHasta").val("");
		$("#idValorFiltraje").val("");
	} else if(idCriterioFiltroNumerico == "menor") {
		$("#idDivFiltrajeNumericoValor").css("display","");
		$("#idDivFiltrajeNumericoRango").css("display","none");
		$("#idValorFiltrajeDesde").val("");
		$("#idValorFiltrajeHasta").val("");
		$("#idValorFiltraje").val("");
	} else if(idCriterioFiltroNumerico == "rango") {
		$("#idDivFiltrajeNumericoValor").css("display","none");
		$("#idDivFiltrajeNumericoRango").css("display","");
		$("#idValorFiltrajeDesde").val("");
		$("#idValorFiltrajeHasta").val("");
		$("#idValorFiltraje").val("");
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
function procesarCriterioLogico() {
	procesarCriterioLogicoExecute(false);
}

function procesarCriterioLogicoExecute(esOrigenProcesarAPA, wkt, idCapa) {
	blockui();
	var listSrlIdCapaCons			= "";
	var listIdDataCapaCons			= "";
	var listIdDataCapaCriCons		= "";
	var listSrlIdCapaConsRASTER		= "";
	var listIdDataCapaConsRASTER	= "";
	var listIdDataCapaCriConsRASTER	= "";
	//guardarCapasSeleccionadasACL();
	$(".clsDivDetFiltroACL").each(function(index) {
		var valSelect		= $(this).attr("valSelect");//Ambos
		var valSelectDesde	= $(this).attr("valSelectDesde");//Solo Umbrales
		var valSelectHasta	= $(this).attr("valSelectHasta");//Solo Umbrales
		var valCriterio		= $(this).attr("valCriterio");//Solo Umbrales siempre
		var srlIdCapa		= $(this).attr("srlIdCapa");//Ambos
		if(valCriterio && valCriterio != "") {
			if(listSrlIdCapaConsRASTER.length > 0) {
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
			listIdDataCapaCriCons	+= "";
		}
	});
	if(!esOrigenProcesarAPA && listSrlIdCapaCons.length <= 0) {
		alert("Debe incluir por lo menos una capa de tipo vectorial");
		unblockui();
		return;
	}
	if(esOrigenProcesarAPA && listSrlIdCapaCons.length <= 0 && listSrlIdCapaConsRASTER.length <= 0) {
		//unblockui();
		return;
	}
	if(listSrlIdCapaConsRASTER.length > 0) {
		if(listSrlIdCapaCons.length > 0) {
			listSrlIdCapaCons		+= ",";
			listIdDataCapaCons		+= ",";
			listIdDataCapaCriCons	+= ",";
		}
		listSrlIdCapaCons		+= listSrlIdCapaConsRASTER;
		listIdDataCapaCons		+= listIdDataCapaConsRASTER;
		listIdDataCapaCriCons	+= listIdDataCapaCriConsRASTER;
	}
	var param	= null;
	if(wkt) {//Para los casos, dib rect y pol, cargar polig desde zip
		param	= {
				listSrlIdCapaConsulta: listSrlIdCapaCons,
				listIdDataCapaConsulta: listIdDataCapaCons,
				listIdDataCapaCriConsulta: listIdDataCapaCriCons,
				strPoligonoConsulta: wkt,
				zoomLevel: map.getView().getZoom(),
				esRaster:true
			};
	} else if(idCapa) {//Solo para el caso de click derecho
		param	= {
				listSrlIdCapaConsulta: listSrlIdCapaCons,
				listIdDataCapaConsulta: listIdDataCapaCons,
				listIdDataCapaCriConsulta: listIdDataCapaCriCons,
				strIdCapaConsulta: idCapa,
				zoomLevel: map.getView().getZoom(),
				esRaster:true
			};
	} else {
		param	= {
				listSrlIdCapaConsulta: listSrlIdCapaCons,
				listIdDataCapaConsulta: listIdDataCapaCons,
				listIdDataCapaCriConsulta: listIdDataCapaCriCons,
				zoomLevel: map.getView().getZoom(),
				esRaster:true
		};
	}
	$.ajax({
		data:param,
		url:'consultaACLFuxion.action',
		type:'post',
		async:false,
		dataType:"json",
		beforeSend:function(){},
		success:function(response){
			if(!esOrigenProcesarAPA) {
				procesarAnalizarPorArea(null, null);
			/*} else {
				unblockui();*/
			}
		}
	});
	/*
	$.post("consultaACLFuxion.action", param, function(datos) {
		if(!esOrigenProcesarAPA) {
			procesarAnalizarPorArea(null, null);
		} else {
			unblockui();
		}
	},"json");
	*/
	
}
/*
function procesarReporteACL() {
	var srlIdCapas="";
	$("input[name=capasBase]").each(function(index) {
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
	param	= {
			listSrlIdCapaConsulta: srlIdCapas,
			zoomLevel: map.getView().getZoom()
		};
	
	$.post('consultaCapas.action', param, function(datos) {
		$("#idDivReporte").html("");
		$('.seleccionar-capas-modal').css("display", "none");
		$('.reporte-capas-modal').css("display", "");
		
		$("#idDivReporte").html(datos);
		unblockui();
	});
}
*/
function ocutarReporte() {
	$('.seleccionar-capas-modal').css("display", "");
	$('.reporte-capas-modal').css("display", "none");
	dibujarEnMapaOcultar();
}
function mostrarReporte() {
	$('.seleccionar-capas-modal').css("display", "none");
	$('.reporte-capas-modal').css("display", "");
	dibujarEnMapaMostrar();
}
function limpiarCapasEspACL(inputCheckBox) {
	var elementFiltro		= inputCheckBox.parent().parent().find(".clsDivDetFiltroACL");
	var elementFiltroTitle	= inputCheckBox.parent().parent().find(".clsDivDetFiltroACLTitle");

	var srlIdCapa	= elementFiltroTitle.attr("srlIdCapa");
	elementFiltro.removeAttr("valSelect");
	elementFiltro.removeAttr("valSelectDesde");
	elementFiltro.removeAttr("valSelectHasta");
	elementFiltro.removeAttr("valCriterio");
	elementFiltro.removeAttr("srlIdCapa");
	elementFiltro.removeAttr("title");
	elementFiltro.removeAttr("rangoUmbralVis");
	elementFiltroTitle.removeAttr("paramDefs");
	elementFiltroTitle.removeAttr("valSelect");
	elementFiltroTitle.removeAttr("valSelectDesde");
	elementFiltroTitle.removeAttr("valSelectHasta");
	elementFiltroTitle.removeAttr("valCriterio");
	elementFiltroTitle.removeAttr("srlIdCapa");
	elementFiltroTitle.removeAttr("title");
	elementFiltroTitle.removeAttr("rangoUmbralVis");
	elementFiltroTitle.css("display", "none");
	dataComboFiltrajeNumericoACL[srlIdCapa]	= null;
	dataComboFiltroACL[srlIdCapa]			= null;
}
function limpiarCapasSeleccionadasACL() {
	$(".clsDivDetFiltroACL").each(function(index) {
		$(this).removeAttr("valSelect");
		$(this).removeAttr("valSelectDesde");
		$(this).removeAttr("valSelectHasta");
		$(this).removeAttr("valCriterio");
		$(this).removeAttr("srlIdCapa");
		$(this).removeAttr("title");
		$(this).removeAttr("rangoUmbralVis");
	});
	$(".clsDivDetFiltroACLTitle").each(function(index) {
		$(this).removeAttr("paramDefs");
		$(this).removeAttr("valSelect");
		$(this).removeAttr("valSelectDesde");
		$(this).removeAttr("valSelectHasta");
		$(this).removeAttr("valCriterio");
		$(this).removeAttr("srlIdCapa");
		$(this).removeAttr("title");
		$(this).removeAttr("rangoUmbralVis");
		$(this).css("display", "none");
	});
//	$(".capasBase").each(function(index) {
//		if($(this).is(':checked')) {
//			mostrarCapaById($(this).val());
//		} else {
//			ocultarCapaById($(this).val());
//		}
//	});
	ocultarTodasCapas();
	iniciarCapasSeleccionadasDefault();
	dataComboFiltrajeNumericoACL	= new Array();
	dataComboFiltroACL				= new Array();

}
