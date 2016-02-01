package wcmc.hef.business.core.seguridad.dto;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class CuentaUsuarioDto {
	private Integer srlId;
	private Integer intPerfil;
	private String strNombres;
	private String strApellidos;
	private String strUsuario;
	private String strClave;
	private String strEsActivo;
	public String getIntPerfilDesc() {
		if((""+this.intPerfil).equals("1")) {
			return "Administrador";
		} else if((""+this.intPerfil).equals("1")) {
			return "Técnico";
		} else {
			return "";
		}
	}
	public boolean getStrEsActivoBoolean() {
		if(strEsActivo == null) {
			strEsActivo = "N";
		}
		return strEsActivo != null && strEsActivo.equals("S");
	}
	public void setStrEsActivoBoolean(boolean strEsActivoBoolean) {
		this.strEsActivo = (strEsActivoBoolean ? "S" : "N");
	}
	public Integer getSrlId() {
		return srlId;
	}
	public void setSrlId(Integer srlId) {
		this.srlId = srlId;
	}
	public Integer getIntPerfil() {
		return intPerfil;
	}
	public void setIntPerfil(Integer intPerfil) {
		this.intPerfil = intPerfil;
	}
	public String getStrNombres() {
		return strNombres;
	}
	public void setStrNombres(String strNombres) {
		this.strNombres = strNombres;
	}
	public String getStrApellidos() {
		return strApellidos;
	}
	public void setStrApellidos(String strApellidos) {
		this.strApellidos = strApellidos;
	}
	public String getStrUsuario() {
		return strUsuario;
	}
	public void setStrUsuario(String strUsuario) {
		this.strUsuario = strUsuario;
	}
	public String getStrClave() {
		return strClave;
	}
	public void setStrClave(String strClave) {
		this.strClave = strClave;
	}
	public String getStrEsActivo() {
		return strEsActivo;
	}
	public void setStrEsActivo(String strEsActivo) {
		this.strEsActivo = strEsActivo;
	}
	
}
