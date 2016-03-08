package wcmc.hef.dao.capa.domain;

public class TemRiesgoErosionHidrica {
	private String strPoligonoConsulta;
	private String strValuePromedio;
	private String strValue;
	private String strCategoria;

	public TemRiesgoErosionHidrica() {
	}
	public TemRiesgoErosionHidrica(String strPoligonoConsulta, String strValuePromedio, String strValue) {
		this.strPoligonoConsulta	= strPoligonoConsulta;
		this.strValuePromedio		= strValuePromedio;
		this.strValue				= strValue;
	}
	public String getStrPoligonoConsulta() {
		return strPoligonoConsulta;
	}
	public void setStrPoligonoConsulta(String strPoligonoConsulta) {
		this.strPoligonoConsulta = strPoligonoConsulta;
	}
	public String getStrValuePromedio() {
		return strValuePromedio;
	}
	public void setStrValuePromedio(String strValuePromedio) {
		this.strValuePromedio = strValuePromedio;
	}
	public String getStrValue() {
		return strValue;
	}
	public void setStrValue(String strValue) {
		this.strValue = strValue;
	}
	public String getStrCategoria() {
		return strCategoria;
	}
	public void setStrCategoria(String strCategoria) {
		this.strCategoria = strCategoria;
	}
	
}
