package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.ViaFerreaDto;
import wcmc.hef.business.core.capa.service.ViaFerreaService;
import wcmc.hef.dao.capa.domain.ViaFerrea;
import wcmc.hef.dao.capa.domain.ViaFerreaParamDef;
import wcmc.hef.dao.capa.domain.ViaFerreaParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.ViaFerreaMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class ViaFerreaServiceImpl implements ViaFerreaService {
	@Autowired
	private ViaFerreaMapper viaFerreaMapper;
	public List<ViaFerrea> buscar(ViaFerreaDto viaFerreaDto) throws Exception {
		ViaFerreaParamDef viaFerreaParamDef		= new ViaFerreaParamDef();
		
		Criteria criteria		= viaFerreaParamDef.createCriteria();
		if(viaFerreaDto != null) {
			if(CadenaUtil.getStrNull(viaFerreaDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(viaFerreaDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(viaFerreaDto.getIntObjectid1()) != null) {
				criteria.andIntObjectid1EqualTo(viaFerreaDto.getIntObjectid1());
			}
			if(CadenaUtil.getStrNull(viaFerreaDto.getStrGmlId()) != null) {
				criteria.andStrGmlIdLike(viaFerreaDto.getStrGmlId());
			}
			if(CadenaUtil.getInteNull(viaFerreaDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(viaFerreaDto.getIntObjectid());
			}
			if(CadenaUtil.getDoubNull(viaFerreaDto.getDblViaferr()) != null) {
				criteria.andDblViaferrEqualTo(viaFerreaDto.getDblViaferr());
			}
			if(CadenaUtil.getDoubNull(viaFerreaDto.getDblShapeStle()) != null) {
				criteria.andDblShapeStleEqualTo(viaFerreaDto.getDblShapeStle());
			}
		}
		
		List<ViaFerrea>	 list	= viaFerreaMapper.selectByDefaultParameter(viaFerreaParamDef);
		return list;
	}
	
	public ViaFerrea buscarById(ViaFerreaDto viaFerreaDto) throws Exception {
		ViaFerrea viaFerrea		= new ViaFerrea();
		BeanUtils.copyProperties(viaFerreaDto, viaFerrea);
		return viaFerreaMapper.selectByPrimaryKey(viaFerrea);
	}
	
	@Transactional
	public Integer guardar(ViaFerreaDto viaFerreaDto) throws Exception {
		ViaFerrea viaFerrea		= new ViaFerrea();
		BeanUtils.copyProperties(viaFerreaDto, viaFerrea);
		int rs	= 0;
		ViaFerrea exiteViaFerrea		= viaFerreaMapper.selectByPrimaryKey(viaFerrea);
		if(exiteViaFerrea != null) {
			rs	= viaFerreaMapper.updateByPrimaryKeySelective(viaFerrea);
		} else {
			rs	= viaFerreaMapper.insertSelective(viaFerrea);
			
			Integer srlGid	= viaFerreaMapper.lastSequence();
			viaFerreaDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(ViaFerreaDto viaFerreaDto) throws Exception {
		ViaFerrea viaFerrea		= new ViaFerrea();
		BeanUtils.copyProperties(viaFerreaDto, viaFerrea);
		Integer rs	= viaFerreaMapper.deleteByPrimaryKey(viaFerrea);
		return rs;
	}
	
}
