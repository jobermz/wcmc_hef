package wcmc.hef.general.util;

public class IncidenciasTipoConstantes extends ParametrosSistema {
	public static final String ALERTA_CONFLICTO_SOCIAL_TIPO_MINERO		= "alerta_conflicto_social_tipo_minero";
	public static final String ALERTA_CONFLICTO_SOCIAL_TIPO_AMBIENTAL	= "alerta_conflicto_social_tipo_ambiental";
			
	public static String getStr(String strIdMod) {
		return ObtienePoperties.getParametro("incidencias_tipo", strIdMod);

	}
	
	public static int getInt(String strIdMod) {
		return CadenaUtil.getInte(ObtienePoperties.getParametro("incidencias_tipo", strIdMod));
	}
	
}