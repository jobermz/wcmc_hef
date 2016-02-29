package wcmc.hef.dao.capa.domain;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class Ccpp10Utm extends Ccpp10UtmKey {
	
	private String strTheGeom;
	private Integer intObjectid;
	private String strIdccpp10;
	private String strArea;
	private String strCodccpp;
	private String strNomccpp;
	private String strUbigeo;
	private String strCcdi;
	private String strCcpp;
	private String strCcdd;
	private String strCatccpp;
	private String strNomcat;
	private Integer intAltitud;
	private String strLongitudx;
	private String strLatitudy;
	private Integer intViv07;
	private Integer intPob07;
	private Integer intRegion;
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
	public Integer getIntObjectid() {
		return intObjectid;
	}
	public void setIntObjectid(Integer intObjectid) {
		this.intObjectid = intObjectid;
	}
	public String getStrIdccpp10() {
		return strIdccpp10;
	}
	public void setStrIdccpp10(String strIdccpp10) {
		this.strIdccpp10 = strIdccpp10;
	}
	public String getStrArea() {
		return strArea;
	}
	public void setStrArea(String strArea) {
		this.strArea = strArea;
	}
	public String getStrCodccpp() {
		return strCodccpp;
	}
	public void setStrCodccpp(String strCodccpp) {
		this.strCodccpp = strCodccpp;
	}
	public String getStrNomccpp() {
		return strNomccpp;
	}
	public void setStrNomccpp(String strNomccpp) {
		this.strNomccpp = strNomccpp;
	}
	public String getStrUbigeo() {
		return strUbigeo;
	}
	public void setStrUbigeo(String strUbigeo) {
		this.strUbigeo = strUbigeo;
	}
	public String getStrCcdi() {
		return strCcdi;
	}
	public void setStrCcdi(String strCcdi) {
		this.strCcdi = strCcdi;
	}
	public String getStrCcpp() {
		return strCcpp;
	}
	public void setStrCcpp(String strCcpp) {
		this.strCcpp = strCcpp;
	}
	public String getStrCcdd() {
		return strCcdd;
	}
	public void setStrCcdd(String strCcdd) {
		this.strCcdd = strCcdd;
	}
	public String getStrCatccpp() {
		return strCatccpp;
	}
	public void setStrCatccpp(String strCatccpp) {
		this.strCatccpp = strCatccpp;
	}
	public String getStrNomcat() {
		return strNomcat;
	}
	public void setStrNomcat(String strNomcat) {
		this.strNomcat = strNomcat;
	}
	public Integer getIntAltitud() {
		return intAltitud;
	}
	public void setIntAltitud(Integer intAltitud) {
		this.intAltitud = intAltitud;
	}
	public String getStrLongitudx() {
		return strLongitudx;
	}
	public void setStrLongitudx(String strLongitudx) {
		this.strLongitudx = strLongitudx;
	}
	public String getStrLatitudy() {
		return strLatitudy;
	}
	public void setStrLatitudy(String strLatitudy) {
		this.strLatitudy = strLatitudy;
	}
	public Integer getIntViv07() {
		return intViv07;
	}
	public void setIntViv07(Integer intViv07) {
		this.intViv07 = intViv07;
	}
	public Integer getIntPob07() {
		return intPob07;
	}
	public void setIntPob07(Integer intPob07) {
		this.intPob07 = intPob07;
	}
	public Integer getIntRegion() {
		return intRegion;
	}
	public void setIntRegion(Integer intRegion) {
		this.intRegion = intRegion;
	}
	public Date getTimFechaRegistro() {
		return CadenaUtil.getDateHoraMinutosFromStr(this.timFechaRegistroFecha + " " + this.timFechaRegistroHora);
	}
	public void setTimFechaRegistro(Date timFechaRegistro) {
		this.timFechaRegistroFecha = CadenaUtil.getStrDate(timFechaRegistro);
		this.timFechaRegistroHora = CadenaUtil.getStrHoraMinutos(timFechaRegistro);
	}
	
}
