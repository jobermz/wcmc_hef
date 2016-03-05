function iniciarIdentificarAreaPorCriteriosLogicos() {
	$('.btnProcesarAnalizarPorArea').click(procesarAnalizarPorArea);
}
//function filtrar() {
//	alert("combo filtrar");
//	$.post('cargarCapasBaseJson.action', null, function(datos) {
//		capasBaseArr	= datos.listCapasBase;
//	}, "json");
//	$("select[name=centrar_departamento]").change(centrar_depa_upd_dpto);
//	$("select[name=centrar_prov_departamento]").change(centrar_prov_upd_dpto);
//	$("select[name=centrar_dist_departamento]").change(centrar_dist_upd_dpto);
	
	
	
//	$('.identificar-area-criterio-logico-modal').off('shown.bs.modal');
//	$('.identificar-area-criterio-logico-modal').off('hidden.bs.modal');
//	$('.identificar-area-criterio-logico-modal').on('shown.bs.modal', function (e) {
//	});
//	$('.identificar-area-criterio-logico-modal').on('hidden.bs.modal', function (e) {
//	});
//	$('.identificar-area-criterio-logico-modal').modal('show');

//}
function procesarAnalizarPorArea(wkt) {
//	alert("procesar analizar por area");
	var srlIdCapas="";
	$("input[name=capaAnalisPorArea]").each(function(index) {
		var input	= $(this);
		console.log("+ input="+input.val()+" isChecked="+input.is(':checked'));
		if(input.is(':checked')) {
			if(srlIdCapas.length>0) {
				srlIdCapas+=",";
			}
			srlIdCapas+=input.val();
		}
	});
	var param	= {
			listSrlIdCapaConsulta: srlIdCapas,
			strPoligonoConsulta: wkt
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
		console.log("DATOS="+datos);
	});
}
function mostrarDetaRepo(strPagRepo, idDivDest, _this) {
	$(".list-group-item").each(function(index) {
		$(this).removeClass("active");
	});
	$(_this).addClass("active");
	$.post("paginas/consulta/"+strPagRepo, null, function(datos) {
		$("#"+idDivDest).html(datos);
	});
}