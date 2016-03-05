package wcmc.hef.dao.capa.domain;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class TemAnpPrivada extends TemAnpPrivadaKey {
	
	private String strTheGeom;
	private Long lngObjectid;
	private String strAnpcCat;
	private String strAnpcCodi;
	private String strAnpcNomb;
	private Double dblAnpcArea;
	private String strAnpcBalec;
	private String strAnpcFelec;
	private String strAnpcBalem;
	private String strAnpcFelem;
	private String strAnpcDepa;
	private String strAnpcTipop;
	private String strAnpcTitu;
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
	public Long getLngObjectid() {
		return lngObjectid;
	}
	public void setLngObjectid(Long lngObjectid) {
		this.lngObjectid = lngObjectid;
	}
	public String getStrAnpcCat() {
		return strAnpcCat;
	}
	public void setStrAnpcCat(String strAnpcCat) {
		this.strAnpcCat = strAnpcCat;
	}
	public String getStrAnpcCodi() {
		return strAnpcCodi;
	}
	public void setStrAnpcCodi(String strAnpcCodi) {
		this.strAnpcCodi = strAnpcCodi;
	}
	public String getStrAnpcNomb() {
		return strAnpcNomb;
	}
	public void setStrAnpcNomb(String strAnpcNomb) {
		this.strAnpcNomb = strAnpcNomb;
	}
	public Double getDblAnpcArea() {
		return dblAnpcArea;
	}
	public void setDblAnpcArea(Double dblAnpcArea) {
		this.dblAnpcArea = dblAnpcArea;
	}
	public String getStrAnpcBalec() {
		return strAnpcBalec;
	}
	public void setStrAnpcBalec(String strAnpcBalec) {
		this.strAnpcBalec = strAnpcBalec;
	}
	public String getStrAnpcFelec() {
		return strAnpcFelec;
	}
	public void setStrAnpcFelec(String strAnpcFelec) {
		this.strAnpcFelec = strAnpcFelec;
	}
	public String getStrAnpcBalem() {
		return strAnpcBalem;
	}
	public void setStrAnpcBalem(String strAnpcBalem) {
		this.strAnpcBalem = strAnpcBalem;
	}
	public String getStrAnpcFelem() {
		return strAnpcFelem;
	}
	public void setStrAnpcFelem(String strAnpcFelem) {
		this.strAnpcFelem = strAnpcFelem;
	}
	public String getStrAnpcDepa() {
		return strAnpcDepa;
	}
	public void setStrAnpcDepa(String strAnpcDepa) {
		this.strAnpcDepa = strAnpcDepa;
	}
	public String getStrAnpcTipop() {
		return strAnpcTipop;
	}
	public void setStrAnpcTipop(String strAnpcTipop) {
		this.strAnpcTipop = strAnpcTipop;
	}
	public String getStrAnpcTitu() {
		return strAnpcTitu;
	}
	public void setStrAnpcTitu(String strAnpcTitu) {
		this.strAnpcTitu = strAnpcTitu;
	}
	public Date getTimFechaRegistro() {
		return CadenaUtil.getDateHoraMinutosFromStr(this.timFechaRegistroFecha + " " + this.timFechaRegistroHora);
	}
	public void setTimFechaRegistro(Date timFechaRegistro) {
		this.timFechaRegistroFecha = CadenaUtil.getStrDate(timFechaRegistro);
		this.timFechaRegistroHora = CadenaUtil.getStrHoraMinutos(timFechaRegistro);
	}
	
}
