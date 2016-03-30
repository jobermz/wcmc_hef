package wcmc.hef.dao.capa.domain;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class TemSinanpeAmortiguamiento extends TemSinanpeAmortiguamientoKey implements BaseBeanVectorial {
	
    private String strHashConsulta;
	private String strTheGeom;
	private Long lngObjectid;
	private String strZaNomb;
	private String strZaBale;
	private Date dteZaFecr;

    public void setStrHashConsulta(String strHashConsulta) {
        this.strHashConsulta = strHashConsulta;
    }
    public String getStrHashConsulta() {
        return CadenaUtil.getStr(strHashConsulta);
    }
	public String getDteZaFecrFecha() {
		return CadenaUtil.getStrDate(dteZaFecr);
	}
	public void setDteZaFecrFecha(String dteZaFecr) {
		this.dteZaFecr = CadenaUtil.getDateFromStr(dteZaFecr);
	}
	public String getStrTheGeom() {
		return strTheGeom;
	}
	public void setStrTheGeom(String strTheGeom) {
		this.strTheGeom = strTheGeom;
	}
	public Long getLngObjectid() {
		return lngObjectid;
	}
	public void setLngObjectid(Long lngObjectid) {
		this.lngObjectid = lngObjectid;
	}
	public String getStrZaNomb() {
		return strZaNomb;
	}
	public void setStrZaNomb(String strZaNomb) {
		this.strZaNomb = strZaNomb;
	}
	public String getStrZaBale() {
		return strZaBale;
	}
	public void setStrZaBale(String strZaBale) {
		this.strZaBale = strZaBale;
	}
	public Date getDteZaFecr() {
		return dteZaFecr;
	}
	public void setDteZaFecr(Date dteZaFecr) {
		this.dteZaFecr = dteZaFecr;
	}
	
}
