package wcmc.hef.business.core.capa.dto;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class TemViaFerreaDto implements BaseBeanVectorialDto {
    private String strHashConsulta;
	private Integer srlGid;
	private String strTheGeom;
	private Integer intObjectid1;
	private String strGmlId;
	private Integer intObjectid;
	private Double dblViaferr;
	private Double dblShapeStle;

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
	public Integer getIntObjectid1() {
		return intObjectid1;
	}
	public void setIntObjectid1(Integer intObjectid1) {
		this.intObjectid1 = intObjectid1;
	}
	public String getStrGmlId() {
		return strGmlId;
	}
	public void setStrGmlId(String strGmlId) {
		this.strGmlId = strGmlId;
	}
	public Integer getIntObjectid() {
		return intObjectid;
	}
	public void setIntObjectid(Integer intObjectid) {
		this.intObjectid = intObjectid;
	}
	public Double getDblViaferr() {
		return dblViaferr;
	}
	public void setDblViaferr(Double dblViaferr) {
		this.dblViaferr = dblViaferr;
	}
	public Double getDblShapeStle() {
		return dblShapeStle;
	}
	public void setDblShapeStle(Double dblShapeStle) {
		this.dblShapeStle = dblShapeStle;
	}
	
}
