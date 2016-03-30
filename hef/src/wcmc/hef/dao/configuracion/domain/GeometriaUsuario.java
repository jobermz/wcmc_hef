package wcmc.hef.dao.configuracion.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import wcmc.hef.general.util.CadenaUtil;

public class GeometriaUsuario extends GeometriaUsuarioKey {
	
	private Integer intIdCapa;
	private String strGeometry;
	private String strHashConsulta;
	private String strData;
	
	public Integer getIntIdCapa() {
		return intIdCapa;
	}
	public void setIntIdCapa(Integer intIdCapa) {
		this.intIdCapa = intIdCapa;
	}
	public String getStrGeometry() {
		return strGeometry;
	}
	public void setStrGeometry(String strGeometry) {
		this.strGeometry = strGeometry;
	}
	public String getStrHashConsulta() {
		return strHashConsulta;
	}
	public void setStrHashConsulta(String strHashConsulta) {
		this.strHashConsulta = strHashConsulta;
	}
	public String getStrData() {
		return strData;
	}
//	public static void main(String[] a) {
//		GeometriaUsuario ss=new GeometriaUsuario();
//		ss.setStrData("Hola||Comom||estas||bien?");
//		System.out.println(ss.getStrDataAsList());
//	}
	public List<String> getStrDataAsList() {
		strData = strData.replace("||", "--");
		String[] arrStrData			= strData.split("--");
		List<String> list			= new ArrayList<String>();
		for(String str:arrStrData) {
			list.add(str);
		}
		return list;
	}
	public void setStrData(String strData) {
		this.strData = strData;
	}
	
}
