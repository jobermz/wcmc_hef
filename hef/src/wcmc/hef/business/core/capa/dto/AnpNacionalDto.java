package wcmc.hef.business.core.capa.dto;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class AnpNacionalDto {
	private Integer srlGid;
	private String strTheGeom;
	private Long lngObjectid;
	private String strAnpCate;
	private String strAnpNomb;
	private String strAnpCodi;
	private String strAnpUbpo;
	private Double dblAnpArle;
	private String strAnpBalecr;
	private String strAnpFecrea;
	private String strAnpBalemo;
	private String strAnpFemodi;
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
	public Long getLngObjectid() {
		return lngObjectid;
	}
	public void setLngObjectid(Long lngObjectid) {
		this.lngObjectid = lngObjectid;
	}
	public String getStrAnpCate() {
		return strAnpCate;
	}
	public void setStrAnpCate(String strAnpCate) {
		this.strAnpCate = strAnpCate;
	}
	public String getStrAnpNomb() {
		return strAnpNomb;
	}
	public void setStrAnpNomb(String strAnpNomb) {
		this.strAnpNomb = strAnpNomb;
	}
	public String getStrAnpCodi() {
		return strAnpCodi;
	}
	public void setStrAnpCodi(String strAnpCodi) {
		this.strAnpCodi = strAnpCodi;
	}
	public String getStrAnpUbpo() {
		return strAnpUbpo;
	}
	public void setStrAnpUbpo(String strAnpUbpo) {
		this.strAnpUbpo = strAnpUbpo;
	}
	public Double getDblAnpArle() {
		return dblAnpArle;
	}
	public void setDblAnpArle(Double dblAnpArle) {
		this.dblAnpArle = dblAnpArle;
	}
	public String getStrAnpBalecr() {
		return strAnpBalecr;
	}
	public void setStrAnpBalecr(String strAnpBalecr) {
		this.strAnpBalecr = strAnpBalecr;
	}
	public String getStrAnpFecrea() {
		return strAnpFecrea;
	}
	public void setStrAnpFecrea(String strAnpFecrea) {
		this.strAnpFecrea = strAnpFecrea;
	}
	public String getStrAnpBalemo() {
		return strAnpBalemo;
	}
	public void setStrAnpBalemo(String strAnpBalemo) {
		this.strAnpBalemo = strAnpBalemo;
	}
	public String getStrAnpFemodi() {
		return strAnpFemodi;
	}
	public void setStrAnpFemodi(String strAnpFemodi) {
		this.strAnpFemodi = strAnpFemodi;
	}
	public Date getTimFechaRegistro() {
		return CadenaUtil.getDateHoraMinutosFromStr(this.timFechaRegistroFecha + " " + this.timFechaRegistroHora);
	}
	public void setTimFechaRegistro(Date timFechaRegistro) {
		this.timFechaRegistroFecha = CadenaUtil.getStrDate(timFechaRegistro);
		this.timFechaRegistroHora = CadenaUtil.getStrHoraMinutos(timFechaRegistro);
	}
	
}
