package wcmc.hef.business.core.configuracion.dto;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class GrupoCapasDto {
	private Integer srlIdGrupoCapas;
	private String strNombre;
	private Integer intOrden;
	public Integer getSrlIdGrupoCapas() {
		return srlIdGrupoCapas;
	}
	public void setSrlIdGrupoCapas(Integer srlIdGrupoCapas) {
		this.srlIdGrupoCapas = srlIdGrupoCapas;
	}
	public String getStrNombre() {
		return strNombre;
	}
	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}
	public Integer getIntOrden() {
		return intOrden;
	}
	public void setIntOrden(Integer intOrden) {
		this.intOrden = intOrden;
	}
	
}
