package wcmc.hef.business.core.capa.dto;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class BasLimProvinciaDto implements BaseBeanVectorialDto {
	private Integer srlGid;
	private String strTheGeom;
	private String strIddpto;
	private String strNombdep;
	private String strIdprov;
	private String strNombprov;
	private String strCapital;
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
	public String getStrIddpto() {
		return strIddpto;
	}
	public void setStrIddpto(String strIddpto) {
		this.strIddpto = strIddpto;
	}
	public String getStrNombdep() {
		return strNombdep;
	}
	public void setStrNombdep(String strNombdep) {
		this.strNombdep = strNombdep;
	}
	public String getStrIdprov() {
		return strIdprov;
	}
	public void setStrIdprov(String strIdprov) {
		this.strIdprov = strIdprov;
	}
	public String getStrNombprov() {
		return strNombprov;
	}
	public void setStrNombprov(String strNombprov) {
		this.strNombprov = strNombprov;
	}
	public String getStrCapital() {
		return strCapital;
	}
	public void setStrCapital(String strCapital) {
		this.strCapital = strCapital;
	}
	
}
