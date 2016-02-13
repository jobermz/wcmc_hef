package wcmc.hef.business.core.configuracion.dto;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class CapaUmbralDto {
	private Integer srlIdCapaUmbral;
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
	public Integer getSrlIdCapaUmbral() {
		return srlIdCapaUmbral;
	}
	public void setSrlIdCapaUmbral(Integer srlIdCapaUmbral) {
		this.srlIdCapaUmbral = srlIdCapaUmbral;
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
	
}
