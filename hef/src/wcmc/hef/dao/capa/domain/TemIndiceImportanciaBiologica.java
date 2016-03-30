package wcmc.hef.dao.capa.domain;

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
	public void setDblImpGlob(Double dblImpGlob) {
		this.dblImpGlob = dblImpGlob;
	}
	
}
