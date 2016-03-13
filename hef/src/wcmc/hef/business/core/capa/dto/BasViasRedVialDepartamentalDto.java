package wcmc.hef.business.core.capa.dto;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class BasViasRedVialDepartamentalDto implements BaseBeanVectorialDto {
	private Integer srlGid;
	private String strTheGeom;
	private Double dblLongitud;
	private String strDpto;
	private String strRutaD044;
	private String strRed044;
	private String strSupercicie;
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
	public Double getDblLongitud() {
		return dblLongitud;
	}
	public void setDblLongitud(Double dblLongitud) {
		this.dblLongitud = dblLongitud;
	}
	public String getStrDpto() {
		return strDpto;
	}
	public void setStrDpto(String strDpto) {
		this.strDpto = strDpto;
	}
	public String getStrRutaD044() {
		return strRutaD044;
	}
	public void setStrRutaD044(String strRutaD044) {
		this.strRutaD044 = strRutaD044;
	}
	public String getStrRed044() {
		return strRed044;
	}
	public void setStrRed044(String strRed044) {
		this.strRed044 = strRed044;
	}
	public String getStrSupercicie() {
		return strSupercicie;
	}
	public void setStrSupercicie(String strSupercicie) {
		this.strSupercicie = strSupercicie;
	}
	
}
