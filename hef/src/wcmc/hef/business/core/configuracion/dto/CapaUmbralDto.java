package wcmc.hef.business.core.configuracion.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import wcmc.hef.general.util.CadenaUtil;

public class CapaUmbralDto {
	private Integer srlIdCapaUmbral;
	private String intIdCapaDesc;
	private Integer intIdCapa;
	private String strNombre;
	private Double dblValorMinimo;
	private Double dblValorMaximo;
	private String strNroLayer;
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
	public String getStrValorMinimo() {
		if(dblValorMinimo != null) {
			return new BigDecimal(dblValorMinimo.doubleValue()).setScale(4, BigDecimal.ROUND_HALF_EVEN).toString();
		} else {
			return "0.0000";
		}
	}
	public Double getDblValorMinimo() {
		return dblValorMinimo;
	}
	public void setDblValorMinimo(Double dblValorMinimo) {
		this.dblValorMinimo = dblValorMinimo;
	}
	public String getStrValorMaximo() {
		if(dblValorMaximo != null) {
			return new BigDecimal(dblValorMaximo.doubleValue()).setScale(4, BigDecimal.ROUND_HALF_EVEN).toString();
		} else {
			return "0.0000";
		}
	}
	public Double getDblValorMaximo() {
		return dblValorMaximo;
	}
	public void setDblValorMaximo(Double dblValorMaximo) {
		this.dblValorMaximo = dblValorMaximo;
	}
	public String getStrNroLayer() {
		return strNroLayer;
	}
	public void setStrNroLayer(String strNroLayer) {
		this.strNroLayer = strNroLayer;
	}
	
}
