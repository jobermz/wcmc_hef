package wcmc.hef.dao.capa.domain;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class TemCarbonoEcozonas extends TemCarbonoEcozonasKey implements BaseBeanVectorial {
	
	private String strTheGeom;
	private Integer intObjectid;
	private String strEcozona;
	private String strTcHa;
	private Double dblLinfTcHa;
	private Double dblLsupTcHa;
	private Double dblPorcIncer;
	
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
	public String getStrEcozona() {
		return strEcozona;
	}
	public void setStrEcozona(String strEcozona) {
		this.strEcozona = strEcozona;
	}
	public String getStrTcHa() {
		return strTcHa;
	}
	public void setStrTcHa(String strTcHa) {
		this.strTcHa = strTcHa;
	}
	public Double getDblLinfTcHa() {
		return dblLinfTcHa;
	}
	public void setDblLinfTcHa(Double dblLinfTcHa) {
		this.dblLinfTcHa = dblLinfTcHa;
	}
	public Double getDblLsupTcHa() {
		return dblLsupTcHa;
	}
	public void setDblLsupTcHa(Double dblLsupTcHa) {
		this.dblLsupTcHa = dblLsupTcHa;
	}
	public Double getDblPorcIncer() {
		return dblPorcIncer;
	}
	public void setDblPorcIncer(Double dblPorcIncer) {
		this.dblPorcIncer = dblPorcIncer;
	}
	
}
