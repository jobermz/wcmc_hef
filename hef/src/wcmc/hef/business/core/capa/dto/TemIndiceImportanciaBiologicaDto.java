package wcmc.hef.business.core.capa.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import wcmc.hef.general.util.CadenaUtil;

public class TemIndiceImportanciaBiologicaDto implements BaseBeanVectorialDto {
    private String strHashConsulta;
	private Integer srlGid;
	private String strTheGeom;
	private Double dblImpGlob;

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
	public Double getDblImpGlob() {
		return dblImpGlob;
	}
	public String getDblImpGlob2Decimales() {
		if(dblImpGlob != null)
			return new BigDecimal(dblImpGlob).setScale(2, BigDecimal.ROUND_HALF_EVEN).toString();
		else 
			return "0.00";
	}
	public void setDblImpGlob(Double dblImpGlob) {
		this.dblImpGlob = dblImpGlob;
	}
	
}
