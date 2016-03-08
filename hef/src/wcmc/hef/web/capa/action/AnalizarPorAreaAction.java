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

import wcmc.hef.general.util.CadenaUtil;
import wcmc.hef.general.util.ConfiguracionProperties;
import wcmc.hef.general.util.Geotools;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import org.apache.commons.io.FileUtils;

public class AnalizarPorAreaAction extends ActionSupport {
	private File shapefile;
	private String shapefileContentType;
	private String shapefileFileName;
	private String shapefileCaption;
	private List<Map<String, String>> listAreaShapeSeleccionar;
	
	public String agregarShape() {
		HttpServletRequest request		= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Map<String, Object> session		= ActionContext.getContext().getSession();
		try {
			if(shapefile != null) {
				boolean blnProcesoOk	= false;
				String strFileTempName	= ""+new Date().getTime();
				List<File> listFile		= abrirZip(shapefile, strFileTempName);
				if(listFile.size() > 0) {
					try {
						List<Map<String, String>> list		= new Geotools().convertirShapeToImagen(listFile.get(0).getPath());
						if(list != null) {
							if(list.size() > 1) {
								if(list.get(0).get("mensaje") != null && !CadenaUtil.getStr(list.get(0).get("mensaje")).equals("")) {
									addActionMessage(list.get(0).get("mensaje"));
								}
								this.listAreaShapeSeleccionar	= list;
								blnProcesoOk	= true;
							} else if(list.size() == 1) {
								if(list.get(0).get("mensaje") != null && !CadenaUtil.getStr(list.get(0).get("mensaje")).equals("")) {
									addActionMessage(list.get(0).get("mensaje"));
								}
								this.listAreaShapeSeleccionar	= list;
								blnProcesoOk	= true;
							} else {
								//TODO Error no hay datos
								addActionError("No se han encontrado datos para mostrar");
							}
						}
					} catch(Exception ex) {
						this.listAreaShapeSeleccionar	= null;
						addActionError(ex.getMessage());
					}
				} else {
					addActionError("No se han encontrado archivos en el documento Zip");
				}
			} else {
				addActionError("Debe adjuntar un documento en formato Zip conteniendo el shape");
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
		String strRutaRepTemp	= ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.REPOSITORIO_DOCS_TEMPORAL);
		
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
				
				fileOut			= new File(strRutaRepTemp+File.separator+strFileTempName+"."+strExten);
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
