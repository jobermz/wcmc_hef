package wcmc.hef.dao.capa.domain;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class ProyectosPuntos extends ProyectosPuntosKey {
	
	private String strTheGeom;
	private String strNombre;
	private String strIniciativa;
	private String strReferencia;
	private String strRegionGeo;
	private String strDetalleDe;
	private String strOtros;
	private String strFechaInic;
	private String strFechaTerm;
	private String strResultados;
	private String strCooperante;
	private String strAdministra;
	private Double dblUsd;
	private String strInstitucio;
	private String strPersonaCo;
	private String strCargo;
	private String strContacto;
	private String strDireccion;
	private String strInstituc1;
	private String strLink;
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
	public String getStrNombre() {
		return strNombre;
	}
	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}
	public String getStrIniciativa() {
		return strIniciativa;
	}
	public void setStrIniciativa(String strIniciativa) {
		this.strIniciativa = strIniciativa;
	}
	public String getStrReferencia() {
		return strReferencia;
	}
	public void setStrReferencia(String strReferencia) {
		this.strReferencia = strReferencia;
	}
	public String getStrRegionGeo() {
		return strRegionGeo;
	}
	public void setStrRegionGeo(String strRegionGeo) {
		this.strRegionGeo = strRegionGeo;
	}
	public String getStrDetalleDe() {
		return strDetalleDe;
	}
	public void setStrDetalleDe(String strDetalleDe) {
		this.strDetalleDe = strDetalleDe;
	}
	public String getStrOtros() {
		return strOtros;
	}
	public void setStrOtros(String strOtros) {
		this.strOtros = strOtros;
	}
	public String getStrFechaInic() {
		return strFechaInic;
	}
	public void setStrFechaInic(String strFechaInic) {
		this.strFechaInic = strFechaInic;
	}
	public String getStrFechaTerm() {
		return strFechaTerm;
	}
	public void setStrFechaTerm(String strFechaTerm) {
		this.strFechaTerm = strFechaTerm;
	}
	public String getStrResultados() {
		return strResultados;
	}
	public void setStrResultados(String strResultados) {
		this.strResultados = strResultados;
	}
	public String getStrCooperante() {
		return strCooperante;
	}
	public void setStrCooperante(String strCooperante) {
		this.strCooperante = strCooperante;
	}
	public String getStrAdministra() {
		return strAdministra;
	}
	public void setStrAdministra(String strAdministra) {
		this.strAdministra = strAdministra;
	}
	public Double getDblUsd() {
		return dblUsd;
	}
	public void setDblUsd(Double dblUsd) {
		this.dblUsd = dblUsd;
	}
	public String getStrInstitucio() {
		return strInstitucio;
	}
	public void setStrInstitucio(String strInstitucio) {
		this.strInstitucio = strInstitucio;
	}
	public String getStrPersonaCo() {
		return strPersonaCo;
	}
	public void setStrPersonaCo(String strPersonaCo) {
		this.strPersonaCo = strPersonaCo;
	}
	public String getStrCargo() {
		return strCargo;
	}
	public void setStrCargo(String strCargo) {
		this.strCargo = strCargo;
	}
	public String getStrContacto() {
		return strContacto;
	}
	public void setStrContacto(String strContacto) {
		this.strContacto = strContacto;
	}
	public String getStrDireccion() {
		return strDireccion;
	}
	public void setStrDireccion(String strDireccion) {
		this.strDireccion = strDireccion;
	}
	public String getStrInstituc1() {
		return strInstituc1;
	}
	public void setStrInstituc1(String strInstituc1) {
		this.strInstituc1 = strInstituc1;
	}
	public String getStrLink() {
		return strLink;
	}
	public void setStrLink(String strLink) {
		this.strLink = strLink;
	}
	public Date getTimFechaRegistro() {
		return CadenaUtil.getDateHoraMinutosFromStr(this.timFechaRegistroFecha + " " + this.timFechaRegistroHora);
	}
	public void setTimFechaRegistro(Date timFechaRegistro) {
		this.timFechaRegistroFecha = CadenaUtil.getStrDate(timFechaRegistro);
		this.timFechaRegistroHora = CadenaUtil.getStrHoraMinutos(timFechaRegistro);
	}
	
}
