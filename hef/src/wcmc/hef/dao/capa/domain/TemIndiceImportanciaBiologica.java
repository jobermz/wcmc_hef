package wcmc.hef.dao.capa.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import wcmc.hef.general.util.CadenaUtil;

public class TemIndiceImportanciaBiologica extends TemIndiceImportanciaBiologicaKey implements BaseBeanVectorial {
	
    private String strHashConsulta;
	private String strTheGeom;
	private Double dblImpGlob;

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
	public Double getDblImpGlob() {
		return dblImpGlob;
	}
	public String getDblImpGlob2Decimales() {
		if(dblImpGlob != null)
			return new BigDecimal(dblImpGlob).setScale(2, BigDecimal.ROUND_HALF_EVEN).toString();
		else 
			return "0.00";
	}
	public String getDblImpGlob4Decimales() {
		if(dblImpGlob != null)
			return new BigDecimal(dblImpGlob).setScale(4, BigDecimal.ROUND_HALF_EVEN).toString();
		else 
			return "0.0000";
	}
	public void setDblImpGlob(Double dblImpGlob) {
		this.dblImpGlob = dblImpGlob;
	}
	
}
