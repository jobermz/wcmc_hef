function evaluarConfiguracionFiltroACL(srlIdCapa, valSelectJoin) {
	//valSelect.join('|');
	var paramDefs	= "";
	if(valSelectJoin) {
		var arrValSelect	= valSelectJoin.split("|");
		var idxDefs			= "";
		if(arrValSelect.length > 0) {
			for(var i=0;i<arrValSelect.length;i++) {
				if(idxDefs.length != 0) {
					idxDefs+=",";
				}
				idxDefs	+= ""+arrValSelect[i];
			}
			paramDefs	= eval("confDatosParamDefs_"+srlIdCapa+"(idxDefs)");
			//paramDefs		= "{\"0\":\"IDDPTO in("+consultaa+")\"}";
			//{"0":"IDDPTO in('05','04')"}
		} else {
			paramDefs		= "";
		}
	}
	return paramDefs;
}
function confDatosParamDefs_1(idxDefs) {//1	Departamentos
	return "{\"0\":\"IDDPTO in("+consultarDatosCapa("1", idxDefs, "strIddpto")+")\"}";
}
function confDatosParamDefs_2(idxDefs) {//2	Provincias
	return "{\"1\":\"IDPROV in("+consultarDatosCapa("2", idxDefs, "strIdprov")+")\"}";
}
function confDatosParamDefs_3(idxDefs) {//3	Distritos
	return "{\"3\":\"IDDIST in("+consultarDatosCapa("3", idxDefs, "strIddist")+")\"}";
}
	function confDatosParamDefs_9(idxDefs) {//9	Límite de la región amazónica 
		return "{\"2\":\"IDDPTO in("+consultarDatosCapa("9", idxDefs, "strIddpto")+")\"}";
	}
	function confDatosParamDefs_10(idxDefs) {//10	Información de lagos y lagunas principales a nivel nacional.
		return "{\"5\":\"IDDPTO in("+consultarDatosCapa("10", idxDefs, "strIddpto")+")\"}";
	}
	function confDatosParamDefs_11(idxDefs) {//11	Ríos
		return "{\"4\":\"IDDPTO in("+consultarDatosCapa("11", idxDefs, "strIddpto")+")\"}";
	}
	function confDatosParamDefs_12(idxDefs) {//12	Informacion de Unidades Hidrograficas a nivel nacional. Escala base de 1:100.000
		return "{\"0\":\"IDDPTO in("+consultarDatosCapa("12", idxDefs, "strIddpto")+")\"}";
	}
	function confDatosParamDefs_13(idxDefs) {//13	Red vial vecinal
		return "{\"0\":\"IDDPTO in("+consultarDatosCapa("13", idxDefs, "strIddpto")+")\"}";
	}
	function confDatosParamDefs_14(idxDefs) {//14	Red vial nacional
		return "{\"0\":\"IDDPTO in("+consultarDatosCapa("14", idxDefs, "strIddpto")+")\"}";
	}
	function confDatosParamDefs_15(idxDefs) {//15	Red vial departamental
		return "{\"0\":\"IDDPTO in("+consultarDatosCapa("15", idxDefs, "strIddpto")+")\"}";
	}
	function confDatosParamDefs_16(idxDefs) {//16	Vías férreas
		return "{\"0\":\"IDDPTO in("+consultarDatosCapa("16", idxDefs, "strIddpto")+")\"}";
	}
	function confDatosParamDefs_17(idxDefs) {//17	Vías Trochas
		return "{\"0\":\"IDDPTO in("+consultarDatosCapa("17", idxDefs, "strIddpto")+")\"}";
	}
