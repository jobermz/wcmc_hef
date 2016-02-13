package wcmc.hef.dao.configuracion.domain;

import java.util.Date;
import java.util.List;

import wcmc.hef.general.util.CadenaUtil;

public class GrupoCapas extends GrupoCapasKey {
	
	private String strNombre;
	private Integer intOrden;
	private Integer intIdGrupoCapasPadre;
	private List<GrupoCapas> listGrupoCapas;
	
	public String getStrNombre() {
		return strNombre;
	}
	public String getStrNombreNiveles() {
		if(intIdGrupoCapasPadre == null) {
			return ""+strNombre+"";
		} else {
			return "  - "+strNombre;
		}
	}
	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}
	public Integer getIntOrden() {
		return intOrden;
	}
	public void setIntOrden(Integer intOrden) {
		this.intOrden = intOrden;
	}
	public Integer getIntIdGrupoCapasPadre() {
		return intIdGrupoCapasPadre;
	}
	public void setIntIdGrupoCapasPadre(Integer intIdGrupoCapasPadre) {
		this.intIdGrupoCapasPadre = intIdGrupoCapasPadre;
	}
	public List<GrupoCapas> getListGrupoCapas() {
		return listGrupoCapas;
	}
	public void setListGrupoCapas(List<GrupoCapas> listGrupoCapas) {
		this.listGrupoCapas = listGrupoCapas;
	}
	
}
