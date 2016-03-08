package wcmc.hef.dao.capa.domain;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class TemCoverturaVegetal2015 extends TemCoverturaVegetal2015Key implements BaseBeanVectorial {
	
	private String strTheGeom;
	private String strCobveg2013;
	private String strSimbolo;
	private String strFisiogr;
	private Double dblShapeLeng;
	private Double dblShapeArea;
	private String strCvLabel;
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
	public String getStrCobveg2013() {
		return strCobveg2013;
	}
	public void setStrCobveg2013(String strCobveg2013) {
		this.strCobveg2013 = strCobveg2013;
	}
	public String getStrSimbolo() {
		return strSimbolo;
	}
	public void setStrSimbolo(String strSimbolo) {
		this.strSimbolo = strSimbolo;
	}
	public String getStrFisiogr() {
		return strFisiogr;
	}
	public void setStrFisiogr(String strFisiogr) {
		this.strFisiogr = strFisiogr;
	}
	public Double getDblShapeLeng() {
		return dblShapeLeng;
	}
	public void setDblShapeLeng(Double dblShapeLeng) {
		this.dblShapeLeng = dblShapeLeng;
	}
	public Double getDblShapeArea() {
		return dblShapeArea;
	}
	public void setDblShapeArea(Double dblShapeArea) {
		this.dblShapeArea = dblShapeArea;
	}
	public String getStrCvLabel() {
		return strCvLabel;
	}
	public void setStrCvLabel(String strCvLabel) {
		this.strCvLabel = strCvLabel;
	}
	public Date getTimFechaRegistro() {
		return CadenaUtil.getDateHoraMinutosFromStr(this.timFechaRegistroFecha + " " + this.timFechaRegistroHora);
	}
	public void setTimFechaRegistro(Date timFechaRegistro) {
		this.timFechaRegistroFecha = CadenaUtil.getStrDate(timFechaRegistro);
		this.timFechaRegistroHora = CadenaUtil.getStrHoraMinutos(timFechaRegistro);
	}
	
}
