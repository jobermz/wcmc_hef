package wcmc.hef.dao.capa.domain;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class TemCostoOportunidadDeforestacion extends TemCostoOportunidadDeforestacionKey implements BaseBeanVectorial {
	
	private String strTheGeom;
	private String strNombdist;
	private Double dblCopTco2H;
	
	public String getStrTheGeom() {
		return strTheGeom;
	}
	public void setStrTheGeom(String strTheGeom) {
		this.strTheGeom = strTheGeom;
	}
	public String getStrNombdist() {
		return strNombdist;
	}
	public void setStrNombdist(String strNombdist) {
		this.strNombdist = strNombdist;
	}
	public Double getDblCopTco2H() {
		return dblCopTco2H;
	}
	public void setDblCopTco2H(Double dblCopTco2H) {
		this.dblCopTco2H = dblCopTco2H;
	}
	
}
