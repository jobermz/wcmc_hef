package wcmc.hef.dao.capa.domain;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class LagosYLagunas extends LagosYLagunasKey {
	
	private String strTheGeom;
	private Integer intObjectid1;
	private String strGmlId;
	private Integer intObjectid;
	private Double dblCount;
	private String strFirstIdpr;
	private String strNombprov;
	private String strFirstNomb;
	private String strLastDcto;
	private String strLastLey;
	private String strFirstFech;
	private String strLastFecha;
	private Double dblMinShape;
	private Double dblShapeStar;
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
	public Double getDblCount() {
		return dblCount;
	}
	public void setDblCount(Double dblCount) {
		this.dblCount = dblCount;
	}
	public String getStrFirstIdpr() {
		return strFirstIdpr;
	}
	public void setStrFirstIdpr(String strFirstIdpr) {
		this.strFirstIdpr = strFirstIdpr;
	}
	public String getStrNombprov() {
		return strNombprov;
	}
	public void setStrNombprov(String strNombprov) {
		this.strNombprov = strNombprov;
	}
	public String getStrFirstNomb() {
		return strFirstNomb;
	}
	public void setStrFirstNomb(String strFirstNomb) {
		this.strFirstNomb = strFirstNomb;
	}
	public String getStrLastDcto() {
		return strLastDcto;
	}
	public void setStrLastDcto(String strLastDcto) {
		this.strLastDcto = strLastDcto;
	}
	public String getStrLastLey() {
		return strLastLey;
	}
	public void setStrLastLey(String strLastLey) {
		this.strLastLey = strLastLey;
	}
	public String getStrFirstFech() {
		return strFirstFech;
	}
	public void setStrFirstFech(String strFirstFech) {
		this.strFirstFech = strFirstFech;
	}
	public String getStrLastFecha() {
		return strLastFecha;
	}
	public void setStrLastFecha(String strLastFecha) {
		this.strLastFecha = strLastFecha;
	}
	public Double getDblMinShape() {
		return dblMinShape;
	}
	public void setDblMinShape(Double dblMinShape) {
		this.dblMinShape = dblMinShape;
	}
	public Double getDblShapeStar() {
		return dblShapeStar;
	}
	public void setDblShapeStar(Double dblShapeStar) {
		this.dblShapeStar = dblShapeStar;
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
