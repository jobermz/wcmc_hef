package wcmc.hef.business.core.capa.dto;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class TemHumedalesRamsarDto implements BaseBeanVectorialDto {
	private Integer srlGid;
	private String strTheGeom;
	private String strCategorias;
	private String strNombre;
	private String strBaseLegal;
	private String strUbicaPoli;
	private Double dblAreaLegal;
	private Integer intId;
	private String strObserva;
	private Double dblShapeArea;
	private Double dblShapeLen;
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
	public String getStrCategorias() {
		return strCategorias;
	}
	public void setStrCategorias(String strCategorias) {
		this.strCategorias = strCategorias;
	}
	public String getStrNombre() {
		return strNombre;
	}
	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}
	public String getStrBaseLegal() {
		return strBaseLegal;
	}
	public void setStrBaseLegal(String strBaseLegal) {
		this.strBaseLegal = strBaseLegal;
	}
	public String getStrUbicaPoli() {
		return strUbicaPoli;
	}
	public void setStrUbicaPoli(String strUbicaPoli) {
		this.strUbicaPoli = strUbicaPoli;
	}
	public Double getDblAreaLegal() {
		return dblAreaLegal;
	}
	public void setDblAreaLegal(Double dblAreaLegal) {
		this.dblAreaLegal = dblAreaLegal;
	}
	public Integer getIntId() {
		return intId;
	}
	public void setIntId(Integer intId) {
		this.intId = intId;
	}
	public String getStrObserva() {
		return strObserva;
	}
	public void setStrObserva(String strObserva) {
		this.strObserva = strObserva;
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
