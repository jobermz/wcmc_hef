package wcmc.hef.dao.capa.domain;

import java.util.Date;
import java.util.List;

import wcmc.hef.general.util.CadenaUtil;

public class TemConcesionesForestalesReforestacion extends TemConcesionesForestalesReforestacionKey implements BaseBeanVectorial {
	
    private String strHashConsulta;
	private String strTheGeom;
	private String strAnio;
	private String strModalidad;
	private String strContrato;
	private String strRegion;
	private String strFuente;
	private String strSituacion;
	private String strTitular;
	private Double dblAreaSig;
	private Integer intObjectid;
	public Integer getIntObjectid() {
		return intObjectid;
	}
	public void setIntObjectid(Integer intObjectid) {
		this.intObjectid = intObjectid;
	}

    public void setStrHashConsulta(String strHashConsulta) {
        this.strHashConsulta = strHashConsulta;
    }
    public String getStrHashConsulta() {
        return CadenaUtil.getStr(strHashConsulta);
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
	
}
