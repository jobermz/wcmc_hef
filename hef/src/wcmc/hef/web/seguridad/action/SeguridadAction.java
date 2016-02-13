package wcmc.hef.web.seguridad.action;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import wcmc.hef.business.core.seguridad.dto.CuentaUsuarioDto;
import wcmc.hef.business.core.seguridad.service.CuentaUsuarioService;
import wcmc.hef.dao.seguridad.domain.CuentaUsuario;
import wcmc.hef.general.util.CadenaUtil;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Clase Action que se usa para la gestion de autenticacion automatica del sistema 
 * 
 * @author Jober Mena
 * 
 */

public class SeguridadAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private String autentica_strPassword;
	private String autentica_strUsuario;
	
	/**
	 * Declaracion de clases servicio para el acceso a los datos
	 */
	@Autowired
	private CuentaUsuarioService cuentaUsuarioService;
	
	public String inicio() {
		
		return SUCCESS;
	}

		
	/**
	 * Permite validar si una autenticacion es valida
	 * @return
	 */
	public String autenticar() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			CuentaUsuarioDto cuentaUsuarioDto	= new CuentaUsuarioDto();
			CuentaUsuario cuentaUsuario;
			if(CadenaUtil.getStrNull(autentica_strUsuario) != null && CadenaUtil.getStrNull(autentica_strPassword) != null) {
				cuentaUsuarioDto.setStrUsuario(CadenaUtil.getStr(autentica_strUsuario));
				cuentaUsuarioDto.setStrClave(CadenaUtil.getStr(autentica_strPassword));
				List<CuentaUsuario> listCuentaUsuario	= cuentaUsuarioService.buscar(cuentaUsuarioDto);
				if(listCuentaUsuario.size() > 0 && listCuentaUsuario.size() == 1) {
					cuentaUsuario	= listCuentaUsuario.get(0);
					if(!cuentaUsuario.getStrEsActivoBoolean()) {
						addActionError("La cuenta de usuario no se encuentra activa");
						return ERROR;
					}
					cuentaUsuarioDto	= new CuentaUsuarioDto();
					BeanUtils.copyProperties(cuentaUsuario, cuentaUsuarioDto);
					session.put("USUARIO_ACTUAL", cuentaUsuarioDto);
					
					return SUCCESS;
				} else {
					addActionError("Error usuario y/o clave invalidad");
					return ERROR;
				}
			} else {
				addActionError("Error debe ingresar su usuario y/o password");
				return ERROR;
			}
		} catch(Exception ex) {
			ex.printStackTrace();
			addActionError("Ocurrio un error:" + ex.getMessage());
		}
		return ERROR;
	}
	
	/**
	 * Finaliza la session de usuario
	 * @return
	 */
	public String salir() {
		try {
			HttpSession session		= ServletActionContext.getRequest().getSession();
			session.invalidate();
		} catch(Exception ex) {
			ex.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
	
	@Override
	public void addActionError(String anErrorMessage) {
		super.addActionError(anErrorMessage);
	}
	
	//////////////////////////////////////////////////////////////////////////////////////
	
	public Collection<String> getActionErrors() {
		return super.getActionErrors();
	}
	
	public Collection<String> getActionMessages() {
		return super.getActionMessages();
	}
	
	public String getAutentica_strPassword() {
		return autentica_strPassword;
	}
	
	public void setAutentica_strPassword(String autentica_strPassword) {
		this.autentica_strPassword = autentica_strPassword;
	}
	
	public String getAutentica_strUsuario() {
		return autentica_strUsuario;
	}
	
	public void setAutentica_strUsuario(String autentica_strUsuario) {
		this.autentica_strUsuario = autentica_strUsuario;
	}
	
}