package wcmc.hef.general.util;

import java.util.ArrayList;
import java.util.List;

public class ConfiguracionProperties {
	public static String CAPAS_BASE_DEPARTAMENTO	= "capas_base_departamento";
	public static String CAPAS_BASE_PROVINCIA		= "capas_base_provincia";
	public static String CAPAS_BASE_DISTRITO		= "capas_base_distrito";
	
	public static String TIPO_CAPA_UMBRAL			= "tipo_capa_umbral";
	public static String TIPO_CAPA_SHAPEFILE		= "tipo_capa_shapefile";

	public static List<String> getConstanteList(String strParam) {
		List<String> list	= new ArrayList<String>();
		int intIdContador	= 0;
		while(true) {
			String strValue	= getConstanteStr(strParam + CadenaUtil.llenarPorIzquierda(String.valueOf(intIdContador), 2, "0") );
			if(strValue.equals("")) {
				break;
			}
			intIdContador++;
			list.add(strValue);
		}
		return list;
	}
	
	public static int getConstanteInt(String strParam) {
		return CadenaUtil.getInte(ConfiguracionProperties.getParametro("configuracion", strParam));
	}
	
	public static String getConstanteStr(String strParam) {
		return CadenaUtil.getStr(ConfiguracionProperties.getParametro("configuracion", strParam));
	}
	
	private static String getParametro(String file, String paramName) {
		return ObtienePoperties.getParametro(file, paramName);
	}
	
}