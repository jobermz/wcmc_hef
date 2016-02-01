package wcmc.hef.general.util;

import java.util.List;

public class FormarArbolNodo {
	private static String javascriptIniciacion(String nodosList, String total, String idNodoPadre) {
		StringBuffer script = new StringBuffer();
		script.append("<script type=\"text/javascript\">\n");
		script.append("function getNodosList() {\n");
		script.append("	return '" + nodosList + "';\n");
		script.append("}\n");
		script.append("function getIdPadre() {\n");
		script.append("	return '" + idNodoPadre + "';\n");
		script.append("}\n");
		script.append("function getTotal() {\n");
		script.append("	return " + total + ";\n");
		script.append("}\n");
		script.append("</script>\n");
		return script.toString();
	}
	
	private static String extraerCadenasHijos(List<NodoVO> modulosList) {
		StringBuffer nodos = new StringBuffer();
		if(modulosList.size() > 0) {
			for(int i = 0;i < modulosList.size();i++) {
				if(i != 0) 
					nodos.append(",");
				NodoVO mod	= modulosList.get(i);
				nodos.append(String.valueOf(mod.getStrValue()));
				String nodHij	= extraerCadenasHijos(mod.getNodosHijosList());
				if(nodHij.length() > 0) {
					nodos.append("," + nodHij);
				}
			}
			return nodos.toString();
		} else {
			return "";
		}
	}
	
	public static String formarNodosInternoCheckbox(List<NodoVO> modulosList, List<String> modulosSeleccionadosList, String nombreCampo) {
		return formarNodosInterno(null, modulosList, extraerCadenasHijos(modulosList), true, modulosSeleccionadosList, nombreCampo);
	}
	
