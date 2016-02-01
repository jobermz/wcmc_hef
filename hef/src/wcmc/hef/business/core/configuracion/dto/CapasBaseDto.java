package wcmc.hef.business.core.configuracion.dto;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class CapasBaseDto {
	private Integer srlIdCapasBase;
	private String strNombre;
	private String strComentarios;
	private String strUrl;
	private String timFechaRegistroFecha;
	private String timFechaRegistroHora;
	private String strWmsUrl;
	private String strWmsCapas;
	private String strWfsUrl;
	private String intGrupoCapasDesc;
	private Integer intGrupoCapas;
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
	public String getIntGrupoCapasDesc() {
		return intGrupoCapasDesc;
	}
	public void setIntGrupoCapasDesc(String intGrupoCapasDesc) {
		this.intGrupoCapasDesc = intGrupoCapasDesc;
	}
	public Integer getSrlIdCapasBase() {
		return srlIdCapasBase;
	}
	public void setSrlIdCapasBase(Integer srlIdCapasBase) {
		this.srlIdCapasBase = srlIdCapasBase;
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
	public Date getTimFechaRegistro() {
		return CadenaUtil.getDateHoraMinutosFromStr(this.timFechaRegistroFecha + " " + this.timFechaRegistroHora);
	}
	public void setTimFechaRegistro(Date timFechaRegistro) {
		this.timFechaRegistroFecha = CadenaUtil.getStrDate(timFechaRegistro);
		this.timFechaRegistroHora = CadenaUtil.getStrHoraMinutos(timFechaRegistro);
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
	public Integer getIntGrupoCapas() {
		return intGrupoCapas;
	}
	public void setIntGrupoCapas(Integer intGrupoCapas) {
		this.intGrupoCapas = intGrupoCapas;
	}
	
}
