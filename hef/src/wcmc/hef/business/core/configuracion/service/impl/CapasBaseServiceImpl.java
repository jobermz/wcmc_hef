package wcmc.hef.business.core.configuracion.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.configuracion.dto.CapasBaseDto;
import wcmc.hef.business.core.configuracion.service.CapasBaseService;
import wcmc.hef.dao.configuracion.domain.CapasBase;
import wcmc.hef.dao.configuracion.domain.CapasBaseParamDef;
import wcmc.hef.dao.configuracion.domain.CapasBaseParamDef.Criteria;
import wcmc.hef.dao.configuracion.mapper.CapasBaseMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class CapasBaseServiceImpl implements CapasBaseService {
	@Autowired
	private CapasBaseMapper capasBaseMapper;
	public List<CapasBase> buscar(CapasBaseDto capasBaseDto) throws Exception {
		CapasBaseParamDef capasBaseParamDef		= new CapasBaseParamDef();
		
		Criteria criteria		= capasBaseParamDef.createCriteria();
		if(capasBaseDto != null) {
			if(CadenaUtil.getStrNull(capasBaseDto.getStrNombre()) != null) {
				criteria.andStrNombreLike(capasBaseDto.getStrNombre());
			}
			if(CadenaUtil.getStrNull(capasBaseDto.getStrComentarios()) != null) {
				criteria.andStrComentariosLike(capasBaseDto.getStrComentarios());
			}
		}
		
		capasBaseParamDef.setOrderByClause("des_comentarios");
		List<CapasBase>	 list	= capasBaseMapper.selectByDefaultParameter(capasBaseParamDef);
		return list;
	}
	
	public CapasBase buscarById(CapasBaseDto capasBaseDto) throws Exception {
		CapasBase capasBase		= new CapasBase();
		BeanUtils.copyProperties(capasBaseDto, capasBase);
		return capasBaseMapper.selectByPrimaryKey(capasBase);
	}
	
	@Transactional
	public Integer guardar(CapasBaseDto capasBaseDto) throws Exception {
		CapasBase capasBase		= new CapasBase();
		BeanUtils.copyProperties(capasBaseDto, capasBase);
		int rs	= 0;
		CapasBase exiteCapasBase		= capasBaseMapper.selectByPrimaryKey(capasBase);
		if(exiteCapasBase != null) {
			rs	= capasBaseMapper.updateByPrimaryKeySelective(capasBase);
		} else {
			rs	= capasBaseMapper.insertSelective(capasBase);
			
			Integer srlIdCapasBase	= capasBaseMapper.lastSequence();
			capasBaseDto.setSrlIdCapasBase(srlIdCapasBase);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(CapasBaseDto capasBaseDto) throws Exception {
		CapasBase capasBase		= new CapasBase();
		BeanUtils.copyProperties(capasBaseDto, capasBase);
		Integer rs	= capasBaseMapper.deleteByPrimaryKey(capasBase);
		return rs;
	}
	
}
