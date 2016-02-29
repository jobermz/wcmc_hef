package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.ZonaAmortiguamientoEstablecidasDto;
import wcmc.hef.business.core.capa.service.ZonaAmortiguamientoEstablecidasService;
import wcmc.hef.dao.capa.domain.ZonaAmortiguamientoEstablecidas;
import wcmc.hef.dao.capa.domain.ZonaAmortiguamientoEstablecidasParamDef;
import wcmc.hef.dao.capa.domain.ZonaAmortiguamientoEstablecidasParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.ZonaAmortiguamientoEstablecidasMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class ZonaAmortiguamientoEstablecidasServiceImpl implements ZonaAmortiguamientoEstablecidasService {
	@Autowired
	private ZonaAmortiguamientoEstablecidasMapper zonaAmortiguamientoEstablecidasMapper;
	public List<ZonaAmortiguamientoEstablecidas> buscar(ZonaAmortiguamientoEstablecidasDto zonaAmortiguamientoEstablecidasDto) throws Exception {
		ZonaAmortiguamientoEstablecidasParamDef zonaAmortiguamientoEstablecidasParamDef		= new ZonaAmortiguamientoEstablecidasParamDef();
		
		Criteria criteria		= zonaAmortiguamientoEstablecidasParamDef.createCriteria();
		if(zonaAmortiguamientoEstablecidasDto != null) {
			if(CadenaUtil.getStrNull(zonaAmortiguamientoEstablecidasDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(zonaAmortiguamientoEstablecidasDto.getStrTheGeom());
			}
			if(CadenaUtil.getLongNull(zonaAmortiguamientoEstablecidasDto.getLngObjectid()) != null) {
				criteria.andLngObjectidEqualTo(zonaAmortiguamientoEstablecidasDto.getLngObjectid());
			}
			if(CadenaUtil.getStrNull(zonaAmortiguamientoEstablecidasDto.getStrZaNomb()) != null) {
				criteria.andStrZaNombLike(zonaAmortiguamientoEstablecidasDto.getStrZaNomb());
			}
			if(CadenaUtil.getStrNull(zonaAmortiguamientoEstablecidasDto.getStrZaBale()) != null) {
				criteria.andStrZaBaleLike(zonaAmortiguamientoEstablecidasDto.getStrZaBale());
			}
			if(zonaAmortiguamientoEstablecidasDto.getDteZaFecr() != null) {
				criteria.andDteZaFecrEqualTo(zonaAmortiguamientoEstablecidasDto.getDteZaFecr());
			}
		}
		
		List<ZonaAmortiguamientoEstablecidas>	 list	= zonaAmortiguamientoEstablecidasMapper.selectByDefaultParameter(zonaAmortiguamientoEstablecidasParamDef);
		return list;
	}
	
	public ZonaAmortiguamientoEstablecidas buscarById(ZonaAmortiguamientoEstablecidasDto zonaAmortiguamientoEstablecidasDto) throws Exception {
		ZonaAmortiguamientoEstablecidas zonaAmortiguamientoEstablecidas		= new ZonaAmortiguamientoEstablecidas();
		BeanUtils.copyProperties(zonaAmortiguamientoEstablecidasDto, zonaAmortiguamientoEstablecidas);
		return zonaAmortiguamientoEstablecidasMapper.selectByPrimaryKey(zonaAmortiguamientoEstablecidas);
	}
	
	@Transactional
	public Integer guardar(ZonaAmortiguamientoEstablecidasDto zonaAmortiguamientoEstablecidasDto) throws Exception {
		ZonaAmortiguamientoEstablecidas zonaAmortiguamientoEstablecidas		= new ZonaAmortiguamientoEstablecidas();
		BeanUtils.copyProperties(zonaAmortiguamientoEstablecidasDto, zonaAmortiguamientoEstablecidas);
		int rs	= 0;
		ZonaAmortiguamientoEstablecidas exiteZonaAmortiguamientoEstablecidas		= zonaAmortiguamientoEstablecidasMapper.selectByPrimaryKey(zonaAmortiguamientoEstablecidas);
		if(exiteZonaAmortiguamientoEstablecidas != null) {
			rs	= zonaAmortiguamientoEstablecidasMapper.updateByPrimaryKeySelective(zonaAmortiguamientoEstablecidas);
		} else {
			rs	= zonaAmortiguamientoEstablecidasMapper.insertSelective(zonaAmortiguamientoEstablecidas);
			
			Integer srlGid	= zonaAmortiguamientoEstablecidasMapper.lastSequence();
			zonaAmortiguamientoEstablecidasDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(ZonaAmortiguamientoEstablecidasDto zonaAmortiguamientoEstablecidasDto) throws Exception {
		ZonaAmortiguamientoEstablecidas zonaAmortiguamientoEstablecidas		= new ZonaAmortiguamientoEstablecidas();
		BeanUtils.copyProperties(zonaAmortiguamientoEstablecidasDto, zonaAmortiguamientoEstablecidas);
		Integer rs	= zonaAmortiguamientoEstablecidasMapper.deleteByPrimaryKey(zonaAmortiguamientoEstablecidas);
		return rs;
	}
	
}
