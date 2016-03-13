package wcmc.hef.business.core.capa.dto;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class TemComunidadesNativasDto implements BaseBeanVectorialDto {
	private Integer srlGid;
	private String strTheGeom;
	private Integer intObjectid1;
	private String strGmlId;
	private Integer intObjectid;
	private String strCodigo;
	private String strCodBib;
	private String strGeorefer;
	private String strSituacion;
	private String strSector;
	private String strZona;
	private String strSubzona;
	private String strNombre;
	private String strFederacion;
	private String strFamLingui;
	private String strEtnia1;
	private String strEtnia2;
	private Double dblPoblacion;
	private Double dblFamilias;
	private Double dblEscolares;
	private String strRio;
	private String strPuebCerc;
	private String strDpto;
	private String strProvincia;
	private String strDistrito;
	private String strLongitud;
	private String strLatitud;
	private String strResolIn;
	private String strAnoinscrip;
	private String strTitulo;
	private String strResolTit;
	private String strAnotitulo;
	private Double dblAreaTotal;
	private Double dblAreaTitul;
	private Double dblAreaUso;
	private Double dblAreaFisc;
	private Double dblAreaProte;
	private Double dblAreaReser;
	private Double dblAreaDemar;
	private Double dblAreaSig;
	private Double dblPerimTitu;
	private String strResolAm1;
	private String strTituloAm1;
	private Double dblArTotAm1;
	private Double dblArSigAm1;
	private Double dblPerimAm1;
	private String strResolAm2;
	private String strTituloAm2;
	private Double dblArTotAm2;
	private Double dblArSigAm2;
	private Double dblPerimAm2;
	private String strPrimaria;
	private String strBilingue;
	private String strSecundaria;
	private String strPuesSalud;
	private String strCentSalud;
	private String strProdVent1;
	private String strProdVent2;
	private String strProdVent3;
	private String strFuente;
	private String strFecha;
	private String strNotas;
	private Double dblShapeStar;
	private Double dblShapeStle;
	public Integer getSrlGid() {
		return srlGid;
	}
	public void setSrlGid(Integer srlGid) {
		this.srlGid = srlGid;
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
	public String getStrGmlId() {
		return strGmlId;
	}
	public void setStrGmlId(String strGmlId) {
		this.strGmlId = strGmlId;
	}
	public Integer getIntObjectid() {
		return intObjectid;
	}
	public void setIntObjectid(Integer intObjectid) {
		this.intObjectid = intObjectid;
	}
	public String getStrCodigo() {
		return strCodigo;
	}
	public void setStrCodigo(String strCodigo) {
		this.strCodigo = strCodigo;
	}
	public String getStrCodBib() {
		return strCodBib;
	}
	public void setStrCodBib(String strCodBib) {
		this.strCodBib = strCodBib;
	}
	public String getStrGeorefer() {
		return strGeorefer;
	}
	public void setStrGeorefer(String strGeorefer) {
		this.strGeorefer = strGeorefer;
	}
	public String getStrSituacion() {
		return strSituacion;
	}
	public void setStrSituacion(String strSituacion) {
		this.strSituacion = strSituacion;
	}
	public String getStrSector() {
		return strSector;
	}
	public void setStrSector(String strSector) {
		this.strSector = strSector;
	}
	public String getStrZona() {
		return strZona;
	}
	public void setStrZona(String strZona) {
		this.strZona = strZona;
	}
	public String getStrSubzona() {
		return strSubzona;
	}
	public void setStrSubzona(String strSubzona) {
		this.strSubzona = strSubzona;
	}
	public String getStrNombre() {
		return strNombre;
	}
	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}
	public String getStrFederacion() {
		return strFederacion;
	}
	public void setStrFederacion(String strFederacion) {
		this.strFederacion = strFederacion;
	}
	public String getStrFamLingui() {
		return strFamLingui;
	}
	public void setStrFamLingui(String strFamLingui) {
		this.strFamLingui = strFamLingui;
	}
	public String getStrEtnia1() {
		return strEtnia1;
	}
	public void setStrEtnia1(String strEtnia1) {
		this.strEtnia1 = strEtnia1;
	}
	public String getStrEtnia2() {
		return strEtnia2;
	}
	public void setStrEtnia2(String strEtnia2) {
		this.strEtnia2 = strEtnia2;
	}
	public Double getDblPoblacion() {
		return dblPoblacion;
	}
	public void setDblPoblacion(Double dblPoblacion) {
		this.dblPoblacion = dblPoblacion;
	}
	public Double getDblFamilias() {
		return dblFamilias;
	}
	public void setDblFamilias(Double dblFamilias) {
		this.dblFamilias = dblFamilias;
	}
	public Double getDblEscolares() {
		return dblEscolares;
	}
	public void setDblEscolares(Double dblEscolares) {
		this.dblEscolares = dblEscolares;
	}
	public String getStrRio() {
		return strRio;
	}
	public void setStrRio(String strRio) {
		this.strRio = strRio;
	}
	public String getStrPuebCerc() {
		return strPuebCerc;
	}
	public void setStrPuebCerc(String strPuebCerc) {
		this.strPuebCerc = strPuebCerc;
	}
	public String getStrDpto() {
		return strDpto;
	}
	public void setStrDpto(String strDpto) {
		this.strDpto = strDpto;
	}
	public String getStrProvincia() {
		return strProvincia;
	}
	public void setStrProvincia(String strProvincia) {
		this.strProvincia = strProvincia;
	}
	public String getStrDistrito() {
		return strDistrito;
	}
	public void setStrDistrito(String strDistrito) {
		this.strDistrito = strDistrito;
	}
	public String getStrLongitud() {
		return strLongitud;
	}
	public void setStrLongitud(String strLongitud) {
		this.strLongitud = strLongitud;
	}
	public String getStrLatitud() {
		return strLatitud;
	}
	public void setStrLatitud(String strLatitud) {
		this.strLatitud = strLatitud;
	}
	public String getStrResolIn() {
		return strResolIn;
	}
	public void setStrResolIn(String strResolIn) {
		this.strResolIn = strResolIn;
	}
	public String getStrAnoinscrip() {
		return strAnoinscrip;
	}
	public void setStrAnoinscrip(String strAnoinscrip) {
		this.strAnoinscrip = strAnoinscrip;
	}
	public String getStrTitulo() {
		return strTitulo;
	}
	public void setStrTitulo(String strTitulo) {
		this.strTitulo = strTitulo;
	}
	public String getStrResolTit() {
		return strResolTit;
	}
	public void setStrResolTit(String strResolTit) {
		this.strResolTit = strResolTit;
	}
	public String getStrAnotitulo() {
		return strAnotitulo;
	}
	public void setStrAnotitulo(String strAnotitulo) {
		this.strAnotitulo = strAnotitulo;
	}
	public Double getDblAreaTotal() {
		return dblAreaTotal;
	}
	public void setDblAreaTotal(Double dblAreaTotal) {
		this.dblAreaTotal = dblAreaTotal;
	}
	public Double getDblAreaTitul() {
		return dblAreaTitul;
	}
	public void setDblAreaTitul(Double dblAreaTitul) {
		this.dblAreaTitul = dblAreaTitul;
	}
	public Double getDblAreaUso() {
		return dblAreaUso;
	}
	public void setDblAreaUso(Double dblAreaUso) {
		this.dblAreaUso = dblAreaUso;
	}
	public Double getDblAreaFisc() {
		return dblAreaFisc;
	}
	public void setDblAreaFisc(Double dblAreaFisc) {
		this.dblAreaFisc = dblAreaFisc;
	}
	public Double getDblAreaProte() {
		return dblAreaProte;
	}
	public void setDblAreaProte(Double dblAreaProte) {
		this.dblAreaProte = dblAreaProte;
	}
	public Double getDblAreaReser() {
		return dblAreaReser;
	}
	public void setDblAreaReser(Double dblAreaReser) {
		this.dblAreaReser = dblAreaReser;
	}
	public Double getDblAreaDemar() {
		return dblAreaDemar;
	}
	public void setDblAreaDemar(Double dblAreaDemar) {
		this.dblAreaDemar = dblAreaDemar;
	}
	public Double getDblAreaSig() {
		return dblAreaSig;
	}
	public void setDblAreaSig(Double dblAreaSig) {
		this.dblAreaSig = dblAreaSig;
	}
	public Double getDblPerimTitu() {
		return dblPerimTitu;
	}
	public void setDblPerimTitu(Double dblPerimTitu) {
		this.dblPerimTitu = dblPerimTitu;
	}
	public String getStrResolAm1() {
		return strResolAm1;
	}
	public void setStrResolAm1(String strResolAm1) {
		this.strResolAm1 = strResolAm1;
	}
	public String getStrTituloAm1() {
		return strTituloAm1;
	}
	public void setStrTituloAm1(String strTituloAm1) {
		this.strTituloAm1 = strTituloAm1;
	}
	public Double getDblArTotAm1() {
		return dblArTotAm1;
	}
	public void setDblArTotAm1(Double dblArTotAm1) {
		this.dblArTotAm1 = dblArTotAm1;
	}
	public Double getDblArSigAm1() {
		return dblArSigAm1;
	}
	public void setDblArSigAm1(Double dblArSigAm1) {
		this.dblArSigAm1 = dblArSigAm1;
	}
	public Double getDblPerimAm1() {
		return dblPerimAm1;
	}
	public void setDblPerimAm1(Double dblPerimAm1) {
		this.dblPerimAm1 = dblPerimAm1;
	}
	public String getStrResolAm2() {
		return strResolAm2;
	}
	public void setStrResolAm2(String strResolAm2) {
		this.strResolAm2 = strResolAm2;
	}
	public String getStrTituloAm2() {
		return strTituloAm2;
	}
	public void setStrTituloAm2(String strTituloAm2) {
		this.strTituloAm2 = strTituloAm2;
	}
	public Double getDblArTotAm2() {
		return dblArTotAm2;
	}
	public void setDblArTotAm2(Double dblArTotAm2) {
		this.dblArTotAm2 = dblArTotAm2;
	}
	public Double getDblArSigAm2() {
		return dblArSigAm2;
	}
	public void setDblArSigAm2(Double dblArSigAm2) {
		this.dblArSigAm2 = dblArSigAm2;
	}
	public Double getDblPerimAm2() {
		return dblPerimAm2;
	}
	public void setDblPerimAm2(Double dblPerimAm2) {
		this.dblPerimAm2 = dblPerimAm2;
	}
	public String getStrPrimaria() {
		return strPrimaria;
	}
	public void setStrPrimaria(String strPrimaria) {
		this.strPrimaria = strPrimaria;
	}
	public String getStrBilingue() {
		return strBilingue;
	}
	public void setStrBilingue(String strBilingue) {
		this.strBilingue = strBilingue;
	}
	public String getStrSecundaria() {
		return strSecundaria;
	}
	public void setStrSecundaria(String strSecundaria) {
		this.strSecundaria = strSecundaria;
	}
	public String getStrPuesSalud() {
		return strPuesSalud;
	}
	public void setStrPuesSalud(String strPuesSalud) {
		this.strPuesSalud = strPuesSalud;
	}
	public String getStrCentSalud() {
		return strCentSalud;
	}
	public void setStrCentSalud(String strCentSalud) {
		this.strCentSalud = strCentSalud;
	}
	public String getStrProdVent1() {
		return strProdVent1;
	}
	public void setStrProdVent1(String strProdVent1) {
		this.strProdVent1 = strProdVent1;
	}
	public String getStrProdVent2() {
		return strProdVent2;
	}
	public void setStrProdVent2(String strProdVent2) {
		this.strProdVent2 = strProdVent2;
	}
	public String getStrProdVent3() {
		return strProdVent3;
	}
	public void setStrProdVent3(String strProdVent3) {
		this.strProdVent3 = strProdVent3;
	}
	public String getStrFuente() {
		return strFuente;
	}
	public void setStrFuente(String strFuente) {
		this.strFuente = strFuente;
	}
	public String getStrFecha() {
		return strFecha;
	}
	public void setStrFecha(String strFecha) {
		this.strFecha = strFecha;
	}
	public String getStrNotas() {
		return strNotas;
	}
	public void setStrNotas(String strNotas) {
		this.strNotas = strNotas;
	}
	public Double getDblShapeStar() {
		return dblShapeStar;
	}
	public void setDblShapeStar(Double dblShapeStar) {
		this.dblShapeStar = dblShapeStar;
	}
	public Double getDblShapeStle() {
		return dblShapeStle;
	}
	public void setDblShapeStle(Double dblShapeStle) {
		this.dblShapeStle = dblShapeStle;
	}
	
}
