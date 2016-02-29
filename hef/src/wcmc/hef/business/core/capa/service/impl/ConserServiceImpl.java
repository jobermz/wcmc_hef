package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.ConserDto;
import wcmc.hef.business.core.capa.service.ConserService;
import wcmc.hef.dao.capa.domain.Conser;
import wcmc.hef.dao.capa.domain.ConserParamDef;
import wcmc.hef.dao.capa.domain.ConserParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.ConserMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class ConserServiceImpl implements ConserService {
	@Autowired
	private ConserMapper conserMapper;
	public List<Conser> buscar(ConserDto conserDto) throws Exception {
		ConserParamDef conserParamDef		= new ConserParamDef();
		
		Criteria criteria		= conserParamDef.createCriteria();
		if(conserDto != null) {
			if(CadenaUtil.getStrNull(conserDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(conserDto.getStrTheGeom());
			}
			if(CadenaUtil.getDoubNull(conserDto.getDblNum()) != null) {
				criteria.andDblNumEqualTo(conserDto.getDblNum());
			}
			if(CadenaUtil.getInteNull(conserDto.getIntId()) != null) {
				criteria.andIntIdEqualTo(conserDto.getIntId());
			}
			if(CadenaUtil.getStrNull(conserDto.getStrModalidad()) != null) {
				criteria.andStrModalidadLike(conserDto.getStrModalidad());
			}
			if(CadenaUtil.getStrNull(conserDto.getStrTitular()) != null) {
				criteria.andStrTitularLike(conserDto.getStrTitular());
			}
			if(CadenaUtil.getStrNull(conserDto.getStrContrato()) != null) {
				criteria.andStrContratoLike(conserDto.getStrContrato());
			}
			if(CadenaUtil.getDoubNull(conserDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(conserDto.getDblAreaSig());
			}
			if(CadenaUtil.getDoubNull(conserDto.getDblAreaAprob()) != null) {
				criteria.andDblAreaAprobEqualTo(conserDto.getDblAreaAprob());
			}
			if(CadenaUtil.getStrNull(conserDto.getStrRegion()) != null) {
				criteria.andStrRegionLike(conserDto.getStrRegion());
			}
			if(CadenaUtil.getStrNull(conserDto.getStrSituacion()) != null) {
				criteria.andStrSituacionLike(conserDto.getStrSituacion());
			}
		}
		
		List<Conser>	 list	= conserMapper.selectByDefaultParameter(conserParamDef);
		return list;
	}
	
	public Conser buscarById(ConserDto conserDto) throws Exception {
		Conser conser		= new Conser();
		BeanUtils.copyProperties(conserDto, conser);
		return conserMapper.selectByPrimaryKey(conser);
	}
	
	@Transactional
	public Integer guardar(ConserDto conserDto) throws Exception {
		Conser conser		= new Conser();
		BeanUtils.copyProperties(conserDto, conser);
		int rs	= 0;
		Conser exiteConser		= conserMapper.selectByPrimaryKey(conser);
		if(exiteConser != null) {
			rs	= conserMapper.updateByPrimaryKeySelective(conser);
		} else {
			rs	= conserMapper.insertSelective(conser);
			
			Integer srlGid	= conserMapper.lastSequence();
			conserDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(ConserDto conserDto) throws Exception {
		Conser conser		= new Conser();
		BeanUtils.copyProperties(conserDto, conser);
		Integer rs	= conserMapper.deleteByPrimaryKey(conser);
		return rs;
	}
	
}
