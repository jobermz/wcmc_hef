package wcmc.hef.business.core.capa.dto;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class TemConcesionesForestalesCastaniaDto implements BaseBeanVectorialDto {
	private Integer srlGid;
	private String strTheGeom;
	private String strModalidad;
	private String strTitular;
	private String strContrato;
	private String strRegion;
	private Double dblAreaSig;
	private String strSituacion;
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
	public String getStrRegion() {
		return strRegion;
	}
	public void setStrRegion(String strRegion) {
		this.strRegion = strRegion;
	}
	public Double getDblAreaSig() {
		return dblAreaSig;
	}
	public void setDblAreaSig(Double dblAreaSig) {
		this.dblAreaSig = dblAreaSig;
	}
	public String getStrSituacion() {
		return strSituacion;
	}
	public void setStrSituacion(String strSituacion) {
		this.strSituacion = strSituacion;
	}
	
}