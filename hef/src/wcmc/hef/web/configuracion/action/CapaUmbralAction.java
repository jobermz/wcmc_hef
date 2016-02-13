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
import wcmc.hef.business.core.configuracion.dto.CapaUmbralDto;
import wcmc.hef.business.core.configuracion.service.CapaUmbralService;
import wcmc.hef.dao.configuracion.domain.CapaUmbral;
import wcmc.hef.business.core.configuracion.dto.CapaDto;
import wcmc.hef.business.core.configuracion.service.CapaService;
import wcmc.hef.dao.configuracion.domain.Capa;

/**
 * Clase Action que se usa para el registro, edicion y consulta de Umbral
 * 
 * @author Jober Mena
 * 
 */

public class CapaUmbralAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Declaracion de clases servicio para el acceso a los datos
	 */
	@Autowired
	private CapaUmbralService capaUmbralService;
	
	@Autowired
	private CapaService capaService;
	
	private String buscar_srlIdCapaUmbral;
	private String buscar_intIdCapa;
	private String buscar_strNombre;
	private String buscar_intValorMinimo;
	private String buscar_intValorMaximo;
	
	private String[] buscar_seleccion_id;
	
	private CapaUmbralDto edicion_capaUmbralDto;
	
	private List<CapaUmbral> listCapaUmbral;
	
	public CapaUmbralAction() {
	}
	
	public String inicio() {
		Map<String, Object> session		= ActionContext.getContext().getSession();
		capaCargar();
		return SUCCESS;
	}
	
	public String buscar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			CapaUmbralDto capaUmbralDto		= new CapaUmbralDto();
			if(buscar_strNombre != null && !buscar_strNombre.equals("")) {
				capaUmbralDto.setStrNombre(CadenaUtil.getStr(buscar_strNombre));
			}
			capaUmbralDto.setIntIdCapa(CadenaUtil.getInte(buscar_intIdCapa));
			
			listCapaUmbral = capaUmbralService.buscar(capaUmbralDto);
		} catch(Exception ex) {
			//ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String eliminar() {
		CapaUmbralDto capaUmbralDto	= null;
		try {
			for(int i = 0;i < buscar_seleccion_id.length;i++) {
				capaUmbralDto	= new CapaUmbralDto();
				capaUmbralDto.setSrlIdCapaUmbral(CadenaUtil.getInte(buscar_seleccion_id[i]));
				capaUmbralService.eliminar(capaUmbralDto);
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
		inicio();
			CapaUmbralDto capaUmbralDto		= new CapaUmbralDto();
			capaUmbralDto.setSrlIdCapaUmbral(CadenaUtil.getInte(buscar_seleccion_id[0]));
			CapaUmbral capaUmbral				= capaUmbralService.buscarById(capaUmbralDto);
			if(capaUmbral != null) {
				this.edicion_capaUmbralDto		= new CapaUmbralDto();
				BeanUtils.copyProperties(capaUmbral, this.edicion_capaUmbralDto);
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
		inicio();
		this.edicion_capaUmbralDto		= new CapaUmbralDto();
		this.edicion_capaUmbralDto.setIntIdCapa(CadenaUtil.getInte(session.get("CapaDto_SrlIdCapa")));
		return SUCCESS;
	}
	
	public String guardar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		boolean error	= false;
		try {
			if(CadenaUtil.getStr(this.edicion_capaUmbralDto.getStrNombre()).equals("")) {
				error	= true;
				addActionError("El valor del campo Nombre es obligatorio");
			}
			if(CadenaUtil.getStr(this.edicion_capaUmbralDto.getIntValorMinimo()).equals("")) {
				error	= true;
				addActionError("El valor del campo Valor minimo es obligatorio");
			}
			if(CadenaUtil.getStr(this.edicion_capaUmbralDto.getIntValorMaximo()).equals("")) {
				error	= true;
				addActionError("El valor del campo Valor maximo es obligatorio");
			}
			if(error) {
				throw new Exception("");
			}
			
			capaUmbralService.guardar(this.edicion_capaUmbralDto);
			
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
	
	public String capaCargar() {
		try {
			Map<String, Object> session		= ActionContext.getContext().getSession();
			HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
			List<Capa> list		= capaService.buscar(null);
			session.put("listCapa", list);
		} catch(Exception ex) {
			//ex.printStackTrace();
			return "error";
		}
		return SUCCESS;
	}
	
	
	//////////////////////////////////////////////////////////////////////////////////////
	
	public String getBuscar_srlIdCapaUmbral() {
		return buscar_srlIdCapaUmbral;
	}
	
	public void setBuscar_srlIdCapaUmbral(String buscar_srlIdCapaUmbral) {
		this.buscar_srlIdCapaUmbral = buscar_srlIdCapaUmbral;
	}
	public String getBuscar_intIdCapa() {
		return buscar_intIdCapa;
	}
	
	public void setBuscar_intIdCapa(String buscar_intIdCapa) {
		this.buscar_intIdCapa = buscar_intIdCapa;
	}
	public String getBuscar_strNombre() {
		return buscar_strNombre;
	}
	
	public void setBuscar_strNombre(String buscar_strNombre) {
		this.buscar_strNombre = buscar_strNombre;
	}
	public String getBuscar_intValorMinimo() {
		return buscar_intValorMinimo;
	}
	
	public void setBuscar_intValorMinimo(String buscar_intValorMinimo) {
		this.buscar_intValorMinimo = buscar_intValorMinimo;
	}
	public String getBuscar_intValorMaximo() {
		return buscar_intValorMaximo;
	}
	
	public void setBuscar_intValorMaximo(String buscar_intValorMaximo) {
		this.buscar_intValorMaximo = buscar_intValorMaximo;
	}
	
	public CapaUmbralDto getEdicion_capaUmbralDto() {
		return edicion_capaUmbralDto;
	}
	
	public void setEdicion_capaUmbralDto(
			CapaUmbralDto edicion_capaUmbralDto) {
		this.edicion_capaUmbralDto = edicion_capaUmbralDto;
	}
	
	public String[] getBuscar_seleccion_id() {
		return buscar_seleccion_id;
	}
	
	public void setBuscar_seleccion_id(String[] buscar_seleccion_id) {
		this.buscar_seleccion_id = buscar_seleccion_id;
	}
	
	public List<CapaUmbral> getListCapaUmbral() {
		return listCapaUmbral;
	}
	
	public void setListCapaUmbral(List<CapaUmbral> listCapaUmbral) {
		this.listCapaUmbral = listCapaUmbral;
	}
	
	public Collection<String> getActionErrors() {
		return super.getActionErrors();
	}
	
	public Collection<String> getActionMessages() {
		return super.getActionMessages();
	}
	
}