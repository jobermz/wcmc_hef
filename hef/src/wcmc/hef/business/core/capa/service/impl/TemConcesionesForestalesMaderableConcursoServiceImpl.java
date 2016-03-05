package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemConcesionesForestalesMaderableConcursoDto;
import wcmc.hef.business.core.capa.service.TemConcesionesForestalesMaderableConcursoService;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesMaderableConcurso;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesMaderableConcursoParamDef;
import wcmc.hef.dao.capa.domain.TemConcesionesForestalesMaderableConcursoParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemConcesionesForestalesMaderableConcursoMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemConcesionesForestalesMaderableConcursoServiceImpl implements TemConcesionesForestalesMaderableConcursoService {
	@Autowired
	private TemConcesionesForestalesMaderableConcursoMapper temConcesionesForestalesMaderableConcursoMapper;
	public List<TemConcesionesForestalesMaderableConcurso> buscar(TemConcesionesForestalesMaderableConcursoDto temConcesionesForestalesMaderableConcursoDto) throws Exception {
		TemConcesionesForestalesMaderableConcursoParamDef temConcesionesForestalesMaderableConcursoParamDef		= new TemConcesionesForestalesMaderableConcursoParamDef();
		
		Criteria criteria		= temConcesionesForestalesMaderableConcursoParamDef.createCriteria();
		if(temConcesionesForestalesMaderableConcursoDto != null) {
			if(CadenaUtil.getStrNull(temConcesionesForestalesMaderableConcursoDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temConcesionesForestalesMaderableConcursoDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesMaderableConcursoDto.getStrModalidad()) != null) {
				criteria.andStrModalidadLike(temConcesionesForestalesMaderableConcursoDto.getStrModalidad());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesMaderableConcursoDto.getStrTitular()) != null) {
				criteria.andStrTitularLike(temConcesionesForestalesMaderableConcursoDto.getStrTitular());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesMaderableConcursoDto.getStrContrato()) != null) {
				criteria.andStrContratoLike(temConcesionesForestalesMaderableConcursoDto.getStrContrato());
			}
			if(CadenaUtil.getDoubNull(temConcesionesForestalesMaderableConcursoDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(temConcesionesForestalesMaderableConcursoDto.getDblAreaSig());
			}
			if(CadenaUtil.getDoubNull(temConcesionesForestalesMaderableConcursoDto.getDblAreaAprob()) != null) {
				criteria.andDblAreaAprobEqualTo(temConcesionesForestalesMaderableConcursoDto.getDblAreaAprob());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesMaderableConcursoDto.getStrRegion()) != null) {
				criteria.andStrRegionLike(temConcesionesForestalesMaderableConcursoDto.getStrRegion());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesMaderableConcursoDto.getStrConcurso()) != null) {
				criteria.andStrConcursoLike(temConcesionesForestalesMaderableConcursoDto.getStrConcurso());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesMaderableConcursoDto.getStrNumConc()) != null) {
				criteria.andStrNumConcLike(temConcesionesForestalesMaderableConcursoDto.getStrNumConc());
			}
			if(CadenaUtil.getStrNull(temConcesionesForestalesMaderableConcursoDto.getStrSituacion()) != null) {
				criteria.andStrSituacionLike(temConcesionesForestalesMaderableConcursoDto.getStrSituacion());
			}
		}
		
		List<TemConcesionesForestalesMaderableConcurso>	 list	= temConcesionesForestalesMaderableConcursoMapper.selectByDefaultParameter(temConcesionesForestalesMaderableConcursoParamDef);
		return list;
	}
	
	public TemConcesionesForestalesMaderableConcurso buscarById(TemConcesionesForestalesMaderableConcursoDto temConcesionesForestalesMaderableConcursoDto) throws Exception {
		TemConcesionesForestalesMaderableConcurso temConcesionesForestalesMaderableConcurso		= new TemConcesionesForestalesMaderableConcurso();
		BeanUtils.copyProperties(temConcesionesForestalesMaderableConcursoDto, temConcesionesForestalesMaderableConcurso);
		return temConcesionesForestalesMaderableConcursoMapper.selectByPrimaryKey(temConcesionesForestalesMaderableConcurso);
	}
	
	@Transactional
	public Integer guardar(TemConcesionesForestalesMaderableConcursoDto temConcesionesForestalesMaderableConcursoDto) throws Exception {
		TemConcesionesForestalesMaderableConcurso temConcesionesForestalesMaderableConcurso		= new TemConcesionesForestalesMaderableConcurso();
		BeanUtils.copyProperties(temConcesionesForestalesMaderableConcursoDto, temConcesionesForestalesMaderableConcurso);
		int rs	= 0;
		TemConcesionesForestalesMaderableConcurso exiteTemConcesionesForestalesMaderableConcurso		= temConcesionesForestalesMaderableConcursoMapper.selectByPrimaryKey(temConcesionesForestalesMaderableConcurso);
		if(exiteTemConcesionesForestalesMaderableConcurso != null) {
			rs	= temConcesionesForestalesMaderableConcursoMapper.updateByPrimaryKeySelective(temConcesionesForestalesMaderableConcurso);
		} else {
			rs	= temConcesionesForestalesMaderableConcursoMapper.insertSelective(temConcesionesForestalesMaderableConcurso);
			
			Integer srlGid	= temConcesionesForestalesMaderableConcursoMapper.lastSequence();
			temConcesionesForestalesMaderableConcursoDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemConcesionesForestalesMaderableConcursoDto temConcesionesForestalesMaderableConcursoDto) throws Exception {
		TemConcesionesForestalesMaderableConcurso temConcesionesForestalesMaderableConcurso		= new TemConcesionesForestalesMaderableConcurso();
		BeanUtils.copyProperties(temConcesionesForestalesMaderableConcursoDto, temConcesionesForestalesMaderableConcurso);
		Integer rs	= temConcesionesForestalesMaderableConcursoMapper.deleteByPrimaryKey(temConcesionesForestalesMaderableConcurso);
		return rs;
	}
	
}
