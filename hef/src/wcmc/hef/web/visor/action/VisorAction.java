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
			/*

			BasLimDepartamentoDto basLimDepartamentoDto	= new BasLimDepartamentoDto();
			StringBuffer sb=new StringBuffer();//Reserva nacional punta de atico
			sb.append("MULTIPOLYGON(((-73.7218843919999 -16.2116711199999,-73.697699542 -16.230328729,-73.6976981159999 -16.2303444189999,-73.6976382069999 -16.2303327859999,-73.6974803249999 -16.2304672579999,-73.6973601909999 -16.230400093,-73.6972083769999 -16.2304829039999,-73.6965440259999 -16.2308390229999,-73.6965123059999 -16.2308548569999,-73.696429727 -16.2308992549999,-73.6951919879999 -16.2311798329999,-73.695047283 -16.2317166459999,-73.6949450779999 -16.2318058239999,-73.6949270849999 -16.2317871739999,-73.6949059039999 -16.2317879599999,-73.694875609 -16.2318160849999,-73.6946231289999 -16.2318704589999,-73.694503112 -16.2318943419999,-73.6943169079999 -16.2319071569999,-73.6937250389999 -16.2320441019999,-73.6934288129999 -16.2321879039999,-73.6931422219999 -16.23238799,-73.6930348539999 -16.2324432539999,-73.692988984 -16.2324444589999,-73.6929772919999 -16.232453904,-73.6929120999999 -16.232441627,-73.6928562819999 -16.232396982,-73.6927611819999 -16.232397143,-73.6926252249999 -16.2324704079999,-73.6925034059999 -16.2325467109999,-73.6924222129999 -16.2326455809999,-73.6923576569999 -16.2327382269999,-73.6922148469999 -16.2327965699999,-73.6921285099999 -16.2329711319999,-73.6919965119999 -16.2331270479999,-73.6918637079999 -16.2332635319999,-73.6919373779999 -16.2332939909999,-73.6656952849999 -16.2544934539999,-73.6978955039999 -16.2851733129999,-73.7498003359999 -16.2387927039999,-73.7218843919999 -16.2116711199999)))");
			basLimDepartamentoDto.setStrTheGeom(sb.toString());
			List<BasLimDepartamento> listRs = basLimDepartamentoService.buscar(basLimDepartamentoDto);
			for(BasLimDepartamento bean:listRs) {
				System.out.println("nombreDpto:"+bean.getStrNombdep());
			}
			
			*/
			
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
			
			
			BasLimDepartamentoDto basLimDepartamentoDto		= new BasLimDepartamentoDto();
			List<BasLimDepartamento> listBasLimDepartamento	= basLimDepartamentoService.buscar(basLimDepartamentoDto);
			session.put("listBasLimDepartamento", listBasLimDepartamento);

			session.put("listBasLimProvincia", new ArrayList<BasLimProvincia>());

			session.put("listBasLimDistritos", new ArrayList<BasLimDistritos>());
			
			
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
