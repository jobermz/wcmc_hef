package wcmc.hef.dao.configuracion.domain;

import java.util.Date;
import java.util.List;

import wcmc.hef.general.util.CadenaUtil;

public class CapaUmbral extends CapaUmbralKey {
	
	private String intIdCapaDesc;
	private Integer intIdCapa;
	private String strNombre;
	private Double dblValorMinimo;
	private Double dblValorMaximo;
	
	public String getIntIdCapaDesc() {
		return intIdCapaDesc;
	}
	public void setIntIdCapaDesc(String intIdCapaDesc) {
		this.intIdCapaDesc = intIdCapaDesc;
	}
	public Integer getIntIdCapa() {
		return intIdCapa;
	}
	public void setIntIdCapa(Integer intIdCapa) {
		this.intIdCapa = intIdCapa;
	}
	public String getStrNombre() {
		return strNombre;
	}
	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}
	public Double getDblValorMinimo() {
		return dblValorMinimo;
	}
	public void setDblValorMinimo(Double dblValorMinimo) {
		this.dblValorMinimo = dblValorMinimo;
	}
	public Double getDblValorMaximo() {
		return dblValorMaximo;
	}
	public void setDblValorMaximo(Double dblValorMaximo) {
		this.dblValorMaximo = dblValorMaximo;
	}
	public String getStrValoresMinimoMaximo() {
		return "["+intIdCapa+","+dblValorMinimo+","+dblValorMaximo+"]";
	}
}
