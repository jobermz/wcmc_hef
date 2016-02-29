package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.CuencasHidrograficasDto;
import wcmc.hef.business.core.capa.service.CuencasHidrograficasService;
import wcmc.hef.dao.capa.domain.CuencasHidrograficas;
import wcmc.hef.dao.capa.domain.CuencasHidrograficasParamDef;
import wcmc.hef.dao.capa.domain.CuencasHidrograficasParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.CuencasHidrograficasMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class CuencasHidrograficasServiceImpl implements CuencasHidrograficasService {
	@Autowired
	private CuencasHidrograficasMapper cuencasHidrograficasMapper;
	public List<CuencasHidrograficas> buscar(CuencasHidrograficasDto cuencasHidrograficasDto) throws Exception {
		CuencasHidrograficasParamDef cuencasHidrograficasParamDef		= new CuencasHidrograficasParamDef();
		
		Criteria criteria		= cuencasHidrograficasParamDef.createCriteria();
		if(cuencasHidrograficasDto != null) {
			if(CadenaUtil.getStrNull(cuencasHidrograficasDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(cuencasHidrograficasDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(cuencasHidrograficasDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(cuencasHidrograficasDto.getIntObjectid());
			}
			if(CadenaUtil.getStrNull(cuencasHidrograficasDto.getStrGmlId()) != null) {
				criteria.andStrGmlIdLike(cuencasHidrograficasDto.getStrGmlId());
			}
			if(CadenaUtil.getStrNull(cuencasHidrograficasDto.getStrId()) != null) {
				criteria.andStrIdLike(cuencasHidrograficasDto.getStrId());
			}
			if(CadenaUtil.getStrNull(cuencasHidrograficasDto.getStrCodigo()) != null) {
				criteria.andStrCodigoLike(cuencasHidrograficasDto.getStrCodigo());
			}
			if(CadenaUtil.getStrNull(cuencasHidrograficasDto.getStrNombre()) != null) {
				criteria.andStrNombreLike(cuencasHidrograficasDto.getStrNombre());
			}
			if(CadenaUtil.getStrNull(cuencasHidrograficasDto.getStrGeometria()) != null) {
				criteria.andStrGeometriaLike(cuencasHidrograficasDto.getStrGeometria());
			}
			if(CadenaUtil.getInteNull(cuencasHidrograficasDto.getIntEsriOid()) != null) {
				criteria.andIntEsriOidEqualTo(cuencasHidrograficasDto.getIntEsriOid());
			}
		}
		
		List<CuencasHidrograficas>	 list	= cuencasHidrograficasMapper.selectByDefaultParameter(cuencasHidrograficasParamDef);
		return list;
	}
	
	public CuencasHidrograficas buscarById(CuencasHidrograficasDto cuencasHidrograficasDto) throws Exception {
		CuencasHidrograficas cuencasHidrograficas		= new CuencasHidrograficas();
		BeanUtils.copyProperties(cuencasHidrograficasDto, cuencasHidrograficas);
		return cuencasHidrograficasMapper.selectByPrimaryKey(cuencasHidrograficas);
	}
	
	@Transactional
	public Integer guardar(CuencasHidrograficasDto cuencasHidrograficasDto) throws Exception {
		CuencasHidrograficas cuencasHidrograficas		= new CuencasHidrograficas();
		BeanUtils.copyProperties(cuencasHidrograficasDto, cuencasHidrograficas);
		int rs	= 0;
		CuencasHidrograficas exiteCuencasHidrograficas		= cuencasHidrograficasMapper.selectByPrimaryKey(cuencasHidrograficas);
		if(exiteCuencasHidrograficas != null) {
			rs	= cuencasHidrograficasMapper.updateByPrimaryKeySelective(cuencasHidrograficas);
		} else {
			rs	= cuencasHidrograficasMapper.insertSelective(cuencasHidrograficas);
			
			Integer srlGid	= cuencasHidrograficasMapper.lastSequence();
			cuencasHidrograficasDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(CuencasHidrograficasDto cuencasHidrograficasDto) throws Exception {
		CuencasHidrograficas cuencasHidrograficas		= new CuencasHidrograficas();
		BeanUtils.copyProperties(cuencasHidrograficasDto, cuencasHidrograficas);
		Integer rs	= cuencasHidrograficasMapper.deleteByPrimaryKey(cuencasHidrograficas);
		return rs;
	}
	
}
