package wcmc.hef.business.core.capa.dto;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class TemIndiceImportanciaBiologicaDto implements BaseBeanVectorialDto {
	private Integer srlGid;
	private String strTheGeom;
	private Double dblImpGlob;
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
	public Double getDblImpGlob() {
		return dblImpGlob;
	}
	public void setDblImpGlob(Double dblImpGlob) {
		this.dblImpGlob = dblImpGlob;
	}
	
}