package wcmc.hef.dao.capa.domain;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class TemZonificPotencialBosqueProduccionPermanente extends TemZonificPotencialBosqueProduccionPermanenteKey implements BaseBeanVectorial {
	
	private String strTheGeom;
	private Long lngId;
	private String strZona;
	private String strTipo;
	private String strDenomin;
	private Double dblAreaSig;
	private Double dblAreaAprob;
	private String strRegion;
	private String strFuente;
	private String strDocLegal;
	private Integer intTheid;
	private Double dblPerimeter;
	private Double dblHectares;
	
	public String getStrTheGeom() {
		return strTheGeom;
	}
	public void setStrTheGeom(String strTheGeom) {
		this.strTheGeom = strTheGeom;
	}
	public Long getLngId() {
		return lngId;
	}
	public void setLngId(Long lngId) {
		this.lngId = lngId;
	}
	public String getStrZona() {
		return strZona;
	}
	public void setStrZona(String strZona) {
		this.strZona = strZona;
	}
	public String getStrTipo() {
		return strTipo;
	}
	public void setStrTipo(String strTipo) {
		this.strTipo = strTipo;
	}
	public String getStrDenomin() {
		return strDenomin;
	}
	public void setStrDenomin(String strDenomin) {
		this.strDenomin = strDenomin;
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
	public String getStrFuente() {
		return strFuente;
	}
	public void setStrFuente(String strFuente) {
		this.strFuente = strFuente;
	}
	public String getStrDocLegal() {
		return strDocLegal;
	}
	public void setStrDocLegal(String strDocLegal) {
		this.strDocLegal = strDocLegal;
	}
	public Integer getIntTheid() {
		return intTheid;
	}
	public void setIntTheid(Integer intTheid) {
		this.intTheid = intTheid;
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
