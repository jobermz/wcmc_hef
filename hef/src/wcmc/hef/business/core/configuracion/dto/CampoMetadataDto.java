package wcmc.hef.business.core.configuracion.dto;

import java.util.Date;
import java.util.List;
import wcmc.hef.general.util.CadenaUtil;

public class CampoMetadataDto {
	private Integer srlIdCampoMetadata;
	private Integer intIdCapa;
	private String strNombre;
	public Integer getSrlIdCampoMetadata() {
		return srlIdCampoMetadata;
	}
	public void setSrlIdCampoMetadata(Integer srlIdCampoMetadata) {
		this.srlIdCampoMetadata = srlIdCampoMetadata;
	}
	public Integer getIntIdCapa() {
		return intIdCapa;
	}
	public void setIntIdCapa(Integer intIdCapa) {
		this.intIdCapa = intIdCapa;
	}
	public String getStrNombre() {
		return strNombre;
	}
	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}
	
}
