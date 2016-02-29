package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.Ccpp10UtmDto;
import wcmc.hef.business.core.capa.service.Ccpp10UtmService;
import wcmc.hef.dao.capa.domain.Ccpp10Utm;
import wcmc.hef.dao.capa.domain.Ccpp10UtmParamDef;
import wcmc.hef.dao.capa.domain.Ccpp10UtmParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.Ccpp10UtmMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class Ccpp10UtmServiceImpl implements Ccpp10UtmService {
	@Autowired
	private Ccpp10UtmMapper ccpp10UtmMapper;
	public List<Ccpp10Utm> buscar(Ccpp10UtmDto ccpp10UtmDto) throws Exception {
		Ccpp10UtmParamDef ccpp10UtmParamDef		= new Ccpp10UtmParamDef();
		
		Criteria criteria		= ccpp10UtmParamDef.createCriteria();
		if(ccpp10UtmDto != null) {
			if(CadenaUtil.getStrNull(ccpp10UtmDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(ccpp10UtmDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(ccpp10UtmDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(ccpp10UtmDto.getIntObjectid());
			}
			if(CadenaUtil.getStrNull(ccpp10UtmDto.getStrIdccpp10()) != null) {
				criteria.andStrIdccpp10Like(ccpp10UtmDto.getStrIdccpp10());
			}
			if(CadenaUtil.getStrNull(ccpp10UtmDto.getStrArea()) != null) {
				criteria.andStrAreaLike(ccpp10UtmDto.getStrArea());
			}
			if(CadenaUtil.getStrNull(ccpp10UtmDto.getStrCodccpp()) != null) {
				criteria.andStrCodccppLike(ccpp10UtmDto.getStrCodccpp());
			}
			if(CadenaUtil.getStrNull(ccpp10UtmDto.getStrNomccpp()) != null) {
				criteria.andStrNomccppLike(ccpp10UtmDto.getStrNomccpp());
			}
			if(CadenaUtil.getStrNull(ccpp10UtmDto.getStrUbigeo()) != null) {
				criteria.andStrUbigeoLike(ccpp10UtmDto.getStrUbigeo());
			}
			if(CadenaUtil.getStrNull(ccpp10UtmDto.getStrCcdi()) != null) {
				criteria.andStrCcdiLike(ccpp10UtmDto.getStrCcdi());
			}
			if(CadenaUtil.getStrNull(ccpp10UtmDto.getStrCcpp()) != null) {
				criteria.andStrCcppLike(ccpp10UtmDto.getStrCcpp());
			}
			if(CadenaUtil.getStrNull(ccpp10UtmDto.getStrCcdd()) != null) {
				criteria.andStrCcddLike(ccpp10UtmDto.getStrCcdd());
			}
			if(CadenaUtil.getStrNull(ccpp10UtmDto.getStrCatccpp()) != null) {
				criteria.andStrCatccppLike(ccpp10UtmDto.getStrCatccpp());
			}
			if(CadenaUtil.getStrNull(ccpp10UtmDto.getStrNomcat()) != null) {
				criteria.andStrNomcatLike(ccpp10UtmDto.getStrNomcat());
			}
			if(CadenaUtil.getInteNull(ccpp10UtmDto.getIntAltitud()) != null) {
				criteria.andIntAltitudEqualTo(ccpp10UtmDto.getIntAltitud());
			}
			if(CadenaUtil.getStrNull(ccpp10UtmDto.getStrLongitudx()) != null) {
				criteria.andStrLongitudxLike(ccpp10UtmDto.getStrLongitudx());
			}
			if(CadenaUtil.getStrNull(ccpp10UtmDto.getStrLatitudy()) != null) {
				criteria.andStrLatitudyLike(ccpp10UtmDto.getStrLatitudy());
			}
			if(CadenaUtil.getInteNull(ccpp10UtmDto.getIntViv07()) != null) {
				criteria.andIntViv07EqualTo(ccpp10UtmDto.getIntViv07());
			}
			if(CadenaUtil.getInteNull(ccpp10UtmDto.getIntPob07()) != null) {
				criteria.andIntPob07EqualTo(ccpp10UtmDto.getIntPob07());
			}
			if(CadenaUtil.getInteNull(ccpp10UtmDto.getIntRegion()) != null) {
				criteria.andIntRegionEqualTo(ccpp10UtmDto.getIntRegion());
			}
		}
		
		List<Ccpp10Utm>	 list	= ccpp10UtmMapper.selectByDefaultParameter(ccpp10UtmParamDef);
		return list;
	}
	
	public Ccpp10Utm buscarById(Ccpp10UtmDto ccpp10UtmDto) throws Exception {
		Ccpp10Utm ccpp10Utm		= new Ccpp10Utm();
		BeanUtils.copyProperties(ccpp10UtmDto, ccpp10Utm);
		return ccpp10UtmMapper.selectByPrimaryKey(ccpp10Utm);
	}
	
	@Transactional
	public Integer guardar(Ccpp10UtmDto ccpp10UtmDto) throws Exception {
		Ccpp10Utm ccpp10Utm		= new Ccpp10Utm();
		BeanUtils.copyProperties(ccpp10UtmDto, ccpp10Utm);
		int rs	= 0;
		Ccpp10Utm exiteCcpp10Utm		= ccpp10UtmMapper.selectByPrimaryKey(ccpp10Utm);
		if(exiteCcpp10Utm != null) {
			rs	= ccpp10UtmMapper.updateByPrimaryKeySelective(ccpp10Utm);
		} else {
			rs	= ccpp10UtmMapper.insertSelective(ccpp10Utm);
			
			Integer srlGid	= ccpp10UtmMapper.lastSequence();
			ccpp10UtmDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(Ccpp10UtmDto ccpp10UtmDto) throws Exception {
		Ccpp10Utm ccpp10Utm		= new Ccpp10Utm();
		BeanUtils.copyProperties(ccpp10UtmDto, ccpp10Utm);
		Integer rs	= ccpp10UtmMapper.deleteByPrimaryKey(ccpp10Utm);
		return rs;
	}
	
}
