package wcmc.hef.business.core.capa.dto;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class BasViasRedVialVecinalDto implements BaseBeanVectorialDto {
	private Integer srlGid;
	private String strTheGeom;
	private String strProvinc;
	private String strRuta;
	private String strSuperficie;
	public Integer getSrlGid() {
		return srlGid;
	}
	public void setSrlGid(Integer srlGid) {
		this.srlGid = srlGid;
	}
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
