package wcmc.hef.dao.capa.domain;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class TemViasTrochas extends TemViasTrochasKey implements BaseBeanVectorial {
	
    private String strHashConsulta;
	private String strTheGeom;
	private Long lngObjectid;
	private String strEstado;
	private String strDescrip;
	private Double dblShapeLeng;
	private Double dblStLength;

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
	public Long getLngObjectid() {
		return lngObjectid;
	}
	public void setLngObjectid(Long lngObjectid) {
		this.lngObjectid = lngObjectid;
	}
	public String getStrEstado() {
		return strEstado;
	}
	public void setStrEstado(String strEstado) {
		this.strEstado = strEstado;
	}
	public String getStrDescrip() {
		return strDescrip;
	}
	public void setStrDescrip(String strDescrip) {
		this.strDescrip = strDescrip;
	}
	public Double getDblShapeLeng() {
		return dblShapeLeng;
	}
	public void setDblShapeLeng(Double dblShapeLeng) {
		this.dblShapeLeng = dblShapeLeng;
	}
	public Double getDblStLength() {
		return dblStLength;
	}
	public void setDblStLength(Double dblStLength) {
		this.dblStLength = dblStLength;
	}
	
}
