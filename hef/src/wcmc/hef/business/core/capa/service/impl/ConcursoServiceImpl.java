package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.ConcursoDto;
import wcmc.hef.business.core.capa.service.ConcursoService;
import wcmc.hef.dao.capa.domain.Concurso;
import wcmc.hef.dao.capa.domain.ConcursoParamDef;
import wcmc.hef.dao.capa.domain.ConcursoParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.ConcursoMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class ConcursoServiceImpl implements ConcursoService {
	@Autowired
	private ConcursoMapper concursoMapper;
	public List<Concurso> buscar(ConcursoDto concursoDto) throws Exception {
		ConcursoParamDef concursoParamDef		= new ConcursoParamDef();
		
		Criteria criteria		= concursoParamDef.createCriteria();
		if(concursoDto != null) {
			if(CadenaUtil.getStrNull(concursoDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(concursoDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(concursoDto.getStrModalidad()) != null) {
				criteria.andStrModalidadLike(concursoDto.getStrModalidad());
			}
			if(CadenaUtil.getStrNull(concursoDto.getStrTitular()) != null) {
				criteria.andStrTitularLike(concursoDto.getStrTitular());
			}
			if(CadenaUtil.getStrNull(concursoDto.getStrContrato()) != null) {
				criteria.andStrContratoLike(concursoDto.getStrContrato());
			}
			if(CadenaUtil.getDoubNull(concursoDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(concursoDto.getDblAreaSig());
			}
			if(CadenaUtil.getDoubNull(concursoDto.getDblAreaAprob()) != null) {
				criteria.andDblAreaAprobEqualTo(concursoDto.getDblAreaAprob());
			}
			if(CadenaUtil.getStrNull(concursoDto.getStrRegion()) != null) {
				criteria.andStrRegionLike(concursoDto.getStrRegion());
			}
			if(CadenaUtil.getStrNull(concursoDto.getStrConcurso()) != null) {
				criteria.andStrConcursoLike(concursoDto.getStrConcurso());
			}
			if(CadenaUtil.getStrNull(concursoDto.getStrNumConc()) != null) {
				criteria.andStrNumConcLike(concursoDto.getStrNumConc());
			}
			if(CadenaUtil.getStrNull(concursoDto.getStrSituacion()) != null) {
				criteria.andStrSituacionLike(concursoDto.getStrSituacion());
			}
		}
		
		List<Concurso>	 list	= concursoMapper.selectByDefaultParameter(concursoParamDef);
		return list;
	}
	
	public Concurso buscarById(ConcursoDto concursoDto) throws Exception {
		Concurso concurso		= new Concurso();
		BeanUtils.copyProperties(concursoDto, concurso);
		return concursoMapper.selectByPrimaryKey(concurso);
	}
	
	@Transactional
	public Integer guardar(ConcursoDto concursoDto) throws Exception {
		Concurso concurso		= new Concurso();
		BeanUtils.copyProperties(concursoDto, concurso);
		int rs	= 0;
		Concurso exiteConcurso		= concursoMapper.selectByPrimaryKey(concurso);
		if(exiteConcurso != null) {
			rs	= concursoMapper.updateByPrimaryKeySelective(concurso);
		} else {
			rs	= concursoMapper.insertSelective(concurso);
			
			Integer srlGid	= concursoMapper.lastSequence();
			concursoDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(ConcursoDto concursoDto) throws Exception {
		Concurso concurso		= new Concurso();
		BeanUtils.copyProperties(concursoDto, concurso);
		Integer rs	= concursoMapper.deleteByPrimaryKey(concurso);
		return rs;
	}
	
}
