package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemIndiceImportanciaBiologicaDto;
import wcmc.hef.business.core.capa.service.TemIndiceImportanciaBiologicaService;
import wcmc.hef.dao.capa.domain.TemIndiceImportanciaBiologica;
import wcmc.hef.dao.capa.domain.TemIndiceImportanciaBiologicaParamDef;
import wcmc.hef.dao.capa.domain.TemIndiceImportanciaBiologicaParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemIndiceImportanciaBiologicaMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemIndiceImportanciaBiologicaServiceImpl implements TemIndiceImportanciaBiologicaService {
	@Autowired
	private TemIndiceImportanciaBiologicaMapper temIndiceImportanciaBiologicaMapper;
	public List<TemIndiceImportanciaBiologica> buscar(TemIndiceImportanciaBiologicaDto temIndiceImportanciaBiologicaDto) throws Exception {
		TemIndiceImportanciaBiologicaParamDef temIndiceImportanciaBiologicaParamDef		= new TemIndiceImportanciaBiologicaParamDef();
		
		Criteria criteria		= temIndiceImportanciaBiologicaParamDef.createCriteria();
		if(temIndiceImportanciaBiologicaDto != null) {
			if(CadenaUtil.getStrNull(temIndiceImportanciaBiologicaDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temIndiceImportanciaBiologicaDto.getStrTheGeom());
			}
			if(CadenaUtil.getDoubNull(temIndiceImportanciaBiologicaDto.getDblImpGlob()) != null) {
				criteria.andDblImpGlobEqualTo(temIndiceImportanciaBiologicaDto.getDblImpGlob());
			}
		}
		
		List<TemIndiceImportanciaBiologica>	 list	= temIndiceImportanciaBiologicaMapper.selectByDefaultParameter(temIndiceImportanciaBiologicaParamDef);
		return list;
	}
	
		public List<TemIndiceImportanciaBiologica> buscarGeometry(TemIndiceImportanciaBiologicaDto temIndiceImportanciaBiologicaDto) throws Exception {
		TemIndiceImportanciaBiologicaParamDef temIndiceImportanciaBiologicaParamDef		= new TemIndiceImportanciaBiologicaParamDef();
		
		Criteria criteria		= temIndiceImportanciaBiologicaParamDef.createCriteria();
		if(temIndiceImportanciaBiologicaDto != null) {
			if(CadenaUtil.getStrNull(temIndiceImportanciaBiologicaDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temIndiceImportanciaBiologicaDto.getStrTheGeom());
			}
			if(CadenaUtil.getDoubNull(temIndiceImportanciaBiologicaDto.getDblImpGlob()) != null) {
				criteria.andDblImpGlobEqualTo(temIndiceImportanciaBiologicaDto.getDblImpGlob());
			}
		}
		
		List<TemIndiceImportanciaBiologica>	 list	= temIndiceImportanciaBiologicaMapper.selectByDefaultParameterGeometry(temIndiceImportanciaBiologicaParamDef);
		return list;
	}
	
	public TemIndiceImportanciaBiologica buscarById(TemIndiceImportanciaBiologicaDto temIndiceImportanciaBiologicaDto) throws Exception {
		TemIndiceImportanciaBiologica temIndiceImportanciaBiologica		= new TemIndiceImportanciaBiologica();
		BeanUtils.copyProperties(temIndiceImportanciaBiologicaDto, temIndiceImportanciaBiologica);
		return temIndiceImportanciaBiologicaMapper.selectByPrimaryKey(temIndiceImportanciaBiologica);
	}
	
	@Transactional
	public Integer guardar(TemIndiceImportanciaBiologicaDto temIndiceImportanciaBiologicaDto) throws Exception {
		TemIndiceImportanciaBiologica temIndiceImportanciaBiologica		= new TemIndiceImportanciaBiologica();
		BeanUtils.copyProperties(temIndiceImportanciaBiologicaDto, temIndiceImportanciaBiologica);
		int rs	= 0;
		TemIndiceImportanciaBiologica exiteTemIndiceImportanciaBiologica		= temIndiceImportanciaBiologicaMapper.selectByPrimaryKey(temIndiceImportanciaBiologica);
		if(exiteTemIndiceImportanciaBiologica != null) {
			rs	= temIndiceImportanciaBiologicaMapper.updateByPrimaryKeySelective(temIndiceImportanciaBiologica);
		} else {
			rs	= temIndiceImportanciaBiologicaMapper.insertSelective(temIndiceImportanciaBiologica);
			
			Integer srlGid	= temIndiceImportanciaBiologicaMapper.lastSequence();
			temIndiceImportanciaBiologicaDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemIndiceImportanciaBiologicaDto temIndiceImportanciaBiologicaDto) throws Exception {
		TemIndiceImportanciaBiologica temIndiceImportanciaBiologica		= new TemIndiceImportanciaBiologica();
		BeanUtils.copyProperties(temIndiceImportanciaBiologicaDto, temIndiceImportanciaBiologica);
		Integer rs	= temIndiceImportanciaBiologicaMapper.deleteByPrimaryKey(temIndiceImportanciaBiologica);
		return rs;
	}
	
}
