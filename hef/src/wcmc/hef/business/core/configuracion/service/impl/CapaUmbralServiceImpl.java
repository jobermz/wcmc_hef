package wcmc.hef.business.core.configuracion.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wcmc.hef.business.core.configuracion.dto.CapaUmbralDto;
import wcmc.hef.business.core.configuracion.service.CapaUmbralService;
import wcmc.hef.dao.configuracion.domain.CapaUmbral;
import wcmc.hef.dao.configuracion.domain.CapaUmbralParamDef;
import wcmc.hef.dao.configuracion.domain.CapaUmbralParamDef.Criteria;
import wcmc.hef.dao.configuracion.mapper.CapaUmbralMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class CapaUmbralServiceImpl implements CapaUmbralService {
	@Autowired
	private CapaUmbralMapper capaUmbralMapper;
	public List<CapaUmbral> buscar(CapaUmbralDto capaUmbralDto) throws Exception {
		CapaUmbralParamDef capaUmbralParamDef		= new CapaUmbralParamDef();
		
		Criteria criteria		= capaUmbralParamDef.createCriteria();
		if(capaUmbralDto != null) {
			if(CadenaUtil.getStrNull(capaUmbralDto.getStrNombre()) != null) {
				criteria.andStrNombreLike(capaUmbralDto.getStrNombre());
			}
		}
		if(capaUmbralDto != null) {
			if(CadenaUtil.getInte(capaUmbralDto.getIntIdCapa()) != null) {
				criteria.andIntIdCapaEqualTo(capaUmbralDto.getIntIdCapa());
			}
		}
		
		capaUmbralParamDef.setOrderByClause("ha_valmin");
		List<CapaUmbral>	 list	= capaUmbralMapper.selectByDefaultParameter(capaUmbralParamDef);
		return list;
	}
	
	public CapaUmbral buscarById(CapaUmbralDto capaUmbralDto) throws Exception {
		CapaUmbral capaUmbral		= new CapaUmbral();
		BeanUtils.copyProperties(capaUmbralDto, capaUmbral);
		return capaUmbralMapper.selectByPrimaryKey(capaUmbral);
	}
	
	@Transactional
	public Integer guardar(CapaUmbralDto capaUmbralDto) throws Exception {
		CapaUmbral capaUmbral		= new CapaUmbral();
		BeanUtils.copyProperties(capaUmbralDto, capaUmbral);
		int rs	= 0;
		CapaUmbral exiteCapaUmbral		= capaUmbralMapper.selectByPrimaryKey(capaUmbral);
		if(exiteCapaUmbral != null) {
			rs	= capaUmbralMapper.updateByPrimaryKeySelective(capaUmbral);
		} else {
			rs	= capaUmbralMapper.insertSelective(capaUmbral);
			
			Integer srlIdCapaUmbral	= capaUmbralMapper.lastSequence();
			capaUmbralDto.setSrlIdCapaUmbral(srlIdCapaUmbral);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(CapaUmbralDto capaUmbralDto) throws Exception {
		CapaUmbral capaUmbral		= new CapaUmbral();
		BeanUtils.copyProperties(capaUmbralDto, capaUmbral);
		Integer rs	= capaUmbralMapper.deleteByPrimaryKey(capaUmbral);
		return rs;
	}
	
	public Map<String, Double> selectCapaUmbralMinMax(Integer value) throws Exception {
		return capaUmbralMapper.selectCapaUmbralMinMax(value);
	}
}
