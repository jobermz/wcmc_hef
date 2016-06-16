package wcmc.hef.dao.configuracion.domain;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;

import wcmc.hef.general.util.CadenaUtil;

public class CapaUmbral extends CapaUmbralKey {
	
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
	public Integer getIntIdCapa() {
		return intIdCapa;
	}
	public void setIntIdCapa(Integer intIdCapa) {
		this.intIdCapa = intIdCapa;
	}
	public String getStrNombre() {
		return strNombre;
	}
	public String getStrNombreCombo() {
		return "[" + CadenaUtil.getDoubleFormato(dblValorMinimo, 4) + "-" + CadenaUtil.getDoubleFormato(dblValorMaximo, 4) + "] " + strNombre;
	}
	public String getStrNombreCombo2Decimales() {
		return "[" + CadenaUtil.getDoubleFormato(dblValorMinimo, 2) + "-" + CadenaUtil.getDoubleFormato(dblValorMaximo, 2) + "] " + strNombre;
	}
	public String getStrNombreComboSinDecimales() {
		return "[" + CadenaUtil.getDoubleFormato(dblValorMinimo, 0) + "-" + CadenaUtil.getDoubleFormato(dblValorMaximo, 0) + "] " + strNombre;
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
		return "["+intIdCapa+","+new BigDecimal(dblValorMinimo).setScale(4, BigDecimal.ROUND_HALF_EVEN).toString()+","+new BigDecimal(dblValorMaximo).setScale(4, BigDecimal.ROUND_HALF_EVEN).toString()+",'"+strNroLayer+"']";
	}
	public String getStrValoresMinimoMaximo2Decimales() {
		return "["+intIdCapa+","+new BigDecimal(dblValorMinimo).setScale(2, BigDecimal.ROUND_HALF_EVEN).toString()+","+new BigDecimal(dblValorMaximo).setScale(2, BigDecimal.ROUND_HALF_EVEN).toString()+",'"+strNroLayer+"']";
	}
	public String getStrValoresMinimoMaximoSinDecimales() {
		return "["+intIdCapa+","+new BigDecimal(dblValorMinimo).setScale(0, BigDecimal.ROUND_HALF_EVEN).toString()+","+new BigDecimal(dblValorMaximo).setScale(0, BigDecimal.ROUND_HALF_EVEN).toString()+",'"+strNroLayer+"']";
	}
	public String getStrNroLayer() {
		return strNroLayer;
	}
	public void setStrNroLayer(String strNroLayer) {
		this.strNroLayer = strNroLayer;
	}
	
	/*public static void main(String a[]){
		double ddd= 0.00021324234d;
		System.out.println("CapaUmbral.main()"+ddd);
		System.out.println("CapaUmbral.main()"+new Double(ddd).toString());
		BigDecimal bd	= new BigDecimal(ddd).setScale(11, BigDecimal.ROUND_HALF_EVEN);
		System.out.println(bd.toString());
		DecimalFormat df = new DecimalFormat("#");
        df.setMaximumFractionDigits(25);
        System.out.println(df.format(ddd));
	}*/
}
