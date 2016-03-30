package wcmc.hef.general.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.geotools.data.FileDataStore;
import org.geotools.data.FileDataStoreFinder;
import org.geotools.data.simple.SimpleFeatureCollection;
import org.geotools.data.simple.SimpleFeatureIterator;
import org.geotools.data.simple.SimpleFeatureSource;
import org.geotools.feature.simple.SimpleFeatureImpl;
import org.geotools.geometry.jts.JTS;
import org.geotools.referencing.CRS;
import org.opengis.referencing.crs.CoordinateReferenceSystem;
import org.opengis.referencing.operation.MathTransform;

import wcmc.hef.business.core.configuracion.dto.GeometriaUsuarioDto;
import wcmc.hef.business.core.configuracion.service.GeometriaUsuarioService;

import com.vividsolutions.jts.geom.Geometry;

public class GeotoolsData {
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		try {
			
//			int num1_255	= (int)(Math.random()*255d);
//			System.out.println(CadenaUtil.generaColorAleatorio(50));
			
//			Integer.valueOf(num1_255, 16)
//			String.
			GeotoolsData geo	= new GeotoolsData();
			String strShapeFileDemo	= "D:\\repositorios\\documentosHef\\1458110643597\\1458110643597.shp";
			String strFileTempName	= "1458110643597";//D:\repositorios\documentosHef\1458110643597
//			geo.convertirShapeToImagen(strShapeFileDemo, strFileTempName);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void guardarGeometry(Integer srlIdCapa, GeometriaUsuarioService geometriaUsuarioService, String strRutaShp) throws Exception {
		File shapeFile							= new File(strRutaShp);
		shapeFile.setReadOnly();
		FileDataStore dataStore					= null;
		SimpleFeatureIterator iterator			= null;
		try {
			dataStore								= FileDataStoreFinder.getDataStore(shapeFile);
			String typeName							= dataStore.getTypeNames()[0];
			SimpleFeatureSource featureSource		= dataStore.getFeatureSource(typeName);
			for(String str:dataStore.getTypeNames()) {
				System.out.println("str: "+str);
			}
			
			MathTransform transform					= null;
			CoordinateReferenceSystem sourceCRS		= featureSource.getSchema().getCoordinateReferenceSystem();
			CoordinateReferenceSystem targetCRS		= CRS.decode("EPSG:4326", true);//WGS84
			//transform								= CRS.findMathTransform(sourceCRS, targetCRS, false);
			if(featureSource.getSchema() != null && 
					featureSource.getSchema().getCoordinateReferenceSystem() != null && 
					featureSource.getSchema().getCoordinateReferenceSystem().getName() != null) {
				if(featureSource.getSchema().getCoordinateReferenceSystem().getName().toString().indexOf("WGS_1984_UTM") != -1) {
					transform								= CRS.findMathTransform(sourceCRS, targetCRS, false);
				} else if(!featureSource.getSchema().getCoordinateReferenceSystem().getName().equals("GCS_WGS_1984")) {
					//OK
				} else {
					throw new Exception("Por favor utilizar el sistema de coordenadas WGS 84 DATUM (4326).");
				}
			} else {
				throw new Exception("No se encontro informaci�n de proyecciones validas (PRJ)");
				//TODO No se encontro informaci�n sobre alguna proyeccion valida
			}
			GeometriaUsuarioDto geometriaUsuarioDto		= null;
			SimpleFeatureCollection collection		= featureSource.getFeatures();
			iterator								= collection.features();
//			Map<String, String> mapCurrData			= null;
			String strNombreColumna					= "";
			String strTipoDatoColumna				= "";
			StringBuffer sbData						= new StringBuffer();
			while (iterator.hasNext()) {
				sbData				= new StringBuffer();
				geometriaUsuarioDto	= new GeometriaUsuarioDto();
				SimpleFeatureImpl featureImpl	= (SimpleFeatureImpl) iterator.next();
				if(featureImpl.getDefaultGeometry() != null) {
					Geometry geom	= (Geometry)featureImpl.getDefaultGeometry();
					if(transform != null) {
						geom	= (Geometry)JTS.transform(geom, transform);
					}
//					mapCurrData.put("geometry", geom.toText());
					geometriaUsuarioDto.setStrGeometry(geom.toText());
				}
				for (int i = 0; i < featureImpl.getFeatureType().getAttributeDescriptors().size(); i++) {
					strNombreColumna	= featureImpl.getFeatureType().getAttributeDescriptors().get(i).getLocalName();
					strTipoDatoColumna	= featureImpl.getFeatureType().getAttributeDescriptors().get(i).getType().toString();
					if(strTipoDatoColumna.indexOf("<String>") != -1) {
						if(sbData.length() > 0) {
							sbData.append("||");
						}
						sbData.append(CadenaUtil.getStr(featureImpl.getAttribute(strNombreColumna)));
					} else if(strTipoDatoColumna.indexOf("<Long>") != -1) {
						if(sbData.length() > 0) {
							sbData.append("||");
						}
						sbData.append(CadenaUtil.getStr(featureImpl.getAttribute(strNombreColumna)));
					} else if(strTipoDatoColumna.indexOf("<Integer>") != -1) {
						if(sbData.length() > 0) {
							sbData.append("||");
						}
						sbData.append(CadenaUtil.getStr(featureImpl.getAttribute(strNombreColumna)));
					} else if(strTipoDatoColumna.indexOf("<Float>") != -1) {
						if(sbData.length() > 0) {
							sbData.append("||");
						}
						sbData.append(CadenaUtil.getStr(featureImpl.getAttribute(strNombreColumna)));
					} else if(strTipoDatoColumna.indexOf("<Double>") != -1) {
						if(sbData.length() > 0) {
							sbData.append("||");
						}
						sbData.append(CadenaUtil.getDoubleRedondeo(CadenaUtil.getDoub(featureImpl.getAttribute(strNombreColumna))));
					} else if(strTipoDatoColumna.indexOf("<Date>") != -1) {
						if(sbData.length() > 0) {
							sbData.append("||");
						}
						sbData.append(CadenaUtil.getStrDate((Date)featureImpl.getAttribute(strNombreColumna)));
					} else if(strTipoDatoColumna.indexOf("<MultiPolygon>") != -1 || strTipoDatoColumna.indexOf("<Point>") != -1 || strTipoDatoColumna.indexOf("<Polygon>") != -1 || strTipoDatoColumna.indexOf("<MultiLineString>") != -1) {
						//mapCurrData.put(CadenaUtil.getStr(strNombreColumna).toLowerCase(), CadenaUtil.getStr(featureImpl.getAttribute(strNombreColumna)));
					}
				}
				geometriaUsuarioDto.setIntIdCapa(srlIdCapa);
				geometriaUsuarioDto.setStrData(sbData.toString());
				geometriaUsuarioService.insert(geometriaUsuarioDto);
				
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			try{iterator.close();}catch(Exception ex2) {ex2.printStackTrace();}
			try{dataStore.dispose();}catch(Exception ex2) {ex2.printStackTrace();}
		}
	    dataStore = null;
//	    return listMapData;
	}

	public List<String> obtenerCampoMetadata(String strRutaShp) throws Exception {
		File shapeFile							= new File(strRutaShp);
		shapeFile.setReadOnly();
		FileDataStore dataStore					= null;
		List<String> listMapData				= new ArrayList<String>();
		SimpleFeatureIterator iterator			= null;
		try {
			dataStore								= FileDataStoreFinder.getDataStore(shapeFile);
			String typeName							= dataStore.getTypeNames()[0];
			SimpleFeatureSource featureSource		= dataStore.getFeatureSource(typeName);
			for(String str:dataStore.getTypeNames()) {
				System.out.println("str: "+str);
			}
			
			SimpleFeatureCollection collection		= featureSource.getFeatures();
			iterator								= collection.features();
			String strNombreColumna					= "";
			if (iterator.hasNext()) {
				SimpleFeatureImpl featureImpl	= (SimpleFeatureImpl) iterator.next();
				for (int i = 0; i < featureImpl.getFeatureType().getAttributeDescriptors().size(); i++) {
					strNombreColumna	= featureImpl.getFeatureType().getAttributeDescriptors().get(i).getLocalName();
					listMapData.add(strNombreColumna);
				}
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			try{iterator.close();}catch(Exception ex2) {ex2.printStackTrace();}
			try{dataStore.dispose();}catch(Exception ex2) {ex2.printStackTrace();}
		}
	    dataStore = null;
	    return listMapData;
	}
	
	public List<Map<String, Object>> filtrarOcurrenciasListGid(String strRutaShp, List<Integer> listGid) throws Exception {
		File shapeFile							= new File(strRutaShp);
		shapeFile.setReadOnly();
		FileDataStore dataStore					= null;
		List<Map<String, Object>> listMapData	= new ArrayList<Map<String, Object>>();
		SimpleFeatureIterator iterator			= null;
		try {
			dataStore								= FileDataStoreFinder.getDataStore(shapeFile);
			String typeName							= dataStore.getTypeNames()[0];
			SimpleFeatureSource featureSource		= dataStore.getFeatureSource(typeName);
			
			SimpleFeatureCollection collection		= featureSource.getFeatures();
			iterator								= collection.features();
			int countador							= 0;
			List<String> tiposBD					= Arrays.asList(new String[]{"String", "Long", "Integer", "Float", "Double"});
			Map<String, Object> mapCurrData			= null;
			String strNombreColumna					= "";
			String strTipoDatoColumna				= "";
			boolean incluirRespuesta				= false;
			while (iterator.hasNext()) {
				mapCurrData						= new HashMap<String, Object>();
				SimpleFeatureImpl featureImpl	= (SimpleFeatureImpl) iterator.next();
				incluirRespuesta				= false;
				for (int i = 0; i < featureImpl.getFeatureType().getAttributeDescriptors().size(); i++) {
					strNombreColumna	= featureImpl.getFeatureType().getAttributeDescriptors().get(i).getLocalName();
					if(featureImpl.getFeatureType().getAttributeDescriptors().get(i).getType().isIdentified() &&
							listGid.contains(CadenaUtil.getInte(featureImpl.getAttribute(strNombreColumna)))) {
						incluirRespuesta	= true;
					}
				}
				if(incluirRespuesta) {
					for (int i = 0; i < featureImpl.getFeatureType().getAttributeDescriptors().size(); i++) {
						strNombreColumna	= featureImpl.getFeatureType().getAttributeDescriptors().get(i).getLocalName();
						strTipoDatoColumna	= featureImpl.getFeatureType().getAttributeDescriptors().get(i).getType().toString();
						if(strTipoDatoColumna.indexOf("<String>") != -1) {
							mapCurrData.put(CadenaUtil.getStr(strNombreColumna).toLowerCase(), CadenaUtil.getStr(featureImpl.getAttribute(strNombreColumna)));
						} else if(strTipoDatoColumna.indexOf("<Long>") != -1) {
							mapCurrData.put(CadenaUtil.getStr(strNombreColumna).toLowerCase(), CadenaUtil.getStr(featureImpl.getAttribute(strNombreColumna)));
						} else if(strTipoDatoColumna.indexOf("<Integer>") != -1) {
							mapCurrData.put(CadenaUtil.getStr(strNombreColumna).toLowerCase(), CadenaUtil.getStr(featureImpl.getAttribute(strNombreColumna)));
						} else if(strTipoDatoColumna.indexOf("<Float>") != -1) {
							mapCurrData.put(CadenaUtil.getStr(strNombreColumna).toLowerCase(), CadenaUtil.getStr(featureImpl.getAttribute(strNombreColumna)));
						} else if(strTipoDatoColumna.indexOf("<Double>") != -1) {
							mapCurrData.put(CadenaUtil.getStr(strNombreColumna).toLowerCase(), CadenaUtil.getStr(featureImpl.getAttribute(strNombreColumna)));
						} else if(strTipoDatoColumna.indexOf("<Date>") != -1) {
							mapCurrData.put(CadenaUtil.getStr(strNombreColumna).toLowerCase(), CadenaUtil.getStr(featureImpl.getAttribute(strNombreColumna)));
						} else if(strTipoDatoColumna.indexOf("<MultiPolygon>") != -1 || strTipoDatoColumna.indexOf("<Point>") != -1 || strTipoDatoColumna.indexOf("<Polygon>") != -1 || strTipoDatoColumna.indexOf("<MultiLineString>") != -1) {
							//mapCurrData.put(CadenaUtil.getStr(strNombreColumna).toLowerCase(), CadenaUtil.getStr(featureImpl.getAttribute(strNombreColumna)));
						} else {
							mapCurrData.put(CadenaUtil.getStr(strNombreColumna).toLowerCase(), CadenaUtil.getStr(featureImpl.getAttribute(strNombreColumna)));
						}
					}
				}
				listMapData.add(mapCurrData);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			try{iterator.close();}catch(Exception ex2) {ex2.printStackTrace();}
			try{dataStore.dispose();}catch(Exception ex2) {ex2.printStackTrace();}
		}
	    return listMapData;
	}
	
}
