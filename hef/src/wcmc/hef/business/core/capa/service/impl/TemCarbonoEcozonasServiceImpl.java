package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemCarbonoEcozonasDto;
import wcmc.hef.business.core.capa.service.TemCarbonoEcozonasService;
import wcmc.hef.dao.capa.domain.TemCarbonoEcozonas;
import wcmc.hef.dao.capa.domain.TemCarbonoEcozonasParamDef;
import wcmc.hef.dao.capa.domain.TemCarbonoEcozonasParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemCarbonoEcozonasMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemCarbonoEcozonasServiceImpl implements TemCarbonoEcozonasService {
	@Autowired
	private TemCarbonoEcozonasMapper temCarbonoEcozonasMapper;
	public List<TemCarbonoEcozonas> buscar(TemCarbonoEcozonasDto temCarbonoEcozonasDto) throws Exception {
		TemCarbonoEcozonasParamDef temCarbonoEcozonasParamDef		= new TemCarbonoEcozonasParamDef();
		
		Criteria criteria		= temCarbonoEcozonasParamDef.createCriteria();
		if(temCarbonoEcozonasDto != null) {
			if(CadenaUtil.getStrNull(temCarbonoEcozonasDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temCarbonoEcozonasDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(temCarbonoEcozonasDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(temCarbonoEcozonasDto.getIntObjectid());
			}
			if(CadenaUtil.getStrNull(temCarbonoEcozonasDto.getStrEcozona()) != null) {
				criteria.andStrEcozonaLike(temCarbonoEcozonasDto.getStrEcozona());
			}
			if(CadenaUtil.getStrNull(temCarbonoEcozonasDto.getStrTcHa()) != null) {
				criteria.andStrTcHaLike(temCarbonoEcozonasDto.getStrTcHa());
			}
			if(CadenaUtil.getDoubNull(temCarbonoEcozonasDto.getDblLinfTcHa()) != null) {
				criteria.andDblLinfTcHaEqualTo(temCarbonoEcozonasDto.getDblLinfTcHa());
			}
			if(CadenaUtil.getDoubNull(temCarbonoEcozonasDto.getDblLsupTcHa()) != null) {
				criteria.andDblLsupTcHaEqualTo(temCarbonoEcozonasDto.getDblLsupTcHa());
			}
			if(CadenaUtil.getDoubNull(temCarbonoEcozonasDto.getDblPorcIncer()) != null) {
				criteria.andDblPorcIncerEqualTo(temCarbonoEcozonasDto.getDblPorcIncer());
			}
		}
		
		List<TemCarbonoEcozonas>	 list	= temCarbonoEcozonasMapper.selectByDefaultParameter(temCarbonoEcozonasParamDef);
		return list;
	}
	
	public TemCarbonoEcozonas buscarById(TemCarbonoEcozonasDto temCarbonoEcozonasDto) throws Exception {
		TemCarbonoEcozonas temCarbonoEcozonas		= new TemCarbonoEcozonas();
		BeanUtils.copyProperties(temCarbonoEcozonasDto, temCarbonoEcozonas);
		return temCarbonoEcozonasMapper.selectByPrimaryKey(temCarbonoEcozonas);
	}
	
	@Transactional
	public Integer guardar(TemCarbonoEcozonasDto temCarbonoEcozonasDto) throws Exception {
		TemCarbonoEcozonas temCarbonoEcozonas		= new TemCarbonoEcozonas();
		BeanUtils.copyProperties(temCarbonoEcozonasDto, temCarbonoEcozonas);
		int rs	= 0;
		TemCarbonoEcozonas exiteTemCarbonoEcozonas		= temCarbonoEcozonasMapper.selectByPrimaryKey(temCarbonoEcozonas);
		if(exiteTemCarbonoEcozonas != null) {
			rs	= temCarbonoEcozonasMapper.updateByPrimaryKeySelective(temCarbonoEcozonas);
		} else {
			rs	= temCarbonoEcozonasMapper.insertSelective(temCarbonoEcozonas);
			
			Integer srlGid	= temCarbonoEcozonasMapper.lastSequence();
			temCarbonoEcozonasDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemCarbonoEcozonasDto temCarbonoEcozonasDto) throws Exception {
		TemCarbonoEcozonas temCarbonoEcozonas		= new TemCarbonoEcozonas();
		BeanUtils.copyProperties(temCarbonoEcozonasDto, temCarbonoEcozonas);
		Integer rs	= temCarbonoEcozonasMapper.deleteByPrimaryKey(temCarbonoEcozonas);
		return rs;
	}
	
}
