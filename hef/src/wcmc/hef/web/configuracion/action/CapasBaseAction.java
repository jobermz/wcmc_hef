package wcmc.hef.web.configuracion.action;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Collection;
import java.util.Map;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import wcmc.hef.general.util.CadenaUtil;
import wcmc.hef.business.core.configuracion.dto.CapasBaseDto;
import wcmc.hef.business.core.configuracion.service.CapasBaseService;
import wcmc.hef.dao.configuracion.domain.CapasBase;
import wcmc.hef.business.core.configuracion.dto.GrupoCapasDto;
import wcmc.hef.business.core.configuracion.service.GrupoCapasService;
import wcmc.hef.dao.configuracion.domain.GrupoCapas;

/**
 * Clase Action que se usa para el registro, edicion y consulta de Capas base
 * 
 * @author Jober Mena
 * 
 */

public class CapasBaseAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Declaracion de clases servicio para el acceso a los datos
	 */
	@Autowired
	private CapasBaseService capasBaseService;
	
	@Autowired
	private GrupoCapasService grupoCapasService;
	
	private String buscar_srlIdCapasBase;
	private String buscar_strNombre;
	private String buscar_strComentarios;
	private String buscar_strUrl;
	private String buscar_timFechaRegistro;
	private String buscar_strWmsUrl;
	private String buscar_strWmsCapas;
	private String buscar_strWfsUrl;
	private String buscar_intGrupoCapas;
	
	private String[] buscar_seleccion_id;
	
	private CapasBaseDto edicion_capasBaseDto;
	
	private List<CapasBase> listCapasBase;
	

	
	
	public CapasBaseAction() {
	}
	
	public String inicio() {
		Map<String, Object> session		= ActionContext.getContext().getSession();
		grupoCapasCargar();
		return SUCCESS;
	}
	
	public String buscar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			CapasBaseDto capasBaseDto		= new CapasBaseDto();
			if(buscar_strNombre != null && !buscar_strNombre.equals("")) {
				capasBaseDto.setStrNombre(CadenaUtil.getStr(buscar_strNombre));
			}
			if(buscar_strComentarios != null && !buscar_strComentarios.equals("")) {
				capasBaseDto.setStrComentarios(CadenaUtil.getStr(buscar_strComentarios));
			}
			
			listCapasBase = capasBaseService.buscar(capasBaseDto);
		} catch(Exception ex) {
			//ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String eliminar() {
		CapasBaseDto capasBaseDto	= null;
		try {
			for(int i = 0;i < buscar_seleccion_id.length;i++) {
				capasBaseDto	= new CapasBaseDto();
				capasBaseDto.setSrlIdCapasBase(CadenaUtil.getInte(buscar_seleccion_id[i]));
				capasBaseService.eliminar(capasBaseDto);
			}
			addActionMessage("Se eliminó satisfactoriamente el registro");
		} catch(Exception ex) {
			//ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String editar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			CapasBaseDto capasBaseDto		= new CapasBaseDto();
			capasBaseDto.setSrlIdCapasBase(CadenaUtil.getInte(buscar_seleccion_id[0]));
			CapasBase capasBase				= capasBaseService.buscarById(capasBaseDto);
			if(capasBase != null) {
				this.edicion_capasBaseDto		= new CapasBaseDto();
				BeanUtils.copyProperties(capasBase, this.edicion_capasBaseDto);
			}
		} catch(Exception ex) {
			//ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String nuevo() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		this.edicion_capasBaseDto		= new CapasBaseDto();
		return SUCCESS;
	}
	
	public String guardar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		boolean error	= false;
		try {
			if(error) {
				throw new Exception("");
			}
			
			capasBaseService.guardar(this.edicion_capasBaseDto);
			
			addActionMessage("Se registro satisfactoriamente");
		} catch(Exception ex) {
			//ex.printStackTrace();
			if(!CadenaUtil.getStr(ex.getMessage()).equals("")) {
				addActionError("Ocurrio un error:" + ex.getMessage());
			}
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String grupoCapasCargar() {
		try {
			Map<String, Object> session		= ActionContext.getContext().getSession();
			HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
			List<GrupoCapas> list		= grupoCapasService.buscar(null);
			session.put("listGrupoCapas", list);
		} catch(Exception ex) {
			//ex.printStackTrace();
			return "error";
		}
		return SUCCESS;
	}
	
	
	//////////////////////////////////////////////////////////////////////////////////////
	
	public String getBuscar_srlIdCapasBase() {
		return buscar_srlIdCapasBase;
	}
	
	public void setBuscar_srlIdCapasBase(String buscar_srlIdCapasBase) {
		this.buscar_srlIdCapasBase = buscar_srlIdCapasBase;
	}
	public String getBuscar_strNombre() {
		return buscar_strNombre;
	}
	
	public void setBuscar_strNombre(String buscar_strNombre) {
		this.buscar_strNombre = buscar_strNombre;
	}
	public String getBuscar_strComentarios() {
		return buscar_strComentarios;
	}
	
	public void setBuscar_strComentarios(String buscar_strComentarios) {
		this.buscar_strComentarios = buscar_strComentarios;
	}
	public String getBuscar_strUrl() {
		return buscar_strUrl;
	}
	
	public void setBuscar_strUrl(String buscar_strUrl) {
		this.buscar_strUrl = buscar_strUrl;
	}
	public String getBuscar_timFechaRegistro() {
		return buscar_timFechaRegistro;
	}
	
	public void setBuscar_timFechaRegistro(String buscar_timFechaRegistro) {
		this.buscar_timFechaRegistro = buscar_timFechaRegistro;
	}
	public String getBuscar_strWmsUrl() {
		return buscar_strWmsUrl;
	}
	
	public void setBuscar_strWmsUrl(String buscar_strWmsUrl) {
		this.buscar_strWmsUrl = buscar_strWmsUrl;
	}
	public String getBuscar_strWmsCapas() {
		return buscar_strWmsCapas;
	}
	
	public void setBuscar_strWmsCapas(String buscar_strWmsCapas) {
		this.buscar_strWmsCapas = buscar_strWmsCapas;
	}
	public String getBuscar_strWfsUrl() {
		return buscar_strWfsUrl;
	}
	
	public void setBuscar_strWfsUrl(String buscar_strWfsUrl) {
		this.buscar_strWfsUrl = buscar_strWfsUrl;
	}
	public String getBuscar_intGrupoCapas() {
		return buscar_intGrupoCapas;
	}
	
	public void setBuscar_intGrupoCapas(String buscar_intGrupoCapas) {
		this.buscar_intGrupoCapas = buscar_intGrupoCapas;
	}
	
	public CapasBaseDto getEdicion_capasBaseDto() {
		return edicion_capasBaseDto;
	}
	
	public void setEdicion_capasBaseDto(
			CapasBaseDto edicion_capasBaseDto) {
		this.edicion_capasBaseDto = edicion_capasBaseDto;
	}
	
	public String[] getBuscar_seleccion_id() {
		return buscar_seleccion_id;
	}
	
	public void setBuscar_seleccion_id(String[] buscar_seleccion_id) {
		this.buscar_seleccion_id = buscar_seleccion_id;
	}
	
	public List<CapasBase> getListCapasBase() {
		return listCapasBase;
	}
	
	public void setListCapasBase(List<CapasBase> listCapasBase) {
		this.listCapasBase = listCapasBase;
	}
	
	public Collection<String> getActionErrors() {
		return super.getActionErrors();
	}
	
	public Collection<String> getActionMessages() {
		return super.getActionMessages();
	}
	
}