package wcmc.hef.dao.capa.domain;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class TemConcesionHidroelectricasDistribucion extends TemConcesionHidroelectricasDistribucionKey implements BaseBeanVectorial {
	
    private String strHashConsulta;
	private String strTheGeom;
	private String strIdGrafico;
	private String strExpediente;
	private String strConcesion;
	private String strNombreZon;
	private String strTipoConce;
	private String strEmpresa;
	private String strSistemaEl;
	private Long lngAreaInflu;
	private Double dblMaximaDem;
	private Double dblHorasServ;
	private Long lngNumeroUsu;
	private Date dteFechaPres;
	private Date dteFechaReso;
	private String strActivo;
	private String strCodigoCon;
	private Double dblShapeArea;
	private Double dblShapeLen;

    public void setStrHashConsulta(String strHashConsulta) {
        this.strHashConsulta = strHashConsulta;
    }
    public String getStrHashConsulta() {
        return CadenaUtil.getStr(strHashConsulta);
    }
	public String getDteFechaPresFecha() {
		return CadenaUtil.getStrDate(dteFechaPres);
	}
	public void setDteFechaPresFecha(String dteFechaPres) {
		this.dteFechaPres = CadenaUtil.getDateFromStr(dteFechaPres);
	}
	public String getDteFechaResoFecha() {
		return CadenaUtil.getStrDate(dteFechaReso);
	}
	public void setDteFechaResoFecha(String dteFechaReso) {
		this.dteFechaReso = CadenaUtil.getDateFromStr(dteFechaReso);
	}
	public String getStrTheGeom() {
		return strTheGeom;
	}
	public void setStrTheGeom(String strTheGeom) {
		this.strTheGeom = strTheGeom;
	}
	public String getStrIdGrafico() {
		return strIdGrafico;
	}
	public void setStrIdGrafico(String strIdGrafico) {
		this.strIdGrafico = strIdGrafico;
	}
	public String getStrExpediente() {
		return strExpediente;
	}
	public void setStrExpediente(String strExpediente) {
		this.strExpediente = strExpediente;
	}
	public String getStrConcesion() {
		return strConcesion;
	}
	public void setStrConcesion(String strConcesion) {
		this.strConcesion = strConcesion;
	}
	public String getStrNombreZon() {
		return strNombreZon;
	}
	public void setStrNombreZon(String strNombreZon) {
		this.strNombreZon = strNombreZon;
	}
	public String getStrTipoConce() {
		return strTipoConce;
	}
	public void setStrTipoConce(String strTipoConce) {
		this.strTipoConce = strTipoConce;
	}
	public String getStrEmpresa() {
		return strEmpresa;
	}
	public void setStrEmpresa(String strEmpresa) {
		this.strEmpresa = strEmpresa;
	}
	public String getStrSistemaEl() {
		return strSistemaEl;
	}
	public void setStrSistemaEl(String strSistemaEl) {
		this.strSistemaEl = strSistemaEl;
	}
	public Long getLngAreaInflu() {
		return lngAreaInflu;
	}
	public void setLngAreaInflu(Long lngAreaInflu) {
		this.lngAreaInflu = lngAreaInflu;
	}
	public Double getDblMaximaDem() {
		return dblMaximaDem;
	}
	public void setDblMaximaDem(Double dblMaximaDem) {
		this.dblMaximaDem = dblMaximaDem;
	}
	public Double getDblHorasServ() {
		return dblHorasServ;
	}
	public void setDblHorasServ(Double dblHorasServ) {
		this.dblHorasServ = dblHorasServ;
	}
	public Long getLngNumeroUsu() {
		return lngNumeroUsu;
	}
	public void setLngNumeroUsu(Long lngNumeroUsu) {
		this.lngNumeroUsu = lngNumeroUsu;
	}
	public Date getDteFechaPres() {
		return dteFechaPres;
	}
	public void setDteFechaPres(Date dteFechaPres) {
		this.dteFechaPres = dteFechaPres;
	}
	public Date getDteFechaReso() {
		return dteFechaReso;
	}
	public void setDteFechaReso(Date dteFechaReso) {
		this.dteFechaReso = dteFechaReso;
	}
	public String getStrActivo() {
		return strActivo;
	}
	public void setStrActivo(String strActivo) {
		this.strActivo = strActivo;
	}
	public String getStrCodigoCon() {
		return strCodigoCon;
	}
	public void setStrCodigoCon(String strCodigoCon) {
		this.strCodigoCon = strCodigoCon;
	}
	public Double getDblShapeArea() {
		return dblShapeArea;
	}
	public void setDblShapeArea(Double dblShapeArea) {
		this.dblShapeArea = dblShapeArea;
	}
	public Double getDblShapeLen() {
		return dblShapeLen;
	}
	public void setDblShapeLen(Double dblShapeLen) {
		this.dblShapeLen = dblShapeLen;
	}
	
}
