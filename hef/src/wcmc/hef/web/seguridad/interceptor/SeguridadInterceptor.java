package wcmc.hef.web.seguridad.interceptor;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import wcmc.hef.general.util.CadenaUtil;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * Interceptor de seguridad, valida que si el modulo al que un usuario con sesion valida, tiene permiso para el rol al que pertence
 * @author pc
 *
 */
public class SeguridadInterceptor implements Interceptor {
	private static final long serialVersionUID = 1L;
	private SimpleDateFormat simpleDia	= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public void destroy() {
	}
	public void init() {
	}
	
	public String intercept(ActionInvocation arg0) throws Exception {
		Map<String, Object> session			= ActionContext.getContext().getSession();
		HttpServletRequest request			= ServletActionContext.getRequest();
		HttpServletResponse response		= ServletActionContext.getResponse();
		try {
			ActionContext ctx					= ActionContext.getContext();
			ActionInvocation actionInvocation	= ctx.getActionInvocation();
			Object actionObject					= actionInvocation.getAction();
			String actionName					= CadenaUtil.getStr(actionInvocation.getProxy().getActionName());
//			String actionCurrentClass			= CadenaUtil.ultimaCadena(actionObject.getClass().getName(), '.');
			
			List<String> listActionException	= new ArrayList<String>();
			listActionException.add("login");
			listActionException.add("autenticarUsuario");
			listActionException.add("salir");
			
			listActionException.add("home");
			
			listActionException.add("cargarCapasBaseJson");
			listActionException.add("centrarDepartamentoJson");
			listActionException.add("centrarDepartamentoJson");
			listActionException.add("centrarProvinciaEnDepartamentoJson");
			listActionException.add("centrarDistritoEnDepartamentoJson");
			listActionException.add("centrarDistritoEnProvinciaJson");
			listActionException.add("centrarDistritoEnDistritoJson");
			listActionException.add("comboCentrarProvinciaEnProvincia");
			listActionException.add("comboCentrarDistritoEnProvincia");
			listActionException.add("comboCentrarDistritoEnDistrito");
			
			if(listActionException.contains(actionName)) {
				return arg0.invoke();
			} else {
				if(session.get("USUARIO_ACTUAL") != null) {
					return arg0.invoke();
				} else {
					response.sendRedirect("login.action");
					return null;
				}
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return arg0.invoke();
	}
	
}
