package wcmc.hef.dao.capa.domain;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class TemConcesionesForestalesManejoFaunaSilvestre extends TemConcesionesForestalesManejoFaunaSilvestreKey implements BaseBeanVectorial {
	
	private String strTheGeom;
	private Integer intObjectid;
	private String strBeneficiar;
	private String strModalidad;
	private String strTitular;
	private String strContrato;
	private Double dblAreaAprob;
	private String strRegion;
	private String strDocum;
	private String strSituacion;
	private Double dblAreaSig;
	
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
	public String getStrBeneficiar() {
		return strBeneficiar;
	}
	public void setStrBeneficiar(String strBeneficiar) {
		this.strBeneficiar = strBeneficiar;
	}
	public String getStrModalidad() {
		return strModalidad;
	}
	public void setStrModalidad(String strModalidad) {
		this.strModalidad = strModalidad;
	}
	public String getStrTitular() {
		return strTitular;
	}
	public void setStrTitular(String strTitular) {
		this.strTitular = strTitular;
	}
	public String getStrContrato() {
		return strContrato;
	}
	public void setStrContrato(String strContrato) {
		this.strContrato = strContrato;
	}
	public Double getDblAreaAprob() {
		return dblAreaAprob;
	}
	public void setDblAreaAprob(Double dblAreaAprob) {
		this.dblAreaAprob = dblAreaAprob;
	}
	public String getStrRegion() {
		return strRegion;
	}
	public void setStrRegion(String strRegion) {
		this.strRegion = strRegion;
	}
	public String getStrDocum() {
		return strDocum;
	}
	public void setStrDocum(String strDocum) {
		this.strDocum = strDocum;
	}
	public String getStrSituacion() {
		return strSituacion;
	}
	public void setStrSituacion(String strSituacion) {
		this.strSituacion = strSituacion;
	}
	public Double getDblAreaSig() {
		return dblAreaSig;
	}
	public void setDblAreaSig(Double dblAreaSig) {
		this.dblAreaSig = dblAreaSig;
	}
	
}
