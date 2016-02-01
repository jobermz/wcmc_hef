package wcmc.hef.general.util;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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

public class Geotools {
	
	public String convertir_DATUM_to_UTM17S(String strWktPoint) {
		try {
			CoordinateReferenceSystem source17CRS		= CRS.decode("EPSG:4326", true);
			CoordinateReferenceSystem targetCRS			= CRS.decode("EPSG:32717", true);
			return convertir(strWktPoint, source17CRS, targetCRS);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return "";
	}

	public String convertir_DATUM_to_UTM18S(String strWktPoint) {
		try {
			CoordinateReferenceSystem source18CRS		= CRS.decode("EPSG:4326", true);
			CoordinateReferenceSystem targetCRS			= CRS.decode("EPSG:32718", true);
			return convertir(strWktPoint, source18CRS, targetCRS);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return "";
	}

	public String convertir_DATUM_to_UTM19S(String strWktPoint) {
		try {
			CoordinateReferenceSystem source19CRS		= CRS.decode("EPSG:4326", true);
			CoordinateReferenceSystem targetCRS			= CRS.decode("EPSG:32719", true);
			return convertir(strWktPoint, source19CRS, targetCRS);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return "";
	}
	
	public String convertir_DATUM_to_UTM17N(String strWktPoint) {
		try {
			CoordinateReferenceSystem source17CRS		= CRS.decode("EPSG:4326", true);
			CoordinateReferenceSystem targetCRS			= CRS.decode("EPSG:32617", true);
			return convertir(strWktPoint, source17CRS, targetCRS);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return "";
	}

	public String convertir_DATUM_to_UTM18N(String strWktPoint) {
		try {
			CoordinateReferenceSystem source18CRS		= CRS.decode("EPSG:4326", true);
			CoordinateReferenceSystem targetCRS			= CRS.decode("EPSG:32618", true);
			return convertir(strWktPoint, source18CRS, targetCRS);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return "";
	}

	public String convertir_DATUM_to_UTM19N(String strWktPoint) {
		try {
			CoordinateReferenceSystem source19CRS		= CRS.decode("EPSG:4326", true);
			CoordinateReferenceSystem targetCRS			= CRS.decode("EPSG:32619", true);
			return convertir(strWktPoint, source19CRS, targetCRS);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return "";
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public String convertir_UTM17S_to_DATUM(String strWktPoint) {
		try {
			CoordinateReferenceSystem source17CRS		= CRS.decode("EPSG:32717", true);
			CoordinateReferenceSystem targetCRS			= CRS.decode("EPSG:4326", true);
			return convertir(strWktPoint, source17CRS, targetCRS);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return "";
	}

	public String convertir_UTM18S_to_DATUM(String strWktPoint) {
		try {
			CoordinateReferenceSystem source18CRS		= CRS.decode("EPSG:32718", true);
			CoordinateReferenceSystem targetCRS			= CRS.decode("EPSG:4326", true);
			return convertir(strWktPoint, source18CRS, targetCRS);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return "";
	}

	public String convertir_UTM19S_to_DATUM(String strWktPoint) {
		try {
			CoordinateReferenceSystem source19CRS		= CRS.decode("EPSG:32719", true);
			CoordinateReferenceSystem targetCRS			= CRS.decode("EPSG:4326", true);
			return convertir(strWktPoint, source19CRS, targetCRS);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return "";
	}

	public String convertir_UTM17N_to_DATUM(String strWktPoint) {
		try {
			CoordinateReferenceSystem source17CRS		= CRS.decode("EPSG:32617", true);
			CoordinateReferenceSystem targetCRS			= CRS.decode("EPSG:4326", true);
			return convertir(strWktPoint, source17CRS, targetCRS);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return "";
	}

	public String convertir_UTM18N_to_DATUM(String strWktPoint) {
		try {
			CoordinateReferenceSystem source18CRS		= CRS.decode("EPSG:32618", true);
			CoordinateReferenceSystem targetCRS			= CRS.decode("EPSG:4326", true);
			return convertir(strWktPoint, source18CRS, targetCRS);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return "";
	}

	public String convertir_UTM19N_to_DATUM(String strWktPoint) {
		try {
			CoordinateReferenceSystem source19CRS		= CRS.decode("EPSG:32619", true);
			CoordinateReferenceSystem targetCRS			= CRS.decode("EPSG:4326", true);
			return convertir(strWktPoint, source19CRS, targetCRS);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return "";
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public String convertir(String strWktPoint, CoordinateReferenceSystem sourceCRS, CoordinateReferenceSystem targetCRS) {
		Geometry point	= null;
		try {
			GeometryFactory geometryFactory		= JTSFactoryFinder.getGeometryFactory();
			WKTReader reader					= new WKTReader(geometryFactory);
			point								= (Geometry) reader.read(strWktPoint);
			MathTransform transform				= CRS.findMathTransform(sourceCRS, targetCRS, true);
			point								= JTS.transform(point, transform);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return point.toText();
	}
	
	
	
	public boolean validarPoligono(String strWkt) {
		try {
			GeometryFactory geometryFactory = JTSFactoryFinder.getGeometryFactory();
			WKTReader reader = new WKTReader(geometryFactory);
			Geometry point = (Geometry) reader.read(strWkt);
//			Geometry point = (Geometry) reader.read("POINT (80 340)");
			return point.isValid();
			
//			CoordinateReferenceSystem targetCRS		= CRS.decode("EPSG:4326", true);//WGS84
//			GeometryBuilder gb	= new GeometryBuilder(targetCRS);
//			WKTParser parser	= new WKTParser(gb);
//			Geometry point = (Geometry) parser.parse( "POINT (80 340)" );
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}
	
	public List<Map<String, String>> convertirShapeToImagen(String strShapeFileDemo) throws Exception {
		List<Map<String, String>> listMapShape	= new ArrayList<Map<String, String>>();
		Map<String, String> mapOutShape			= null;
		File shapeFile			= new File(strShapeFileDemo);
//		File folderFile			= new File(strJpgFileDemo_i);
//		if(!folderFile.exists()) {
//			folderFile.mkdirs();
//		}
		Map map						= new HashMap();
		map.put("url", shapeFile.toURL());
		DataStore dataStore			= null;
		FeatureIterator iterator	= null;
		MathTransform transform		= null;
		try {
			dataStore							= DataStoreFinder.getDataStore(map);
			String typeName						= dataStore.getTypeNames()[0];
			SimpleFeatureSource featureSource	= dataStore.getFeatureSource(typeName);
			
//			System.out.println("getName: " + featureSource.getSchema().getCoordinateReferenceSystem().getName());//GCS_WGS_1984, WGS_1984_UTM_Zone_17S
			
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
			
			FeatureCollection collection	= featureSource.getFeatures();
			iterator						= collection.features();
			
			int countador	= 0;
			SimpleFeatureSource featureSourceGeom		= null;
			while (iterator.hasNext()) {
				SimpleFeatureImpl featureImpl	= (SimpleFeatureImpl) iterator.next();
				if(featureImpl.getDefaultGeometry() != null && featureImpl.getDefaultGeometry() instanceof MultiPolygon) {
					MultiPolygon mult				= (MultiPolygon)featureImpl.getDefaultGeometry();
					 if(mult.getNumGeometries() > 1) {
						for (int i = 0; i < mult.getNumGeometries(); i++) {
							Geometry geom				= mult.getGeometryN(i);
							mapOutShape			= new HashMap<String, String>();
							if(transform != null) {
//								System.out.println("GEOM ANT("+i+"): " + geom);
								geom		= JTS.transform(geom, transform);
//								System.out.println("GEOM DES("+i+"): " + targetGeometry);
								featureSourceGeom		= createSimpleFeatureSource(geom);
								mapOutShape.put("mensaje", "Se recomiendo utilizar el sistema de coordenadas WGS 84 DATUM (4326)");
							} else {
								featureSourceGeom		= createSimpleFeatureSource(geom);
							}
							String strImage				= saveImage(featureSourceGeom, 80);
							mapOutShape.put("image", strImage);
							mapOutShape.put("geometry", geom.toText());
							listMapShape.add(mapOutShape);
						}
					} else if (mult.getNumGeometries() == 1) {
						if (mult.getNumGeometries() == 1) {
							for (int i = 0; i < mult.getNumGeometries(); i++) {
								Geometry geom					= mult.getGeometryN(i);
								mapOutShape			= new HashMap<String, String>();

								if(transform != null) {
//									System.out.println("GEOM ANT("+i+"): " + geom);
									geom		= JTS.transform(geom, transform);
//									System.out.println("GEOM DES("+i+"): " + targetGeometry);
									featureSourceGeom		= createSimpleFeatureSource(geom);
									mapOutShape.put("mensaje", "Se recomiendo utilizar el sistema de coordenadas WGS 84 DATUM (4326)");
								} else {
									featureSourceGeom		= createSimpleFeatureSource(geom);
								}
								String strImage				= saveImage(featureSourceGeom, 80);
								mapOutShape.put("image", strImage);
								mapOutShape.put("geometry", geom.toText());
								listMapShape.add(mapOutShape);
							}
						}
					} else {
						//TODO Error no hay ningun shape para leer
						throw new Exception("No se ha encontrado informacion cartografica para mostrar");
					}
				} else if(featureImpl.getDefaultGeometry() != null && featureImpl.getDefaultGeometry() instanceof Polygon) {
					Geometry geom				= (Polygon)featureImpl.getDefaultGeometry();
					mapOutShape			= new HashMap<String, String>();
					if(transform != null) {
//						System.out.println("GEOM ANT("+0+"): " + poly);
						geom			= JTS.transform(geom, transform);
//						System.out.println("GEOM DES("+0+"): " + targetGeometry);
						featureSourceGeom		= createSimpleFeatureSource(geom);
						mapOutShape.put("mensaje", "Se recomiendo utilizar el sistema de coordenadas WGS 84 DATUM (4326)");
					} else {
						featureSourceGeom		= createSimpleFeatureSource(geom);
					}
					String strImage				= saveImage(featureSourceGeom, 80);
					mapOutShape.put("image", strImage);
					mapOutShape.put("geometry", geom.toText());
					listMapShape.add(mapOutShape);
				} else {
					throw new Exception("Por favor utilizar solo objetos de tipo Polygon");
					//TODO Otro tipo de geometria
				}
			}
			iterator.close();
			/*
			 * ,METADATA["World",-180.0,-90.0,180.0,90.0,0.0,0.0174532925199433,0.0,1262]
			 */
		} catch(Exception ex) {
			ex.printStackTrace();
			throw new Exception(ex.getMessage());
		} finally {
			try {
				iterator.close();
				dataStore.dispose();
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		return listMapShape;
	}
	
	private SimpleFeatureSource createSimpleFeatureSource(Geometry geom) throws Exception {
		
		SimpleFeatureType	sft_poli		= createFeatureType_Poligon();
		SimpleFeatureBuilder sfb		= new SimpleFeatureBuilder(sft_poli);
		sfb.add(geom);
//		sfb.add("theName"+i);
		
		SimpleFeature feature = sfb.buildFeature( "fid" );
		
		ArrayList<SimpleFeature> list				= new ArrayList<SimpleFeature>();
		list.add(feature);
		SimpleFeatureCollection simpFeatcollection	= new ListFeatureCollection(sft_poli, list);
		
		SimpleFeatureSource featureSourceGeom		= new CollectionFeatureSource(simpFeatcollection);
		return featureSourceGeom;
	}
	
	private String saveImage(SimpleFeatureSource featureSource, final int imageWidth) throws Exception {
		
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
			double heightToWidth			= mapBounds.getSpan(1) / mapBounds.getSpan(0);
			imageBounds						= new Rectangle(0, 0, imageWidth, (int) Math.round(imageWidth * heightToWidth));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		BufferedImage image				= new BufferedImage(imageBounds.width, imageBounds.height, BufferedImage.TYPE_INT_RGB);
		Graphics2D gr					= image.createGraphics();
		gr.setPaint(Color.WHITE);
		gr.fill(imageBounds);
		
		try {
			ByteArrayOutputStream byteOut	= new ByteArrayOutputStream();
			
			renderer.paint(gr, imageBounds, mapBounds);
//			File fileToSave					= new File(file);
//			ImageIO.write(image, "jpeg", fileToSave);
			ImageIO.write(image, "jpeg", byteOut);
			
			byte[] imgBytes		= BASE64EncoderStream.encode(byteOut.toByteArray());
			
//			System.out.println("Test2.saveImage() imagePNG64=data:image/jpeg;base64," + new String(imgBytes));
			/*
			byte[] imgBytes	= BASE64DecoderStream.decode(strFile.getBytes());//Java 1.7
			BufferedImage bufImg	= ImageIO.read(new ByteArrayInputStream(imgBytes));  
			ImageIO.write(bufImg, "png", adjunto);
			*/
			return new String("data:image/jpeg;base64,"+new String(imgBytes));
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
		StyleFactory sf = CommonFactoryFinder.getStyleFactory(GeoTools.getDefaultHints());
		FilterFactory2 ff = CommonFactoryFinder.getFilterFactory2(GeoTools.getDefaultHints());
		
		Stroke stroke = sf.createStroke(ff.literal("#FF0000"), ff.literal(2));
		
		LineSymbolizer lineSymbolizer = sf.createLineSymbolizer();
		lineSymbolizer.setStroke(stroke);
		
		Rule rule = sf.createRule();
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
		builder.add("Location", Polygon.class);
		builder.length(15).add("Name", String.class); // <- 15 chars width for name field
		
		// build the type
		final SimpleFeatureType LOCATION = builder.buildFeatureType();
		
		return LOCATION;
	}
	
// private StyleFactory sf = CommonFactoryFinder.getStyleFactory();
// private FilterFactory2 ff = CommonFactoryFinder.getFilterFactory2();
// private Style createGreyscaleStyle(int band) {
// ContrastEnhancement ce = sf.contrastEnhancement(ff.literal(1.0), ContrastMethod.NORMALIZE);
// SelectedChannelType sct = sf.createSelectedChannelType(String.valueOf(band), ce);
//
// RasterSymbolizer sym = sf.getDefaultRasterSymbolizer();
// ChannelSelection sel = sf.channelSelection(sct);
// sym.setChannelSelection(sel);
//
// return SLD.wrapSymbolizers(sym);
// }
}
