package wcmc.hef.general.tag;

import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class RegistroTag extends BodyTagSupport {
	private String nombreParam;
	private String nombreComercial;
	
	private String headCssClass;
	private String headStyle;
	private String headWidth;
	private String headAlign;
	
	private String rowCssClass;
	private String rowStyle;
	private String rowWidth;
	private String rowAlign;
	private String headRowStyle;

	private String bodyContentString;
	
	public RegistroTag clone() {
		RegistroTag rt			= new RegistroTag();
		rt.nombreParam			= this.nombreParam;
		rt.nombreComercial		= this.nombreComercial;
		rt.headCssClass			= this.headCssClass;
		rt.headStyle			= this.headStyle;
		rt.headWidth			= this.headWidth;
		rt.headAlign			= this.headAlign;
		rt.rowCssClass			= this.rowCssClass;
		rt.rowStyle				= this.rowStyle;
		rt.rowWidth				= this.rowWidth;
		rt.rowAlign				= this.rowAlign;
		rt.headRowStyle			= this.headRowStyle;
		if(this.getBodyContent() != null)
			rt.bodyContentString	= this.getBodyContent().getString();
		else 
			rt.bodyContentString	= "";
		return rt;
	}
	public int doStartTag() throws JspTagException {
		return EVAL_BODY_BUFFERED;
	}
	
	public int doEndTag() throws JspTagException {
		try {
			PaginacionTag pagTag	= (PaginacionTag)findAncestorWithClass(this, PaginacionTag.class);
			pagTag.addRegistriTag(this);
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new JspTagException("All is not well in the world." + ex);
		}
		return EVAL_BODY_BUFFERED;
	}

	public String getNombreParam() {
		return nombreParam;
	}

	public void setNombreParam(String nombreParam) {
		this.nombreParam = nombreParam;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getHeadCssClass() {
		return headCssClass;
	}

	public void setHeadCssClass(String headCssClass) {
		this.headCssClass = headCssClass;
	}

	public String getHeadStyle() {
		return headStyle;
	}

	public void setHeadStyle(String headStyle) {
		this.headStyle = headStyle;
	}

	public String getHeadWidth() {
		return headWidth;
	}

	public void setHeadWidth(String headWidth) {
		this.headWidth = headWidth;
	}

	public String getHeadAlign() {
		return headAlign;
	}

	public void setHeadAlign(String headAlign) {
		this.headAlign = headAlign;
	}

	public String getRowCssClass() {
		return rowCssClass;
	}

	public void setRowCssClass(String rowCssClass) {
		this.rowCssClass = rowCssClass;
	}

	public String getRowStyle() {
		return rowStyle;
	}

	public void setRowStyle(String rowStyle) {
		this.rowStyle = rowStyle;
	}

	public String getRowWidth() {
		return rowWidth;
	}

	public void setRowWidth(String rowWidth) {
		this.rowWidth = rowWidth;
	}

	public String getRowAlign() {
		return rowAlign;
	}

	public void setRowAlign(String rowAlign) {
		this.rowAlign = rowAlign;
	}
	public String getBodyContentString() {
		return bodyContentString;
	}
	public void setBodyContentString(String bodyContentString) {
		this.bodyContentString = bodyContentString;
	}
	public String getHeadRowStyle() {
		return headRowStyle;
	}
	public void setHeadRowStyle(String headRowStyle) {
		this.headRowStyle = headRowStyle;
	}
	
}