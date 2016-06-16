package wcmc.hef.web.capa.action;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import wcmc.hef.business.core.configuracion.dto.CapaDto;
import wcmc.hef.business.core.configuracion.service.CapaService;
import wcmc.hef.business.core.seguridad.dto.CuentaUsuarioDto;
import wcmc.hef.dao.configuracion.domain.Capa;
import wcmc.hef.general.util.CadenaUtil;
import wcmc.hef.general.util.ConfiguracionProperties;
import wcmc.hef.general.util.GeotoolsFull;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

public class DownloadAction extends ActionSupport {
//	private File shapefile;
//	private String shapefileContentType;
//	private String shapefileFileName;
//	private String shapefileCaption;
//	private List<Map<String, String>> listAreaShapeSeleccionar;
	
	@Autowired
	private CapaService capaService;
	
	protected InputStream archivo;
	protected String archivoNombre;
	protected String archivoTamanio;
	private String strId;
	private String strIdCapaUsuario;
	private String strImagenReporte;

	public InputStream getArchivo() {
		Map<String, Object> session		= ActionContext.getContext().getSession();
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		try {
			if(CadenaUtil.getStrNull(strId) != null) {
				String strRepositorioTemporal	= ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.RUTA_BASE_CAPAS_USUARIO);
				String strNombreFileTemporal	= strId;
				
				CapaDto capaDto		= new CapaDto();
				capaDto.setSrlIdCapa(CadenaUtil.getInte(strId));
				Capa capa			= capaService.buscarById(capaDto);
				String strNombreFile	 = "";
				if(capa != null && capa.getStrShp() != null) {
					//strCadenaExtent+","+strFileTempName+".png"
					strNombreFile		= capa.getStrNombre();
					File fileTemporal	= new File(strRepositorioTemporal+File.separator+capa.getStrShp()+File.separator+capa.getStrShp()+".png");
					if(fileTemporal.exists()) {
						archivoNombre					= strNombreFile;
						archivoTamanio					= "" + fileTemporal.length();
						archivo							= new FileInputStream(fileTemporal);
						return archivo;
					} else {
						return returnDataNoExisteAdjunto(strNombreFile);
					}					
				} else {
					return returnDataNoExisteAdjunto(strNombreFile);
				}
			} else if(CadenaUtil.getStrNull(strIdCapaUsuario) != null) {
				String strRepositorioTemporal	= ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.RUTA_BASE_CAPAS_USUARIO);
				
				CapaDto capaDto		= new CapaDto();
				capaDto.setSrlIdCapa(CadenaUtil.getInte(strIdCapaUsuario));
				Capa capa			= capaService.buscarById(capaDto);
				String strNombreFile	 = "";
				if(capa != null && capa.getStrShp() != null) {
					strNombreFile		= capa.getStrNombre();
					File fileTemporal	= new File(strRepositorioTemporal+File.separator+capa.getStrShp()+".zip");
					if(fileTemporal.exists()) {
						archivoNombre					= strNombreFile;
						archivoTamanio					= "" + fileTemporal.length();
						archivo							= new FileInputStream(fileTemporal);
						return archivo;
					} else {
						return returnDataNoExisteAdjunto(strNombreFile);
					}					
				} else {
					return returnDataNoExisteAdjunto(strNombreFile);
				}
			} else if(CadenaUtil.getStrNull(strImagenReporte) != null) {
				String strRepositorioTemporal	= ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.REPOSITORIO_DOCS_TEMPORAL);
				File fileTemporal	= new File(strRepositorioTemporal+File.separator+strImagenReporte+".jpg");
				if(fileTemporal.exists()) {
					archivoNombre					= strImagenReporte+".jpg";
					archivoTamanio					= "" + fileTemporal.length();
					archivo							= new FileInputStream(fileTemporal);
					return archivo;
				} else {
					return returnDataNoExisteAdjunto(strImagenReporte+".png");
				}	
			} else if(strId != null && strId.equals("")) {
				return returnDataNoExisteAdjunto("otro.JPG");
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public InputStream returnDataNoExisteAdjunto(String strNombreFile) {
		String strExt				= 	CadenaUtil.ultimaCadena(strNombreFile, '.');
		if(strExt.equalsIgnoreCase("JPG") || strExt.equalsIgnoreCase("GIF") || strExt.equalsIgnoreCase("PNG") || strExt.equalsIgnoreCase("TIF") || strExt.equalsIgnoreCase("BMP")) {
			setArchivoNombre("_blank.png");
			this.archivoTamanio		= ""+arrDataImgBlank.length;
			archivo					= new ByteArrayInputStream(arrDataImgBlank);
			return archivo;
		} else {
			setArchivoNombre("No_existe_el_documento.txt");
			byte[] arrData			= "Void".getBytes();
			this.archivoTamanio		= ""+arrDataImgBlank.length;
			archivo					= new ByteArrayInputStream(arrDataImgBlank);
			return archivo;
		}
	}
	
	public String getArchivoNombre() {
		return archivoNombre;
	}

	public void setArchivoNombre(String archivoNombre) {
		this.archivoNombre = archivoNombre;
	}

	public String getArchivoTamanio() {
		return archivoTamanio;
	}

	public void setArchivoTamanio(String archivoTamanio) {
		this.archivoTamanio = archivoTamanio;
	}

	public String getStrId() {
		return strId;
	}

	public void setStrId(String strId) {
		this.strId = strId;
	}

	public String getStrImagenReporte() {
		return strImagenReporte;
	}

	public void setStrImagenReporte(String strImagenReporte) {
		this.strImagenReporte = strImagenReporte;
	}

	public String getStrIdCapaUsuario() {
		return strIdCapaUsuario;
	}

	public void setStrIdCapaUsuario(String strIdCapaUsuario) {
		this.strIdCapaUsuario = strIdCapaUsuario;
	}

	private byte[] arrDataImgBlank		= {-119,80,78,71,13,10,26,10,0,0,0,13,73,72,68,82,0,0,0,-82,0,0,0,-5,8,6,0,0,0,-13,79,-81,-86,0,0,0,1,115,82,71,66,0,-82,-50,28,-23,0,0,0,4,103,65,77,65,0,0,-79,
			-113,11,-4,97,5,0,0,0,9,112,72,89,115,0,0,14,-60,0,0,14,-60,1,-107,43,14,27,0,0,6,109,73,68,65,84,120,94,-19,-40,49,118,-38,88,24,64,-31,-97,89,-117,-103,-62,39,43,-128,21,-40,
			105,92,-71,-99,14,-105,-95,73,-25,50,-99,27,40,-19,110,90,42,55,54,43,48,43,-32,-72,8,-34,-117,-26,61,73,-128,-20,-128,48,120,-110,112,79,-18,119,14,113,4,60,-15,-12,124,-123,-108,
			116,34,-94,72,15,-23,-73,41,-118,-3,19,44,-61,61,100,-96,-12,81,-99,78,-89,-116,54,-1,-52,-10,-23,-16,-81,-6,-89,-12,-37,-28,96,-105,1,47,35,-34,-59,112,117,52,-10,9,-40,112,117,116,
			-34,19,-80,-31,-22,104,-75,5,108,-72,58,122,-101,2,54,92,97,-68,10,-72,-38,-10,-65,-61,-12,-21,-67,-67,-4,-17,-61,112,-123,-109,-125,-9,86,65,72,-122,43,36,-61,21,-110,-31,10,-55,112,
			-123,100,-72,66,50,92,33,25,-82,-112,12,87,72,-122,43,36,-61,21,-110,-31,10,-55,112,-123,100,-72,66,50,92,33,25,-82,-112,12,87,72,-122,43,36,-61,21,-110,-31,10,-55,112,-123,100,-72,66,
			50,92,33,25,-82,-112,12,87,72,-122,43,36,-61,21,-110,-31,10,-55,112,-123,100,-72,66,50,92,33,25,-82,-112,12,87,72,-122,43,36,-61,21,-110,-31,10,-55,112,-123,100,-72,66,50,92,33,25,-82,
			-112,12,87,72,-122,43,36,-61,21,-110,-31,10,-55,112,-123,100,-72,66,50,92,33,25,-82,-112,12,87,72,-122,43,36,-61,21,-110,-31,10,-55,112,-123,100,-72,66,50,92,33,25,-82,-112,12,87,72,
			-122,43,36,-61,21,-110,-31,10,-55,112,-123,100,-72,66,50,92,33,25,-82,-112,12,87,72,-122,43,36,-61,21,-110,-31,10,-55,112,-123,100,-72,66,50,92,33,25,-82,-112,12,87,72,-122,43,36,-61,21,
			-110,-31,10,-55,112,-123,100,-72,66,50,92,33,25,-82,-112,12,87,72,-122,43,36,-61,21,-110,-31,10,-55,112,-123,100,-72,66,50,92,33,25,-82,-112,12,87,72,-122,43,36,-61,21,-110,-31,10,-55,112,
			-123,100,-72,66,50,92,33,25,-82,-112,12,87,72,-122,43,36,-61,21,-110,-31,10,-55,112,-123,100,-72,66,50,92,33,25,-82,-112,12,87,72,-122,43,36,-61,21,-110,-31,10,-119,27,-18,-53,56,-6,-99,78,
			92,77,-21,-19,35,52,-67,-22,68,39,-51,49,63,14,-98,103,121,-100,87,113,-60,-121,-7,91,-68,47,-36,-23,85,-71,-8,-3,-15,75,-3,-60,75,-116,-5,-57,29,-51,102,-65,118,-34,103,-73,69,20,-59,34,70,-67,
			-6,-119,63,-54,-49,93,-21,-9,127,-29,-10,-46,-22,79,30,-46,116,-114,-60,-55,-105,120,42,-118,-72,61,-85,-73,-11,71,-39,-29,86,-31,50,-82,47,39,113,-77,-23,12,-86,47,-37,123,95,22,-73,-115,-85,-65,
			-31,-41,-5,-103,-58,85,-38,94,126,-29,-73,94,-126,-33,-20,115,57,-26,101,-36,79,-37,-35,24,-50,34,-18,-50,-105,-81,-9,99,125,17,-7,-97,-113,-31,35,-102,-5,-20,14,35,77,121,109,-57,-25,53,-41,-90,
			-77,-70,-59,-56,-21,-41,-72,-35,40,-9,81,109,-25,117,-23,-113,-57,-27,-6,118,-6,-29,24,-41,-29,87,-5,-35,-6,121,-43,62,-57,-27,-70,86,-81,-3,-12,-75,110,-40,-21,30,-73,-5,-7,50,-26,-9,111,62,37,
			79,-94,59,-119,-53,69,-66,44,-90,-57,98,20,-13,-13,-58,36,-73,74,7,-34,125,-114,-21,60,-90,124,60,70,44,-57,-99,-35,70,-15,56,72,7,93,45,-18,-12,-22,60,-26,-93,69,60,125,57,41,71,-74,93,-126,-89,
			55,-61,-8,-12,-72,-36,103,-79,26,115,-14,-27,105,53,102,-80,122,-3,41,-86,-105,91,-26,-46,-22,-48,113,109,-14,62,27,-57,-112,-42,115,117,-104,59,-42,58,71,123,30,-113,-11,92,-14,-29,54,-34,115,65,
			-102,13,-97,-29,34,-51,125,48,27,-58,-28,116,17,-117,-76,72,-13,-17,121,-89,-69,-114,-17,46,-122,-49,-41,-43,107,-23,-9,53,27,-34,-108,-65,-81,-42,-75,62,-72,-105,-41,-10,-5,-57,89,-70,60,95,-57,
			-73,87,31,-14,-14,48,-119,-39,-32,-70,14,32,-55,-17,25,-52,-30,121,81,111,111,-13,-14,61,-26,-23,-64,-49,87,103,-34,121,-38,106,72,-15,46,70,-13,-14,-11,-4,-53,88,6,-72,75,-9,-76,87,-99,-27,-5,
			-100,-58,-69,-26,-78,-51,-95,-29,-38,76,-17,-29,-82,55,-118,-81,27,-118,107,95,-21,105,-36,-33,-11,98,-76,105,-32,46,-125,-117,58,-16,94,92,126,110,-84,-13,-50,-29,27,-60,-29,-14,94,-83,123,-70,
			62,-63,90,28,-36,-53,27,-5,-123,-101,-100,93,124,-118,-31,-51,67,-67,-11,1,-117,-25,-104,-91,95,-48,98,117,54,55,-50,-54,-122,94,-66,-73,-34,67,117,-74,-89,125,93,-36,87,-117,-3,-98,-128,-33,57,
			-105,31,28,58,-114,-30,-120,-113,111,-17,112,-29,-20,107,-116,-26,-109,-104,-44,-101,39,-23,-10,-95,119,-41,-8,22,78,-105,-126,111,-23,-52,63,-19,-42,-37,-37,-100,93,-108,-105,-90,-115,-9,-52,89,
			-70,-49,-19,78,46,-29,-33,-89,127,-45,-25,-99,55,-2,71,-29,-99,-14,-19,70,-66,-52,-34,-35,-105,-105,-81,-54,73,-4,-3,41,-22,-53,96,-61,-82,-71,108,115,-24,-72,54,-7,-101,107,54,-119,-121,114,-118,
			-23,95,-26,-1,-84,-17,113,-37,-41,-70,27,-89,-67,89,-6,82,-39,54,-103,121,84,-121,-3,122,-97,-83,62,116,124,-101,-41,-6,-32,94,54,72,39,-46,14,-113,-125,34,122,-93,34,-99,121,-107,-68,-99,-58,-91,
			-5,-105,87,-37,-43,-93,87,-116,86,111,-36,97,49,42,-46,-9,-23,122,-20,-14,51,-54,-3,53,-10,83,-65,-81,87,62,-79,40,-46,-67,-45,122,76,-3,-88,-26,-14,-29,107,-85,57,46,-67,-6,-52,31,63,99,53,-74,121,
			-68,109,-74,-114,107,-101,103,-69,116,-113,-39,120,-1,99,49,-120,65,-79,26,-42,-70,-42,111,63,115,61,-82,-71,-49,-34,104,-76,-38,103,-7,124,57,-87,-4,57,-43,-2,-14,115,-43,90,-105,111,-40,114,124,111,
			-26,85,-66,-81,-79,-99,109,91,-21,67,123,-87,-27,113,-99,-4,71,-11,119,-119,33,-33,2,-18,127,-85,32,29,1,-61,21,-110,-31,10,-55,112,-123,100,-72,66,50,92,33,25,-82,-112,12,87,72,-122,43,36,-61,21,-110,
			-31,10,-55,112,-123,100,-72,66,50,92,33,25,-82,-112,12,87,72,-122,43,36,-61,21,-110,-31,10,-55,112,-123,100,-72,66,50,92,33,25,-82,-112,12,87,72,-122,43,36,-61,21,-110,-31,10,-55,112,-123,100,-72,66,50,
			92,33,25,-82,-112,12,87,72,-122,43,36,-61,21,-110,-31,10,-55,112,-123,100,-72,66,50,92,33,25,-82,-112,12,87,72,-122,43,36,-61,21,-110,-31,10,-55,112,-123,100,-72,66,50,92,33,25,-82,-112,12,87,72,-122,43,
			36,-61,21,-110,-31,10,-55,112,-123,100,-72,66,50,92,33,25,-82,-112,12,87,72,-122,43,36,-61,21,-110,-31,10,-55,112,-123,100,-72,66,50,92,33,25,-82,-112,12,87,72,-122,43,36,-61,21,-110,-31,10,-55,112,-123,
			100,-72,66,50,92,33,25,-82,-112,12,87,72,-122,43,36,-61,21,-110,-31,10,-55,112,-123,100,-72,66,50,92,33,25,-82,-112,12,87,72,-122,43,36,-61,21,-110,-31,10,-55,112,-123,100,-72,66,50,92,33,25,-82,-112,12,87,
			72,-122,43,36,-61,21,-110,-31,10,-55,112,-123,100,-72,66,50,92,33,25,-82,-112,12,87,72,-122,43,36,-61,21,-110,-31,10,-55,112,-123,100,-72,66,50,92,33,25,-82,-112,12,87,72,-122,43,36,-61,21,-110,-31,
			10,-55,112,-123,100,-72,66,50,92,33,25,-82,-112,12,87,72,-122,43,36,-61,21,-110,-31,10,-55,112,-123,100,-72,66,50,92,33,25,-82,-112,12,87,72,-122,43,36,-61,21,82,39,61,-118,-22,-81,18,69,-60,127,4,-37,
			15,51,-108,-90,-2,65,0,0,0,0,73,69,78,68,-82,66,96,-126};
	
}
