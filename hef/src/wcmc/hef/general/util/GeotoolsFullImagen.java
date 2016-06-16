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
import org.geotools.data.FileDataStore;
import org.geotools.data.FileDataStoreFinder;
import org.geotools.data.collection.CollectionFeatureSource;
import org.geotools.data.collection.ListFeatureCollection;
import org.geotools.data.simple.SimpleFeatureCollection;
import org.geotools.data.simple.SimpleFeatureIterator;
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
import org.geotools.styling.Fill;
import org.geotools.styling.LineSymbolizer;
import org.geotools.styling.PolygonSymbolizer;
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

public class GeotoolsFullImagen {
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		try {
			
//			int num1_255	= (int)(Math.random()*255d);
//			System.out.println(CadenaUtil.generaColorAleatorio(50));
			
//			Integer.valueOf(num1_255, 16)
//			String.
			GeotoolsFullImagen geo	= new GeotoolsFullImagen();
			String strShapeFileDemo	= "D:\\repositorios\\documentosHef\\1460997589631\\1460997589631.shp";
			String strFileTempName	= "1458110643597";//D:\repositorios\documentosHef\1458110643597
			byte[] datos			= geo.convertirShapeToImagen(
					strShapeFileDemo, 
					"-71.31740570068358,-12.608511172331319,-70.788688659667955,-12.269224824625269", 
					770, 506);
			FileOutputStream fos	= new FileOutputStream("C:\\tmp\\DEMO.png");
			fos.write(datos);
			fos.flush();
			fos.close();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public byte[] convertirShapeToImagen(String strShapeFileDemo, String strBbox4326, int intAnchoPx, int intAltoPx) throws Exception {
		File shapeFile							= new File(strShapeFileDemo);
		shapeFile.setReadOnly();
		byte[] arrDataImage						= null;
		FileDataStore dataStore					= null;
		SimpleFeatureIterator iterator			= null;
		MathTransform transform					= null;
		try {
			dataStore							= FileDataStoreFinder.getDataStore(shapeFile);
			String typeName						= dataStore.getTypeNames()[0];
			SimpleFeatureSource featureSource	= dataStore.getFeatureSource(typeName);
			if(featureSource.getSchema() != null && 
					featureSource.getSchema().getCoordinateReferenceSystem() != null && 
					featureSource.getSchema().getCoordinateReferenceSystem().getName() != null) {
				if(featureSource.getSchema().getCoordinateReferenceSystem().getName().toString().indexOf("WGS_1984_UTM") != -1) {
					CoordinateReferenceSystem sourceCRS		= featureSource.getSchema().getCoordinateReferenceSystem();
					CoordinateReferenceSystem targetCRS		= CRS.decode("EPSG:4326", true);//WGS84
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
			
			SimpleFeatureCollection collection	= featureSource.getFeatures();
			iterator							= collection.features();
			
			int countador	= 0;
			SimpleFeatureSource featureSourceGeom		= null;
			List<Geometry> listGeom	= new ArrayList<Geometry>();
			Geometry geom		= null;
			while (iterator.hasNext()) {
				SimpleFeatureImpl featureImpl	= (SimpleFeatureImpl) iterator.next();
				if(featureImpl.getDefaultGeometry() != null) {
					geom		= (Geometry)featureImpl.getDefaultGeometry();
					if(transform != null) {
						geom		= JTS.transform(geom, transform);
					}
					listGeom.add(geom);
				}
			}
			SimpleFeatureSource feSource	= createSimpleFeatureSource(listGeom);
			arrDataImage					= saveImage(feSource, strBbox4326, intAnchoPx, intAltoPx);//TODO
			
		} catch(Exception ex) {
			ex.printStackTrace();
			throw new Exception(ex.getMessage());
		} finally {
			try {iterator.close();} catch(Exception ex) {ex.printStackTrace();}
			try {dataStore.dispose();} catch(Exception ex) {ex.printStackTrace();}
		}
		return arrDataImage;
	}

	private byte[] saveImage(SimpleFeatureSource featureSource, String strBbox4326, int intAnchoPx, int intAltoPx) throws Exception {
		MapContent mapContent			= new MapContent();
		mapContent.setTitle("StyleLab");
		
		Style style						= demoStyle(featureSource.getSchema().getTypeName());
		Layer layer						= new FeatureLayer(featureSource, style);
		mapContent.addLayer(layer);
		
		GTRenderer renderer				= new StreamingRenderer();
		renderer.setMapContent(mapContent);
		
		Rectangle imageBounds			= null;
		ReferencedEnvelope mapBounds	= null;
		String strCadenaExtent			= "";
		
		String[] arrBbox	= strBbox4326.split(",");//<xmin>, <ymin>, <xmax>, <ymax>
		System.out.println("Geotools.saveImage() strBbox4326="+strBbox4326);
		double xmin		= CadenaUtil.getDoub(arrBbox[0]);
		double ymin		= CadenaUtil.getDoub(arrBbox[1]);
		double xmax		= CadenaUtil.getDoub(arrBbox[2]);
		double ymax		= CadenaUtil.getDoub(arrBbox[3]);
		try {
			//mapBounds						= mapContent.getMaxBounds();//[minx, miny, maxx, maxy]
			mapBounds						= new ReferencedEnvelope();//[minx, miny, maxx, maxy]
			mapBounds.init(xmin, xmax, ymin, ymax);
			strCadenaExtent					= "["+mapBounds.getMinX()+","+mapBounds.getMinY()+","+mapBounds.getMaxX()+","+mapBounds.getMaxY()+"]";
			System.out.println("Geotools.saveImage() strCadenaExtent="+strCadenaExtent);
			//double heightToWidth			= mapBounds.getSpan(1) / mapBounds.getSpan(0);
			imageBounds						= new Rectangle(0, 0, intAnchoPx, intAltoPx);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		BufferedImage image				= new BufferedImage(imageBounds.width, imageBounds.height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D gr					= image.createGraphics();
		gr.setComposite(AlphaComposite.Src);
		try {
			ByteArrayOutputStream byteOut	= new ByteArrayOutputStream();
			
			renderer.paint(gr, imageBounds, mapBounds);
			ImageIO.write(image, "PNG", byteOut);
			
			return byteOut.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				mapContent.dispose();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	private SimpleFeatureSource createSimpleFeatureSource(List<Geometry> listGeom) throws Exception {
		ArrayList<SimpleFeature> list				= new ArrayList<SimpleFeature>();

		SimpleFeatureType	sft_poli		= createFeatureType_Poligon();
		SimpleFeatureBuilder sfb		= null;
		for(Geometry geom:listGeom) {
			sfb		= new SimpleFeatureBuilder(sft_poli);
			sfb.add(geom);
			
			list.add(sfb.buildFeature( "fid" ));
		}
		SimpleFeatureCollection simpFeatcollection	= new ListFeatureCollection(sft_poli, list);
		
		SimpleFeatureSource featureSourceGeom		= new CollectionFeatureSource(simpFeatcollection);
		return featureSourceGeom;
	}
	
	private static Style demoStyle(String typeName) throws Exception {
		StyleFactory sf		= CommonFactoryFinder.getStyleFactory(GeoTools.getDefaultHints());
		FilterFactory2 ff	= CommonFactoryFinder.getFilterFactory2(GeoTools.getDefaultHints());
		
//		Stroke stroke		= sf.createStroke(ff.literal(CadenaUtil.generaColorAleatorio(50)), ff.literal(2));
//		LineSymbolizer lineSymbolizer = sf.createLineSymbolizer();
//		lineSymbolizer.setStroke(stroke);
		
		Fill fill = sf.fill(null, ff.literal(CadenaUtil.generaColorAleatorio(50)), ff.literal(1.0));
		fill.setOpacity(ff.literal(0.3));
		PolygonSymbolizer polygonSymbolizer = sf.createPolygonSymbolizer();
		polygonSymbolizer.setFill(fill);
		
		Rule rule			= sf.createRule();
		rule.setFilter(Filter.INCLUDE);
		
//		rule.setSymbolizers(new Symbolizer[] { lineSymbolizer });
		rule.setSymbolizers(new Symbolizer[] { polygonSymbolizer });
		
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

}
