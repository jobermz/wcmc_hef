package wcmc.hef.dao.capa.domain;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class TemProyeccionDensidadPob2015 extends TemProyeccionDensidadPob2015Key implements BaseBeanVectorial {
	
    private String strHashConsulta;
	private String strTheGeom;
	private String strIddpto;
	private String strNombdep;
	private String strIdprov;
	private String strNombprov;
	private String strIddist;
	private String strNombdist;
	private String strDcto;
	private String strLey;
	private String strFecha;
	private String strNomCap;
	private Double dblSupContin;
	private Double dblSupInsula;
	private Double dblSupLacust;
	private Double dblSupInsD;
	private String strUbigeo;
	private String strUbigeo1;
	private String strDistrito;
	private String strTotal2015;
	private Double dblArea;
	private Double dblPopDens;

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
	public String getStrIddist() {
		return strIddist;
	}
	public void setStrIddist(String strIddist) {
		this.strIddist = strIddist;
	}
	public String getStrNombdist() {
		return strNombdist;
	}
	public void setStrNombdist(String strNombdist) {
		this.strNombdist = strNombdist;
	}
	public String getStrDcto() {
		return strDcto;
	}
	public void setStrDcto(String strDcto) {
		this.strDcto = strDcto;
	}
	public String getStrLey() {
		return strLey;
	}
	public void setStrLey(String strLey) {
		this.strLey = strLey;
	}
	public String getStrFecha() {
		return strFecha;
	}
	public void setStrFecha(String strFecha) {
		this.strFecha = strFecha;
	}
	public String getStrNomCap() {
		return strNomCap;
	}
	public void setStrNomCap(String strNomCap) {
		this.strNomCap = strNomCap;
	}
	public Double getDblSupContin() {
		return dblSupContin;
	}
	public void setDblSupContin(Double dblSupContin) {
		this.dblSupContin = dblSupContin;
	}
	public Double getDblSupInsula() {
		return dblSupInsula;
	}
	public void setDblSupInsula(Double dblSupInsula) {
		this.dblSupInsula = dblSupInsula;
	}
	public Double getDblSupLacust() {
		return dblSupLacust;
	}
	public void setDblSupLacust(Double dblSupLacust) {
		this.dblSupLacust = dblSupLacust;
	}
	public Double getDblSupInsD() {
		return dblSupInsD;
	}
	public void setDblSupInsD(Double dblSupInsD) {
		this.dblSupInsD = dblSupInsD;
	}
	public String getStrUbigeo() {
		return strUbigeo;
	}
	public void setStrUbigeo(String strUbigeo) {
		this.strUbigeo = strUbigeo;
	}
	public String getStrUbigeo1() {
		return strUbigeo1;
	}
	public void setStrUbigeo1(String strUbigeo1) {
		this.strUbigeo1 = strUbigeo1;
	}
	public String getStrDistrito() {
		return strDistrito;
	}
	public void setStrDistrito(String strDistrito) {
		this.strDistrito = strDistrito;
	}
	public String getStrTotal2015() {
		return strTotal2015;
	}
	public void setStrTotal2015(String strTotal2015) {
		this.strTotal2015 = strTotal2015;
	}
	public Double getDblArea() {
		return dblArea;
	}
	public void setDblArea(Double dblArea) {
		this.dblArea = dblArea;
	}
	public Double getDblPopDens() {
		return dblPopDens;
	}
	public void setDblPopDens(Double dblPopDens) {
		this.dblPopDens = dblPopDens;
	}
	
}
