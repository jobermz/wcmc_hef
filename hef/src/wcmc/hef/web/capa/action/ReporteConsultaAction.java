package wcmc.hef.web.capa.action;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import net.sf.jasperreports.engine.data.JRMapCollectionDataSource;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import wcmc.hef.dao.capa.domain.BeanRaster;
import wcmc.hef.general.util.CadenaUtil;
import wcmc.hef.general.util.ConfiguracionProperties;

public class ReporteConsultaAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	
	private List listMapReporte;
	private Map parametros;
	
	public ReporteConsultaAction() {
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////
	public String reporteTodosCSV() {
		return SUCCESS;
	}
	
	public String reporteTodos() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		String strReturn				= SUCCESS;
		try {
			this.listMapReporte	= new ArrayList<HashMap<String, Object>>();
			this.parametros						= new HashMap();
			this.parametros.put("strFecha", CadenaUtil.getStrDate(new Date()));
			this.parametros.put("strHora", CadenaUtil.getStrHoraMinutos(new Date()));
			String strRutaBase				= ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.RUTA_BASE_REPORTES)  + File.separator;
			String strRepositorioTemporal	= ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.REPOSITORIO_DOCS_TEMPORAL);

			this.parametros.put("strRutaBase", strRutaBase);
			
			Map<String, Object> mapReporte			= (Map<String, Object>)session.get("reporte");
			Map<String, String> mapReporteNombres	= (Map<String, String>)session.get("mapReporteNombres");
			
			Iterator<String> iteraKey	= mapReporte.keySet().iterator();
			List<String> litKey	= new ArrayList<String>();
			
			while(iteraKey.hasNext()) {
				litKey.add(iteraKey.next());
			}
			
			List listMapRep				= new ArrayList<Map<String, Object>>();
			Map<String, Object>	map		= null;
			List<String> listReporte	= null;
			BeanRaster beanReporte		= null;
			String strNombreJasper		= null;
			String strNombreRepMostrar	= null;
			
			map		= new HashMap<String, Object>();
			Map<String, Object> mapImg		= new HashMap<String, Object>();
			String strFileTempName			= CadenaUtil.getStr(session.get("NombreImagenReporteTemp"));
			//File fileTemporal				= new File(strRepositorioTemporal+File.separator+strFileTempName+".png");
			
			mapImg.put("strRutaImagen", strRepositorioTemporal + File.separator + strFileTempName + ".jpg");
			listMapRep.add(mapImg);
			map.put("dataReporte", new JRMapCollectionDataSource(listMapRep));
			map.put("strNombreReporte", "imagenReporte.jasper");//listTemZonificPotencialBosqueProduccionPermanente
			map.put("strNombreReporteComercial", "Previsualización mapa reporte");
			listMapReporte.add(map);
			
			for(String strKey:litKey) {
				if(strKey.equals("listBasLimAmazonia") || strKey.equals("listBasHidroRiosLagunas") || strKey.equals("listBasHidroRios100000") || 
						strKey.equals("listTemViaFerrea") || strKey.equals("listTemPrediosRurales") || strKey.equals("")) {
					continue;
				}
				strNombreRepMostrar	= mapReporteNombres.get(strKey);
				if(mapReporte.get(strKey) instanceof List) {
					listMapRep			= new ArrayList<Map<String, Object>>();
					listReporte			= (List)mapReporte.get(strKey);
					strNombreJasper		= CadenaUtil.convertirStrPrimeraMinuscula(CadenaUtil.getStr(strKey).substring(7));
					
					for(Object registro:listReporte) {//Los registros de cada reporte
						listMapRep.add(org.apache.commons.beanutils.BeanUtils.describe(registro));
					}
					map		= new HashMap<String, Object>();
					map.put("dataReporte", new JRMapCollectionDataSource(listMapRep));
					map.put("strNombreReporte", strNombreJasper+"Reporte.jasper");//listTemZonificPotencialBosqueProduccionPermanente
					map.put("strNombreReporteComercial", strNombreRepMostrar);
					listMapReporte.add(map);
				} else if(mapReporte.get(strKey) instanceof BeanRaster) {
					strNombreJasper	= CadenaUtil.convertirStrPrimeraMinuscula(CadenaUtil.getStr(strKey).substring(7));
//					if(strNombreJasper.equals("DensidadCarbonoAerea")) {
						beanReporte		= (BeanRaster)mapReporte.get(strKey);
						
						listMapRep		= new ArrayList<Map<String, Object>>();
						listMapRep.add(org.apache.commons.beanutils.BeanUtils.describe(beanReporte));
						
						//beanTemDensidadCarbonoAerea
						//listTemDensidadCarbonoAerea
						//DensidadCarbonoAerea
						map		= new HashMap<String, Object>();
						map.put("dataReporte", new JRMapCollectionDataSource(listMapRep));
						map.put("strNombreReporte", strNombreJasper+"Reporte.jasper");//listTemZonificPotencialBosqueProduccionPermanente
						map.put("strNombreReporteComercial", strNombreRepMostrar);
						listMapReporte.add(map);
//					}
				}
			}

		} catch(Exception ex) {
			if(!CadenaUtil.getStr(ex.getMessage()).equals("")) {
				addActionError("Ocurrio un error:" + ex.getMessage());
			}
		}
		return strReturn;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////
	
	public List getListMapReporte() {
		return listMapReporte;
	}

	public void setListMapReporte(List listMapReporte) {
		this.listMapReporte = listMapReporte;
	}

	public Map getParametros() {
		return parametros;
	}

	public void setParametros(Map parametros) {
		this.parametros = parametros;
	}

	
}
