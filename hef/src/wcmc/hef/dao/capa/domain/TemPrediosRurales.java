package wcmc.hef.dao.capa.domain;

import java.util.Date;
import java.util.List;

import wcmc.hef.general.util.CadenaUtil;

public class TemPrediosRurales extends TemPrediosRuralesKey implements BaseBeanVectorial {
	
    private String strHashConsulta;
	private String strTheGeom;
	private String strDepartamen;
	private String strDatum;
	private String strCodproy;
	private Integer intCntCodpro;
	private Integer intOrigFid;
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
	public String getStrTheGeom() {
		return strTheGeom;
	}
	public void setStrTheGeom(String strTheGeom) {
		this.strTheGeom = strTheGeom;
	}
	public String getStrDepartamen() {
		return strDepartamen;
	}
	public void setStrDepartamen(String strDepartamen) {
		this.strDepartamen = strDepartamen;
	}
	public String getStrDatum() {
		return strDatum;
	}
	public void setStrDatum(String strDatum) {
		this.strDatum = strDatum;
	}
	public String getStrCodproy() {
		return strCodproy;
	}
	public void setStrCodproy(String strCodproy) {
		this.strCodproy = strCodproy;
	}
	public Integer getIntCntCodpro() {
		return intCntCodpro;
	}
	public void setIntCntCodpro(Integer intCntCodpro) {
		this.intCntCodpro = intCntCodpro;
	}
	public Integer getIntOrigFid() {
		return intOrigFid;
	}
	public void setIntOrigFid(Integer intOrigFid) {
		this.intOrigFid = intOrigFid;
	}
	
}
