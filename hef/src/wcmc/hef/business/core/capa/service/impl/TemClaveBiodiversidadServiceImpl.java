package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemClaveBiodiversidadDto;
import wcmc.hef.business.core.capa.service.TemClaveBiodiversidadService;
import wcmc.hef.dao.capa.domain.TemClaveBiodiversidad;
import wcmc.hef.dao.capa.domain.TemClaveBiodiversidadParamDef;
import wcmc.hef.dao.capa.domain.TemClaveBiodiversidadParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemClaveBiodiversidadMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemClaveBiodiversidadServiceImpl implements TemClaveBiodiversidadService {
	@Autowired
	private TemClaveBiodiversidadMapper temClaveBiodiversidadMapper;
	public List<TemClaveBiodiversidad> buscar(TemClaveBiodiversidadDto temClaveBiodiversidadDto) throws Exception {
		TemClaveBiodiversidadParamDef temClaveBiodiversidadParamDef		= new TemClaveBiodiversidadParamDef();
		
		Criteria criteria		= temClaveBiodiversidadParamDef.createCriteria();
		if(temClaveBiodiversidadDto != null) {
			if(CadenaUtil.getStrNull(temClaveBiodiversidadDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temClaveBiodiversidadDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(temClaveBiodiversidadDto.getIntObjectid1()) != null) {
				criteria.andIntObjectid1EqualTo(temClaveBiodiversidadDto.getIntObjectid1());
			}
			if(CadenaUtil.getInteNull(temClaveBiodiversidadDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(temClaveBiodiversidadDto.getIntObjectid());
			}
			if(CadenaUtil.getInteNull(temClaveBiodiversidadDto.getIntSitrecid()) != null) {
				criteria.andIntSitrecidEqualTo(temClaveBiodiversidadDto.getIntSitrecid());
			}
			if(CadenaUtil.getStrNull(temClaveBiodiversidadDto.getStrRegion()) != null) {
				criteria.andStrRegionLike(temClaveBiodiversidadDto.getStrRegion());
			}
			if(CadenaUtil.getStrNull(temClaveBiodiversidadDto.getStrCountry()) != null) {
				criteria.andStrCountryLike(temClaveBiodiversidadDto.getStrCountry());
			}
			if(CadenaUtil.getStrNull(temClaveBiodiversidadDto.getStrIso3()) != null) {
				criteria.andStrIso3Like(temClaveBiodiversidadDto.getStrIso3());
			}
			if(CadenaUtil.getStrNull(temClaveBiodiversidadDto.getStrNatname()) != null) {
				criteria.andStrNatnameLike(temClaveBiodiversidadDto.getStrNatname());
			}
			if(CadenaUtil.getStrNull(temClaveBiodiversidadDto.getStrIntname()) != null) {
				criteria.andStrIntnameLike(temClaveBiodiversidadDto.getStrIntname());
			}
			if(CadenaUtil.getStrNull(temClaveBiodiversidadDto.getStrFincode()) != null) {
				criteria.andStrFincodeLike(temClaveBiodiversidadDto.getStrFincode());
			}
			if(CadenaUtil.getDoubNull(temClaveBiodiversidadDto.getDblSitlat()) != null) {
				criteria.andDblSitlatEqualTo(temClaveBiodiversidadDto.getDblSitlat());
			}
			if(CadenaUtil.getDoubNull(temClaveBiodiversidadDto.getDblSitlong()) != null) {
				criteria.andDblSitlongEqualTo(temClaveBiodiversidadDto.getDblSitlong());
			}
			if(CadenaUtil.getInteNull(temClaveBiodiversidadDto.getIntSitarea()) != null) {
				criteria.andIntSitareaEqualTo(temClaveBiodiversidadDto.getIntSitarea());
			}
			if(CadenaUtil.getStrNull(temClaveBiodiversidadDto.getStrProtect()) != null) {
				criteria.andStrProtectLike(temClaveBiodiversidadDto.getStrProtect());
			}
			if(CadenaUtil.getInteNull(temClaveBiodiversidadDto.getIntNumPas()) != null) {
				criteria.andIntNumPasEqualTo(temClaveBiodiversidadDto.getIntNumPas());
			}
			if(CadenaUtil.getStrNull(temClaveBiodiversidadDto.getStrIbastatus()) != null) {
				criteria.andStrIbastatusLike(temClaveBiodiversidadDto.getStrIbastatus());
			}
			if(CadenaUtil.getStrNull(temClaveBiodiversidadDto.getStrKbastatus()) != null) {
				criteria.andStrKbastatusLike(temClaveBiodiversidadDto.getStrKbastatus());
			}
			if(CadenaUtil.getStrNull(temClaveBiodiversidadDto.getStrAzestatus()) != null) {
				criteria.andStrAzestatusLike(temClaveBiodiversidadDto.getStrAzestatus());
			}
			if(CadenaUtil.getStrNull(temClaveBiodiversidadDto.getStrCreatedby()) != null) {
				criteria.andStrCreatedbyLike(temClaveBiodiversidadDto.getStrCreatedby());
			}
			if(CadenaUtil.getStrNull(temClaveBiodiversidadDto.getStrAddedby()) != null) {
				criteria.andStrAddedbyLike(temClaveBiodiversidadDto.getStrAddedby());
			}
			if(temClaveBiodiversidadDto.getDteAddeddate() != null) {
				criteria.andDteAddeddateEqualTo(temClaveBiodiversidadDto.getDteAddeddate());
			}
			if(CadenaUtil.getStrNull(temClaveBiodiversidadDto.getStrChangeby()) != null) {
				criteria.andStrChangebyLike(temClaveBiodiversidadDto.getStrChangeby());
			}
			if(temClaveBiodiversidadDto.getDteChangedate() != null) {
				criteria.andDteChangedateEqualTo(temClaveBiodiversidadDto.getDteChangedate());
			}
			if(CadenaUtil.getStrNull(temClaveBiodiversidadDto.getStrSource()) != null) {
				criteria.andStrSourceLike(temClaveBiodiversidadDto.getStrSource());
			}
			if(CadenaUtil.getStrNull(temClaveBiodiversidadDto.getStrDeltxt()) != null) {
				criteria.andStrDeltxtLike(temClaveBiodiversidadDto.getStrDeltxt());
			}
			if(CadenaUtil.getStrNull(temClaveBiodiversidadDto.getStrDelgeom()) != null) {
				criteria.andStrDelgeomLike(temClaveBiodiversidadDto.getStrDelgeom());
			}
			if(CadenaUtil.getStrNull(temClaveBiodiversidadDto.getStrMarineiba()) != null) {
				criteria.andStrMarineibaLike(temClaveBiodiversidadDto.getStrMarineiba());
			}
			if(CadenaUtil.getDoubNull(temClaveBiodiversidadDto.getDblShapeLeng()) != null) {
				criteria.andDblShapeLengEqualTo(temClaveBiodiversidadDto.getDblShapeLeng());
			}
			if(CadenaUtil.getDoubNull(temClaveBiodiversidadDto.getDblShapeLe1()) != null) {
				criteria.andDblShapeLe1EqualTo(temClaveBiodiversidadDto.getDblShapeLe1());
			}
			if(CadenaUtil.getDoubNull(temClaveBiodiversidadDto.getDblShapeArea()) != null) {
				criteria.andDblShapeAreaEqualTo(temClaveBiodiversidadDto.getDblShapeArea());
			}
		}
		
		List<TemClaveBiodiversidad>	 list	= temClaveBiodiversidadMapper.selectByDefaultParameter(temClaveBiodiversidadParamDef);
		return list;
	}
	
	public TemClaveBiodiversidad buscarById(TemClaveBiodiversidadDto temClaveBiodiversidadDto) throws Exception {
		TemClaveBiodiversidad temClaveBiodiversidad		= new TemClaveBiodiversidad();
		BeanUtils.copyProperties(temClaveBiodiversidadDto, temClaveBiodiversidad);
		return temClaveBiodiversidadMapper.selectByPrimaryKey(temClaveBiodiversidad);
	}
	
	@Transactional
	public Integer guardar(TemClaveBiodiversidadDto temClaveBiodiversidadDto) throws Exception {
		TemClaveBiodiversidad temClaveBiodiversidad		= new TemClaveBiodiversidad();
		BeanUtils.copyProperties(temClaveBiodiversidadDto, temClaveBiodiversidad);
		int rs	= 0;
		TemClaveBiodiversidad exiteTemClaveBiodiversidad		= temClaveBiodiversidadMapper.selectByPrimaryKey(temClaveBiodiversidad);
		if(exiteTemClaveBiodiversidad != null) {
			rs	= temClaveBiodiversidadMapper.updateByPrimaryKeySelective(temClaveBiodiversidad);
		} else {
			rs	= temClaveBiodiversidadMapper.insertSelective(temClaveBiodiversidad);
			
			Integer srlGid	= temClaveBiodiversidadMapper.lastSequence();
			temClaveBiodiversidadDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemClaveBiodiversidadDto temClaveBiodiversidadDto) throws Exception {
		TemClaveBiodiversidad temClaveBiodiversidad		= new TemClaveBiodiversidad();
		BeanUtils.copyProperties(temClaveBiodiversidadDto, temClaveBiodiversidad);
		Integer rs	= temClaveBiodiversidadMapper.deleteByPrimaryKey(temClaveBiodiversidad);
		return rs;
	}
	
}