function confDatosParamDefs_18(idxDefs) {//18	Comunidades Campesinas
	return "{\"12\":\"NOMBRE in("+consultarDatosCapa("18", idxDefs, "strNombre")+")\"}";
}
function confDatosParamDefs_19(idxDefs) {//19	Comunidades Nativas
	return "{\"8\":\"gml_id in("+consultarDatosCapa("19", idxDefs, "strGmlId")+")\"}";
}
function confDatosParamDefs_20(idxDefs) {//20	Reservas territoriales índigenas
	return "{\"10\":\"gml_id in("+consultarDatosCapa("20", idxDefs, "strGmlId")+")\"}";
}
function confDatosParamDefs_21(idxDefs) {//21	Solicitudes de creación de reservas territoriales indígenas
	return "{\"11\":\"OBJECTID_1 in("+consultarDatosCapa("21", idxDefs, "intObjectid1", true)+")\"}";
}
function confDatosParamDefs_22(idxDefs) {//22	Concesiones de Ecoturismo
	return "{\"4\":\"CONTRATO in("+consultarDatosCapa("22", idxDefs, "strContrato")+")\"}";
}
function confDatosParamDefs_23(idxDefs) {//23	Concesiones forestales para el aprovechamiento de la castaña y la shiringa //TODO CONFLICTO DE CAMPO ID OK
	return "{\"6\":\"OBJECTID in("+consultarDatosCapa("23", idxDefs, "intObjectid", true)+")\"}";
}
function confDatosParamDefs_24(idxDefs) {//24	Concesiones para conservación //TODO CONFLICTO DE CAMPO ID
	return "{\"3\":\"OBJECTID in("+consultarDatosCapa("24", idxDefs, "intGeodecid", true)+")\"}";
}
function confDatosParamDefs_25(idxDefs) {//25	Concesiones forestales con fines maderables //TODO CONFLICTO DE CAMPO ID OK
	return "{\"1\":\"OBJECTID in("+consultarDatosCapa("25", idxDefs, "intObjectid", true)+")\"}";
}
function confDatosParamDefs_26(idxDefs) {//26	Concesiones forestales con fines maderables en concurso //TODO CONFLICTO DE CAMPO ID OK
	return "{\"2\":\"OBJECTID in("+consultarDatosCapa("26", idxDefs, "intObjectid", true)+")\"}";
}
function confDatosParamDefs_27(idxDefs) {//27	Concesiones de áreas para manejo de fauna silvestre
	return "{\"5\":\"OBJECTID in("+consultarDatosCapa("27", idxDefs, "intObjectid", true)+")\"}";
}
function confDatosParamDefs_28(idxDefs) {//28	Concesiones forestales con fines de forestación y reforestación //TODO CONFLICTO DE CAMPO ID OK
	return "{\"7\":\"OBJECTID in("+consultarDatosCapa("28", idxDefs, "intObjectid", true)+")\"}";
}
		function confDatosParamDefs_29(idxDefs) {//29	Predios rurales a nivel nacional
			return "{\"0\":\"IDDPTO in("+consultarDatosCapa("29", idxDefs, "strIddpto")+")\"}";
		}
