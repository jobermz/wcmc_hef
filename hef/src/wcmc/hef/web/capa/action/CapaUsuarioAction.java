package wcmc.hef.web.capa.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import wcmc.hef.business.core.configuracion.dto.CampoMetadataDto;
import wcmc.hef.business.core.configuracion.dto.CapaDto;
import wcmc.hef.business.core.configuracion.dto.GeometriaUsuarioDto;
import wcmc.hef.business.core.configuracion.service.CampoMetadataService;
import wcmc.hef.business.core.configuracion.service.CapaService;
import wcmc.hef.business.core.configuracion.service.GeometriaUsuarioService;
import wcmc.hef.business.core.seguridad.dto.CuentaUsuarioDto;
import wcmc.hef.dao.configuracion.domain.CampoMetadata;
import wcmc.hef.general.util.CadenaUtil;
import wcmc.hef.general.util.ConfiguracionProperties;
import wcmc.hef.general.util.GeotoolsData;
import wcmc.hef.general.util.GeotoolsFull;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;

public class CapaUsuarioAction extends ActionSupport {
	private File shapefile;
	private String shapefileContentType;
	private String shapefileFileName;
	private String shapefileCaption;
	private List<Map<String, String>> listAreaShapeSeleccionar;

	@Autowired
	private CapaService capaService;

	@Autowired
	private GeometriaUsuarioService geometriaUsuarioService;
	
	@Autowired
	private CampoMetadataService campoMetadataService;
	
	public String agregarShape() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			CuentaUsuarioDto cuentaUsuarioDto	= (CuentaUsuarioDto)session.get("USUARIO_ACTUAL");
			if(cuentaUsuarioDto != null) {
				if(shapefile != null) {
					boolean blnProcesoOk	= false;
					String strFileTempName	= ""+new Date().getTime();
					List<File> listFile		= abrirZip(shapefile, strFileTempName);
					if(listFile.size() > 0) {
						String strCadenaExtent						= new GeotoolsFull().convertirShapeToImagen(listFile.get(0).getPath(), strFileTempName);
						CapaDto capaDto								= new CapaDto();
						capaDto.setIntGrupoCapas(ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.CAPA_GRUPO_USUARIO));//Ver properties
						capaDto.setIntTipoCapa(ConfiguracionProperties.getConstanteInt(ConfiguracionProperties.TIPO_CAPA_VECTORIAL));
						capaDto.setStrNombre(shapefileFileName);
						capaDto.setStrShp(strFileTempName);
						capaDto.setStrShpExtent(strCadenaExtent);
						capaDto.setTimFechaRegistro(new Date());
						capaDto.setStrEsCentrarMapa("N");
						capaDto.setStrEsFiltroAcl("N");
						capaDto.setStrEsSelecApa("N");
						capaDto.setStrEsActiva("S");
						capaDto.setIntIdUsuario(cuentaUsuarioDto.getSrlId());
						capaService.guardar(capaDto);
						
						new GeotoolsData().guardarGeometry(capaDto.getSrlIdCapa(), geometriaUsuarioService, listFile.get(0).getPath());
						
						CampoMetadataDto campoMetadataDto			= null;
						List<String> listCampoMetadata				= new GeotoolsData().obtenerCampoMetadata(listFile.get(0).getPath());
						for(String strCampoMetadata:listCampoMetadata) {
							campoMetadataDto	= new CampoMetadataDto();
							campoMetadataDto.setIntIdCapa(capaDto.getSrlIdCapa());
							campoMetadataDto.setStrNombre(CadenaUtil.getStr(strCampoMetadata));
							campoMetadataService.guardar(campoMetadataDto);
						}
					} else {
						addActionError("No se han encontrado archivos en el documento Zip");
					}
				} else {
					addActionError("Debe adjuntar un documento en formato Zip conteniendo el shape");
				}
			} else {
				addActionError("Antes, debe autenticarse en el sistema");
			}
		} catch(Exception ex) {
			ex.printStackTrace();
			if(!CadenaUtil.getStr(ex.getMessage()).equals("")) {
				addActionError("Ocurrio un error:" + ex.getMessage());
			}
		}
		return SUCCESS;
	}
	
	private List<File> abrirZip(File fleAdjuntoZip, String strFileTempName) throws Exception {
		String strRutaRepTemp	= ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.RUTA_BASE_CAPAS_USUARIO);
		File dir	= new File(strRutaRepTemp+File.separator+strFileTempName);
		if(!dir.exists()) {
			dir.mkdirs();
		}
		File fileZip	= new File(strRutaRepTemp+File.separator+strFileTempName+".zip");
		FileUtils.copyFile(fleAdjuntoZip, fileZip);
		
		FileInputStream fileIn		= new FileInputStream(fileZip);
		ZipInputStream zis			= new ZipInputStream(fileIn);
		ZipEntry zipEntry			= null;
		File fileOut				= null;
		FileOutputStream fos		= null;
		List<File> listFile			= new ArrayList<File>();
		listFile.add(fileZip);
		while ((zipEntry=zis.getNextEntry()) != null) {
			if(!zipEntry.isDirectory()) {
				String strName	= zipEntry.getName();
				String strExten	= CadenaUtil.ultimaCadena(strName, '.');
				byte[] buffer	= CadenaUtil.getBytesOfInputStream(zis);
				
				fileOut			= new File(strRutaRepTemp+File.separator+strFileTempName+File.separator+strFileTempName+"."+strExten);
				fos				= new FileOutputStream(fileOut);
				
				if(strExten.equalsIgnoreCase("shp")) {
					listFile.add(0, fileOut);
					fos.write(buffer);
					fos.close();
				} else if(strExten.equalsIgnoreCase("prj")) {
					String strPrjFiltrado	= CadenaUtil.filtrarMetadataDeUnPRJ(new String(buffer));
					listFile.add(fileOut);
					fos.write(strPrjFiltrado.getBytes());
					fos.close();
				} else {
					listFile.add(fileOut);
					fos.write(buffer);
					fos.close();
				}
				
				zis.closeEntry();
			}
		}
		zis.close();
		
		return listFile;
	}
	public Collection<String> getActionErrors() {
		return super.getActionErrors();
	}
	public Collection<String> getActionMessages() {
		return super.getActionMessages();
	}
	public File getShapefile() {
		return shapefile;
	}

	public void setShapefile(File shapefile) {
		this.shapefile = shapefile;
	}

	public String getShapefileContentType() {
		return shapefileContentType;
	}

	public void setShapefileContentType(String shapefileContentType) {
		this.shapefileContentType = shapefileContentType;
	}

	public String getShapefileFileName() {
		return shapefileFileName;
	}

	public void setShapefileFileName(String shapefileFileName) {
		this.shapefileFileName = shapefileFileName;
	}

	public String getShapefileCaption() {
		return shapefileCaption;
	}

	public void setShapefileCaption(String shapefileCaption) {
		this.shapefileCaption = shapefileCaption;
	}

	public List<Map<String, String>> getListAreaShapeSeleccionar() {
		return listAreaShapeSeleccionar;
	}

	public void setListAreaShapeSeleccionar(
			List<Map<String, String>> listAreaShapeSeleccionar) {
		this.listAreaShapeSeleccionar = listAreaShapeSeleccionar;
	}
	
}
