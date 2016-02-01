package wcmc.hef.general.util;

public class ParametrosSistema {
	
	public static String getStrCodigoZonificacionRegiones(String strIdDepartamento) {
		return ObtienePoperties.getParametro("regiones", strIdDepartamento);
	}
	
	protected static String getParametro(String file, String paramName) {
		return ObtienePoperties.getParametro(file, paramName);
	}
	
}