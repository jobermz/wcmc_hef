package wcmc.hef.business.core.capa.dto;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class TemCuencasHidrograficasDto implements BaseBeanVectorialDto {
    private String strHashConsulta;
	private Integer srlGid;
	private String strTheGeom;
	private Integer intObjectid;
	private String strGmlId;
	private String strId;
	private String strCodigo;
	private String strNombre;
	private String strGeometria;
	private Integer intEsriOid;

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
	public String getStrGmlId() {
		return strGmlId;
	}
	public void setStrGmlId(String strGmlId) {
		this.strGmlId = strGmlId;
	}
	public String getStrId() {
		return strId;
	}
	public void setStrId(String strId) {
		this.strId = strId;
	}
	public String getStrCodigo() {
		return strCodigo;
	}
	public void setStrCodigo(String strCodigo) {
		this.strCodigo = strCodigo;
	}
	public String getStrNombre() {
		return strNombre;
	}
	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}
	public String getStrGeometria() {
		return strGeometria;
	}
	public void setStrGeometria(String strGeometria) {
		this.strGeometria = strGeometria;
	}
	public Integer getIntEsriOid() {
		return intEsriOid;
	}
	public void setIntEsriOid(Integer intEsriOid) {
		this.intEsriOid = intEsriOid;
	}
	
}
