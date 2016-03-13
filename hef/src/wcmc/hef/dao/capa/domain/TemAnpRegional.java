package wcmc.hef.dao.capa.domain;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class TemAnpRegional extends TemAnpRegionalKey implements BaseBeanVectorial {
	
	private String strTheGeom;
	private Integer intObjectid;
	private String strAnpcCat;
	private String strAnpcCodi;
	private String strAnpcNomb;
	private Double dblAnpcArea;
	private String strAnpcBalec;
	private String strAnpcFelec;
	private String strAnpcBalem;
	private String strAnpcFelem;
	private String strAnpcDepa;
	
	public String getStrTheGeom() {
		return strTheGeom;
	}
	public void setStrTheGeom(String strTheGeom) {
		this.strTheGeom = strTheGeom;
	}
	public Integer getIntObjectid() {
		return intObjectid;
	}
	public void setIntObjectid(Integer intObjectid) {
		this.intObjectid = intObjectid;
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
	
}
