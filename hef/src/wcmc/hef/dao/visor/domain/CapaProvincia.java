package wcmc.hef.dao.visor.domain;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class CapaProvincia extends CapaProvinciaKey {
	
	private String strIdProvincia;
	private String strNombreProvincia;
	private String strNombreDepartamento;
	private String strFechaInicio;
	private String strFechaFin;
	private String strDcto;
	private String strLey;
	private Double dblLongitud;
	private Double dblArea;
	private Date timFechaRegistro;
	private String strGeometria;
	
	public String getTimFechaRegistroFecha() {
		return CadenaUtil.getStrDate(timFechaRegistro);
	}
	public void setTimFechaRegistroFecha(String timFechaRegistro) {
		this.timFechaRegistro = CadenaUtil.getDateFromStr(timFechaRegistro);
	}
	public String getStrIdProvincia() {
		return strIdProvincia;
	}
	public void setStrIdProvincia(String strIdProvincia) {
		this.strIdProvincia = strIdProvincia;
	}
	public String getStrNombreProvincia() {
		return strNombreProvincia;
	}
	public void setStrNombreProvincia(String strNombreProvincia) {
		this.strNombreProvincia = strNombreProvincia;
	}
	public String getStrNombreDepartamento() {
		return strNombreDepartamento;
	}
	public void setStrNombreDepartamento(String strNombreDepartamento) {
		this.strNombreDepartamento = strNombreDepartamento;
	}
	public String getStrFechaInicio() {
		return strFechaInicio;
	}
	public void setStrFechaInicio(String strFechaInicio) {
		this.strFechaInicio = strFechaInicio;
	}
	public String getStrFechaFin() {
		return strFechaFin;
	}
	public void setStrFechaFin(String strFechaFin) {
		this.strFechaFin = strFechaFin;
	}
	public String getStrDcto() {
		return strDcto;
	}
	public void setStrDcto(String strDcto) {
		this.strDcto = strDcto;
	}
	public String getStrLey() {
		return strLey;
	}
	public void setStrLey(String strLey) {
		this.strLey = strLey;
	}
	public Double getDblLongitud() {
		return dblLongitud;
	}
	public void setDblLongitud(Double dblLongitud) {
		this.dblLongitud = dblLongitud;
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
