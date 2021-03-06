package wcmc.hef.business.core.capa.dto;

import java.util.Date;
import java.util.List;

import wcmc.hef.general.util.CadenaUtil;

public class TemConcesionesForestalesMaderableAdecuadasDto implements BaseBeanVectorialDto {
    private String strHashConsulta;
	private Integer srlGid;
	private String strTheGeom;
	private String strModalidad;
	private String strTitular;
	private String strContrato;
	private Double dblAreaSig;
	private Double dblAreaAprob;
	private String strRegion;
	private String strSituacion;
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
	public String getStrSituacion() {
		return strSituacion;
	}
	public void setStrSituacion(String strSituacion) {
		this.strSituacion = strSituacion;
	}
	
}
