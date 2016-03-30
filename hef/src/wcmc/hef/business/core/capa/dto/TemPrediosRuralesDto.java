package wcmc.hef.business.core.capa.dto;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class TemPrediosRuralesDto implements BaseBeanVectorialDto {
    private String strHashConsulta;
	private Integer srlGid;
	private String strTheGeom;
	private String strDepartamen;
	private String strDatum;
	private String strCodproy;
	private Integer intCntCodpro;
	private Integer intOrigFid;

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
