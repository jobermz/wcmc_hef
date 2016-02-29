package wcmc.hef.dao.capa.domain;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class KbaIbaPeru extends KbaIbaPeruKey {
	
	private String strTheGeom;
	private Integer intObjectid1;
	private Integer intObjectid;
	private Integer intSitrecid;
	private String strRegion;
	private String strCountry;
	private String strIso3;
	private String strNatname;
	private String strIntname;
	private String strFincode;
	private Double dblSitlat;
	private Double dblSitlong;
	private Integer intSitarea;
	private String strProtect;
	private Integer intNumPas;
	private String strIbastatus;
	private String strKbastatus;
	private String strAzestatus;
	private String strCreatedby;
	private String strAddedby;
	private Date dteAddeddate;
	private String strChangeby;
	private Date dteChangedate;
	private String strSource;
	private String strDeltxt;
	private String strDelgeom;
	private String strMarineiba;
	private Double dblShapeLeng;
	private Double dblShapeLe1;
	private Double dblShapeArea;
	private String timFechaRegistroFecha;
	private String timFechaRegistroHora;
	
	public String getDteAddeddateFecha() {
		return CadenaUtil.getStrDate(dteAddeddate);
	}
	public void setDteAddeddateFecha(String dteAddeddate) {
		this.dteAddeddate = CadenaUtil.getDateFromStr(dteAddeddate);
	}
	public String getDteChangedateFecha() {
		return CadenaUtil.getStrDate(dteChangedate);
	}
	public void setDteChangedateFecha(String dteChangedate) {
		this.dteChangedate = CadenaUtil.getDateFromStr(dteChangedate);
	}
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
	public Integer getIntObjectid1() {
		return intObjectid1;
	}
	public void setIntObjectid1(Integer intObjectid1) {
		this.intObjectid1 = intObjectid1;
	}
	public Integer getIntObjectid() {
		return intObjectid;
	}
	public void setIntObjectid(Integer intObjectid) {
		this.intObjectid = intObjectid;
	}
	public Integer getIntSitrecid() {
		return intSitrecid;
	}
	public void setIntSitrecid(Integer intSitrecid) {
		this.intSitrecid = intSitrecid;
	}
	public String getStrRegion() {
		return strRegion;
	}
	public void setStrRegion(String strRegion) {
		this.strRegion = strRegion;
	}
	public String getStrCountry() {
		return strCountry;
	}
	public void setStrCountry(String strCountry) {
		this.strCountry = strCountry;
	}
	public String getStrIso3() {
		return strIso3;
	}
	public void setStrIso3(String strIso3) {
		this.strIso3 = strIso3;
	}
	public String getStrNatname() {
		return strNatname;
	}
	public void setStrNatname(String strNatname) {
		this.strNatname = strNatname;
	}
	public String getStrIntname() {
		return strIntname;
	}
	public void setStrIntname(String strIntname) {
		this.strIntname = strIntname;
	}
	public String getStrFincode() {
		return strFincode;
	}
	public void setStrFincode(String strFincode) {
		this.strFincode = strFincode;
	}
	public Double getDblSitlat() {
		return dblSitlat;
	}
	public void setDblSitlat(Double dblSitlat) {
		this.dblSitlat = dblSitlat;
	}
	public Double getDblSitlong() {
		return dblSitlong;
	}
	public void setDblSitlong(Double dblSitlong) {
		this.dblSitlong = dblSitlong;
	}
	public Integer getIntSitarea() {
		return intSitarea;
	}
	public void setIntSitarea(Integer intSitarea) {
		this.intSitarea = intSitarea;
	}
	public String getStrProtect() {
		return strProtect;
	}
	public void setStrProtect(String strProtect) {
		this.strProtect = strProtect;
	}
	public Integer getIntNumPas() {
		return intNumPas;
	}
	public void setIntNumPas(Integer intNumPas) {
		this.intNumPas = intNumPas;
	}
	public String getStrIbastatus() {
		return strIbastatus;
	}
	public void setStrIbastatus(String strIbastatus) {
		this.strIbastatus = strIbastatus;
	}
	public String getStrKbastatus() {
		return strKbastatus;
	}
	public void setStrKbastatus(String strKbastatus) {
		this.strKbastatus = strKbastatus;
	}
	public String getStrAzestatus() {
		return strAzestatus;
	}
	public void setStrAzestatus(String strAzestatus) {
		this.strAzestatus = strAzestatus;
	}
	public String getStrCreatedby() {
		return strCreatedby;
	}
	public void setStrCreatedby(String strCreatedby) {
		this.strCreatedby = strCreatedby;
	}
	public String getStrAddedby() {
		return strAddedby;
	}
	public void setStrAddedby(String strAddedby) {
		this.strAddedby = strAddedby;
	}
	public Date getDteAddeddate() {
		return dteAddeddate;
	}
	public void setDteAddeddate(Date dteAddeddate) {
		this.dteAddeddate = dteAddeddate;
	}
	public String getStrChangeby() {
		return strChangeby;
	}
	public void setStrChangeby(String strChangeby) {
		this.strChangeby = strChangeby;
	}
	public Date getDteChangedate() {
		return dteChangedate;
	}
	public void setDteChangedate(Date dteChangedate) {
		this.dteChangedate = dteChangedate;
	}
	public String getStrSource() {
		return strSource;
	}
	public void setStrSource(String strSource) {
		this.strSource = strSource;
	}
	public String getStrDeltxt() {
		return strDeltxt;
	}
	public void setStrDeltxt(String strDeltxt) {
		this.strDeltxt = strDeltxt;
	}
	public String getStrDelgeom() {
		return strDelgeom;
	}
	public void setStrDelgeom(String strDelgeom) {
		this.strDelgeom = strDelgeom;
	}
	public String getStrMarineiba() {
		return strMarineiba;
	}
	public void setStrMarineiba(String strMarineiba) {
		this.strMarineiba = strMarineiba;
	}
	public Double getDblShapeLeng() {
		return dblShapeLeng;
	}
	public void setDblShapeLeng(Double dblShapeLeng) {
		this.dblShapeLeng = dblShapeLeng;
	}
	public Double getDblShapeLe1() {
		return dblShapeLe1;
	}
	public void setDblShapeLe1(Double dblShapeLe1) {
		this.dblShapeLe1 = dblShapeLe1;
	}
	public Double getDblShapeArea() {
		return dblShapeArea;
	}
	public void setDblShapeArea(Double dblShapeArea) {
		this.dblShapeArea = dblShapeArea;
	}
	public Date getTimFechaRegistro() {
		return CadenaUtil.getDateHoraMinutosFromStr(this.timFechaRegistroFecha + " " + this.timFechaRegistroHora);
	}
	public void setTimFechaRegistro(Date timFechaRegistro) {
		this.timFechaRegistroFecha = CadenaUtil.getStrDate(timFechaRegistro);
		this.timFechaRegistroHora = CadenaUtil.getStrHoraMinutos(timFechaRegistro);
	}
	
}
