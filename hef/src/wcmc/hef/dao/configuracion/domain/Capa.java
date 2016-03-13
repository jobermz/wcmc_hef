package wcmc.hef.dao.configuracion.domain;

import java.util.Date;
import java.util.List;

import wcmc.hef.general.util.CadenaUtil;

public class Capa extends CapaKey {
	
	private String intGrupoCapasDesc;
	private Integer intGrupoCapas;
	private String intTipoCapaDesc;
	private Integer intTipoCapa;
	private String strNombre;
	private String strComentarios;
	private String strAutor;
	private String strUrl;
	private String strWmsUrl;
	private String strWmsCapas;
	private String strWfsUrl;
	private String timFechaRegistroFecha;
	private String timFechaRegistroHora;
	private Integer intOrden;
	private String strEsSelecApa;
	private String strEsFiltroAcl;
	private String strEsCentrarMapa;
	
	private List<CapaUmbral> listCapaUmbral;
	public String getIntGrupoCapasDesc() {
		return intGrupoCapasDesc;
	}
	public void setIntGrupoCapasDesc(String intGrupoCapasDesc) {
		this.intGrupoCapasDesc = intGrupoCapasDesc;
	}
	public String getIntTipoCapaDesc() {
		return intTipoCapaDesc;
	}
	public void setIntTipoCapaDesc(String intTipoCapaDesc) {
		this.intTipoCapaDesc = intTipoCapaDesc;
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
	public Integer getIntGrupoCapas() {
		return intGrupoCapas;
	}
	public void setIntGrupoCapas(Integer intGrupoCapas) {
		this.intGrupoCapas = intGrupoCapas;
	}
	public Integer getIntTipoCapa() {
		return intTipoCapa;
	}
	public void setIntTipoCapa(Integer intTipoCapa) {
		this.intTipoCapa = intTipoCapa;
	}
	public String getStrNombre() {
		return strNombre;
	}
	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}
	public String getStrComentarios() {
		return strComentarios;
	}
	public void setStrComentarios(String strComentarios) {
		this.strComentarios = strComentarios;
	}
	public String getStrUrl() {
		return strUrl;
	}
	public void setStrUrl(String strUrl) {
		this.strUrl = strUrl;
	}
	public String getStrWmsUrl() {
		return strWmsUrl;
	}
	public void setStrWmsUrl(String strWmsUrl) {
		this.strWmsUrl = strWmsUrl;
	}
	public String getStrWmsCapas() {
		return strWmsCapas;
	}
	public void setStrWmsCapas(String strWmsCapas) {
		this.strWmsCapas = strWmsCapas;
	}
	public String getStrWfsUrl() {
		return strWfsUrl;
	}
	public void setStrWfsUrl(String strWfsUrl) {
		this.strWfsUrl = strWfsUrl;
	}
	public Date getTimFechaRegistro() {
		return CadenaUtil.getDateHoraMinutosFromStr(this.timFechaRegistroFecha + " " + this.timFechaRegistroHora);
	}
	public void setTimFechaRegistro(Date timFechaRegistro) {
		this.timFechaRegistroFecha = CadenaUtil.getStrDate(timFechaRegistro);
		this.timFechaRegistroHora = CadenaUtil.getStrHoraMinutos(timFechaRegistro);
	}
	public List<CapaUmbral> getListCapaUmbral() {
		return listCapaUmbral;
	}
	public void setListCapaUmbral(List<CapaUmbral> listCapaUmbral) {
		this.listCapaUmbral = listCapaUmbral;
	}
	public Integer getIntOrden() {
		return intOrden;
	}
	public void setIntOrden(Integer intOrden) {
		this.intOrden = intOrden;
	}
	public String getStrAutor() {
		return strAutor;
	}
	public void setStrAutor(String strAutor) {
		this.strAutor = strAutor;
	}
	
	public String getStrEsSelecApa() {
		return strEsSelecApa;
	}
	public void setStrEsSelecApa(String strEsSelecApa) {
		this.strEsSelecApa = strEsSelecApa;
	}
	public boolean getStrEsSelecApaBoolean() {
		return CadenaUtil.getStr(strEsSelecApa).equalsIgnoreCase("S");
	}
	public void getStrEsSelecApaBoolean(boolean val) {
		if(val) {
			strEsSelecApa	= "S";
		} else {
			strEsSelecApa	= "N";
		}
	}
	
	public String getStrEsFiltroAcl() {
		return strEsFiltroAcl;
	}
	public void setStrEsFiltroAcl(String strEsFiltroAcl) {
		this.strEsFiltroAcl = strEsFiltroAcl;
	}
	public boolean getStrEsFiltroAclBoolean() {
		return CadenaUtil.getStr(strEsFiltroAcl).equalsIgnoreCase("S");
	}
	public void setStrEsFiltroAclBoolean(boolean val) {
		if(val) {
			strEsFiltroAcl	= "S";
		} else {
			strEsFiltroAcl	= "N";
		}
	}
	
	public String getStrEsCentrarMapa() {
		return strEsCentrarMapa;
	}
	public void setStrEsCentrarMapa(String strEsCentrarMapa) {
		this.strEsCentrarMapa = strEsCentrarMapa;
	}
	public boolean getStrEsCentrarMapaBoolean() {
		return CadenaUtil.getStr(strEsCentrarMapa).equalsIgnoreCase("S");
	}
	public void setStrEsCentrarMapaBoolean(boolean val) {
		if(val) {
			strEsCentrarMapa	= "S";
		} else {
			strEsCentrarMapa	= "N";
		}
	}
	
}
