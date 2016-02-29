package wcmc.hef.dao.capa.domain;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class RiosSecundarios extends RiosSecundariosKey {
	
	private String strTheGeom;
	private Integer intObjectid1;
	private String strGmlId;
	private Integer intObjectid;
	private String strJerHidro;
	private String strDpd99;
	private String strPp99;
	private String strDd;
	private String strDin99;
	private String strPn99;
	private String strDn99;
	private Double dblShapeStle;
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
	public Integer getIntObjectid1() {
		return intObjectid1;
	}
	public void setIntObjectid1(Integer intObjectid1) {
		this.intObjectid1 = intObjectid1;
	}
	public String getStrGmlId() {
		return strGmlId;
	}
	public void setStrGmlId(String strGmlId) {
		this.strGmlId = strGmlId;
	}
	public Integer getIntObjectid() {
		return intObjectid;
	}
	public void setIntObjectid(Integer intObjectid) {
		this.intObjectid = intObjectid;
	}
	public String getStrJerHidro() {
		return strJerHidro;
	}
	public void setStrJerHidro(String strJerHidro) {
		this.strJerHidro = strJerHidro;
	}
	public String getStrDpd99() {
		return strDpd99;
	}
	public void setStrDpd99(String strDpd99) {
		this.strDpd99 = strDpd99;
	}
	public String getStrPp99() {
		return strPp99;
	}
	public void setStrPp99(String strPp99) {
		this.strPp99 = strPp99;
	}
	public String getStrDd() {
		return strDd;
	}
	public void setStrDd(String strDd) {
		this.strDd = strDd;
	}
	public String getStrDin99() {
		return strDin99;
	}
	public void setStrDin99(String strDin99) {
		this.strDin99 = strDin99;
	}
	public String getStrPn99() {
		return strPn99;
	}
	public void setStrPn99(String strPn99) {
		this.strPn99 = strPn99;
	}
	public String getStrDn99() {
		return strDn99;
	}
	public void setStrDn99(String strDn99) {
		this.strDn99 = strDn99;
	}
	public Double getDblShapeStle() {
		return dblShapeStle;
	}
	public void setDblShapeStle(Double dblShapeStle) {
		this.dblShapeStle = dblShapeStle;
	}
	public Date getTimFechaRegistro() {
		return CadenaUtil.getDateHoraMinutosFromStr(this.timFechaRegistroFecha + " " + this.timFechaRegistroHora);
	}
	public void setTimFechaRegistro(Date timFechaRegistro) {
		this.timFechaRegistroFecha = CadenaUtil.getStrDate(timFechaRegistro);
		this.timFechaRegistroHora = CadenaUtil.getStrHoraMinutos(timFechaRegistro);
	}
	
}
