package wcmc.hef.business.core.visor.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.visor.dto.CapaProvinciaDto;
import wcmc.hef.business.core.visor.service.CapaProvinciaService;
import wcmc.hef.dao.visor.domain.CapaProvincia;
import wcmc.hef.dao.visor.domain.CapaProvinciaParamDef;
import wcmc.hef.dao.visor.domain.CapaProvinciaParamDef.Criteria;
import wcmc.hef.dao.visor.mapper.CapaProvinciaMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class CapaProvinciaServiceImpl implements CapaProvinciaService {
	@Autowired
	private CapaProvinciaMapper capaProvinciaMapper;
	public List<CapaProvincia> buscar(CapaProvinciaDto capaProvinciaDto) throws Exception {
		CapaProvinciaParamDef capaProvinciaParamDef		= new CapaProvinciaParamDef();
		
		Criteria criteria		= capaProvinciaParamDef.createCriteria();
		if(capaProvinciaDto != null) {
			if(CadenaUtil.getStrNull(capaProvinciaDto.getStrIdProvincia()) != null) {
				criteria.andStrIdProvinciaLike(capaProvinciaDto.getStrIdProvincia());
			}
			if(CadenaUtil.getStrNull(capaProvinciaDto.getStrNombreProvincia()) != null) {
				criteria.andStrNombreProvinciaLike(capaProvinciaDto.getStrNombreProvincia());
			}
			if(CadenaUtil.getStrNull(capaProvinciaDto.getStrNombreDepartamento()) != null) {
				criteria.andStrNombreDepartamentoLike(capaProvinciaDto.getStrNombreDepartamento());
			}
		}
		
		capaProvinciaParamDef.setOrderByClause("nom_provincia");
		List<CapaProvincia>	 list	= capaProvinciaMapper.selectByDefaultParameter(capaProvinciaParamDef);
		return list;
	}
	
	public CapaProvincia buscarById(CapaProvinciaDto capaProvinciaDto) throws Exception {
		CapaProvincia capaProvincia		= new CapaProvincia();
		BeanUtils.copyProperties(capaProvinciaDto, capaProvincia);
		return capaProvinciaMapper.selectByPrimaryKey(capaProvincia);
	}
	
	@Transactional
	public Integer guardar(CapaProvinciaDto capaProvinciaDto) throws Exception {
		CapaProvincia capaProvincia		= new CapaProvincia();
		BeanUtils.copyProperties(capaProvinciaDto, capaProvincia);
		int rs	= 0;
		CapaProvincia exiteCapaProvincia		= capaProvinciaMapper.selectByPrimaryKey(capaProvincia);
		if(exiteCapaProvincia != null) {
			rs	= capaProvinciaMapper.updateByPrimaryKeySelective(capaProvincia);
		} else {
			rs	= capaProvinciaMapper.insertSelective(capaProvincia);
			

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(CapaProvinciaDto capaProvinciaDto) throws Exception {
		CapaProvincia capaProvincia		= new CapaProvincia();
		BeanUtils.copyProperties(capaProvinciaDto, capaProvincia);
		Integer rs	= capaProvinciaMapper.deleteByPrimaryKey(capaProvincia);
		return rs;
	}
	
}
