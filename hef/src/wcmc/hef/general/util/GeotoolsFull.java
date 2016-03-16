package wcmc.hef.general.util;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import org.geotools.data.DataStore;
import org.geotools.data.DataStoreFinder;
import org.geotools.data.collection.CollectionFeatureSource;
import org.geotools.data.collection.ListFeatureCollection;
import org.geotools.data.simple.SimpleFeatureCollection;
import org.geotools.data.simple.SimpleFeatureSource;
import org.geotools.factory.CommonFactoryFinder;
import org.geotools.factory.GeoTools;
import org.geotools.feature.FeatureCollection;
import org.geotools.feature.FeatureIterator;
import org.geotools.feature.simple.SimpleFeatureBuilder;
import org.geotools.feature.simple.SimpleFeatureImpl;
import org.geotools.feature.simple.SimpleFeatureTypeBuilder;
import org.geotools.geometry.jts.JTS;
import org.geotools.geometry.jts.JTSFactoryFinder;
import org.geotools.geometry.jts.ReferencedEnvelope;
import org.geotools.map.FeatureLayer;
import org.geotools.map.Layer;
import org.geotools.map.MapContent;
import org.geotools.referencing.CRS;
import org.geotools.referencing.crs.DefaultGeographicCRS;
import org.geotools.renderer.GTRenderer;
import org.geotools.renderer.lite.StreamingRenderer;
import org.geotools.styling.FeatureTypeStyle;
import org.geotools.styling.LineSymbolizer;
import org.geotools.styling.Rule;
import org.geotools.styling.Stroke;
import org.geotools.styling.Style;
import org.geotools.styling.StyleFactory;
import org.geotools.styling.Symbolizer;
import org.opengis.feature.simple.SimpleFeature;
import org.opengis.feature.simple.SimpleFeatureType;
import org.opengis.filter.Filter;
import org.opengis.filter.FilterFactory2;
import org.opengis.referencing.crs.CoordinateReferenceSystem;
import org.opengis.referencing.operation.MathTransform;

import com.sun.mail.util.BASE64EncoderStream;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.MultiPolygon;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.io.WKTReader;

