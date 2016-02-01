package wcmc.hef.business.core.visor.dto;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class CapaDepartamentoDto {
	private Integer intIdGid;
	private String strIdDepartamento;
	private String strNombre;
	private Double dblArea;
	private Date timFechaRegistro;
	private String strGeometria;
	public String getTimFechaRegistroFecha() {
		return CadenaUtil.getStrDate(timFechaRegistro);
	}
	public void setTimFechaRegistroFecha(String timFechaRegistro) {
		this.timFechaRegistro = CadenaUtil.getDateFromStr(timFechaRegistro);
	}
	public Integer getIntIdGid() {
		return intIdGid;
	}
	public void setIntIdGid(Integer intIdGid) {
		this.intIdGid = intIdGid;
	}
	public String getStrIdDepartamento() {
		return strIdDepartamento;
	}
	public void setStrIdDepartamento(String strIdDepartamento) {
		this.strIdDepartamento = strIdDepartamento;
	}
	public String getStrNombre() {
		return strNombre;
	}
	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}
	public Double getDblArea() {
		return dblArea;
	}
	public void setDblArea(Double dblArea) {
		this.dblArea = dblArea;
	}
	public Date getTimFechaRegistro() {
		return timFechaRegistro;
	}
	public void setTimFechaRegistro(Date timFechaRegistro) {
		this.timFechaRegistro = timFechaRegistro;
	}
	public String getStrGeometria() {
		return strGeometria;
	}
	public void setStrGeometria(String strGeometria) {
		this.strGeometria = strGeometria;
	}
	
}
