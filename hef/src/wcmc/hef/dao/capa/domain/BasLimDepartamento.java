package wcmc.hef.dao.capa.domain;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class BasLimDepartamento extends BasLimDepartamentoKey implements BaseBeanVectorial {
	
	private String strTheGeom;
	private String strIddpto;
	private String strNombdep;
	
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
	
}
