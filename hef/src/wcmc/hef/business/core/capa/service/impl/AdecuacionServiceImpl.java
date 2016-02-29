package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.AdecuacionDto;
import wcmc.hef.business.core.capa.service.AdecuacionService;
import wcmc.hef.dao.capa.domain.Adecuacion;
import wcmc.hef.dao.capa.domain.AdecuacionParamDef;
import wcmc.hef.dao.capa.domain.AdecuacionParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.AdecuacionMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class AdecuacionServiceImpl implements AdecuacionService {
	@Autowired
	private AdecuacionMapper adecuacionMapper;
	public List<Adecuacion> buscar(AdecuacionDto adecuacionDto) throws Exception {
		AdecuacionParamDef adecuacionParamDef		= new AdecuacionParamDef();
		
		Criteria criteria		= adecuacionParamDef.createCriteria();
		if(adecuacionDto != null) {
			if(CadenaUtil.getStrNull(adecuacionDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(adecuacionDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(adecuacionDto.getStrModalidad()) != null) {
				criteria.andStrModalidadLike(adecuacionDto.getStrModalidad());
			}
			if(CadenaUtil.getStrNull(adecuacionDto.getStrTitular()) != null) {
				criteria.andStrTitularLike(adecuacionDto.getStrTitular());
			}
			if(CadenaUtil.getStrNull(adecuacionDto.getStrContrato()) != null) {
				criteria.andStrContratoLike(adecuacionDto.getStrContrato());
			}
			if(CadenaUtil.getDoubNull(adecuacionDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(adecuacionDto.getDblAreaSig());
			}
			if(CadenaUtil.getDoubNull(adecuacionDto.getDblAreaAprob()) != null) {
				criteria.andDblAreaAprobEqualTo(adecuacionDto.getDblAreaAprob());
			}
			if(CadenaUtil.getStrNull(adecuacionDto.getStrRegion()) != null) {
				criteria.andStrRegionLike(adecuacionDto.getStrRegion());
			}
			if(CadenaUtil.getStrNull(adecuacionDto.getStrSituacion()) != null) {
				criteria.andStrSituacionLike(adecuacionDto.getStrSituacion());
			}
		}
		
		List<Adecuacion>	 list	= adecuacionMapper.selectByDefaultParameter(adecuacionParamDef);
		return list;
	}
	
	public Adecuacion buscarById(AdecuacionDto adecuacionDto) throws Exception {
		Adecuacion adecuacion		= new Adecuacion();
		BeanUtils.copyProperties(adecuacionDto, adecuacion);
		return adecuacionMapper.selectByPrimaryKey(adecuacion);
	}
	
	@Transactional
	public Integer guardar(AdecuacionDto adecuacionDto) throws Exception {
		Adecuacion adecuacion		= new Adecuacion();
		BeanUtils.copyProperties(adecuacionDto, adecuacion);
		int rs	= 0;
		Adecuacion exiteAdecuacion		= adecuacionMapper.selectByPrimaryKey(adecuacion);
		if(exiteAdecuacion != null) {
			rs	= adecuacionMapper.updateByPrimaryKeySelective(adecuacion);
		} else {
			rs	= adecuacionMapper.insertSelective(adecuacion);
			
			Integer srlGid	= adecuacionMapper.lastSequence();
			adecuacionDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(AdecuacionDto adecuacionDto) throws Exception {
		Adecuacion adecuacion		= new Adecuacion();
		BeanUtils.copyProperties(adecuacionDto, adecuacion);
		Integer rs	= adecuacionMapper.deleteByPrimaryKey(adecuacion);
		return rs;
	}
	
}
