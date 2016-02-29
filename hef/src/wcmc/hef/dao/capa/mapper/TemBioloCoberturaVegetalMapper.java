package wcmc.hef.dao.capa.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import wcmc.hef.dao.capa.domain.TemBioloCoberturaVegetal;
import wcmc.hef.dao.capa.domain.TemBioloCoberturaVegetalKey;
import wcmc.hef.dao.capa.domain.TemBioloCoberturaVegetalParamDef;

@Service
public interface TemBioloCoberturaVegetalMapper {
	
	public List<TemBioloCoberturaVegetal> selectByDefaultParameter(TemBioloCoberturaVegetalParamDef temBioloCoberturaVegetalParamDef);
	public TemBioloCoberturaVegetal selectByPrimaryKey(TemBioloCoberturaVegetalKey temBioloCoberturaVegetalKey);
	public int insertSelective(TemBioloCoberturaVegetal temBioloCoberturaVegetal);
	public int updateByPrimaryKeySelective(TemBioloCoberturaVegetal temBioloCoberturaVegetal);
	public int deleteByPrimaryKey(TemBioloCoberturaVegetalKey temBioloCoberturaVegetalKey);
	
	public int lastSequence();

	
}
