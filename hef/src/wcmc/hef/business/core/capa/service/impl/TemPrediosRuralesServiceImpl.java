package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemPrediosRuralesDto;
import wcmc.hef.business.core.capa.service.TemPrediosRuralesService;
import wcmc.hef.dao.capa.domain.TemPrediosRurales;
import wcmc.hef.dao.capa.domain.TemPrediosRuralesParamDef;
import wcmc.hef.dao.capa.domain.TemPrediosRuralesParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemPrediosRuralesMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemPrediosRuralesServiceImpl implements TemPrediosRuralesService {
	@Autowired
	private TemPrediosRuralesMapper temPrediosRuralesMapper;
	public List<TemPrediosRurales> buscar(TemPrediosRuralesDto temPrediosRuralesDto) throws Exception {
		TemPrediosRuralesParamDef temPrediosRuralesParamDef		= new TemPrediosRuralesParamDef();
		
		Criteria criteria		= temPrediosRuralesParamDef.createCriteria();
		if(temPrediosRuralesDto != null) {
			if(CadenaUtil.getStrNull(temPrediosRuralesDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temPrediosRuralesDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temPrediosRuralesDto.getStrDepartamen()) != null) {
				criteria.andStrDepartamenEqualTo(temPrediosRuralesDto.getStrDepartamen());
			}
			if(CadenaUtil.getStrNull(temPrediosRuralesDto.getStrDatum()) != null) {
				criteria.andStrDatumEqualTo(temPrediosRuralesDto.getStrDatum());
			}
			if(CadenaUtil.getStrNull(temPrediosRuralesDto.getStrCodproy()) != null) {
				criteria.andStrCodproyEqualTo(temPrediosRuralesDto.getStrCodproy());
			}
			if(CadenaUtil.getInteNull(temPrediosRuralesDto.getIntCntCodpro()) != null) {
				criteria.andIntCntCodproEqualTo(temPrediosRuralesDto.getIntCntCodpro());
			}
			if(CadenaUtil.getInteNull(temPrediosRuralesDto.getIntOrigFid()) != null) {
				criteria.andIntOrigFidEqualTo(temPrediosRuralesDto.getIntOrigFid());
			}
		}
		
		List<TemPrediosRurales>	 list	= temPrediosRuralesMapper.selectByDefaultParameter(temPrediosRuralesParamDef);
		return list;
	}
	
	public List<TemPrediosRurales> buscarGeometry(TemPrediosRuralesDto temPrediosRuralesDto) throws Exception {
		TemPrediosRuralesParamDef temPrediosRuralesParamDef		= new TemPrediosRuralesParamDef();
		
		Criteria criteria		= temPrediosRuralesParamDef.createCriteria();
		if(temPrediosRuralesDto != null) {
			if(CadenaUtil.getStrNull(temPrediosRuralesDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temPrediosRuralesDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temPrediosRuralesDto.getStrDepartamen()) != null) {
				criteria.andStrDepartamenEqualTo(temPrediosRuralesDto.getStrDepartamen());
			}
			if(CadenaUtil.getStrNull(temPrediosRuralesDto.getStrDatum()) != null) {
				criteria.andStrDatumEqualTo(temPrediosRuralesDto.getStrDatum());
			}
			if(CadenaUtil.getStrNull(temPrediosRuralesDto.getStrCodproy()) != null) {
				criteria.andStrCodproyEqualTo(temPrediosRuralesDto.getStrCodproy());
			}
			if(CadenaUtil.getInteNull(temPrediosRuralesDto.getIntCntCodpro()) != null) {
				criteria.andIntCntCodproEqualTo(temPrediosRuralesDto.getIntCntCodpro());
			}
			if(CadenaUtil.getInteNull(temPrediosRuralesDto.getIntOrigFid()) != null) {
				criteria.andIntOrigFidEqualTo(temPrediosRuralesDto.getIntOrigFid());
			}
		}
		
		List<TemPrediosRurales>	 list	= temPrediosRuralesMapper.selectByDefaultParameterGeometry(temPrediosRuralesParamDef);
		return list;
	}
	
	public List<TemPrediosRurales> buscarCombo(TemPrediosRuralesDto temPrediosRuralesDto) throws Exception {
		TemPrediosRuralesParamDef temPrediosRuralesParamDef		= new TemPrediosRuralesParamDef();
		
		Criteria criteria		= temPrediosRuralesParamDef.createCriteria();
		if(temPrediosRuralesDto != null) {
			if(CadenaUtil.getStrNull(temPrediosRuralesDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temPrediosRuralesDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temPrediosRuralesDto.getStrDepartamen()) != null) {
				criteria.andStrDepartamenEqualTo(temPrediosRuralesDto.getStrDepartamen());
			}
			if(CadenaUtil.getStrNull(temPrediosRuralesDto.getStrDatum()) != null) {
				criteria.andStrDatumEqualTo(temPrediosRuralesDto.getStrDatum());
			}
			if(CadenaUtil.getStrNull(temPrediosRuralesDto.getStrCodproy()) != null) {
				criteria.andStrCodproyEqualTo(temPrediosRuralesDto.getStrCodproy());
			}
			if(CadenaUtil.getInteNull(temPrediosRuralesDto.getIntCntCodpro()) != null) {
				criteria.andIntCntCodproEqualTo(temPrediosRuralesDto.getIntCntCodpro());
			}
			if(CadenaUtil.getInteNull(temPrediosRuralesDto.getIntOrigFid()) != null) {
				criteria.andIntOrigFidEqualTo(temPrediosRuralesDto.getIntOrigFid());
			}
		}
		
		List<TemPrediosRurales>	 list	= temPrediosRuralesMapper.selectByDefaultParameterCombo(temPrediosRuralesParamDef);
		return list;
	}
	
	public TemPrediosRurales buscarById(TemPrediosRuralesDto temPrediosRuralesDto) throws Exception {
		TemPrediosRurales temPrediosRurales		= new TemPrediosRurales();
		BeanUtils.copyProperties(temPrediosRuralesDto, temPrediosRurales);
		return temPrediosRuralesMapper.selectByPrimaryKey(temPrediosRurales);
	}
	
	public TemPrediosRurales buscarGeometryById(TemPrediosRuralesDto temPrediosRuralesDto) throws Exception {
		TemPrediosRurales temPrediosRurales		= new TemPrediosRurales();
		BeanUtils.copyProperties(temPrediosRuralesDto, temPrediosRurales);
		return temPrediosRuralesMapper.selectByPrimaryKeyGeometry(temPrediosRurales);
	}
	
	@Transactional
	public Integer guardar(TemPrediosRuralesDto temPrediosRuralesDto) throws Exception {
		TemPrediosRurales temPrediosRurales		= new TemPrediosRurales();
		BeanUtils.copyProperties(temPrediosRuralesDto, temPrediosRurales);
		int rs	= 0;
		TemPrediosRurales exiteTemPrediosRurales		= temPrediosRuralesMapper.selectByPrimaryKey(temPrediosRurales);
		if(exiteTemPrediosRurales != null) {
			rs	= temPrediosRuralesMapper.updateByPrimaryKeySelective(temPrediosRurales);
		} else {
			rs	= temPrediosRuralesMapper.insertSelective(temPrediosRurales);
			
			Integer srlGid	= temPrediosRuralesMapper.lastSequence();
			temPrediosRuralesDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemPrediosRuralesDto temPrediosRuralesDto) throws Exception {
		TemPrediosRurales temPrediosRurales		= new TemPrediosRurales();
		BeanUtils.copyProperties(temPrediosRuralesDto, temPrediosRurales);
		Integer rs	= temPrediosRuralesMapper.deleteByPrimaryKey(temPrediosRurales);
		return rs;
	}
	
}
