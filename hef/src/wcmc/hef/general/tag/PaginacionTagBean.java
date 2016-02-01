package wcmc.hef.general.tag;

public class PaginacionTagBean {
	private Object filtroBean;
	private boolean blnUsarListaCompleta	= false;
	private int intPaginaActual				= 1;
	private int intTotalRegistros			= 0;
	private int intRegistrosPorPagina		= 10;
	public PaginacionTagBean() {}
	public PaginacionTagBean(int intTotalRegistros) {
		setIntTotalRegistros(intTotalRegistros);
	}
	public PaginacionTagBean(int intTotalRegistros, boolean blnUsarListaCompleta) {
		setIntTotalRegistros(intTotalRegistros);
		setBlnUsarListaCompleta(blnUsarListaCompleta);
	}
	public PaginacionTagBean(boolean blnUsarListaCompleta) {
		setBlnUsarListaCompleta(blnUsarListaCompleta);
	}
	public void siguiente() {
		setIntPaginaActual(getIntPaginaActual() + 1);
		validarPaginaActual();
	}
	public void anterior() {
		setIntPaginaActual(getIntPaginaActual() - 1);
		validarPaginaActual();
	}
	public int getIntExtraerDesde() {
		validarPaginaActual();
		return (getIntPaginaActual() - 1) * getIntRegistrosPorPagina();
	}
	public int getIntExtraerHasta() {
		validarPaginaActual();
		if(getIntTotalRegistros() == 0) {
			return 0;
		} else if(getIntPaginaActual() == getIntNumPaginas()) {
			return getIntTotalRegistros() - 1;
		} else {
			return getIntExtraerDesde() + getIntRegistrosPorPagina() - 1;
		}
	}
	public int getIntNumPaginas() {
		return (int)Math.ceil((double)getIntTotalRegistros() / (double)getIntRegistrosPorPagina());
	}
//	public int getIntMostrarPaginasDesde() {
//		return (int)Math.ceil((double)getIntTotalRegistros() / (double)getIntRegistrosPorPagina());
//	}
//	public int getIntMostrarPaginasHasta() {
//		return (int)Math.ceil((double)getIntTotalRegistros() / (double)getIntRegistrosPorPagina());
//	}
	public void validarPaginaActual() {
		if(getIntNumPaginas() > 0 && getIntPaginaActual() > getIntNumPaginas()) {
			setIntPaginaActualValidacion(getIntNumPaginas());
		}
		if(getIntPaginaActual() < 1) {
			setIntPaginaActualValidacion(1);
		}
		if(getIntPaginaActual() > getIntNumPaginas()) {
			setIntPaginaActualValidacion(1);
		}
	}
	///////////////////////////////////
	public int getIntPaginaActual() {
		return intPaginaActual;
	}
	public void setIntPaginaActual(int intPaginaActual) {
		this.intPaginaActual = intPaginaActual;
		validarPaginaActual();
	}
	private void setIntPaginaActualValidacion(int intPaginaActual) {
		this.intPaginaActual = intPaginaActual;
	}
	public int getIntTotalRegistros() {
		return intTotalRegistros;
	}
	public void setIntTotalRegistros(int intTotalRegistros) {
		this.intTotalRegistros = intTotalRegistros;
		validarPaginaActual();
	}
	public int getIntRegistrosPorPagina() {
		return intRegistrosPorPagina;
	}
	public void setIntRegistrosPorPagina(int intRegistrosPorPagina) {
		this.intRegistrosPorPagina = intRegistrosPorPagina;
	}
	public boolean isBlnUsarListaCompleta() {
		return blnUsarListaCompleta;
	}
	public void setBlnUsarListaCompleta(boolean blnUsarListaCompleta) {
		this.blnUsarListaCompleta = blnUsarListaCompleta;
	}
	public Object getFiltroBean() {
		return filtroBean;
	}
	public void setFiltroBean(Object filtroBean) {
		if(filtroBean != null && filtroBean instanceof PaginacionTagBaseBean) {
			((PaginacionTagBaseBean)filtroBean).setPaginacionTagBean(this);
		}
		this.filtroBean = filtroBean;
	}
	
}
