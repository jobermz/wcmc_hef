package wcmc.hef.dao.capa.domain;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class BasViasRedVialVecinal extends BasViasRedVialVecinalKey implements BaseBeanVectorial {
	
	private String strTheGeom;
	private String strProvinc;
	private String strRuta;
	private String strSuperficie;
	
	public String getStrTheGeom() {
		return strTheGeom;
	}
	public void setStrTheGeom(String strTheGeom) {
		this.strTheGeom = strTheGeom;
	}
	public String getStrProvinc() {
		return strProvinc;
	}
	public void setStrProvinc(String strProvinc) {
		this.strProvinc = strProvinc;
	}
	public String getStrRuta() {
		return strRuta;
	}
	public void setStrRuta(String strRuta) {
		this.strRuta = strRuta;
	}
	public String getStrSuperficie() {
		return strSuperficie;
	}
	public void setStrSuperficie(String strSuperficie) {
		this.strSuperficie = strSuperficie;
	}
	
}
