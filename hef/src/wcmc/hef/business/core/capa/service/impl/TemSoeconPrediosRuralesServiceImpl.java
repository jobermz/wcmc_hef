package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemSoeconPrediosRuralesDto;
import wcmc.hef.business.core.capa.service.TemSoeconPrediosRuralesService;
import wcmc.hef.dao.capa.domain.TemSoeconPrediosRurales;
import wcmc.hef.dao.capa.domain.TemSoeconPrediosRuralesParamDef;
import wcmc.hef.dao.capa.domain.TemSoeconPrediosRuralesParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemSoeconPrediosRuralesMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemSoeconPrediosRuralesServiceImpl implements TemSoeconPrediosRuralesService {
	@Autowired
	private TemSoeconPrediosRuralesMapper temSoeconPrediosRuralesMapper;
	public List<TemSoeconPrediosRurales> buscar(TemSoeconPrediosRuralesDto temSoeconPrediosRuralesDto) throws Exception {
		TemSoeconPrediosRuralesParamDef temSoeconPrediosRuralesParamDef		= new TemSoeconPrediosRuralesParamDef();
		
		Criteria criteria		= temSoeconPrediosRuralesParamDef.createCriteria();
		if(temSoeconPrediosRuralesDto != null) {
			if(CadenaUtil.getStrNull(temSoeconPrediosRuralesDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(temSoeconPrediosRuralesDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temSoeconPrediosRuralesDto.getStrDepartamen()) != null) {
				criteria.andStrDepartamenLike(temSoeconPrediosRuralesDto.getStrDepartamen());
			}
			if(CadenaUtil.getStrNull(temSoeconPrediosRuralesDto.getStrDatum()) != null) {
				criteria.andStrDatumLike(temSoeconPrediosRuralesDto.getStrDatum());
			}
			if(CadenaUtil.getStrNull(temSoeconPrediosRuralesDto.getStrCodproy()) != null) {
				criteria.andStrCodproyLike(temSoeconPrediosRuralesDto.getStrCodproy());
			}
			if(CadenaUtil.getInteNull(temSoeconPrediosRuralesDto.getIntCntCodpro()) != null) {
				criteria.andIntCntCodproEqualTo(temSoeconPrediosRuralesDto.getIntCntCodpro());
			}
			if(CadenaUtil.getInteNull(temSoeconPrediosRuralesDto.getIntOrigFid()) != null) {
				criteria.andIntOrigFidEqualTo(temSoeconPrediosRuralesDto.getIntOrigFid());
			}
		}
		
		List<TemSoeconPrediosRurales>	 list	= temSoeconPrediosRuralesMapper.selectByDefaultParameter(temSoeconPrediosRuralesParamDef);
		return list;
	}
	
	public TemSoeconPrediosRurales buscarById(TemSoeconPrediosRuralesDto temSoeconPrediosRuralesDto) throws Exception {
		TemSoeconPrediosRurales temSoeconPrediosRurales		= new TemSoeconPrediosRurales();
		BeanUtils.copyProperties(temSoeconPrediosRuralesDto, temSoeconPrediosRurales);
		return temSoeconPrediosRuralesMapper.selectByPrimaryKey(temSoeconPrediosRurales);
	}
	
	@Transactional
	public Integer guardar(TemSoeconPrediosRuralesDto temSoeconPrediosRuralesDto) throws Exception {
		TemSoeconPrediosRurales temSoeconPrediosRurales		= new TemSoeconPrediosRurales();
		BeanUtils.copyProperties(temSoeconPrediosRuralesDto, temSoeconPrediosRurales);
		int rs	= 0;
		TemSoeconPrediosRurales exiteTemSoeconPrediosRurales		= temSoeconPrediosRuralesMapper.selectByPrimaryKey(temSoeconPrediosRurales);
		if(exiteTemSoeconPrediosRurales != null) {
			rs	= temSoeconPrediosRuralesMapper.updateByPrimaryKeySelective(temSoeconPrediosRurales);
		} else {
			rs	= temSoeconPrediosRuralesMapper.insertSelective(temSoeconPrediosRurales);
			
			Integer srlGid	= temSoeconPrediosRuralesMapper.lastSequence();
			temSoeconPrediosRuralesDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemSoeconPrediosRuralesDto temSoeconPrediosRuralesDto) throws Exception {
		TemSoeconPrediosRurales temSoeconPrediosRurales		= new TemSoeconPrediosRurales();
		BeanUtils.copyProperties(temSoeconPrediosRuralesDto, temSoeconPrediosRurales);
		Integer rs	= temSoeconPrediosRuralesMapper.deleteByPrimaryKey(temSoeconPrediosRurales);
		return rs;
	}
	
}
