package wcmc.hef.dao.capa.domain;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class BasLimAmazonia extends BasLimAmazoniaKey {
	
	private String strTheGeom;
	private Integer intObjectid1;
	private String strSimbCobve;
	private String strDescCobve;
	private String strSimbDefor;
	private String strDescDefor;
	private Double dblSuperfM2;
	private Double dblSuperfHa;
	private String strSimCvDef;
	private Double dblSuperfKm2;
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
	public String getStrSimbCobve() {
		return strSimbCobve;
	}
	public void setStrSimbCobve(String strSimbCobve) {
		this.strSimbCobve = strSimbCobve;
	}
	public String getStrDescCobve() {
		return strDescCobve;
	}
	public void setStrDescCobve(String strDescCobve) {
		this.strDescCobve = strDescCobve;
	}
	public String getStrSimbDefor() {
		return strSimbDefor;
	}
	public void setStrSimbDefor(String strSimbDefor) {
		this.strSimbDefor = strSimbDefor;
	}
	public String getStrDescDefor() {
		return strDescDefor;
	}
	public void setStrDescDefor(String strDescDefor) {
		this.strDescDefor = strDescDefor;
	}
	public Double getDblSuperfM2() {
		return dblSuperfM2;
	}
	public void setDblSuperfM2(Double dblSuperfM2) {
		this.dblSuperfM2 = dblSuperfM2;
	}
	public Double getDblSuperfHa() {
		return dblSuperfHa;
	}
	public void setDblSuperfHa(Double dblSuperfHa) {
		this.dblSuperfHa = dblSuperfHa;
	}
	public String getStrSimCvDef() {
		return strSimCvDef;
	}
	public void setStrSimCvDef(String strSimCvDef) {
		this.strSimCvDef = strSimCvDef;
	}
	public Double getDblSuperfKm2() {
		return dblSuperfKm2;
	}
	public void setDblSuperfKm2(Double dblSuperfKm2) {
		this.dblSuperfKm2 = dblSuperfKm2;
	}
	public Date getTimFechaRegistro() {
		return CadenaUtil.getDateHoraMinutosFromStr(this.timFechaRegistroFecha + " " + this.timFechaRegistroHora);
	}
	public void setTimFechaRegistro(Date timFechaRegistro) {
		this.timFechaRegistroFecha = CadenaUtil.getStrDate(timFechaRegistro);
		this.timFechaRegistroHora = CadenaUtil.getStrHoraMinutos(timFechaRegistro);
	}
	
}
