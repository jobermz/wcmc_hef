package wcmc.hef.business.core.capa.dto;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class TemCoverturaVegetal2015Dto implements BaseBeanVectorialDto {
	private Integer srlGid;
	private String strTheGeom;
	private String strCobveg2013;
	private String strSimbolo;
	private String strFisiogr;
	private Double dblShapeLeng;
	private Double dblShapeArea;
	private String strCvLabel;
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
	
}
