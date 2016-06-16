package wcmc.hef.dao.capa.domain;

import java.math.BigDecimal;

public class BeanRaster {
	private String strPoligonoConsulta;
	private String strRangoConsulta;
	private Double dblValueSumaTotal;
	private Double dblValuePromedio;
	private Double dblValueMin;
	private Double dblValueMax;
	private Double dblStddev;
	private Long lngValueCount;
	private String strCategoria;
	
	private String strHashConsulta;
	private String strInRids;
	public BeanRaster() {
	}
	public BeanRaster(String strPoligonoConsulta) {
		this.strPoligonoConsulta	= strPoligonoConsulta;
	}
	public BeanRaster(Double dblValuePromedio, Double dblValueMin, Double dblValueMax, Long lngValueCount) {
		this.dblValuePromedio		= dblValuePromedio;
		this.dblValueMin			= dblValueMin;
		this.dblValueMax			= dblValueMax;
		this.lngValueCount			= lngValueCount;
	}
	public BeanRaster(Double dblValueSumaTotal, Double dblValuePromedio, Double dblValueMin, Double dblValueMax, Long lngValueCount) {
		this.dblValueSumaTotal		= dblValueSumaTotal;
		this.dblValuePromedio		= dblValuePromedio;
		this.dblValueMin			= dblValueMin;
		this.dblValueMax			= dblValueMax;
		this.lngValueCount			= lngValueCount;
	}
	public String getStrPoligonoConsulta() {
		return strPoligonoConsulta;
	}
	public void setStrPoligonoConsulta(String strPoligonoConsulta) {
		this.strPoligonoConsulta = strPoligonoConsulta;
	}
	public String getStrCategoria() {
		return strCategoria;
	}
	public void setStrCategoria(String strCategoria) {
		this.strCategoria = strCategoria;
	}
	public String getStrRangoConsulta() {
		return strRangoConsulta;
	}
	public void setStrRangoConsulta(String strRangoConsulta) {
		this.strRangoConsulta = strRangoConsulta;
	}
	
	public String getStrValuePromedio() {
		if(dblValuePromedio != null)
			return new BigDecimal(dblValuePromedio).setScale(4, BigDecimal.ROUND_HALF_EVEN).toString();
		else 
			return "0.0000";
	}
	public String getStrValuePromedio2Decimales() {
		if(dblValuePromedio != null)
			return new BigDecimal(dblValuePromedio).setScale(2, BigDecimal.ROUND_HALF_EVEN).toString();
		else 
			return "0.00";
	}
	public String getStrValuePromedioSinDecimales() {
		if(dblValuePromedio != null)
			return new BigDecimal(dblValuePromedio).setScale(0, BigDecimal.ROUND_HALF_EVEN).toString();
		else 
			return "0";
	}
	public Double getDblValuePromedio() {
		return dblValuePromedio;
	}
	public void setDblValuePromedio(Double dblValuePromedio) {
		this.dblValuePromedio = dblValuePromedio;
	}
	
	public String getStrValueMin() {
		if(dblValueMin != null)
			return new BigDecimal(dblValueMin).setScale(4, BigDecimal.ROUND_HALF_EVEN).toString();
		else 
			return "0.0000";
	}
	public String getStrValueMin2Decimales() {
		if(dblValueMin != null)
			return new BigDecimal(dblValueMin).setScale(2, BigDecimal.ROUND_HALF_EVEN).toString();
		else 
			return "0.00";
	}
	public String getStrValueMinSinDecimales() {
		if(dblValueMin != null)
			return new BigDecimal(dblValueMin).setScale(0, BigDecimal.ROUND_HALF_EVEN).toString();
		else 
			return "0";
	}
	public Double getDblValueMin() {
		return dblValueMin;
	}
	public void setDblValueMin(Double dblValueMin) {
		this.dblValueMin = dblValueMin;
	}
	
	public String getStrValueMax() {
		if(dblValueMax != null)
			return new BigDecimal(dblValueMax).setScale(4, BigDecimal.ROUND_HALF_EVEN).toString();
		else 
			return "0.0000";
	}
	public String getStrValueMax2Decimales() {
		if(dblValueMax != null)
			return new BigDecimal(dblValueMax).setScale(2, BigDecimal.ROUND_HALF_EVEN).toString();
		else 
			return "0.00";
	}
	public String getStrValueMaxSinDecimales() {
		if(dblValueMax != null)
			return new BigDecimal(dblValueMax).setScale(0, BigDecimal.ROUND_HALF_EVEN).toString();
		else 
			return "0";
	}
	public Double getDblValueMax() {
		return dblValueMax;
	}
	public void setDblValueMax(Double dblValueMax) {
		this.dblValueMax = dblValueMax;
	}
	
	public String getStrValueCount() {
		if(lngValueCount != null)
			return String.valueOf(lngValueCount);
		else 
			return "0";
	}
	public Long getLngValueCount() {
		return lngValueCount;
	}
	public void setLngValueCount(Long lngValueCount) {
		this.lngValueCount = lngValueCount;
	}
	
	public String getStrStddev() {
		if(dblStddev != null)
			return new BigDecimal(dblStddev).setScale(4, BigDecimal.ROUND_HALF_EVEN).toString();
		else 
			return "0.0000";
	}
	public String getStrStddev2Decimales() {
		if(dblStddev != null)
			return new BigDecimal(dblStddev).setScale(2, BigDecimal.ROUND_HALF_EVEN).toString();
		else 
			return "0.00";
	}
	public String getStrStddevSinDecimales() {
		if(dblStddev != null)
			return new BigDecimal(dblStddev).setScale(0, BigDecimal.ROUND_HALF_EVEN).toString();
		else 
			return "0";
	}
	public Double getDblStddev() {
		return dblStddev;
	}
	public void setDblStddev(Double dblStddev) {
		this.dblStddev = dblStddev;
	}
	public String getStrInRids() {
		return strInRids;
	}
	public void setStrInRids(String strInRids) {
		this.strInRids = strInRids;
	}
	public String getStrHashConsulta() {
		return strHashConsulta;
	}
	public void setStrHashConsulta(String strHashConsulta) {
		this.strHashConsulta = strHashConsulta;
	}
	public Double getDblValueSumaTotal() {
		return dblValueSumaTotal;
	}
	public void setDblValueSumaTotal(Double dblValueSumaTotal) {
		this.dblValueSumaTotal = dblValueSumaTotal;
	}
	public String getStrValueSumaTotal() {
		if(dblValueSumaTotal != null)
			return new BigDecimal(dblValueSumaTotal).setScale(4, BigDecimal.ROUND_HALF_EVEN).toString();
		else 
			return "0.0000";
	}
	public String getStrValueSumaTotal2Decimales() {
		if(dblValueSumaTotal != null)
			return new BigDecimal(dblValueSumaTotal).setScale(2, BigDecimal.ROUND_HALF_EVEN).toString();
		else 
			return "0.00";
	}
	public String getStrValueSumaTotal2DecimalesCobBos() {
		if(dblValueSumaTotal != null)
			return new BigDecimal(dblValueSumaTotal*0.09d).setScale(2, BigDecimal.ROUND_HALF_EVEN).toString();
		else 
			return "0.00";
	}
	public String getStrValueSumaTotalSinDecimales() {
		if(dblValueSumaTotal != null)
			return new BigDecimal(dblValueSumaTotal).setScale(0, BigDecimal.ROUND_HALF_EVEN).toString();
		else 
			return "0";
	}
	
}
