package wcmc.hef.dao.capa.domain;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class TemSoeconComunidadesCampesinas extends TemSoeconComunidadesCampesinasKey implements BaseBeanVectorial {
	
    private String strHashConsulta;
	private String strTheGeom;
	private Integer intObjectid;
	private String strNombre;
	private String strEstado;
	private String strResolucion;
	private Double dblAreaHa;
	private String strNomdpto;
	private String strNomprov;
	private String strDistrito;
	private String strFechaReso;
	private String strNTitulo;
	private Double dblShapeLeng;
	private Double dblShapeArea;
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
	public Integer getIntObjectid() {
		return intObjectid;
	}
	public void setIntObjectid(Integer intObjectid) {
		this.intObjectid = intObjectid;
	}
	public String getStrNombre() {
		return strNombre;
	}
	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}
	public String getStrEstado() {
		return strEstado;
	}
	public void setStrEstado(String strEstado) {
		this.strEstado = strEstado;
	}
	public String getStrResolucion() {
		return strResolucion;
	}
	public void setStrResolucion(String strResolucion) {
		this.strResolucion = strResolucion;
	}
	public Double getDblAreaHa() {
		return dblAreaHa;
	}
	public void setDblAreaHa(Double dblAreaHa) {
		this.dblAreaHa = dblAreaHa;
	}
	public String getStrNomdpto() {
		return strNomdpto;
	}
	public void setStrNomdpto(String strNomdpto) {
		this.strNomdpto = strNomdpto;
	}
	public String getStrNomprov() {
		return strNomprov;
	}
	public void setStrNomprov(String strNomprov) {
		this.strNomprov = strNomprov;
	}
	public String getStrDistrito() {
		return strDistrito;
	}
	public void setStrDistrito(String strDistrito) {
		this.strDistrito = strDistrito;
	}
	public String getStrFechaReso() {
		return strFechaReso;
	}
	public void setStrFechaReso(String strFechaReso) {
		this.strFechaReso = strFechaReso;
	}
	public String getStrNTitulo() {
		return strNTitulo;
	}
	public void setStrNTitulo(String strNTitulo) {
		this.strNTitulo = strNTitulo;
	}
	public Double getDblShapeLeng() {
		return dblShapeLeng;
	}
	public void setDblShapeLeng(Double dblShapeLeng) {
		this.dblShapeLeng = dblShapeLeng;
	}
	public Double getDblShapeArea() {
		return dblShapeArea;
	}
	public void setDblShapeArea(Double dblShapeArea) {
		this.dblShapeArea = dblShapeArea;
	}
	
}
