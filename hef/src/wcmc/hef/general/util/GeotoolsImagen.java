package wcmc.hef.general.util;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import org.geotools.data.collection.CollectionFeatureSource;
import org.geotools.data.collection.ListFeatureCollection;
import org.geotools.data.simple.SimpleFeatureCollection;
import org.geotools.data.simple.SimpleFeatureSource;
import org.geotools.factory.CommonFactoryFinder;
import org.geotools.factory.GeoTools;
import org.geotools.feature.simple.SimpleFeatureBuilder;
import org.geotools.feature.simple.SimpleFeatureTypeBuilder;
import org.geotools.geometry.jts.ReferencedEnvelope;
import org.geotools.map.FeatureLayer;
import org.geotools.map.Layer;
import org.geotools.map.MapContent;
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

import com.sun.mail.util.BASE64EncoderStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.MultiPolygon;
import com.vividsolutions.jts.io.WKTReader;

public class GeotoolsImagen {
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		try {

			GeotoolsImagen geo	= new GeotoolsImagen();
//			String strShapeFileDemo	= "LINESTRING(1 2, 3 4)";
			String strShapeFileDemo	= "POLYGON ((30 10, 40 40, 20 40, 10 20, 30 10))";
			byte[] data	= geo.convertirShapeToImagen(strShapeFileDemo, 256, 256);
			
			FileOutputStream fos	= new FileOutputStream("C:\\tmp\\img.png");
			fos.write(data);
			fos.flush();
			fos.close();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public byte[] convertirShapeToImagen(String strWkt, int intAncho, int intAlto) throws Exception {
		WKTReader reader	= new WKTReader( new GeometryFactory() );
//		Geometry point		= (Geometry) reader.read("LINESTRING(1 2, 3 4)");
		Geometry point		= (Geometry) reader.read(strWkt);
		try {
			List<Geometry> listGeom	= new ArrayList<Geometry>();
			listGeom.add(point);
			SimpleFeatureSource feSource	= createSimpleFeatureSource(listGeom);
			
			return saveImage(feSource, intAncho, intAlto);
		} catch(Exception ex) {
			ex.printStackTrace();
			throw new Exception(ex.getMessage());
		} finally {
		}
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
	
	private byte[] saveImage(SimpleFeatureSource featureSource, int imageWidth, int imageHeight) throws Exception {
		ByteOutputStream fos	= null;
		byte[] arrByte			= null;
//		String strRutaRepTemp	= ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.REPOSITORIO_DOCS_TEMPORAL);
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
			//System.out.println("Geotools.saveImage() strCadenaExtent="+strCadenaExtent);
			double heightToWidth			= mapBounds.getSpan(1) / mapBounds.getSpan(0);
			imageBounds						= new Rectangle(0, 0, imageWidth, imageHeight);
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
			
			fos	= new ByteOutputStream();
//			FileOutputStream fos	= new FileOutputStream(strRutaRepTemp+File.separator+strFileTempName+".png");
			fos.write(byteOut.toByteArray());
			fos.flush();
			arrByte	= fos.getBytes();
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			try {mapContent.dispose();} catch (Exception e) {e.printStackTrace();}
			try {fos.close();} catch (Exception e) {e.printStackTrace();}
		}
		return arrByte;
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
		
		Stroke stroke		= sf.createStroke(ff.literal("#0000FF"), ff.literal(5));
		stroke.setOpacity(ff.literal(0.5));
//		Stroke stroke		= sf.createStroke(ff.literal(CadenaUtil.generaColorAleatorio(50)), ff.literal(2));
		LineSymbolizer lineSymbolizer = sf.createLineSymbolizer();
		lineSymbolizer.setStroke(stroke);
		
//		Fill fill = sf.fill(null, ff.literal(CadenaUtil.generaColorAleatorio(50)), ff.literal(1.0));
		Fill fill = sf.fill(null, ff.literal("#FFFFFF"), ff.literal(1.0));
		fill.setOpacity(ff.literal(0.25));
		PolygonSymbolizer polygonSymbolizer = sf.createPolygonSymbolizer();
		polygonSymbolizer.setFill(fill);
		
		Rule rule			= sf.createRule();
		rule.setFilter(Filter.INCLUDE);
//		rule.setSymbolizers(new Symbolizer[] { polygonSymbolizer });
		rule.setSymbolizers(new Symbolizer[] { lineSymbolizer });
//		rule.setSymbolizers(new Symbolizer[] { lineSymbolizer, polygonSymbolizer });
		
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

//	private SimpleFeatureSource createSimpleFeatureSource(List<Geometry> listGeom) throws Exception {
//		
//		SimpleFeatureType	sft_poli		= createFeatureType_Poligon();
//		SimpleFeatureBuilder sfb		= new SimpleFeatureBuilder(sft_poli);
////		for(Geometry geom:listGeom){
////			sfb.add(geom);
////		}
//		
////		sfb.add("theName"+i);
//		
//		SimpleFeature feature = sfb.buildFeature( "fid" );
//		
//		ArrayList<SimpleFeature> list				= new ArrayList<SimpleFeature>();
//		list.add(feature);
//		SimpleFeatureCollection simpFeatcollection	= new ListFeatureCollection(sft_poli, list);
//		
//		SimpleFeatureSource featureSourceGeom		= new CollectionFeatureSource(simpFeatcollection);
//		return featureSourceGeom;
//	}
	
}
