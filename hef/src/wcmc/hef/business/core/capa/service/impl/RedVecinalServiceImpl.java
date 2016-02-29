package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.RedVecinalDto;
import wcmc.hef.business.core.capa.service.RedVecinalService;
import wcmc.hef.dao.capa.domain.RedVecinal;
import wcmc.hef.dao.capa.domain.RedVecinalParamDef;
import wcmc.hef.dao.capa.domain.RedVecinalParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.RedVecinalMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class RedVecinalServiceImpl implements RedVecinalService {
	@Autowired
	private RedVecinalMapper redVecinalMapper;
	public List<RedVecinal> buscar(RedVecinalDto redVecinalDto) throws Exception {
		RedVecinalParamDef redVecinalParamDef		= new RedVecinalParamDef();
		
		Criteria criteria		= redVecinalParamDef.createCriteria();
		if(redVecinalDto != null) {
			if(CadenaUtil.getStrNull(redVecinalDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(redVecinalDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(redVecinalDto.getStrProvinc()) != null) {
				criteria.andStrProvincLike(redVecinalDto.getStrProvinc());
			}
			if(CadenaUtil.getStrNull(redVecinalDto.getStrRuta()) != null) {
				criteria.andStrRutaLike(redVecinalDto.getStrRuta());
			}
			if(CadenaUtil.getStrNull(redVecinalDto.getStrSuperficie()) != null) {
				criteria.andStrSuperficieLike(redVecinalDto.getStrSuperficie());
			}
		}
		
		List<RedVecinal>	 list	= redVecinalMapper.selectByDefaultParameter(redVecinalParamDef);
		return list;
	}
	
	public RedVecinal buscarById(RedVecinalDto redVecinalDto) throws Exception {
		RedVecinal redVecinal		= new RedVecinal();
		BeanUtils.copyProperties(redVecinalDto, redVecinal);
		return redVecinalMapper.selectByPrimaryKey(redVecinal);
	}
	
	@Transactional
	public Integer guardar(RedVecinalDto redVecinalDto) throws Exception {
		RedVecinal redVecinal		= new RedVecinal();
		BeanUtils.copyProperties(redVecinalDto, redVecinal);
		int rs	= 0;
		RedVecinal exiteRedVecinal		= redVecinalMapper.selectByPrimaryKey(redVecinal);
		if(exiteRedVecinal != null) {
			rs	= redVecinalMapper.updateByPrimaryKeySelective(redVecinal);
		} else {
			rs	= redVecinalMapper.insertSelective(redVecinal);
			
			Integer srlGid	= redVecinalMapper.lastSequence();
			redVecinalDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(RedVecinalDto redVecinalDto) throws Exception {
		RedVecinal redVecinal		= new RedVecinal();
		BeanUtils.copyProperties(redVecinalDto, redVecinal);
		Integer rs	= redVecinalMapper.deleteByPrimaryKey(redVecinal);
		return rs;
	}
	
}
