package wcmc.hef.general.util;

public class IncidenciasGravedadConstantes extends ParametrosSistema {
	public static final String CODIGO_INCIDENCIA_MUY_GRAVE	= "codigo_incidencia_muy_grave";
	public static final String CODIGO_INCIDENCIA_GRAVE		= "codigo_incidencia_grave";
	public static final String CODIGO_INCIDENCIA_LEVE		= "codigo_incidencia_leve";
	
	public static final String IMAGEN_INCIDENCIA_MUY_GRAVE	= "imagen_incidencia_muy_grave";
	public static final String IMAGEN_INCIDENCIA_GRAVE		= "imagen_incidencia_grave";
	public static final String IMAGEN_INCIDENCIA_LEVE		= "imagen_incidencia_leve";
	
	public static String getStrIncidenciasGravedad(String strIdMod) {
		return ObtienePoperties.getParametro("incidencias_gravedad", strIdMod);

	}
	
	public static int getIntIncidenciasGravedad(String strIdMod) {
		return CadenaUtil.getInte(ObtienePoperties.getParametro("incidencias_gravedad", strIdMod));
	}
	
}