package wcmc.hef.dao.capa.domain;

public class BaseBeanVectorialImpl implements BaseBeanVectorial {
	private Integer srlGid;
	private String strTheGeom;
	
	public BaseBeanVectorialImpl(String strTheGeom) {
		this.strTheGeom		= strTheGeom;
	}
	@Override
	public Integer getSrlGid() {
		return srlGid;
	}
	
	@Override
	public void setSrlGid(Integer srlGid) {
		this.srlGid		= srlGid;
	}
	
	@Override
	public String getStrTheGeom() {
		return strTheGeom;
	}
	
	@Override
	public void setStrTheGeom(String strTheGeom) {
		this.strTheGeom		= strTheGeom;
	}
	
}
