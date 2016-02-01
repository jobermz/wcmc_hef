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
import wcmc.hef.business.core.configuracion.dto.GrupoCapasDto;
import wcmc.hef.business.core.configuracion.service.GrupoCapasService;
import wcmc.hef.dao.configuracion.domain.GrupoCapas;

/**
 * Clase Action que se usa para el registro, edicion y consulta de Grupo de capas base
 * 
 * @author Jober Mena
 * 
 */

public class GrupoCapasAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Declaracion de clases servicio para el acceso a los datos
	 */
	@Autowired
	private GrupoCapasService grupoCapasService;
	
	private String buscar_srlIdGrupoCapas;
	private String buscar_strNombre;
	private String buscar_intOrden;
	
	private String[] buscar_seleccion_id;
	
	private GrupoCapasDto edicion_grupoCapasDto;
	
	private List<GrupoCapas> listGrupoCapas;
	

	
	
	public GrupoCapasAction() {
	}
	
	public String inicio() {
		Map<String, Object> session		= ActionContext.getContext().getSession();
		return SUCCESS;
	}
	
	public String buscar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			GrupoCapasDto grupoCapasDto		= new GrupoCapasDto();
			if(buscar_strNombre != null && !buscar_strNombre.equals("")) {
				grupoCapasDto.setStrNombre(CadenaUtil.getStr(buscar_strNombre));
			}
			
			listGrupoCapas = grupoCapasService.buscar(grupoCapasDto);
		} catch(Exception ex) {
			//ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String eliminar() {
		GrupoCapasDto grupoCapasDto	= null;
		try {
			for(int i = 0;i < buscar_seleccion_id.length;i++) {
				grupoCapasDto	= new GrupoCapasDto();
				grupoCapasDto.setSrlIdGrupoCapas(CadenaUtil.getInte(buscar_seleccion_id[i]));
				grupoCapasService.eliminar(grupoCapasDto);
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
			GrupoCapasDto grupoCapasDto		= new GrupoCapasDto();
			grupoCapasDto.setSrlIdGrupoCapas(CadenaUtil.getInte(buscar_seleccion_id[0]));
			GrupoCapas grupoCapas				= grupoCapasService.buscarById(grupoCapasDto);
			if(grupoCapas != null) {
				this.edicion_grupoCapasDto		= new GrupoCapasDto();
				BeanUtils.copyProperties(grupoCapas, this.edicion_grupoCapasDto);
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
		this.edicion_grupoCapasDto		= new GrupoCapasDto();
		return SUCCESS;
	}
	
	public String guardar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		boolean error	= false;
		try {
			if(CadenaUtil.getStr(this.edicion_grupoCapasDto.getStrNombre()).equals("")) {
				error	= true;
				addActionError("El valor del campo Nombre es obligatorio");
			}
			if(error) {
				throw new Exception("");
			}
			
			grupoCapasService.guardar(this.edicion_grupoCapasDto);
			
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
	
	
	//////////////////////////////////////////////////////////////////////////////////////
	
	public String getBuscar_srlIdGrupoCapas() {
		return buscar_srlIdGrupoCapas;
	}
	
	public void setBuscar_srlIdGrupoCapas(String buscar_srlIdGrupoCapas) {
		this.buscar_srlIdGrupoCapas = buscar_srlIdGrupoCapas;
	}
	public String getBuscar_strNombre() {
		return buscar_strNombre;
	}
	
	public void setBuscar_strNombre(String buscar_strNombre) {
		this.buscar_strNombre = buscar_strNombre;
	}
	public String getBuscar_intOrden() {
		return buscar_intOrden;
	}
	
	public void setBuscar_intOrden(String buscar_intOrden) {
		this.buscar_intOrden = buscar_intOrden;
	}
	
	public GrupoCapasDto getEdicion_grupoCapasDto() {
		return edicion_grupoCapasDto;
	}
	
	public void setEdicion_grupoCapasDto(
			GrupoCapasDto edicion_grupoCapasDto) {
		this.edicion_grupoCapasDto = edicion_grupoCapasDto;
	}
	
	public String[] getBuscar_seleccion_id() {
		return buscar_seleccion_id;
	}
	
	public void setBuscar_seleccion_id(String[] buscar_seleccion_id) {
		this.buscar_seleccion_id = buscar_seleccion_id;
	}
	
	public List<GrupoCapas> getListGrupoCapas() {
		return listGrupoCapas;
	}
	
	public void setListGrupoCapas(List<GrupoCapas> listGrupoCapas) {
		this.listGrupoCapas = listGrupoCapas;
	}
	
	public Collection<String> getActionErrors() {
		return super.getActionErrors();
	}
	
	public Collection<String> getActionMessages() {
		return super.getActionMessages();
	}
	
}