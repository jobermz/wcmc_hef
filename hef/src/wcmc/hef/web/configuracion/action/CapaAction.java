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
import wcmc.hef.business.core.configuracion.dto.CapaDto;
import wcmc.hef.business.core.configuracion.service.CapaService;
import wcmc.hef.dao.configuracion.domain.Capa;
import wcmc.hef.business.core.configuracion.dto.GrupoCapasDto;
import wcmc.hef.business.core.configuracion.service.GrupoCapasService;
import wcmc.hef.dao.configuracion.domain.GrupoCapas;
import wcmc.hef.business.core.configuracion.dto.TipoCapaDto;
import wcmc.hef.business.core.configuracion.service.TipoCapaService;
import wcmc.hef.dao.configuracion.domain.TipoCapa;

/**
 * Clase Action que se usa para el registro, edicion y consulta de Capas base
 * 
 * @author Jober Mena
 * 
 */

public class CapaAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Declaracion de clases servicio para el acceso a los datos
	 */
	@Autowired
	private CapaService capaService;
	
	@Autowired
	private GrupoCapasService grupoCapasService;
	
	@Autowired
	private TipoCapaService tipoCapaService;
	
	private String buscar_srlIdCapa;
	private String buscar_intGrupoCapas;
	private String buscar_intTipoCapa;
	private String buscar_strNombre;
	private String buscar_strComentarios;
	private String buscar_strUrl;
	private String buscar_strWmsUrl;
	private String buscar_strWmsCapas;
	private String buscar_strWfsUrl;
	private String buscar_timFechaRegistro;
	
	private String[] buscar_seleccion_id;
	
	private CapaDto edicion_capaDto;
	
	private List<Capa> listCapa;
	

	
	
	public CapaAction() {
	}
	
	public String inicio() {
		Map<String, Object> session		= ActionContext.getContext().getSession();
		grupoCapasCargar();
		tipoCapaCargar();
		return SUCCESS;
	}
	
	public String buscar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			CapaDto capaDto		= new CapaDto();
			if(buscar_strNombre != null && !buscar_strNombre.equals("")) {
				capaDto.setStrNombre(CadenaUtil.getStr(buscar_strNombre));
			}
			if(buscar_strComentarios != null && !buscar_strComentarios.equals("")) {
				capaDto.setStrComentarios(CadenaUtil.getStr(buscar_strComentarios));
			}
			if(buscar_intGrupoCapas != null && !buscar_intGrupoCapas.equals("")) {
				capaDto.setIntGrupoCapas(CadenaUtil.getInte(buscar_intGrupoCapas));
			}
			
			listCapa = capaService.buscar(capaDto);
		} catch(Exception ex) {
			//ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String eliminar() {
		CapaDto capaDto	= null;
		try {
			for(int i = 0;i < buscar_seleccion_id.length;i++) {
				capaDto	= new CapaDto();
				capaDto.setSrlIdCapa(CadenaUtil.getInte(buscar_seleccion_id[i]));
				capaService.eliminar(capaDto);
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
			CapaDto capaDto		= new CapaDto();
			capaDto.setSrlIdCapa(CadenaUtil.getInte(buscar_seleccion_id[0]));
			Capa capa				= capaService.buscarById(capaDto);
			if(capa != null) {
				this.edicion_capaDto		= new CapaDto();
				BeanUtils.copyProperties(capa, this.edicion_capaDto);
				session.put("CapaDto_SrlIdCapa", this.edicion_capaDto.getSrlIdCapa());
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
		this.edicion_capaDto		= new CapaDto();
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
			
			capaService.guardar(this.edicion_capaDto);
			
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
//			List<GrupoCapas> list		= grupoCapasService.buscar(null);
//			session.put("listGrupoCapas", list);
			
			GrupoCapasDto grupoCapasDto					= new GrupoCapasDto();
			List<GrupoCapas> listGrupoCapasBase			= grupoCapasService.buscar(grupoCapasDto);
			List<GrupoCapas> listGrupoCapasSub			= null;
			List<GrupoCapas> listGrupoCapasOut			= new ArrayList<GrupoCapas>();
			for(GrupoCapas grupoCapas:listGrupoCapasBase) {
				listGrupoCapasOut.add(grupoCapas);
				grupoCapasDto				= new GrupoCapasDto();
				grupoCapasDto.setIntIdGrupoCapasPadre(grupoCapas.getSrlIdGrupoCapas());
				listGrupoCapasSub			= grupoCapasService.buscar(grupoCapasDto);
				listGrupoCapasOut.addAll(listGrupoCapasSub);
			}
			session.put("listGrupoCapas", listGrupoCapasOut);
			
			session.put("listGrupoCapasBase", listGrupoCapasBase);
			grupoCapasDto				= new GrupoCapasDto();
			listGrupoCapasSub			= grupoCapasService.buscarTodos(grupoCapasDto);
			session.put("listGrupoCapasTodos", listGrupoCapasSub);
			
		} catch(Exception ex) {
			//ex.printStackTrace();
			return "error";
		}
		return SUCCESS;
	}
	
	public String tipoCapaCargar() {
		try {
			Map<String, Object> session		= ActionContext.getContext().getSession();
			HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
			List<TipoCapa> list		= tipoCapaService.buscar(null);
			session.put("listTipoCapa", list);
		} catch(Exception ex) {
			//ex.printStackTrace();
			return "error";
		}
		return SUCCESS;
	}
	
	
	//////////////////////////////////////////////////////////////////////////////////////
	
	public String getBuscar_srlIdCapa() {
		return buscar_srlIdCapa;
	}
	
	public void setBuscar_srlIdCapa(String buscar_srlIdCapa) {
		this.buscar_srlIdCapa = buscar_srlIdCapa;
	}
	public String getBuscar_intGrupoCapas() {
		return buscar_intGrupoCapas;
	}
	
	public void setBuscar_intGrupoCapas(String buscar_intGrupoCapas) {
		this.buscar_intGrupoCapas = buscar_intGrupoCapas;
	}
	public String getBuscar_intTipoCapa() {
		return buscar_intTipoCapa;
	}
	
	public void setBuscar_intTipoCapa(String buscar_intTipoCapa) {
		this.buscar_intTipoCapa = buscar_intTipoCapa;
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
	public String getBuscar_timFechaRegistro() {
		return buscar_timFechaRegistro;
	}
	
	public void setBuscar_timFechaRegistro(String buscar_timFechaRegistro) {
		this.buscar_timFechaRegistro = buscar_timFechaRegistro;
	}
	
	public CapaDto getEdicion_capaDto() {
		return edicion_capaDto;
	}
	
	public void setEdicion_capaDto(
			CapaDto edicion_capaDto) {
		this.edicion_capaDto = edicion_capaDto;
	}
	
	public String[] getBuscar_seleccion_id() {
		return buscar_seleccion_id;
	}
	
	public void setBuscar_seleccion_id(String[] buscar_seleccion_id) {
		this.buscar_seleccion_id = buscar_seleccion_id;
	}
	
	public List<Capa> getListCapa() {
		return listCapa;
	}
	
	public void setListCapa(List<Capa> listCapa) {
		this.listCapa = listCapa;
	}
	
	public Collection<String> getActionErrors() {
		return super.getActionErrors();
	}
	
	public Collection<String> getActionMessages() {
		return super.getActionMessages();
	}
	
}