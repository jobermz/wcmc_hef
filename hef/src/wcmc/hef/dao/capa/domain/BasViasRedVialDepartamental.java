package wcmc.hef.dao.capa.domain;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class BasViasRedVialDepartamental extends BasViasRedVialDepartamentalKey implements BaseBeanVectorial {
	
	private String strTheGeom;
	private Double dblLongitud;
	private String strDpto;
	private String strRutaD044;
	private String strRed044;
	private String strSupercicie;
	private String timFechaRegistroFecha;
	private String timFechaRegistroHora;
	
	public String getTimFechaRegistroFecha() {
		return timFechaRegistroFecha;
	}
	public void setTimFechaRegistroFecha(String timFechaRegistroFecha) {
		this.timFechaRegistroFecha = timFechaRegistroFecha;
	}
	public String getTimFechaRegistroHora() {
		return timFechaRegistroHora;
	}
	public void setTimFechaRegistroHora(String timFechaRegistroHora) {
		this.timFechaRegistroHora = timFechaRegistroHora;
	}
	public String getTimFechaRegistroFechaHora() {
		return timFechaRegistroFecha + " " + timFechaRegistroHora;
	}
	public void setLngFechaRegistro(Long lngfechaRegistro) {
		timFechaRegistroFecha = CadenaUtil.getStrDate(new Date(lngfechaRegistro));
		timFechaRegistroHora	= CadenaUtil.getStrHoraMinutos(new Date(lngfechaRegistro));
	}
	public String getStrTheGeom() {
		return strTheGeom;
	}
	public void setStrTheGeom(String strTheGeom) {
		this.strTheGeom = strTheGeom;
	}
	public Double getDblLongitud() {
		return dblLongitud;
	}
	public void setDblLongitud(Double dblLongitud) {
		this.dblLongitud = dblLongitud;
	}
	public String getStrDpto() {
		return strDpto;
	}
	public void setStrDpto(String strDpto) {
		this.strDpto = strDpto;
	}
	public String getStrRutaD044() {
		return strRutaD044;
	}
	public void setStrRutaD044(String strRutaD044) {
		this.strRutaD044 = strRutaD044;
	}
	public String getStrRed044() {
		return strRed044;
	}
	public void setStrRed044(String strRed044) {
		this.strRed044 = strRed044;
	}
	public String getStrSupercicie() {
		return strSupercicie;
	}
	public void setStrSupercicie(String strSupercicie) {
		this.strSupercicie = strSupercicie;
	}
	public Date getTimFechaRegistro() {
		return CadenaUtil.getDateHoraMinutosFromStr(this.timFechaRegistroFecha + " " + this.timFechaRegistroHora);
	}
	public void setTimFechaRegistro(Date timFechaRegistro) {
		this.timFechaRegistroFecha = CadenaUtil.getStrDate(timFechaRegistro);
		this.timFechaRegistroHora = CadenaUtil.getStrHoraMinutos(timFechaRegistro);
	}
	
}
