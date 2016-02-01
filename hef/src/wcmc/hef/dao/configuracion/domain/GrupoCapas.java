package wcmc.hef.dao.configuracion.domain;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class GrupoCapas extends GrupoCapasKey {
	
	private String strNombre;
	private Integer intOrden;
	
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
