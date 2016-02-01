package wcmc.hef.general.util;

public class RecursoTipoProperties {
	
	public static String DOCUMENTO		= "documento";
	public static String CARPETA		= "carpeta";
	
	public static int getConstanteInt(String strParam) {
		return CadenaUtil.getInte(RecursoTipoProperties.getParametro("recurso_tipo", strParam));
	}
	
	public static String getConstanteStr(String strParam) {
		return CadenaUtil.getStr(RecursoTipoProperties.getParametro("recurso_tipo", strParam));
	}
	
	private static String getParametro(String file, String paramName) {
		return ObtienePoperties.getParametro(file, paramName);
	}
	
}