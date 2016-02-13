package wcmc.hef.business.core.configuracion.dto;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class TipoCapaDto {
	private Integer srlIdTipoCapa;
	private String strNombre;
	public Integer getSrlIdTipoCapa() {
		return srlIdTipoCapa;
	}
	public void setSrlIdTipoCapa(Integer srlIdTipoCapa) {
		this.srlIdTipoCapa = srlIdTipoCapa;
	}
	public String getStrNombre() {
		return strNombre;
	}
	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}
	
}
