package wcmc.hef.web.seguridad.action;

import java.util.List;
import java.util.Collection;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import wcmc.hef.general.util.CadenaUtil;
import wcmc.hef.business.core.seguridad.dto.CuentaUsuarioDto;
import wcmc.hef.business.core.seguridad.service.CuentaUsuarioService;
import wcmc.hef.dao.seguridad.domain.CuentaUsuario;
import wcmc.hef.business.core.configuracion.service.PerfilService;
import wcmc.hef.dao.configuracion.domain.Perfil;

/**
 * Clase Action que se usa para el registro, edicion y consulta de Cuenta de usuario
 * 
 * @author Jober Mena
 * 
 */

public class CuentaUsuarioAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Declaracion de clases servicio para el acceso a los datos
	 */
	@Autowired
	private CuentaUsuarioService cuentaUsuarioService;
	
	@Autowired
	private PerfilService perfilService;
	
	private String buscar_srlId;
	private String buscar_intPerfil;
	private String buscar_strNombres;
	private String buscar_strApellidos;
	private String buscar_strUsuario;
	private String buscar_strClave;
	private String buscar_strEsActivo;
	
	private String[] buscar_seleccion_id;
	
	private CuentaUsuarioDto edicion_cuentaUsuarioDto;
	
	private List<CuentaUsuario> listCuentaUsuario;
	
	public CuentaUsuarioAction() {
	}
	
	public String inicio() {
		Map<String, Object> session		= ActionContext.getContext().getSession();
		perfilCargar();
		return SUCCESS;
	}
	
	public String buscar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			CuentaUsuarioDto cuentaUsuarioDto		= new CuentaUsuarioDto();
			if(buscar_strNombres != null && !buscar_strNombres.equals("")) {
				cuentaUsuarioDto.setStrNombres(CadenaUtil.getStr(buscar_strNombres));
			}
			if(buscar_strUsuario != null && !buscar_strUsuario.equals("")) {
				cuentaUsuarioDto.setStrUsuario(CadenaUtil.getStr(buscar_strUsuario));
			}
			if(buscar_strEsActivo != null && !buscar_strEsActivo.equals("")) {
				cuentaUsuarioDto.setStrEsActivo(CadenaUtil.getStr(buscar_strEsActivo));
			}
			
			listCuentaUsuario = cuentaUsuarioService.buscar(cuentaUsuarioDto);
		} catch(Exception ex) {
			//ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return SUCCESS;
	}
	
	public String eliminar() {
		CuentaUsuarioDto cuentaUsuarioDto	= null;
		try {
			for(int i = 0;i < buscar_seleccion_id.length;i++) {
				cuentaUsuarioDto	= new CuentaUsuarioDto();
				cuentaUsuarioDto.setSrlId(CadenaUtil.getInte(buscar_seleccion_id[i]));
				cuentaUsuarioService.eliminar(cuentaUsuarioDto);
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
			CuentaUsuarioDto cuentaUsuarioDto		= new CuentaUsuarioDto();
			cuentaUsuarioDto.setSrlId(CadenaUtil.getInte(buscar_seleccion_id[0]));
			CuentaUsuario cuentaUsuario				= cuentaUsuarioService.buscarById(cuentaUsuarioDto);
			if(cuentaUsuario != null) {
				this.edicion_cuentaUsuarioDto		= new CuentaUsuarioDto();
				BeanUtils.copyProperties(cuentaUsuario, this.edicion_cuentaUsuarioDto);
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
		this.edicion_cuentaUsuarioDto		= new CuentaUsuarioDto();
		this.edicion_cuentaUsuarioDto.setStrEsActivo(CadenaUtil.getStr("S"));
		return SUCCESS;
	}
	
	public String guardar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		boolean error	= false;
		try {
			if(CadenaUtil.getStr(this.edicion_cuentaUsuarioDto.getStrNombres()).equals("")) {
				error	= true;
				addActionError("El valor del campo Nombres es obligatorio");
			}
			if(CadenaUtil.getStr(this.edicion_cuentaUsuarioDto.getStrUsuario()).equals("")) {
				error	= true;
				addActionError("El valor del campo Usuario es obligatorio");
			}
			if(CadenaUtil.getStr(this.edicion_cuentaUsuarioDto.getStrClave()).equals("")) {
				error	= true;
				addActionError("El valor del campo Clave es obligatorio");
			}
			if(error) {
				throw new Exception("");
			}
			
			cuentaUsuarioService.guardar(this.edicion_cuentaUsuarioDto);
			
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
	
	public String perfilCargar() {
		try {
			Map<String, Object> session		= ActionContext.getContext().getSession();
			HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
			List<Perfil> list		= perfilService.buscar(null);
			session.put("listPerfil", list);
		} catch(Exception ex) {
			//ex.printStackTrace();
			return "error";
		}
		return SUCCESS;
	}
	
	
	//////////////////////////////////////////////////////////////////////////////////////
	
	public String getBuscar_srlId() {
		return buscar_srlId;
	}
	
	public void setBuscar_srlId(String buscar_srlId) {
		this.buscar_srlId = buscar_srlId;
	}
	public String getBuscar_intPerfil() {
		return buscar_intPerfil;
	}
	
	public void setBuscar_intPerfil(String buscar_intPerfil) {
		this.buscar_intPerfil = buscar_intPerfil;
	}
	public String getBuscar_strNombres() {
		return buscar_strNombres;
	}
	
	public void setBuscar_strNombres(String buscar_strNombres) {
		this.buscar_strNombres = buscar_strNombres;
	}
	public String getBuscar_strApellidos() {
		return buscar_strApellidos;
	}
	
	public void setBuscar_strApellidos(String buscar_strApellidos) {
		this.buscar_strApellidos = buscar_strApellidos;
	}
	public String getBuscar_strUsuario() {
		return buscar_strUsuario;
	}
	
	public void setBuscar_strUsuario(String buscar_strUsuario) {
		this.buscar_strUsuario = buscar_strUsuario;
	}
	public String getBuscar_strClave() {
		return buscar_strClave;
	}
	
	public void setBuscar_strClave(String buscar_strClave) {
		this.buscar_strClave = buscar_strClave;
	}
	public String getBuscar_strEsActivo() {
		return buscar_strEsActivo;
	}
	
	public void setBuscar_strEsActivo(String buscar_strEsActivo) {
		this.buscar_strEsActivo = buscar_strEsActivo;
	}
	
	public CuentaUsuarioDto getEdicion_cuentaUsuarioDto() {
		return edicion_cuentaUsuarioDto;
	}
	
	public void setEdicion_cuentaUsuarioDto(
			CuentaUsuarioDto edicion_cuentaUsuarioDto) {
		this.edicion_cuentaUsuarioDto = edicion_cuentaUsuarioDto;
	}
	
	public String[] getBuscar_seleccion_id() {
		return buscar_seleccion_id;
	}
	
	public void setBuscar_seleccion_id(String[] buscar_seleccion_id) {
		this.buscar_seleccion_id = buscar_seleccion_id;
	}
	
	public List<CuentaUsuario> getListCuentaUsuario() {
		return listCuentaUsuario;
	}
	
	public void setListCuentaUsuario(List<CuentaUsuario> listCuentaUsuario) {
		this.listCuentaUsuario = listCuentaUsuario;
	}
	
	public Collection<String> getActionErrors() {
		return super.getActionErrors();
	}
	
	public Collection<String> getActionMessages() {
		return super.getActionMessages();
	}
	
}