package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.ReforDto;
import wcmc.hef.business.core.capa.service.ReforService;
import wcmc.hef.dao.capa.domain.Refor;
import wcmc.hef.dao.capa.domain.ReforParamDef;
import wcmc.hef.dao.capa.domain.ReforParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.ReforMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class ReforServiceImpl implements ReforService {
	@Autowired
	private ReforMapper reforMapper;
	public List<Refor> buscar(ReforDto reforDto) throws Exception {
		ReforParamDef reforParamDef		= new ReforParamDef();
		
		Criteria criteria		= reforParamDef.createCriteria();
		if(reforDto != null) {
			if(CadenaUtil.getStrNull(reforDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(reforDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(reforDto.getStrA¥o()) != null) {
				criteria.andStrA¥oLike(reforDto.getStrA¥o());
			}
			if(CadenaUtil.getStrNull(reforDto.getStrModalidad()) != null) {
				criteria.andStrModalidadLike(reforDto.getStrModalidad());
			}
			if(CadenaUtil.getStrNull(reforDto.getStrContrato()) != null) {
				criteria.andStrContratoLike(reforDto.getStrContrato());
			}
			if(CadenaUtil.getStrNull(reforDto.getStrRegion()) != null) {
				criteria.andStrRegionLike(reforDto.getStrRegion());
			}
			if(CadenaUtil.getStrNull(reforDto.getStrFuente()) != null) {
				criteria.andStrFuenteLike(reforDto.getStrFuente());
			}
			if(CadenaUtil.getStrNull(reforDto.getStrSituacion()) != null) {
				criteria.andStrSituacionLike(reforDto.getStrSituacion());
			}
			if(CadenaUtil.getStrNull(reforDto.getStrTitular()) != null) {
				criteria.andStrTitularLike(reforDto.getStrTitular());
			}
			if(CadenaUtil.getDoubNull(reforDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(reforDto.getDblAreaSig());
			}
		}
		
		List<Refor>	 list	= reforMapper.selectByDefaultParameter(reforParamDef);
		return list;
	}
	
	public Refor buscarById(ReforDto reforDto) throws Exception {
		Refor refor		= new Refor();
		BeanUtils.copyProperties(reforDto, refor);
		return reforMapper.selectByPrimaryKey(refor);
	}
	
	@Transactional
	public Integer guardar(ReforDto reforDto) throws Exception {
		Refor refor		= new Refor();
		BeanUtils.copyProperties(reforDto, refor);
		int rs	= 0;
		Refor exiteRefor		= reforMapper.selectByPrimaryKey(refor);
		if(exiteRefor != null) {
			rs	= reforMapper.updateByPrimaryKeySelective(refor);
		} else {
			rs	= reforMapper.insertSelective(refor);
			
			Integer srlGid	= reforMapper.lastSequence();
			reforDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(ReforDto reforDto) throws Exception {
		Refor refor		= new Refor();
		BeanUtils.copyProperties(reforDto, refor);
		Integer rs	= reforMapper.deleteByPrimaryKey(refor);
		return rs;
	}
	
}
