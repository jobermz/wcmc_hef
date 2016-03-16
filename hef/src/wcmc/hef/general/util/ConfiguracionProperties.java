package wcmc.hef.general.util;

import java.util.ArrayList;
import java.util.List;

public class ConfiguracionProperties {
	public static String CAPAS_BASE_DEPARTAMENTO		= "capas_base_departamento";
	public static String CAPAS_BASE_PROVINCIA			= "capas_base_provincia";
	public static String CAPAS_BASE_DISTRITO			= "capas_base_distrito";
	
	public static String TIPO_CAPA_UMBRAL				= "tipo_capa_umbral";
	public static String TIPO_CAPA_VECTORIAL			= "tipo_capa_vectorial";
	
	public static String REPOSITORIO_DOCS_TEMPORAL		= "repositorio_docs_temporal";
	
	public static String CAPAS_VISUALIZACION_DEFAULT	= "capas_visualizacion_default";
	public static String RUTA_BASE_REPORTES				= "ruta_base_reportes";
	
	public static String RUTA_BASE_CAPAS_USUARIO		= "ruta_base_capas_usuario";
	
	public static String CAPA_GRUPO_USUARIO				= "capa_grupo_usuario";
	
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