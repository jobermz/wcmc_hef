package wcmc.hef.business.core.configuracion.dto;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class PerfilDto {
	private Integer srlIdPerfil;
	private String strNombre;
	public Integer getSrlIdPerfil() {
		return srlIdPerfil;
	}
	public void setSrlIdPerfil(Integer srlIdPerfil) {
		this.srlIdPerfil = srlIdPerfil;
	}
	public String getStrNombre() {
		return strNombre;
	}
	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}
	
}
