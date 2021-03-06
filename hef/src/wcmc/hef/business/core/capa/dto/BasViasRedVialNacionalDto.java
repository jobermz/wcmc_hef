package wcmc.hef.business.core.capa.dto;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class BasViasRedVialNacionalDto implements BaseBeanVectorialDto {
    private String strHashConsulta;
	private Integer srlGid;
	private String strTheGeom;
	private String strDpto;
	private String strRutaD044;
	private String strRed044;
	private Double dblLongkmD44;
	private String strSuperRod;

    public void setStrHashConsulta(String strHashConsulta) {
        this.strHashConsulta = strHashConsulta;
    }
	
    public String getStrHashConsulta() {
        return CadenaUtil.getStr(strHashConsulta);
    }
	public Integer getSrlGid() {
		return srlGid;
	}
	public void setSrlGid(Integer srlGid) {
		this.srlGid = srlGid;
	}
	public String getStrTheGeom() {
		return strTheGeom;
	}
	public void setStrTheGeom(String strTheGeom) {
		this.strTheGeom = strTheGeom;
	}
	public String getStrDpto() {
		return strDpto;
	}
	public void setStrDpto(String strDpto) {
		this.strDpto = strDpto;
	}
	public String getStrRutaD044() {
		return strRutaD044;
	}
	public void setStrRutaD044(String strRutaD044) {
		this.strRutaD044 = strRutaD044;
	}
	public String getStrRed044() {
		return strRed044;
	}
	public void setStrRed044(String strRed044) {
		this.strRed044 = strRed044;
	}
	public Double getDblLongkmD44() {
		return dblLongkmD44;
	}
	public void setDblLongkmD44(Double dblLongkmD44) {
		this.dblLongkmD44 = dblLongkmD44;
	}
	public String getStrSuperRod() {
		return strSuperRod;
	}
	public void setStrSuperRod(String strSuperRod) {
		this.strSuperRod = strSuperRod;
	}
	
}