function confDatosParamDefs_30(idxDefs) {//30	Bosques de producción permamente //TODO CONFLICTO DE CAMPO ID OK
	return "{\"16\":\"OBJECTID in("+consultarDatosCapa("30", idxDefs, "intObjectid", true)+")\"}";
}
function confDatosParamDefs_31(idxDefs) {//31	Concesiones para la generación de energía eléctrica
	return "{\"14\":\"ID_GRAFICO in("+consultarDatosCapa("31", idxDefs, "strIdGrafico")+")\"}";
}
function confDatosParamDefs_32(idxDefs) {//32	Concesiones para la distribucion de energía eléctrica
	return "{\"13\":\"ID_GRAFICO in("+consultarDatosCapa("32", idxDefs, "strIdGrafico")+")\"}";
}
function confDatosParamDefs_33(idxDefs) {//33	Concesiones Mineras
	return "{\"9\":\"CONCESION in("+consultarDatosCapa("33", idxDefs, "strConcesion")+")\"}";
}
function confDatosParamDefs_34(idxDefs) {//34	Areas Naturales Protegidas a nivel nacional
	return "{\"2\":\"OBJECTID  in("+consultarDatosCapa("34", idxDefs, "lngObjectid", true)+")\"}";
}
function confDatosParamDefs_35(idxDefs) {//35	Areas de Conservación Regionales
	return "{\"4\":\"OBJECTID  in("+consultarDatosCapa("35", idxDefs, "intObjectid", true)+")\"}";
}
function confDatosParamDefs_36(idxDefs) {//36	Areas Naturales Protegidas de titularidad privada
	return "{\"3\":\"OBJECTID in("+consultarDatosCapa("36", idxDefs, "lngObjectid", true)+")\"}";
}
function confDatosParamDefs_37(idxDefs) {//37	Zonas de Amortiguamiento
	return "{\"5\":\"OBJECTID in("+consultarDatosCapa("37", idxDefs, "lngObjectid", true)+")\"}";
}
function confDatosParamDefs_38(idxDefs) {//38	Áreas clave para la biodiversidad
	return "{\"0\":\"OBJECTID_1 in("+consultarDatosCapa("38", idxDefs, "intObjectid1", true)+")\"}";
}
function confDatosParamDefs_39(idxDefs) {//39	Zonas RAMSAR
	return "{\"1\":\"GEODEC_ID in("+consultarDatosCapa("39", idxDefs, "intGeodecid", true)+")\"}";
}
	function confDatosParamDefs_40(idxDefs) {//40	Cobertura vegetal
		return "{\"0\":\"IDDPTO in("+consultarDatosCapa("40", idxDefs, "strIddpto")+")\"}";
	}
	function confDatosParamDefs_41(idxDefs) {//41	Valores medios de densidad de carbono por ecozonas
		return "{\"0\":\"IDDPTO in("+consultarDatosCapa("41", idxDefs, "strIddpto")+")\"}";
	}
	function confDatosParamDefs_42(idxDefs) {//42	Índice de Importancia Biológica
		return "{\"0\":\"IDDPTO in("+consultarDatosCapa("42", idxDefs, "strIddpto")+")\"}";
	}
	function confDatosParamDefs_43(idxDefs) {//43	 Centros Poblados
		return "{\"0\":\"IDDPTO in("+consultarDatosCapa("43", idxDefs, "strIddpto")+")\"}";
	}
	function confDatosParamDefs_44(idxDefs) {//44	Densidad de población
		return "{\"0\":\"IDDPTO in("+consultarDatosCapa("44", idxDefs, "strIddpto")+")\"}";
	}
	function confDatosParamDefs_45(idxDefs) {//45	Costos de oportunidad a nivel distrital para la reducción de emisiones por deforestación
		return "{\"0\":\"IDDPTO in("+consultarDatosCapa("45", idxDefs, "strIddpto")+")\"}";
	}
//	function confDatosParamDefs_46(idxDefs) {//46	Iniciativas, programas y proyectos de conservación existentes (puntos)
//		return "{\"0\":\"IDDPTO in("+consultarDatosCapa("46", idxDefs, "strIddpto")+")\"}";
//	}
//function confDatosParamDefs_47(idxDefs) {//47	Iniciativas, programas y proyectos de conservación existentes (polígonos)
//	return "{\"0\":\"SH_CODIGO in("+consultarDatosCapa("47", idxDefs, "dblShCodigo",true)+")\"}";
//}

function consultarDatosCapa(srlIdCapa, listIdDataCapaCons, nombVar, esInt) {
	var resultado	= "";
	var param	= {
			srlIdCapaConsulta:srlIdCapa,
			listIdDataCapaConsulta: listIdDataCapaCons
		};
	$.ajax({
		data:param,
		url:'consultaACLFiltroMapa.action',
		type:'post',
		async:false,
		dataType:"json",
		beforeSend:function(){},
		success:function(datos) {
			resultado			= "";
			for(var i = 0;i < datos.listReporte.length;i++) {
				if(resultado.length != 0) {
					resultado+=",";
				}
				if(esInt) {
					resultado	+= ""+eval("datos.listReporte[i]."+nombVar)+"";
				} else {
					resultado	+= "'"+eval("datos.listReporte[i]."+nombVar)+"'";
				}
			}
		}
	});
	return resultado;
}

