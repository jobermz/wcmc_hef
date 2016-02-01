package wcmc.hef.general.util;

import java.util.List;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import wcmc.hef.general.vo.Mensaje;

public class Mail {
	
	private void sendInternoSolo(Mensaje mensaje) {
		try {
			String mail_envia_usuario	= ConfiguracionProperties.getConstanteStr("ConfiguracionProperties.MAIL_USUARIO");
			String mail_envia_password	= ConfiguracionProperties.getConstanteStr("ConfiguracionProperties.MAIL_PASSWORD");
			String mail_smtp			= ConfiguracionProperties.getConstanteStr("ConfiguracionProperties.MAIL_SMTP");
			String mail_port			= ConfiguracionProperties.getConstanteStr("ConfiguracionProperties.MAIL_PUERTO");
			
			// Propiedades de la conexi�n
			Properties props = new Properties();
			props.setProperty("mail.smtp.host", mail_smtp);
			props.setProperty("mail.smtp.user", mail_envia_usuario);
			props.setProperty("mail.smtp.auth", "true");
			props.setProperty("mail.smtp.starttls.enable", "false");
			props.setProperty("mail.smtp.password", mail_envia_password);
			props.setProperty("mail.smtp.port", mail_port);
			
//			props.setProperty("mail.smtp.socketFactory.port", "465");
//			props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//			props.setProperty("mail.smtp.port", "587");
			
			// Preparamos la sesi�n
			Session varSession		= Session.getDefaultInstance(props, null);

			// Construimos el mensaje
			MimeMessage message		= new MimeMessage(varSession);
			message.setFrom(new InternetAddress(mail_envia_usuario));
			
			String[] mailsPara = mensaje.getStrPara().split(",");
			for(String mail:mailsPara) {
				message.addRecipient(
						Message.RecipientType.TO,
						new InternetAddress(mail));
			}
			message.setSubject(mensaje.getStrAsunto());
//			StringBuffer sb = new StringBuffer();
//			sb.append("Estimado "+strNombre+" "+strApePat+" "+strApeMat+", la fecha de entrega del Compromiso: "+strCompromiso+" est�  pr�ximo a vencer.");
//			sb.append("\n");
//			sb.append("\n");
//			sb.append("IMPORTANTE:");
//			sb.append("\n");
//			sb.append("Este correo es informativo, favor no responder a esta direcci�n de correo, ya que no se encuentra habilitada para recibir mensajes.");
//			sb.append("El presente correo es de caracter informativo, por favor no responde.");
//			message.setText(mensaje.getStrCuerpo());
//			message.setCText(mensaje.getStrCuerpo());
			
			message.setContent(mensaje.getStrCuerpo(), "text/html");
			// Lo enviamos.
			Transport t		= varSession.getTransport("smtp");
			t.connect(mail_envia_usuario, mail_envia_password);
			t.sendMessage(message, message.getAllRecipients());
			// Cierre.
			t.close();
		} catch (Exception e){
			e.printStackTrace();
//			throw e;
		}
	}
	
	public static void main(String[] a) {
		Mail m =new Mail();
		Mensaje mensaje = new Mensaje();
		mensaje.setStrDe("knowloedge.system@gmail.com");
		mensaje.setStrPara("jober.mena@gmail.com");
		mensaje.setStrAsunto("hola mundo Mail on linux!!");
		mensaje.setStrCuerpo("Hola mundo java mail!!");
		m.sendInternoSolo(mensaje);
	}
	/*
	private void sendInternoAtt(Mensaje mensaje, List<IncidenciasFotoVO> listEncontrados) {
		try {
			String mail_envia_usuario	= ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.MAIL_USUARIO);
			String mail_envia_password	= ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.MAIL_PASSWORD);
			String mail_smtp			= ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.MAIL_SMTP);
			String mail_port			= ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.MAIL_PUERTO);
			
			// Propiedades de la conexi�n
			Properties props = new Properties();
			props.setProperty("mail.smtp.host", mail_smtp);
			props.setProperty("mail.smtp.user", mail_envia_usuario);
			props.setProperty("mail.smtp.auth", "true");
			props.setProperty("mail.smtp.starttls.enable", "false");
			props.setProperty("mail.smtp.password", mail_envia_password);
			props.setProperty("mail.smtp.port", mail_port);
			
//			props.setProperty("mail.smtp.socketFactory.port", "465");
//			props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//			props.setProperty("mail.smtp.port", "587");
			
			// Preparamos la sesi�n
			Session varSession		= Session.getDefaultInstance(props, null);

			// Construimos el mensaje
			MimeMessage message		= new MimeMessage(varSession);
			message.setFrom(new InternetAddress(mail_envia_usuario));
			
			String[] mailsPara = mensaje.getStrPara().split(",");
			for(String mail:mailsPara) {
				message.addRecipient(
						Message.RecipientType.TO,
						new InternetAddress(mail));
			}
			message.setSubject(mensaje.getStrAsunto());
//			message.setText("Welcome to JavaMail", "UTF-8", "text/html");
//			message.setContent(mensaje.getStrCuerpo(), "text/html");
			
			MimeBodyPart textPart = new MimeBodyPart();
			textPart.setHeader("Content-Type", "text/plain; charset=\"utf-8\"");
			textPart.setContent(mensaje.getStrCuerpo(), "text/html; charset=utf-8");
			textPart.setContent("<html><body>"+mensaje.getStrCuerpo()+"</body></html>", "text/html; charset=utf-8");
			
			MimeMultipart multipart = new MimeMultipart("mixed");
			multipart.addBodyPart(textPart);
			
//			MimeBodyPart imageBodypart	= new MimeBodyPart();
//			if(!CadenaUtil.getStr(strIdHtml).equals("")) {
//				FileDataSource fileDs	= new FileDataSource(filAdjunto.getAbsoluteFile());
//				imageBodypart.setDataHandler(new DataHandler(fileDs));
//				imageBodypart.setHeader("Content-ID", "<"+strIdHtml+">");
//				imageBodypart.setDisposition(MimeBodyPart.INLINE);
//				multipart.addBodyPart(imageBodypart);
//			}
			String rutaRepositorio		= ConfiguracionProperties.getConstanteStr(ConfiguracionProperties.RUTA_REPOSITORIO_DOCUMENTO);
//			String rutaArchivo			= rutaRepositorio + nombsec;
			if(listEncontrados != null) {
				for(int i = 0;i < listEncontrados.size();i++) {
					BodyPart adjunto = new MimeBodyPart();
					adjunto.setDataHandler(new DataHandler(new FileDataSource(rutaRepositorio+""+listEncontrados.get(i).getStrDocumento())));
					adjunto.setFileName(listEncontrados.get(i).getStrDocumentoNombre());
					multipart.addBodyPart(adjunto);
				}
			}
			message.setContent(multipart);
			Transport t		= varSession.getTransport("smtp");
			t.connect(mail_envia_usuario, mail_envia_password);
			t.sendMessage(message, message.getAllRecipients());
			t.close();
			System.out.println("Mail.sendInterno() SEND OK");
		} catch (Exception e){
			e.printStackTrace();
//			throw e;
		}
	}

	public void sendInternoConAdjunto(final Mensaje mensaje, final List<IncidenciasFotoVO> listEncontrados) {
		Thread proceso = new Thread() {
			public void run() {
				sendInternoAtt(mensaje, listEncontrados);
			}
		};
		proceso.start();
	}
	*/
	public void send(final Mensaje mensaje) {
		Thread proceso = new Thread() {
			public void run() {
				sendInternoSolo(mensaje);
			}
		};
		proceso.start();
	}
}
