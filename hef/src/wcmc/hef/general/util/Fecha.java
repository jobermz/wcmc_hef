package wcmc.hef.general.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Fecha {
	private Date fecha;
	private SimpleDateFormat simpleDia = new SimpleDateFormat("dd/MM/yyyy");
	private SimpleDateFormat simpleFecha = new SimpleDateFormat("dd");
	private SimpleDateFormat simpleMes = new SimpleDateFormat("MM");
	private SimpleDateFormat simpleAnio = new SimpleDateFormat("yyyy");
	public Fecha(String strFecha) {
		try {
			this.fecha	= simpleDia.parse(strFecha);
		} catch(Exception ex) {
			//ex.printStackTrace();
		}
	}
	public Fecha(Date fecha) {
		try {
			this.fecha	= fecha;
		} catch(Exception ex) {
			//ex.printStackTrace();
		}
	}
	public long getTime() {
		return fecha.getTime();
	}
	public String toString() {
		return simpleDia.format(fecha);
	}
	public boolean estaAntesDe(Fecha fechaCurr) {
		return fecha.getTime() < fechaCurr.getTime();
	}
	public boolean estaAntesIgualA(Fecha fechaCurr) {
		return fecha.getTime() <= fechaCurr.getTime();
	}
	public boolean estaDespuesDe(Fecha fechaCurr) {
		return fecha.getTime() > fechaCurr.getTime();
	}
	public boolean estaDespuesIgualA(Fecha fechaCurr) {
		return fecha.getTime() >= fechaCurr.getTime();
	}
	public boolean esIgualA(Fecha fechaCurr) {
		return fecha.getTime() == fechaCurr.getTime();
	}
	
	public Fecha sumarDias(int dias) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTimeInMillis(fecha.getTime());
		cal.add(Calendar.DATE, dias);
		return new Fecha(new Date(cal.getTimeInMillis()));
	}
	
	/*public static void main(String args[]) {
		new Fecha("01/01/2001").validarFecha();
	}*/
	public static long difenciaDias(Date fechaInicial, Date fechaFinal) {
		long difFecha	= (fechaFinal.getTime() - fechaInicial.getTime());
		return difFecha / 86400000L;
	}
	
	public void validarFecha() {
		Date fechaA		= null;
		Date fechaB		= null;
		try {
			fechaA		= simpleDia.parse("29/02/2008");
			fechaB		= simpleDia.parse("01/03/2008");
//			System.out.println("DifFechaA:"+difenciaDias(fechaA, fechaB));
			fechaA		= simpleDia.parse("29/02/2009");
			fechaB		= simpleDia.parse("01/03/2009");
//			System.out.println("DifFechaB:"+difenciaDias(fechaA, fechaB));
			fechaA		= simpleDia.parse("29/02/2010");
			fechaB		= simpleDia.parse("01/03/2010");
//			System.out.println("DifFechaC:"+difenciaDias(fechaA, fechaB));
			fechaA		= simpleDia.parse("29/02/2011");
			fechaB		= simpleDia.parse("01/03/2011");
//			System.out.println("DifFechaD:"+difenciaDias(fechaA, fechaB));
			fechaA		= simpleDia.parse("29/02/2012");
			fechaB		= simpleDia.parse("01/03/2012");
//			System.out.println("DifFechaE:"+difenciaDias(fechaA, fechaB));
		} catch(Exception ex) {
			//ex.printStackTrace();
		}
	}
	
	public void aumentarDias(int nroDias) {
		Calendar cal = new GregorianCalendar();
		try {
			cal.setTimeInMillis(this.fecha.getTime());
			cal.add(Calendar.DATE, nroDias);
//			return new Date(cal.getTimeInMillis());
			this.fecha	= new Date(cal.getTimeInMillis());;
		} catch(Exception ex) {
			//ex.printStackTrace();
		}
	}
	
	public void aumentarMeses(int nroMeses) {
		Calendar cal = new GregorianCalendar();
		try {
			cal.setTimeInMillis(this.fecha.getTime());
			cal.add(Calendar.MONTH, nroMeses);
			fecha	= new Date(cal.getTimeInMillis());
		} catch(Exception ex) {
			//ex.printStackTrace();
		}
	}
	public String aumentarMeses_X(int meses) {
		try {
			String mesThis		= simpleMes.format(fecha);
			Integer intMesThis	= Integer.parseInt(mesThis, 10);
			intMesThis++;
			if(intMesThis >= 10) {
				return ""+intMesThis;
			} else {
				return "0"+intMesThis;
			}
		} catch(Exception ex) {
			//ex.printStackTrace();
		}
		return "";
	}
	public String obtenerFechaFinalDelMes() {
		Calendar cal = new GregorianCalendar();
		try {
			cal.setTimeInMillis(
					simpleDia.parse("01/"+aumentarMeses_X(1)+"/"+simpleAnio.format(fecha)).getTime());
			cal.add(Calendar.DATE, -1);
			return simpleDia.format(new Date(cal.getTimeInMillis()));
		} catch(Exception ex) {
			//ex.printStackTrace();
		}
		return "";
	}
	public Date getFecha() {
		return this.fecha;
	}

	public static String letraDia(int dia, int mes, int ano) {

		String primerDiaMes = dia + "/" + mes + "/" + ano;
		String res = "";
		Date fec = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			fec = sdf.parse(primerDiaMes);
		} catch (ParseException e) {

			e.printStackTrace();
		}
		switch (fec.getDay()) {
		case 0:
			res = "Do";
			break;
		case 1:
			res = "Lu";
			break;
		case 2:
			res = "Ma";
			break;
		case 3:
			res = "Mi";
			break;
		case 4:
			res = "Ju";
			break;
		case 5:
			res = "Vi";
			break;
		case 6:
			res = "Sa";
			break;
		}

		return res;
	}
}

	