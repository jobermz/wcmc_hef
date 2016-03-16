package wcmc.hef.general.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class CadenaUtil {
	private static SimpleDateFormat simpleDia			= new SimpleDateFormat("dd/MM/yyyy");
	private static SimpleDateFormat simpleDiaCorto		= new SimpleDateFormat("d/M/yyyy");
	private static SimpleDateFormat simpleMes			= new SimpleDateFormat("MMMMM");
	private static SimpleDateFormat simpleHora			= new SimpleDateFormat("HH:mm:ss");
	private static SimpleDateFormat simpleHoraMinuto	= new SimpleDateFormat("HH:mm");
	private static SimpleDateFormat simpleHoraJunto			= new SimpleDateFormat("HHmm");
	private static SimpleDateFormat simpleDiaHoraMinuto	= new SimpleDateFormat("dd/MM/yyyy HH:mm");
	
	private static SimpleDateFormat simpleFecha 		= new SimpleDateFormat("dd");
	private static SimpleDateFormat simpleFechaSimp		= new SimpleDateFormat("d");
	private static SimpleDateFormat simpleMES			= new SimpleDateFormat("MM");
//	private static SimpleDateFormat simpleMes			= new SimpleDateFormat("MM");
	private static SimpleDateFormat simpleAnio			= new SimpleDateFormat("yyyy");
	private static Calendar calendar	= new GregorianCalendar();

	public static String getStr(String str) {
		return str != null && !str.trim().equals("") ? str.trim() : "";
	}
	public static String getStrNoTrim(String str) {
		return str != null && !str.equals("") ? str : "";
	}
	
	public static String getStrNull(String str) {
		return str != null && !str.trim().equals("") ? str.trim() : null;
	}
	
	public static String getStr(Object obj) {
		return obj != null && !obj.toString().trim().equals("") ? obj.toString().trim() : "";
	}
	
	public static String getStrComaFromArray(String[] arr) {
		String str	= "";
		if(arr != null) {
			for(int i = 0;i < arr.length;i++) {
				if(i != 0) {
					str		+= ",";
				}
				str		+= arr[i];
			}
		} else {
			return "";
		}
		return str;
	}
	
	public static String llenarCon(String obj, String llenar) {
		StringBuffer sb		= new StringBuffer();
		for(int i = 0;i < obj.length();i++) {
			sb.append(llenar.charAt(0));
		}
		return sb.toString();
	}
	public static String llenarPorDerecha(String obj, int numLlenar, String llenar) {
		StringBuffer sb		= new StringBuffer();
		sb.append(obj);
		for(int i = 0;i < (numLlenar - obj.length());i++) {
			sb.append(llenar);
		}
		return sb.toString();
	}
	public static String llenarPorIzquierda(String obj, int numLlenar, String llenar) {
		StringBuffer sb		= new StringBuffer();
		for(int i = 0;i < (numLlenar - obj.length());i++) {
			sb.append(llenar);
		}
		sb.append(obj);
		return sb.toString();
	}
	public static void mainxxx(String[] aa) {
//		System.out.println("CadenaUtil.main() = "+llenarPorIzquierda("hi", 5, ""));
		System.out.println("test REPLACE="+reemplazarStr("Hoola \"mundo\" Java ", "\"", ""));
	}
	public static String getStrDate(Date date) {
		return date != null ? simpleDia.format(date) : "";
	}
	public static String getStrHora(Date date) {
		return date != null ? simpleHora.format(date) : "";
	}
	public static String getStrHoraMinutos(Date date) {
		return date != null ? simpleHoraMinuto.format(date) : "";
	}
	public static String getStrDateHoraMinutos(Date date) {
		return date != null ? simpleDiaHoraMinuto.format(date) : "";
	}
	public static String getStrDateAnio(Date date) {
		return date != null ? simpleAnio.format(date) : "";
	}
	public static String getStrDateMes(Date date) {
		return date != null ? simpleMES.format(date) : "";
	}
	public static String getStrDateMesCompleto(Date date) {
		return date != null ? simpleMes.format(date) : "";
	}
	
	public static String getStrDateDia(Date date) {
		return date != null ? simpleFecha.format(date) : "";
	}
	public static String getStrDateHoraMinutosTodoJunto(Date date) {
		return date != null ? simpleHoraJunto.format(date) : "";
	}
	
//	
//	public static String getDateStr(String strDate) {
//		return !getStr(strDate).equals("") ? simpleDia.format(getStr(strDate)) : "";
//	}
	public static Date getDateFromStr(String strDate) {
		try {
			return !getStr(strDate).equals("") ? simpleDia.parse(getStr(strDate)) : null;
		} catch(Exception ex) {}
		return null;
	}
	public static Date getHoraMinutosFromStr(String strDate) {
		try {
			return !getStr(strDate).equals("") ? simpleHoraMinuto.parse(getStr(strDate)) : null;
		} catch(Exception ex) {}
		return null;
	}
	public static Date getDateHoraMinutosFromStr(String strDate) {
		try {
			return !getStr(strDate).equals("") ? simpleDiaHoraMinuto.parse(getStr(strDate)) : null;
		} catch(Exception ex) {
			try {
				return !getStr(strDate).equals("") ? simpleDia.parse(getStr(strDate)) : null;
			} catch(Exception e) {}
		}
		return null;
	}
	public static Date getDateFromMesInt(int intMes, int intAnio) throws Exception {
		String strFecha	= "1/"+intMes+"/"+intAnio;
		try {
			return simpleDiaCorto.parse(strFecha);
		} catch(Exception ex) {}
		return null;
	}
	public static Date getDateFinMesFromMesInt(int intMes, int intAnio) throws Exception {
		String strFecha		= "1/"+intMes+"/"+intAnio;
		try {
			Fecha fchActual	= new Fecha(simpleDiaCorto.parse("1/"+intMes+"/"+intAnio));
			fchActual.aumentarMeses(1);
			fchActual.aumentarDias(-1);
			return fchActual.getFecha();
		} catch(Exception ex) {}
		return null;
	}
	public static Integer getInte(Object str) {
		return getInte(getStr(str));
	}
	public static Integer getInte(String str) {
		try {
			return str != null && !str.trim().equals("") ? new Integer(str) : 0;
		} catch(Exception ex) {
			return 0;
		}
	}
	public static Integer getInteNull(Integer str) {
		return getInteNull(getStr(str));
	}
	public static Integer getInteNull(String str) {
		try {
			return str != null && !str.trim().equals("")  && !str.trim().equals("0") ? new Integer(str) : null;
		} catch(Exception ex) {
			return null;
		}
	}
	public static Integer getInteNull(Object obj) {
		return getInteNull(getStr(obj));
	}
	public static Integer getInteCeroNoNull(Integer str) {
		return getInteCeroNoNull(getStr(str));
	}
	public static Integer getInteCeroNoNull(String str) {
		try {
			return str != null && !str.trim().equals("") ? new Integer(str) : null;
		} catch(Exception ex) {
			return null;
		}
	}
	public static Double getDoub(Object str) {
		return getDoub(getStr(str));
	}
	public static Double getDoub(String str) {
		try {
			str		= getQuitarComa(str);
			return str != null && !str.trim().equals("") ? new Double(str) : 0d;
		} catch(Exception ex) {
			return 0d;
		}
	}
	public static Double getDoub(Double dbl) {
		try {
			return dbl != null && dbl instanceof Double && !dbl.equals(Double.NaN) ? dbl : 0d;
		} catch(Exception ex) {
			return 0d;
		}
	}
	public static String getStrFormatDouble(Object obj) {
		return getStrFormatDouble(getDoub(obj));
	}
	public static String getStrFormatDouble(Double dbl) {
		if(dbl != null && !dbl.equals(Double.NaN)) {
			BigDecimal bd	= new BigDecimal(dbl);
			bd				= bd.setScale(2, BigDecimal.ROUND_HALF_DOWN);
			String[] arrNum	= bd.toString().replace('.', '_').split("_");
			return comaMiles(arrNum[0]) + "." + arrNum[1];
		} else {
			return "0.00";
		}
	}
	public static String getStrFormatInteger(Integer inte) {
		if(inte != null ) {
			return comaMiles(inte.toString());
		} else {
			return "0";
		}
	}
	public static Double getDoubNull(Object obj) {
		return getDoub(obj) != 0d ? getDoub(obj) : null;
	}
	public static Double getDoubNull(Double dbl) {
		return dbl != null && dbl instanceof Double && dbl.intValue() != 0d  && !dbl.equals(Double.NaN) ? dbl : null;
	}
	public static String comaMiles(String numeroEntero) {
		String strNumeroEntero			= "" + numeroEntero;
		String strNumeroEnteroNuevo	= "";
		int count = 0;
		int posInicio	= strNumeroEntero.length();
		int posFin		= strNumeroEntero.length();
		boolean inicio		= true;
		for(int i = 0;i < strNumeroEntero.length();i++) {
			if(count == 3) {
				strNumeroEnteroNuevo	= strNumeroEntero.substring(posInicio, posFin) + (inicio ? "" : ",") + strNumeroEnteroNuevo;
//				alert("<A> inicial="+numeroEntero+" final="+strNumeroEnteroNuevo+" count="+count+" posInicio="+posInicio+" posFin="+posFin);
				inicio			= false;
				count			= 0;
				posFin			= posInicio;
				posInicio		= posFin;
			}
			posInicio--;
			count++;
		}
		if(count > 0) {
			strNumeroEnteroNuevo	= strNumeroEntero.substring(posInicio, posFin) + (inicio ? "" : ",") + strNumeroEnteroNuevo;
		}
//		alert("<Z> inicial="+numeroEntero+" final="+strNumeroEnteroNuevo+" count="+count+" posInicio="+posInicio+" posFin="+posFin);
		return strNumeroEnteroNuevo;
	}
	public static Double getStrDoubleRedondeo(Double dbl) {
		return getDoubleRedondeo(dbl);
	}
	
	public static Double getDoubleRedondeo(Double dbl) {
		if(dbl != null) {
			BigDecimal bd	= new BigDecimal(dbl);
			bd				= bd.setScale(2, BigDecimal.ROUND_HALF_DOWN);
			return bd.doubleValue();
		} else {
			return 0d;
		}
	}
	
	public static String getQuitarComa(String str) {
		return getStr(str).replace(",", "");
	}

	public static Long getLongNull(Object str) {
		return str != null && str instanceof Long ? new Long(str.toString()) : null;
	}
	public static Long getLong(String str) {
		try {
			return str != null && !str.trim().equals("") ? new Long(str) : 0l;
		} catch(Exception ex) {
			return 0l;
		}
	}
	
	public static Integer getInte(Boolean bol) {
		return bol != null && bol ? new Integer(1) : new Integer(0);
	}
	
	public static Boolean getBoolean(Integer inte) {
		return inte != null && inte > 0;
	}
	public static Boolean esNumero(String str) {
		char[] validosChar	= new char[]{'0','1','2','3','4','5','6','7','8','9','.'};
		try {
			boolean existe = false;
			for(int a = 0;a < str.length();a++) {
				existe	= false;
				for(int i = 0;i < validosChar.length;i++) {
					if(str.charAt(a) == validosChar[i]) {
						existe = true;
					}
				}
				if(!existe) {
					return false;
				}
			}
		} catch(Exception ex) {
		}
		return true;
	}
	private static String[] arrayLetrasPermitidasEmail	= new String[]{"a","b","c","d","e","f","h","g","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
		"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
		"0","1","2","3","4","5","6","7","8","9", "-", "_", ",", ".", "@"};
	private static List<String> listLetrasPermitidasEmail	= Arrays.asList(arrayLetrasPermitidasEmail);
	public static Boolean esCorreo(String str) {
		boolean blnEsCorreoExisteArroba		= false;
		try {
			for(int a = 0;a < str.length();a++) {
				if(!listLetrasPermitidasEmail.contains(""+str.charAt(a))) {
					return false;
				}
				if(str.charAt(a) == '@') {
					if(a != 0 && (a + 1) < str.length()) {
						if(str.indexOf(".", a) != -1 && str.indexOf(".", a) != (a+1) && str.indexOf(".", a) != (str.length()-1)) {
							blnEsCorreoExisteArroba		= true;
						}
					}
				}
			}
		} catch(Exception ex) {
		}
		return blnEsCorreoExisteArroba;
	}
	public static List<String> validarCorreosError(String str) {
		String strCorreos				= CadenaUtil.getStr(str);
		String[] strArrCorreos			= strCorreos.split(",");
		List<String> listCorreosError	= new ArrayList<String>();
		for(int i = 0;i < strArrCorreos.length;i++) {
			strArrCorreos[i]	= getStr(strArrCorreos[i]);
			if(!strArrCorreos[i].equals("") && !esCorreo(strArrCorreos[i])) {
				listCorreosError.add(strArrCorreos[i]);
			}
		}
		return listCorreosError;
	}
	public static List<String> validarCorreos(String str) {
		String strCorreos			= CadenaUtil.getStr(str);
		String[] strArrCorreos		= strCorreos.split(",");
		for(int i = 0;i < strArrCorreos.length;i++) {
			strArrCorreos[i]	= getStr(strArrCorreos[i]);
			if(!esCorreo(strArrCorreos[i])) {
				return null;
			}
		}
		return Arrays.asList(strArrCorreos);
	}
	public static String ultimaCadena(String serie, char separador) {
		String cadenaSalida	= "";
		serie = serie.replace(separador, ',');
		String ddd[] = serie.split(",");
		if(ddd.length > 0) {
			cadenaSalida = ddd[ddd.length-1];
		} else {
			cadenaSalida = serie;
		}
		return cadenaSalida;
	}
	public static void main(String[] args) {
//		System.out.println("CadenaUtil.esCorreo(1)="+validarCorreosError("jdfass.com , ddjdjd@sdfsdf.ccs , sdfsdf@sdf.ssdf,asdasd@sdfdd"));
		System.out.println("CadenaUtil.esCorreo(1)="+reemplazarStr("Hola Jober Mena", " ", "_"));
//		System.out.println("CadenaUtil.esCorreo(1)="+("Hola Jober Mena".replace(' ', '+')));
	}
	public static String getLetraCapital(String str) {
		str		= getStr(str).toLowerCase();
		if(str.length() > 0) {
			char cha	= str.charAt(0);
			str	= String.valueOf(cha).toUpperCase() + str.substring(1);
		}
		return str;
	}
	public static long getNumeroDiasHastaDiciembre(Date dteFecha) {
		Fecha fchContru		= new Fecha(dteFecha);
		Fecha fchFinAnio	= new Fecha("31/12/"+simpleAnio.format(fchContru.getFecha()));
		return Fecha.difenciaDias(fchContru.getFecha(), fchFinAnio.getFecha());
	}
	public static long getNumeroDiasDelMes(Date dteFecha) {
		return getLong(simpleFechaSimp.format(dteFecha));
	}
	public static void mainx(String[] args) {
		try {
			String strFechaConst	= "28/02/2012";
			Fecha fchContru			= new Fecha(simpleDia.parse(strFechaConst));
			Fecha fchFinAnio		= new Fecha("31/12/"+simpleAnio.format(fchContru.getFecha()));
//			System.out.println("fin=" + Fecha.difenciaDias(fchContru.getFecha(), fchFinAnio.getFecha()));
//			System.out.println("CadenaUtil.main() valor=" + getNumeroMesesHastaDiciembre());	
		} catch(Exception ex) {
			//ex.printStackTrace();
		}
	}

	public static Integer calcularNumMesesHastaAhora(Integer intAnio) throws Exception {
		SimpleDateFormat simpleDia		= new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat simpleDiaMes	= new SimpleDateFormat("dd/MM");
		SimpleDateFormat simpleMes		= new SimpleDateFormat("M");
		
		Date dteFechaUltima	= simpleDia.parse("01/01/" + intAnio);
		Date dteAhora		= new Date();
		Date dteAhoraSera	= null;
		Date dteCero		= simpleDia.parse("01/01/2000");
		
		dteAhoraSera		= simpleDia.parse(simpleDiaMes.format(dteAhora) + "/" + intAnio);
		dteFechaUltima		= simpleDia.parse(simpleDia.format(dteFechaUltima));
		
		long difDias		= Fecha.difenciaDias(dteFechaUltima, dteAhoraSera);
		
		calendar.setTimeInMillis(dteCero.getTime());
		calendar.add(Calendar.DATE, (int)difDias);
		
		Date rs				= new Date(calendar.getTimeInMillis());
		return (Integer.parseInt(simpleMes.format(rs))-1);
	}

	public static String formateaStrDoubleMinutos(Double dblTiempo) {
		String strTiempo		= "";
		
		double dblHora			= CadenaUtil.getDoub(CadenaUtil.getStrFormatDouble(dblTiempo));
		double dblHoras			= Math.floor(dblHora);
		double dblHoraDec		= dblHora - dblHoras;
		double dblHoraMinu		= dblHoraDec * 60;
		
		int intMinutos			= (int)dblHoraMinu;
		int intHoras			= (int)dblHoras;
		
		strTiempo	= intHoras + "hrs. " + intMinutos + "min";
		return strTiempo;
	}
	public static String convertirStrPrimeraMayuscula(String str) {
		String strCaracter		= "";
		StringBuffer strSalida	= new StringBuffer();
		for(int i = 0;i < str.length();i++) {
			strCaracter		= "" + str.charAt(i);
			if(i == 0 && strCaracter.matches("[a-z]")) {
				strSalida.append("" + strCaracter.toUpperCase());
			} else {
				strSalida.append(strCaracter);
			}
		}
		return strSalida.toString();
	}

	public static String convertirStrPrimeraMinuscula(String str) {
		String strCaracter		= "";
		StringBuffer strSalida	= new StringBuffer();
		for(int i = 0;i < str.length();i++) {
			strCaracter		= "" + str.charAt(i);
			if(i == 0 && strCaracter.matches("[A-Z]")) {
				strSalida.append("" + strCaracter.toLowerCase());
			} else {
				strSalida.append(strCaracter);
			}
		}
		return strSalida.toString();
	}
	
	public static String getStrDiaSem(int intDiaSemana) {
		switch(intDiaSemana) {
		case 1:
			return "Do";
		case 2:
			return "Lu";
		case 3:
			return "Ma";
		case 4:
			return "Mi";
		case 5:
			return "Ju";
		case 6:
			return "Vi";
		case 7:
			return "Sa";
		default:
			return "";
		}
	}
	public static String getStrDiaSemana(int intDiaSemana) {
		switch(intDiaSemana) {
		case 1:
			return "Domingo";
		case 2:
			return "Lunes";
		case 3:
			return "Martes";
		case 4:
			return "Miercoles";
		case 5:
			return "Jueves";
		case 6:
			return "Viernes";
		case 7:
			return "Sabado";
		default:
			return "";
		}
	}
	public static String getStrMes(int intMesAnio) {
		switch(intMesAnio) {
		case 0:
			return "Enero";
		case 1:
			return "Febrero";
		case 2:
			return "Marzo";
		case 3:
			return "Abril";
		case 4:
			return "Mayo";
		case 5:
			return "Junio";
		case 6:
			return "Julio";
		case 7:
			return "Agosto";
		case 8:
			return "Setiembre";
		case 9:
			return "Octubre";
		case 10:
			return "Noviembre";
		case 11:
			return "Diciembre";
		default:
			return "";
		}
	}
	public static List<String> textoBuscar(String strFiltro) {
//			String strFiltro = "ds\"d7 r5\"sdd \"a1 b2\"sa";
		strFiltro = strFiltro.replaceAll("\"", "\"&");
		List<String> listStr = new ArrayList<String>();
		String[] arrStrFiltro	= strFiltro.split("\"");
		boolean blnOcurrencia	= false;
		for(int i = 0;i < arrStrFiltro.length;i++) {
			if(!arrStrFiltro[i].equals("")) {
				if(!blnOcurrencia && arrStrFiltro[i].charAt(0) == '&') {
					blnOcurrencia	= true;
					listStr.add(arrStrFiltro[i].substring(1));
				} else {
					if(blnOcurrencia) {
						arrStrFiltro[i]		= arrStrFiltro[i].substring(1);
						blnOcurrencia	= false;
					}
					arrStrFiltro[i]		= arrStrFiltro[i].trim();
					if(!arrStrFiltro[i].equals("")) {
						String[] arrStrFiltroSub	= arrStrFiltro[i].split(" ");
						for(int j = 0;j < arrStrFiltroSub.length;j++) {
							listStr.add(arrStrFiltroSub[j]);
						}
					}
				}
			}
		}
//		for(String str: listStr) {
//			System.out.println("str="+str);
//		}
		return listStr;
	}
	public static String reemplazarStr(String str, String reemplazar, String reemplazarPor) {
		if(!getStrNoTrim(reemplazar).equals("")) {
			return getStrNoTrim(str).replace(getStrNoTrim(reemplazar), getStrNoTrim(reemplazarPor));
		} else  {
			return getStrNoTrim(str);
		}
	}
	public static byte[] getBytesOfInputStream(InputStream ins) throws IOException {
		byte[] by = new byte[1024*5];
		ArrayList<byte[]> bytes = new ArrayList<byte[]>();
		byte[] byFinal = null;
		int tam = -1;
		int tamFinal = 0;
		while((tam = ins.read(by)) != -1) {
			byFinal = new byte[tam];
			System.arraycopy(by, 0, byFinal, 0, tam);
			bytes.add(byFinal);
			tamFinal +=tam;
		}
		byFinal = new byte[tamFinal];
		tam = 0;
		for(int i=0;i<bytes.size();i++) {
			System.arraycopy(bytes.get(i), 0, byFinal, tam, bytes.get(i).length);
			tam += bytes.get(i).length;
		}
		return byFinal;
	}
	public static Date getDateSumarDias(Date date, int intDias) {
		calendar.setTimeInMillis(date.getTime());
		calendar.add(Calendar.DATE, intDias);
		return new Date(calendar.getTimeInMillis());
	}
	public static Date getDateSumarMeses(Date date, int intMeses) {
		calendar.setTimeInMillis(date.getTime());
		calendar.add(Calendar.MONTH, intMeses);
		return new Date(calendar.getTimeInMillis());
	}
	public static Date getDateSumarAnios(Date date, int intAnios) {
		calendar.setTimeInMillis(date.getTime());
		calendar.add(Calendar.YEAR, intAnios);
		return new Date(calendar.getTimeInMillis());
	}
	public static class ComparaFrase {
		private static String[] str1Arr				= null;
		private static String[] str2Arr				= null;
		private static List<String> strListEncont	= null;
		private static int intPromLength			= 0;
		private static int intNumEqualsA			= 0;
		private static int intNumEqualsB			= 0;
		private static int intNumEqualsFraA			= 0;
		private static int intNumEqualsFraB			= 0;
//		private static int i						= 0;
//		private static int j						= 0;
		private static int iFrase					= 0;
		private static int jFrase					= 0;
		private static int iPalabra					= 0;
		private static int jPalabra					= 0;
		private static int iExtrae					= 0;

		private static String str1RS				= "";
		private static int intIndexSep				= 0;
		private static int intIndexSepAnt			= 0;
		private static int intContRep				= 0;
		private static String strTemp				= "";
		private static boolean rs					= false;
		//////////////////////////////////////////////////////////////////////////////////
		private static double dblPorMargenErrorPalabra	= 0.25d;
		private static double dblPorMargenErrorFrase	= 0.25d;
		//////////////////////////////////////////////////////////////////////////////////

		private static boolean comparaPalabras(String str1, String str2) {
			intNumEqualsA	= 0;
			intNumEqualsB	= 0;
			strListEncont	= new ArrayList<String>();

			str1Arr			= str1.split(":");
			str2Arr			= str2.split(":");
			intPromLength	= (int)Math.floor((str1Arr.length + str2Arr.length)/2d);

			for(iPalabra = 0;iPalabra < str1Arr.length;iPalabra++) {
				for(jPalabra = iPalabra;jPalabra < str2Arr.length;jPalabra++) {
					if(str1Arr[iPalabra].equalsIgnoreCase(str2Arr[jPalabra])) {
						strListEncont.add(str1Arr[iPalabra]);
						break;
					}
				}
			}
			for(iPalabra = 0;iPalabra < strListEncont.size();iPalabra++) {
				for(jPalabra = iPalabra;jPalabra < str1Arr.length;jPalabra++) {
					if(strListEncont.get(iPalabra).equalsIgnoreCase(str1Arr[jPalabra])) {
						intNumEqualsA++;
						break;
					}
				}
				for(jPalabra = iPalabra;jPalabra < str2Arr.length;jPalabra++) {
					if(strListEncont.get(iPalabra).equalsIgnoreCase(str2Arr[jPalabra])) {
						intNumEqualsB++;
						break;
					}
				}
			}
			return (intPromLength <= porcientoAumenta(intNumEqualsA, dblPorMargenErrorPalabra) && intPromLength >= intNumEqualsA ) &&
					(intPromLength <= porcientoAumenta(intNumEqualsB, dblPorMargenErrorPalabra) && intPromLength >= intNumEqualsB );
//			rs	= (intPromLength <= porcientoAumenta(intNumEqualsA, dblPorMargenErrorPalabra) && intPromLength >= intNumEqualsA ) &&
//					(intPromLength <= porcientoAumenta(intNumEqualsB, dblPorMargenErrorPalabra) && intPromLength >= intNumEqualsB );
//			return rs;
		}
		
		public static boolean compara(String str1, String str2) {
			str1	= getStr(str1);
			str2	= getStr(str2);
			if((str1.equals("") && str2.equals("")) || str1.equalsIgnoreCase(str2))
				return true;
			strListEncont		= new ArrayList<String>();
			intNumEqualsFraA	= 0;
			intNumEqualsFraB	= 0;

			str1		= extraePalabras(str1);
			str2		= extraePalabras(str2);
			str1Arr		= str1.split(":");
			str2Arr		= str2.split(":");
			
			intPromLength	= (int)Math.floor((str1Arr.length + str2Arr.length)/2d);

			for(iFrase = 0;iFrase < str1Arr.length;iFrase++) {
				for(jFrase = iFrase;jFrase < str2Arr.length;jFrase++) {
					if(comparaPalabras(str1Arr[iFrase],str2Arr[jFrase])) {
						strListEncont.add(str1Arr[iFrase]);
						break;
					}
				}
			}
			for(iFrase = 0;iFrase < strListEncont.size();iFrase++) {
				for(jFrase = iFrase;jFrase < str1Arr.length;jFrase++) {
					if(comparaPalabras(strListEncont.get(iFrase), str1Arr[jFrase])) {
						intNumEqualsFraA++;
						break;
					}
				}
				for(jFrase = iFrase;jFrase < str2Arr.length;jFrase++) {
					if(comparaPalabras(strListEncont.get(iFrase), str2Arr[jFrase])) {
						intNumEqualsFraB++;
						break;
					}
				}
			}
			
			return (intPromLength <= porcientoAumenta(intNumEqualsFraA, dblPorMargenErrorFrase) && intPromLength >= intNumEqualsFraA ) &&
					(intPromLength <= porcientoAumenta(intNumEqualsFraB, dblPorMargenErrorFrase) && intPromLength >= intNumEqualsFraB );
		}
		private static int porcientoAumenta(int intValor, double dblPorcentaje) {
			return intValor + (int)(((double)intValor) * dblPorcentaje);
		}
		private static int porcientoDisminuye(int intValor, double dblPorcentaje) {
			return intValor - (int)(((double)intValor) * dblPorcentaje);
		}
		private static boolean comparaPalabra(String str1, String str2) {
			return false;
		}
		private static String extraePalabras(String str) {
			str1RS		= "";
			intIndexSepAnt	= 0;
			
			str				= CadenaUtil.getStr(str.replace(" ", ":"));
			str				= str.replace("-", ":");
			while((intIndexSep	= str.indexOf(":", intIndexSep)) != -1) {
				str1RS	+= (str.substring(intIndexSepAnt, intIndexSep));
				strTemp		= str.substring(intIndexSep + 1);
				intContRep	= 0;
				for(iExtrae = 0; iExtrae < strTemp.length();iExtrae++) {
					if(strTemp.charAt(iExtrae) == ':')
						intContRep++;
					else
						break;
				}
				if(intContRep > 0) {
					intIndexSepAnt	= intIndexSep + intContRep;
					intIndexSep	+= intContRep;
				} else {
					intIndexSep	+= 1;
					intIndexSepAnt	= intIndexSep - 1;
				}
			}
			str1RS	+= (str.substring(intIndexSepAnt));
			return str1RS.toString();
		}
		
	}
	public static String filtrarMetadataDeUnPRJ(String strPRJ) {
		strPRJ	= getStr(strPRJ);
		String strResultado	= "";
		int posMetadata	= 0;
		if((posMetadata	= strPRJ.indexOf("METADATA")) != -1) {
			int inicioTagMetadata	= 0;
			if((inicioTagMetadata	= strPRJ.indexOf("[", posMetadata)) != -1) {
				int finTagMetadata	= 0;
				if((finTagMetadata	= strPRJ.indexOf("]", posMetadata)) != -1) {
					if(posMetadata > 0) {
						strResultado	= strPRJ.substring(0, posMetadata - 1);
						strResultado	+= strPRJ.substring(finTagMetadata, strPRJ.length() - 1);
					}
				}
			}
		}
		if(strResultado.equals("")) {
			strResultado	=  (strPRJ);
		}
		return strResultado;
	}
	
	public static String printStackTrace(Throwable ex) {
		ByteArrayOutputStream out	= new ByteArrayOutputStream();
		PrintWriter pw = new PrintWriter(out);
		ex.printStackTrace(pw);
		ex.fillInStackTrace();
		pw.flush();
    	return new String(out.toByteArray());
	}
	
	public static String printStackTrace(Throwable ex, int intMaxLeng) {
		return getMaxLength(printStackTrace(ex), intMaxLeng);
	}
	
	public static String getMaxLength(String str, int leng) {
		return getStr(str).length() > leng ? str.substring(0, leng) : str;
	}
	
	public static String generaColorAleatorio(int numBase) {
		return "#"+(
				Integer.toHexString((int)((Math.random()*(255d-numBase))+numBase))+""+
				Integer.toHexString((int)((Math.random()*(255d-numBase))+numBase))+""+
				Integer.toHexString((int)((Math.random()*(255d-numBase))+numBase))
				).toUpperCase();
	}

}
