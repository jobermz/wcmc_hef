package wcmc.hef.business.core.capa.dto;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class TemViasTrochasDto implements BaseBeanVectorialDto {
	private Integer srlGid;
	private String strTheGeom;
	private Long lngObjectid;
	private String strEstado;
	private String strDescrip;
	private Double dblShapeLeng;
	private Double dblStLength;
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
	public Long getLngObjectid() {
		return lngObjectid;
	}
	public void setLngObjectid(Long lngObjectid) {
		this.lngObjectid = lngObjectid;
	}
	public String getStrEstado() {
		return strEstado;
	}
	public void setStrEstado(String strEstado) {
		this.strEstado = strEstado;
	}
	public String getStrDescrip() {
		return strDescrip;
	}
	public void setStrDescrip(String strDescrip) {
		this.strDescrip = strDescrip;
	}
	public Double getDblShapeLeng() {
		return dblShapeLeng;
	}
	public void setDblShapeLeng(Double dblShapeLeng) {
		this.dblShapeLeng = dblShapeLeng;
	}
	public Double getDblStLength() {
		return dblStLength;
	}
	public void setDblStLength(Double dblStLength) {
		this.dblStLength = dblStLength;
	}
	public Date getTimFechaRegistro() {
		return CadenaUtil.getDateHoraMinutosFromStr(this.timFechaRegistroFecha + " " + this.timFechaRegistroHora);
	}
	public void setTimFechaRegistro(Date timFechaRegistro) {
		this.timFechaRegistroFecha = CadenaUtil.getStrDate(timFechaRegistro);
		this.timFechaRegistroHora = CadenaUtil.getStrHoraMinutos(timFechaRegistro);
	}
	
}
