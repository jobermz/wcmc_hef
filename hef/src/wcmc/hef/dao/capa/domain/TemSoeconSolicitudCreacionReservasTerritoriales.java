package wcmc.hef.dao.capa.domain;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class TemSoeconSolicitudCreacionReservasTerritoriales extends TemSoeconSolicitudCreacionReservasTerritorialesKey implements BaseBeanVectorial {
	
	private String strTheGeom;
	private Integer intObjectid1;
	private String strNomret;
	private String strCatego;
	private String strUbipol;
	private Double dblAreleg;
	private String strEstado;
	
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
	public String getStrNomret() {
		return strNomret;
	}
	public void setStrNomret(String strNomret) {
		this.strNomret = strNomret;
	}
	public String getStrCatego() {
		return strCatego;
	}
	public void setStrCatego(String strCatego) {
		this.strCatego = strCatego;
	}
	public String getStrUbipol() {
		return strUbipol;
	}
	public void setStrUbipol(String strUbipol) {
		this.strUbipol = strUbipol;
	}
	public Double getDblAreleg() {
		return dblAreleg;
	}
	public void setDblAreleg(Double dblAreleg) {
		this.dblAreleg = dblAreleg;
	}
	public String getStrEstado() {
		return strEstado;
	}
	public void setStrEstado(String strEstado) {
		this.strEstado = strEstado;
	}
	
}