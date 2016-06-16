function evaluarConfiguracionFiltroUmbralACL(srlIdCapa,rangoUmbralVis) {
	//valSelect.join('|');
	var layers	= "";
	
	if(rangoUmbralVis && rangoUmbralVis != "") {
		var rangoValores = eval(rangoUmbralVis);
		if(srlIdCapa == "49") {//"Riqueza potencial de especies de fauna endémica"
			if(rangoValores[1] == "-1") {//Total
				layers	= "show:6";
			} else if(rangoValores[1] == "0") {//Nula
				layers	= "show:0";
			} else if(rangoValores[1] == "0.0001") {//Baja
				layers	= "show:1";
			} else if(rangoValores[1] == "13") {//Moderada
				layers	= "show:2";
			} else if(rangoValores[1] == "25") {//Moderada alta
				layers	= "show:3";
			} else if(rangoValores[1] == "39") {//Alta
				layers	= "show:4";
			} else if(rangoValores[1] == "55") {//Muy alta
				layers	= "show:5";
			}
		} else if(srlIdCapa == "48") {//"Riqueza potencial de especies en peligro de extincion"
			if(rangoValores[1] == "-1") {//Total
				layers	= "show:0";
			} else if(rangoValores[1] == "0") {//Nula
				layers	= "show:1";
			} else if(rangoValores[1] == "0.0010") {//Baja
				layers	= "show:2";
			} else if(rangoValores[1] == "3") {//Moderada
				layers	= "show:3";
			} else if(rangoValores[1] == "5") {//Alta
				layers	= "show:4";
			} else if(rangoValores[1] == "7") {//Muy alta
				layers	= "show:5";
			}
		} else if(srlIdCapa == "50") {//"Densidad de carbono de la biomasa área"
			if(rangoValores[1] == "-1") {//Total
				layers	= "show:0";
			} else if(rangoValores[1] == "0.0002") {//Muy Baja
				layers	= "show:1";
			} else if(rangoValores[1] == "0.6794") {//Baja
				layers	= "show:2";
			} else if(rangoValores[1] == "12.2266") {//Media
				layers	= "show:3";
			} else if(rangoValores[1] == "82.1892") {//Alta
				layers	= "show:4";
			} else if(rangoValores[1] == "110.0384") {//Muy alta
				layers	= "show:5";
			}
		} else if(srlIdCapa == "51") {//"Riesgo de erosión hídrica"
			if(rangoValores[1] == "-1") {//Total
				layers	= "show:0";
			} else if(rangoValores[1] == "2") {//Muy Baja
				layers	= "show:1";
			} else if(rangoValores[1] == "3") {//Baja
				layers	= "show:2";
			} else if(rangoValores[1] == "4") {//Moderada
				layers	= "show:3";
			} else if(rangoValores[1] == "5") {//Alta
				layers	= "show:4";
			} else if(rangoValores[1] == "7") {//Muy alta
				layers	= "show:5";
			}
		} else {
			if(rangoValores[1] != -1 && rangoValores[2] != -1) {
				paramRaster = "{"+
			    "\"rasterFunction\" : \"Remap\","+
			    "\"rasterFunctionArguments\" : {"+
			    "\"InputRanges\" : ["+rangoValores[1]+", "+rangoValores[2]+"],"+
			    "\"OutputValues\": ["+rangoValores[1]+"],"+
			    "\"AllowUnmatched\": \"false\""+
			    "}}";
			}
		}
	}
	return layers;
}
