package wcmc.hef.business.core.capa.dto;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class TemCarbonoEcozonasDto implements BaseBeanVectorialDto {
    private String strHashConsulta;
	private Integer srlGid;
	private String strTheGeom;
	private Integer intObjectid;
	private String strEcozona;
	private String strTcHa;
	private Double dblLinfTcHa;
	private Double dblLsupTcHa;
	private Double dblPorcIncer;

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
