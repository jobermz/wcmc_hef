package wcmc.hef.business.core.capa.dto;

import java.math.BigDecimal;

import wcmc.hef.general.util.CadenaUtil;

public class BeanRasterDto {
	private String strPoligonoConsulta;
	private String strRangoConsulta;
	private Double dblValuePromedio;
	private Double dblValueMin;
	private Double dblValueMax;
	private Long lngValueCount;
	private String strCategoria;

	private String strHashConsulta;
	private String strInRids;
	public BeanRasterDto clone() {
		BeanRasterDto bean	= new BeanRasterDto(this.dblValuePromedio, this.dblValueMin, this.dblValueMax, this.lngValueCount);
		bean.setStrPoligonoConsulta(this.strPoligonoConsulta);
		bean.setStrRangoConsulta(this.strRangoConsulta);
		bean.setStrCategoria(this.strCategoria);
		bean.setStrHashConsulta(this.strHashConsulta);
		bean.setStrInRids(this.strInRids);
		return bean;
	}
	public BeanRasterDto() {
	}
	public BeanRasterDto(String strPoligonoConsulta) {
		this.strPoligonoConsulta	= strPoligonoConsulta;
	}
	public BeanRasterDto(Double dblValuePromedio, Double dblValueMin, Double dblValueMax, Long lngValueCount) {
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
	public String getStrHashConsulta() {
		return strHashConsulta;
	}
	public void setStrHashConsulta(String strHashConsulta) {
		this.strHashConsulta = strHashConsulta;
	}
	public String getStrInRids() {
		return strInRids;
	}
	public void setStrInRids(String strInRids) {
		strInRids	= CadenaUtil.getStr(strInRids);
		if(strInRids.indexOf("[") != -1) {
			strInRids	= strInRids.substring(1);
		}
		if(strInRids.indexOf("]") != -1) {
			strInRids	= strInRids.substring(0,strInRids.length()-1);
		}
		this.strInRids = strInRids;
	}
}
