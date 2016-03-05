package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemCuencasHidrograficasDto;
import wcmc.hef.business.core.capa.service.TemCuencasHidrograficasService;
import wcmc.hef.dao.capa.domain.TemCuencasHidrograficas;
import wcmc.hef.dao.capa.domain.TemCuencasHidrograficasParamDef;
import wcmc.hef.dao.capa.domain.TemCuencasHidrograficasParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemCuencasHidrograficasMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemCuencasHidrograficasServiceImpl implements TemCuencasHidrograficasService {
	@Autowired
	private TemCuencasHidrograficasMapper temCuencasHidrograficasMapper;
	public List<TemCuencasHidrograficas> buscar(TemCuencasHidrograficasDto temCuencasHidrograficasDto) throws Exception {
		TemCuencasHidrograficasParamDef temCuencasHidrograficasParamDef		= new TemCuencasHidrograficasParamDef();
		
		Criteria criteria		= temCuencasHidrograficasParamDef.createCriteria();
		if(temCuencasHidrograficasDto != null) {
			if(CadenaUtil.getStrNull(temCuencasHidrograficasDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temCuencasHidrograficasDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(temCuencasHidrograficasDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(temCuencasHidrograficasDto.getIntObjectid());
			}
			if(CadenaUtil.getStrNull(temCuencasHidrograficasDto.getStrGmlId()) != null) {
				criteria.andStrGmlIdLike(temCuencasHidrograficasDto.getStrGmlId());
			}
			if(CadenaUtil.getStrNull(temCuencasHidrograficasDto.getStrId()) != null) {
				criteria.andStrIdLike(temCuencasHidrograficasDto.getStrId());
			}
			if(CadenaUtil.getStrNull(temCuencasHidrograficasDto.getStrCodigo()) != null) {
				criteria.andStrCodigoLike(temCuencasHidrograficasDto.getStrCodigo());
			}
			if(CadenaUtil.getStrNull(temCuencasHidrograficasDto.getStrNombre()) != null) {
				criteria.andStrNombreLike(temCuencasHidrograficasDto.getStrNombre());
			}
			if(CadenaUtil.getStrNull(temCuencasHidrograficasDto.getStrGeometria()) != null) {
				criteria.andStrGeometriaLike(temCuencasHidrograficasDto.getStrGeometria());
			}
			if(CadenaUtil.getInteNull(temCuencasHidrograficasDto.getIntEsriOid()) != null) {
				criteria.andIntEsriOidEqualTo(temCuencasHidrograficasDto.getIntEsriOid());
			}
		}
		
		List<TemCuencasHidrograficas>	 list	= temCuencasHidrograficasMapper.selectByDefaultParameter(temCuencasHidrograficasParamDef);
		return list;
	}
	
	public TemCuencasHidrograficas buscarById(TemCuencasHidrograficasDto temCuencasHidrograficasDto) throws Exception {
		TemCuencasHidrograficas temCuencasHidrograficas		= new TemCuencasHidrograficas();
		BeanUtils.copyProperties(temCuencasHidrograficasDto, temCuencasHidrograficas);
		return temCuencasHidrograficasMapper.selectByPrimaryKey(temCuencasHidrograficas);
	}
	
	@Transactional
	public Integer guardar(TemCuencasHidrograficasDto temCuencasHidrograficasDto) throws Exception {
		TemCuencasHidrograficas temCuencasHidrograficas		= new TemCuencasHidrograficas();
		BeanUtils.copyProperties(temCuencasHidrograficasDto, temCuencasHidrograficas);
		int rs	= 0;
		TemCuencasHidrograficas exiteTemCuencasHidrograficas		= temCuencasHidrograficasMapper.selectByPrimaryKey(temCuencasHidrograficas);
		if(exiteTemCuencasHidrograficas != null) {
			rs	= temCuencasHidrograficasMapper.updateByPrimaryKeySelective(temCuencasHidrograficas);
		} else {
			rs	= temCuencasHidrograficasMapper.insertSelective(temCuencasHidrograficas);
			
			Integer srlGid	= temCuencasHidrograficasMapper.lastSequence();
			temCuencasHidrograficasDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemCuencasHidrograficasDto temCuencasHidrograficasDto) throws Exception {
		TemCuencasHidrograficas temCuencasHidrograficas		= new TemCuencasHidrograficas();
		BeanUtils.copyProperties(temCuencasHidrograficasDto, temCuencasHidrograficas);
		Integer rs	= temCuencasHidrograficasMapper.deleteByPrimaryKey(temCuencasHidrograficas);
		return rs;
	}
	
}
