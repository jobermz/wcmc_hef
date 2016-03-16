package wcmc.hef.web.visor.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import wcmc.hef.business.core.capa.dto.BasLimDepartamentoDto;
import wcmc.hef.business.core.capa.dto.BasLimDistritosDto;
import wcmc.hef.business.core.capa.dto.BasLimProvinciaDto;
import wcmc.hef.business.core.capa.service.BasLimDepartamentoService;
import wcmc.hef.business.core.capa.service.BasLimDistritosService;
import wcmc.hef.business.core.capa.service.BasLimProvinciaService;
import wcmc.hef.business.core.configuracion.dto.CapaDto;
import wcmc.hef.business.core.configuracion.dto.CapaUmbralDto;
import wcmc.hef.business.core.configuracion.dto.GrupoCapasDto;
import wcmc.hef.business.core.configuracion.service.CapaService;
import wcmc.hef.business.core.configuracion.service.CapaUmbralService;
import wcmc.hef.business.core.configuracion.service.GrupoCapasService;
import wcmc.hef.business.core.seguridad.dto.CuentaUsuarioDto;
import wcmc.hef.business.core.visor.dto.CapaDepartamentoDto;
import wcmc.hef.business.core.visor.dto.CapaDistritoDto;
import wcmc.hef.business.core.visor.dto.CapaProvinciaDto;
import wcmc.hef.business.core.visor.service.CapaDepartamentoService;
import wcmc.hef.business.core.visor.service.CapaDistritoService;
import wcmc.hef.business.core.visor.service.CapaProvinciaService;
import wcmc.hef.dao.capa.domain.BasLimDepartamento;
import wcmc.hef.dao.capa.domain.BasLimDistritos;
import wcmc.hef.dao.capa.domain.BasLimProvincia;
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
	private BasLimDepartamentoService basLimDepartamentoService;
	
	@Autowired
	private BasLimProvinciaService basLimProvinciaService;

	@Autowired
	private BasLimDistritosService basLimDistritosService;

	@Autowired
	private CapaUmbralService capaUmbralService;

	private List<Capa> listCapasBase;
	
	public VisorAction() {
	}
	
	public String cargarCapasBase() {
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			CuentaUsuarioDto cuentaUsuarioDto	= (CuentaUsuarioDto)session.get("USUARIO_ACTUAL");
			CapaDto capaDto		= new CapaDto();
			if(cuentaUsuarioDto != null) {
				capaDto.setIntIdUsuario(cuentaUsuarioDto.getSrlId());
			}
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
			
			CuentaUsuarioDto cuentaUsuarioDto	= (CuentaUsuarioDto)session.get("USUARIO_ACTUAL");
			CapaDto capaDto		= new CapaDto();
			if(cuentaUsuarioDto != null) {
				capaDto.setIntIdUsuario(cuentaUsuarioDto.getSrlId());
			}
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
			
			/*
			BasLimDepartamentoDto basLimDepartamentoDto		= new BasLimDepartamentoDto();
			List<BasLimDepartamento> listBasLimDepartamento	= basLimDepartamentoService.buscar(basLimDepartamentoDto);
			session.put("listBasLimDepartamento", listBasLimDepartamento);

			session.put("listBasLimProvincia", new ArrayList<BasLimProvincia>());

			session.put("listBasLimDistritos", new ArrayList<BasLimDistritos>());
			*/
			
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
			BasLimDepartamentoDto basLimDepartamentoDto	= new BasLimDepartamentoDto();
			basLimDepartamentoDto.setStrIddpto(centrar_departamento);
			List<BasLimDepartamento> listBasLimDepartamento		= basLimDepartamentoService.buscar(basLimDepartamentoDto);
			if(listBasLimDepartamento.size() > 0) {
				strCentroDepartamento					= listBasLimDepartamento.get(0).getStrTheGeom();
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
			BasLimDepartamentoDto basLimDepartamentoDto	= new BasLimDepartamentoDto();
			basLimDepartamentoDto.setStrIddpto(centrar_prov_departamento);
			List<BasLimDepartamento> listBasLimDepartamento		= basLimDepartamentoService.buscar(basLimDepartamentoDto);
			if(listBasLimDepartamento.size() > 0) {
				strCentroDepartamento					= listBasLimDepartamento.get(0).getStrTheGeom();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return SUCCESS;
	}
	public String centrarProvinciaEnProvincia() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		try {
			String centrar_prov_provincia		= CadenaUtil.getStr(request.getParameter("centrar_prov_provincia"));
			BasLimProvinciaDto basLimProvinciaDto	= new BasLimProvinciaDto();
			basLimProvinciaDto.setStrIdprov(centrar_prov_provincia);
			List<BasLimProvincia> listBasLimProvincia	= basLimProvinciaService.buscar(basLimProvinciaDto);
			if(listBasLimProvincia.size() > 0) {
				strCentroProvincia					= listBasLimProvincia.get(0).getStrTheGeom();
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
			BasLimDepartamentoDto basLimDepartamentoDto	= new BasLimDepartamentoDto();
			basLimDepartamentoDto.setStrIddpto(centrar_dist_departamento);
//			BasLimDepartamento basLimDepartamento		= basLimDepartamentoService.buscarById(basLimDepartamentoDto);
//			strCentroDepartamento					= basLimDepartamento.getStrTheGeom();
			List<BasLimDepartamento> listBasLimDepartamento		= basLimDepartamentoService.buscar(basLimDepartamentoDto);
			if(listBasLimDepartamento.size() > 0) {
				strCentroDepartamento					= listBasLimDepartamento.get(0).getStrTheGeom();
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
			BasLimProvinciaDto basLimProvinciaDto	= new BasLimProvinciaDto();
			basLimProvinciaDto.setStrIdprov(centrar_dist_provincia);
			List<BasLimProvincia> listBasLimProvincia	= basLimProvinciaService.buscar(basLimProvinciaDto);
			if(listBasLimProvincia.size() > 0) {
				strCentroProvincia					= listBasLimProvincia.get(0).getStrTheGeom();
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
			BasLimDistritosDto basLimDistritoDto		= new BasLimDistritosDto();
			basLimDistritoDto.setStrIddist(centrar_dist_distrito);
			List<BasLimDistritos> listBasLimDistritos	= basLimDistritosService.buscar(basLimDistritoDto);
			if(listBasLimDistritos.size() > 0) {
				strCentroDistrito					= listBasLimDistritos.get(0).getStrTheGeom();
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
			BasLimProvinciaDto basLimProvinciaDto		= new BasLimProvinciaDto();
			basLimProvinciaDto.setStrIdprov(centrar_prov_departamento+"%");
			List<BasLimProvincia> listBasLimProvincia	= basLimProvinciaService.buscar(basLimProvinciaDto);
			session.put("listBasLimProvincia", listBasLimProvincia);
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
			BasLimProvinciaDto basLimProvinciaDto		= new BasLimProvinciaDto();
			basLimProvinciaDto.setStrIdprov(centrar_dist_departamento);
			List<BasLimProvincia> listBasLimProvincia	= basLimProvinciaService.buscar(basLimProvinciaDto);
			session.put("listBasLimProvincia", listBasLimProvincia);
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
			BasLimDistritosDto basLimDistritoDto			= new BasLimDistritosDto();
			basLimDistritoDto.setStrIdprov(centrar_dist_provincia);
			List<BasLimDistritos> listBasLimDistritos		= basLimDistritosService.buscar(basLimDistritoDto);
			session.put("listBasLimDistritos", listBasLimDistritos);
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
