package wcmc.hef.general.util;

import java.util.ArrayList;
import java.util.List;

public class NodoVO {
	private String strValue;
	private String strNombre;
	private boolean blnCheackBox;
	private List<NodoVO> nodosHijosList;
	public NodoVO() {
		this.blnCheackBox	= true;
		this.nodosHijosList	= new ArrayList<NodoVO>();
	}
	public NodoVO(String strNombre, String strValue, boolean blnCheackBox) {
		this();
		this.strNombre		= strNombre;
		this.strValue		= strValue;
		this.blnCheackBox	= blnCheackBox;
		this.nodosHijosList	= new ArrayList<NodoVO>();
	}
	public NodoVO(boolean blnCheackBox) {
		this.blnCheackBox	= blnCheackBox;
		this.nodosHijosList	= new ArrayList<NodoVO>();
	}
	public String getStrValue() {
		return strValue;
	}
	public void setStrValue(String strValue) {
		this.strValue = strValue;
	}
	public String getStrNombre() {
		return strNombre;
	}
	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}
	public List<NodoVO> getNodosHijosList() {
		return nodosHijosList;
	}
	public void setNodosHijosList(List<NodoVO> nodosHijosList) {
		this.nodosHijosList = nodosHijosList;
	}
	public boolean isBlnCheackBox() {
		return blnCheackBox;
	}
	public void setBlnCheackBox(boolean blnCheackBox) {
		this.blnCheackBox = blnCheackBox;
	}
	
}
