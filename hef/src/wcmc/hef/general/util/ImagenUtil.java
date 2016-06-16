package wcmc.hef.general.util;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.plugins.jpeg.JPEGImageWriteParam;
import javax.imageio.stream.FileImageOutputStream;
import javax.imageio.stream.ImageOutputStream;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

public class ImagenUtil {
	
	public static void main(String[] str) {
		try {
			System.out.println("ImagenUtil.main()");
//			generateMultiPageTiff("E:\\tempVBox\\120__346_WCMC\\fuxion_images\\", "nuevaImagen");
			
			FileInputStream ins	= new FileInputStream("C:\\tmp\\1464267722707.png");
			byte[] arrData		= CadenaUtil.getBytesOfInputStream(ins);
			byte[] arrSalida		= comprimirImagenJPG(arrData, 2624, 928);
			
			FileOutputStream fos	= new FileOutputStream("C:\\tmp\\SALIDA\\transp.jpg");
			fos.write(arrSalida);
			fos.flush();
			fos.close();
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static byte[] fuxionarImagenPNG(List<byte[]> listArrByte, int intAncho, int intAlto, List<Float> listArrTransImageLayer) throws Exception {
		ByteOutputStream fos	= null;
		byte[] out				= null;
		try {
			BufferedImage imageCreate		= new BufferedImage(intAncho, intAlto, BufferedImage.TYPE_4BYTE_ABGR);
			
			Graphics2D gr					= imageCreate.createGraphics();
			for (int i = 0; i < listArrByte.size(); i++) {
				if(listArrByte.get(i) == null)
					continue;
				InputStream fis		= null;
				try {
					fis					= new BufferedInputStream(new ByteArrayInputStream(listArrByte.get(i)));
					BufferedImage image	= ImageIO.read(fis);
					if(i!=0 && i != (listArrByte.size()-1) && listArrTransImageLayer.size() > (i-1)) {
						gr.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, listArrTransImageLayer.get(i-1)));
					}
					gr.drawImage(image, null, 0, 0);
					
					image.flush();
				} finally {
					if (null != fis) {
						fis.close();
					}
				}
			}
			ByteArrayOutputStream byteOut	= new ByteArrayOutputStream();
			ImageIO.write(imageCreate, "PNG", byteOut);
			fos		= new ByteOutputStream();
			fos.write(byteOut.toByteArray());
			fos.flush();
			out		= fos.getBytes();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try{fos.close();}catch(Exception ex) {}
		}
		return out;
	}

	public static byte[] fuxionarImagenPNG(List<byte[]> listArrByte, int intAncho, int intAlto) throws Exception {
		ByteOutputStream fos	= null;
		byte[] out				= null;
		try {
			BufferedImage imageCreate		= new BufferedImage(intAncho, intAlto, BufferedImage.TYPE_4BYTE_ABGR);
			
			Graphics2D gr					= imageCreate.createGraphics();
			for (int i = 0; i < listArrByte.size(); i++) {
				if(listArrByte.get(i) == null)
					continue;
				InputStream fis		= null;
				try {
					fis					= new BufferedInputStream(new ByteArrayInputStream(listArrByte.get(i)));
					BufferedImage image	= ImageIO.read(fis);
					gr.drawImage(image, null, 0, 0);
					
					image.flush();
				} finally {
					if (null != fis) {
						fis.close();
					}
				}
			}
			ByteArrayOutputStream byteOut	= new ByteArrayOutputStream();
			ImageIO.write(imageCreate, "PNG", byteOut);
			fos		= new ByteOutputStream();
			fos.write(byteOut.toByteArray());
			fos.flush();
			out		= fos.getBytes();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try{fos.close();}catch(Exception ex) {}
		}
		return out;
	}
	
	public static byte[] tamanioImagenPNG(byte[] dataByte, int intAncho, int intAlto) throws Exception {
		ByteOutputStream fos	= null;
		byte[] out				= null;
		try {
			BufferedImage imageCreate		= new BufferedImage(intAncho, intAlto, BufferedImage.TYPE_4BYTE_ABGR);
			
			Graphics2D gr					= imageCreate.createGraphics();
			
			InputStream fis		= null;
			try {
				fis					= new BufferedInputStream(new ByteArrayInputStream(dataByte));
				BufferedImage image	= ImageIO.read(fis);
				gr.drawImage(image, 0, 0, intAncho, intAlto, null);
				image.flush();
			} finally {
				if (null != fis) {
					fis.close();
				}
			}
			
			ByteArrayOutputStream byteOut	= new ByteArrayOutputStream();
			ImageIO.write(imageCreate, "PNG", byteOut);
			fos		= new ByteOutputStream();
			fos.write(byteOut.toByteArray());
			fos.flush();
			out		= fos.getBytes();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try{fos.close();}catch(Exception ex) {}
		}
		return out;
	}
	