public class GeotoolsFull {
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		try {
			
//			int num1_255	= (int)(Math.random()*255d);
//			System.out.println(CadenaUtil.generaColorAleatorio(50));
			
//			Integer.valueOf(num1_255, 16)
//			String.
			GeotoolsFull geo	= new GeotoolsFull();
			String strShapeFileDemo	= "D:\\repositorios\\documentosHef\\1458103666251\\1458103666251.shp";
			String strFileTempName	= "1458103666251";
			geo.convertirShapeToImagen(strShapeFileDemo, strFileTempName);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	public String convertirShapeToImagen(String strShapeFileDemo, String strFileTempName) throws Exception {
		List<Map<String, String>> listMapShape	= new ArrayList<Map<String, String>>();
		Map<String, String> mapOutShape			= null;
		File shapeFile			= new File(strShapeFileDemo);
		String strCadenaExtent	= "";
		Map map						= new HashMap();
		map.put("url", shapeFile.toURL());
		DataStore dataStore			= null;
		FeatureIterator iterator	= null;
		MathTransform transform		= null;
		try {
			dataStore							= DataStoreFinder.getDataStore(map);
			String typeName						= dataStore.getTypeNames()[0];
			SimpleFeatureSource featureSource	= dataStore.getFeatureSource(typeName);
			
			if(featureSource.getSchema() != null && 
					featureSource.getSchema().getCoordinateReferenceSystem() != null && 
					featureSource.getSchema().getCoordinateReferenceSystem().getName() != null) {
				if(featureSource.getSchema().getCoordinateReferenceSystem().getName().toString().indexOf("WGS_1984_UTM") != -1) {
					CoordinateReferenceSystem sourceCRS		= featureSource.getSchema().getCoordinateReferenceSystem();
					CoordinateReferenceSystem targetCRS		= CRS.decode("EPSG:4326", true);//WGS84
					//CoordinateReferenceSystem targetCRS = CRS.decode("EPSG:32717");//WGS_1984_UTM_Zone_17S
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
			
			strCadenaExtent		= saveImage(featureSource, 4096, strFileTempName);
			
		} catch(Exception ex) {
			ex.printStackTrace();
			throw new Exception(ex.getMessage());
		} finally {
			try {
				dataStore.dispose();
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		return strCadenaExtent;
	}
	
	private String saveImage(SimpleFeatureSource featureSource, final int imageWidth, String strFileTempName) throws Exception {
		String strRutaRepTemp	= ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.RUTA_BASE_CAPAS_USUARIO);
		MapContent mapContent			= new MapContent();
		mapContent.setTitle("StyleLab");
		
		Style style						= demoStyle(featureSource.getSchema().getTypeName());
		Layer layer						= new FeatureLayer(featureSource, style);
		mapContent.addLayer(layer);
		
		GTRenderer renderer				= new StreamingRenderer();
		renderer.setMapContent(mapContent);
		
		Rectangle imageBounds			= null;
		ReferencedEnvelope mapBounds	= null;
		String strCadenaExtent	= "";
		try {
			mapBounds						= mapContent.getMaxBounds();//[minx, miny, maxx, maxy]
			strCadenaExtent	= "["+mapBounds.getMinX()+","+mapBounds.getMinY()+","+mapBounds.getMaxX()+","+mapBounds.getMaxY()+"]";
			System.out.println("Geotools.saveImage() strCadenaExtent="+strCadenaExtent);
			double heightToWidth			= mapBounds.getSpan(1) / mapBounds.getSpan(0);
			imageBounds						= new Rectangle(0, 0, imageWidth, (int) Math.round(imageWidth * heightToWidth));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
//      int imageType = preserveAlpha ? BufferedImage.TYPE_INT_RGB : BufferedImage.TYPE_INT_ARGB;

		BufferedImage image				= new BufferedImage(imageBounds.width, imageBounds.height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D gr					= image.createGraphics();
		gr.setComposite(AlphaComposite.Src);
		try {
			ByteArrayOutputStream byteOut	= new ByteArrayOutputStream();
			
			renderer.paint(gr, imageBounds, mapBounds);
//			ImageIO.write(image, "jpeg", fileToSave);
			ImageIO.write(image, "PNG", byteOut);
			
//			String writerNames[] = ImageIO.getWriterFormatNames();
//			for(String str:writerNames) {
//				System.out.println("FORMAT="+str);
//			}
			
			FileOutputStream fos	= new FileOutputStream(strRutaRepTemp+File.separator+strFileTempName+File.separator+strFileTempName+".png");
			fos.write(byteOut.toByteArray());
			fos.flush();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			try {
				mapContent.dispose();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return strCadenaExtent;
	}

	private String saveImageORIG(SimpleFeatureSource featureSource, final int imageWidth) throws Exception {
		
		MapContent mapContent			= new MapContent();
		
		mapContent.setTitle("StyleLab");
		
		Style style						= demoStyle(featureSource.getSchema().getTypeName());
		
		Layer layer						= new FeatureLayer(featureSource, style);
		mapContent.addLayer(layer);
		
		GTRenderer renderer				= new StreamingRenderer();
		renderer.setMapContent(mapContent);
		
		Rectangle imageBounds			= null;
		ReferencedEnvelope mapBounds	= null;
		try {
			mapBounds						= mapContent.getMaxBounds();
			System.out.println("Geotools.saveImage() mapBounds="+mapBounds);
			double heightToWidth			= mapBounds.getSpan(1) / mapBounds.getSpan(0);
			imageBounds						= new Rectangle(0, 0, imageWidth, (int) Math.round(imageWidth * heightToWidth));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
//        int imageType = preserveAlpha ? BufferedImage.TYPE_INT_RGB : BufferedImage.TYPE_INT_ARGB;
//        int imageType = preserveAlpha ? BufferedImage.TYPE_INT_RGB : BufferedImage.TYPE_INT_ARGB;
		BufferedImage image				= new BufferedImage(imageBounds.width, imageBounds.height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D gr					= image.createGraphics();
		gr.setPaint(Color.WHITE);
		gr.fill(imageBounds);
		
		try {
			ByteArrayOutputStream byteOut	= new ByteArrayOutputStream();
			
			renderer.paint(gr, imageBounds, mapBounds);
//			File fileToSave					= new File(file);
//			ImageIO.write(image, "jpeg", fileToSave);
			ImageIO.write(image, "jpeg", byteOut);
			/*
			String strFileTempName	= ""+new Date().getTime();
			FileOutputStream fos	= new FileOutputStream("D:\\repositorios\\documentosHef\\image_demo_"+strFileTempName+".jpg");
			fos.write(byteOut.toByteArray());
			fos.flush();
			fos.close();
			*/
			byte[] imgBytes		= BASE64EncoderStream.encode(byteOut.toByteArray());
			
//			System.out.println("Test2.saveImage() imagePNG64=data:image/jpeg;base64," + new String(imgBytes));
			/*
			byte[] imgBytes	= BASE64DecoderStream.decode(strFile.getBytes());//Java 1.7
			BufferedImage bufImg	= ImageIO.read(new ByteArrayInputStream(imgBytes));  
			ImageIO.write(bufImg, "png", adjunto);
			*/
			return new String("data:image/jpeg;base64,"+new String(imgBytes));
//			return "";
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			try {
				mapContent.dispose();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	private static Style demoStyle(String typeName) throws Exception {
		StyleFactory sf		= CommonFactoryFinder.getStyleFactory(GeoTools.getDefaultHints());
		FilterFactory2 ff	= CommonFactoryFinder.getFilterFactory2(GeoTools.getDefaultHints());
		Stroke stroke		= sf.createStroke(ff.literal(CadenaUtil.generaColorAleatorio(50)), ff.literal(2));
		
		LineSymbolizer lineSymbolizer = sf.createLineSymbolizer();
		lineSymbolizer.setStroke(stroke);
		
		Rule rule			= sf.createRule();
		rule.setFilter(Filter.INCLUDE);
		
		rule.setSymbolizers(new Symbolizer[] { lineSymbolizer });
		
		FeatureTypeStyle type = sf.createFeatureTypeStyle();
		type.setFeatureTypeName(typeName);
		type.addRule(rule);
		
		Style style = sf.createStyle();
		style.addFeatureTypeStyle(type);
		
		return style;
	}
	
	private static SimpleFeatureType createFeatureType_Poligon() {
		SimpleFeatureTypeBuilder builder = new SimpleFeatureTypeBuilder();
		builder.setName("Location");
		builder.setCRS(DefaultGeographicCRS.WGS84); // <- Coordinate reference system
		
		// add attributes in order
		builder.add("Location", MultiPolygon.class);
		builder.length(30).add("Name", String.class); // <- 15 chars width for name field
		
		// build the type
		final SimpleFeatureType LOCATION = builder.buildFeatureType();
		
		return LOCATION;
	}

	private SimpleFeatureSource createSimpleFeatureSource(List<Geometry> listGeom) throws Exception {
		
		SimpleFeatureType	sft_poli		= createFeatureType_Poligon();
		SimpleFeatureBuilder sfb		= new SimpleFeatureBuilder(sft_poli);
//		for(Geometry geom:listGeom){
//			sfb.add(geom);
//		}
		
//		sfb.add("theName"+i);
		
		SimpleFeature feature = sfb.buildFeature( "fid" );
		
		ArrayList<SimpleFeature> list				= new ArrayList<SimpleFeature>();
		list.add(feature);
		SimpleFeatureCollection simpFeatcollection	= new ListFeatureCollection(sft_poli, list);
		
		SimpleFeatureSource featureSourceGeom		= new CollectionFeatureSource(simpFeatcollection);
		return featureSourceGeom;
	}
	
}
