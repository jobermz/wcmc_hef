package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemBioloHumedalesRamsarDto;
import wcmc.hef.business.core.capa.service.TemBioloHumedalesRamsarService;
import wcmc.hef.dao.capa.domain.TemBioloHumedalesRamsar;
import wcmc.hef.dao.capa.domain.TemBioloHumedalesRamsarParamDef;
import wcmc.hef.dao.capa.domain.TemBioloHumedalesRamsarParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemBioloHumedalesRamsarMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemBioloHumedalesRamsarServiceImpl implements TemBioloHumedalesRamsarService {
	@Autowired
	private TemBioloHumedalesRamsarMapper temBioloHumedalesRamsarMapper;
	public List<TemBioloHumedalesRamsar> buscar(TemBioloHumedalesRamsarDto temBioloHumedalesRamsarDto) throws Exception {
		TemBioloHumedalesRamsarParamDef temBioloHumedalesRamsarParamDef		= new TemBioloHumedalesRamsarParamDef();
		
		Criteria criteria		= temBioloHumedalesRamsarParamDef.createCriteria();
		if(temBioloHumedalesRamsarDto != null) {
			if(CadenaUtil.getStrNull(temBioloHumedalesRamsarDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(temBioloHumedalesRamsarDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temBioloHumedalesRamsarDto.getStrCategorías()) != null) {
				criteria.andStrCategoríasLike(temBioloHumedalesRamsarDto.getStrCategorías());
			}
			if(CadenaUtil.getStrNull(temBioloHumedalesRamsarDto.getStrNombre()) != null) {
				criteria.andStrNombreLike(temBioloHumedalesRamsarDto.getStrNombre());
			}
			if(CadenaUtil.getStrNull(temBioloHumedalesRamsarDto.getStrBaseLegal()) != null) {
				criteria.andStrBaseLegalLike(temBioloHumedalesRamsarDto.getStrBaseLegal());
			}
			if(CadenaUtil.getStrNull(temBioloHumedalesRamsarDto.getStrUbicaPoli()) != null) {
				criteria.andStrUbicaPoliLike(temBioloHumedalesRamsarDto.getStrUbicaPoli());
			}
			if(CadenaUtil.getDoubNull(temBioloHumedalesRamsarDto.getDblAreaLegal()) != null) {
				criteria.andDblAreaLegalEqualTo(temBioloHumedalesRamsarDto.getDblAreaLegal());
			}
			if(CadenaUtil.getInteNull(temBioloHumedalesRamsarDto.getIntId()) != null) {
				criteria.andIntIdEqualTo(temBioloHumedalesRamsarDto.getIntId());
			}
			if(CadenaUtil.getStrNull(temBioloHumedalesRamsarDto.getStrObserva()) != null) {
				criteria.andStrObservaLike(temBioloHumedalesRamsarDto.getStrObserva());
			}
			if(CadenaUtil.getDoubNull(temBioloHumedalesRamsarDto.getDblShapeArea()) != null) {
				criteria.andDblShapeAreaEqualTo(temBioloHumedalesRamsarDto.getDblShapeArea());
			}
			if(CadenaUtil.getDoubNull(temBioloHumedalesRamsarDto.getDblShapeLen()) != null) {
				criteria.andDblShapeLenEqualTo(temBioloHumedalesRamsarDto.getDblShapeLen());
			}
		}
		
		List<TemBioloHumedalesRamsar>	 list	= temBioloHumedalesRamsarMapper.selectByDefaultParameter(temBioloHumedalesRamsarParamDef);
		return list;
	}
	
	public TemBioloHumedalesRamsar buscarById(TemBioloHumedalesRamsarDto temBioloHumedalesRamsarDto) throws Exception {
		TemBioloHumedalesRamsar temBioloHumedalesRamsar		= new TemBioloHumedalesRamsar();
		BeanUtils.copyProperties(temBioloHumedalesRamsarDto, temBioloHumedalesRamsar);
		return temBioloHumedalesRamsarMapper.selectByPrimaryKey(temBioloHumedalesRamsar);
	}
	
	@Transactional
	public Integer guardar(TemBioloHumedalesRamsarDto temBioloHumedalesRamsarDto) throws Exception {
		TemBioloHumedalesRamsar temBioloHumedalesRamsar		= new TemBioloHumedalesRamsar();
		BeanUtils.copyProperties(temBioloHumedalesRamsarDto, temBioloHumedalesRamsar);
		int rs	= 0;
		TemBioloHumedalesRamsar exiteTemBioloHumedalesRamsar		= temBioloHumedalesRamsarMapper.selectByPrimaryKey(temBioloHumedalesRamsar);
		if(exiteTemBioloHumedalesRamsar != null) {
			rs	= temBioloHumedalesRamsarMapper.updateByPrimaryKeySelective(temBioloHumedalesRamsar);
		} else {
			rs	= temBioloHumedalesRamsarMapper.insertSelective(temBioloHumedalesRamsar);
			
			Integer srlGid	= temBioloHumedalesRamsarMapper.lastSequence();
			temBioloHumedalesRamsarDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemBioloHumedalesRamsarDto temBioloHumedalesRamsarDto) throws Exception {
		TemBioloHumedalesRamsar temBioloHumedalesRamsar		= new TemBioloHumedalesRamsar();
		BeanUtils.copyProperties(temBioloHumedalesRamsarDto, temBioloHumedalesRamsar);
		Integer rs	= temBioloHumedalesRamsarMapper.deleteByPrimaryKey(temBioloHumedalesRamsar);
		return rs;
	}
	
}
