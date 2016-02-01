package wcmc.hef.general.tag;

//import java.io.ByteArrayOutputStream;
//import java.io.PrintWriter;
//import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;

import org.apache.commons.beanutils.BeanUtils;

import wcmc.hef.general.util.CadenaUtil;
//import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

public class PaginacionTag extends BodyTagSupport {
	private String id;
	private String width;
	private String cssClass;
	private String style;
	private String listArray;
	private int intContador;
	private int intContadorRelativo;
	private List<RegistroTag> listRegistroTag;
	private HttpSession session;
	private PaginacionTagBean pagi;
	private Object[] list;
	public PaginacionTag() {
		listRegistroTag		= new ArrayList<RegistroTag>();
	}
	
	public void addRegistriTag(RegistroTag regTag) {
		listRegistroTag.add(regTag.clone());
	}
	
	public int doStartTag() throws JspTagException {
		try {
			
			
			listRegistroTag.removeAll(listRegistroTag);
 			JspWriter out = pageContext.getOut();
			out.print("<table");
			if(!CadenaUtil.getStr(id).equals("")) {
				out.print(" id=\""+id+"\"");
			}
			if(!CadenaUtil.getStr(width).equals("")) {
				out.print(" width=\""+width+"\"");
			}
			if(!CadenaUtil.getStr(style).equals("")) {
				out.print(" style=\""+style+"\"");
			}
			if(!CadenaUtil.getStr(cssClass).equals("")) {
				out.print(" class=\""+cssClass+"\"");
			}
			out.println(">");
			intContadorRelativo = 0;
			session = pageContext.getSession();
			if(session.getAttribute(listArray) instanceof List) {
				list	= ((List)session.getAttribute(listArray)).toArray();
				session.setAttribute(listArray, list);
			} else {
				list	= (Object[])session.getAttribute(listArray);
			}
			pagi	= (PaginacionTagBean)session.getAttribute(listArray + "Paginacion");
			if(pagi.isBlnUsarListaCompleta()) {
				intContador = pagi.getIntExtraerDesde();
				if(intContador <= pagi.getIntExtraerHasta() && list.length > intContador) {
					this.pageContext.setAttribute(id, list[intContador]);
					this.pageContext.setAttribute(id+"_rowNum", intContadorRelativo);
					return EVAL_BODY_AGAIN;
				}
			} else {
				intContador		= 0;
				if(intContador <= pagi.getIntExtraerHasta() && list.length > intContador) {
					this.pageContext.setAttribute(id, list[intContador]);
					this.pageContext.setAttribute(id+"_rowNum", intContadorRelativo);
					return EVAL_BODY_AGAIN;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new JspTagException("All is not well in the world." + ex);
		}
		return EVAL_BODY_BUFFERED;
	}
	
	public int doAfterBody() throws JspTagException {
		BodyContent body	= getBodyContent();
		try {
//			ByteOutputStream bout	= new ByteOutputStream();
//			ByteArrayOutputStream bout	= new ByteArrayOutputStream();
//			PrintWriter out			= new PrintWriter(bout);
			StringBuffer out			= new StringBuffer();
//			out.
			if((pagi.isBlnUsarListaCompleta() && intContador == pagi.getIntExtraerDesde()) || (!pagi.isBlnUsarListaCompleta() && intContador == 0)) {
				out.append("<thead>");
				out.append("<tr");
				out.append(">");
				for(RegistroTag regTag:listRegistroTag) {
					out.append("<th");
					if(!CadenaUtil.getStr(regTag.getHeadAlign()).equals("")) {
						out.append(" align=\""+regTag.getHeadAlign()+"\"");
					}
					if(!CadenaUtil.getStr(regTag.getHeadCssClass()).equals("")) {
						out.append(" class=\""+regTag.getHeadCssClass()+"\"");
					}
					if(!CadenaUtil.getStr(regTag.getHeadStyle()).equals("")) {
						out.append(" style=\""+regTag.getHeadStyle()+"\"");
					}
					if(!CadenaUtil.getStr(regTag.getHeadWidth()).equals("")) {
						out.append(" width=\""+regTag.getHeadWidth()+"\"");
					}
					out.append(">");
					out.append(regTag.getNombreComercial());
					out.append("</th>");
				}
				out.append("</tr>");
				out.append("</thead>");
				out.append("<tbody>");
			}
			HttpSession session = pageContext.getSession();
			PaginacionTagBean pagi	= (PaginacionTagBean)session.getAttribute(listArray + "Paginacion");
			Map item		= null;
			if(list.length == intContador) {
//				out.flush();
//				out.close();
//				String str = bout.toString();
//				body.write(str);
				body.write(out.toString());
				listRegistroTag.removeAll(listRegistroTag);
				JspWriter outW			= body.getEnclosingWriter();
				outW.println(body.getString());
				body.clearBody(); // Clear for next evaluation
				return SKIP_BODY;
			}
			if(list[intContador] instanceof Map) {
				item		= (Map)list[intContador];
			} else {
				item		= BeanUtils.describe(list[intContador]);
//				validarMap(item);
			}
			StringBuffer registroSb	= new StringBuffer();
			String strStyleHeadRow	= "";
			for(RegistroTag regTag:listRegistroTag) {
				if(!CadenaUtil.getStr(regTag.getHeadRowStyle()).equals("")) {
					strStyleHeadRow		= regTag.getHeadRowStyle();
				}
				registroSb.append("<td");
				if(!CadenaUtil.getStr(regTag.getRowAlign()).equals("")) {
					registroSb.append(" align=\""+regTag.getRowAlign()+"\"");
				}
				if(!CadenaUtil.getStr(regTag.getRowCssClass()).equals("")) {
					registroSb.append(" class=\""+regTag.getRowCssClass()+"\"");
				}
				if(!CadenaUtil.getStr(regTag.getRowStyle()).equals("")) {
					registroSb.append(" style=\""+regTag.getRowStyle()+"\"");
				}
				if(!CadenaUtil.getStr(regTag.getRowWidth()).equals("")) {
					registroSb.append(" width=\""+regTag.getRowWidth()+"\"");
				}
				registroSb.append(">");
				if(!CadenaUtil.getStr(regTag.getNombreParam()).equals("")) {
					registroSb.append(CadenaUtil.getStr(item.get(regTag.getNombreParam())));
				} else if(!CadenaUtil.getStr(regTag.getBodyContentString()).equals("")) {
					registroSb.append(regTag.getBodyContentString());
				} else {
					registroSb.append("&nbsp;");
				}
				registroSb.append("</td>");
				registroSb.append("\n");
			}
			out.append("<tr");
			if(!CadenaUtil.getStr(strStyleHeadRow).equals("")) {
				out.append(" style=\""+strStyleHeadRow+"\"");
			}
			out.append(">");
			out.append(registroSb.toString());
			out.append("</tr>");
			
//			out.flush();
//			out.close();
//			String str = bout.toString();
//			body.write(str);
			body.write(out.toString());
			listRegistroTag.removeAll(listRegistroTag);
			JspWriter outW			= body.getEnclosingWriter();
			outW.println(body.getString());
			body.clearBody(); // Clear for next evaluation
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new JspTagException("Error in Hello tag doAfterBody " + ex);
		}
		intContador++;
		if(pagi.isBlnUsarListaCompleta()) {
			if(intContador <= pagi.getIntExtraerHasta() && list.length > intContador) {
				this.pageContext.setAttribute(id, list[intContador]);
				intContadorRelativo++;
				this.pageContext.setAttribute(id+"_rowNum", intContadorRelativo);
				return EVAL_BODY_AGAIN;
			} else {
				return SKIP_BODY;
			}
		} else {
			if(intContador < list.length) {
				this.pageContext.setAttribute(id, list[intContador]);
				intContadorRelativo++;
				this.pageContext.setAttribute(id+"_rowNum", intContadorRelativo);
				return EVAL_BODY_AGAIN;
			} else {
				return SKIP_BODY;
			}
		}

	}
	
	public int doEndTag() throws JspTagException {
		try {
			JspWriter out = pageContext.getOut();
			out.println("</tbody>");
			out.println("</table>");
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new JspTagException("All is not well in the world." + ex);
		}
		return EVAL_BODY_BUFFERED;
	}
//	public void validarMap(Map<String, Object> item) throws Exception {
//		Iterator<String> iteKey	= item.keySet().iterator();
//		String key				= null;
//		while(iteKey.hasNext()) {
//			key		= iteKey.next();
//			if(item.get(key) != null && item.get(key) instanceof BaseVO) {
//				item.put(key, BeanUtils.describe(item.get(key)));
//			}
//		}
//	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getCssClass() {
		return cssClass;
	}

	public void setCssClass(String cssClass) {
		this.cssClass = cssClass;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getListArray() {
		return listArray;
	}

	public void setListArray(String listArray) {
		this.listArray = listArray;
	}

}