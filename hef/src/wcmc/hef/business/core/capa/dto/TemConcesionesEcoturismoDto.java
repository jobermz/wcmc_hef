package wcmc.hef.business.core.capa.dto;

import java.util.Date;
import java.util.List;

import wcmc.hef.general.util.CadenaUtil;

public class TemConcesionesEcoturismoDto implements BaseBeanVectorialDto {
    private String strHashConsulta;
	private Integer srlGid;
	private String strTheGeom;
	private Integer intId;
	private String strAnio;
	private String strModalidad;
	private String strTitular;
	private String strContrato;
	private Double dblAreaSig;
	private Double dblAreaAprob;
	private String strRegion;
	private String strDocum;
	private String strSituacion;
	private Double dblPerimeter;
	private Double dblHectares;
	private Integer intGeodecid;
	public Integer getIntGeodecid() {
		return intGeodecid;
	}
	public void setIntGeodecid(Integer intGeodecid) {
		this.intGeodecid = intGeodecid;
	}
    public void setStrHashConsulta(String strHashConsulta) {
        this.strHashConsulta = strHashConsulta;
    }
	
    public String getStrHashConsulta() {
        return CadenaUtil.getStr(strHashConsulta);
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
	public Integer getIntId() {
		return intId;
	}
	public void setIntId(Integer intId) {
		this.intId = intId;
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
	public Double getDblAreaSig() {
		return dblAreaSig;
	}
	public void setDblAreaSig(Double dblAreaSig) {
		this.dblAreaSig = dblAreaSig;
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
	public Double getDblPerimeter() {
		return dblPerimeter;
	}
	public void setDblPerimeter(Double dblPerimeter) {
		this.dblPerimeter = dblPerimeter;
	}
	public Double getDblHectares() {
		return dblHectares;
	}
	public void setDblHectares(Double dblHectares) {
		this.dblHectares = dblHectares;
	}
	
}
