package wcmc.hef.dao.capa.domain;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class BasHidroRiosLagunas extends BasHidroRiosLagunasKey implements BaseBeanVectorial {
	
	private String strTheGeom;
	private Long lngCount;
	private String strFirstIdpr;
	private String strNombprov;
	private String strFirstNomb;
	private String strLastDcto;
	private String strLastLey;
	private String strFirstFech;
	private String strLastFecha;
	private Double dblMinShape;
	private Double dblArea;
	private Double dblPerimeter;
	private Long lngTiticacg;
	private Long lngTiticacgI;
	private String strDxfLayer;
	private String strDxfText;
	
	public String getStrTheGeom() {
		return strTheGeom;
	}
	public void setStrTheGeom(String strTheGeom) {
		this.strTheGeom = strTheGeom;
	}
	public Long getLngCount() {
		return lngCount;
	}
	public void setLngCount(Long lngCount) {
		this.lngCount = lngCount;
	}
	public String getStrFirstIdpr() {
		return strFirstIdpr;
	}
	public void setStrFirstIdpr(String strFirstIdpr) {
		this.strFirstIdpr = strFirstIdpr;
	}
	public String getStrNombprov() {
		return strNombprov;
	}
	public void setStrNombprov(String strNombprov) {
		this.strNombprov = strNombprov;
	}
	public String getStrFirstNomb() {
		return strFirstNomb;
	}
	public void setStrFirstNomb(String strFirstNomb) {
		this.strFirstNomb = strFirstNomb;
	}
	public String getStrLastDcto() {
		return strLastDcto;
	}
	public void setStrLastDcto(String strLastDcto) {
		this.strLastDcto = strLastDcto;
	}
	public String getStrLastLey() {
		return strLastLey;
	}
	public void setStrLastLey(String strLastLey) {
		this.strLastLey = strLastLey;
	}
	public String getStrFirstFech() {
		return strFirstFech;
	}
	public void setStrFirstFech(String strFirstFech) {
		this.strFirstFech = strFirstFech;
	}
	public String getStrLastFecha() {
		return strLastFecha;
	}
	public void setStrLastFecha(String strLastFecha) {
		this.strLastFecha = strLastFecha;
	}
	public Double getDblMinShape() {
		return dblMinShape;
	}
	public void setDblMinShape(Double dblMinShape) {
		this.dblMinShape = dblMinShape;
	}
	public Double getDblArea() {
		return dblArea;
	}
	public void setDblArea(Double dblArea) {
		this.dblArea = dblArea;
	}
	public Double getDblPerimeter() {
		return dblPerimeter;
	}
	public void setDblPerimeter(Double dblPerimeter) {
		this.dblPerimeter = dblPerimeter;
	}
	public Long getLngTiticacg() {
		return lngTiticacg;
	}
	public void setLngTiticacg(Long lngTiticacg) {
		this.lngTiticacg = lngTiticacg;
	}
	public Long getLngTiticacgI() {
		return lngTiticacgI;
	}
	public void setLngTiticacgI(Long lngTiticacgI) {
		this.lngTiticacgI = lngTiticacgI;
	}
	public String getStrDxfLayer() {
		return strDxfLayer;
	}
	public void setStrDxfLayer(String strDxfLayer) {
		this.strDxfLayer = strDxfLayer;
	}
	public String getStrDxfText() {
		return strDxfText;
	}
	public void setStrDxfText(String strDxfText) {
		this.strDxfText = strDxfText;
	}
	
}