	private static String formarNodosInterno(NodoVO moduloPad, List<NodoVO> modulosList, String nodosList, boolean base, List<String> modulosSeleccionadosList, String nombreCampo) {
		String nombre		= "";
		boolean primero		= true;
		StringBuffer nodos	= new StringBuffer();
		if(modulosList.size() > 0) {
			if(base) {
				nodos.append("<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">");
				
//				nodos.append("<tr style=\"display:none;\">\n");
				nodos.append("<tr>\n");
				nodos.append("<td>");
				nodos.append("<img id=\"idImg__base\" src=\"img/folder-close.jpg\" class=\"imgHand\" style=\"display:none;\"/>");
				nodos.append("</td>\n");
				nodos.append("<td id=\"idTd__base\" title=\"null\" class=\"formvalor\">");
				
				
				nodos.append("<span onclick=\"expandirTodosNodos();\" class=\"imgHand link\">");
				nodos.append("Expandir todos");
				nodos.append("</span>\n");
				nodos.append("&nbsp;");
				nodos.append("&nbsp;");
				nodos.append("<span onclick=\"contraerTodosNodos();\" class=\"imgHand link\">");
				nodos.append("Contraer todos");
				nodos.append("</span>\n");
				
				nodos.append("</td>\n");
				nodos.append("</tr>\n");
				
				nodos.append("<tr id=\"idTr__base\" style=\"display:table-row;\">\n");
				nodos.append("<td>");
				nodos.append("&nbsp;");
				nodos.append("</td>\n");
				nodos.append("<td>");
			}
			nodos.append("<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">");
			for(int i = 0;i < modulosList.size();i++) {
				NodoVO modulo		= modulosList.get(i);
				nombre = modulo.getStrNombre();
				if(modulo.getNodosHijosList().size() > 0) {
					nodos.append(formarNodoFolder(moduloPad, modulo, nodosList, modulosList.size(), modulosSeleccionadosList, nombreCampo));
					primero = false;
				} else {
					nodos.append(formarNodoHijo(moduloPad, modulo, nodosList, modulosList.size(), modulosSeleccionadosList, nombreCampo));
				}
			}
			nodos.append("</table>");
			if(base) {
				String idNodPad = "";
				if(modulosList.size() > 0) {
					idNodPad	= String.valueOf(modulosList.get(0).getStrValue());
				}
				nodos.append(javascriptIniciacion(nodosList, String.valueOf(modulosList.size()), idNodPad));
			}
			if(base) {
				nodos.append("</td>\n");
				nodos.append("</tr>\n");
				nodos.append("</table>");
			}
		} else {
			nodos.append("&nbsp;");
		}
		return nodos.toString();
	}
	
	private static String formarNodoFolder(NodoVO moduloPad, NodoVO modulo, String nodoList, int totalExp, List<String> modulosSeleccionadosList, String nombreCampo) {
		StringBuffer nodo		= new StringBuffer();
		nodo.append("<tr>\n");
		nodo.append("<td>");
		nodo.append("<img id=\"idImg" + modulo.getStrValue() + "\" src=\"img/folder-close.jpg\" onclick=\"expandirContraer('" + modulo.getStrValue() + "');\" class=\"imgHand\"/>");
		nodo.append("</td>\n");
		nodo.append("<td id=\"idTd" + modulo.getStrValue() + "\" title=\"" + (moduloPad != null ? moduloPad.getStrValue():"") + "\" alt=\"" + modulo.getStrNombre() + "\" class=\"formvalor imgHand\"");
		if(!modulo.isBlnCheackBox()) {
			nodo.append(" onclick=\"expandirContraer('" + modulo.getStrValue() + "');\"");
		}
		nodo.append(">");
		if(modulo.isBlnCheackBox()) {
			nodo.append("<input type=\"checkbox\" name=\"" + nombreCampo + "\" id=\"id_editar_carpeta_" + modulo.getStrValue() + "\" value=\"" + modulo.getStrValue() + "\" ");
			if(modulosSeleccionadosList.contains(modulo.getStrValue())) {
				nodo.append(" checked=checked ");
			}
			nodo.append("/>\n");
		}
		nodo.append(modulo.getStrNombre());
		nodo.append("</td>\n");
		nodo.append("</tr>\n");
		
		nodo.append("<tr id=\"idTr" + modulo.getStrValue() + "\" style=\"display:none;\">\n");
		nodo.append("<td>\n");
		nodo.append("&nbsp;");
		nodo.append("</td>\n");
		
		nodo.append("<td>");
		nodo.append(formarNodosInterno(modulo, modulo.getNodosHijosList(), nodoList, false, modulosSeleccionadosList, nombreCampo));
		nodo.append("</td>\n");
		nodo.append("</tr>\n");
		return nodo.toString();
	}
	
	private static String formarNodoHijo(NodoVO moduloPad, NodoVO modulo, String nodoList, int totalExp, List<String> modulosSeleccionadosList, String nombreCampo) {
		StringBuffer nodo		= new StringBuffer();
		nodo.append("<tr>\n");
		nodo.append("<td><img src=\"img/folder-close-claro.jpg\"/></td>");
		nodo.append("<td id=\"idTd" + modulo.getStrValue() + "\" title=\"" + (moduloPad != null ? moduloPad.getStrValue():"") + "\" alt=\"" + modulo.getStrNombre() + "\" class=\"formvalor\">");
		if(modulo.isBlnCheackBox()) {
			nodo.append("<input type=\"checkbox\" name=\"" + nombreCampo + "\" id=\"id_editar_carpeta_" + modulo.getStrValue() + "\" value=\"" + modulo.getStrValue() + "\" ");
			if(modulosSeleccionadosList.contains(modulo.getStrValue())) {
				nodo.append(" checked=\"checked\" ");
			}
			nodo.append("/>\n");
		}
		nodo.append("<span onclick=\"seleccionarCheckbox('" + modulo.getStrValue() + "');\" class=\"imgHand\">\n");
		nodo.append(modulo.getStrNombre());
		nodo.append("</span>\n");
		nodo.append("</td>\n");
		nodo.append("</tr>\n");
		return nodo.toString();
	}
}