function evaluarConfiguracionFiltroACL_ProyPoli(srlIdCapa) {
	var valSelectDepa		= $(".clsDivACL").find("select[name=combo_area_ACL_depa]").val();
	var valSelectAdmi		= $(".clsDivACL").find("select[name=combo_area_ACL_admi]").val();
	var valSelectCoop		= $(".clsDivACL").find("select[name=combo_area_ACL_coop]").val();
	var valSelectAnioDes	= $(".clsDivACL").find("select[name=combo_area_ACL_anio_desde]").val();
	var valSelectAnioHas	= $(".clsDivACL").find("select[name=combo_area_ACL_anio_hasta]").val();
	dataComboFiltroACL[srlIdCapa] = new Array();
	dataComboFiltroACL[srlIdCapa][0] = valSelectDepa;
	dataComboFiltroACL[srlIdCapa][1] = valSelectAdmi;
	dataComboFiltroACL[srlIdCapa][2] = valSelectCoop;
	dataComboFiltroACL[srlIdCapa][3] = valSelectAnioDes;
	dataComboFiltroACL[srlIdCapa][4] = valSelectAnioHas;
	
	var paramDefs	= "";
	paramDefs	+= "{\"1\":\"";
	var paramItemDefs	= "";
	if(valSelectDepa != null && valSelectDepa.length > 0 && valSelectDepa != "null") {
		for(var i=0;i<valSelectDepa.length;i++) {
			if(paramItemDefs.length != 0) {
				paramItemDefs	+= "OR ";
			} else {
				paramItemDefs	+= "( ";
			}
			paramItemDefs	+= "DEPARTAMEN like '%"+valSelectDepa[i]+"%' "; 
		}
		paramItemDefs	+= ") ";
	}
//	if(valSelectAdmi != null && valSelectAdmi.length > 0 && valSelectAdmi != "null") {
//		for(var i=0;i<valSelectAdmi.length;i++) {
//			if(paramItemDefs.length != 0) {
//				paramItemDefs	+= "and ";
//			}
//			paramItemDefs	+= "ADMINISTRA like '%"+valSelectAdmi[i]+"%' "; 
//		}
//	}
//	if(valSelectCoop != null && valSelectCoop.length > 0 && valSelectCoop != "null") {
//		for(var i=0;i<valSelectCoop.length;i++) {
//			if(paramItemDefs.length != 0) {
//				paramItemDefs	+= "and ";
//			}
//			paramItemDefs	+= "COOPERANTE like '%"+valSelectCoop[i]+"%' "; 
//		}
//	}
	
	if(valSelectAnioDes != "" && valSelectAnioHas != "") {
		if(parseInt(valSelectAnioDes) <= parseInt(valSelectAnioHas)) {
			if(paramItemDefs.length != 0) {
				paramItemDefs	+= "and ";
			}
			paramItemDefs	+= "( ";
			paramItemDefs	+= "ANIO_INIC >= "+valSelectAnioDes+" ";
			paramItemDefs	+= "and ";
			paramItemDefs	+= "ANIO_TERM <= "+valSelectAnioHas+" ";
			paramItemDefs	+= ") ";
		} else {
			alert("El año termino seleccionado debe ser posterior al año inicio");
		}
	}
	paramDefs	+= paramItemDefs;
	paramDefs	+= "\"}";
	
	var rs= {
			paramDefs:paramDefs,
			title:paramItemDefs
	};
	return rs;
}
function evaluarConfiguracionFiltroACL_ProyPunt(srlIdCapa) {
	var valSelectDepa		= $(".clsDivACL").find("select[name=combo_area_ACL_depa]").val();
	var valSelectAdmi		= $(".clsDivACL").find("select[name=combo_area_ACL_admi]").val();
	var valSelectCoop		= $(".clsDivACL").find("select[name=combo_area_ACL_coop]").val();
	var valSelectAnioDes	= $(".clsDivACL").find("select[name=combo_area_ACL_anio_desde]").val();
	var valSelectAnioHas	= $(".clsDivACL").find("select[name=combo_area_ACL_anio_hasta]").val();
	dataComboFiltroACL[srlIdCapa] = new Array();
	dataComboFiltroACL[srlIdCapa][0] = valSelectDepa;
	dataComboFiltroACL[srlIdCapa][1] = valSelectAdmi;
	dataComboFiltroACL[srlIdCapa][2] = valSelectCoop;
	dataComboFiltroACL[srlIdCapa][3] = valSelectAnioDes;
	dataComboFiltroACL[srlIdCapa][4] = valSelectAnioHas;

	var paramDefs	= "";
	paramDefs	+= "{\"0\":\"";
	var paramItemDefs	= "";
	if(valSelectDepa != null && valSelectDepa.length > 0 && valSelectDepa != "null") {
		for(var i=0;i<valSelectDepa.length;i++) {
			if(paramItemDefs.length != 0) {
				paramItemDefs	+= "OR ";
			} else {
				paramItemDefs	+= "( ";
			}
			paramItemDefs	+= "DEPARTAMEN like '%"+valSelectDepa[i]+"%' "; 
		}
		paramItemDefs	+= ") ";
	}
//	if(valSelectAdmi != null && valSelectAdmi.length > 0 && valSelectAdmi != "null") {
//		for(var i=0;i<valSelectAdmi.length;i++) {
//			if(paramItemDefs.length != 0) {
//				paramItemDefs	+= "and ";
//			}
//			paramItemDefs	+= "ADMINISTRA like '%"+valSelectAdmi[i]+"%' "; 
//		}
//	}
//	if(valSelectCoop != null && valSelectCoop.length > 0 && valSelectCoop != "null") {
//		for(var i=0;i<valSelectCoop.length;i++) {
//			if(paramItemDefs.length != 0) {
//				paramItemDefs	+= "and ";
//			}
//			paramItemDefs	+= "COOPERANTE like '%"+valSelectCoop[i]+"%' "; 
//		}
//	}

	if(valSelectAnioDes != "" && valSelectAnioHas != "") {
		if(parseInt(valSelectAnioDes) <= parseInt(valSelectAnioHas)) {
			if(paramItemDefs.length != 0) {
				paramItemDefs	+= "and ";
			}
			paramItemDefs	+= "( ";
			paramItemDefs	+= "ANIO_INIC >= "+valSelectAnioDes+" ";
			paramItemDefs	+= "and ";
			paramItemDefs	+= "ANIO_TERM <= "+valSelectAnioHas+" ";
			paramItemDefs	+= ") ";
		} else {
			alert("El año termino seleccionado debe ser posterior al año inicio");
		}
	}
	paramDefs	+= paramItemDefs;
	paramDefs	+= "\"}";
	
	var rs= {
			paramDefs:paramDefs,
			title:paramItemDefs
	};
	return rs;
}
function confDatosParamDefs_46(idxDefs) {//46	Iniciativas, programas y proyectos de conservación existentes (puntos)
	return "{\"0\":\"IDDPTO in("+consultarDatosCapa("46", idxDefs, "strIddpto")+")\"}";
}
function confDatosParamDefs_47(idxDefs) {//47	Iniciativas, programas y proyectos de conservación existentes (polígonos)
return "{\"0\":\"SH_CODIGO in("+consultarDatosCapa("47", idxDefs, "dblShCodigo",true)+")\"}";
}
