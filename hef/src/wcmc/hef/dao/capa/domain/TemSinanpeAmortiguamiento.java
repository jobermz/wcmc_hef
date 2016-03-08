package wcmc.hef.dao.capa.domain;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class TemSinanpeAmortiguamiento extends TemSinanpeAmortiguamientoKey implements BaseBeanVectorial {
	
	private String strTheGeom;
	private Long lngObjectid;
	private String strZaNomb;
	private String strZaBale;
	private Date dteZaFecr;
	private String timFechaRegistroFecha;
	private String timFechaRegistroHora;
	
	public String getDteZaFecrFecha() {
		return CadenaUtil.getStrDate(dteZaFecr);
	}
	public void setDteZaFecrFecha(String dteZaFecr) {
		this.dteZaFecr = CadenaUtil.getDateFromStr(dteZaFecr);
	}
	public String getTimFechaRegistroFecha() {
		return timFechaRegistroFecha;
	}
	public void setTimFechaRegistroFecha(String timFechaRegistroFecha) {
		this.timFechaRegistroFecha = timFechaRegistroFecha;
	}
	public String getTimFechaRegistroHora() {
		return timFechaRegistroHora;
	}
	public void setTimFechaRegistroHora(String timFechaRegistroHora) {
		this.timFechaRegistroHora = timFechaRegistroHora;
	}
	public String getTimFechaRegistroFechaHora() {
		return timFechaRegistroFecha + " " + timFechaRegistroHora;
	}
	public void setLngFechaRegistro(Long lngfechaRegistro) {
		timFechaRegistroFecha = CadenaUtil.getStrDate(new Date(lngfechaRegistro));
		timFechaRegistroHora	= CadenaUtil.getStrHoraMinutos(new Date(lngfechaRegistro));
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
	public Date getTimFechaRegistro() {
		return CadenaUtil.getDateHoraMinutosFromStr(this.timFechaRegistroFecha + " " + this.timFechaRegistroHora);
	}
	public void setTimFechaRegistro(Date timFechaRegistro) {
		this.timFechaRegistroFecha = CadenaUtil.getStrDate(timFechaRegistro);
		this.timFechaRegistroHora = CadenaUtil.getStrHoraMinutos(timFechaRegistro);
	}
	
}