	public static byte[] comprimirImagenJPG(byte[] arrByte, int intAncho, int intAlto) throws Exception {
		ByteOutputStream fos	= null;
		byte[] out				= null;
		try {
			BufferedImage imageCreate		= new BufferedImage(intAncho, intAlto, BufferedImage.TYPE_3BYTE_BGR);
			
			Graphics2D gr					= imageCreate.createGraphics();
			InputStream fis		= null;
			
			
			try {
				fis					= new BufferedInputStream(new ByteArrayInputStream(arrByte));
				BufferedImage image	= ImageIO.read(fis);
				gr.drawImage(image, null, 0, 0);
				image.flush();
			} finally {
				if (null != fis) {
					fis.close();
				}
			}
			ByteArrayOutputStream byteOut	= new ByteArrayOutputStream();
			ImageOutputStream iOut			= ImageIO.createImageOutputStream(byteOut);
			
			
			JPEGImageWriteParam jpegParams = new JPEGImageWriteParam(null);
			jpegParams.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
			jpegParams.setCompressionQuality(0.8f);
			
			final ImageWriter writer = ImageIO.getImageWritersByFormatName("jpg").next();
			writer.setOutput(iOut);
			writer.write(null, new IIOImage(imageCreate, null, null), jpegParams);
			
			
			
//			ByteArrayOutputStream byteOut	= new ByteArrayOutputStream();
//			ImageIO.write(imageCreate, "PNG", byteOut);
			
			fos		= new ByteOutputStream();
			fos.write(byteOut.toByteArray());
			fos.flush();
			out		= fos.getBytes();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try{fos.close();}catch(Exception ex) {}
		}
		return out;
	}
	
	public static byte[] fuxionarImagenPNG(byte[] arrByte, int intX, int intY, byte[] arrByteAdd, int intXadd, int intYadd, int intAncho, int intAlto) throws Exception {
		ByteOutputStream fos	= null;
		byte[] out				= null;
		try {
			BufferedImage imageCreate		= new BufferedImage(intAncho, intAlto, BufferedImage.TYPE_4BYTE_ABGR);
			Graphics2D gr					= imageCreate.createGraphics();
//			for (int i = 0; i < listArrByte.size(); i++) {
				InputStream fis		= null;
				if(arrByte != null) {
					try {
						fis					= new BufferedInputStream(new ByteArrayInputStream(arrByte));
						BufferedImage image	= ImageIO.read(fis);
						gr.drawImage(image, null, intX, intY);
						image.flush();
					} finally {
						if (null != fis) {
							fis.close();
						}
					}
				}
				if(arrByteAdd != null) {
					try {
						fis					= new BufferedInputStream(new ByteArrayInputStream(arrByteAdd));
						BufferedImage image	= ImageIO.read(fis);
						gr.drawImage(image, null, intXadd, intYadd);
						image.flush();
					} finally {
						if (null != fis) {
							fis.close();
						}
					}
				}
//			}
			ByteArrayOutputStream byteOut	= new ByteArrayOutputStream();
			ImageIO.write(imageCreate, "PNG", byteOut);
			fos		= new ByteOutputStream();
			fos.write(byteOut.toByteArray());
			fos.flush();
			out		= fos.getBytes();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try{fos.close();}catch(Exception ex) {}
		}
		return out;
	}
	public static String obtenerTamanioImagen(byte[] arrByte) {
		String salida		= "";
		BufferedInputStream fis					= null;
		try {
			fis					= new BufferedInputStream(new ByteArrayInputStream(arrByte));
			BufferedImage image	= ImageIO.read(fis);
			salida		= "IMAGE: ancho="+image.getWidth()+" alto="+image.getHeight();
		} catch(Exception ex) {
		} finally {
			try{fis.close();}catch(Exception ex){}
		}
		return salida;
	}
	public static void obtenerTamanioImagenArrInt(byte[] arrByte, int[] arrSalida) {
		BufferedInputStream fis		= null;
		try {
			fis					= new BufferedInputStream(new ByteArrayInputStream(arrByte));
			BufferedImage image	= ImageIO.read(fis);
			//salida		= "IMAGE: ancho="+image.getWidth()+" alto="+image.getHeight();
			arrSalida[0]		= image.getWidth();
			arrSalida[1]		= image.getHeight();
		} catch(Exception ex) {
		} finally {
			try{fis.close();}catch(Exception ex){}
		}
	}
}
