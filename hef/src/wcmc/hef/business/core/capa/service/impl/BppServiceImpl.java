package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.BppDto;
import wcmc.hef.business.core.capa.service.BppService;
import wcmc.hef.dao.capa.domain.Bpp;
import wcmc.hef.dao.capa.domain.BppParamDef;
import wcmc.hef.dao.capa.domain.BppParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.BppMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class BppServiceImpl implements BppService {
	@Autowired
	private BppMapper bppMapper;
	public List<Bpp> buscar(BppDto bppDto) throws Exception {
		BppParamDef bppParamDef		= new BppParamDef();
		
		Criteria criteria		= bppParamDef.createCriteria();
		if(bppDto != null) {
			if(CadenaUtil.getStrNull(bppDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(bppDto.getStrTheGeom());
			}
			if(CadenaUtil.getLongNull(bppDto.getLngId()) != null) {
				criteria.andLngIdEqualTo(bppDto.getLngId());
			}
			if(CadenaUtil.getStrNull(bppDto.getStrZona()) != null) {
				criteria.andStrZonaLike(bppDto.getStrZona());
			}
			if(CadenaUtil.getStrNull(bppDto.getStrTipo()) != null) {
				criteria.andStrTipoLike(bppDto.getStrTipo());
			}
			if(CadenaUtil.getStrNull(bppDto.getStrDenomin()) != null) {
				criteria.andStrDenominLike(bppDto.getStrDenomin());
			}
			if(CadenaUtil.getDoubNull(bppDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(bppDto.getDblAreaSig());
			}
			if(CadenaUtil.getDoubNull(bppDto.getDblAreaAprob()) != null) {
				criteria.andDblAreaAprobEqualTo(bppDto.getDblAreaAprob());
			}
			if(CadenaUtil.getStrNull(bppDto.getStrRegion()) != null) {
				criteria.andStrRegionLike(bppDto.getStrRegion());
			}
			if(CadenaUtil.getStrNull(bppDto.getStrFuente()) != null) {
				criteria.andStrFuenteLike(bppDto.getStrFuente());
			}
			if(CadenaUtil.getStrNull(bppDto.getStrDocLegal()) != null) {
				criteria.andStrDocLegalLike(bppDto.getStrDocLegal());
			}
			if(CadenaUtil.getInteNull(bppDto.getIntTheid()) != null) {
				criteria.andIntTheidEqualTo(bppDto.getIntTheid());
			}
			if(CadenaUtil.getDoubNull(bppDto.getDblPerimeter()) != null) {
				criteria.andDblPerimeterEqualTo(bppDto.getDblPerimeter());
			}
			if(CadenaUtil.getDoubNull(bppDto.getDblHectares()) != null) {
				criteria.andDblHectaresEqualTo(bppDto.getDblHectares());
			}
		}
		
		List<Bpp>	 list	= bppMapper.selectByDefaultParameter(bppParamDef);
		return list;
	}
	
	public Bpp buscarById(BppDto bppDto) throws Exception {
		Bpp bpp		= new Bpp();
		BeanUtils.copyProperties(bppDto, bpp);
		return bppMapper.selectByPrimaryKey(bpp);
	}
	
	@Transactional
	public Integer guardar(BppDto bppDto) throws Exception {
		Bpp bpp		= new Bpp();
		BeanUtils.copyProperties(bppDto, bpp);
		int rs	= 0;
		Bpp exiteBpp		= bppMapper.selectByPrimaryKey(bpp);
		if(exiteBpp != null) {
			rs	= bppMapper.updateByPrimaryKeySelective(bpp);
		} else {
			rs	= bppMapper.insertSelective(bpp);
			
			Integer srlGid	= bppMapper.lastSequence();
			bppDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(BppDto bppDto) throws Exception {
		Bpp bpp		= new Bpp();
		BeanUtils.copyProperties(bppDto, bpp);
		Integer rs	= bppMapper.deleteByPrimaryKey(bpp);
		return rs;
	}
	
}
