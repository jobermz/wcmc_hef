package wcmc.hef.general.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiciosProperties {

	public static Map<String, String> getServiciosByIdList() {
		List<String> listKeys	= ObtienePoperties.getKeys("servicios");
		Map<String, String> map	= new HashMap<String, String>();
		for(String key:listKeys) {
			map.put(ObtienePoperties.getParametro("servicios", key), key);
		}
		return map;
	}
	
	public static Map<String, String> getIdByServiciosList() {
		List<String> listKeys	= ObtienePoperties.getKeys("servicios");
		Map<String, String> map	= new HashMap<String, String>();
		for(String key:listKeys) {
			map.put(key, ObtienePoperties.getParametro("servicios", key));
		}
		return map;
	}
	
	public static int getConstanteInt(String strParam) {
		return CadenaUtil.getInte(ObtienePoperties.getParametro("servicios", strParam));
	}
	
	public static String getConstanteStr(String strParam) {
		return CadenaUtil.getStr(ObtienePoperties.getParametro("servicios", strParam));
	}
	
}