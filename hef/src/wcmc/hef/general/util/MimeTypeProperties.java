package wcmc.hef.general.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MimeTypeProperties {
	
	public static List<String> getKeys() {
		return ObtienePoperties.getKeys("mime_type");
	}
	
	public static Map<String, String> getMap() {
		List<String>	listKeys	= ObtienePoperties.getKeys("mime_type");
		Map<String, String> map		= new HashMap<String, String>();
		for(int i = 0;i < listKeys.size();i++) {
			map.put(listKeys.get(i).toUpperCase(), MimeTypeProperties.getParametro("mime_type", listKeys.get(i)));
		}
		return map;
	}
	
	public static int getConstanteInt(String strParam) {
		return CadenaUtil.getInte(MimeTypeProperties.getParametro("mime_type", strParam));
	}
	
	public static String getConstanteStr(String strParam) {
		return CadenaUtil.getStr(MimeTypeProperties.getParametro("mime_type", strParam));
	}
	
	private static String getParametro(String file, String paramName) {
		return ObtienePoperties.getParametro(file, paramName);
	}
	
}