package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.NombreRioDto;
import wcmc.hef.business.core.capa.service.NombreRioService;
import wcmc.hef.dao.capa.domain.NombreRio;
import wcmc.hef.dao.capa.domain.NombreRioParamDef;
import wcmc.hef.dao.capa.domain.NombreRioParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.NombreRioMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class NombreRioServiceImpl implements NombreRioService {
	@Autowired
	private NombreRioMapper nombreRioMapper;
	public List<NombreRio> buscar(NombreRioDto nombreRioDto) throws Exception {
		NombreRioParamDef nombreRioParamDef		= new NombreRioParamDef();
		
		Criteria criteria		= nombreRioParamDef.createCriteria();
		if(nombreRioDto != null) {
			if(CadenaUtil.getStrNull(nombreRioDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(nombreRioDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(nombreRioDto.getIntObjectid1()) != null) {
				criteria.andIntObjectid1EqualTo(nombreRioDto.getIntObjectid1());
			}
			if(CadenaUtil.getStrNull(nombreRioDto.getStrGmlId()) != null) {
				criteria.andStrGmlIdLike(nombreRioDto.getStrGmlId());
			}
			if(CadenaUtil.getInteNull(nombreRioDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(nombreRioDto.getIntObjectid());
			}
			if(CadenaUtil.getInteNull(nombreRioDto.getIntId()) != null) {
				criteria.andIntIdEqualTo(nombreRioDto.getIntId());
			}
			if(CadenaUtil.getStrNull(nombreRioDto.getStrNombre()) != null) {
				criteria.andStrNombreLike(nombreRioDto.getStrNombre());
			}
			if(CadenaUtil.getDoubNull(nombreRioDto.getDblShapeStle()) != null) {
				criteria.andDblShapeStleEqualTo(nombreRioDto.getDblShapeStle());
			}
		}
		
		List<NombreRio>	 list	= nombreRioMapper.selectByDefaultParameter(nombreRioParamDef);
		return list;
	}
	
	public NombreRio buscarById(NombreRioDto nombreRioDto) throws Exception {
		NombreRio nombreRio		= new NombreRio();
		BeanUtils.copyProperties(nombreRioDto, nombreRio);
		return nombreRioMapper.selectByPrimaryKey(nombreRio);
	}
	
	@Transactional
	public Integer guardar(NombreRioDto nombreRioDto) throws Exception {
		NombreRio nombreRio		= new NombreRio();
		BeanUtils.copyProperties(nombreRioDto, nombreRio);
		int rs	= 0;
		NombreRio exiteNombreRio		= nombreRioMapper.selectByPrimaryKey(nombreRio);
		if(exiteNombreRio != null) {
			rs	= nombreRioMapper.updateByPrimaryKeySelective(nombreRio);
		} else {
			rs	= nombreRioMapper.insertSelective(nombreRio);
			
			Integer srlGid	= nombreRioMapper.lastSequence();
			nombreRioDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(NombreRioDto nombreRioDto) throws Exception {
		NombreRio nombreRio		= new NombreRio();
		BeanUtils.copyProperties(nombreRioDto, nombreRio);
		Integer rs	= nombreRioMapper.deleteByPrimaryKey(nombreRio);
		return rs;
	}
	
}
