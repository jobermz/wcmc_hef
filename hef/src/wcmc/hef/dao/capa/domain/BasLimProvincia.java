package wcmc.hef.dao.capa.domain;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class BasLimProvincia extends BasLimProvinciaKey implements BaseBeanVectorial {
	
    private String strHashConsulta;
	private String strTheGeom;
	private String strIddpto;
	private String strNombdep;
	private String strIdprov;
	private String strNombprov;
	private String strCapital;

    public void setStrHashConsulta(String strHashConsulta) {
        this.strHashConsulta = strHashConsulta;
    }
    public String getStrHashConsulta() {
        return CadenaUtil.getStr(strHashConsulta);
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
