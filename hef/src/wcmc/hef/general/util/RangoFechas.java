package wcmc.hef.general.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RangoFechas {
	private SimpleDateFormat simpleDia	= new SimpleDateFormat("dd/MM/yyyy");
	private Fecha fecFechaInicio;
	private Fecha fecFechaFinal;
	public RangoFechas() throws ParseException {
		this.fecFechaInicio	= new Fecha(new Date());
		this.fecFechaFinal	= new Fecha(new Date());
	}
	public RangoFechas(String strHoraInicio, String strHoraFinal) throws Exception {
		this.fecFechaInicio	= new Fecha(strHoraInicio);
		this.fecFechaFinal	= new Fecha(strHoraFinal);
		if(!fecFechaInicio.estaAntesDe(fecFechaFinal)) {
			throw new Exception("La hora fin: "+strHoraFinal+" debe ser posterior a la hora inicio:"+strHoraInicio);
		}
	}
	public RangoFechas(Date hraHoraInicio, Date hraHoraFinal) {
		this.fecFechaInicio	= new Fecha(hraHoraInicio);
		this.fecFechaFinal	= new Fecha(hraHoraFinal);
	}
	public RangoFechas(Fecha fecFechaInicio, Fecha fecFechaFinal) {
		this.fecFechaInicio	= (fecFechaInicio);
		this.fecFechaFinal	= (fecFechaFinal);
	}
	
	public static void main(String[] args) {
		try {
			new RangoFechas().main();
		} catch(Exception ex) {
			//ex.printStackTrace();
		}
	}
	public void main() throws Exception {
		RangoFechas rangoUno = new RangoFechas("09:00", "12:02");
		RangoFechas rangoDos = new RangoFechas("13:00", "22:00");
//		System.out.println("diferenciaTiempoEnMinutos 1=" + rangoUno.diferenciaTiempoEnMinutos(rangoDos));
	}
	/////////////////////////////////////////////////////
	public boolean estaIncluyendo_a(RangoFechas rangoHoras) {
		if(!isNotNull(rangoHoras)) {
			return true;
		}
		boolean contieneInicio		= false;
		boolean contieneFinal		= false;
		boolean contieneResultado	= false;
		contieneInicio	= this.getFecFechaInicio().estaAntesIgualA(rangoHoras.getFecFechaInicio());
		contieneInicio	&= this.getFecFechaFinal().estaDespuesIgualA(rangoHoras.getFecFechaInicio());
		contieneFinal	= this.getFecFechaInicio().estaAntesIgualA(rangoHoras.getFecFechaFinal());
		contieneFinal	&= this.getFecFechaFinal().estaDespuesIgualA(rangoHoras.getFecFechaFinal());
		contieneResultado	= contieneInicio && contieneFinal;
		return contieneResultado;
	}
	public boolean estaIntersectando_con(RangoFechas rangoHoras) {
		if(!isNotNull(rangoHoras)) {
			return false;
		}
		boolean contieneInicio		= false;
		boolean contieneFinal		= false;
		boolean contieneCentroA		= false;
		boolean contieneCentroB		= false;
		boolean contieneCentroC		= false;
		boolean contieneResultado	= false;
		
		contieneInicio	= this.getFecFechaInicio().estaAntesDe(rangoHoras.getFecFechaInicio());
		contieneInicio	&= this.getFecFechaFinal().estaDespuesDe(rangoHoras.getFecFechaInicio());
		contieneFinal	= this.getFecFechaInicio().estaAntesDe(rangoHoras.getFecFechaFinal());
		contieneFinal	&= this.getFecFechaFinal().estaDespuesDe(rangoHoras.getFecFechaFinal());

		contieneCentroA	= this.getFecFechaInicio().estaDespuesIgualA(rangoHoras.getFecFechaInicio());
		contieneCentroA	&= this.getFecFechaInicio().estaAntesIgualA(rangoHoras.getFecFechaFinal());
		contieneCentroA	&= this.getFecFechaFinal().estaDespuesIgualA(rangoHoras.getFecFechaInicio());
		contieneCentroA	&= this.getFecFechaFinal().estaAntesIgualA(rangoHoras.getFecFechaFinal());
		
		contieneCentroB	= rangoHoras.getFecFechaInicio().estaDespuesIgualA(this.getFecFechaInicio());
		contieneCentroB	&= rangoHoras.getFecFechaInicio().estaAntesIgualA(this.getFecFechaFinal());
		contieneCentroB	&= rangoHoras.getFecFechaFinal().estaDespuesIgualA(this.getFecFechaInicio());
		contieneCentroB	&= rangoHoras.getFecFechaFinal().estaAntesIgualA(this.getFecFechaFinal());
		
		contieneCentroC	= rangoHoras.equals(this);
		contieneResultado	= contieneInicio || contieneFinal || contieneCentroA || contieneCentroB || contieneCentroC;
		return contieneResultado;
	}
	public boolean estaAlCostado_de(RangoFechas rangoHoras) {
		if(!isNotNull(rangoHoras)) {
			return false;
		}
		boolean alInicio	= false;
		boolean alFinal		= false;
		boolean resultado	= false;
		alInicio			= this.getFecFechaInicio().esIgualA(rangoHoras.getFecFechaFinal());
		alFinal				= this.getFecFechaFinal().esIgualA(rangoHoras.getFecFechaInicio());
		
		resultado	= alInicio || alFinal;
		return resultado;
	}
	public boolean isNotNull(RangoFechas rangoHoras) {
		if(		rangoHoras != null
				&& rangoHoras.getStrFechaInicio() != null
				&& rangoHoras.getStrFechaFinal() != null) {
			return true;
		}
		return false;
	}
	public boolean equals(RangoFechas rangoHoras) {
		if(isNotNull(rangoHoras)) {
			String strHorIniParam		= rangoHoras.getStrFechaInicio();
			String strHorFinParam		= rangoHoras.getStrFechaFinal();
			if(		strHorIniParam != null 
					&& getStrFechaInicio() != null 
					&& strHorIniParam.equals(getStrFechaInicio())
					&& 
					strHorFinParam != null 
					&& getStrFechaFinal() != null 
					&& strHorFinParam.equals(this.getStrFechaFinal())) {
				return true;
			}
		}
		return false;
	}
	public boolean estaAlCostadoAntesDe(RangoFechas rangoHoras, int toleranciaMinutos) {
		if(!isNotNull(rangoHoras)) {
			return false;
		}
		Fecha hraFinal		= this.getFecFechaFinal();
		Fecha hraInicio		= rangoHoras.getFecFechaInicio();
		return hraFinal.esIgualA(hraInicio);
	}
	public boolean estaAlCostadoDespuesDe(RangoFechas rangoHoras, int toleranciaMinutos) {
		if(!isNotNull(rangoHoras)) {
			return false;
		}
		Fecha hraFinal		= rangoHoras.getFecFechaFinal();
		Fecha hraInicio		= this.getFecFechaInicio();
		return hraFinal.esIgualA(hraInicio);
	}
	public boolean estaAntesDe(RangoFechas rangoHoras, int toleranciaMinutos) {
		if(!isNotNull(rangoHoras)) {
			return false;
		}
		Fecha hraFinal		= this.getFecFechaFinal();
		Fecha hraInicio		= rangoHoras.getFecFechaInicio();
		hraFinal			= hraFinal.sumarDias(1);
		return hraFinal.esIgualA(hraInicio);
	}
	public boolean estaIntersectandoPorLaIzquierdaCon(RangoFechas rangoHoras) {
		if(!isNotNull(rangoHoras)) {
			return false;
		}
		Fecha hraInicioThis		= this.getFecFechaInicio();
		Fecha hraFinalThis		= this.getFecFechaFinal();
		Fecha hraInicioCurr		= rangoHoras.getFecFechaInicio();
		Fecha hraFinalCurr		= rangoHoras.getFecFechaFinal();
		return hraInicioThis.estaAntesDe(hraFinalCurr) && 
			hraInicioThis.estaDespuesDe(hraInicioCurr) &&
			hraFinalThis.estaDespuesDe(hraInicioCurr) &&
			hraFinalThis.estaDespuesDe(hraFinalCurr);
	}
	public boolean estaIntersectandoPorLaDerechaCon(RangoFechas rangoHoras) {
		if(!isNotNull(rangoHoras)) {
			return false;
		}
		Fecha hraInicioThis		= this.getFecFechaInicio();
		Fecha hraFinalThis		= this.getFecFechaFinal();
		Fecha hraInicioCurr		= rangoHoras.getFecFechaInicio();
		Fecha hraFinalCurr		= rangoHoras.getFecFechaFinal();
		return hraFinalThis.estaAntesDe(hraFinalCurr) && 
			hraFinalThis.estaDespuesDe(hraInicioCurr) &&
			hraInicioThis.estaAntesDe(hraInicioCurr) &&
			hraInicioThis.estaAntesDe(hraFinalCurr);

	}
	public boolean estaDespuesDe(RangoFechas rangoHoras, int toleranciaMinutos) {
		if(!isNotNull(rangoHoras)) {
			return false;
		}
		Fecha hraFinal		= rangoHoras.getFecFechaFinal();
		Fecha hraInicio		= this.getFecFechaInicio();
		hraFinal			= hraFinal.sumarDias(1);
		return hraFinal.esIgualA(hraInicio);
	}
	public String toString() {
		return 	"("+getStrFechaInicio()+"-"+getStrFechaFinal()+")";
	}
	/////////////////////////////////////////////////////
	public Fecha getFecFechaInicio() {
		return fecFechaInicio;
	}
	public void setFecFechaInicio(Fecha fecFechaInicio) {
		this.fecFechaInicio = fecFechaInicio;
	}
	public Fecha getFecFechaFinal() {
		return fecFechaFinal;
	}
	public void setFecFechaFinal(Fecha fecFechaFinal) {
		this.fecFechaFinal = fecFechaFinal;
	}
	public String getStrFechaInicio() {
		if(fecFechaInicio != null) {
			return fecFechaInicio.toString();
		} else {
			return null;
		}
	}
	public String getStrFechaFinal() {
		if(fecFechaFinal != null) {
			return fecFechaFinal.toString();
		} else {
			return null;
		}
	}
}
