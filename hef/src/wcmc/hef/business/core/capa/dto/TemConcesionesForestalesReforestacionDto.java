package wcmc.hef.business.core.capa.dto;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class TemConcesionesForestalesReforestacionDto implements BaseBeanVectorialDto {
	private Integer srlGid;
	private String strTheGeom;
	private String strAnio;
	private String strModalidad;
	private String strContrato;
	private String strRegion;
	private String strFuente;
	private String strSituacion;
	private String strTitular;
	private Double dblAreaSig;
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
	public String getStrAnio() {
		return strAnio;
	}
	public void setStrAnio(String strAnio) {
		this.strAnio = strAnio;
	}
	public String getStrModalidad() {
		return strModalidad;
	}
	public void setStrModalidad(String strModalidad) {
		this.strModalidad = strModalidad;
	}
	public String getStrContrato() {
		return strContrato;
	}
	public void setStrContrato(String strContrato) {
		this.strContrato = strContrato;
	}
	public String getStrRegion() {
		return strRegion;
	}
	public void setStrRegion(String strRegion) {
		this.strRegion = strRegion;
	}
	public String getStrFuente() {
		return strFuente;
	}
	public void setStrFuente(String strFuente) {
		this.strFuente = strFuente;
	}
	public String getStrSituacion() {
		return strSituacion;
	}
	public void setStrSituacion(String strSituacion) {
		this.strSituacion = strSituacion;
	}
	public String getStrTitular() {
		return strTitular;
	}
	public void setStrTitular(String strTitular) {
		this.strTitular = strTitular;
	}
	public Double getDblAreaSig() {
		return dblAreaSig;
	}
	public void setDblAreaSig(Double dblAreaSig) {
		this.dblAreaSig = dblAreaSig;
	}
	public Date getTimFechaRegistro() {
		return CadenaUtil.getDateHoraMinutosFromStr(this.timFechaRegistroFecha + " " + this.timFechaRegistroHora);
	}
	public void setTimFechaRegistro(Date timFechaRegistro) {
		this.timFechaRegistroFecha = CadenaUtil.getStrDate(timFechaRegistro);
		this.timFechaRegistroHora = CadenaUtil.getStrHoraMinutos(timFechaRegistro);
	}
	
}
