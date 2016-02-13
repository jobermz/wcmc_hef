package wcmc.hef.web.visor.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import wcmc.hef.business.core.configuracion.dto.CapaDto;
import wcmc.hef.business.core.configuracion.dto.CapaUmbralDto;
import wcmc.hef.business.core.configuracion.dto.GrupoCapasDto;
import wcmc.hef.business.core.configuracion.service.CapaService;
import wcmc.hef.business.core.configuracion.service.CapaUmbralService;
import wcmc.hef.business.core.configuracion.service.GrupoCapasService;
import wcmc.hef.business.core.visor.dto.CapaDepartamentoDto;
import wcmc.hef.business.core.visor.dto.CapaDistritoDto;
import wcmc.hef.business.core.visor.dto.CapaProvinciaDto;
import wcmc.hef.business.core.visor.service.CapaDepartamentoService;
import wcmc.hef.business.core.visor.service.CapaDistritoService;
import wcmc.hef.business.core.visor.service.CapaProvinciaService;
import wcmc.hef.dao.configuracion.domain.Capa;
import wcmc.hef.dao.configuracion.domain.GrupoCapas;
import wcmc.hef.dao.visor.domain.CapaDepartamento;
import wcmc.hef.dao.visor.domain.CapaDistrito;
import wcmc.hef.dao.visor.domain.CapaProvincia;
import wcmc.hef.general.util.CadenaUtil;
import wcmc.hef.general.util.ConfiguracionProperties;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class VisorAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private CapaService capaService;
	
	@Autowired
	private GrupoCapasService grupoCapasService;
	
	@Autowired
	private CapaDepartamentoService capaDepartamentoService;
	
	@Autowired
	private CapaProvinciaService capaProvinciaService;

	@Autowired
	private CapaDistritoService capaDistritoService;

	@Autowired
	private CapaUmbralService capaUmbralService;
	
	
	private List<Capa> listCapasBase;
	
	public VisorAction() {
	}
	
	public String cargarCapasBase() {
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			CapaDto capaDto		= new CapaDto();
			listCapasBase	= capaService.buscar(capaDto);
			session.put("listCapasBase", listCapasBase);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String inicio() {
		Map<String, Object> session			= ActionContext.getContext().getSession();
		try {
			CapaDto capaDto					= new CapaDto();
			listCapasBase					= capaService.buscar(capaDto);
			session.put("listCapasBase", listCapasBase);
			for(int i=0;i<listCapasBase.size();i++) {
				if(listCapasBase.get(i).getIntTipoCapa().intValue() == ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.TIPO_CAPA_UMBRAL)) {
					CapaUmbralDto capaUmbralDto		= new CapaUmbralDto();
					capaUmbralDto.setIntIdCapa(listCapasBase.get(i).getSrlIdCapa());
					listCapasBase.get(i).setListCapaUmbral(capaUmbralService.buscar(capaUmbralDto));
				}
			}
			GrupoCapasDto grupoCapasDto					= new GrupoCapasDto();
			List<GrupoCapas> listGrupoCapasBase			= grupoCapasService.buscar(grupoCapasDto);
			List<GrupoCapas> listGrupoCapasSub			= null;
			for(GrupoCapas grupoCapas:listGrupoCapasBase) {
				grupoCapasDto					= new GrupoCapasDto();
				grupoCapasDto.setIntIdGrupoCapasPadre(grupoCapas.getSrlIdGrupoCapas());
				listGrupoCapasSub			= grupoCapasService.buscar(grupoCapasDto);
				grupoCapas.setListGrupoCapas(listGrupoCapasSub);
			}
			session.put("listGrupoCapas", listGrupoCapasBase);

			CapaDepartamentoDto capaDepartamentoDto		= new CapaDepartamentoDto();
			List<CapaDepartamento> listCapaDepartamento	= capaDepartamentoService.buscar(capaDepartamentoDto);
			session.put("listCapaDepartamento", listCapaDepartamento);

			CapaProvinciaDto capaProvinciaDto			= new CapaProvinciaDto();
			List<CapaProvincia> listCapaProvincia		= capaProvinciaService.buscar(capaProvinciaDto);
			session.put("listCapaProvincia", listCapaProvincia);

			CapaDistritoDto capaDistritoDto				= new CapaDistritoDto();
			List<CapaDistrito> listCapaDistrito			= capaDistritoService.buscar(capaDistritoDto);
			session.put("listCapaDistrito", listCapaDistrito);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return SUCCESS;
	}
	
	private String strCentroDepartamento;
	private String strCentroProvincia;
	private String strCentroDistrito;
	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////
	public String centrarDepartamento() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		try {
			String centrar_departamento		= CadenaUtil.getStr(request.getParameter("centrar_departamento"));
			CapaDepartamentoDto capaDepartamentoDto	= new CapaDepartamentoDto();
			capaDepartamentoDto.setStrIdDepartamento(centrar_departamento);
			List<CapaDepartamento> listCapaDepartamento		= capaDepartamentoService.buscar(capaDepartamentoDto);
			if(listCapaDepartamento.size() > 0) {
				strCentroDepartamento					= listCapaDepartamento.get(0).getStrGeometria();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return SUCCESS;
	}
	////////////////////////////////////////////////////////////////////////////////////////////////
	public String centrarProvinciaEnDepartamento() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		try {
			String centrar_prov_departamento		= CadenaUtil.getStr(request.getParameter("centrar_prov_departamento"));
			CapaDepartamentoDto capaDepartamentoDto	= new CapaDepartamentoDto();
			capaDepartamentoDto.setStrIdDepartamento(centrar_prov_departamento);
			List<CapaDepartamento> listCapaDepartamento		= capaDepartamentoService.buscar(capaDepartamentoDto);
			if(listCapaDepartamento.size() > 0) {
				strCentroDepartamento					= listCapaDepartamento.get(0).getStrGeometria();
			}
//			CapaDepartamento capaDepartamento		= capaDepartamentoService.buscarById(capaDepartamentoDto);
//			strCentroDepartamento					= capaDepartamento.getStrGeometria();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return SUCCESS;
	}
	public String centrarProvinciaEnProvincia() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		try {
			String centrar_prov_provincia		= CadenaUtil.getStr(request.getParameter("centrar_prov_provincia"));
			CapaProvinciaDto capaProvinciaDto	= new CapaProvinciaDto();
			capaProvinciaDto.setStrIdProvincia(centrar_prov_provincia);
			List<CapaProvincia> listCapaProvincia	= capaProvinciaService.buscar(capaProvinciaDto);
			if(listCapaProvincia.size() > 0) {
				strCentroProvincia					= listCapaProvincia.get(0).getStrGeometria();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return SUCCESS;
	}
	////////////////////////////////////////////////////////////////////////////////////////////////
	public String centrarDistritoEnDepartamento() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		try {
			String centrar_dist_departamento		= CadenaUtil.getStr(request.getParameter("centrar_dist_departamento"));
			CapaDepartamentoDto capaDepartamentoDto	= new CapaDepartamentoDto();
			capaDepartamentoDto.setStrIdDepartamento(centrar_dist_departamento);
//			CapaDepartamento capaDepartamento		= capaDepartamentoService.buscarById(capaDepartamentoDto);
//			strCentroDepartamento					= capaDepartamento.getStrGeometria();
			List<CapaDepartamento> listCapaDepartamento		= capaDepartamentoService.buscar(capaDepartamentoDto);
			if(listCapaDepartamento.size() > 0) {
				strCentroDepartamento					= listCapaDepartamento.get(0).getStrGeometria();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return SUCCESS;
	}
	public String centrarDistritoEnProvincia() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		try {
			String centrar_dist_provincia		= CadenaUtil.getStr(request.getParameter("centrar_dist_provincia"));
			CapaProvinciaDto capaProvinciaDto	= new CapaProvinciaDto();
			capaProvinciaDto.setStrIdProvincia(centrar_dist_provincia);
			List<CapaProvincia> listCapaProvincia	= capaProvinciaService.buscar(capaProvinciaDto);
			if(listCapaProvincia.size() > 0) {
				strCentroProvincia					= listCapaProvincia.get(0).getStrGeometria();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return SUCCESS;
	}
	public String centrarDistritoEnDistrito() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		try {
			String centrar_dist_distrito		= CadenaUtil.getStr(request.getParameter("centrar_dist_distrito"));
			CapaDistritoDto capaDistritoDto		= new CapaDistritoDto();
			capaDistritoDto.setStrIdDistrito(centrar_dist_distrito);
			List<CapaDistrito> listCapaDistrito	= capaDistritoService.buscar(capaDistritoDto);
			if(listCapaDistrito.size() > 0) {
				strCentroDistrito					= listCapaDistrito.get(0).getStrGeometria();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return SUCCESS;
	}
	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////
	public String comboCentrarProvinciaEnProvincia() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			String centrar_prov_departamento		= CadenaUtil.getStr(request.getParameter("centrar_prov_departamento"));
			CapaProvinciaDto capaProvinciaDto		= new CapaProvinciaDto();
			capaProvinciaDto.setStrIdProvincia(centrar_prov_departamento+"%");
			List<CapaProvincia> listCapaProvincia	= capaProvinciaService.buscar(capaProvinciaDto);
			session.put("listCapaProvincia", listCapaProvincia);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String comboCentrarDistritoEnProvincia() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			String centrar_dist_departamento		= CadenaUtil.getStr(request.getParameter("centrar_dist_departamento"));
			CapaProvinciaDto capaProvinciaDto		= new CapaProvinciaDto();
			capaProvinciaDto.setStrIdProvincia(centrar_dist_departamento);
			List<CapaProvincia> listCapaProvincia	= capaProvinciaService.buscar(capaProvinciaDto);
			session.put("listCapaProvincia", listCapaProvincia);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String comboCentrarDistritoEnDistrito() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			String centrar_dist_provincia			= CadenaUtil.getStr(request.getParameter("centrar_dist_provincia"));
			CapaDistritoDto capaDistritoDto			= new CapaDistritoDto();
			capaDistritoDto.setStrIdProvincia(centrar_dist_provincia);
			List<CapaDistrito> listCapaDistrito		= capaDistritoService.buscar(capaDistritoDto);
			session.put("listCapaDistrito", listCapaDistrito);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return SUCCESS;
	}
	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////
	
	public List<Capa> getListCapasBase() {
		return listCapasBase;
	}
	
	public void setListCapasBase(List<Capa> listCapasBase) {
		this.listCapasBase = listCapasBase;
	}
	
	public String getStrCentroDepartamento() {
		return strCentroDepartamento;
	}
	
	public void setStrCentroDepartamento(String strCentroDepartamento) {
		this.strCentroDepartamento = strCentroDepartamento;
	}
	
	public String getStrCentroProvincia() {
		return strCentroProvincia;
	}
	
	public void setStrCentroProvincia(String strCentroProvincia) {
		this.strCentroProvincia = strCentroProvincia;
	}
	
	public String getStrCentroDistrito() {
		return strCentroDistrito;
	}
	
	public void setStrCentroDistrito(String strCentroDistrito) {
		this.strCentroDistrito = strCentroDistrito;
	}
	
}
