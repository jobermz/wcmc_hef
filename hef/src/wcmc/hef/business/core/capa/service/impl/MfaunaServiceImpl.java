package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.MfaunaDto;
import wcmc.hef.business.core.capa.service.MfaunaService;
import wcmc.hef.dao.capa.domain.Mfauna;
import wcmc.hef.dao.capa.domain.MfaunaParamDef;
import wcmc.hef.dao.capa.domain.MfaunaParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.MfaunaMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class MfaunaServiceImpl implements MfaunaService {
	@Autowired
	private MfaunaMapper mfaunaMapper;
	public List<Mfauna> buscar(MfaunaDto mfaunaDto) throws Exception {
		MfaunaParamDef mfaunaParamDef		= new MfaunaParamDef();
		
		Criteria criteria		= mfaunaParamDef.createCriteria();
		if(mfaunaDto != null) {
			if(CadenaUtil.getStrNull(mfaunaDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(mfaunaDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(mfaunaDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(mfaunaDto.getIntObjectid());
			}
			if(CadenaUtil.getStrNull(mfaunaDto.getStrBeneficiar()) != null) {
				criteria.andStrBeneficiarLike(mfaunaDto.getStrBeneficiar());
			}
			if(CadenaUtil.getStrNull(mfaunaDto.getStrModalidad()) != null) {
				criteria.andStrModalidadLike(mfaunaDto.getStrModalidad());
			}
			if(CadenaUtil.getStrNull(mfaunaDto.getStrTitular()) != null) {
				criteria.andStrTitularLike(mfaunaDto.getStrTitular());
			}
			if(CadenaUtil.getStrNull(mfaunaDto.getStrContrato()) != null) {
				criteria.andStrContratoLike(mfaunaDto.getStrContrato());
			}
			if(CadenaUtil.getDoubNull(mfaunaDto.getDblAreaAprob()) != null) {
				criteria.andDblAreaAprobEqualTo(mfaunaDto.getDblAreaAprob());
			}
			if(CadenaUtil.getStrNull(mfaunaDto.getStrRegion()) != null) {
				criteria.andStrRegionLike(mfaunaDto.getStrRegion());
			}
			if(CadenaUtil.getStrNull(mfaunaDto.getStrDocum()) != null) {
				criteria.andStrDocumLike(mfaunaDto.getStrDocum());
			}
			if(CadenaUtil.getStrNull(mfaunaDto.getStrSituacion()) != null) {
				criteria.andStrSituacionLike(mfaunaDto.getStrSituacion());
			}
			if(CadenaUtil.getDoubNull(mfaunaDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(mfaunaDto.getDblAreaSig());
			}
		}
		
		List<Mfauna>	 list	= mfaunaMapper.selectByDefaultParameter(mfaunaParamDef);
		return list;
	}
	
	public Mfauna buscarById(MfaunaDto mfaunaDto) throws Exception {
		Mfauna mfauna		= new Mfauna();
		BeanUtils.copyProperties(mfaunaDto, mfauna);
		return mfaunaMapper.selectByPrimaryKey(mfauna);
	}
	
	@Transactional
	public Integer guardar(MfaunaDto mfaunaDto) throws Exception {
		Mfauna mfauna		= new Mfauna();
		BeanUtils.copyProperties(mfaunaDto, mfauna);
		int rs	= 0;
		Mfauna exiteMfauna		= mfaunaMapper.selectByPrimaryKey(mfauna);
		if(exiteMfauna != null) {
			rs	= mfaunaMapper.updateByPrimaryKeySelective(mfauna);
		} else {
			rs	= mfaunaMapper.insertSelective(mfauna);
			
			Integer srlGid	= mfaunaMapper.lastSequence();
			mfaunaDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(MfaunaDto mfaunaDto) throws Exception {
		Mfauna mfauna		= new Mfauna();
		BeanUtils.copyProperties(mfaunaDto, mfauna);
		Integer rs	= mfaunaMapper.deleteByPrimaryKey(mfauna);
		return rs;
	}
	
}
