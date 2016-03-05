package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemCentrosPobladosDto;
import wcmc.hef.business.core.capa.service.TemCentrosPobladosService;
import wcmc.hef.dao.capa.domain.TemCentrosPoblados;
import wcmc.hef.dao.capa.domain.TemCentrosPobladosParamDef;
import wcmc.hef.dao.capa.domain.TemCentrosPobladosParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemCentrosPobladosMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemCentrosPobladosServiceImpl implements TemCentrosPobladosService {
	@Autowired
	private TemCentrosPobladosMapper temCentrosPobladosMapper;
	public List<TemCentrosPoblados> buscar(TemCentrosPobladosDto temCentrosPobladosDto) throws Exception {
		TemCentrosPobladosParamDef temCentrosPobladosParamDef		= new TemCentrosPobladosParamDef();
		
		Criteria criteria		= temCentrosPobladosParamDef.createCriteria();
		if(temCentrosPobladosDto != null) {
			if(CadenaUtil.getStrNull(temCentrosPobladosDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temCentrosPobladosDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(temCentrosPobladosDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(temCentrosPobladosDto.getIntObjectid());
			}
			if(CadenaUtil.getStrNull(temCentrosPobladosDto.getStrIdccpp10()) != null) {
				criteria.andStrIdccpp10Like(temCentrosPobladosDto.getStrIdccpp10());
			}
			if(CadenaUtil.getStrNull(temCentrosPobladosDto.getStrArea()) != null) {
				criteria.andStrAreaLike(temCentrosPobladosDto.getStrArea());
			}
			if(CadenaUtil.getStrNull(temCentrosPobladosDto.getStrCodccpp()) != null) {
				criteria.andStrCodccppLike(temCentrosPobladosDto.getStrCodccpp());
			}
			if(CadenaUtil.getStrNull(temCentrosPobladosDto.getStrNomccpp()) != null) {
				criteria.andStrNomccppLike(temCentrosPobladosDto.getStrNomccpp());
			}
			if(CadenaUtil.getStrNull(temCentrosPobladosDto.getStrUbigeo()) != null) {
				criteria.andStrUbigeoLike(temCentrosPobladosDto.getStrUbigeo());
			}
			if(CadenaUtil.getStrNull(temCentrosPobladosDto.getStrCcdi()) != null) {
				criteria.andStrCcdiLike(temCentrosPobladosDto.getStrCcdi());
			}
			if(CadenaUtil.getStrNull(temCentrosPobladosDto.getStrCcpp()) != null) {
				criteria.andStrCcppLike(temCentrosPobladosDto.getStrCcpp());
			}
			if(CadenaUtil.getStrNull(temCentrosPobladosDto.getStrCcdd()) != null) {
				criteria.andStrCcddLike(temCentrosPobladosDto.getStrCcdd());
			}
			if(CadenaUtil.getStrNull(temCentrosPobladosDto.getStrCatccpp()) != null) {
				criteria.andStrCatccppLike(temCentrosPobladosDto.getStrCatccpp());
			}
			if(CadenaUtil.getStrNull(temCentrosPobladosDto.getStrNomcat()) != null) {
				criteria.andStrNomcatLike(temCentrosPobladosDto.getStrNomcat());
			}
			if(CadenaUtil.getInteNull(temCentrosPobladosDto.getIntAltitud()) != null) {
				criteria.andIntAltitudEqualTo(temCentrosPobladosDto.getIntAltitud());
			}
			if(CadenaUtil.getStrNull(temCentrosPobladosDto.getStrLongitudx()) != null) {
				criteria.andStrLongitudxLike(temCentrosPobladosDto.getStrLongitudx());
			}
			if(CadenaUtil.getStrNull(temCentrosPobladosDto.getStrLatitudy()) != null) {
				criteria.andStrLatitudyLike(temCentrosPobladosDto.getStrLatitudy());
			}
			if(CadenaUtil.getInteNull(temCentrosPobladosDto.getIntViv07()) != null) {
				criteria.andIntViv07EqualTo(temCentrosPobladosDto.getIntViv07());
			}
			if(CadenaUtil.getInteNull(temCentrosPobladosDto.getIntPob07()) != null) {
				criteria.andIntPob07EqualTo(temCentrosPobladosDto.getIntPob07());
			}
			if(CadenaUtil.getInteNull(temCentrosPobladosDto.getIntRegion()) != null) {
				criteria.andIntRegionEqualTo(temCentrosPobladosDto.getIntRegion());
			}
		}
		
		List<TemCentrosPoblados>	 list	= temCentrosPobladosMapper.selectByDefaultParameter(temCentrosPobladosParamDef);
		return list;
	}
	
	public TemCentrosPoblados buscarById(TemCentrosPobladosDto temCentrosPobladosDto) throws Exception {
		TemCentrosPoblados temCentrosPoblados		= new TemCentrosPoblados();
		BeanUtils.copyProperties(temCentrosPobladosDto, temCentrosPoblados);
		return temCentrosPobladosMapper.selectByPrimaryKey(temCentrosPoblados);
	}
	
	@Transactional
	public Integer guardar(TemCentrosPobladosDto temCentrosPobladosDto) throws Exception {
		TemCentrosPoblados temCentrosPoblados		= new TemCentrosPoblados();
		BeanUtils.copyProperties(temCentrosPobladosDto, temCentrosPoblados);
		int rs	= 0;
		TemCentrosPoblados exiteTemCentrosPoblados		= temCentrosPobladosMapper.selectByPrimaryKey(temCentrosPoblados);
		if(exiteTemCentrosPoblados != null) {
			rs	= temCentrosPobladosMapper.updateByPrimaryKeySelective(temCentrosPoblados);
		} else {
			rs	= temCentrosPobladosMapper.insertSelective(temCentrosPoblados);
			
			Integer srlGid	= temCentrosPobladosMapper.lastSequence();
			temCentrosPobladosDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemCentrosPobladosDto temCentrosPobladosDto) throws Exception {
		TemCentrosPoblados temCentrosPoblados		= new TemCentrosPoblados();
		BeanUtils.copyProperties(temCentrosPobladosDto, temCentrosPoblados);
		Integer rs	= temCentrosPobladosMapper.deleteByPrimaryKey(temCentrosPoblados);
		return rs;
	}
	
}
