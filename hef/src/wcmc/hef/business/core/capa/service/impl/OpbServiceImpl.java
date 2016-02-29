package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.OpbDto;
import wcmc.hef.business.core.capa.service.OpbService;
import wcmc.hef.dao.capa.domain.Opb;
import wcmc.hef.dao.capa.domain.OpbParamDef;
import wcmc.hef.dao.capa.domain.OpbParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.OpbMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class OpbServiceImpl implements OpbService {
	@Autowired
	private OpbMapper opbMapper;
	public List<Opb> buscar(OpbDto opbDto) throws Exception {
		OpbParamDef opbParamDef		= new OpbParamDef();
		
		Criteria criteria		= opbParamDef.createCriteria();
		if(opbDto != null) {
			if(CadenaUtil.getStrNull(opbDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(opbDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(opbDto.getStrModalidad()) != null) {
				criteria.andStrModalidadLike(opbDto.getStrModalidad());
			}
			if(CadenaUtil.getStrNull(opbDto.getStrTitular()) != null) {
				criteria.andStrTitularLike(opbDto.getStrTitular());
			}
			if(CadenaUtil.getStrNull(opbDto.getStrContrato()) != null) {
				criteria.andStrContratoLike(opbDto.getStrContrato());
			}
			if(CadenaUtil.getStrNull(opbDto.getStrRegion()) != null) {
				criteria.andStrRegionLike(opbDto.getStrRegion());
			}
			if(CadenaUtil.getDoubNull(opbDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(opbDto.getDblAreaSig());
			}
			if(CadenaUtil.getStrNull(opbDto.getStrSituacion()) != null) {
				criteria.andStrSituacionLike(opbDto.getStrSituacion());
			}
		}
		
		List<Opb>	 list	= opbMapper.selectByDefaultParameter(opbParamDef);
		return list;
	}
	
	public Opb buscarById(OpbDto opbDto) throws Exception {
		Opb opb		= new Opb();
		BeanUtils.copyProperties(opbDto, opb);
		return opbMapper.selectByPrimaryKey(opb);
	}
	
	@Transactional
	public Integer guardar(OpbDto opbDto) throws Exception {
		Opb opb		= new Opb();
		BeanUtils.copyProperties(opbDto, opb);
		int rs	= 0;
		Opb exiteOpb		= opbMapper.selectByPrimaryKey(opb);
		if(exiteOpb != null) {
			rs	= opbMapper.updateByPrimaryKeySelective(opb);
		} else {
			rs	= opbMapper.insertSelective(opb);
			
			Integer srlGid	= opbMapper.lastSequence();
			opbDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(OpbDto opbDto) throws Exception {
		Opb opb		= new Opb();
		BeanUtils.copyProperties(opbDto, opb);
		Integer rs	= opbMapper.deleteByPrimaryKey(opb);
		return rs;
	}
	
}
