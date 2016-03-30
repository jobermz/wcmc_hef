package wcmc.hef.business.core.configuracion.dto;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class GeometriaUsuarioDto {
	private Integer srlIdGeometriaUsuario;
	private Integer intIdCapa;
	private String strGeometry;
	private String strData;
	private String strHashConsulta;
	
	public Integer getSrlIdGeometriaUsuario() {
		return srlIdGeometriaUsuario;
	}
	public void setSrlIdGeometriaUsuario(Integer srlIdGeometriaUsuario) {
		this.srlIdGeometriaUsuario = srlIdGeometriaUsuario;
	}
	public Integer getIntIdCapa() {
		return intIdCapa;
	}
	public void setIntIdCapa(Integer intIdCapa) {
		this.intIdCapa = intIdCapa;
	}
	public String getStrGeometry() {
		return strGeometry;
	}
	public void setStrGeometry(String strGeometry) {
		this.strGeometry = strGeometry;
	}
	public String getStrHashConsulta() {
		return strHashConsulta;
	}
	public void setStrHashConsulta(String strHashConsulta) {
		this.strHashConsulta = strHashConsulta;
	}
	public String getStrData() {
		return strData;
	}
	public void setStrData(String strData) {
		this.strData = strData;
	}
	
}
