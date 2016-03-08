package wcmc.hef.general.action;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {
	/*
	public UsuariosVO getUsuarioSession() {
		Map<String, Object> session	= ActionContext.getContext().getSession();
		UsuariosVO usuario			= (UsuariosVO)session.get("USUARIO_ACTUAL");
		return usuario;
	}
	*/
	private Map<String, Object> edicion_incidenciasVO;
	public String nuevo() {
		Map<String, Object> session		= ActionContext.getContext().getSession();
		this.edicion_incidenciasVO		= new HashMap<String, Object>();
		this.edicion_incidenciasVO.put("timFecha", new java.util.Date());
		session.remove("listIncidenciasFoto");
		return SUCCESS;
	}

	
}
