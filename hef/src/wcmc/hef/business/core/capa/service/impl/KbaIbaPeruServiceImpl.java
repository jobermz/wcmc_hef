package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.KbaIbaPeruDto;
import wcmc.hef.business.core.capa.service.KbaIbaPeruService;
import wcmc.hef.dao.capa.domain.KbaIbaPeru;
import wcmc.hef.dao.capa.domain.KbaIbaPeruParamDef;
import wcmc.hef.dao.capa.domain.KbaIbaPeruParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.KbaIbaPeruMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class KbaIbaPeruServiceImpl implements KbaIbaPeruService {
	@Autowired
	private KbaIbaPeruMapper kbaIbaPeruMapper;
	public List<KbaIbaPeru> buscar(KbaIbaPeruDto kbaIbaPeruDto) throws Exception {
		KbaIbaPeruParamDef kbaIbaPeruParamDef		= new KbaIbaPeruParamDef();
		
		Criteria criteria		= kbaIbaPeruParamDef.createCriteria();
		if(kbaIbaPeruDto != null) {
			if(CadenaUtil.getStrNull(kbaIbaPeruDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(kbaIbaPeruDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(kbaIbaPeruDto.getIntObjectid1()) != null) {
				criteria.andIntObjectid1EqualTo(kbaIbaPeruDto.getIntObjectid1());
			}
			if(CadenaUtil.getInteNull(kbaIbaPeruDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(kbaIbaPeruDto.getIntObjectid());
			}
			if(CadenaUtil.getInteNull(kbaIbaPeruDto.getIntSitrecid()) != null) {
				criteria.andIntSitrecidEqualTo(kbaIbaPeruDto.getIntSitrecid());
			}
			if(CadenaUtil.getStrNull(kbaIbaPeruDto.getStrRegion()) != null) {
				criteria.andStrRegionLike(kbaIbaPeruDto.getStrRegion());
			}
			if(CadenaUtil.getStrNull(kbaIbaPeruDto.getStrCountry()) != null) {
				criteria.andStrCountryLike(kbaIbaPeruDto.getStrCountry());
			}
			if(CadenaUtil.getStrNull(kbaIbaPeruDto.getStrIso3()) != null) {
				criteria.andStrIso3Like(kbaIbaPeruDto.getStrIso3());
			}
			if(CadenaUtil.getStrNull(kbaIbaPeruDto.getStrNatname()) != null) {
				criteria.andStrNatnameLike(kbaIbaPeruDto.getStrNatname());
			}
			if(CadenaUtil.getStrNull(kbaIbaPeruDto.getStrIntname()) != null) {
				criteria.andStrIntnameLike(kbaIbaPeruDto.getStrIntname());
			}
			if(CadenaUtil.getStrNull(kbaIbaPeruDto.getStrFincode()) != null) {
				criteria.andStrFincodeLike(kbaIbaPeruDto.getStrFincode());
			}
			if(CadenaUtil.getDoubNull(kbaIbaPeruDto.getDblSitlat()) != null) {
				criteria.andDblSitlatEqualTo(kbaIbaPeruDto.getDblSitlat());
			}
			if(CadenaUtil.getDoubNull(kbaIbaPeruDto.getDblSitlong()) != null) {
				criteria.andDblSitlongEqualTo(kbaIbaPeruDto.getDblSitlong());
			}
			if(CadenaUtil.getInteNull(kbaIbaPeruDto.getIntSitarea()) != null) {
				criteria.andIntSitareaEqualTo(kbaIbaPeruDto.getIntSitarea());
			}
			if(CadenaUtil.getStrNull(kbaIbaPeruDto.getStrProtect()) != null) {
				criteria.andStrProtectLike(kbaIbaPeruDto.getStrProtect());
			}
			if(CadenaUtil.getInteNull(kbaIbaPeruDto.getIntNumPas()) != null) {
				criteria.andIntNumPasEqualTo(kbaIbaPeruDto.getIntNumPas());
			}
			if(CadenaUtil.getStrNull(kbaIbaPeruDto.getStrIbastatus()) != null) {
				criteria.andStrIbastatusLike(kbaIbaPeruDto.getStrIbastatus());
			}
			if(CadenaUtil.getStrNull(kbaIbaPeruDto.getStrKbastatus()) != null) {
				criteria.andStrKbastatusLike(kbaIbaPeruDto.getStrKbastatus());
			}
			if(CadenaUtil.getStrNull(kbaIbaPeruDto.getStrAzestatus()) != null) {
				criteria.andStrAzestatusLike(kbaIbaPeruDto.getStrAzestatus());
			}
			if(CadenaUtil.getStrNull(kbaIbaPeruDto.getStrCreatedby()) != null) {
				criteria.andStrCreatedbyLike(kbaIbaPeruDto.getStrCreatedby());
			}
			if(CadenaUtil.getStrNull(kbaIbaPeruDto.getStrAddedby()) != null) {
				criteria.andStrAddedbyLike(kbaIbaPeruDto.getStrAddedby());
			}
			if(kbaIbaPeruDto.getDteAddeddate() != null) {
				criteria.andDteAddeddateEqualTo(kbaIbaPeruDto.getDteAddeddate());
			}
			if(CadenaUtil.getStrNull(kbaIbaPeruDto.getStrChangeby()) != null) {
				criteria.andStrChangebyLike(kbaIbaPeruDto.getStrChangeby());
			}
			if(kbaIbaPeruDto.getDteChangedate() != null) {
				criteria.andDteChangedateEqualTo(kbaIbaPeruDto.getDteChangedate());
			}
			if(CadenaUtil.getStrNull(kbaIbaPeruDto.getStrSource()) != null) {
				criteria.andStrSourceLike(kbaIbaPeruDto.getStrSource());
			}
			if(CadenaUtil.getStrNull(kbaIbaPeruDto.getStrDeltxt()) != null) {
				criteria.andStrDeltxtLike(kbaIbaPeruDto.getStrDeltxt());
			}
			if(CadenaUtil.getStrNull(kbaIbaPeruDto.getStrDelgeom()) != null) {
				criteria.andStrDelgeomLike(kbaIbaPeruDto.getStrDelgeom());
			}
			if(CadenaUtil.getStrNull(kbaIbaPeruDto.getStrMarineiba()) != null) {
				criteria.andStrMarineibaLike(kbaIbaPeruDto.getStrMarineiba());
			}
			if(CadenaUtil.getDoubNull(kbaIbaPeruDto.getDblShapeLeng()) != null) {
				criteria.andDblShapeLengEqualTo(kbaIbaPeruDto.getDblShapeLeng());
			}
			if(CadenaUtil.getDoubNull(kbaIbaPeruDto.getDblShapeLe1()) != null) {
				criteria.andDblShapeLe1EqualTo(kbaIbaPeruDto.getDblShapeLe1());
			}
			if(CadenaUtil.getDoubNull(kbaIbaPeruDto.getDblShapeArea()) != null) {
				criteria.andDblShapeAreaEqualTo(kbaIbaPeruDto.getDblShapeArea());
			}
		}
		
		List<KbaIbaPeru>	 list	= kbaIbaPeruMapper.selectByDefaultParameter(kbaIbaPeruParamDef);
		return list;
	}
	
	public KbaIbaPeru buscarById(KbaIbaPeruDto kbaIbaPeruDto) throws Exception {
		KbaIbaPeru kbaIbaPeru		= new KbaIbaPeru();
		BeanUtils.copyProperties(kbaIbaPeruDto, kbaIbaPeru);
		return kbaIbaPeruMapper.selectByPrimaryKey(kbaIbaPeru);
	}
	
	@Transactional
	public Integer guardar(KbaIbaPeruDto kbaIbaPeruDto) throws Exception {
		KbaIbaPeru kbaIbaPeru		= new KbaIbaPeru();
		BeanUtils.copyProperties(kbaIbaPeruDto, kbaIbaPeru);
		int rs	= 0;
		KbaIbaPeru exiteKbaIbaPeru		= kbaIbaPeruMapper.selectByPrimaryKey(kbaIbaPeru);
		if(exiteKbaIbaPeru != null) {
			rs	= kbaIbaPeruMapper.updateByPrimaryKeySelective(kbaIbaPeru);
		} else {
			rs	= kbaIbaPeruMapper.insertSelective(kbaIbaPeru);
			
			Integer srlGid	= kbaIbaPeruMapper.lastSequence();
			kbaIbaPeruDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(KbaIbaPeruDto kbaIbaPeruDto) throws Exception {
		KbaIbaPeru kbaIbaPeru		= new KbaIbaPeru();
		BeanUtils.copyProperties(kbaIbaPeruDto, kbaIbaPeru);
		Integer rs	= kbaIbaPeruMapper.deleteByPrimaryKey(kbaIbaPeru);
		return rs;
	}
	
}
