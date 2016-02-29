package wcmc.hef.dao.capa.domain;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class TemSoeconPrediosRurales extends TemSoeconPrediosRuralesKey {
	
	private String strTheGeom;
	private String strDepartamen;
	private String strDatum;
	private String strCodproy;
	private Integer intCntCodpro;
	private Integer intOrigFid;
	private String timFechaRegistroFecha;
	private String timFechaRegistroHora;
	
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
	public String getStrDepartamen() {
		return strDepartamen;
	}
	public void setStrDepartamen(String strDepartamen) {
		this.strDepartamen = strDepartamen;
	}
	public String getStrDatum() {
		return strDatum;
	}
	public void setStrDatum(String strDatum) {
		this.strDatum = strDatum;
	}
	public String getStrCodproy() {
		return strCodproy;
	}
	public void setStrCodproy(String strCodproy) {
		this.strCodproy = strCodproy;
	}
	public Integer getIntCntCodpro() {
		return intCntCodpro;
	}
	public void setIntCntCodpro(Integer intCntCodpro) {
		this.intCntCodpro = intCntCodpro;
	}
	public Integer getIntOrigFid() {
		return intOrigFid;
	}
	public void setIntOrigFid(Integer intOrigFid) {
		this.intOrigFid = intOrigFid;
	}
	public Date getTimFechaRegistro() {
		return CadenaUtil.getDateHoraMinutosFromStr(this.timFechaRegistroFecha + " " + this.timFechaRegistroHora);
	}
	public void setTimFechaRegistro(Date timFechaRegistro) {
		this.timFechaRegistroFecha = CadenaUtil.getStrDate(timFechaRegistro);
		this.timFechaRegistroHora = CadenaUtil.getStrHoraMinutos(timFechaRegistro);
	}
	
}
