package wcmc.hef.general.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.ResourceBundle;

public class ObtienePoperties {
	public static String getParametro(String file, String paramName) {
		try {
			ResourceBundle labels = ResourceBundle.getBundle(File.separator + file);
			return labels.getString(paramName);
		} catch(Exception ex) {
			try {
				ResourceBundle labels = ResourceBundle.getBundle(file);
				return labels.getString(paramName);
			} catch(Exception e) {
			}
		}
		return "";
	}
	public static List<String> getKeys(String file) {
		try {
			ResourceBundle labels	= ResourceBundle.getBundle(File.separator + file);
			Enumeration<String> en	= labels.getKeys();
			List<String> keys		= new ArrayList<String>();
			while(en.hasMoreElements()) {
				keys.add(en.nextElement());
			}
			return keys;
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
}
