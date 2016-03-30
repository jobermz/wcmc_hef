package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemViaFerreaDto;
import wcmc.hef.business.core.capa.service.TemViaFerreaService;
import wcmc.hef.dao.capa.domain.TemViaFerrea;
import wcmc.hef.dao.capa.domain.TemViaFerreaParamDef;
import wcmc.hef.dao.capa.domain.TemViaFerreaParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemViaFerreaMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemViaFerreaServiceImpl implements TemViaFerreaService {
	@Autowired
	private TemViaFerreaMapper temViaFerreaMapper;
	public List<TemViaFerrea> buscar(TemViaFerreaDto temViaFerreaDto) throws Exception {
		TemViaFerreaParamDef temViaFerreaParamDef		= new TemViaFerreaParamDef();
		
		Criteria criteria		= temViaFerreaParamDef.createCriteria();
		if(temViaFerreaDto != null) {
			if(CadenaUtil.getStrNull(temViaFerreaDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temViaFerreaDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(temViaFerreaDto.getIntObjectid1()) != null) {
				criteria.andIntObjectid1EqualTo(temViaFerreaDto.getIntObjectid1());
			}
			if(CadenaUtil.getStrNull(temViaFerreaDto.getStrGmlId()) != null) {
				criteria.andStrGmlIdEqualTo(temViaFerreaDto.getStrGmlId());
			}
			if(CadenaUtil.getInteNull(temViaFerreaDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(temViaFerreaDto.getIntObjectid());
			}
			if(CadenaUtil.getDoubNull(temViaFerreaDto.getDblViaferr()) != null) {
				criteria.andDblViaferrEqualTo(temViaFerreaDto.getDblViaferr());
			}
			if(CadenaUtil.getDoubNull(temViaFerreaDto.getDblShapeStle()) != null) {
				criteria.andDblShapeStleEqualTo(temViaFerreaDto.getDblShapeStle());
			}
			temViaFerreaParamDef.setStrHashConsulta(temViaFerreaDto.getStrHashConsulta());
		}
		
		List<TemViaFerrea>	 list	= temViaFerreaMapper.selectByDefaultParameter(temViaFerreaParamDef);
		return list;
	}
	
	public List<TemViaFerrea> buscarGeometry(TemViaFerreaDto temViaFerreaDto) throws Exception {
		TemViaFerreaParamDef temViaFerreaParamDef		= new TemViaFerreaParamDef();
		
		Criteria criteria		= temViaFerreaParamDef.createCriteria();
		if(temViaFerreaDto != null) {
			if(CadenaUtil.getStrNull(temViaFerreaDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temViaFerreaDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(temViaFerreaDto.getIntObjectid1()) != null) {
				criteria.andIntObjectid1EqualTo(temViaFerreaDto.getIntObjectid1());
			}
			if(CadenaUtil.getStrNull(temViaFerreaDto.getStrGmlId()) != null) {
				criteria.andStrGmlIdEqualTo(temViaFerreaDto.getStrGmlId());
			}
			if(CadenaUtil.getInteNull(temViaFerreaDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(temViaFerreaDto.getIntObjectid());
			}
			if(CadenaUtil.getDoubNull(temViaFerreaDto.getDblViaferr()) != null) {
				criteria.andDblViaferrEqualTo(temViaFerreaDto.getDblViaferr());
			}
			if(CadenaUtil.getDoubNull(temViaFerreaDto.getDblShapeStle()) != null) {
				criteria.andDblShapeStleEqualTo(temViaFerreaDto.getDblShapeStle());
			}
		}
		
		List<TemViaFerrea>	 list	= temViaFerreaMapper.selectByDefaultParameterGeometry(temViaFerreaParamDef);
		return list;
	}
	
	public List<TemViaFerrea> buscarCombo(TemViaFerreaDto temViaFerreaDto) throws Exception {
		TemViaFerreaParamDef temViaFerreaParamDef		= new TemViaFerreaParamDef();
		
		Criteria criteria		= temViaFerreaParamDef.createCriteria();
		if(temViaFerreaDto != null) {
			if(CadenaUtil.getStrNull(temViaFerreaDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temViaFerreaDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(temViaFerreaDto.getIntObjectid1()) != null) {
				criteria.andIntObjectid1EqualTo(temViaFerreaDto.getIntObjectid1());
			}
			if(CadenaUtil.getStrNull(temViaFerreaDto.getStrGmlId()) != null) {
				criteria.andStrGmlIdEqualTo(temViaFerreaDto.getStrGmlId());
			}
			if(CadenaUtil.getInteNull(temViaFerreaDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(temViaFerreaDto.getIntObjectid());
			}
			if(CadenaUtil.getDoubNull(temViaFerreaDto.getDblViaferr()) != null) {
				criteria.andDblViaferrEqualTo(temViaFerreaDto.getDblViaferr());
			}
			if(CadenaUtil.getDoubNull(temViaFerreaDto.getDblShapeStle()) != null) {
				criteria.andDblShapeStleEqualTo(temViaFerreaDto.getDblShapeStle());
			}
		}
		
		List<TemViaFerrea>	 list	= temViaFerreaMapper.selectByDefaultParameterCombo(temViaFerreaParamDef);
		return list;
	}
	
	public TemViaFerrea buscarById(TemViaFerreaDto temViaFerreaDto) throws Exception {
		TemViaFerrea temViaFerrea		= new TemViaFerrea();
		BeanUtils.copyProperties(temViaFerreaDto, temViaFerrea);
		return temViaFerreaMapper.selectByPrimaryKey(temViaFerrea);
	}
	
	public TemViaFerrea buscarGeometryById(TemViaFerreaDto temViaFerreaDto) throws Exception {
		TemViaFerrea temViaFerrea		= new TemViaFerrea();
		BeanUtils.copyProperties(temViaFerreaDto, temViaFerrea);
		return temViaFerreaMapper.selectByPrimaryKeyGeometry(temViaFerrea);
	}
	
	@Transactional
	public Integer guardar(TemViaFerreaDto temViaFerreaDto) throws Exception {
		TemViaFerrea temViaFerrea		= new TemViaFerrea();
		BeanUtils.copyProperties(temViaFerreaDto, temViaFerrea);
		int rs	= 0;
		TemViaFerrea exiteTemViaFerrea		= temViaFerreaMapper.selectByPrimaryKey(temViaFerrea);
		if(exiteTemViaFerrea != null) {
			rs	= temViaFerreaMapper.updateByPrimaryKeySelective(temViaFerrea);
		} else {
			rs	= temViaFerreaMapper.insertSelective(temViaFerrea);
			
			Integer srlGid	= temViaFerreaMapper.lastSequence();
			temViaFerreaDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemViaFerreaDto temViaFerreaDto) throws Exception {
		TemViaFerrea temViaFerrea		= new TemViaFerrea();
		BeanUtils.copyProperties(temViaFerreaDto, temViaFerrea);
		Integer rs	= temViaFerreaMapper.deleteByPrimaryKey(temViaFerrea);
		return rs;
	}
	
}
