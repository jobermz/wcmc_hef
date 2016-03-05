package wcmc.hef.business.core.capa.dto;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class TemConcesionHidroelectricasGeneracionDto {
	private Integer srlGid;
	private String strTheGeom;
	private String strIdGrafico;
	private String strExpediente;
	private Integer intSeccion;
	private String strConcesion;
	private String strEmpresa;
	private String strRuc;
	private String strFuente;
	private String strSituacion;
	private String strTipoConce;
	private Date dteFechaPres;
	private Date dteFechaReso;
	private String strActivo;
	private Double dblAreaGrafi;
	private String strCodigoCon;
	private Double dblShapeArea;
	private Double dblShapeLen;
	private String timFechaRegistroFecha;
	private String timFechaRegistroHora;
	public String getDteFechaPresFecha() {
		return CadenaUtil.getStrDate(dteFechaPres);
	}
	public void setDteFechaPresFecha(String dteFechaPres) {
		this.dteFechaPres = CadenaUtil.getDateFromStr(dteFechaPres);
	}
	public String getDteFechaResoFecha() {
		return CadenaUtil.getStrDate(dteFechaReso);
	}
	public void setDteFechaResoFecha(String dteFechaReso) {
		this.dteFechaReso = CadenaUtil.getDateFromStr(dteFechaReso);
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
	public String getStrIdGrafico() {
		return strIdGrafico;
	}
	public void setStrIdGrafico(String strIdGrafico) {
		this.strIdGrafico = strIdGrafico;
	}
	public String getStrExpediente() {
		return strExpediente;
	}
	public void setStrExpediente(String strExpediente) {
		this.strExpediente = strExpediente;
	}
	public Integer getIntSeccion() {
		return intSeccion;
	}
	public void setIntSeccion(Integer intSeccion) {
		this.intSeccion = intSeccion;
	}
	public String getStrConcesion() {
		return strConcesion;
	}
	public void setStrConcesion(String strConcesion) {
		this.strConcesion = strConcesion;
	}
	public String getStrEmpresa() {
		return strEmpresa;
	}
	public void setStrEmpresa(String strEmpresa) {
		this.strEmpresa = strEmpresa;
	}
	public String getStrRuc() {
		return strRuc;
	}
	public void setStrRuc(String strRuc) {
		this.strRuc = strRuc;
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
	public String getStrTipoConce() {
		return strTipoConce;
	}
	public void setStrTipoConce(String strTipoConce) {
		this.strTipoConce = strTipoConce;
	}
	public Date getDteFechaPres() {
		return dteFechaPres;
	}
	public void setDteFechaPres(Date dteFechaPres) {
		this.dteFechaPres = dteFechaPres;
	}
	public Date getDteFechaReso() {
		return dteFechaReso;
	}
	public void setDteFechaReso(Date dteFechaReso) {
		this.dteFechaReso = dteFechaReso;
	}
	public String getStrActivo() {
		return strActivo;
	}
	public void setStrActivo(String strActivo) {
		this.strActivo = strActivo;
	}
	public Double getDblAreaGrafi() {
		return dblAreaGrafi;
	}
	public void setDblAreaGrafi(Double dblAreaGrafi) {
		this.dblAreaGrafi = dblAreaGrafi;
	}
	public String getStrCodigoCon() {
		return strCodigoCon;
	}
	public void setStrCodigoCon(String strCodigoCon) {
		this.strCodigoCon = strCodigoCon;
	}
	public Double getDblShapeArea() {
		return dblShapeArea;
	}
	public void setDblShapeArea(Double dblShapeArea) {
		this.dblShapeArea = dblShapeArea;
	}
	public Double getDblShapeLen() {
		return dblShapeLen;
	}
	public void setDblShapeLen(Double dblShapeLen) {
		this.dblShapeLen = dblShapeLen;
	}
	public Date getTimFechaRegistro() {
		return CadenaUtil.getDateHoraMinutosFromStr(this.timFechaRegistroFecha + " " + this.timFechaRegistroHora);
	}
	public void setTimFechaRegistro(Date timFechaRegistro) {
		this.timFechaRegistroFecha = CadenaUtil.getStrDate(timFechaRegistro);
		this.timFechaRegistroHora = CadenaUtil.getStrHoraMinutos(timFechaRegistro);
	}
	
}
