package wcmc.hef.dao.configuracion.domain;

import java.util.Date;
import java.util.List;

import wcmc.hef.general.util.CadenaUtil;

public class CapaUmbral extends CapaUmbralKey {
	
	private String intIdCapaDesc;
	private Integer intIdCapa;
	private String strNombre;
	private Integer intValorMinimo;
	private Integer intValorMaximo;
	
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
	public Integer getIntValorMinimo() {
		return intValorMinimo;
	}
	public void setIntValorMinimo(Integer intValorMinimo) {
		this.intValorMinimo = intValorMinimo;
	}
	public Integer getIntValorMaximo() {
		return intValorMaximo;
	}
	public void setIntValorMaximo(Integer intValorMaximo) {
		this.intValorMaximo = intValorMaximo;
	}
	public String getStrValoresMinimoMaximo() {
		return "["+intIdCapa+","+intValorMinimo+","+intValorMaximo+"]";
	}
}
